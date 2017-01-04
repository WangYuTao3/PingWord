package com.ping.pingword.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.ping.pingword.bean.NewWord;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "NEW_WORD".
*/
public class NewWordDao extends AbstractDao<NewWord, Long> {

    public static final String TABLENAME = "NEW_WORD";

    /**
     * Properties of entity NewWord.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Newtype = new Property(1, Integer.class, "newtype", false, "NEWTYPE");
        public final static Property Word = new Property(2, String.class, "word", false, "WORD");
        public final static Property Sound = new Property(3, String.class, "sound", false, "SOUND");
        public final static Property Explain = new Property(4, String.class, "explain", false, "EXPLAIN");
        public final static Property Type = new Property(5, String.class, "type", false, "TYPE");
    };


    public NewWordDao(DaoConfig config) {
        super(config);
    }
    
    public NewWordDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"NEW_WORD\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NEWTYPE\" INTEGER," + // 1: newtype
                "\"WORD\" TEXT," + // 2: word
                "\"SOUND\" TEXT," + // 3: sound
                "\"EXPLAIN\" TEXT," + // 4: explain
                "\"TYPE\" TEXT);"); // 5: type
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"NEW_WORD\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, NewWord entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer newtype = entity.getNewtype();
        if (newtype != null) {
            stmt.bindLong(2, newtype);
        }
 
        String word = entity.getWord();
        if (word != null) {
            stmt.bindString(3, word);
        }
 
        String sound = entity.getSound();
        if (sound != null) {
            stmt.bindString(4, sound);
        }
 
        String explain = entity.getExplain();
        if (explain != null) {
            stmt.bindString(5, explain);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(6, type);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public NewWord readEntity(Cursor cursor, int offset) {
        NewWord entity = new NewWord( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // newtype
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // word
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // sound
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // explain
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // type
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, NewWord entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNewtype(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setWord(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSound(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setExplain(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setType(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(NewWord entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(NewWord entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}