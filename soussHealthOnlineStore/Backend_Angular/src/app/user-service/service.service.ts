import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import { UserInterface } from '../models/user-interface';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseURL = "http://localhost:8080/user/users";
  constructor(private httpClient: HttpClient) { }

getUsersList():Observable<UserInterface[]>{

  return this.httpClient.get<UserInterface[]>(`${this.baseURL}`);
}
}
