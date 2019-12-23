import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-manager',
  templateUrl: './manager.component.html',
  styleUrls: ['./manager.component.css']
})
export class ManagerComponent implements OnInit {
error: String;
allocatedassets:any;

  constructor(private auth: AuthService, private router: Router) {

    this.auth.alogin=false;

    this.auth.GetAllocatedAsset().subscribe(data => {
     this.allocatedassets = data.allocatedassets;
     console.log(data);
     
   }, err => {
     console.log(err);
     this.error = err.error.message;
   })
   }


  raiseRequest(RaiserequestForm: NgForm) {
    this.error = null;
    console.log(RaiserequestForm.value);
    this.auth.raiseRequest(RaiserequestForm.value).subscribe(data => {
      console.log(data);
      RaiserequestForm.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }


  GetAllocatedAsset(){

  }
  ngOnInit() {
  }



  logout() {

    if (this.auth.alogin = true) {

      this.auth.alogin = true;
      this.auth.blogin = false;
    }
  }
  // raiseRequest(RequestForm)

}
