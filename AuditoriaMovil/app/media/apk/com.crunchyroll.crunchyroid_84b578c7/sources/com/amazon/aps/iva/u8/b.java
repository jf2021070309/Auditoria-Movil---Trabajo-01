package com.amazon.aps.iva.u8;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.io.File;
/* compiled from: SupportSQLiteOpenHelper.java */
/* loaded from: classes.dex */
public interface b extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public static void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception unused) {
                }
            }
        }

        public abstract void b(com.amazon.aps.iva.v8.a aVar, int i, int i2);
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* renamed from: com.amazon.aps.iva.u8.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0760b {
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;

        public C0760b(Context context, String str, a aVar, boolean z) {
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.d = z;
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public interface c {
        b a(C0760b c0760b);
    }

    String getDatabaseName();

    com.amazon.aps.iva.u8.a getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
