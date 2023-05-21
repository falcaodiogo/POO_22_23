package ATPX;

import utils.Input;

public class LibraryItem {

    protected String title;
    protected int id;
    protected boolean availability;
    protected String userName;

    public LibraryItem(String title, int id, boolean availability, String username) {
        this.title = title;
        this.id = id;
        this.availability = availability;
        this.userName = username;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public void setId(int i) {
        if (Input.isInt(Integer.toString(i)))
            this.id = i;
    }

    public void setAvailability(boolean a) {
        if (a == true || a == false)
            this.availability = a;
    }

    public void setUserName(String u) {
        this.userName = u;
    }

    @Override
    public String toString() {
        return "Title: " + title + " ,id: " + id + " ,availability:" + availability + " ,username: " + userName;
    }

}
