package com.kwad.framework.filedownloader.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.kwad.framework.filedownloader.b.a;
import com.kwad.framework.filedownloader.f.f;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class d implements com.kwad.framework.filedownloader.b.a {
    private static boolean ach = false;
    private SQLiteDatabase acg;

    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0228a {
        private final SparseArray<com.kwad.framework.filedownloader.d.c> abW;
        private final SparseArray<List<com.kwad.framework.filedownloader.d.a>> abX;
        private final SparseArray<com.kwad.framework.filedownloader.d.c> aci;
        private b acj;

        a(d dVar) {
            this(null, null);
        }

        a(SparseArray<com.kwad.framework.filedownloader.d.c> sparseArray, SparseArray<List<com.kwad.framework.filedownloader.d.a>> sparseArray2) {
            this.aci = new SparseArray<>();
            this.abW = sparseArray;
            this.abX = sparseArray2;
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0228a
        public final void a(int i, com.kwad.framework.filedownloader.d.c cVar) {
            this.aci.put(i, cVar);
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0228a
        public final void c(com.kwad.framework.filedownloader.d.c cVar) {
            SparseArray<com.kwad.framework.filedownloader.d.c> sparseArray = this.abW;
            if (sparseArray != null) {
                synchronized (sparseArray) {
                    this.abW.put(cVar.getId(), cVar);
                }
            }
        }

        @Override // java.lang.Iterable
        public final Iterator<com.kwad.framework.filedownloader.d.c> iterator() {
            b bVar = new b();
            this.acj = bVar;
            return bVar;
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0228a
        public final void ul() {
            b bVar = this.acj;
            if (bVar != null) {
                bVar.ul();
            }
            if (d.this.acg == null) {
                return;
            }
            int size = this.aci.size();
            try {
                if (size < 0) {
                    return;
                }
                try {
                    d.this.acg.beginTransaction();
                    for (int i = 0; i < size; i++) {
                        int keyAt = this.aci.keyAt(i);
                        com.kwad.framework.filedownloader.d.c cVar = this.aci.get(keyAt);
                        d.this.acg.delete("ksad_file_download", "_id = ?", new String[]{String.valueOf(keyAt)});
                        d.this.acg.insert("ksad_file_download", null, cVar.vn());
                        if (cVar.vs() > 1) {
                            List<com.kwad.framework.filedownloader.d.a> bg = d.this.bg(keyAt);
                            if (bg.size() > 0) {
                                d.this.acg.delete("ksad_file_download_connection", "id = ?", new String[]{String.valueOf(keyAt)});
                                for (com.kwad.framework.filedownloader.d.a aVar : bg) {
                                    aVar.setId(cVar.getId());
                                    d.this.acg.insert("ksad_file_download_connection", null, aVar.vn());
                                }
                            }
                        }
                    }
                    SparseArray<com.kwad.framework.filedownloader.d.c> sparseArray = this.abW;
                    if (sparseArray != null && this.abX != null) {
                        synchronized (sparseArray) {
                            int size2 = this.abW.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                int id = this.abW.valueAt(i2).getId();
                                List<com.kwad.framework.filedownloader.d.a> bg2 = d.this.bg(id);
                                if (bg2 != null && bg2.size() > 0) {
                                    synchronized (this.abX) {
                                        this.abX.put(id, bg2);
                                    }
                                }
                            }
                        }
                    }
                    d.this.acg.setTransactionSuccessful();
                    if (d.this.acg != null) {
                        try {
                            d.this.acg.endTransaction();
                        } catch (Exception e) {
                            d.printStackTrace(e);
                        }
                    }
                } catch (SQLiteException e2) {
                    d.this.a(e2);
                    if (d.this.acg != null) {
                        try {
                            d.this.acg.endTransaction();
                        } catch (Exception e3) {
                            d.printStackTrace(e3);
                        }
                    }
                } catch (Exception e4) {
                    d.printStackTrace(e4);
                    if (d.this.acg != null) {
                        try {
                            d.this.acg.endTransaction();
                        } catch (Exception e5) {
                            d.printStackTrace(e5);
                        }
                    }
                }
            } catch (Throwable th) {
                if (d.this.acg != null) {
                    try {
                        d.this.acg.endTransaction();
                    } catch (Exception e6) {
                        d.printStackTrace(e6);
                    }
                }
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Iterator<com.kwad.framework.filedownloader.d.c> {
        private Cursor acl;
        private final List<Integer> acm = new ArrayList();
        private int acn;

        b() {
            if (d.this.acg != null) {
                try {
                    this.acl = d.this.acg.rawQuery("SELECT * FROM ksad_file_download", null);
                } catch (SQLiteException e) {
                    d.this.a(e);
                } catch (Exception e2) {
                    d.printStackTrace(e2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* renamed from: um */
        public com.kwad.framework.filedownloader.d.c next() {
            com.kwad.framework.filedownloader.d.c d = d.d(this.acl);
            this.acn = d.getId();
            return d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            try {
                Cursor cursor = this.acl;
                if (cursor != null) {
                    return cursor.moveToNext();
                }
                return false;
            } catch (Throwable th) {
                d.printStackTrace(th);
                return false;
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.acm.add(Integer.valueOf(this.acn));
        }

        final void ul() {
            Cursor cursor;
            if (d.this.acg == null || (cursor = this.acl) == null) {
                return;
            }
            cursor.close();
            if (this.acm.isEmpty()) {
                return;
            }
            String join = TextUtils.join(", ", this.acm);
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "delete %s", join);
            }
            try {
                d.this.acg.execSQL(f.b("DELETE FROM %s WHERE %s IN (%s);", "ksad_file_download", "_id", join));
                d.this.acg.execSQL(f.b("DELETE FROM %s WHERE %s IN (%s);", "ksad_file_download_connection", "id", join));
            } catch (SQLiteException e) {
                d.this.a(e);
            } catch (Exception e2) {
                d.printStackTrace(e2);
            }
        }
    }

    public d() {
        try {
            this.acg = new e(com.kwad.framework.filedownloader.f.c.vP()).getWritableDatabase();
        } catch (SQLiteException e) {
            a(e);
        }
    }

    private void a(int i, ContentValues contentValues) {
        SQLiteDatabase sQLiteDatabase = this.acg;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.update("ksad_file_download", contentValues, "_id = ? ", new String[]{String.valueOf(i)});
            } catch (SQLiteException e) {
                a(i, e);
            } catch (Exception e2) {
                printStackTrace(e2);
            }
        }
    }

    private void a(int i, SQLiteException sQLiteException) {
        if (!(sQLiteException instanceof SQLiteFullException)) {
            printStackTrace(sQLiteException);
            return;
        }
        if (i != -1) {
            bi(i);
            bh(i);
        }
        h(sQLiteException);
        ach = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SQLiteException sQLiteException) {
        a(-1, sQLiteException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.kwad.framework.filedownloader.d.c d(Cursor cursor) {
        com.kwad.framework.filedownloader.d.c cVar = new com.kwad.framework.filedownloader.d.c();
        if (cursor == null) {
            return cVar;
        }
        cVar.setId(cursor.getInt(cursor.getColumnIndex("_id")));
        cVar.setUrl(cursor.getString(cursor.getColumnIndex("url")));
        cVar.c(cursor.getString(cursor.getColumnIndex("path")), cursor.getShort(cursor.getColumnIndex("pathAsDirectory")) == 1);
        cVar.d((byte) cursor.getShort(cursor.getColumnIndex("status")));
        cVar.L(cursor.getLong(cursor.getColumnIndex("sofar")));
        cVar.N(cursor.getLong(cursor.getColumnIndex("total")));
        cVar.bk(cursor.getString(cursor.getColumnIndex("errMsg")));
        cVar.bj(cursor.getString(cursor.getColumnIndex("etag")));
        cVar.bl(cursor.getString(cursor.getColumnIndex("filename")));
        cVar.by(cursor.getInt(cursor.getColumnIndex("connectionCount")));
        return cVar;
    }

    private void d(com.kwad.framework.filedownloader.d.c cVar) {
        SQLiteDatabase sQLiteDatabase = this.acg;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.insert("ksad_file_download", null, cVar.vn());
            } catch (SQLiteException e) {
                cVar.bk(e.toString());
                cVar.d((byte) -1);
                a(cVar.getId(), e);
            } catch (Exception e2) {
                printStackTrace(e2);
            }
        }
    }

    private static void h(Throwable th) {
        if (th != null) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void printStackTrace(Throwable th) {
        h(th);
    }

    public final a.InterfaceC0228a a(SparseArray<com.kwad.framework.filedownloader.d.c> sparseArray, SparseArray<List<com.kwad.framework.filedownloader.d.a>> sparseArray2) {
        return new a(sparseArray, sparseArray2);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i, int i2, long j) {
        if (this.acg == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("currentOffset", Long.valueOf(j));
        try {
            this.acg.update("ksad_file_download_connection", contentValues, "id = ? AND connectionIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2)});
        } catch (SQLiteException e) {
            a(i, e);
        } catch (Exception e2) {
            printStackTrace(e2);
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i, long j, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 2);
        contentValues.put("total", Long.valueOf(j));
        contentValues.put("etag", str);
        contentValues.put("filename", str2);
        a(i, contentValues);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i, String str, long j, long j2, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sofar", Long.valueOf(j));
        contentValues.put("total", Long.valueOf(j2));
        contentValues.put("etag", str);
        contentValues.put("connectionCount", Integer.valueOf(i2));
        a(i, contentValues);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i, Throwable th) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th.toString());
        contentValues.put("status", (Byte) (byte) 5);
        a(i, contentValues);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i, Throwable th, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th.toString());
        contentValues.put("status", (Byte) (byte) -1);
        contentValues.put("sofar", Long.valueOf(j));
        a(i, contentValues);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(com.kwad.framework.filedownloader.d.a aVar) {
        SQLiteDatabase sQLiteDatabase;
        if (aVar == null || (sQLiteDatabase = this.acg) == null) {
            return;
        }
        try {
            sQLiteDatabase.insert("ksad_file_download_connection", null, aVar.vn());
        } catch (SQLiteException e) {
            a(aVar.getId(), e);
        } catch (Exception e2) {
            printStackTrace(e2);
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void b(com.kwad.framework.filedownloader.d.c cVar) {
        if (this.acg == null) {
            return;
        }
        if (cVar == null) {
            com.kwad.framework.filedownloader.f.d.d(this, "update but model == null!", new Object[0]);
        } else if (bf(cVar.getId()) == null) {
            d(cVar);
        } else {
            try {
                this.acg.update("ksad_file_download", cVar.vn(), "_id = ? ", new String[]{String.valueOf(cVar.getId())});
            } catch (SQLiteException e) {
                cVar.bk(e.toString());
                cVar.d((byte) -1);
                a(cVar.getId(), e);
            } catch (Exception e2) {
                printStackTrace(e2);
            }
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void be(int i) {
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final com.kwad.framework.filedownloader.d.c bf(int i) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase = this.acg;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            if (sQLiteDatabase == null) {
                return null;
            }
            try {
                cursor = sQLiteDatabase.rawQuery(f.b("SELECT * FROM %s WHERE %s = ?", "ksad_file_download", "_id"), new String[]{Integer.toString(i)});
                try {
                    if (cursor.moveToNext()) {
                        com.kwad.framework.filedownloader.d.c d = d(cursor);
                        com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                        return d;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    a(i, e);
                    com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                    return null;
                } catch (Exception e2) {
                    e = e2;
                    printStackTrace(e);
                    com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursor = null;
            } catch (Exception e4) {
                e = e4;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                com.kwad.sdk.crash.utils.b.closeQuietly(sQLiteDatabase2);
                throw th;
            }
            com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
            return null;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final List<com.kwad.framework.filedownloader.d.a> bg(int i) {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = this.acg;
        if (sQLiteDatabase == null) {
            return arrayList;
        }
        Cursor cursor = null;
        try {
            try {
                try {
                    cursor = sQLiteDatabase.rawQuery(f.b("SELECT * FROM %s WHERE %s = ?", "ksad_file_download_connection", "id"), new String[]{Integer.toString(i)});
                    while (cursor.moveToNext()) {
                        com.kwad.framework.filedownloader.d.a aVar = new com.kwad.framework.filedownloader.d.a();
                        aVar.setId(i);
                        aVar.setIndex(cursor.getInt(cursor.getColumnIndex("connectionIndex")));
                        aVar.setStartOffset(cursor.getLong(cursor.getColumnIndex(DBDefinition.START_OFFSET)));
                        aVar.J(cursor.getLong(cursor.getColumnIndex("currentOffset")));
                        aVar.K(cursor.getLong(cursor.getColumnIndex(DBDefinition.END_OFFSET)));
                        arrayList.add(aVar);
                    }
                } catch (SQLiteException e) {
                    a(i, e);
                }
            } catch (Exception e2) {
                printStackTrace(e2);
            }
            return arrayList;
        } finally {
            com.kwad.sdk.crash.utils.b.closeQuietly(cursor);
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bh(int i) {
        SQLiteDatabase sQLiteDatabase = this.acg;
        if (sQLiteDatabase == null) {
            return;
        }
        try {
            sQLiteDatabase.execSQL("DELETE FROM ksad_file_download_connection WHERE id = " + i);
        } catch (SQLiteException e) {
            printStackTrace(e);
        } catch (Exception e2) {
            printStackTrace(e2);
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final boolean bi(int i) {
        SQLiteDatabase sQLiteDatabase = this.acg;
        if (sQLiteDatabase == null) {
            return false;
        }
        try {
            return sQLiteDatabase.delete("ksad_file_download", "_id = ?", new String[]{String.valueOf(i)}) != 0;
        } catch (SQLiteException | Exception e) {
            printStackTrace(e);
            return false;
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bj(int i) {
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void c(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 3);
        contentValues.put("sofar", Long.valueOf(j));
        a(i, contentValues);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void clear() {
        SQLiteDatabase sQLiteDatabase = this.acg;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.delete("ksad_file_download", null, null);
            } catch (SQLiteException e) {
                a(e);
            }
            try {
                this.acg.delete("ksad_file_download_connection", null, null);
            } catch (SQLiteException e2) {
                a(e2);
            }
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void d(int i, long j) {
        bi(i);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void e(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) -2);
        contentValues.put("sofar", Long.valueOf(j));
        a(i, contentValues);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void q(int i, int i2) {
        if (this.acg == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("connectionCount", Integer.valueOf(i2));
        try {
            this.acg.update("ksad_file_download", contentValues, "_id = ? ", new String[]{Integer.toString(i)});
        } catch (SQLiteException e) {
            a(i, e);
        } catch (Exception e2) {
            printStackTrace(e2);
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final a.InterfaceC0228a uk() {
        return new a(this);
    }
}
