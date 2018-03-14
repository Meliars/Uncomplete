package com.rivalgame.database;

import com.rivalgame.characters.Characters;

public interface DataB {
    public Characters setUp() throws Exception;
    public Characters save(Characters characters);
    public void read();
}
