/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fascal.apiservices.controller;


import com.fascal.apiservices.common.ResponseContent;
import com.fascal.apiservices.common.ResponseResult;
import com.fascal.apiservices.entity.Negara;
import com.fascal.apiservices.repository.service.NegaraService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fascal
 */
@Slf4j
@RestController
@RequestMapping("negara")
public class NegaraController {
    
    @Autowired
    private NegaraService negaraService;
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity findAll(Pageable pageable) {
        return ResponseEntity.ok(ResponseContent.builder()
                .result(ResponseResult.SUCCESS)
                .timestamp(System.currentTimeMillis())
                .message("Success Find All Negara")
                .data(negaraService.findAll(pageable))
                .build()
        );
    }
    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(ResponseContent.builder()
                .result(ResponseResult.SUCCESS)
                .timestamp(System.currentTimeMillis())
                .message("Success Find By Id Negara")
                .data(negaraService.findById(id))
                .build()
        );
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity create(@RequestBody @Validated Negara negara) {
        return ResponseEntity.ok(ResponseContent.builder()
                .result(ResponseResult.SUCCESS)
                .timestamp(System.currentTimeMillis())
                .message("Success Create Negara")
                .data(negaraService.create(negara))
                .build()
        );
    }

    @PutMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity update(@PathVariable("id") Long id, @RequestBody @Validated Negara negara) {
        return ResponseEntity.ok(ResponseContent.builder()
                .result(ResponseResult.SUCCESS)
                .timestamp(System.currentTimeMillis())
                .message("Success Update Negara")
                .data(negaraService.update(id, negara))
                .build()
        );
    }

    @DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(ResponseContent.builder()
                .result(ResponseResult.SUCCESS)
                .timestamp(System.currentTimeMillis())
                .message("Success Delete Negara")
                .data(negaraService.delete(id))
                .build()
        );
    }
}
