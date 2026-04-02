package com.amazon.aps.iva.up;

import com.amazon.aps.iva.tp.l;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.util.concurrent.TimeUnit;
/* compiled from: WipeDataMigrationOperation.kt */
/* loaded from: classes2.dex */
public final class g implements Runnable {
    public static final long e = TimeUnit.MILLISECONDS.toNanos(500);
    public final File b;
    public final l c;
    public final com.amazon.aps.iva.iq.a d;

    /* compiled from: WipeDataMigrationOperation.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            g gVar = g.this;
            return Boolean.valueOf(gVar.c.delete(gVar.b));
        }
    }

    public g(File file, l lVar, com.amazon.aps.iva.iq.a aVar) {
        j.f(lVar, "fileHandler");
        j.f(aVar, "internalLogger");
        this.b = file;
        this.c = lVar;
        this.d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == null) {
            com.amazon.aps.iva.iq.a.e(this.d, "Can't wipe data from a null directory", null, 6);
            return;
        }
        i.B(e, new a());
    }
}
