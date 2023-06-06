import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BlogPostListComponentComponent } from './blog-post-list-component.component';

describe('BlogPostListComponentComponent', () => {
  let component: BlogPostListComponentComponent;
  let fixture: ComponentFixture<BlogPostListComponentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BlogPostListComponentComponent]
    });
    fixture = TestBed.createComponent(BlogPostListComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
