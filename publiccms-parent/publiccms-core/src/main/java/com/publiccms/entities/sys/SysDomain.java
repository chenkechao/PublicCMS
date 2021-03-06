package com.publiccms.entities.sys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * SysDomain generated by hbm2java
 */
@Entity
@Table(name = "sys_domain")
@DynamicUpdate
public class SysDomain implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "域名")
    private String name;
    @GeneratorColumn(title = "站点", condition = true)
    private short siteId;
    @GeneratorColumn(title = "通配", condition = true)
    private boolean wild;
    @GeneratorColumn(title = "路径")
    private String path;

    public SysDomain() {
    }

    public SysDomain(String name, short siteId, boolean wild) {
        this.name = name;
        this.siteId = siteId;
        this.wild = wild;
    }

    public SysDomain(String name, short siteId, boolean wild, String path) {
        this.name = name;
        this.siteId = siteId;
        this.wild = wild;
        this.path = path;
    }

    @Id
    @Column(name = "name", unique = true, nullable = false, length = 100)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "site_id", nullable = false)
    public short getSiteId() {
        return this.siteId;
    }

    public void setSiteId(short siteId) {
        this.siteId = siteId;
    }

    @Column(name = "wild", nullable = false)
    public boolean isWild() {
        return this.wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    @Column(name = "path", length = 100)
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
