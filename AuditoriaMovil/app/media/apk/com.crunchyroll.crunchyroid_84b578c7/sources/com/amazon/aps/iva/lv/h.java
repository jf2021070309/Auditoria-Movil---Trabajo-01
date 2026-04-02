package com.amazon.aps.iva.lv;

import com.amazon.aps.iva.cv.u;
import com.amazon.aps.iva.qv.z;
import com.amazon.aps.iva.xu.d;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: CrunchylistsModule.kt */
/* loaded from: classes2.dex */
public final class h implements g {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] g = {com.amazon.aps.iva.k.q.a(h.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/crunchylists/crunchyliststab/CrunchylistsViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(h.class, "modifyCrunchylistViewModel", "getModifyCrunchylistViewModel()Lcom/ellation/crunchyroll/crunchylists/modifycrunchylist/ModifyCrunchylistViewModelImpl;", 0)};
    public final com.amazon.aps.iva.lv.a b;
    public final f c;
    public final com.amazon.aps.iva.ez.f d;
    public final com.amazon.aps.iva.ez.a e;
    public final com.amazon.aps.iva.kb0.m f;

    /* compiled from: CrunchylistsModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, z> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final z invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            com.amazon.aps.iva.xu.f fVar = com.amazon.aps.iva.e1.d.f;
            if (fVar != null) {
                EtpContentService etpContentService = fVar.c;
                com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
                return new z(new com.amazon.aps.iva.qv.h(etpContentService));
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: CrunchylistsModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<j> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final j invoke() {
            h hVar = h.this;
            com.amazon.aps.iva.lv.a aVar = hVar.b;
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = h.g;
            x xVar = (x) hVar.d.getValue(hVar, lVarArr[0]);
            z zVar = (z) hVar.e.getValue(hVar, lVarArr[1]);
            com.amazon.aps.iva.cv.u.c0.getClass();
            com.amazon.aps.iva.cv.v vVar = u.a.b;
            com.amazon.aps.iva.xu.f fVar = com.amazon.aps.iva.e1.d.f;
            if (fVar != null) {
                com.amazon.aps.iva.n60.b invoke = fVar.e.invoke();
                com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                com.amazon.aps.iva.xu.a a = d.a.a(com.amazon.aps.iva.ls.a.ALL_CRUNCHYLISTS, new i(hVar), 8);
                com.amazon.aps.iva.yb0.j.f(aVar, "view");
                com.amazon.aps.iva.yb0.j.f(vVar, "crunchylistStateMonitor");
                com.amazon.aps.iva.yb0.j.f(invoke, "screenReloadDebouncer");
                return new o(aVar, xVar, zVar, vVar, invoke, a);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: CrunchylistsModule.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, x> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final x invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            h hVar = h.this;
            return new x(hVar.c, hVar.b.getResources().getInteger(R.integer.crunchylists_loading_item_number));
        }
    }

    public h(com.amazon.aps.iva.lv.a aVar) {
        this.b = aVar;
        com.amazon.aps.iva.xu.f fVar = com.amazon.aps.iva.e1.d.f;
        if (fVar != null) {
            EtpContentService etpContentService = fVar.c;
            com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
            this.c = new f(etpContentService);
            this.d = new com.amazon.aps.iva.ez.f(aVar, x.class, new d());
            androidx.fragment.app.h requireActivity = aVar.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "fragment.requireActivity()");
            this.e = new com.amazon.aps.iva.ez.a(z.class, new c(requireActivity), a.h);
            this.f = com.amazon.aps.iva.kb0.f.b(new b());
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.lv.g
    public final j getPresenter() {
        return (j) this.f.getValue();
    }
}
