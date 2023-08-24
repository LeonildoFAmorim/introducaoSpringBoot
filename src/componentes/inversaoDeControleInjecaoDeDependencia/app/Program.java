package componentes.inversaoDeControleInjecaoDeDependencia.app;

import componentes.inversaoDeControleInjecaoDeDependencia.entities.Employee;
import componentes.inversaoDeControleInjecaoDeDependencia.services.BraziTaxService;
import componentes.inversaoDeControleInjecaoDeDependencia.services.PensionService;
import componentes.inversaoDeControleInjecaoDeDependencia.services.SalaryService;
import componentes.inversaoDeControleInjecaoDeDependencia.services.TaxService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salario bruto: ");
        double grossSalary = scanner.nextDouble();
        Employee employee = new Employee(nome, grossSalary);

        //TaxService taxService = new TaxService();
        BraziTaxService braziTaxService = new BraziTaxService();
        PensionService pensionService = new PensionService();
        SalaryService salaryService = new SalaryService(braziTaxService, pensionService);

        System.out.println("Salario liquido: " + salaryService.netSalary(employee));
    }
}
