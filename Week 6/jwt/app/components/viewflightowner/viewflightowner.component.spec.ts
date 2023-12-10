import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewflightownerComponent } from './viewflightowner.component';

describe('ViewflightownerComponent', () => {
  let component: ViewflightownerComponent;
  let fixture: ComponentFixture<ViewflightownerComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViewflightownerComponent]
    });
    fixture = TestBed.createComponent(ViewflightownerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
