import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PipesExampleComponent } from './pipes-example.component';

describe('PipesExampleComponent', () => {
  let component: PipesExampleComponent;
  let fixture: ComponentFixture<PipesExampleComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PipesExampleComponent]
    });
    fixture = TestBed.createComponent(PipesExampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
