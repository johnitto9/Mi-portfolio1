import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Experiencia } from 'src/app/model/experiencia';
import { ServexperienciaService } from 'src/app/service/servexperiencia.service';

@Component({
  selector: 'app-new-experiencia',
  templateUrl: './new-experiencia.component.html',
  styleUrls: ['./new-experiencia.component.css']
})
export class NewExperienciaComponent implements OnInit {

  nombreEmpresa: string = '';
  descripcion: string = '';

  constructor(private servexperiencia: ServexperienciaService, private router: Router) {}

  ngOnInit(): void {
  }

onCreate(): void {
  const expe = new Experiencia(this.nombreEmpresa, this.descripcion);
  this.servexperiencia.save(expe).subscribe(data => {
    alert("Experiencia añadida");
    this.router.navigate(['']);

  }, err => {
      alert("Falló");
      this.router.navigate(['']);
    }
    )
}

}