import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

interface Post {
  id: number;
  title: string;
  body: string;
  userId: number;
}

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  getData(){
    let observable = this.http.get<Post>("https://jsonplaceholder.typicode.com/posts/1");
    return observable;
  }

  postData(title: string, bodyInput: string, userId: number){
    let body = {
      title,
      bodyInput,
      userId
    }
    let observable = this.http.post<Post>('https://jsonplaceholder.typicode.com/posts', body);
    return observable;
  }

  putData(postToUpdate: any){
    return this.http.put<Post>(`https://jsonplaceholder.typicode.com/posts/${postToUpdate.id}`, postToUpdate);
  }

  deleteData(postToDelete: number){
    return this.http.delete(`https://jsonplaceholder.typicode.com/posts/${postToDelete}`);
  }
}


