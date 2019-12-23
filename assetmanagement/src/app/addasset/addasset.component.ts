import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addasset',
  templateUrl: './addasset.component.html',
  styleUrls: ['./addasset.component.css']
})
export class AddassetComponent implements OnInit {

  constructor(private auth: AuthService, private router: Router) { 
    this.auth.alogin=false;
  }
error:String;

  AddAsset(addassetform:NgForm) {
    this.error = null;
    console.log(addassetform.value);
    this.auth.AddAsset(addassetform.value).subscribe(data => {
      console.log(data);
      addassetform.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }
  ngOnInit() {
  }

}
