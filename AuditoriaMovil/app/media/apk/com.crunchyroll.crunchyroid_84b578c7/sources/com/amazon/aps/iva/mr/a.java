package com.amazon.aps.iva.mr;

import com.amazon.aps.iva.sp.c;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
/* compiled from: TraceWriter.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.cs.a {
    public final c<com.amazon.aps.iva.ur.a> b;

    public a(c<com.amazon.aps.iva.ur.a> cVar) {
        j.f(cVar, "writer");
        this.b = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.amazon.aps.iva.cs.a
    public final void d0() {
    }

    @Override // com.amazon.aps.iva.cs.a
    public final void p0(ArrayList arrayList) {
        this.b.a(arrayList);
    }

    @Override // com.amazon.aps.iva.cs.a
    public final void start() {
    }
}
