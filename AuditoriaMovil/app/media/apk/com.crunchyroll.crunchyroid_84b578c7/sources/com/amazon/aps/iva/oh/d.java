package com.amazon.aps.iva.oh;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.oh.b;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: MarkAsWatchedPresenter.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.wy.b<i> implements c {
    public final g b;

    /* compiled from: MarkAsWatchedPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<b, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(b bVar) {
            b bVar2 = bVar;
            j.f(bVar2, "$this$observeEvent");
            boolean z = bVar2 instanceof b.a;
            d dVar = d.this;
            if (z) {
                dVar.getView().bg();
            } else if (bVar2 instanceof b.c) {
                dVar.getView().Ce(((b.c) bVar2).a);
            } else if (bVar2 instanceof b.C0573b) {
                dVar.getView().F2();
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, g gVar) {
        super(iVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(iVar, "view");
        j.f(gVar, "viewModel");
        this.b = gVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        com.amazon.aps.iva.ez.e.a(this.b.E7(), getView(), new a());
    }
}
