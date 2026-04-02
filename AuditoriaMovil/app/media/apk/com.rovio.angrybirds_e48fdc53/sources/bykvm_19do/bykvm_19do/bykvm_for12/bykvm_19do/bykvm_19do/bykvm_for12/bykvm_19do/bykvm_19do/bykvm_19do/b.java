package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.j;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {
    private static final Object b = new Object();
    private c a;

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0019b extends AbstractCursor {
        private C0019b(b bVar) {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class c {
        private volatile SQLiteDatabase a = null;

        public c() {
        }

        private void a() {
            synchronized (this) {
                try {
                    synchronized (b.b) {
                        if (this.a == null || !this.a.isOpen()) {
                            this.a = j.m().e().a(j.m().d());
                            this.a.setLockingEnabled(false);
                            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.a("---------------DB CREATE  SUCCESS------------");
                        }
                    }
                } finally {
                }
            }
        }

        private boolean b() {
            boolean z;
            synchronized (this) {
                SQLiteDatabase sQLiteDatabase = this.a;
                if (sQLiteDatabase != null) {
                    z = sQLiteDatabase.inTransaction();
                }
            }
            return z;
        }

        public int a(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i;
            synchronized (this) {
                try {
                    a();
                    i = this.a.update(str, contentValues, str2, strArr);
                } catch (Exception e) {
                    e.printStackTrace();
                    if (b()) {
                        throw e;
                    }
                    i = 0;
                }
            }
            return i;
        }

        public int a(String str, String str2, String[] strArr) {
            int i;
            synchronized (this) {
                try {
                    a();
                    i = this.a.delete(str, str2, strArr);
                } catch (Exception e) {
                    e.printStackTrace();
                    if (b()) {
                        throw e;
                    }
                    i = 0;
                }
            }
            return i;
        }

        public long a(String str, String str2, ContentValues contentValues) {
            long j;
            synchronized (this) {
                try {
                    a();
                    j = this.a.insert(str, str2, contentValues);
                } catch (Exception e) {
                    e.printStackTrace();
                    if (b()) {
                        throw e;
                    }
                    j = -1;
                }
            }
            return j;
        }

        public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            synchronized (this) {
                try {
                    a();
                    cursor = this.a.query(str, strArr, str2, strArr2, str3, str4, str5);
                } catch (Throwable th) {
                    th.printStackTrace();
                    C0019b c0019b = new C0019b();
                    if (b()) {
                        throw th;
                    }
                    cursor = c0019b;
                }
            }
            return cursor;
        }

        public void a(String str) throws SQLException {
            synchronized (this) {
                try {
                    a();
                    this.a.execSQL(str);
                } catch (Throwable th) {
                    if (b()) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        try {
            context.getApplicationContext();
            if (this.a == null) {
                this.a = new c();
            }
        } catch (Throwable th) {
        }
    }

    public c a() {
        return this.a;
    }
}
