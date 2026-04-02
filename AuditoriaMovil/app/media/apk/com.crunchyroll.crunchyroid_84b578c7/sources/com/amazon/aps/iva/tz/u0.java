package com.amazon.aps.iva.tz;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.crunchyroll.connectivity.d;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: BrowseModule.kt */
/* loaded from: classes2.dex */
public final class u0 implements com.ellation.crunchyroll.presentation.browse.c {
    public final Fragment b;
    public final com.amazon.aps.iva.mn.j c;
    public final z0 d;
    public final com.amazon.aps.iva.ab.t e;
    public final k1 f;
    public final com.amazon.aps.iva.kb0.m g;

    /* compiled from: BrowseModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oh.g> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.oh.g invoke() {
            androidx.fragment.app.h requireActivity = u0.this.b.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "fragment.requireActivity()");
            return ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).y.b(requireActivity, com.amazon.aps.iva.ls.a.BROWSE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.amazon.aps.iva.tz.u0$b] */
    public u0(Fragment fragment, com.amazon.aps.iva.mn.o oVar) {
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        this.b = fragment;
        com.amazon.aps.iva.a00.b.Companion.getClass();
        this.c = new com.amazon.aps.iva.mn.j(com.amazon.aps.iva.ee0.f1.K(com.amazon.aps.iva.a00.b.Popularity, com.amazon.aps.iva.a00.b.NewlyAdded, com.amazon.aps.iva.a00.b.Alphabetical), q0.d, oVar, q0.e);
        z0 z0Var = new z0();
        this.d = z0Var;
        this.e = new com.amazon.aps.iva.ab.t();
        Context requireContext = fragment.requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "fragment.requireContext()");
        androidx.lifecycle.g lifecycle = fragment.getLifecycle();
        com.amazon.aps.iva.yb0.j.e(lifecycle, "fragment.lifecycle");
        this.f = new k1(d.a.a(requireContext, lifecycle), new com.amazon.aps.iva.yb0.t(this) { // from class: com.amazon.aps.iva.tz.u0.b
            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
            public final Object get() {
                ((u0) this.receiver).getClass();
                CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
                return new q(CrunchyrollApplication.a.a().e().getEtpContentService());
            }
        }, z0Var);
        this.g = com.amazon.aps.iva.kb0.f.b(new a());
    }

    @Override // com.amazon.aps.iva.mn.k
    public final com.amazon.aps.iva.mn.j a() {
        return this.c;
    }

    @Override // com.ellation.crunchyroll.presentation.browse.c
    public final com.amazon.aps.iva.oh.g b() {
        return (com.amazon.aps.iva.oh.g) this.g.getValue();
    }

    @Override // com.ellation.crunchyroll.presentation.browse.c
    public final y0 c() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.mn.k
    public final com.amazon.aps.iva.mn.h d() {
        return this.e;
    }

    @Override // com.ellation.crunchyroll.presentation.browse.c
    public final k1 e() {
        return this.f;
    }
}
