import { TestBed } from '@angular/core/testing';

import { TodoService } from './todo.service';

import { HttpTestingController, HttpClientTestingModule } from '@angular/common/http/testing';

import { of } from 'rxjs';

describe('TodoService', () => {
  let service: TodoService;
  let httpMock: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [TodoService]
    });
    service = TestBed.inject(TodoService);
    httpMock = TestBed.inject(HttpTestingController);
  });

  afterEach(() => {
    httpMock.verify(); // ensure that there are no outstanding requests
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should fetch todos from url', () => {
    const mockTodos = [{title: 'Test Todo', description: 'Test Todo Description'}];

    service.getTodos().subscribe(todos => {
      expect(todos).toEqual(mockTodos);
    })

    const req = httpMock.expectOne('https://api.example.com/todos');
    expect(req.request.method).toBe('GET');
    req.flush(mockTodos);

  })
});
