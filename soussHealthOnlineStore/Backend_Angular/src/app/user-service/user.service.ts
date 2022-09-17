import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import { UserInterface } from '../models/user-interface';
import { User } from '../User/user';
@Injectable({
  providedIn: 'root'
})
export class UserService {


  private baseURL = "http://localhost:8080/user";
  constructor(private httpClient: HttpClient) { }

getUsersList():Observable<UserInterface[]>{

  return this.httpClient.get<UserInterface[]>(`${this.baseURL}`);
}

createUser(user:User): Observable<Object>{
  return this.httpClient.post(`${this.baseURL}`, user);
}


}
