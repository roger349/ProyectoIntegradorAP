import { TestBed } from '@angular/core/testing';

import { DatosPersonalesServService } from './DatosPersonalesServ.service';

describe('DatosPersonalesService', () => {
  let service: DatosPersonalesServService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DatosPersonalesServService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
