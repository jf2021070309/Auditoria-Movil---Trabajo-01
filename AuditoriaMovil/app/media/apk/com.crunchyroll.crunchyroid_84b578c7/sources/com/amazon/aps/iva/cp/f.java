package com.amazon.aps.iva.cp;

import com.amazon.aps.iva.wy.j;
/* compiled from: LanguageUnavailablePresenter.kt */
/* loaded from: classes2.dex */
public final class f<T> extends com.amazon.aps.iva.wy.b<g> implements e {
    public final c<T> b;
    public final b<T> c;
    public final d d;

    public f(a aVar, c cVar, b bVar, h hVar) {
        super(aVar, new j[0]);
        this.b = cVar;
        this.c = bVar;
        this.d = hVar;
    }

    @Override // com.amazon.aps.iva.cp.e
    public final void P2() {
        this.c.nf(this.b.e);
        getView().dismiss();
    }

    @Override // com.amazon.aps.iva.cp.e
    public final void c() {
        getView().dismiss();
    }

    @Override // com.amazon.aps.iva.cp.e
    public final void e6() {
        getView().dismiss();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        c<T> cVar = this.b;
        String str = cVar.c;
        d dVar = this.d;
        getView().T6(dVar.a(str));
        getView().s4(dVar.b(cVar.d));
        getView().qa(dVar.c(cVar.d));
        getView().e9(cVar.b);
    }
}
