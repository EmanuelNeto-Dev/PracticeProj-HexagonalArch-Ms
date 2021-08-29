package com.ms.msmail.models;

import com.ms.msmail.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
