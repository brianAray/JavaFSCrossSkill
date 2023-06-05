import { Component } from '@angular/core';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent {
  toggleButton: boolean = true;
  displaySample: boolean = false;

  message: string = "I am visible";

  toggleButtonClick(){
    this.toggleButton = !this.toggleButton;
  }

  displaySampleClick(){
    this.displaySample = !this.displaySample;
  }


  namesArray: string[] = ["Mike", "Jim", "Jane", "Alex", "Georgia"];
  daysOfTheWeek: number[] = [0, 1, 2, 3, 4, 5, 6];
}
