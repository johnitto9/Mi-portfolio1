export class Experiencia {
    id_exp? : number;
    nombreEmpresa : string;
    descripcion : string;

    constructor(nombreEmpresa: string, descripcion: string) {
        this.nombreEmpresa = nombreEmpresa;
        this.descripcion = descripcion;
    }
}
