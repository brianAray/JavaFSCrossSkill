import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BlogPostDetailsComponentComponent } from './blog-post-details-component.component';

describe('BlogPostDetailsComponentComponent', () => {
  let component: BlogPostDetailsComponentComponent;
  let fixture: ComponentFixture<BlogPostDetailsComponentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BlogPostDetailsComponentComponent]
    });
    fixture = TestBed.createComponent(BlogPostDetailsComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
