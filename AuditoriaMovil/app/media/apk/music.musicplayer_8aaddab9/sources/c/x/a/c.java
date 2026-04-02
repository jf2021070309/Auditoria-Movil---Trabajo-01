package c.x.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
/* loaded from: classes.dex */
public interface c extends Closeable {

    /* loaded from: classes.dex */
    public static abstract class a {
        public final int a;

        public a(int i2) {
            this.a = i2;
        }

        public final void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e2) {
                Log.w("SupportSQLite", "delete failed: ", e2);
            }
        }

        public abstract void b(c.x.a.b bVar, int i2, int i3);
    }

    /* loaded from: classes.dex */
    public static class b {
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2832b;

        /* renamed from: c  reason: collision with root package name */
        public final a f2833c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2834d;

        public b(Context context, String str, a aVar, boolean z) {
            this.a = context;
            this.f2832b = str;
            this.f2833c = aVar;
            this.f2834d = z;
        }
    }

    /* renamed from: c.x.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0058c {
        c a(b bVar);
    }

    c.x.a.b A();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
