import { TestBed } from '@angular/core/testing';
import { TecnologiasService } from './Tecnologias.service';



describe('TecnologiasService', () => {
  let service: TecnologiasService;
 
  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TecnologiasService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
