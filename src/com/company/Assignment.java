package com.company;

/**
 * Created by Matt on 5/11/2017.
 */
public class Assignment extends Course{
    private final int ptsPossible;
    private final int ptsReceived;

    public Assignment(String courseName, int ptsPossible, int ptsReceived) {
        super(courseName);
        this.ptsPossible = ptsPossible;
        this.ptsReceived = ptsReceived;
    }
}
