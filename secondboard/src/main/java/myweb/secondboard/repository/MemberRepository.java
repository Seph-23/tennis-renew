package myweb.secondboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myweb.secondboard.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryInterface {

}
