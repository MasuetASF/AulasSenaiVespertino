import { Component} from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent{
  title = 'senai';

  constructor(){}
  public modelo = '';

  numA:Number=0;
  numB:Number=0;
  valorTotal:Number=0;

  Enviar(inputModelo: String) {
    alert('Parabéns veiculo ' + inputModelo +' cadastrado!!');
  }

  Somar(a:String, b:String){
     return this.valorTotal = Number(this.numA) + Number(this.numB);
  }
  
}
