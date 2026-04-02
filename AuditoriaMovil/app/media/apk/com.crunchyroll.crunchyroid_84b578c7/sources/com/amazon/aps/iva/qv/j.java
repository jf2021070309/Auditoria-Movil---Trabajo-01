package com.amazon.aps.iva.qv;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.gv.i;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: ModifyCrunchylistModule.kt */
/* loaded from: classes2.dex */
public final class j implements i {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] j = {com.amazon.aps.iva.k.q.a(j.class, "modifyCrunchylistViewModel", "getModifyCrunchylistViewModel()Lcom/ellation/crunchyroll/crunchylists/modifycrunchylist/ModifyCrunchylistViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(j.class, "addToCrunchylistViewModel", "getAddToCrunchylistViewModel()Lcom/ellation/crunchyroll/crunchylists/addtocrunchylist/AddToCrunchylistViewModelImpl;", 0)};
    public final com.amazon.aps.iva.qv.c b;
    public final com.amazon.aps.iva.gv.i c;
    public final h d;
    public final com.amazon.aps.iva.yu.i e;
    public final com.amazon.aps.iva.ez.a f;
    public final com.amazon.aps.iva.ez.f g;
    public final com.amazon.aps.iva.kb0.m h;
    public final com.amazon.aps.iva.ty.d i;

    /* compiled from: ModifyCrunchylistModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.yu.w> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.yu.w invoke(androidx.lifecycle.p pVar) {
            androidx.lifecycle.p pVar2 = pVar;
            com.amazon.aps.iva.yb0.j.f(pVar2, "it");
            j jVar = j.this;
            com.amazon.aps.iva.yu.i iVar = jVar.e;
            com.amazon.aps.iva.gv.i iVar2 = jVar.c;
            com.amazon.aps.iva.yb0.j.d(iVar2, "null cannot be cast to non-null type com.ellation.crunchyroll.crunchylists.crunchylistsdialog.ModifyCrunchylistAction.AddToCrunchylist");
            return new com.amazon.aps.iva.yu.w(pVar2, iVar, ((i.a) iVar2).b.b);
        }
    }

    /* compiled from: ModifyCrunchylistModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, z> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final z invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            return new z(j.this.d);
        }
    }

    /* compiled from: ModifyCrunchylistModule.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<k> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final k invoke() {
            com.amazon.aps.iva.yu.w wVar;
            j jVar = j.this;
            com.amazon.aps.iva.qv.c cVar = jVar.b;
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = j.j;
            z zVar = (z) jVar.f.getValue(jVar, lVarArr[0]);
            com.amazon.aps.iva.gv.i iVar = jVar.c;
            if (iVar instanceof i.a) {
                wVar = (com.amazon.aps.iva.yu.w) jVar.g.getValue(jVar, lVarArr[1]);
            } else {
                wVar = null;
            }
            com.amazon.aps.iva.yu.w wVar2 = wVar;
            com.amazon.aps.iva.qv.c cVar2 = jVar.b;
            Fragment parentFragment = cVar2.getParentFragment();
            com.amazon.aps.iva.yb0.j.d(parentFragment, "null cannot be cast to non-null type com.ellation.crunchyroll.crunchylists.crunchylistsdialog.CrunchylistsRouterProvider");
            com.amazon.aps.iva.gv.g X7 = ((com.amazon.aps.iva.gv.h) parentFragment).X7();
            com.amazon.aps.iva.ds.c cVar3 = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.yb0.j.f(iVar, "modifyCrunchylistAction");
            a0 a0Var = a0.h;
            com.amazon.aps.iva.yb0.j.f(a0Var, "createTimer");
            c0 c0Var = new c0(iVar, cVar3, a0Var);
            Context requireContext = cVar2.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "fragment.requireContext()");
            boolean c = com.amazon.aps.iva.aq.k.n(requireContext).c();
            com.amazon.aps.iva.yb0.j.f(cVar, "view");
            com.amazon.aps.iva.yb0.j.f(X7, "router");
            return new r(cVar, zVar, wVar2, iVar, X7, c0Var, c);
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    public j(com.amazon.aps.iva.qv.c cVar, com.amazon.aps.iva.gv.i iVar) {
        this.b = cVar;
        this.c = iVar;
        com.amazon.aps.iva.xu.f fVar = com.amazon.aps.iva.e1.d.f;
        if (fVar != null) {
            EtpContentService etpContentService = fVar.c;
            com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
            this.d = new h(etpContentService);
            com.amazon.aps.iva.xu.f fVar2 = com.amazon.aps.iva.e1.d.f;
            if (fVar2 != null) {
                EtpContentService etpContentService2 = fVar2.c;
                com.amazon.aps.iva.yb0.j.f(etpContentService2, "etpContentService");
                this.e = new com.amazon.aps.iva.yu.i(etpContentService2);
                androidx.fragment.app.h requireActivity = cVar.requireActivity();
                com.amazon.aps.iva.yb0.j.e(requireActivity, "fragment.requireActivity()");
                this.f = new com.amazon.aps.iva.ez.a(z.class, new d(requireActivity), new b());
                this.g = new com.amazon.aps.iva.ez.f(cVar, com.amazon.aps.iva.yu.w.class, new a());
                this.h = com.amazon.aps.iva.kb0.f.b(new c());
                androidx.fragment.app.h requireActivity2 = cVar.requireActivity();
                com.amazon.aps.iva.yb0.j.e(requireActivity2, "fragment.requireActivity()");
                this.i = new com.amazon.aps.iva.ty.d(requireActivity2);
                return;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.qv.i
    public final com.amazon.aps.iva.ty.d a() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.qv.i
    public final k getPresenter() {
        return (k) this.h.getValue();
    }
}
