package kr.hhplus.be.server.core.util.auditing;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EntityListeners;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Embeddable
public class BaseEntity implements Serializable {

    @CreatedBy
    @Column(name = "RGTR_ID", updatable = false)
    private String rgtrId; //등록자

    @CreatedDate
    @Column(name = "REG_DT", updatable = false)
    private LocalDateTime regDt; //등록일시

}
