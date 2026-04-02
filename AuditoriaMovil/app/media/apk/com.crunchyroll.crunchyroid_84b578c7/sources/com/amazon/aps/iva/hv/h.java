package com.amazon.aps.iva.hv;
/* compiled from: CrunchylistSearchPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.iv.b>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ j h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(1);
        this.h = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.j8.h<com.amazon.aps.iva.iv.b> hVar) {
        com.amazon.aps.iva.j8.h<com.amazon.aps.iva.iv.b> hVar2 = hVar;
        com.amazon.aps.iva.yb0.j.f(hVar2, "crunchylistSearchPagedList");
        boolean isEmpty = hVar2.isEmpty();
        j jVar = this.h;
        if (isEmpty) {
            j.q6(jVar).qb();
        } else {
            j.q6(jVar).K4();
        }
        j.q6(jVar).V2(hVar2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
