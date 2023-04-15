import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogosApRedesSocialesLoginComponent } from './logos-ap-redes-sociales-login.component';

describe('LogosApRedesSocialesLoginComponent', () => {
  let component: LogosApRedesSocialesLoginComponent;
  let fixture: ComponentFixture<LogosApRedesSocialesLoginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LogosApRedesSocialesLoginComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LogosApRedesSocialesLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
