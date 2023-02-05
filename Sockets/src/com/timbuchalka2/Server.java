package com.timbuchalka2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

public class Server implements AutoCloseable {

    private final ServerSocket server;
    private static final String[] bdTables = {"camas", "pacientes", "medicos", "pacientes_medicos"};

    public Server(String host, int port, int backlogConnectionQueueLength) throws UnknownHostException, IOException {
        server = new ServerSocket(port, backlogConnectionQueueLength, InetAddress.getByName(host));
        System.out.println(Thread.currentThread() + " Created Server");
    }

    public void start() {
        System.out.println(Thread.currentThread() + " Server Ready: " + server);
        while (true) {
            acceptAndHandleClient(server);
        }
    }

    private void acceptAndHandleClient(ServerSocket server) {
        System.out.println(Thread.currentThread() + " Waiting for Incoming connections...");
        try (Socket clientSocket = server.accept()) {
            handleNewClient(clientSocket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String realizarConsulta(String line) {
        String response = "consulta errónea";

        List<String> bdTablesList = Arrays.asList(bdTables);

        String[] parts = line.split(":");

        if (parts[0].equalsIgnoreCase("consulta") && bdTablesList.contains(parts[1].toLowerCase())) {

            try {
                Conexion c = new Conexion("Hospital");

                Statement ejecutar = c.getConexion().createStatement();

                ResultSet result = ejecutar.executeQuery("SELECT " + parts[2] + " from " + parts[1]);

                if (result.next()) {

                    if (parts[2].contains("fecha")) {
                        response = String.valueOf(result.getDate(1));
                    } else {
                        if (parts[2].contains("id") && !parts[2].contains("apellido")) {

                            response = String.valueOf(result.getInt(1));
                        } else {
                            response = result.getString(1);
                        }
                    }
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e2) {
                System.out.println(e2.getMessage());
            }

        }
        System.out.println("Response: " + response);
        return response;

    }

    private void handleNewClient(Socket clientSocket) throws IOException {
        System.out.println(Thread.currentThread() + " Received Connection from " + clientSocket);
        BufferedReader is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintStream os = new PrintStream(clientSocket.getOutputStream());
        // echo that data back to the client, except for QUIT.
        String line = null;

        while ((line = is.readLine()) != null) {
            if (line.equalsIgnoreCase("QUIT")) {
                os.println("Hasta la próxima");
                break;
            } else {
                System.out.println(Thread.currentThread() + " Server echoing line back => " + line);
                String response = realizarConsulta(line);
                os.println(response);
                os.flush();
            }
        }
        System.out.println(Thread.currentThread() + " Server Closing Connection by Sending => Ok");
        os.println("Ok");
        os.flush();
        is.close();
        os.close();
    }

    public void close() throws IOException {
        server.close();
    }

    public static void main(String[] args) {
        try (Server server = new Server("localhost", 8080, 50)) {
            server.start();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void getVowels(char aChar, String aString){
        System.out.print("Your string has the following vowels: ");
        for (int i = 0; i < aString.length(); i++){
            if ((aString.charAt(i) == 'a') || (aString.charAt(i) == 'e') || (aString.charAt(i) == 'i') || (aString.charAt(i) == 'o') || (aString.charAt(i) == 'u')) {
                aChar = aString.charAt(i);
                System.out.print(aChar + " ");
            }
            char vowel = 'a';
            char vowels[] = {'a','b'};

            if((vowel == 'a') || (vowel == 'e') || (vowel == 'i') || (vowel == 'o') || (vowel == 'u') )
        }
    }
}