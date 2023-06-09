import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TodoComponent } from './todo.component';
import { By } from '@angular/platform-browser';

describe('TodoComponent', () => {
  let component: TodoComponent;
  let fixture: ComponentFixture<TodoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TodoComponent]
    });
    fixture = TestBed.createComponent(TodoComponent);
    component = fixture.componentInstance;
    // fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should display the todo title and description', () => {

    component.todo = {
      title: 'Test Todo',
      description: 'Test Todo Description'
    };

    fixture.detectChanges();

    const titleElement = fixture.debugElement.query(By.css('h2')).nativeElement;
    const descriptionElement = fixture.debugElement.query(By.css('p')).nativeElement;

    expect(titleElement.textContent).toContain('Test Todo');
    expect(descriptionElement.textContent).toContain('Test Todo Description');
  })
});
