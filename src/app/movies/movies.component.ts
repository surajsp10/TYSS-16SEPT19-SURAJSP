import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  movies;
  inputData: any;
  constructor(public http: HttpClient) {

   }


  ngOnInit() {
  }
  search(event) {
    this.inputData = event.target.value;
    console.log(this.inputData);
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('http://www.omdbapi.com/?&apikey=b5546e6e&s=' + this.inputData).subscribe(data => {
   this.movies = data.Search;
  }, );
  }

}
