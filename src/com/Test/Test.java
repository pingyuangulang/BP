package com.Test;

import com.Exceptions.MatrixException;
import com.Network.MyBP;


public class Test {
    
    public static void main(String[] args) {
        double[][] in = {
                {1,1,1},
                {1,0,0},
                {0,1,0},
                {0,0,1},
                {1,1,0},
                {1,0,1}
        };
        double[] out = {0.6,0.3,0.2,0.1,0.5,0.4};
        MyBP myBP = new MyBP(in, out, 0.11, 6);
    
        try {
            myBP.train(20000);
        } catch (MatrixException e) {
            e.printStackTrace();
        }
        double[][] testIn = {
                {0,1,1}
        };
        double[] testOut = {0.3};
    
        try {
            myBP.forecase(testIn, testOut);
        } catch (MatrixException e) {
            e.printStackTrace();
        }
    }
}
