import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { MobileParentComponent } from './mobile-parent/mobile-parent.component';
import { MobileChildComponent } from './mobile-child/mobile-child.component';
import { RouterModule } from '@angular/router';
import { BikeParentComponent } from './bike-parent/bike-parent.component';
import { BikeChildComponent } from './bike-child/bike-child.component';
import { MoviesParentComponent } from './movies-parent/movies-parent.component';
import { MoviesChildComponent } from './movies-child/movies-child.component';
import { LaptopParentComponent } from './laptop-parent/laptop-parent.component';
import { LaptopChildComponent } from './laptop-child/laptop-child.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MobileParentComponent,
    MobileChildComponent,
    BikeParentComponent,
    BikeChildComponent,
    MoviesParentComponent,
    MoviesChildComponent,
    LaptopParentComponent,
    LaptopChildComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:'mobile-parent', component:MobileParentComponent},
      {path:'bike-parent',component:BikeParentComponent},
      {path:'movies-parent',component:MoviesParentComponent},
      {path:'laptop-parent', component:LaptopParentComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
