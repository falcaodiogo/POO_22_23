package aula06;

import java.util.*;

import utils.Input;

public class Ex2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa(null, 0, null);
        DateYMD d = new DateYMD(0, 0, 0);
        HashMap<Pessoa, String> contactos = new HashMap<Pessoa, String>();
        int op, day, month, year;
        
        String menu =  "1 - Inserir contacto\n" +
                       "2 - Alterar contacto\n" +
                       "3 - Apagar contacto\n" +
                       "4 - Procurar contacto\n" +
                       "5 - Listar contacto\n" +
                       "0 - Sair\n";

        System.out.println(menu);


        do {

            op = Input.inputInt("Option: ", sc);
            
            switch (op) {

                case 1:   
                
                    System.out.println("A inserir contacto");

                    String nome = Input.inputString("Nome: ", sc);
                    int cc = Input.inputInt("CC: ", sc);
                    System.out.println("Data de Nascimento: ");

                    do {       
                        day = Input.inputInt("Dia: ", sc);  
                        month = Input.inputInt("Mês: ", sc);  
                        year = Input.inputInt("Ano: ", sc); 
                        d = new DateYMD(day, month, year);
                    } while (!DateYMD.validDate(day, month, year));

                    p = new Pessoa(nome, cc, d);

                    if (contactos.containsKey(p)) {
                        System.out.println("NOTA: O contacto já existe!");
                    } else {
                        contactos.put(p, null);
                    }
                    contactos.forEach((k, v) -> System.out.println(k + " " + v));

                    break;

                case 2:

                    System.out.println("A alterar contacto");
                    // remove o contacto e adiciona um novo
                    // String nome2 = Input.inputString("Nome: ", sc);
                    // int cc2 = Input.inputInt("CC: ", sc);
                    // if (contactos.containsKey(p)) {
                    //     contactos.remove(p);
                    //     System.out.println("Contacto removido com sucesso!");
                    // } else {
                    //     System.out.println("Contacto não encontrado!");
                    // }                    
                    // break;

                case 3:
                    System.out.println("A apagar contacto");
                    // remove o contacto
                    // String nome3 = Input.inputString("Nome: ", sc);
                    // int cc3 = Input.inputInt("CC: ", sc);
                    // if (contactos.containsKey(p)) {
                    //     contactos.remove(p);
                    //     System.out.println("Contacto removido com sucesso!");
                    // } else {
                    //     System.out.println("Contacto não encontrado!");
                    // }
                    // break;

                case 4:
                    System.out.println("A procurar contacto");
                    // procura o contacto
                    // String nome4 = Input.inputString("Nome: ", sc);
                    // int cc4 = Input.inputInt("CC: ", sc);
                    // if (contactos.containsKey(p)) {
                    //     System.out.println("Contacto encontrado!");
                    //     System.out.println(contactos.get(p));
                    // } else {
                    //     System.out.println("Contacto não encontrado!");
                    // }
                    // break;

                case 5:
                    System.out.println("A listar contactos");
                    // lista todos os contactos
                    contactos.forEach((k, v) -> System.out.println(k + " " + v));
                    break;

                case 0:
                    break;
            
                default:
                    System.out.println("\nOpção errada.\n");
                    System.out.println(menu);
                    break;
            }
        
        } while (op != 0);

        System.out.println("Exiting... ");

        sc.close();
    }
    
}
