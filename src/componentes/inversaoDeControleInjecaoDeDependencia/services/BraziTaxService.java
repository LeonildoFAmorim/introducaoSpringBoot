package componentes.inversaoDeControleInjecaoDeDependencia.services;

public class BraziTaxService extends TaxService{

    @Override
    public double tax(double amount) {
        return amount * 0.3;
    }
}
