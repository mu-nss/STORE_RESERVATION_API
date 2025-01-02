package com.zerobase.store_reservation_api.member.domain;

import com.zerobase.store_reservation_api.core.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;          // 회원 아이디
    private String memberName;      // 회원 이름
    private String memberEmail;     // 회원 이메일
    private String memberPassword;  // 회원 비밀번호
    private String memberPhone;     // 회원 연락처
    private int memberRoles;        // 회원 권한(일반회원, 점장)
}
