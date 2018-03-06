package com.rivalgame.characters;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface CharactersRepository extends CrudRepository <Characters, Long> {
}
