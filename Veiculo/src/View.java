public class View {
    public static void main(String[] args) {
        
        Carro carro = new Carro();
       
        carro.setNome("Carro");
        carro.setModelo("Fiat");
        carro.setQuantidadeDePneus(4);
        carro.setStatus(true);
        carro.setPotencia(1.4);
        carro.setVelocidade(0);

        carro.acelerar(10);
        //System.out.println(carro.getVelocidade());

        Moto moto = new Moto();
        moto.setNome("Moto");
        moto.setModelo("Cg Fan");
        moto.setQuantidadeDePneus(2);
        moto.setCilindradas(125);
        moto.setVelocidade(0);



        Caminhao caminhao = new Caminhao();
        caminhao.setNome("Caminhao");
        caminhao.setModelo("Volvo");
        caminhao.setQuantidadeDePneus(12);
        caminhao.setEixos(3);
        caminhao.setCacamba(false);
        caminhao.setStatus(true);
        caminhao.setVelocidade(0);


        System.out.println(caminhao.getNome());
        System.out.println(caminhao.getModelo());
        System.out.println(caminhao.getEixos());
        System.out.println(caminhao.getQuantidadeDePneus());
        System.out.println(caminhao.levantarCacamba(true));
        

        
        
        // caminhão eixo
        //metodo caçamba
    }

}
