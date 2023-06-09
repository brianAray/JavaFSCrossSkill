import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../models/User';

const URL = "http://localhost:8080/user";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  getUsers(){
    return this.http.get<any>(URL);
  }

  getUserById(id: number){
    return this.http.get<any>(`${URL}/${id}`);
  }

  postUser(user: User){
    return this.http.post<any>(URL, user);
  }
}
