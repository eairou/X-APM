package github.tornaco.xposedmoduletest.bean;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import github.tornaco.xposedmoduletest.bean.LockKillPackage;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LOCK_KILL_PACKAGE".
*/
public class LockKillPackageDao extends AbstractDao<LockKillPackage, Integer> {

    public static final String TABLENAME = "LOCK_KILL_PACKAGE";

    /**
     * Properties of entity LockKillPackage.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Integer.class, "id", true, "ID");
        public final static Property PkgName = new Property(1, String.class, "pkgName", false, "PKG_NAME");
        public final static Property AppName = new Property(2, String.class, "appName", false, "APP_NAME");
        public final static Property Kill = new Property(3, Boolean.class, "kill", false, "KILL");
    };


    public LockKillPackageDao(DaoConfig config) {
        super(config);
    }
    
    public LockKillPackageDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOCK_KILL_PACKAGE\" (" + //
                "\"ID\" INTEGER PRIMARY KEY ," + // 0: id
                "\"PKG_NAME\" TEXT," + // 1: pkgName
                "\"APP_NAME\" TEXT," + // 2: appName
                "\"KILL\" INTEGER);"); // 3: kill
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOCK_KILL_PACKAGE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, LockKillPackage entity) {
        stmt.clearBindings();
 
        Integer id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String pkgName = entity.getPkgName();
        if (pkgName != null) {
            stmt.bindString(2, pkgName);
        }
 
        String appName = entity.getAppName();
        if (appName != null) {
            stmt.bindString(3, appName);
        }
 
        Boolean kill = entity.getKill();
        if (kill != null) {
            stmt.bindLong(4, kill ? 1L: 0L);
        }
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public LockKillPackage readEntity(Cursor cursor, int offset) {
        LockKillPackage entity = new LockKillPackage( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // pkgName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // appName
            cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0 // kill
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, LockKillPackage entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setPkgName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAppName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setKill(cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(LockKillPackage entity, long rowId) {
        return entity.getId();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(LockKillPackage entity) {
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
