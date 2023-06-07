import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthService } from 'src/app/services/auth.service';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{

  loginForm = {
    email: '',
    password: '',
  }

  postForm = {
    title: '',
    body: '',
    userId: 0
  }

  data: any;

  deletePostId: number | undefined = undefined;

  constructor(
    private authService: AuthService,
    private router: Router,
    private dataService: DataService
  ){}

  ngOnInit(): void {
    let promise = new Promise((resolve, reject) => {
      setTimeout(() => resolve("Promise Resolved 3000!"), 3000);
      setTimeout(() => resolve("Promise Resolved 1000!"), 1000);
    });

    promise.then(value => console.log(value));

    let observable = new Observable(observer => {
      setTimeout(() => observer.next("Observable Resolved 3000"), 3000);
      setTimeout(() => observer.next("Observable Resolved 2000"), 2000);
      setTimeout(() => observer.next("Observable Resolved 1000"), 1000);
      setTimeout(() => observer.next("Observable Resolved 5000"), 5000);
    });

    let subscription = observable.subscribe(value => console.log(value));
  }

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

  onSubmitPost(): void{
    // console.log(this.postForm);
    const { title, body, userId} = this.postForm;

    let observable = this.dataService.postData(title, body, userId);
    observable.subscribe(data => {
      console.log(data);
    })
  }


  getData(){
    let observable = this.dataService.getData();
    observable.subscribe(data => {
      this.data = data;
    })
  }

  putData(){
    let postToUpdate = {
      id: 3,
      title: 'New Title',
      body: 'New Body',
      userId: 1
    }

    let observable = this.dataService.putData(postToUpdate);
    observable.subscribe(data => {
      console.log(data);
    })
  }

  deleteData(){
    if(this.deletePostId){
      this.dataService.deleteData(this.deletePostId).subscribe(data => console.log(data));
    }else{
      alert("put in a valid id");
    }
  }
}
