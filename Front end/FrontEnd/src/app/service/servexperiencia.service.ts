import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environments } from '../environments/environments';
import { Experiencia } from '../model/experiencia';

@Injectable({
  providedIn: 'root'
})
export class ServexperienciaService {
  URL = environments.URL + 'explab/'

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Experiencia[]>{
    return this.httpClient.get<Experiencia[]>(this.URL + 'lista');
  }

public detail(id: number): Observable<Experiencia> {
  return this.httpClient.get<Experiencia>(this.URL + `detail/${id}`);
}

public save(experiencia: Experiencia): Observable<any> {
  return this.httpClient.post<any>(this.URL + 'create', experiencia);
}

public update(id_exp: number, experiencia: Experiencia): Observable<any>{
  return this.httpClient.put<any>(this.URL + `update/${id_exp}`, experiencia);
}

public delete(id_exp: number): Observable<any>{
  return this.httpClient.delete<any>(this.URL + `delete/${id_exp}`);
}

}