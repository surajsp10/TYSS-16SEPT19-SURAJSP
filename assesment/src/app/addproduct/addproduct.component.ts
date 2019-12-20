import { Component, OnInit } from '@angular/core';

import { NgForm } from '@angular/forms';
import { Route, Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  constructor(private auth: AuthService, private router: Router) { }

error:String;
  addProduct(addproductform:NgForm){
    this.error = null;
    console.log(addproductform.value);
    this.auth.addProduct(addproductform.value).subscribe(data => {
      console.log(data);
      addproductform.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });

  }
  ngOnInit() {
  }

}
