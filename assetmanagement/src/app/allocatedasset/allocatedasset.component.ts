import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-allocatedasset',
  templateUrl: './allocatedasset.component.html',
  styleUrls: ['./allocatedasset.component.css']
})
export class AllocatedassetComponent implements OnInit {


  message:any;
  error:String;

  constructor(private auth: AuthService, private router: Router) { 
    this.auth.alogin=false;
    

  }

  // (ngSubmit)='AssetAllocation(assetallocationform)'
  AssetAllocation(assetallocationform:NgForm) {
    this.error = null;
    console.log(assetallocationform.value);
    this.auth. AssetAllocation(assetallocationform.value).subscribe(data => {
      this.message=data.message;
      console.log(data);
      if(data.message==="success"){
        this.auth.deleterequest(this.auth.request);
        console.log(this.auth.request);
      }
      assetallocationform.reset();
      
      
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }

  Allocated(requestid){
    this.auth.deleterequest(requestid).subscribe(data=>{
      console.log(data);
    },err=>{
      console.log(err)
    
    });
    this.router.navigateByUrl('/admin');

  }
  ngOnInit() {
  }

}
