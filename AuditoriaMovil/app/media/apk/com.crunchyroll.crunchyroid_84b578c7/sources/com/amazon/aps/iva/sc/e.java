package com.amazon.aps.iva.sc;

import com.amazon.aps.iva.kc.h;
import com.amazon.aps.iva.rc.g;
import com.amazon.aps.iva.rc.o;
import com.amazon.aps.iva.rc.p;
import com.amazon.aps.iva.rc.s;
import java.io.InputStream;
import java.net.URL;
/* compiled from: UrlLoader.java */
/* loaded from: classes.dex */
public final class e implements o<URL, InputStream> {
    public final o<g, InputStream> a;

    public e(o<g, InputStream> oVar) {
        this.a = oVar;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a<InputStream> buildLoadData(URL url, int i, int i2, h hVar) {
        return this.a.buildLoadData(new g(url), i, i2, hVar);
    }

    @Override // com.amazon.aps.iva.rc.o
    public final /* bridge */ /* synthetic */ boolean handles(URL url) {
        return true;
    }

    /* compiled from: UrlLoader.java */
    /* loaded from: classes.dex */
    public static class a implements p<URL, InputStream> {
        @Override // com.amazon.aps.iva.rc.p
        public final o<URL, InputStream> build(s sVar) {
            return new e(sVar.b(g.class, InputStream.class));
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }
}
