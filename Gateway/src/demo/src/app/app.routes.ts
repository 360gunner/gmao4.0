import {ExtraOptions, Routes, PreloadAllModules} from '@angular/router';
import {HomeComponent} from './home/home.component';

export const APP_ROUTES: Routes = [
  {
    path: '',
   // redirectTo: 'home',
   // pathMatch: 'full'
   component: HomeComponent
  },
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: '**',
    redirectTo: 'home'
  }
]

export const APP_EXTRA_OPTIONS: ExtraOptions = {
  preloadingStrategy: PreloadAllModules
}
