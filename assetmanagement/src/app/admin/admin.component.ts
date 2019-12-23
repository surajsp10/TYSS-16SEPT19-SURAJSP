import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  error:String;
  requests:[]=[];
  assets:[]=[];
  constructor(private auth: AuthService, private router: Router) {

    this.auth.alogin=false;
   
    this.auth.GetRequestedAsset().subscribe(data => {
       this.requests=data.requestassets;
      console.log(data);
      
    }, err => {
      console.log(err);
      this.error = err.error.message;
    })

    this.auth.GetAsset().subscribe(data => {
      this.assets=data.assets;
     console.log(data);
     
   }, err => {
     console.log(err);
     this.error = err.error.message;
   })
   }


   selectRequest(request){
     this.auth.request=request;
     this.auth.status="approved"
    this.router.navigateByUrl('allocation');
    
  }


  unselectRequest(request){
    this.auth.request=request;
    this.auth.status="rejected"
   this.router.navigateByUrl('allocation');
   
 }
  ngOnInit() {
  }

  logout(){
   if(this.auth.alogin=true){
    
    this.auth.alogin=true;
    this.auth.blogin=false;
    
  }
}
}
