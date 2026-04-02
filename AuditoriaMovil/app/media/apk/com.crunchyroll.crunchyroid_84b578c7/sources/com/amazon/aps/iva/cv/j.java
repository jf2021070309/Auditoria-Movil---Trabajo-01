package com.amazon.aps.iva.cv;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.amazon.aps.iva.cv.u;
import com.amazon.aps.iva.qv.v;
import com.amazon.aps.iva.xu.d;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.crunchylists.crunchylist.CrunchylistActivity;
import com.ellation.crunchyroll.watchlist.a;
/* compiled from: CrunchylistModule.kt */
/* loaded from: classes2.dex */
public final class j {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] g = {com.amazon.aps.iva.k.q.a(j.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/crunchylists/crunchylist/CrunchylistViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(j.class, "reorderViewModel", "getReorderViewModel()Lcom/ellation/crunchyroll/crunchylists/crunchylist/reorder/CrunchylistReorderViewModelImpl;", 0)};
    public final CrunchylistActivity a;
    public final com.amazon.aps.iva.cv.e b;
    public final com.amazon.aps.iva.ez.a c;
    public final com.amazon.aps.iva.ez.a d;
    public final com.amazon.aps.iva.kb0.m e;
    public final com.amazon.aps.iva.kb0.m f;

    /* compiled from: CrunchylistModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.dv.d> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.dv.d invoke() {
            j jVar = j.this;
            return new com.amazon.aps.iva.dv.d(new com.amazon.aps.iva.ev.i(new g(jVar.b()), new h(jVar.b()), new i(jVar.b())), jVar.b(), (com.amazon.aps.iva.fv.b) jVar.d.getValue(jVar, j.g[1]));
        }
    }

    /* compiled from: CrunchylistModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<k> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final k invoke() {
            j jVar = j.this;
            CrunchylistActivity crunchylistActivity = jVar.a;
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = j.g;
            z zVar = (z) jVar.c.getValue(jVar, lVarArr[0]);
            com.amazon.aps.iva.fv.b bVar = (com.amazon.aps.iva.fv.b) jVar.d.getValue(jVar, lVarArr[1]);
            com.amazon.aps.iva.xu.f fVar = com.amazon.aps.iva.e1.d.f;
            if (fVar != null) {
                com.amazon.aps.iva.xu.e invoke = fVar.b.invoke(jVar.a);
                com.amazon.aps.iva.qv.v.l0.getClass();
                com.amazon.aps.iva.qv.w wVar = v.a.b;
                u.c0.getClass();
                v vVar = u.a.b;
                com.amazon.aps.iva.xu.f fVar2 = com.amazon.aps.iva.e1.d.f;
                if (fVar2 != null) {
                    com.amazon.aps.iva.n60.b invoke2 = fVar2.e.invoke();
                    com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                    com.amazon.aps.iva.xu.a a = d.a.a(com.amazon.aps.iva.ls.a.SINGLE_CRUNCHYLIST, null, 12);
                    com.ellation.crunchyroll.watchlist.a.u0.getClass();
                    com.ellation.crunchyroll.watchlist.a aVar = a.C0975a.b;
                    com.amazon.aps.iva.yb0.j.f(crunchylistActivity, "view");
                    com.amazon.aps.iva.yb0.j.f(invoke, "contentFlowRouter");
                    com.amazon.aps.iva.yb0.j.f(wVar, "modifyCrunchylistStateMonitor");
                    com.amazon.aps.iva.yb0.j.f(vVar, "crunchylistStateMonitor");
                    com.amazon.aps.iva.yb0.j.f(invoke2, "screenReloadDebouncer");
                    com.amazon.aps.iva.yb0.j.f(aVar, "watchlistChangeRegister");
                    return new p(crunchylistActivity, zVar, bVar, invoke, wVar, vVar, invoke2, a, aVar);
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: CrunchylistModule.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.fv.b> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.fv.b invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            j jVar = j.this;
            return new com.amazon.aps.iva.fv.b(jVar.b, (z) jVar.c.getValue(jVar, j.g[0]));
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

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: CrunchylistModule.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, z> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final z invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.cv.c cVar;
            Object obj;
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            j jVar = j.this;
            com.amazon.aps.iva.cv.e eVar = jVar.b;
            u.c0.getClass();
            v vVar = u.a.b;
            Intent intent = jVar.a.getIntent();
            com.amazon.aps.iva.yb0.j.e(intent, "activity.intent");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras.getSerializable("CRUNCHYLIST_INPUT", com.amazon.aps.iva.cv.c.class);
                } else {
                    obj = (com.amazon.aps.iva.cv.c) extras.getSerializable("CRUNCHYLIST_INPUT");
                }
                cVar = (com.amazon.aps.iva.cv.c) obj;
            } else {
                cVar = null;
            }
            com.amazon.aps.iva.yb0.j.c(cVar);
            return new z(eVar, vVar, cVar);
        }
    }

    public j(CrunchylistActivity crunchylistActivity) {
        com.amazon.aps.iva.yb0.j.f(crunchylistActivity, "activity");
        this.a = crunchylistActivity;
        com.amazon.aps.iva.xu.f fVar = com.amazon.aps.iva.e1.d.f;
        if (fVar != null) {
            EtpContentService etpContentService = fVar.c;
            com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
            this.b = new com.amazon.aps.iva.cv.e(etpContentService);
            this.c = new com.amazon.aps.iva.ez.a(z.class, new d(crunchylistActivity), new f());
            this.d = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.fv.b.class, new e(crunchylistActivity), new c());
            this.e = com.amazon.aps.iva.kb0.f.b(new b());
            this.f = com.amazon.aps.iva.kb0.f.b(new a());
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    public final com.amazon.aps.iva.dv.d a() {
        return (com.amazon.aps.iva.dv.d) this.f.getValue();
    }

    public final k b() {
        return (k) this.e.getValue();
    }
}
