package com.zerobase.store_reservation_api.member.repository;

import com.zerobase.store_reservation_api.member.domain.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
