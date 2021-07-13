package org.sidorov.station.dao;

import org.sidorov.station.entity.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.text.SimpleDateFormat;
import java.util.List;

@Repository
public class UnitDAO {



//    public void addUnit(Unit unit){
//        entityManager.merge(unit);
//    }
//
//    public Unit getUnit(int id){
//        return entityManager.find(Unit.class, id);
//    }
//
//    public List<Unit> getAllUnits(){
//        Query query = entityManager.createQuery("select a from unit a", Unit.class);
//        return query.getResultList();
//    }
//
//    private Unit createDefaultUnit(){
//        Unit unit = new Unit(Integer.MAX_VALUE, "default", "default", new SimpleDateFormat("dd.MM.yyyy").format(System.currentTimeMillis()));
//        return unit;
//    }
}
