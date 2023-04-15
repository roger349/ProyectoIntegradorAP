import { TestBed } from '@angular/core/testing';

import { ExperienciaLaboralServService } from './ExperienciaLaboralServ.service';

describe('ExperienciaLaboralServService', () => {
  let service: ExperienciaLaboralServService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ExperienciaLaboralServService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
