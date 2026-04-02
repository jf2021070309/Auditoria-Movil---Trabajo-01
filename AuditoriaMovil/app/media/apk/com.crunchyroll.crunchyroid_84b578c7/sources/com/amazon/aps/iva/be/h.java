package com.amazon.aps.iva.be;

import android.content.Context;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.g8.k0;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.g8.t0;
import com.amazon.aps.iva.h8.e;
import com.amazon.aps.iva.h8.m;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.y.q;
import com.amazon.aps.iva.y.r0;
import com.amazon.aps.iva.y.t0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.google.android.gms.cast.MediaError;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
/* compiled from: AuthNavHost.kt */
/* loaded from: classes.dex */
public final class h {

    /* compiled from: AuthNavHost.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<q<com.amazon.aps.iva.g8.f>, r0> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final r0 invoke(q<com.amazon.aps.iva.g8.f> qVar) {
            j.f(qVar, "$this$NavHost");
            return r0.a;
        }
    }

    /* compiled from: AuthNavHost.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<q<com.amazon.aps.iva.g8.f>, t0> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final t0 invoke(q<com.amazon.aps.iva.g8.f> qVar) {
            j.f(qVar, "$this$NavHost");
            return t0.a;
        }
    }

    /* compiled from: AuthNavHost.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<k0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.ui.c<com.amazon.aps.iva.be.a> h;
        public final /* synthetic */ Context i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, com.amazon.aps.iva.ui.c cVar) {
            super(1);
            this.h = cVar;
            this.i = context;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(k0 k0Var) {
            boolean z;
            String str;
            k0 k0Var2 = k0Var;
            j.f(k0Var2, "$this$NavHost");
            com.amazon.aps.iva.ui.c<com.amazon.aps.iva.be.a> cVar = this.h;
            j.f(cVar, "navigator");
            Context context = this.i;
            j.f(context, "context");
            com.amazon.aps.iva.ui.a aVar = (com.amazon.aps.iva.ui.a) cVar.b.b("navigation_payload_input");
            if (!(aVar instanceof com.amazon.aps.iva.ui.a)) {
                aVar = null;
            }
            com.crunchyroll.auth.c cVar2 = (com.crunchyroll.auth.c) aVar;
            if (cVar2 != null && cVar2.f) {
                z = true;
            } else {
                z = false;
            }
            if (!z || k.n(context).b) {
                str = "log_in";
            } else {
                str = FirebaseAnalytics.Event.SIGN_UP;
            }
            k0 k0Var3 = new k0(k0Var2.g, str, "auth_route");
            com.amazon.aps.iva.v0.a c = com.amazon.aps.iva.v0.b.c(-767877940, new com.amazon.aps.iva.vi.c(com.amazon.aps.iva.v0.b.c(-1930069901, new e(cVar), true)), true);
            com.amazon.aps.iva.g8.t0 t0Var = k0Var3.g;
            t0Var.getClass();
            e.a aVar2 = new e.a((com.amazon.aps.iva.h8.e) t0Var.b(t0.a.a(com.amazon.aps.iva.h8.e.class)), c);
            aVar2.l(FirebaseAnalytics.Event.SIGN_UP);
            aVar2.l = null;
            aVar2.m = null;
            aVar2.n = null;
            aVar2.o = null;
            ArrayList arrayList = k0Var3.i;
            arrayList.add(aVar2);
            com.amazon.aps.iva.v0.a c2 = com.amazon.aps.iva.v0.b.c(-767877940, new com.amazon.aps.iva.vi.c(com.amazon.aps.iva.v0.b.c(-2098047092, new com.amazon.aps.iva.be.d(cVar), true)), true);
            t0Var.getClass();
            e.a aVar3 = new e.a((com.amazon.aps.iva.h8.e) t0Var.b(t0.a.a(com.amazon.aps.iva.h8.e.class)), c2);
            aVar3.l("log_in");
            aVar3.l = null;
            aVar3.m = null;
            aVar3.n = null;
            aVar3.o = null;
            arrayList.add(aVar3);
            com.amazon.aps.iva.v0.a c3 = com.amazon.aps.iva.v0.b.c(-767877940, new com.amazon.aps.iva.vi.c(com.amazon.aps.iva.v0.b.c(-1399978638, new com.amazon.aps.iva.be.b(cVar), true)), true);
            t0Var.getClass();
            e.a aVar4 = new e.a((com.amazon.aps.iva.h8.e) t0Var.b(t0.a.a(com.amazon.aps.iva.h8.e.class)), c3);
            aVar4.l("create_password");
            aVar4.l = null;
            aVar4.m = null;
            aVar4.n = null;
            aVar4.o = null;
            arrayList.add(aVar4);
            com.amazon.aps.iva.v0.a c4 = com.amazon.aps.iva.v0.b.c(-767877940, new com.amazon.aps.iva.vi.c(com.amazon.aps.iva.v0.b.c(1926913174, new com.amazon.aps.iva.be.c(cVar), true)), true);
            t0Var.getClass();
            e.a aVar5 = new e.a((com.amazon.aps.iva.h8.e) t0Var.b(t0.a.a(com.amazon.aps.iva.h8.e.class)), c4);
            aVar5.l("enter_password");
            aVar5.l = null;
            aVar5.m = null;
            aVar5.n = null;
            aVar5.o = null;
            arrayList.add(aVar5);
            com.amazon.aps.iva.v0.a c5 = com.amazon.aps.iva.v0.b.c(-767877940, new com.amazon.aps.iva.vi.c(com.amazon.aps.iva.v0.b.c(-303886755, new f(cVar), true)), true);
            t0Var.getClass();
            e.a aVar6 = new e.a((com.amazon.aps.iva.h8.e) t0Var.b(t0.a.a(com.amazon.aps.iva.h8.e.class)), c5);
            aVar6.l("verify_number");
            aVar6.l = null;
            aVar6.m = null;
            aVar6.n = null;
            aVar6.o = null;
            arrayList.add(aVar6);
            k0Var2.c(k0Var3);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AuthNavHost.kt */
    /* loaded from: classes.dex */
    public static final class d extends l implements p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ m0 h;
        public final /* synthetic */ com.amazon.aps.iva.ui.c<com.amazon.aps.iva.be.a> i;
        public final /* synthetic */ i j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m0 m0Var, com.amazon.aps.iva.ui.c<com.amazon.aps.iva.be.a> cVar, i iVar, int i) {
            super(2);
            this.h = m0Var;
            this.i = cVar;
            this.j = iVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.k | 1);
            com.amazon.aps.iva.ui.c<com.amazon.aps.iva.be.a> cVar = this.i;
            i iVar2 = this.j;
            h.a(this.h, cVar, iVar2, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(m0 m0Var, com.amazon.aps.iva.ui.c<com.amazon.aps.iva.be.a> cVar, i iVar, com.amazon.aps.iva.o0.i iVar2, int i) {
        j.f(m0Var, "navController");
        j.f(cVar, "navigator");
        j.f(iVar, "startRoute");
        com.amazon.aps.iva.o0.j g = iVar2.g(-1290035813);
        e0.b bVar = e0.a;
        m.b(m0Var, iVar.a, null, null, null, a.h, b.h, null, null, new c((Context) g.i(androidx.compose.ui.platform.d.b), cVar), g, 1769480, MediaError.DetailedErrorCode.HLS_MANIFEST_PLAYLIST);
        j2 X = g.X();
        if (X != null) {
            X.d = new d(m0Var, cVar, iVar, i);
        }
    }
}
