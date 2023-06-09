import { Component, Input, OnInit } from '@angular/core';
import { OrderService } from 'src/app/services/order.service';

@Component({
  selector: 'app-order-list',
  templateUrl: './order-list.component.html',
  styleUrls: ['./order-list.component.css']
})
export class OrderListComponent implements OnInit{

  @Input() selectedUser: any;

  orders: any;
  
  constructor(private orderService: OrderService){}
  
  ngOnInit(): void {
    this.orderService.getOrdersByUserId(this.selectedUser.id).subscribe(data => this.orders = data);
  }


}
