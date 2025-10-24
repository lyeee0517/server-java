package kr.hhplus.be.server.core.util.auditing;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreatedDate
    @Column(name = "REG_DT", nullable = false, updatable = false)
    private LocalDateTime regDt; //등록일시

    @LastModifiedDate
    @Column(name = "MODF_DT", nullable = false, insertable = false)
    private LocalDateTime modfDt; //수정일

}
