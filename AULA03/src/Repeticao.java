public class Repeticao {
    public static void main(String[] args) {

    int i, j, posi, t, i2,i3;
    posi = 6;
    t = 1;
    for(i = 1; i <=3; i++){
        for(j = 1; j <= 10; j++)
            if (j == posi) {
                for(i2 = 1; i2 <= t; i2++)
                    System.out.print('*');
                t+=2;
                posi--;
                
            }else 
                 System.err.print(' ');  
            System.out.println();
    
        if(i == 3){
            t=5;
            posi =4;
            for (i3 = 1; i3 <= 4; i3++){

                for(j = 1; j <= 10; j++)
                if (j == posi) {
                    for(i2 = 1; i2 <= t; i2++)
                        System.out.print('*');
                    t+=2;
                    posi--;
                    
                }else 
                    System.err.print(' ');  
                System.out.println();
           }
           
                if(i3 == 5){
                    t=7;
                    posi =3;
                    for (i3 = 1; i3 <= 4; i3++){

                        for(j = 1; j <= 10; j++)
                        if (j == posi) {
                            for(i2 = 1; i2 <= t; i2++)
                                System.out.print('*');
                            t+=2;
                            posi--;
                            
                        }else 
                            System.err.print(' ');  
                        System.out.println();
                    }
                }
        } 
  
    }

  }
}

    



    // for ( i = 0; i < 3; i++) {
    //     for ( int j = 0; j < 4 - 1; j++) {
    //         System.out.print(" ");
    //     }
    //     System.out.println("***");
    // }

    


        // int contador=0; // i ou j
        // for(contador = 0; contador < 100; contador+=2 ){
        //     System.out.println(contador);
        // }

    //     while (contador < 10) {
    //         System.out.println(contador);
    //         contador++;
    //     }

    /**
     *          *
     *         ***
     *       ******
     *      ********
     */