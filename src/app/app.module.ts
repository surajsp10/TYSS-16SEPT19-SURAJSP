import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
// import { HomeComponent } from './home/home.component';
// import { CountriesComponent } from './countries/countries.component';
// import { EntertainmentHomeComponent } from './entertainment-home/entertainment-home.component';
// import { SportsHomeComponent } from './sports-home/sports-home.component';
// import { IndiaComponent } from './india/india.component';
// import { UsaComponent } from './usa/usa.component';
// import { DubaiComponent } from './dubai/dubai.component';
// import { RussiaComponent } from './russia/russia.component';
// import { CountriesDropdownComponent } from './countries-dropdown/countries-dropdown.component';
// import { CategoriesComponent } from './categories/categories.component';
// import { CategoriesDropdownComponent } from './categories-dropdown/categories-dropdown.component';
// import { GeneralComponent } from './general/general.component';
// import { HealthComponent } from './health/health.component';
// import { SportsComponent } from './sports/sports.component';
// import { ScienceComponent } from './science/science.component';
// import { BusinessComponent } from './business/business.component';
// import { TechnologyComponent } from './technology/technology.component';
// import { EntertainmentComponent } from './entertainment/entertainment.component';
// import { NewssourceComponent } from './newssource/newssource.component';
// import { NewssourceDropdownComponent } from './newssource-dropdown/newssource-dropdown.component';
// import { BbcComponent } from './bbc/bbc.component';
// import { ToiComponent } from './toi/toi.component';
// import { FoxComponent } from './fox/fox.component';
// import { EspnComponent } from './espn/espn.component';
// import { News24Component } from './news24/news24.component';
// import { SearchnewsComponent } from './searchnews/searchnews.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MoviesComponent } from './movies/movies.component';
import { AddmovieComponent } from './addmovie/addmovie.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    // HomeComponent,
    // CountriesComponent,
    // EntertainmentHomeComponent,
    // SportsHomeComponent,
    // IndiaComponent,
    // UsaComponent,
    // DubaiComponent,
    // RussiaComponent,
    // CountriesDropdownComponent,
    // CategoriesComponent,
    // CategoriesDropdownComponent,
    // GeneralComponent,
    // HealthComponent,
    // SportsComponent,
    // ScienceComponent,
    // BusinessComponent,
    // TechnologyComponent,
    // EntertainmentComponent,
    // NewssourceComponent,
    // NewssourceDropdownComponent,
    // BbcComponent,
    // ToiComponent,
    // FoxComponent,
    // EspnComponent,
    // News24Component,
    // SearchnewsComponent,
    MoviesComponent,
    AddmovieComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      // {path : 'home' , component : HomeComponent},
      // {path : 'countries' , component : CountriesComponent},
      // {path : 'entertainmenthomecomponent' , component : EntertainmentHomeComponent},
      // {path : 'sportshomecomponent' , component : SportsHomeComponent},
      // {path : 'India' , component :IndiaComponent},
      // {path : 'usa' , component :UsaComponent},
      // {path : 'russia' , component :RussiaComponent},
      // {path : 'dubai' , component :DubaiComponent},
      // {path : 'categories' , component :CategoriesComponent},
      // {path : 'general' , component :GeneralComponent},
      // {path : 'health' , component :HealthComponent},
      // {path : 'sports' , component :SportsComponent},
      // {path : 'science' , component :ScienceComponent},
      // {path : 'business' , component :BusinessComponent},
      // {path : 'technology' , component :TechnologyComponent},
      // {path : 'entertainment' , component :EntertainmentComponent},
      // {path : 'sources' , component :NewssourceComponent},
      // {path : 'toi' , component :ToiComponent},
      // {path : 'bbc' , component :BbcComponent},
      // {path : 'fox' , component :FoxComponent},
      // {path : 'espn' , component :EspnComponent},
      // {path : 'news24' , component :News24Component},
      // {path : 'search' , component :SearchnewsComponent}
      {path : 'movies' , component :MoviesComponent},
      {path : 'addmovie' , component :AddmovieComponent},
      {path : 'login' , component :LoginComponent},

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
