package com.Functions;

public class Function {
    
    /**
     * 激活函数,单个处理
     * @param x
     * @return
     */
    public static double sigmoid(double x){
        double result = 0.0;
        result = 1d/(1d+Math.exp(-x));
        return result;
    }
    
    /**
     * 激活函数，批处理,一维矩阵
     * @param x
     * @return
     */
    public static double[] sigmoid(double[] x){
        double[] result = new double[x.length];
        for (int i=0;i<x.length;i++){
            result[i] = sigmoid(x[i]);
        }
        return result;
    }
    
    /**
     * 激活函数，批处理,二维矩阵
     * @param x
     * @return
     */
    public static double[][] sigmoid(double[][] x){
        double[][] result = new double[x.length][x[0].length];
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x[0].length;j++){
                result[i][j] = sigmoid(x[i][j]);
            }
        }
        return result;
    }
    
    /**
     * 激活函数导函数，单个处理
     * @param x
     * @return
     */
    public static double deSigmoid(double x){
        double result = 0.0;
        result = (Math.exp(x))/(Math.pow(Math.exp(x)+1, 2));
        return result;
    }
    
    /**
     * 激活函数导函数，批处理，一维矩阵
     * @param x
     * @return
     */
    public static double[] deSigmoid(double[] x){
        double[] result = new double[x.length];
        for (int i=0;i<x.length;i++){
            result[i] = deSigmoid(x[i]);
        }
        return result;
    }
    
    /**
     * 激活函数导函数，批处理，二维矩阵
     * @param x
     * @return
     */
    public static double[][] deSigmoid(double[][] x){
        double[][] result = new double[x.length][x[0].length];
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x[0].length;j++){
                result[i][j] = deSigmoid(x[i][j]);
            }
        }
        return result;
    }
}
