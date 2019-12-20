import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-searchbyname',
  templateUrl: './searchbyname.component.html',
  styleUrls: ['./searchbyname.component.css']
})
export class SearchbynameComponent implements OnInit {

error:String;
 products:[]=[];
product:any;
  constructor(private auth: AuthService, private router: Router) {
 
    this.auth.getAllProducts().subscribe(data => {
      this.products=data.assets;
     console.log(data);
     
   }, err => {
     console.log(err);
     this.error = err.error.message;
   })

   
   }

   delete(product){

   }


   search(value){
    //  this.product = form.value.name;
     console.log(this.products)
     this.auth.getData(this.product).subscribe(data => {
      this.products=data.assets;
     console.log(data);
     
   }, err => {
     console.log(err);
     this.error = err.error.message;
   })
   }
  ngOnInit() {
  }

}
