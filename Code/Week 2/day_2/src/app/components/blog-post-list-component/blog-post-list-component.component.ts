import { Component } from '@angular/core';
import { BlogPost } from 'src/app/models/BlogPost';

@Component({
  selector: 'app-blog-post-list-component',
  templateUrl: './blog-post-list-component.component.html',
  styleUrls: ['./blog-post-list-component.component.css']
})
export class BlogPostListComponentComponent {

  selectedPost: BlogPost | undefined;

  blogPosts: BlogPost[] = [
    new BlogPost(1, "Mike", "Hello there Mike!"),
    new BlogPost(2, "Jane", "Hello there Jane!"),
    new BlogPost(3, "Jim", "Hello there Jim!"),
    new BlogPost(4, "Karl", "Hello there Karl!"),
  ]

  selectPost(post: BlogPost){
    console.log(post);
    this.selectedPost = post;
  }

  closePost($event : boolean){
    this.selectedPost = undefined;
  }
}
