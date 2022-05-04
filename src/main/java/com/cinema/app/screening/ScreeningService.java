package com.cinema.app.screening;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ScreeningService {

    private final ScreeningRepository screeningRepository;

    public List<Screening> getScreeningsByData(LocalDateTime start, LocalDateTime end) {
        return screeningRepository.findAllByStartTimeBetween(start, end);
    }

    public List<Screening> getAllScreenings() {
        return screeningRepository.findAll();
    }

    public Screening getScreeningDetails(long screeningId) {
        Optional<Screening> screening = screeningRepository.findById(screeningId);
        if (screening.isEmpty()) {
            throw new IllegalArgumentException("No resource");
        }
        return screening.get();
    }
}
