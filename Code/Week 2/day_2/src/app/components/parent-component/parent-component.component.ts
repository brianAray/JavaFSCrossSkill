import { Component } from '@angular/core';

@Component({
  selector: 'app-parent-component',
  templateUrl: './parent-component.component.html',
  styleUrls: ['./parent-component.component.css']
})
export class ParentComponentComponent {

  parentProp: string = "Hello from parent!";

  receiveFromChild($event: string){
    console.log($event);
  }
}
