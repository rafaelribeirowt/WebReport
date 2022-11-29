import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { UsuarioComponent } from './usuario/usuario.component';



const appRoutes: Routes = [
  { path: 'home', 
  loadChildren: () => import('./home/home.module').then(m => m.HomeModule)
  
},
  { path: 'usuario', loadChildren: () => import('./usuario/usuario.module').then(m => m.UsuarioModule) },

  
  { path: '',  pathMatch: 'full', redirectTo: '/home' }
 
];



@NgModule({
  imports: [RouterModule.forRoot(appRoutes, { enableTracing: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }