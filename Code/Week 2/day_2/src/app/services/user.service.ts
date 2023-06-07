import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private users: string[] = ['Mike', 'Bob', 'Alice'];

  constructor() { }

  getUsers(): string[]{
    return this.users;
  }

  addUser(user: string): void{
    this.users.push(user);
  }
}
