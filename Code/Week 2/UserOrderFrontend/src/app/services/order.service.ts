import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Order } from '../models/Order';

const URL = "http://localhost:8080/order";

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private http: HttpClient) { }

  getOrders(){
    return this.http.get<any>(URL);
  }

  getOrderById(id: number){
    return this.http.get<any>(`${URL}/${id}`);
  }

  postOrder(order: Order){
    return this.http.post<any>(URL, order);
  }

  getOrdersByUserId(id: number){
    return this.http.get<any>(`${URL}/user/${id}`);
  }
}
