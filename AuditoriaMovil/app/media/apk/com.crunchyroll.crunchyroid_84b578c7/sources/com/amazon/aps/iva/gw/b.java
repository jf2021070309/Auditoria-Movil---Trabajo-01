package com.amazon.aps.iva.gw;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: KalturaDatabase.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.gw.a {
    public final File b;
    public final SQLiteDatabase c;

    /* compiled from: KalturaDatabase.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<SQLiteDatabase, Boolean> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(SQLiteDatabase sQLiteDatabase) {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            j.f(sQLiteDatabase2, "$this$executeTransaction");
            String str = this.h;
            sQLiteDatabase2.delete("Items", "ItemID=?", new String[]{str});
            sQLiteDatabase2.delete("Files", "ItemID=?", new String[]{str});
            return Boolean.TRUE;
        }
    }

    public b(File file, File file2, Context context) {
        this.b = file;
        SQLiteDatabase readableDatabase = new c(context, file2).getReadableDatabase();
        j.e(readableDatabase, "helper.readableDatabase");
        this.c = readableDatabase;
    }

    public static void a(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                j.e(file2, "child");
                a(file2);
            }
        }
        file.delete();
    }

    @Override // com.amazon.aps.iva.gw.a
    public final synchronized List<com.amazon.aps.iva.hw.a> b(List<? extends com.amazon.aps.iva.hw.c> list) {
        ArrayList arrayList;
        try {
            int size = list.size();
            String[] strArr = new String[size];
            int size2 = list.size();
            for (int i = 0; i < size2; i++) {
                strArr[i] = list.get(i).name();
            }
            String str = "(" + TextUtils.join(",", Collections.nCopies(size, "?")) + ")";
            arrayList = new ArrayList();
            Cursor cursor = null;
            try {
                cursor = this.c.query("Items", com.amazon.aps.iva.cq.b.b, "ItemState IN " + str, strArr, null, null, null);
                while (cursor.moveToNext()) {
                    arrayList.add(f(cursor));
                }
                cursor.close();
            } catch (SQLiteException unused) {
                z zVar = z.b;
                if (cursor != null) {
                    cursor.close();
                }
                return zVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.gw.a
    public final synchronized void c(String str) {
        j.f(str, "itemId");
        a(new File(this.b, "items/".concat(str)));
        d(new a(str));
    }

    public final synchronized void d(a aVar) {
        try {
            this.c.beginTransaction();
            if (((Boolean) aVar.invoke(this.c)).booleanValue()) {
                this.c.setTransactionSuccessful();
            }
        } catch (SQLiteException unused) {
        } catch (Throwable th) {
            this.c.endTransaction();
            throw th;
        }
        this.c.endTransaction();
    }

    @Override // com.amazon.aps.iva.gw.a
    public final synchronized com.amazon.aps.iva.hw.a e(String str) {
        Cursor cursor;
        j.f(str, "itemId");
        Cursor cursor2 = null;
        com.amazon.aps.iva.hw.a aVar = null;
        try {
            cursor = this.c.query("Items", com.amazon.aps.iva.cq.b.b, "ItemID==?", new String[]{str}, null, null, null);
            try {
                if (cursor.moveToFirst()) {
                    aVar = f(cursor);
                }
                cursor.close();
                return aVar;
            } catch (SQLiteException unused) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th) {
                cursor2 = cursor;
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException unused2) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized com.amazon.aps.iva.hw.a f(Cursor cursor) {
        String string;
        String string2;
        com.amazon.aps.iva.hw.c valueOf;
        long j;
        long j2;
        boolean z;
        String str;
        String string3;
        string = cursor.getString(cursor.getColumnIndexOrThrow("ItemID"));
        j.e(string, "cursor.getStringOrThrow(COL_ITEM_ID)");
        string2 = cursor.getString(cursor.getColumnIndexOrThrow("ContentURL"));
        j.e(string2, "cursor.getStringOrThrow(COL_CONTENT_URL)");
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("ItemState"));
        j.e(string4, "cursor.getStringOrThrow(COL_ITEM_STATE)");
        valueOf = com.amazon.aps.iva.hw.c.valueOf(string4);
        j = cursor.getLong(cursor.getColumnIndexOrThrow("ItemEstimatedSize"));
        j2 = cursor.getLong(cursor.getColumnIndexOrThrow("ItemDownloadedSize"));
        Integer valueOf2 = Integer.valueOf(cursor.getColumnIndex("ItemPlaybackPath"));
        if (valueOf2.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            str = cursor.getString(valueOf2.intValue());
        } else {
            str = null;
        }
        string3 = cursor.getString(cursor.getColumnIndexOrThrow("ItemDataDir"));
        j.e(string3, "cursor.getStringOrThrow(COL_ITEM_DATA_DIR)");
        return new com.amazon.aps.iva.hw.a(string, string2, valueOf, j, j2, str, string3);
    }
}
