import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';
import { HttpClient } from '@angular/common/http';



@Injectable({
    providedIn: 'root'
})
export class AuthGuard implements CanActivate {

    canActivate(route: ActivatedRouteSnapshot) {
        const expectedRoleArray = route.data.roles;
        const userDetails = JSON.parse(localStorage.getItem('userDetails'));
        let expectedRole: string;
        for (const index in expectedRoleArray) {
            if (userDetails && userDetails.usertype === expectedRoleArray[index]) {
                expectedRole = expectedRoleArray[index];
            }
        }
       

        if (userDetails && (userDetails.usertype==="manager"||userDetails.usertype==="admin")) {
            console.log('user is authorized');

            return true;
        } else {
            console.log('not authenticated');
            return false;
        }
    }
}
