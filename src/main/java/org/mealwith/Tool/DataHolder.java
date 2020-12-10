package org.mealwith.Tool;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class DataHolder {

    private final static DataHolder INSTANCE = new DataHolder();

    private DataHolder(){};

    private ArrayList<Object> list = new ArrayList<>();

     public static DataHolder getINSTANCE(){
        return INSTANCE;
    }

    public void setList(ArrayList<Object> list){
         this.list = list;
    }

    public ArrayList<Object> getList(){
         return list;
    }
}
