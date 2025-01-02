package com.zerobase.store_reservation_api.core.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@Builder(builderMethodName = "doesNotUseThisBuilder")
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    /**
     * 각 테이블에서 공통적으로 가지고 있는 컬럼
     */
    @CreatedDate
    private LocalDateTime createdAt; // 생성시간
    @LastModifiedDate
    private LocalDateTime updatedAt; // 수정시간
}
