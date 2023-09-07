package com.booleanuk;

import java.util.ArrayList;

public class PlayerRack {
    ArrayList<Character> rack;
    int capacity = 7;

    public PlayerRack() {
        this.rack = new ArrayList<>();
    }

    public int getSize() {
        return this.rack.size();
    }

    public boolean addTile(char tile) {
        if (this.getSize() < this.capacity) {
            this.rack.add(tile);
            return true;
        } else {
            return false;
        }
    }

    public boolean findTile(char tile) {
        for (char letter: this.rack) {
            if (letter == tile) {
                return true;
            }
        }
        return false;
    }

    public void removeKnownTile(char tile) {
        this.rack.remove(Character.valueOf(tile));
    }

    public void clearRack() {
        this.rack.clear();
    }
}
