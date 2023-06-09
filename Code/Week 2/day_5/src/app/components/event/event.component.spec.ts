import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventComponent } from './event.component';
import { By } from '@angular/platform-browser';

describe('EventComponent', () => {
  let component: EventComponent;
  let fixture: ComponentFixture<EventComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EventComponent]
    });
    fixture = TestBed.createComponent(EventComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should display a message when the button is clicked', () => {
    const button = fixture.debugElement.query(By.css('button')).nativeElement;

    button.click();

    fixture.detectChanges();

    const message = fixture.debugElement.query(By.css('p')).nativeElement;

    expect(message.textContent).toContain('Button clicked!');
  })
});
