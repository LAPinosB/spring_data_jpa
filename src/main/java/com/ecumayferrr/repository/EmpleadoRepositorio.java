package com.ecumayferrr.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.ecumayferrr.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long>{
	
	Optional<Empleado> findByFullName(String fullName);
    Optional<Empleado> findByFullNameAndBirthDate(String fullName, LocalDate birthDate);
    List<Empleado> findAllByBirthDateAfter(LocalDate birthDate);
    List<Empleado> findAllByBirthDateBetween(LocalDate min, LocalDate max);
    List<Empleado> findAllByMarriedTrue();
    List<Empleado> findAllByMarriedFalse();

}
