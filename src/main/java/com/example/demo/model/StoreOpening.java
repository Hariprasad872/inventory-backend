package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "store_openings")
@Data
public class StoreOpening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String outlet;
    private String zone;
    
    private Date handoverDate;
    private Integer daysLeft;
    private Date posCctvInstallationDate;
    private Date storeLiveDate;
    
    private String mobileSim;
    private String emailId;
    private String internetStatus;
    private String samsungDmb;
    private String cctvStatus;
    private String systemStatus;
    private String finalRemark;
}