export class Educacion {
    id?: number;
    nombreEstudio: string;
    descripcion: string;

    constructor(nombreEstudio: string, descripcion: string){
        this.nombreEstudio = nombreEstudio;
        this.descripcion = descripcion;
    }
}

