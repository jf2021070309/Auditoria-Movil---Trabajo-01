package com.amazon.aps.iva.p8;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: SharedSQLiteStatement.java */
/* loaded from: classes.dex */
public abstract class k {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final g b;
    public volatile com.amazon.aps.iva.v8.e c;

    public k(g gVar) {
        this.b = gVar;
    }

    public final com.amazon.aps.iva.v8.e a() {
        this.b.a();
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                String b = b();
                g gVar = this.b;
                gVar.a();
                gVar.b();
                this.c = new com.amazon.aps.iva.v8.e(((com.amazon.aps.iva.v8.a) gVar.c.getWritableDatabase()).b.compileStatement(b));
            }
            return this.c;
        }
        String b2 = b();
        g gVar2 = this.b;
        gVar2.a();
        gVar2.b();
        return new com.amazon.aps.iva.v8.e(((com.amazon.aps.iva.v8.a) gVar2.c.getWritableDatabase()).b.compileStatement(b2));
    }

    public abstract String b();

    public final void c(com.amazon.aps.iva.v8.e eVar) {
        if (eVar == this.c) {
            this.a.set(false);
        }
    }
}
