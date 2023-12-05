package br.com.unisc.project.backend;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class LoginPasswordController {

    public void initializeParser(String nome, String sobrenome, String setor, Date date, JTextArea textAreaLogin, JTextArea textAreaPassword) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String data = dateFormat.format(date);
        saveTextInFile(nome, sobrenome, setor, data);

        try {
            Scanner scanner = new Scanner(new FileReader("src/main/java/br/com/unisc/project/backend/files/entrada.txt"));
            ParserLogin parserLogin = new ParserLogin(scanner);
            parserLogin.parse();

            scanner = new Scanner(new FileReader("src/main/java/br/com/unisc/project/backend/files/entrada.txt"));
            ParserPassword parserPassword = new ParserPassword(scanner);
            parserPassword.parse();

            setValuesInTextoArea(textAreaPassword, "src/main/java/br/com/unisc/project/backend/files/PasswordGenereted");
            setValuesInTextoArea(textAreaLogin, "src/main/java/br/com/unisc/project/backend/files/LoginGenereted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setValuesInTextoArea(JTextArea textArea, String url) {
        try {
            textArea.setEditable(true);
            textArea.setText("");
            BufferedReader br = new BufferedReader(new FileReader(url));
            String linha;

            while ((linha = br.readLine()) != null) {
                textArea.append(linha + "\n");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        textArea.setEditable(false);
    }

    private void saveTextInFile(String nome, String sobrenome, String setor, String data) {
        try {
            // Cria um objeto FileWriter para escrever no arquivo
            FileWriter fileWriter = new FileWriter("src/main/java/br/com/unisc/project/backend/files/entrada.txt");

            // Cria um objeto BufferedWriter para escrever de forma mais eficiente
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(nome.concat(getFormat()).concat(sobrenome).concat(getFormat()).concat(setor).concat(getFormat()).concat(data));

            // Fecha os recursos para liberar os recursos do sistema
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("As informações foram salvas no arquivo com sucesso.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFormat() {
        return " + ";
    }

}
