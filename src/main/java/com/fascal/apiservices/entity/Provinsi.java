/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fascal.apiservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author fascal
 */

@Setter
@Getter
@Entity
public class Provinsi  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    @Column(name = "nama")
    private String nama;
   
    @Column(name = "negara_id")
    private String countryId;
    
    @JoinColumn (name="negara_id", insertable = false, updatable = false, referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Negara negara;
    
}