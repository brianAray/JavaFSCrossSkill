import { Component } from '@angular/core';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent {
  message: string = "Hello there";

  imageUrl: string = "https://cdn.britannica.com/39/7139-050-A88818BB/Himalayan-chocolate-point.jpg";
  imageUrl2: string = "https://cdn.britannica.com/25/7125-050-67ACEC3C/Abyssinian-sorrel.jpg";

  catUrl: string = this.imageUrl;
  toggleCat: boolean = true;

  name: string = "Jim";

  handleButtonClick(){
    alert("I have been clicked");
  }

  toggleCatPicture(){
    this.toggleCat = !this.toggleCat;
    if(this.toggleCat){
      this.catUrl = this.imageUrl;
    }else{
      this.catUrl = this.imageUrl2;
    }
  }
}
