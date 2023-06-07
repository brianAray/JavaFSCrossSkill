import { Component } from '@angular/core';
import { LoggingService } from 'src/app/services/logging.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-service-example',
  templateUrl: './service-example.component.html',
  styleUrls: ['./service-example.component.css']
})
export class ServiceExampleComponent {

  message: string = "";

  users: string[];

  newUser: string | undefined;

  ngOnInit(){
    this.loggingService.log("ngOnIt");
  }

  constructor(
    private loggingService: LoggingService,
    private userService: UserService
  ){
    this.users = userService.getUsers();
    this.loggingService.log("constructor");
  }

  logMessage(): void{
    this.loggingService.log(this.message);
  }

  addUser(): void{
    if(this.newUser){
      this.userService.addUser(this.newUser);
      this.newUser = '';
      this.users = this.userService.getUsers();
    }else{
      alert("Please enter a name");
    }
  }
}
