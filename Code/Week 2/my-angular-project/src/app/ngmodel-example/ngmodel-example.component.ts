import { Component } from '@angular/core';

@Component({
  selector: 'app-ngmodel-example',
  templateUrl: './ngmodel-example.component.html',
  styleUrls: ['./ngmodel-example.component.css']
})
export class NgmodelExampleComponent {
  username: string = "";
  password: string = "";

  toggleUsernameValidation: boolean = false;
  togglePasswordValidation: boolean = false;

  sendInformation(){
    let usernameLength: number = this.username.length;
    let passwordLength: number = this.password.length;
    if(usernameLength < 3){
      console.log(`${this.username} is not valid`);
    }else{
      console.log(`${this.username} is valid`);
    }

    if(passwordLength < 3){
      console.log(`${this.password} is not valid`);
    }else{
      console.log(`${this.password} is valid`);
    }
  }

  resetInformation(){

  }
}
