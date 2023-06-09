import { Component, OnInit } from '@angular/core';
import { Order } from 'src/app/models/Order';
import { User } from 'src/app/models/User';
import { OrderService } from 'src/app/services/order.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{

  users: any;

  userId: number | undefined;
  orderId: number | undefined;

  userForm = {
    name: "",
    email: ""
  };

  orderForm = {
    id: 0,
    description: ""
  };

  constructor(
    private userService: UserService,
    private orderService: OrderService
  ){}

  ngOnInit(): void {
    this.userService.getUsers().subscribe(data => this.users = data);
  }

  getAllUsers(){
    this.userService.getUsers().subscribe(data => console.log(data));
  }

  getUserById(){
    if(this.userId){
      this.userService.getUserById(this.userId).subscribe(data => console.log(data));
    }
  }

  saveUser(){
    const {name, email} = this.userForm;
    this.userService.postUser(new User(0, name, email)).subscribe(data => console.log(data));
  }

  getAllOrders(){
    this.orderService.getOrders().subscribe(data => console.log(data));
  }

  getOrderById(){
    if(this.orderId){
      this.orderService.getOrderById(this.orderId).subscribe(data => console.log(data));
    }
  }

  saveOrder(){
    const {id, description} = this.orderForm;
    this.orderService.postOrder(new Order(id, description)).subscribe(data => console.log(data));
  }
}
