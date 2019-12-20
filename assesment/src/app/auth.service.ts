import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Type } from '@angular/compiler';

@Injectable({
  providedIn: 'root'
})
export class AuthService {


  products:[]=[];
  constructor(private http : HttpClient) { }

  addProduct(addproductform):Observable<any>{
    return this.http.post('http://localhost:8080/addproduct',addproductform);
  }


  getAllProducts():Observable<any>{
    return this.http.get('http://localhost:8080/getallproducts',{headers:new HttpHeaders({'Content-Type':'application/json'})});
  }

  getData(product):Observable<any>{
    return this.http.get('http://localhost:8080/getproduct',{headers:new HttpHeaders({'Content-Type':'application/json'})});
  }
}
