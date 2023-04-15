import { TestBed } from '@angular/core/testing';

import { UsuarioServService } from './UsuarioServ.service';

describe('UsuarioServService', () => {
  let service: UsuarioServService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UsuarioServService);
  });
  
  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
