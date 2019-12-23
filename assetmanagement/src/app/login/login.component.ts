import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  
  error: String;
  constructor(private auth: AuthService, private router: Router) { }



  isLoggedIn(): boolean {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails) {
      return true;
    } else {
      return false;
    }
  }

   login(form: NgForm) {
    this.error = null;
    console.log(form.value);
    this.auth.loginUser(form.value).subscribe(data => {
      console.log('Response of login', data);
      this.auth.message=data.message;

      // if (data && data.message === 'success"')
      if (data.message === 'success') {

         localStorage.setItem('userDetails', JSON.stringify(data));
         if (data.usertype === 'admin') {
          this.auth.alogin = false;
          this.auth.blogin = true;
          this.router.navigateByUrl('/admin');
         } else if (data.usertype === 'manager') {
          this.auth.alogin = false;
          this.auth.blogin = true;
          this.router.navigateByUrl('/manager');

          form.reset();
         } else if (data.message === 'No message available') {
          this.auth.alogin = true;
          this.error = 'invalid credentials';
          console.log('invalid credentials');
         }
       }
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }


  ngOnInit() {
  }

  logout() {
    if (this.auth.alogin = true) {

     this.auth.alogin = true;
     this.auth.blogin = false;

   }
 }

}
