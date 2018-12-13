package org.academiadecodigo.hackathon;


import org.academiadecodigo.hackathon.Model.Biker;
import org.academiadecodigo.hackathon.Model.BikerDaoMock;

public class Main {

    public static void main(String[] args) {

        Biker biker = new Biker();

        BikerDaoMock bikerDaoMock = new BikerDaoMock();

        bikerDaoMock.saveOrUpdate("Zé");
        bikerDaoMock.saveOrUpdate("Miguel");

        bikerDaoMock.list();

    }



}
