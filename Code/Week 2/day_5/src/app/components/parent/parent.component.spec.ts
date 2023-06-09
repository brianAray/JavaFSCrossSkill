import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ParentComponent } from './parent.component';
import { ChildComponent } from '../child/child.component';
import { NO_ERRORS_SCHEMA } from '@angular/compiler';
import { By } from '@angular/platform-browser';

describe('ParentComponent', () => {
  let component: ParentComponent;
  let fixture: ComponentFixture<ParentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ParentComponent, ChildComponent],
      schemas: [NO_ERRORS_SCHEMA] // Ignores the dependencies in the child component
    }).compileComponents();

    fixture = TestBed.createComponent(ParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should handle event emitted by child', () => {
    spyOn(component, 'handleEvent');

    // const childComponent = fixture.debugElement.children[0].componentInstance as ChildComponent;
    const childComponent = fixture.debugElement.query(By.css('app-child')).componentInstance as ChildComponent;

    

    childComponent.eventEmitter.emit();

    expect(component.handleEvent).toHaveBeenCalled();

  })
});
