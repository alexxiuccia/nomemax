/*
 * This file is generated by jOOQ.
 */
package it.trackme.jooq.generated;


import it.trackme.jooq.generated.tables.Alimento;
import it.trackme.jooq.generated.tables.Composizionericetta;
import it.trackme.jooq.generated.tables.Creazionepasto;
import it.trackme.jooq.generated.tables.Pasto;
import it.trackme.jooq.generated.tables.Ricetta;
import it.trackme.jooq.generated.tables.User;
import it.trackme.jooq.generated.tables.Workout;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>alimento</code>.
     */
    public final Alimento ALIMENTO = Alimento.ALIMENTO;

    /**
     * The table <code>composizioneRicetta</code>.
     */
    public final Composizionericetta COMPOSIZIONERICETTA = Composizionericetta.COMPOSIZIONERICETTA;

    /**
     * The table <code>creazionePasto</code>.
     */
    public final Creazionepasto CREAZIONEPASTO = Creazionepasto.CREAZIONEPASTO;

    /**
     * The table <code>pasto</code>.
     */
    public final Pasto PASTO = Pasto.PASTO;

    /**
     * The table <code>ricetta</code>.
     */
    public final Ricetta RICETTA = Ricetta.RICETTA;

    /**
     * The table <code>user</code>.
     */
    public final User USER = User.USER;

    /**
     * The table <code>workout</code>.
     */
    public final Workout WORKOUT = Workout.WORKOUT;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Alimento.ALIMENTO,
            Composizionericetta.COMPOSIZIONERICETTA,
            Creazionepasto.CREAZIONEPASTO,
            Pasto.PASTO,
            Ricetta.RICETTA,
            User.USER,
            Workout.WORKOUT
        );
    }
}
