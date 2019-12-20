import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import { HomeComponent } from './home/home.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { SearchproductsComponent } from './searchproducts/searchproducts.component';
import { SearchbynameComponent } from './searchbyname/searchbyname.component';
import { SearchbycategoryComponent } from './searchbycategory/searchbycategory.component';
import { SearchbycompanyComponent } from './searchbycompany/searchbycompany.component';
import { FilterPipe } from './filter.pipe';


@NgModule({
  declarations: [
    AppComponent,

    HomeComponent,
    AddproductComponent,
    SearchproductsComponent,
    SearchbynameComponent,
    SearchbycategoryComponent,
    SearchbycompanyComponent,
    FilterPipe,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
     
    
    {path : 'addproduct', component : AddproductComponent},
    {path : 'searchproduct', component :SearchproductsComponent},
      {path : 'searchbyname',component:SearchbynameComponent},
          {path : 'searchbycategory',component:SearchbycategoryComponent},
          {path : 'searchbycompany',component:SearchbycompanyComponent}
  

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
