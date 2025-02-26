package bukiet.connect4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectBoardTest {
    @Test
    public void isFull() {
        ConnectBoard board = new ConnectBoard(6, 7);

        board.insert('y', 0);
        board.insert('y', 0);
        board.insert('y', 0);
        board.insert('y', 0);
        board.insert('y', 0);
        board.insert('y', 0);


        assertTrue(board.isFull(0));
    }

    @Test
    public void insert() {
        ConnectBoard board = new ConnectBoard(6, 7);


        board.insert('y', 1);
        assertEquals('y', board.board[5][1]);

    }


    @Test
    public void calculateWinner() {
        ConnectBoard board = new ConnectBoard(6, 7);


        board.insert('r', 0);
        board.insert('y', 1);
        board.insert('y', 2);
        board.insert('y', 3);
        board.insert('r', 1);
        board.insert('y', 2);
        board.insert('r', 2);
        board.insert('y', 3);
        board.insert('y', 3);
        board.insert('r', 3);
        assertEquals('r', board.calculateWinner());
    }


}