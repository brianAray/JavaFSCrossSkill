import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  loginForm = {
    email: '',
    password: '',
  }

  constructor(
    private authService: AuthService,
    private router: Router
  ){}

  onSubmit():void{
    // console.log(this.loginForm);
    const { email, password } = this.loginForm;
    if (this.authService.login(email, password)){
      // redirect to home page
      this.router.navigate(["/"]);
    }else{
      alert("Invalid Login!");
    }
  }
}
