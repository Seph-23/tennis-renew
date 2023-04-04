package myweb.secondboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myweb.secondboard.domain.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
