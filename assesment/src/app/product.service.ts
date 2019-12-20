import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Type } from '@angular/compiler';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { }



  addProduct(addproductform):Observable<any>{
    return this.http.post('http://localhost:8080/addproduct',addproductform);
  }
}
