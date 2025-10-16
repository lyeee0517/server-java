package kr.hhplus.be.server.util.auditing;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EntityListeners;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@EntityListeners(AuditingEntityListener.class)
@Embeddable
public class BaseModifyEntity implements Serializable {

    @LastModifiedBy
    @Column(name = "MODF_ID", insertable = false)
    private String modfId; //수정자

    @LastModifiedDate
    @Column(name = "MODF_DT", insertable = false)
    private LocalDateTime modfDt; //수정일

}
