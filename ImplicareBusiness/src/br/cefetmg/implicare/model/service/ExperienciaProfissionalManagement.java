/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.implicare.model.service;

import br.cefetmg.implicare.model.domain.ExperienciaProfissional;
import br.cefetmg.implicare.model.exception.BusinessException;
import br.cefetmg.implicare.model.exception.PersistenceException;
import java.util.List;

/**
 *
 * @author Andre Matheus
 * @author Gabriel
 * 
 */
public interface ExperienciaProfissionalManagement {
    public void insert(ExperienciaProfissional ExperienciaProfissional) throws BusinessException, PersistenceException;
    public boolean update(long CPF, int Seq_Experiencia, int Cod_Cargo, ExperienciaProfissional ExperienciaProfssional) throws BusinessException, PersistenceException;
    public boolean delete(long CPF, int Seq_Experiencia, int Cod_Cargo) throws PersistenceException;
    public List<ExperienciaProfissional> getExperienciasProfissionais(long CPF) throws PersistenceException;
    public ExperienciaProfissional getExperienciaProfissionalCod(long CPF, int Seq_Experiencia, int Cod_Cargo) throws PersistenceException;
}
