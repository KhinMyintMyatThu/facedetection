package com.example.facedetection;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class Sender extends AsyncTask<List<Double>, Void, Void> {
    Socket s;
    ObjectOutputStream objectOutputStream;
   // DataOutputStream dataOutputStream;


    @Override
    protected Void doInBackground(List<Double>... voids) {
        System.out.print("win tl");
        List<Double> imageData= voids[0];
        try{
            s=new Socket("192.168.99.173", 6666);
//            pw = new PrintWriter(s.getOutputStream());
//            pw.write(imageData);
//            pw.flush();
//            pw.close();
            objectOutputStream = new ObjectOutputStream(s.getOutputStream());
            objectOutputStream.writeObject(imageData);
            objectOutputStream.flush();
           // objectOutputStream.close();
//            dataOutputStream = new DataOutputStream(s.getOutputStream());
//            dataOutputStream.writeUTF("hello");
//            dataOutputStream.flush();
//            dataOutputStream.close();

          //  s.close();

        }catch (Exception e){

        }


        return null;
    }
}
