import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent {

  @Input() users: any;

  selectedUser: any;

  selectUser(user: any){
    this.selectedUser = user;
  }

}
