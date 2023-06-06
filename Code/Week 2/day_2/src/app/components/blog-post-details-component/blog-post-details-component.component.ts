import { Component, EventEmitter, Input, Output } from '@angular/core';
import { BlogPost } from 'src/app/models/BlogPost';

@Component({
  selector: 'app-blog-post-details-component',
  templateUrl: './blog-post-details-component.component.html',
  styleUrls: ['./blog-post-details-component.component.css']
})
export class BlogPostDetailsComponentComponent {
  @Input() selectedPost: BlogPost | undefined;

  @Output() closeEvent = new EventEmitter<boolean>();

  closePostEvent(){
    this.closeEvent.emit(true);
  }
}
