package com.cinema.app.screening;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface ScreeningRepository extends JpaRepository<Screening, Long> {

    List<Screening> findAllByStartTimeBetween(LocalDateTime start, LocalDateTime end);
}
