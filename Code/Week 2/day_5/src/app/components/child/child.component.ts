import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {

  @Output() eventEmitter = new EventEmitter<void>();

  emitEvent(){
    this.eventEmitter.emit();
  }
}
