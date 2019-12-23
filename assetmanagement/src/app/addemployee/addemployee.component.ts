import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addemployee',
  templateUrl: './addemployee.component.html',
  styleUrls: ['./addemployee.component.css']
})
export class AddemployeeComponent implements OnInit {

  constructor(private auth: AuthService, private router: Router) {
    this.auth.alogin=false;
   }
error:String;


  Employee(employeeForm:NgForm) {
    this.error = null;
    console.log(employeeForm.value);
    this.auth.Employee(employeeForm.value).subscribe(data => {
      console.log(data);
      employeeForm.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }
  ngOnInit() {
  }

}
