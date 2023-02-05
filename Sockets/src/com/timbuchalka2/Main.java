package com.timbuchalka2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException{

        ServerSocket serverSock = null;
        try{
            serverSock = new ServerSocket(8899);
        }catch(IOException ioException){
            System.out.println("Cant listen on port 8899");
            System.exit(1);
        }

        Socket clientSock = null;
        System.out.println("Listening for connection..");

        try{
            clientSock = serverSock.accept();
        }catch(IOException ioException){
            System.out.println("Accept Failed");
            System.exit(1);
        }

        System.out.println("Connection successful");
        System.out.println("Listening for input");

        PrintWriter output = new PrintWriter(clientSock.getOutputStream(),true);
        BufferedReader input = new BufferedReader(new InputStreamReader(clientSock.getInputStream()));

        String inputLine;

        while((inputLine = input.readLine()) != null){
            System.out.println("Server: " + inputLine);
            output.println(inputLine);

            if (inputLine.equals("bye")){
                break;
            }
        }

        output.close();
        input.close();
        clientSock.close();
        serverSock.close();

	// write your code here
    }
}
