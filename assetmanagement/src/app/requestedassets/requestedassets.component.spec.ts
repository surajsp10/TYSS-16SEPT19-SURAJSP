import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RequestedassetsComponent } from './requestedassets.component';

describe('RequestedassetsComponent', () => {
  let component: RequestedassetsComponent;
  let fixture: ComponentFixture<RequestedassetsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RequestedassetsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RequestedassetsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
