import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';
import { AuthService } from './auth.service';

export const authGuard: CanActivateFn = (route, state) => {

  const authService = inject(AuthService);
  const router = inject(Router);

  // if user is logged in then true
  // when true, means continue to endpoint requested

  if(authService.isLoggedIn()){
    return true;
  }else{
    // else navigate to login
    router.navigate(["/login"]);
    return false;
  }

};
