/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.CampusDAO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import model.Campus;
import model.Servidor;

/**
 *
 * @author Usuario
 */
public class ServidorView {

    Scanner ler = new Scanner(System.in);

    public Servidor criarServ(CampusDAO campusDAO) {
        String campusRead = "";
        Servidor serv = new Servidor();
        System.out.println("Nome: ");
        serv.setNome(ler.nextLine());
        System.out.println("Email: ");
        serv.setEmail(ler.nextLine());
        System.out.println("Cargo: ");
        serv.setCargo(ler.nextLine());
        System.out.println("Login: ");
        serv.setLogin(ler.nextLine());
        System.out.println("Senha: ");
        serv.setSenha(ler.nextLine());
        System.out.println("Perfil(1-ADM | 2-COMUM : ");
        serv.setPerfil(Integer.parseInt(ler.nextLine()));
        
        
        
        Campus[] campusAll = campusDAO.getAll();
        for (Campus campus : campusAll) {
            if (campus != null) {
                campusRead += "ID: " + campus.getId() + " - NOME: " + campus.getNome() + "\n";
            }
        }
        System.out.println(campusRead);
        System.out.println("Escolha pelo id um campus:");
        Campus campusAux = campusDAO.getId(Integer.parseInt(ler.nextLine()));
        serv.setCampus(campusAux);

        serv.setDtCriacao(LocalDate.now());
        return serv;
    }

    public Servidor modifServ(Servidor servAlt, CampusDAO campusDAO) {
        String campusRead = "";
        System.out.println("Nome: ");
        servAlt.setNome(ler.nextLine());
        System.out.println("Email: ");
        servAlt.setEmail(ler.nextLine());
        System.out.println("Cargo: ");
        servAlt.setCargo(ler.nextLine());
        System.out.println("Login: ");
        servAlt.setLogin(ler.nextLine());
        System.out.println("Senha: ");
        servAlt.setSenha(ler.nextLine());
        System.out.println("Perfil(1-ADM | 2-COMUM : ");
        servAlt.setPerfil(Integer.parseInt(ler.nextLine()));
        
        
         Campus[] campusAll = campusDAO.getAll();
        for (Campus campus : campusAll) {
            if (campus != null) {
                campusRead += "ID: " + campus.getId() + " - NOME: " + campus.getNome() + "\n";
            }
        }
        System.out.println(campusRead);
        System.out.println("Escolha pelo id um campus:");
        Campus campusAux = campusDAO.getId(Integer.parseInt(ler.nextLine()));
        servAlt.setCampus(campusAux);

        servAlt.setDtModificacao(LocalDate.now());
        return servAlt;
    }

    public void mostrarTodosServidores(Servidor[] servVet, CampusDAO campusDAO) {
        boolean aux = false;
        String responseString = "";
        for (int i = 0; i < servVet.length; i++) {
            if (servVet[i] != null) {
                aux = true;
            }
        }
        if (aux) {
            for (int i = 0; i < servVet.length; i++) {
                if (servVet[i] != null) {
                    System.out.println(servVet[i].toString());
                }
            }
            System.out.println(responseString);
        } else {
            System.out.println("Não ha servidores cadastrados.");
        }
    }

    
    public Servidor setAleatorio2() {
        CampusDAO campusDAO = new CampusDAO();
        Campus campusAux = campusDAO.getId(0);
        
        Servidor serv = new Servidor();
        serv.setNome("Carol");
        serv.setEmail("carol@gmail.com");
        serv.setCargo("tae");
        serv.setLogin("admin");
        serv.setSenha("admin");
        serv.setCampus(campusAux);
        serv.setPerfil(1);
        serv.setDtCriacao(LocalDate.now());
        return serv;
    }

    public Servidor setAleatorio1() {
         CampusDAO campusDAO = new CampusDAO();
        Campus campusAux = campusDAO.getId(0);
        
        Servidor serv = new Servidor();
        serv.setNome("Julia");
        serv.setEmail("julia@gmail.com");
        serv.setCargo("pebtt");
        serv.setLogin("comum");
        serv.setSenha("comum");
        serv.setCampus(campusAux);
        serv.setPerfil(2);
        serv.setDtCriacao(LocalDate.now());
        return serv;
    }

    public Servidor setAleatorio4() {
         CampusDAO campusDAO = new CampusDAO();
        Campus campusAux = campusDAO.getId(1);
        
        Servidor serv = new Servidor();
        serv.setNome("Gabriela");
        serv.setEmail("gabriela@gmail.com");
        serv.setCargo("tae");
        serv.setLogin("admin");
        serv.setSenha("admin");
        serv.setCampus(campusAux);
        serv.setPerfil(1);
        serv.setDtCriacao(LocalDate.now());
        return serv;
    }

    public Servidor setAleatorio3() {
         CampusDAO campusDAO = new CampusDAO();
        Campus campusAux = campusDAO.getId(1);
        
        Servidor serv = new Servidor();
        serv.setNome("Maria");
        serv.setEmail("maria@gmail.com");
        serv.setCargo("pebtt");
        serv.setLogin("comum");
        serv.setSenha("comum");
        serv.setCampus(campusAux);
        serv.setPerfil(2);
        serv.setDtCriacao(LocalDate.now());
        return serv;
    }


}
