public class Main {

    public static void main(String[] args) {

        VeiculoFactory factory = new VeiculoFactory();

        Veiculo carro = factory.criarVeiculo("carro");
        carro.tipo();


        Veiculo bicicleta = factory.criarVeiculo("bicicleta");
        bicicleta.tipo();

    }

   
}
