import { Injectable } from '@angular/core';

interface User {
  email: string;
}


@Injectable({
  providedIn: 'root'
})
export class AuthService {

  user: User | null = null;

  constructor() { }

  login(email: string, password: string): boolean{
    if (email === "test@email.com" && password === "password"){
      this.user = {
        email: email
      };
      return true;
    }else{
      return false;
    }
  }

  logout(): void{
    this.user = null;
  }

  isLoggedIn(): boolean {
    return this.user !== null;
  }

}
