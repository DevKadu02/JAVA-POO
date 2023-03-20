package pooava1;

import java.util.Scanner;

public class Computador {

    public int gbmemoria;
    public float ghzcpu;
    public float gbhd;
    public boolean placadevideo;
    public String modelopm;
    Scanner sc = new Scanner (System.in);
    public Computador() {
        /*this.gbmemoria = 4;
        this.ghzcpu = 1.90f;
        this.gbhd = 930.0f;
        this.placadevideo = true;
        this.modelopm = "Machinist x 79";*/

    }

    public Computador(int gbmemoria, float ghzcpu, float gbhd, boolean placadevideop, String modelopm) {
        this.gbmemoria = gbmemoria;
        this.gbhd = gbhd;
        this.ghzcpu = ghzcpu;
        this.placadevideo = placadevideo;
        this.modelopm = modelopm;
    }

    public void setGbmemoria(int gbmemoria) {
        this.gbmemoria = gbmemoria;

    }

    public void setGhzcpu(float ghzcpu) {
        this.ghzcpu = ghzcpu;

    }

    public void setGbhd(float gbhd) {
        this.gbhd = gbhd;

    }

    public void setPlacadevideo(Boolean placadevideo) {
        this.placadevideo = placadevideo;

    }

    public void setModelopm(String modelopm) {
        this.modelopm = modelopm;

    }

    public int getGbmemoria() {
        return gbmemoria;
    }

    public float getGhzcpu() {
        return ghzcpu;
    }

    public float getGbhd() {
        return gbhd;
    }

    public Boolean getPlacadevideo() {
        return placadevideo;
    }

    public String getModelopm() {
        return modelopm;
    }
    public void Entrada(){
        System.out.println("Quanto de memoria: ");
        setGbmemoria (sc.nextInt());
        System.out.println("Qual frequencia do processador: ");
        setGhzcpu (sc.nextFloat());
        System.out.println("Tem placa de video: ");
        setPlacadevideo (sc.nextBoolean());
        System.out.println("Quanto GB tem: ");
        setGbhd (sc.nextFloat());
        System.out.println("Qual placa mae: ");
        setModelopm (sc.next());
        System.out.println("===============================================");  
        
    }
    public void imprimir() {
        System.out.println("-------------------------------------");
        System.out.println(" A quantidade memoria e: " + gbmemoria);
        System.out.println("O computador tem como frequencia de processador: " + this.ghzcpu);
        System.out.println("A quantidade de GB do HD e: " + this.gbhd);
        System.out.println("O computador tem placa de video? " + this.placadevideo);
        System.out.println("O modelo da maquina e: " + this.modelopm);
        System.out.println("-------------------------------------");

    }

}
