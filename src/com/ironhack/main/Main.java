package com.ironhack.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Interns capelloCeleste = new Interns("Celeste", "Capello", 33, 16000, "administrativa");
        Interns miguelAngel = new Interns("Miguel", "Angel", 35, 18000, "administrativa");
        Interns estebanQuito = new Interns("Esteban", "surname", 45, 25000, "administrativa");
        Interns ezequielRamirez = new Interns("Ezequiel", "surname", 28, 16000, "administrativa");
        Interns pedroValencia = new Interns("Pedro", "surname", 51, 12000, "administrativa");
        Interns camilaBornodaba = new Interns("Camila", "surname", 29, 28000, "administrativa");
        Interns carlaVarela = new Interns("Carla", "surname", 46, 21000, "administrativa");
        Interns emmanuelCasanovas = new Interns("Emmanuel", "surname", 41, 19000, "administrativa");
        Interns armandoParedez = new Interns("Armando", "surname", 35, 21000, "administrativa");
        Interns francoisPele = new Interns("Francois", "surname", 36, 13000, "administrativa");

        String[] Interns = {String.valueOf(capelloCeleste) + "\n", String.valueOf(miguelAngel) + "\n",
                String.valueOf(pedroValencia) + "\n", String.valueOf(carlaVarela) + "\n", String.valueOf(emmanuelCasanovas) + "\n",
                String.valueOf(estebanQuito) + "\n", String.valueOf(francoisPele + "\n"), String.valueOf(armandoParedez) + "\n",
                String.valueOf(ezequielRamirez) + "\n", String.valueOf(camilaBornodaba)};

        File file = new File("employees.txt");
        FileWriter writer = new FileWriter("employees.txt", false);

        writer.write(Arrays.toString(Interns));
        writer.close();
    }
}