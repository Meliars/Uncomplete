package com.rivalgame.database;

import com.rivalgame.characters.Characters;

public interface DataB {
    public void setUp() throws Exception;
    public void save(Characters characters);
    public void read();
}
