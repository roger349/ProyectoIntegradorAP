import { Component, OnInit } from '@angular/core';
import { Tecnologias } from 'src/app/modelos/Tecnologias.model';
import { TecnologiasService } from 'src/app/servicios/Tecnologias.service';

@Component({
  selector: 'app-hsskills',
  templateUrl: './hsskills.component.html',
  styleUrls: ['./hsskills.component.css']
})
export class HsskillsComponent implements OnInit{

  tecno: Tecnologias[] = [];

  constructor(public Tec: TecnologiasService){}

  ngOnInit(): void {
    this.Tec.TecList().subscribe(tec => { this.tecno=tec;
      console.log(tec);} )         
  }

}
