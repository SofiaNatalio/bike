package org.academiadecodigo.hackathon.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class BikerDaoMock implements BikerDao {

    private HashMap<String,Biker> bikerMap = new HashMap();


    @Override
    public void saveOrUpdate(String username) {

        bikerMap.put(username, new Biker());
    }

    @Override
    public Biker findById(String username) {
       return bikerMap.get(username);
    }

    @Override
    public void delete(Biker biker) {
        return;
    }

    @Override
    public List<Biker> list() {

        List<Biker> bikerList = new ArrayList<Biker>(bikerMap.values());

        System.out.println(bikerList);
        return bikerList;
    }
}
