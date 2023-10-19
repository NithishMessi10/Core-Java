package com.xworkz.gameapp.game;

public class Game {
    public String gameName;
    public int noOfPlayers;

    public void rules() {
        System.out.println("Game must have set of rules and everyone should follow it");
    }

    public boolean rules(String gameName, int noOfPlayers) {
        this.gameName = gameName;
        this.noOfPlayers = noOfPlayers;
        boolean isAllowed = false;
        if (gameName == "Football") {
            System.out.println("Show the rules of the Football");
            if (noOfPlayers > 6) {
                System.out.println("If we have more than 6 members then its must be played outside");
                isAllowed = true;
            } else {
                System.out.println("You are violating the rules and it is against rules");
            }
        } else {
            System.out.println("You are searching for another sport it will be updated in next update");
        }
        return isAllowed;
    }
}
