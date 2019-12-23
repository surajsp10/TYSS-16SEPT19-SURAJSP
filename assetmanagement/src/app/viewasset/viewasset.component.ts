import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-viewasset',
  templateUrl: './viewasset.component.html',
  styleUrls: ['./viewasset.component.css']
})
export class ViewassetComponent implements OnInit {
  error:String
  assets:[]=[];
  constructor(private auth: AuthService, private router: Router) { 
    this.auth.alogin=false;

    this.auth.GetAsset().subscribe(data => {
      this.assets=data.assets;
     console.log(data);
     
   }, err => {
     console.log(err);
     this.error = err.error.message;
   })
  }

  ngOnInit() {
  }

}
