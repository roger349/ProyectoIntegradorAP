export class ExperienciaLaboral {

    id_experiencia?:number;
    nombre_empresa: String;
    fecha_inicio:String;
    fecha_fin:String;
    descripcion_puesto: String;
  

    constructor(id_experiencia:number, nombre_empresa:String, fecha_inicio:String, fecha_fin: String, 
                descripcion_puesto:String) {

    this.id_experiencia = id_experiencia; 
    this.nombre_empresa = nombre_empresa;
    this.fecha_inicio = fecha_inicio;
    this.fecha_fin = fecha_fin;
    this.descripcion_puesto = descripcion_puesto;
 }
} 