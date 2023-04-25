export class Proyectos{

    id_proyecto:number;
    tipo_proyecto:string;
    descripcion_proyecto:string;

    constructor(id_proyecto:number, tipo_proyecto:string, descripcion_proyecto:string) {

    this.id_proyecto = id_proyecto;
    this.tipo_proyecto = tipo_proyecto;
    this.descripcion_proyecto = descripcion_proyecto;
    
    }   
}