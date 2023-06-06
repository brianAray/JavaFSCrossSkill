import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child-component',
  templateUrl: './child-component.component.html',
  styleUrls: ['./child-component.component.css']
})
export class ChildComponentComponent {

  @Input() childProp!: string;

  @Output() messageEvent = new EventEmitter<string>();

  sendToParent(){
    this.messageEvent.emit("Hello from child!");
  }

}
