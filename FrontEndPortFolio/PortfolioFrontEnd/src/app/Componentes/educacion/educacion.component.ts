import { Component, OnInit } from '@angular/core';
import { Educacion } from 'src/app/modelos/Educacion.model';
import { EducacionService } from '../../servicios/Educacion.service'

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {
  
  educ: Educacion[] = [];
  
  constructor(public eduservice : EducacionService) {}
  
  ngOnInit(): void {
       this.eduservice.EduList().subscribe(edu => { this.educ=edu;
            console.log(edu);} )         
  }
}
