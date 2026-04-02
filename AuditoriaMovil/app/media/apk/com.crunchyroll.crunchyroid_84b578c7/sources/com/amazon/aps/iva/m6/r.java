package com.amazon.aps.iva.m6;

import android.net.Uri;
import com.amazon.aps.iva.m6.q;
import com.amazon.aps.iva.q5.p0;
import com.amazon.aps.iva.t6.m;
import java.io.IOException;
import java.util.List;
/* compiled from: FilteringManifestParser.java */
/* loaded from: classes.dex */
public final class r<T extends q<T>> implements m.a<T> {
    public final m.a<? extends T> a;
    public final List<p0> b;

    public r(m.a<? extends T> aVar, List<p0> list) {
        this.a = aVar;
        this.b = list;
    }

    @Override // com.amazon.aps.iva.t6.m.a
    public final Object a(Uri uri, com.amazon.aps.iva.w5.h hVar) throws IOException {
        q qVar = (q) this.a.a(uri, hVar);
        List<p0> list = this.b;
        if (list != null && !list.isEmpty()) {
            return (q) qVar.a(list);
        }
        return qVar;
    }
}
