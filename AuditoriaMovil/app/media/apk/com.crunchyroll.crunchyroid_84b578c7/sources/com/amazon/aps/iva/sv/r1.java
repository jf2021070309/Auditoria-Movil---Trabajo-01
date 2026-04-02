package com.amazon.aps.iva.sv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: DownloadsProvider.kt */
/* loaded from: classes2.dex */
public final class r1 implements q1 {
    public final q1 a;
    public final q1 b;
    public final com.amazon.aps.iva.ew.i c;

    /* compiled from: DownloadsProvider.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ String i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
            super(0);
            this.i = str;
            this.j = aVar;
            this.k = aVar2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            r1.this.b.c(this.i, this.j, this.k);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public r1(com.amazon.aps.iva.dw.d dVar, com.amazon.aps.iva.fw.c cVar, com.amazon.aps.iva.ew.j jVar) {
        this.a = dVar;
        this.b = cVar;
        this.c = jVar;
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final ArrayList a(int... iArr) {
        Object e;
        com.amazon.aps.iva.yb0.j.f(iArr, "states");
        ArrayList L0 = com.amazon.aps.iva.lb0.x.L0(this.b.a(Arrays.copyOf(iArr, iArr.length)), this.a.a(Arrays.copyOf(iArr, iArr.length)));
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(L0));
        Iterator it = L0.iterator();
        while (it.hasNext()) {
            e = com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new s1(this, (com.ellation.crunchyroll.downloading.e0) it.next(), null));
            arrayList.add((com.ellation.crunchyroll.downloading.e0) e);
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final com.ellation.crunchyroll.downloading.e0 b(String str) {
        Object e;
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        com.ellation.crunchyroll.downloading.e0 b = this.a.b(str);
        if (b == null) {
            b = this.b.b(str);
        }
        if (b != null) {
            e = com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new s1(this, b, null));
            return (com.ellation.crunchyroll.downloading.e0) e;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final void c(String str, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        com.amazon.aps.iva.yb0.j.f(aVar, "onNoItemFound");
        com.amazon.aps.iva.yb0.j.f(aVar2, "onRemoved");
        this.a.c(str, new a(str, aVar, aVar2), aVar2);
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final ArrayList d() {
        Object e;
        ArrayList L0 = com.amazon.aps.iva.lb0.x.L0(this.b.d(), this.a.d());
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(L0));
        Iterator it = L0.iterator();
        while (it.hasNext()) {
            e = com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new s1(this, (com.ellation.crunchyroll.downloading.e0) it.next(), null));
            arrayList.add((com.ellation.crunchyroll.downloading.e0) e);
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final com.amazon.aps.iva.fg.d e(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        com.amazon.aps.iva.fg.d e = this.a.e(str);
        if (e == null) {
            return this.b.e(str);
        }
        return e;
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final void f(com.amazon.aps.iva.m6.c cVar, com.amazon.aps.iva.m6.m mVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "download");
        com.amazon.aps.iva.yb0.j.f(mVar, "newDownloadRequest");
        this.a.f(cVar, mVar);
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final com.amazon.aps.iva.m6.c g(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        return this.a.g(str);
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final com.amazon.aps.iva.xb0.a<List<com.ellation.crunchyroll.downloading.e0>> h() {
        return this.a.h();
    }

    @Override // com.amazon.aps.iva.sv.q1
    public final void r() {
        this.a.r();
        this.b.r();
    }
}
