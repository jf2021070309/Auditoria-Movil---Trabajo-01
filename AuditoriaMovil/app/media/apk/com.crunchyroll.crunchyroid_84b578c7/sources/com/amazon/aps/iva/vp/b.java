package com.amazon.aps.iva.vp;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.tp.l;
import com.amazon.aps.iva.tp.m;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.util.List;
/* compiled from: BatchFileDataWriter.kt */
/* loaded from: classes2.dex */
public class b<T> implements com.amazon.aps.iva.sp.c<T> {
    public final m a;
    public final com.amazon.aps.iva.sp.h<T> b;
    public final l c;
    public final com.amazon.aps.iva.iq.a d;

    public b(m mVar, com.amazon.aps.iva.sp.h<T> hVar, com.amazon.aps.iva.sp.f fVar, l lVar, com.amazon.aps.iva.iq.a aVar) {
        j.f(mVar, "fileOrchestrator");
        j.f(hVar, "serializer");
        j.f(fVar, "decoration");
        j.f(lVar, "handler");
        j.f(aVar, "internalLogger");
        this.a = mVar;
        this.b = hVar;
        this.c = lVar;
        this.d = aVar;
    }

    @Override // com.amazon.aps.iva.sp.c
    public final void a(List<? extends T> list) {
        for (T t : list) {
            c(t);
        }
    }

    @Override // com.amazon.aps.iva.sp.c
    public final void b(T t) {
        c(t);
    }

    public final void c(T t) {
        boolean a;
        byte[] E = com.amazon.aps.iva.dg.b.E(this.b, t, this.d);
        if (E == null) {
            return;
        }
        synchronized (this) {
            try {
                File c = this.a.c(E.length);
                if (c == null) {
                    a = false;
                } else {
                    a = this.c.a(c, true, E);
                }
                if (a) {
                    d(t, E);
                }
                q qVar = q.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(T t, byte[] bArr) {
        j.f(t, "data");
    }
}
