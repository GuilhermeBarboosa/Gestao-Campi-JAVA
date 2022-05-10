/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import model.Campus;

/**
 *
 * @author Aluno
 */
public class CampusView {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Scanner ler = new Scanner(System.in);
  
    public Campus criarCampus() {
        Campus campus = new Campus();
        System.out.println("Nome: ");
        campus.setNome(ler.nextLine());
        System.out.println("Abreviacao:  ");
        campus.setAbreviacao(ler.nextLine());
        System.out.println("Duração de aula: ");
        campus.setDuracaoAula(Double.parseDouble(ler.nextLine()));
        System.out.println("Data de criação do Campus: ");
        campus.setDtCriacaoCamp(LocalDate.parse(ler.nextLine(), formatter));
        System.out.println("Cidade: ");
        campus.setCidade(ler.nextLine());
        System.out.println("Bairro: ");
        campus.setBairro(ler.nextLine());
        System.out.println("Rua: ");
        campus.setRua(ler.nextLine());
        System.out.println("Cep: ");
        campus.setCep(ler.nextLine());
        campus.setDtCriacao(LocalDate.now());
        return campus;
    }

    public Campus modifCampus(Campus campusAlt) {
        System.out.println("Nome: ");
        campusAlt.setNome(ler.nextLine());
        System.out.println("Abreviacao:  ");
        campusAlt.setAbreviacao(ler.nextLine());
        System.out.println("Duração de aula: ");
        campusAlt.setDuracaoAula(Double.parseDouble(ler.nextLine()));
        System.out.println("Data de criação do Campus: ");
        campusAlt.setDtCriacaoCamp(LocalDate.parse(ler.nextLine(), formatter));
        System.out.println("Cidade: ");
        campusAlt.setCidade(ler.nextLine());
        System.out.println("Bairro: ");
        campusAlt.setBairro(ler.nextLine());
        System.out.println("Rua: ");
        campusAlt.setRua(ler.nextLine());
        System.out.println("Cep: ");
        campusAlt.setCep(ler.nextLine());
        campusAlt.setDtModificacao(LocalDate.now());
        return campusAlt;
    }

    
    
    
    ///////////////////////////////////////////////
    //SO PARA TESTES
    public Campus setAleatorio1() {
        Campus campus = new Campus();
        campus.setNome("INSTITUTO FEDERAL DE MINAS GERAIS");
        campus.setAbreviacao("IFTM");
        campus.setDuracaoAula(30);
        campus.setDtCriacaoCamp(LocalDate.parse("15/09/2000", formatter));
        campus.setCidade("Uberaba - MG");
        campus.setBairro("Jardim");
        campus.setRua("Sei La");
        campus.setCep("383213141");
        campus.setDtCriacao(LocalDate.now());
        return campus;
    }

    public Campus setAleatorio2() {
        Campus campus = new Campus();
        campus.setNome("INSTITUTO DE UBERLANDIA");
        campus.setAbreviacao("IFU");
        campus.setDuracaoAula(30);
        campus.setDtCriacaoCamp(LocalDate.parse("11/05/2000", formatter));
        campus.setCidade("Uberlandia - Minas Gerais");
        campus.setBairro("Jardim");
        campus.setRua("Sei La");
        campus.setCep("383213141");
        campus.setDtCriacao(LocalDate.now().plusDays(6));
        return campus;
    }
    
    public void mostrarTodosCampos(Campus[] campus) {
        boolean aux = false;
        for (int i = 0; i < campus.length; i++) {
            if(campus[i] != null) {
                aux = true;
            }
        }
        
        if(aux) {
            for (int i = 0; i < campus.length; i++) {
                if(campus[i] != null) {
                     System.out.println(campus[i].toString());
                }
               
            }
        } else {
            System.out.println("Não ha campus cadastrados.");
        }        
    }
    /////////////////////////////////////////////////////

}
