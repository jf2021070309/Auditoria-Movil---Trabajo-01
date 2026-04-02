package com.amazon.aps.iva.sc;

import com.amazon.aps.iva.kc.h;
import com.amazon.aps.iva.rc.g;
import com.amazon.aps.iva.rc.m;
import com.amazon.aps.iva.rc.n;
import com.amazon.aps.iva.rc.o;
import com.amazon.aps.iva.rc.p;
import com.amazon.aps.iva.rc.s;
import java.io.InputStream;
import java.util.ArrayDeque;
/* compiled from: HttpGlideUrlLoader.java */
/* loaded from: classes.dex */
public final class a implements o<g, InputStream> {
    public static final com.amazon.aps.iva.kc.g<Integer> b = com.amazon.aps.iva.kc.g.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final n<g, g> a;

    public a(n<g, g> nVar) {
        this.a = nVar;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a<InputStream> buildLoadData(g gVar, int i, int i2, h hVar) {
        g gVar2 = gVar;
        n<g, g> nVar = this.a;
        if (nVar != null) {
            n.a a = n.a.a(gVar2);
            m mVar = nVar.a;
            Object a2 = mVar.a(a);
            ArrayDeque arrayDeque = n.a.d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a);
            }
            g gVar3 = (g) a2;
            if (gVar3 == null) {
                mVar.d(n.a.a(gVar2), gVar2);
            } else {
                gVar2 = gVar3;
            }
        }
        return new o.a<>(gVar2, new com.amazon.aps.iva.lc.h(gVar2, ((Integer) hVar.c(b)).intValue()));
    }

    @Override // com.amazon.aps.iva.rc.o
    public final /* bridge */ /* synthetic */ boolean handles(g gVar) {
        return true;
    }

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: com.amazon.aps.iva.sc.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0701a implements p<g, InputStream> {
        public final n<g, g> a = new n<>();

        @Override // com.amazon.aps.iva.rc.p
        public final o<g, InputStream> build(s sVar) {
            return new a(this.a);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }
}
