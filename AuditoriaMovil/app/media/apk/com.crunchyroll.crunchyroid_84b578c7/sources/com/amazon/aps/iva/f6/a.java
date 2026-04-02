package com.amazon.aps.iva.f6;

import com.amazon.aps.iva.d6.e;
import com.amazon.aps.iva.e6.j;
import com.amazon.aps.iva.q6.d;
import com.amazon.aps.iva.t5.w;
import com.amazon.aps.iva.w5.f;
import com.amazon.aps.iva.x5.c;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.g;
import com.amazon.aps.iva.x6.n;
import java.io.IOException;
/* compiled from: DashDownloader.java */
/* loaded from: classes.dex */
public final class a extends w<g, IOException> {
    public final /* synthetic */ f i;
    public final /* synthetic */ int j;
    public final /* synthetic */ j k;

    public a(c cVar, int i, j jVar) {
        this.i = cVar;
        this.j = i;
        this.k = jVar;
    }

    @Override // com.amazon.aps.iva.t5.w
    public final g c() throws Exception {
        f fVar = this.i;
        j jVar = this.k;
        if (jVar.h == null) {
            return null;
        }
        d e = e.e(this.j, jVar.b);
        n nVar = e.b;
        try {
            e.c(e, fVar, jVar, true);
            nVar.release();
            d0 d0Var = e.i;
            if (!(d0Var instanceof g)) {
                return null;
            }
            return (g) d0Var;
        } catch (Throwable th) {
            nVar.release();
            throw th;
        }
    }
}
