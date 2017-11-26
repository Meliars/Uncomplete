package com.db.databaseproject;

public class main {

    public static void main(String args[]) throws Exception {
       DBConnector dbConnector = new DBConnector();
        CharacterInfo characterInfo = new CharacterInfo();
        characterInfo.setName(characterInfo.getName());
        characterInfo.setSurname(characterInfo.getSurname());
        characterInfo.setProject(characterInfo.getProject());
        characterInfo.setGroup(characterInfo.getProject());
        characterInfo.setScore(100);
        dbConnector.setUp();
        dbConnector.saving(characterInfo);
        // hibernateUtility.reading();


    }
}
