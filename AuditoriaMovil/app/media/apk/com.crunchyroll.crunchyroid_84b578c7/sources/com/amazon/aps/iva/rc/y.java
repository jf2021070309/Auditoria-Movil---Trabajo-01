package com.amazon.aps.iva.rc;

import android.net.Uri;
import com.amazon.aps.iva.rc.o;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: UrlUriLoader.java */
/* loaded from: classes.dex */
public final class y<Data> implements o<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final o<g, Data> a;

    public y(o<g, Data> oVar) {
        this.a = oVar;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a buildLoadData(Uri uri, int i, int i2, com.amazon.aps.iva.kc.h hVar) {
        return this.a.buildLoadData(new g(uri.toString()), i, i2, hVar);
    }

    @Override // com.amazon.aps.iva.rc.o
    public final boolean handles(Uri uri) {
        return b.contains(uri.getScheme());
    }

    /* compiled from: UrlUriLoader.java */
    /* loaded from: classes.dex */
    public static class a implements p<Uri, InputStream> {
        @Override // com.amazon.aps.iva.rc.p
        public final o<Uri, InputStream> build(s sVar) {
            return new y(sVar.b(g.class, InputStream.class));
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }
}
