package com.gabriel.scavassa.marvelapi.repository.comic;

import com.gabriel.scavassa.marvelapi.domain.comic.ComicDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicDateRepository extends JpaRepository<ComicDate, Integer> {

}
