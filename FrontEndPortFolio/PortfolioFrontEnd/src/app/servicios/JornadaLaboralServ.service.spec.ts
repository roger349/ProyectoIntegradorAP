import { TestBed } from '@angular/core/testing';
import { JornadaLaboralServService } from './JornadaLaboralServ.service';

describe('JornadalaboralServService', () => {
  let service: JornadaLaboralServService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(JornadaLaboralServService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
