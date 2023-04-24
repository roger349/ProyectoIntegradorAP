export  class DatosPersonales {

       id_datos_Personales?:number;
       nombre: String;
       apellido: String;
       fecha_nacimiento: String;
       estado_civil: String;
       correo_electronico: String;

       constructor(nombre: String, apellido: String, fecha_nacimiento: String,estado_civil: String, correo_electronico: String) {
                        
       this.nombre = nombre;
       this.apellido = apellido;
       this.fecha_nacimiento = fecha_nacimiento;
       this.estado_civil = estado_civil;
       this.correo_electronico = correo_electronico;
       } 
} 