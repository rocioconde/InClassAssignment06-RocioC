package com.example.android.inclassassignment06_rocioc;

import java.io.Serializable;

/**
 * Created by ccteuser on 3/7/17.
 */

public class Family implements Serializable {

    private String familyLastName;
    private int numberOfMembers;
    private boolean comingToParty;

    public Family(String familyLastName, int numberOfMembers, boolean comingToParty) {
        this.familyLastName = familyLastName;
        this.numberOfMembers = numberOfMembers;
        this.comingToParty = comingToParty;
    }

    public String getFamilyLastName() {
        return familyLastName;
    }

    public void setFamilyLastName(String familyLastName) {
        this.familyLastName = familyLastName;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public boolean isComingToParty() {
        return comingToParty;
    }

    public void setComingToParty(boolean comingToParty) {
        this.comingToParty = comingToParty;
    }

    @Override
    public String toString() {
        return "Family: " + familyLastName +
                "\nNumber of Members: " + numberOfMembers +
                "\nIs this family coming to the party? " + comingToParty;
    }
}
