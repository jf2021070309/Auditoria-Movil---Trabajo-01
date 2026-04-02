package com.amazon.aps.iva.p50;

import com.amazon.aps.iva.i5.u;
import com.amazon.aps.iva.i5.v;
import com.ellation.crunchyroll.api.etp.contentreviews.model.ContentRating;
/* compiled from: ShowRatingDialogViewModel.kt */
/* loaded from: classes2.dex */
public final class r implements p {
    public final com.amazon.aps.iva.n50.c a;
    public final com.amazon.aps.iva.m50.b b;
    public final u c;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.n50.e>>> d;
    public boolean e;

    public r(com.amazon.aps.iva.n50.d dVar) {
        this.a = dVar;
        this.b = dVar.e;
        this.c = com.amazon.aps.iva.ez.h.b(dVar.f, q.h);
        this.d = dVar.g;
    }

    @Override // com.amazon.aps.iva.p50.p
    public final void a() {
        this.e = false;
    }

    @Override // com.amazon.aps.iva.p50.p
    public final boolean b() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.p50.p
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.n50.e>>> c() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.p50.p
    public final void d() {
        this.e = true;
    }

    @Override // com.amazon.aps.iva.p50.p
    public final u e() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.p50.p
    public final void g0(ContentRating contentRating) {
        com.amazon.aps.iva.yb0.j.f(contentRating, "newRating");
        this.a.g0(contentRating);
    }

    @Override // com.amazon.aps.iva.p50.p
    public final com.amazon.aps.iva.m50.b getInput() {
        return this.b;
    }
}
