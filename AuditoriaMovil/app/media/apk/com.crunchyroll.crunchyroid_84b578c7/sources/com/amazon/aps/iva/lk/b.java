package com.amazon.aps.iva.lk;

import android.content.Context;
import com.amazon.aps.iva.a6.m;
import com.amazon.aps.iva.a6.m0;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ga0.h;
import com.amazon.aps.iva.ga0.i;
import com.amazon.aps.iva.ka0.c0;
import com.amazon.aps.iva.ka0.t;
import com.amazon.aps.iva.ka0.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nk.j;
import com.amazon.aps.iva.tj.b0;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.ve0.i0;
/* compiled from: MuxController.kt */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.lk.a {
    public final com.amazon.aps.iva.mk.a a;
    public final com.amazon.aps.iva.ve0.f<j> b;
    public c0<m> c;
    public com.amazon.aps.iva.xe0.d d;

    /* compiled from: MuxController.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.amazon.aps.iva.qj.b.values().length];
            iArr[com.amazon.aps.iva.qj.b.PORTRAIT.ordinal()] = 1;
            iArr[com.amazon.aps.iva.qj.b.LANDSCAPE.ordinal()] = 2;
            a = iArr;
            int[] iArr2 = new int[com.amazon.aps.iva.qj.c.values().length];
            iArr2[com.amazon.aps.iva.qj.c.NORMAL.ordinal()] = 1;
            iArr2[com.amazon.aps.iva.qj.c.FULLSCREEN.ordinal()] = 2;
            b = iArr2;
        }
    }

    public b(com.amazon.aps.iva.mk.a aVar, i0 i0Var) {
        this.a = aVar;
        this.b = i0Var;
    }

    @Override // com.amazon.aps.iva.lk.a
    public final void a(com.amazon.aps.iva.qj.b bVar) {
        c0<m> c0Var;
        com.amazon.aps.iva.yb0.j.f(bVar, "orientation");
        int i = a.a[bVar.ordinal()];
        if (i != 1) {
            if (i == 2 && (c0Var = this.c) != null) {
                c0Var.a(com.amazon.aps.iva.ca0.e.LANDSCAPE);
                return;
            }
            return;
        }
        c0<m> c0Var2 = this.c;
        if (c0Var2 != null) {
            c0Var2.a(com.amazon.aps.iva.ca0.e.PORTRAIT);
        }
    }

    @Override // com.amazon.aps.iva.lk.a
    public final void b(com.amazon.aps.iva.qj.c cVar) {
        c0<m> c0Var;
        com.amazon.aps.iva.yb0.j.f(cVar, "presentation");
        int i = a.b[cVar.ordinal()];
        if (i != 1) {
            if (i == 2 && (c0Var = this.c) != null) {
                v vVar = v.FULLSCREEN;
                com.amazon.aps.iva.yb0.j.f(vVar, "presentation");
                c0Var.b.l = vVar;
                return;
            }
            return;
        }
        c0<m> c0Var2 = this.c;
        if (c0Var2 != null) {
            v vVar2 = v.NORMAL;
            com.amazon.aps.iva.yb0.j.f(vVar2, "presentation");
            c0Var2.b.l = vVar2;
        }
    }

    @Override // com.amazon.aps.iva.lk.a
    public final void c(androidx.media3.ui.d dVar, m0 m0Var, com.amazon.aps.iva.mk.c cVar, b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(dVar, "playerView");
        Context context = dVar.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "playerView.context");
        com.amazon.aps.iva.mk.a aVar = this.a;
        String str = aVar.a;
        com.amazon.aps.iva.ga0.f fVar = new com.amazon.aps.iva.ga0.f();
        String str2 = aVar.b;
        if (str2 != null) {
            fVar.b("pnm", str2);
        }
        String str3 = aVar.c;
        if (str3 != null) {
            fVar.b("uusid", str3);
        }
        fVar.b("pve", "1.58.0");
        String str4 = aVar.a;
        if (str4 != null) {
            fVar.b("ake", str4);
        }
        m0Var.G1();
        Boolean valueOf = Boolean.valueOf(!m0Var.L);
        if (valueOf != null) {
            fVar.b("pauon", valueOf.toString());
        }
        Long valueOf2 = Long.valueOf(aVar.d);
        if (valueOf2 != null) {
            fVar.b("piiti", valueOf2.toString());
        }
        q qVar = q.a;
        com.amazon.aps.iva.ga0.g o0 = com.amazon.aps.iva.cq.b.o0(cVar);
        h hVar = new h();
        hVar.b("xdrty", "Widevine");
        i iVar = new i();
        com.amazon.aps.iva.ga0.d dVar2 = new com.amazon.aps.iva.ga0.d();
        String str5 = aVar.e.a;
        if (str5 != null) {
            dVar2.b("c1", str5);
        }
        com.amazon.aps.iva.ga0.e eVar = new com.amazon.aps.iva.ga0.e(fVar, o0, hVar, iVar, dVar2);
        com.amazon.aps.iva.yb0.j.f(str, "envKey");
        this.c = new c0<>(context, str, eVar, m0Var, dVar, null, new com.amazon.aps.iva.ka0.c());
        com.amazon.aps.iva.xe0.d j = z.j();
        com.amazon.aps.iva.ve0.f<j> fVar2 = this.b;
        com.amazon.aps.iva.dg.b.A(j, new a0(com.amazon.aps.iva.dg.b.m(new f(fVar2)), new c(this, null)));
        com.amazon.aps.iva.dg.b.A(j, new a0(com.amazon.aps.iva.dg.b.n(fVar2, d.h), new e(this, null)));
        this.d = j;
        c0<m> c0Var = this.c;
        com.amazon.aps.iva.yb0.j.c(c0Var);
        b0Var.invoke(c0Var);
    }

    @Override // com.amazon.aps.iva.lk.a
    public final void release() {
        com.amazon.aps.iva.xe0.d dVar = this.d;
        if (dVar != null) {
            z.l(dVar, null);
        }
        c0<m> c0Var = this.c;
        if (c0Var != null) {
            t<PlayerView, Player> tVar = c0Var.a;
            tVar.getClass();
            Object value = tVar.c.getValue(tVar, t.d[0]);
            if (value != null) {
                tVar.b.b(value, tVar.a);
            }
            c0Var.b.g();
        }
        this.c = null;
    }
}
