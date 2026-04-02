package com.amazon.aps.iva.j6;

import com.amazon.aps.iva.m6.r;
import com.amazon.aps.iva.q5.p0;
import com.amazon.aps.iva.t6.m;
import java.util.List;
/* compiled from: FilteringHlsPlaylistParserFactory.java */
/* loaded from: classes.dex */
public final class c implements h {
    public final h a;
    public final List<p0> b;

    public c(a aVar, List list) {
        this.a = aVar;
        this.b = list;
    }

    @Override // com.amazon.aps.iva.j6.h
    public final m.a<f> a() {
        return new r(this.a.a(), this.b);
    }

    @Override // com.amazon.aps.iva.j6.h
    public final m.a<f> b(e eVar, d dVar) {
        return new r(this.a.b(eVar, dVar), this.b);
    }
}
