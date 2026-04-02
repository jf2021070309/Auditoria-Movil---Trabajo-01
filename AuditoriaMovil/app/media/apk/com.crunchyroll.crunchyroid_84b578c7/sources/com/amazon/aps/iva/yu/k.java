package com.amazon.aps.iva.yu;

import androidx.fragment.app.Fragment;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: AddToCrunchylistModule.kt */
/* loaded from: classes2.dex */
public final class k implements j {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] f = {com.amazon.aps.iva.k.q.a(k.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/crunchylists/addtocrunchylist/AddToCrunchylistViewModelImpl;", 0)};
    public final e a;
    public final com.amazon.aps.iva.bv.d b;
    public final i c;
    public final com.amazon.aps.iva.ez.f d;
    public final com.amazon.aps.iva.kb0.m e;

    /* compiled from: AddToCrunchylistModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<l> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final l invoke() {
            k kVar = k.this;
            e eVar = kVar.a;
            com.amazon.aps.iva.fc0.l<?> lVar = k.f[0];
            Fragment parentFragment = kVar.a.getParentFragment();
            com.amazon.aps.iva.yb0.j.d(parentFragment, "null cannot be cast to non-null type com.ellation.crunchyroll.crunchylists.crunchylistsdialog.CrunchylistsRouterProvider");
            com.amazon.aps.iva.gv.g X7 = ((com.amazon.aps.iva.gv.h) parentFragment).X7();
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.ADD_TO_CRUNCHYLIST_MODAL;
            com.amazon.aps.iva.bv.d dVar = kVar.b;
            com.amazon.aps.iva.yb0.j.f(dVar, "input");
            com.amazon.aps.iva.yb0.j.f(aVar, "screen");
            com.amazon.aps.iva.yu.b bVar = com.amazon.aps.iva.yu.b.h;
            com.amazon.aps.iva.yb0.j.f(bVar, "createTimer");
            d dVar2 = new d(dVar, cVar, aVar, bVar);
            com.amazon.aps.iva.yb0.j.f(eVar, "view");
            com.amazon.aps.iva.yb0.j.f(X7, "router");
            return new q(eVar, (w) kVar.d.getValue(kVar, lVar), X7, dVar2);
        }
    }

    /* compiled from: AddToCrunchylistModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, w> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final w invoke(androidx.lifecycle.p pVar) {
            androidx.lifecycle.p pVar2 = pVar;
            com.amazon.aps.iva.yb0.j.f(pVar2, "it");
            k kVar = k.this;
            return new w(pVar2, kVar.c, kVar.b.b);
        }
    }

    public k(e eVar, com.amazon.aps.iva.bv.d dVar) {
        this.a = eVar;
        this.b = dVar;
        com.amazon.aps.iva.xu.f fVar = com.amazon.aps.iva.e1.d.f;
        if (fVar != null) {
            EtpContentService etpContentService = fVar.c;
            com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
            this.c = new i(etpContentService);
            this.d = new com.amazon.aps.iva.ez.f(eVar, w.class, new b());
            this.e = com.amazon.aps.iva.kb0.f.b(new a());
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.yu.j
    public final l getPresenter() {
        return (l) this.e.getValue();
    }
}
