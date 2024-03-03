/*
 * This file is generated by jOOQ.
 */
package it.trackme.jooq.generated.tables.records;


import it.trackme.jooq.generated.tables.Ricetta;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RicettaRecord extends UpdatableRecordImpl<RicettaRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ricetta.idRicetta</code>.
     */
    public void setIdricetta(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ricetta.idRicetta</code>.
     */
    public Integer getIdricetta() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ricetta.quantità</code>.
     */
    public void setQuantità(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ricetta.quantità</code>.
     */
    public Integer getQuantità() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ricetta.nome</code>.
     */
    public void setNome(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ricetta.nome</code>.
     */
    public String getNome() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Ricetta.RICETTA.IDRICETTA;
    }

    @Override
    public Field<Integer> field2() {
        return Ricetta.RICETTA.QUANTITÀ;
    }

    @Override
    public Field<String> field3() {
        return Ricetta.RICETTA.NOME;
    }

    @Override
    public Integer component1() {
        return getIdricetta();
    }

    @Override
    public Integer component2() {
        return getQuantità();
    }

    @Override
    public String component3() {
        return getNome();
    }

    @Override
    public Integer value1() {
        return getIdricetta();
    }

    @Override
    public Integer value2() {
        return getQuantità();
    }

    @Override
    public String value3() {
        return getNome();
    }

    @Override
    public RicettaRecord value1(Integer value) {
        setIdricetta(value);
        return this;
    }

    @Override
    public RicettaRecord value2(Integer value) {
        setQuantità(value);
        return this;
    }

    @Override
    public RicettaRecord value3(String value) {
        setNome(value);
        return this;
    }

    @Override
    public RicettaRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RicettaRecord
     */
    public RicettaRecord() {
        super(Ricetta.RICETTA);
    }

    /**
     * Create a detached, initialised RicettaRecord
     */
    public RicettaRecord(Integer idricetta, Integer quantità, String nome) {
        super(Ricetta.RICETTA);

        setIdricetta(idricetta);
        setQuantità(quantità);
        setNome(nome);
        resetChangedOnNotNull();
    }
}