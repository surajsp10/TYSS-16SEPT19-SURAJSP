import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AllocatedassetComponent } from './allocatedasset.component';

describe('AllocatedassetComponent', () => {
  let component: AllocatedassetComponent;
  let fixture: ComponentFixture<AllocatedassetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AllocatedassetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AllocatedassetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
