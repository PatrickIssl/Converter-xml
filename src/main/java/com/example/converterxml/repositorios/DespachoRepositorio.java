package com.example.converterxml.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.converterxml.model.Despacho;

@Repository
public interface DespachoRepositorio extends JpaRepository<Despacho, Long>{

}
