import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfilelistPage } from './profilelist.page';

describe('ProfilelistPage', () => {
  let component: ProfilelistPage;
  let fixture: ComponentFixture<ProfilelistPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProfilelistPage ],
      schemas: [CUSTOM_ELEMENTS_SCHEMA],
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProfilelistPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
