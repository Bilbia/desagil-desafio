package br.pro.hashi.ensino.desagil.desafio;

public class Desafio {
    public static void main(String[] args) {
        Target target = new Target();
        target.row = 4;
        target.col = 14;
        System.out.println("Target: " + target.row + ", " + target.col);

        Player humanPlayer = new Player();
        humanPlayer.row = 0;
        humanPlayer.col = 0;
        System.out.println("Human: " + humanPlayer.row + ", " + humanPlayer.col);

        Player cpuPlayer = new Player();
        cpuPlayer.row = 8;
        cpuPlayer.col = 18;
        System.out.println("Cpu: " + cpuPlayer.row + ", " + cpuPlayer.col);
    }
}
