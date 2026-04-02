package com.amazon.aps.iva.wf;

import com.amazon.aps.iva.js.e0;
import com.amazon.aps.iva.js.o;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ContentUnavailableAnalytics.kt */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.us.b implements b {
    public final String e;
    public final com.amazon.aps.iva.ds.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.fs.c> aVar2) {
        super(aVar2);
        j.f(str, "mediaId");
        this.e = str;
        this.f = aVar;
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        this.f.c(new com.amazon.aps.iva.es.j(com.amazon.aps.iva.ls.a.CONTENT_UNAVAILABLE, new o(this.e), new e0(f)));
    }
}
