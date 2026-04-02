package com.amazon.aps.iva.wp;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.sp.c;
import com.amazon.aps.iva.sp.h;
import com.amazon.aps.iva.tp.l;
import com.amazon.aps.iva.tp.m;
import com.amazon.aps.iva.vp.e;
import java.io.File;
import java.util.List;
/* compiled from: SingleItemDataWriter.kt */
/* loaded from: classes2.dex */
public class b<T> implements c<T> {
    public final m a;
    public final h<T> b;
    public final l c;
    public final com.amazon.aps.iva.iq.a d;

    public b(com.amazon.aps.iva.up.b bVar, h hVar, e eVar, com.amazon.aps.iva.iq.a aVar) {
        this.a = bVar;
        this.b = hVar;
        this.c = eVar;
        this.d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.sp.c
    public final void a(List<? extends T> list) {
        Object E0 = x.E0(list);
        if (E0 == null) {
            return;
        }
        c(E0);
    }

    @Override // com.amazon.aps.iva.sp.c
    public final void b(T t) {
        c(t);
    }

    public final void c(T t) {
        byte[] E = com.amazon.aps.iva.dg.b.E(this.b, t, this.d);
        if (E == null) {
            return;
        }
        synchronized (this) {
            File c = this.a.c(E.length);
            if (c != null) {
                this.c.a(c, false, E);
            }
        }
    }
}
