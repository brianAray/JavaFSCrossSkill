import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute-directives',
  templateUrl: './attribute-directives.component.html',
  styleUrls: ['./attribute-directives.component.css']
})
export class AttributeDirectivesComponent {
  isHighlighted: boolean = false;
  hasError: boolean = false;
  bgColor: string = "red";
  color: string = "green";

  buttonStyling: any = {
    'background-color': this.bgColor,
    'color': this.color
  }

  highlightToggle() {
    this.isHighlighted = !this.isHighlighted;
  }

  errorToggle() {
    this.hasError = !this.hasError;
  }
}
