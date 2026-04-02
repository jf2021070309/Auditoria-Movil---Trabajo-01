package com.amazon.aps.iva.hv;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.amazon.aps.iva.cv.u;
import com.amazon.aps.iva.cv.v;
import com.amazon.aps.iva.cv.z;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: CrunchylistSearchModule.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] g = {com.amazon.aps.iva.k.q.a(f.class, "crunchylistSearchViewModel", "getCrunchylistSearchViewModel()Lcom/ellation/crunchyroll/crunchylists/crunchylistsearch/CrunchylistSearchViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(f.class, "crunchylistViewModel", "getCrunchylistViewModel()Lcom/ellation/crunchyroll/crunchylists/crunchylist/CrunchylistViewModelImpl;", 0)};
    public final com.amazon.aps.iva.hv.a b;
    public final com.amazon.aps.iva.hv.d c;
    public final com.amazon.aps.iva.ez.f d;
    public final com.amazon.aps.iva.ez.a e;
    public final com.amazon.aps.iva.kb0.m f;

    /* compiled from: CrunchylistSearchModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, o> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final o invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            return new o(f.this.c);
        }
    }

    /* compiled from: CrunchylistSearchModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, z> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final z invoke(androidx.lifecycle.p pVar) {
            Object obj;
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            com.amazon.aps.iva.xu.f fVar = com.amazon.aps.iva.e1.d.f;
            com.amazon.aps.iva.cv.c cVar = null;
            if (fVar != null) {
                EtpContentService etpContentService = fVar.c;
                com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
                com.amazon.aps.iva.cv.e eVar = new com.amazon.aps.iva.cv.e(etpContentService);
                u.c0.getClass();
                v vVar = u.a.b;
                Intent intent = f.this.b.requireActivity().getIntent();
                com.amazon.aps.iva.yb0.j.e(intent, "fragment.requireActivity().intent");
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        obj = extras.getSerializable("CRUNCHYLIST_INPUT", com.amazon.aps.iva.cv.c.class);
                    } else {
                        obj = (com.amazon.aps.iva.cv.c) extras.getSerializable("CRUNCHYLIST_INPUT");
                    }
                    cVar = (com.amazon.aps.iva.cv.c) obj;
                }
                com.amazon.aps.iva.yb0.j.c(cVar);
                return new z(eVar, vVar, cVar);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: CrunchylistSearchModule.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<g> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final g invoke() {
            f fVar = f.this;
            com.amazon.aps.iva.hv.a aVar = fVar.b;
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = f.g;
            com.amazon.aps.iva.fc0.l<?> lVar = lVarArr[0];
            com.amazon.aps.iva.fc0.l<?> lVar2 = lVarArr[1];
            com.amazon.aps.iva.yb0.j.f(aVar, "view");
            return new j(aVar, (o) fVar.d.getValue(fVar, lVar), (z) fVar.e.getValue(fVar, lVar2));
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

    public f(com.amazon.aps.iva.hv.a aVar) {
        this.b = aVar;
        com.amazon.aps.iva.xu.f fVar = com.amazon.aps.iva.e1.d.f;
        if (fVar != null) {
            EtpContentService etpContentService = fVar.c;
            com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
            this.c = new com.amazon.aps.iva.hv.d(etpContentService);
            this.d = new com.amazon.aps.iva.ez.f(aVar, o.class, new a());
            androidx.fragment.app.h requireActivity = aVar.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "fragment.requireActivity()");
            this.e = new com.amazon.aps.iva.ez.a(z.class, new d(requireActivity), new b());
            this.f = com.amazon.aps.iva.kb0.f.b(new c());
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.hv.e
    public final g getPresenter() {
        return (g) this.f.getValue();
    }
}
