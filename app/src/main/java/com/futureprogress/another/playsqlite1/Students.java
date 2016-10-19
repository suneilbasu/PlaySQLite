package com.futureprogress.another.playsqlite1;

public class Students {


    private int _id;
    private String _studentname;

    public Students(){

    }


    public Students(String studentName) {
        this._studentname = studentName;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_studentname(String _studentname) {
        this._studentname = _studentname;
    }

    public int get_id() {
        return _id;
    }

    public String get_studentname() {
        return _studentname;
    }
}

