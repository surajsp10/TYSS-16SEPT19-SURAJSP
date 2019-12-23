import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { LoginComponent } from './login/login.component';
import { Type } from '@angular/compiler';

@Injectable({
  providedIn: 'root'
})
export class AuthService {


  
  constructor(private http : HttpClient) { }
  message: any;
  alogin:boolean=true;
  blogin:boolean=true;
  isLoggedIn = true;
  request;
  status:any;

    AddAsset(addassetform):Observable<any>{
      return this.http.post('http://localhost:8080/addasset',addassetform);
    }


     GetRequestedAsset():Observable<any>{
      return this.http.get('http://localhost:8080/getrequest',{headers:new HttpHeaders({'Content-Type':'application/json'})});
    }


    
     GetAllocatedAsset():Observable<any>{
      return this.http.get('http://localhost:8080/getassetallocate',{headers:new HttpHeaders({'Content-Type':'application/json'})});
    }
  Employee(employeeForm):Observable<any>{
    return this.http.post('http://localhost:8080/addemployee',employeeForm);
  }
  loginUser(user):Observable<any>{
    return this.http.post('http://localhost:8080/login',user);
  }
  raiseRequest(request):Observable<any>{
    return this.http.post('http://localhost:8080/raiserequest',request);
  }

  GetAsset():Observable<any>{
    return this.http.get('http://localhost:8080/getasset',{headers:new HttpHeaders({'Content-Type':'application/json'})});
  }

  AssetAllocation(assetallocationform):Observable<any>{
    return this.http.post('http://localhost:8080/assetallocate',assetallocationform);
  }


  deleterequest(requestid):Observable<any>{
    return this.http.delete <any>(`http://localhost:8080/deleterequest/${requestid}` , {headers:new HttpHeaders({'Content-Type':'application/json'})});
  }
}
