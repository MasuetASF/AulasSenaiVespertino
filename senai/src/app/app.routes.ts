import { Routes, RouterModule } from '@angular/router';
import { MenuComponent } from './pages/menu/menu.component';
import { NgModule } from '@angular/core';
import { CadastrarveiculoComponent } from './pages/cadastrarveiculo/cadastrarveiculo.component';

export const routes: Routes = [

    {path: '', component: MenuComponent,},
    {path: 'cadastrarveiculo', component: CadastrarveiculoComponent}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {}