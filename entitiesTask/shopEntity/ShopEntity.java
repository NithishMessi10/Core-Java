package com.xworkz.entitiesTask.shopEntity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shops")
@Data
@AllArgsConstructor
public class ShopEntity {
    @Id
    @Column(name = "shop_id")
    private int shopId;
    @Column(name ="shop_name")
    private String shopName;
    @Column(name = "shop_license_no")
    private String shopLicenseNo;
    @Column(name ="shop_type")
    private String shopType;
    @Column(name = "shop_owner_name")
    private String shopOwnerName;

}
