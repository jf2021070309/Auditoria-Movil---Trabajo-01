package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_if122;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.j;
/* loaded from: classes.dex */
public class a {
    private static volatile a c;
    private bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_if122.bykvm_if122.b a;
    private SQLiteDatabase b;

    private a() {
    }

    public static a a() {
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public void a(Context context) {
        try {
            this.b = new b(context).getWritableDatabase();
        } catch (Throwable th) {
            j.b(th);
        }
        this.a = new bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_if122.bykvm_if122.b();
    }

    public void a(bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_if122.bykvm_19do.a aVar) {
        synchronized (this) {
            bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_if122.bykvm_if122.b bVar = this.a;
            if (bVar != null) {
                bVar.a(this.b, aVar);
            }
        }
    }

    public boolean a(String str) {
        boolean a;
        synchronized (this) {
            bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_if122.bykvm_if122.b bVar = this.a;
            a = bVar != null ? bVar.a(this.b, str) : false;
        }
        return a;
    }
}
