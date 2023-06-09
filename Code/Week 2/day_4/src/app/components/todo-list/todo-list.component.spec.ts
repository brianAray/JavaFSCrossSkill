import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TodoListComponent } from './todo-list.component';
import { TodoService } from 'src/app/services/todo.service';
import { inject } from '@angular/core';
import { of } from 'rxjs';

import { HttpTestingController, HttpClientTestingModule } from '@angular/common/http/testing';

describe('TodoListComponent', () => {
  let component: TodoListComponent;
  let fixture: ComponentFixture<TodoListComponent>;
  let todoService: TodoService;

  beforeEach(() => {

    todoService = jasmine.createSpyObj('TodoService', ['getTodos']);
    // todoService = { getTodos: () => of([{title: "Todo Test", description: "Todo Test Description"}])} as any;

    TestBed.configureTestingModule({
      declarations: [TodoListComponent],
      providers: [{provide: TodoService, useValue: todoService}],
    });

    fixture = TestBed.createComponent(TodoListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should call getTodos on TodoService', () => {
    component.ngOnInit();
    expect(todoService.getTodos).toHaveBeenCalled();
    // expect(component.todos).toEqual(of([{title: "Todo Test", description: "Todo Test Description"}]));
  })
});