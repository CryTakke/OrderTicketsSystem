package com.litesky.dao;

import com.litesky.model.Line;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface LineDao extends CrudRepository<Line,Long>{
    List<Line> findByStationsLike(String station);

    List<Line> findByStationsContainingAndStatrtingDate(String station, Date date);

    Line findById(Long id);

    Line deleteById(Line line);

}
