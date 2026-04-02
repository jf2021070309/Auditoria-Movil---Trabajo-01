package com.amazon.aps.iva.nm;

import android.content.Context;
import com.amazon.aps.iva.g8.k0;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.h8.m;
import com.amazon.aps.iva.nm.c;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.y.q;
import com.amazon.aps.iva.y.r0;
import com.amazon.aps.iva.y.t0;
import com.amazon.aps.iva.yb0.l;
import com.google.android.gms.cast.MediaError;
/* compiled from: ProfileNavHost.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: ProfileNavHost.kt */
    /* renamed from: com.amazon.aps.iva.nm.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0542a extends l implements com.amazon.aps.iva.xb0.l<q<com.amazon.aps.iva.g8.f>, r0> {
        public static final C0542a h = new C0542a();

        public C0542a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final r0 invoke(q<com.amazon.aps.iva.g8.f> qVar) {
            com.amazon.aps.iva.yb0.j.f(qVar, "$this$NavHost");
            return r0.a;
        }
    }

    /* compiled from: ProfileNavHost.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<q<com.amazon.aps.iva.g8.f>, t0> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final t0 invoke(q<com.amazon.aps.iva.g8.f> qVar) {
            com.amazon.aps.iva.yb0.j.f(qVar, "$this$NavHost");
            return t0.a;
        }
    }

    /* compiled from: ProfileNavHost.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<k0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.ui.c<com.amazon.aps.iva.nm.c> h;
        public final /* synthetic */ Context i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, com.amazon.aps.iva.ui.c cVar) {
            super(1);
            this.h = cVar;
            this.i = context;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(k0 k0Var) {
            k0 k0Var2 = k0Var;
            com.amazon.aps.iva.yb0.j.f(k0Var2, "$this$NavHost");
            com.amazon.aps.iva.ui.c<com.amazon.aps.iva.nm.c> cVar = this.h;
            com.amazon.aps.iva.yb0.j.f(cVar, "navigator");
            Context context = this.i;
            com.amazon.aps.iva.yb0.j.f(context, "context");
            com.amazon.aps.iva.g8.t0 t0Var = k0Var2.g;
            k0 k0Var3 = new k0(t0Var, "switch_profile", "switch_profile_route");
            c.f fVar = c.f.a;
            n.y(k0Var3, fVar, com.amazon.aps.iva.v0.b.c(1687650134, new h(false, cVar), true));
            c.b bVar = c.b.a;
            n.y(k0Var3, bVar, com.amazon.aps.iva.v0.b.c(1376447952, new com.amazon.aps.iva.nm.d(cVar), true));
            c.a aVar = c.a.a;
            n.y(k0Var3, aVar, com.amazon.aps.iva.v0.b.c(-423369534, new com.amazon.aps.iva.nm.b(cVar), true));
            c.d dVar = c.d.a;
            n.y(k0Var3, dVar, com.amazon.aps.iva.v0.b.c(-703637601, new f(context, cVar), true));
            c.e eVar = c.e.a;
            n.y(k0Var3, eVar, com.amazon.aps.iva.v0.b.c(298055530, new g(context, cVar), true));
            c.C0543c c0543c = c.C0543c.a;
            n.y(k0Var3, c0543c, com.amazon.aps.iva.v0.b.c(-1744966446, new e(cVar), true));
            k0Var2.c(k0Var3);
            k0 k0Var4 = new k0(t0Var, "switch_profile", "who_is_watching_route");
            n.y(k0Var4, fVar, com.amazon.aps.iva.v0.b.c(1687650134, new h(true, cVar), true));
            n.y(k0Var4, bVar, com.amazon.aps.iva.v0.b.c(1376447952, new com.amazon.aps.iva.nm.d(cVar), true));
            n.y(k0Var4, aVar, com.amazon.aps.iva.v0.b.c(-423369534, new com.amazon.aps.iva.nm.b(cVar), true));
            n.y(k0Var4, dVar, com.amazon.aps.iva.v0.b.c(-703637601, new f(context, cVar), true));
            n.y(k0Var4, eVar, com.amazon.aps.iva.v0.b.c(298055530, new g(context, cVar), true));
            n.y(k0Var4, c0543c, com.amazon.aps.iva.v0.b.c(-1744966446, new e(cVar), true));
            k0Var2.c(k0Var4);
            k0 k0Var5 = new k0(t0Var, "edit_profile", "profile_activation_route");
            n.y(k0Var5, bVar, com.amazon.aps.iva.v0.b.c(1376447952, new com.amazon.aps.iva.nm.d(cVar), true));
            n.y(k0Var5, dVar, com.amazon.aps.iva.v0.b.c(-703637601, new f(context, cVar), true));
            n.y(k0Var5, eVar, com.amazon.aps.iva.v0.b.c(298055530, new g(context, cVar), true));
            k0Var2.c(k0Var5);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ProfileNavHost.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ m0 h;
        public final /* synthetic */ com.amazon.aps.iva.ui.c<com.amazon.aps.iva.nm.c> i;
        public final /* synthetic */ j j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m0 m0Var, com.amazon.aps.iva.ui.c<com.amazon.aps.iva.nm.c> cVar, j jVar, int i) {
            super(2);
            this.h = m0Var;
            this.i = cVar;
            this.j = jVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.k | 1);
            com.amazon.aps.iva.ui.c<com.amazon.aps.iva.nm.c> cVar = this.i;
            j jVar = this.j;
            a.a(this.h, cVar, jVar, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(m0 m0Var, com.amazon.aps.iva.ui.c<com.amazon.aps.iva.nm.c> cVar, j jVar, com.amazon.aps.iva.o0.i iVar, int i) {
        com.amazon.aps.iva.yb0.j.f(m0Var, "navController");
        com.amazon.aps.iva.yb0.j.f(cVar, "navigator");
        com.amazon.aps.iva.yb0.j.f(jVar, "startRoute");
        com.amazon.aps.iva.o0.j g = iVar.g(1435034071);
        e0.b bVar = e0.a;
        m.b(m0Var, jVar.a, null, null, null, C0542a.h, b.h, null, null, new c((Context) g.i(androidx.compose.ui.platform.d.b), cVar), g, 1769480, MediaError.DetailedErrorCode.HLS_MANIFEST_PLAYLIST);
        j2 X = g.X();
        if (X != null) {
            X.d = new d(m0Var, cVar, jVar, i);
        }
    }
}
