package org.academiadecodigo.hackathon.Model;

import java.util.List;

public interface BikerDao {


    void saveOrUpdate(String username);

    Biker findById(String username);

    void delete(Biker biker);

    List<Biker> list();

}
