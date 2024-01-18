public class VeiculoFactory {

    public static Veiculo criarVeiculo(String tipo) {
        if (tipo.equalsIgnoreCase("carro")) {
            return new Carro();
        } else if (tipo.equalsIgnoreCase("bicicleta")) {
            return new Bicicleta();
        }
        return null;
    }
}
