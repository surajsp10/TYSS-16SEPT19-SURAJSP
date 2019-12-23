import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { ManagerComponent } from './manager/manager.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import { AddemployeeComponent } from './addemployee/addemployee.component';
import { HeaderComponent } from './header/header.component'
import { AuthGuard } from 'src/authguard.service';
import { AddassetComponent } from './addasset/addasset.component';
import { AllocatedassetComponent } from './allocatedasset/allocatedasset.component';
import { RequestedassetsComponent } from './requestedassets/requestedassets.component';
import { ViewassetComponent } from './viewasset/viewasset.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminComponent,
    ManagerComponent,
    AddemployeeComponent,
    HeaderComponent,
    AddassetComponent,
    AllocatedassetComponent,
    RequestedassetsComponent,
    ViewassetComponent,
  
 
  ],
  imports: [
    BrowserModule,

    FormsModule,
    HttpClientModule,

    RouterModule.forRoot([
     
      {
        path: 'manager', component: ManagerComponent,
        canActivate: [AuthGuard], data: { roles: ['manager'] }
      },
      {
        path: 'admin', component: AdminComponent,
        canActivate: [AuthGuard], data: { roles: ['admin'] }
      },
    
    {path : 'login', component : LoginComponent},
    {path : 'addemployee' , component : AddemployeeComponent},
    {path : 'addasset',component : AddassetComponent},
    {path : 'allocation',component : AllocatedassetComponent},
    {path : 'viewasset',component : ViewassetComponent}
  

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
