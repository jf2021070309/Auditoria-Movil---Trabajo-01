package com.amazon.aps.iva.up;

import com.amazon.aps.iva.tp.l;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.util.concurrent.TimeUnit;
/* compiled from: MoveDataMigrationOperation.kt */
/* loaded from: classes2.dex */
public final class d implements Runnable {
    public static final long f = TimeUnit.MILLISECONDS.toNanos(500);
    public final File b;
    public final File c;
    public final l d;
    public final com.amazon.aps.iva.iq.a e;

    /* compiled from: MoveDataMigrationOperation.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            d dVar = d.this;
            return Boolean.valueOf(dVar.d.b(dVar.b, dVar.c));
        }
    }

    public d(File file, File file2, l lVar, com.amazon.aps.iva.iq.a aVar) {
        j.f(lVar, "fileHandler");
        j.f(aVar, "internalLogger");
        this.b = file;
        this.c = file2;
        this.d = lVar;
        this.e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file = this.b;
        com.amazon.aps.iva.iq.a aVar = this.e;
        if (file == null) {
            com.amazon.aps.iva.iq.a.e(aVar, "Can't move data from a null directory", null, 6);
        } else if (this.c == null) {
            com.amazon.aps.iva.iq.a.e(aVar, "Can't move data to a null directory", null, 6);
        } else {
            i.B(f, new a());
        }
    }
}
