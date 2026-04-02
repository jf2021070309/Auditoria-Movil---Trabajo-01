package com.amazon.aps.iva.m6;

import android.net.Uri;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.w;
import com.amazon.aps.iva.t6.m;
import java.io.IOException;
/* compiled from: SegmentDownloader.java */
/* loaded from: classes.dex */
public final class t extends w<q<Object>, IOException> {
    public final /* synthetic */ com.amazon.aps.iva.w5.f i;
    public final /* synthetic */ com.amazon.aps.iva.w5.i j;
    public final /* synthetic */ u k;

    public t(u uVar, com.amazon.aps.iva.x5.c cVar, com.amazon.aps.iva.w5.i iVar) {
        this.k = uVar;
        this.i = cVar;
        this.j = iVar;
    }

    @Override // com.amazon.aps.iva.t5.w
    public final q<Object> c() throws Exception {
        m.a<M> aVar = this.k.b;
        com.amazon.aps.iva.w5.w wVar = new com.amazon.aps.iva.w5.w(this.i);
        com.amazon.aps.iva.o6.q.a();
        wVar.b = 0L;
        com.amazon.aps.iva.w5.h hVar = new com.amazon.aps.iva.w5.h(wVar, this.j);
        try {
            hVar.a();
            Uri uri = wVar.getUri();
            uri.getClass();
            Object a = aVar.a(uri, hVar);
            g0.g(hVar);
            a.getClass();
            return (q) a;
        } catch (Throwable th) {
            g0.g(hVar);
            throw th;
        }
    }
}
