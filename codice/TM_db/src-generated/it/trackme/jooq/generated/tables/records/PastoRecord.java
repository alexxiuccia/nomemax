/*
 * This file is generated by jOOQ.
 */
package it.trackme.jooq.generated.tables.records;


import it.trackme.jooq.generated.tables.Pasto;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PastoRecord extends UpdatableRecordImpl<PastoRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pasto.idPasto</code>.
     */
    public void setIdpasto(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pasto.idPasto</code>.
     */
    public Integer getIdpasto() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pasto.idUtente</code>.
     */
    public void setIdutente(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>pasto.idUtente</code>.
     */
    public Integer getIdutente() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>pasto.tipo</code>.
     */
    public void setTipo(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pasto.tipo</code>.
     */
    public String getTipo() {
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
        return Pasto.PASTO.IDPASTO;
    }

    @Override
    public Field<Integer> field2() {
        return Pasto.PASTO.IDUTENTE;
    }

    @Override
    public Field<String> field3() {
        return Pasto.PASTO.TIPO;
    }

    @Override
    public Integer component1() {
        return getIdpasto();
    }

    @Override
    public Integer component2() {
        return getIdutente();
    }

    @Override
    public String component3() {
        return getTipo();
    }

    @Override
    public Integer value1() {
        return getIdpasto();
    }

    @Override
    public Integer value2() {
        return getIdutente();
    }

    @Override
    public String value3() {
        return getTipo();
    }

    @Override
    public PastoRecord value1(Integer value) {
        setIdpasto(value);
        return this;
    }

    @Override
    public PastoRecord value2(Integer value) {
        setIdutente(value);
        return this;
    }

    @Override
    public PastoRecord value3(String value) {
        setTipo(value);
        return this;
    }

    @Override
    public PastoRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PastoRecord
     */
    public PastoRecord() {
        super(Pasto.PASTO);
    }

    /**
     * Create a detached, initialised PastoRecord
     */
    public PastoRecord(Integer idpasto, Integer idutente, String tipo) {
        super(Pasto.PASTO);

        setIdpasto(idpasto);
        setIdutente(idutente);
        setTipo(tipo);
        resetChangedOnNotNull();
    }
}