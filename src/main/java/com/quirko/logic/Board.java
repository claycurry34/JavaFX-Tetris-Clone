package com.quirko.logic;

public interface Board {

    boolean moveBrickDown();


    boolean moveBrickLeft();

    boolean moveBrickRight();

    boolean rotateRightBrick();

    boolean createNewBrick();

    int[][] getBoardMatrix();

    ViewData getViewData();

    void mergeBrickToBackground();

    ClearRow clearRows();

    Score getScore();

    void newGame();
}
