import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { UserInterface } from '../models/user-interface';
import { UserService } from '../user.service';
@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
    users:any=[];

  constructor(private userService : UserService) { }

  ngOnInit(): void {

    this.getUsers();
  }

  private getUsers(){
    this.userService.getUsersList().subscribe(data =>{
      this.users = data;
    });
  }


  getData(){
    /*this.httpclient.get<UserInterface>("http://localhost:8080/auth/users")*/
  }

}
