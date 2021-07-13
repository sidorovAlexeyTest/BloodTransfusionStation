package org.sidorov.station.service;

import org.sidorov.station.entity.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Service("units")
public class UnitService {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void addUnit(Unit unit){
        entityManager.merge(unit);
    }

    @Transactional
    public Unit getUnit(int id){
        return entityManager.find(Unit.class, id);
    }


    @Transactional
    public List<Unit> getAllUnits(){
        Query query = entityManager.createQuery("select a from units a", Unit.class);
        return query.getResultList();
    }

}
