package com.bookambulance.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bookambulance.Model.Location;
public interface LocationRepository extends JpaRepository<Location,Long>{
    List<Location> findByType(String string);
}
