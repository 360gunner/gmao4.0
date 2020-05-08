import {Component, OnInit, ViewEncapsulation} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import { LoginService } from './../login.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class HomeComponent implements OnInit {

  constructor(
//    private route: ActivatedRoute,
    private service: LoginService,
    private router: Router
              ) {}

              ngOnInit() {
               // this.needsLogin = !!this.route.snapshot.params['needsLogin'];
              }

/*  needsLogin: boolean;
 _userName: string = '';

  ngOnInit() {
    this.needsLogin = !!this.route.snapshot.params['needsLogin'];
  }
  get userName(): string {
    return this._userName;
  }
*/
  logout(): void {
    this.service.logout();
  }

  login(event: Event) {
    this.router.navigate(['http://localhost:8080/login']);
  }


}
