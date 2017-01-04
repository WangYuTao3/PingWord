package com.ping.word.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.ping.word.bean.Challenge;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CHALLENGE".
*/
public class ChallengeDao extends AbstractDao<Challenge, Long> {

    public static final String TABLENAME = "CHALLENGE";

    /**
     * Properties of entity Challenge.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property RightNum = new Property(1, Integer.class, "rightNum", false, "RIGHT_NUM");
        public final static Property Rank = new Property(2, Integer.class, "rank", false, "RANK");
        public final static Property Position = new Property(3, Integer.class, "position", false, "POSITION");
    };


    public ChallengeDao(DaoConfig config) {
        super(config);
    }
    
    public ChallengeDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CHALLENGE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"RIGHT_NUM\" INTEGER," + // 1: rightNum
                "\"RANK\" INTEGER," + // 2: rank
                "\"POSITION\" INTEGER);"); // 3: position
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CHALLENGE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Challenge entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer rightNum = entity.getRightNum();
        if (rightNum != null) {
            stmt.bindLong(2, rightNum);
        }
 
        Integer rank = entity.getRank();
        if (rank != null) {
            stmt.bindLong(3, rank);
        }
 
        Integer position = entity.getPosition();
        if (position != null) {
            stmt.bindLong(4, position);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Challenge readEntity(Cursor cursor, int offset) {
        Challenge entity = new Challenge( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // rightNum
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // rank
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3) // position
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Challenge entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setRightNum(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setRank(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setPosition(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Challenge entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Challenge entity) {
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
