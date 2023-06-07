import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MissingComponent } from './missing.component';

describe('MissingComponent', () => {
  let component: MissingComponent;
  let fixture: ComponentFixture<MissingComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MissingComponent]
    });
    fixture = TestBed.createComponent(MissingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
