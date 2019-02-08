package com.shasta;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	    //first command-line argument is the port
        int port = Integer.parseInt(args[0]);
        try {
            // create a server, listen on supplied port
            TelnetServer ts = new TelnetServer(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


