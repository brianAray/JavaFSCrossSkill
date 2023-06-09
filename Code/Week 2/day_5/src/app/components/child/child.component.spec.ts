import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildComponent } from './child.component';

describe('ChildComponent', () => {
  let component: ChildComponent;
  let fixture: ComponentFixture<ChildComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildComponent]
    });
    fixture = TestBed.createComponent(ChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should emit event on button click', () => {
    spyOn(component.eventEmitter, 'emit');

    const button = fixture.nativeElement.querySelector('button');

    button.click();

    expect(component.eventEmitter.emit).toHaveBeenCalled();
  })
});
