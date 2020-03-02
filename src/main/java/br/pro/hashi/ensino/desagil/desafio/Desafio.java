package br.pro.hashi.ensino.desagil.desafio;

import br.pro.hashi.ensino.desagil.desafio.model.Board;
import br.pro.hashi.ensino.desagil.desafio.model.Model;
import br.pro.hashi.ensino.desagil.desafio.model.Player;
import br.pro.hashi.ensino.desagil.desafio.model.Target;

import java.io.IOException;

public class Desafio {

    // Ignore o "throws IOException" por enquanto.
    // Esse trecho será explicado em aulas futuras.
    public static void main(String[] args) throws IOException {
        Model model = new Model();

        Board board = model.getBoard();
        for (int i = 0; i < board.getNumRows(); i++) {
            for (int j = 0; j < board.getNumCols(); j++) {
                if (board.isWall(i, j)) {
                    System.out.print('#');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        Target target = model.getTarget();
        System.out.println("Target: " + target.getRow() + ", " + target.getCol());

        Player humanPlayer = model.getHumanPlayer();
        System.out.println("Human: " + humanPlayer.getRow() + ", " + humanPlayer.getCol());

        Player cpuPlayer = model.getCpuPlayer();
        System.out.println("Cpu: " + cpuPlayer.getRow() + ", " + cpuPlayer.getCol());
    }
}
