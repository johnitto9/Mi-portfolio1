import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Experiencia } from '../model/experiencia';

@Injectable({
  providedIn: 'root'
})
export class ServexperienciaService {
  expURL = 'http://localhost:8080/explab/'

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Experiencia[]>{
    return this.httpClient.get<Experiencia[]>(this.expURL + 'lista');
  }

public detail(id: number): Observable<Experiencia> {
  return this.httpClient.get<Experiencia>(this.expURL + `detail/${id}`);
}

public save(experiencia: Experiencia): Observable<any> {
  return this.httpClient.post<any>(this.expURL + 'create', experiencia);
}

public update(id_exp: number, experiencia: Experiencia): Observable<any>{
  return this.httpClient.put<any>(this.expURL + `update/${id_exp}`, experiencia);
}

public delete(id_exp: number): Observable<any>{
  return this.httpClient.delete<any>(this.expURL + `delete/${id_exp}`);
}

}