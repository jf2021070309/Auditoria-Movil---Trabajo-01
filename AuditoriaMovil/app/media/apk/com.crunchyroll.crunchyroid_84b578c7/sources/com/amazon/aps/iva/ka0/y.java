package com.amazon.aps.iva.ka0;

import com.amazon.aps.iva.ga0.b;
import com.amazon.aps.iva.se0.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: MuxStateCollector.kt */
/* loaded from: classes4.dex */
public final class y {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] y = {defpackage.e.b(y.class, "playerWatcher", "getPlayerWatcher()Lcom/mux/stats/sdk/muxstats/MuxStateCollector$PlayerWatcher;", 0)};
    public final a0 a;
    public final com.amazon.aps.iva.da0.f b;
    public u c;
    public boolean d;
    public String e;
    public long f;
    public long g;
    public int h;
    public float i;
    public int j;
    public int k;
    public List<? extends b.a> l;
    public Long m;
    public Long n;
    public Long o;
    public Long p;
    public Long q;
    public final z r;
    public List<? extends com.amazon.aps.iva.ga0.l> s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public final ArrayList<String> x;

    /* compiled from: MuxStateCollector.kt */
    /* loaded from: classes4.dex */
    public static final class a<Player> {
        public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] f = {com.amazon.aps.iva.k.q.a(a.class, "player", "getPlayer()Ljava/lang/Object;", 0)};
        public final long a;
        public final y b;
        public final com.amazon.aps.iva.xb0.p<Player, y, Long> c;
        public final com.amazon.aps.iva.xe0.d d;
        public final com.amazon.aps.iva.ba0.a e;

        public a(y yVar, com.amazon.aps.iva.a6.m mVar, e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "checkPositionMillis");
            this.a = 150L;
            this.b = yVar;
            this.c = e0Var;
            this.d = com.amazon.aps.iva.e.z.i(r0.a);
            this.e = new com.amazon.aps.iva.ba0.a(mVar);
        }

        public final void a(String str) {
            com.amazon.aps.iva.e.z.l(this.d, com.amazon.aps.iva.e.z.h(str, null));
        }
    }

    public y(a0 a0Var, com.amazon.aps.iva.da0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(a0Var, "muxStats");
        com.amazon.aps.iva.yb0.j.f(fVar, "dispatcher");
        this.a = a0Var;
        this.b = fVar;
        this.c = u.INIT;
        this.d = true;
        this.f = -1L;
        this.g = -1L;
        this.r = new z();
        List<? extends com.amazon.aps.iva.ga0.l> emptyList = Collections.emptyList();
        com.amazon.aps.iva.yb0.j.e(emptyList, "emptyList()");
        this.s = emptyList;
        this.x = new ArrayList<>();
    }

    public final /* synthetic */ void a(com.amazon.aps.iva.da0.a aVar) {
        String type = aVar.getType();
        if (type != null) {
            int hashCode = type.hashCode();
            if (hashCode != 3443508) {
                if (hashCode != 106440182) {
                    if (hashCode == 1971820138 && type.equals("seeking")) {
                        this.w++;
                    }
                } else if (type.equals("pause")) {
                    this.u++;
                }
            } else if (type.equals("play")) {
                this.v++;
            }
        }
        this.b.a(aVar);
    }

    public final void b(q qVar) {
        a(new com.amazon.aps.iva.da0.h(qVar.b, qVar.getMessage()));
    }

    public final void c() {
        u uVar = this.c;
        if (uVar == u.SEEKED && this.u > 0) {
            return;
        }
        if (uVar == u.REBUFFERING) {
            a(new com.amazon.aps.iva.fa0.l(null, 1));
        }
        if (this.t) {
            f();
            return;
        }
        this.c = u.PAUSED;
        a(new com.amazon.aps.iva.fa0.r(null, 0));
    }

    public final void d() {
        if (this.v > 0) {
            if (!this.t) {
                if (!(!com.amazon.aps.iva.lb0.o.N(new u[]{u.REBUFFERING, u.SEEKED}, this.c))) {
                    return;
                }
            } else {
                return;
            }
        }
        this.c = u.PLAY;
        a(new com.amazon.aps.iva.fa0.s(null, 0));
    }

    public final void e() {
        if (this.t) {
            com.amazon.aps.iva.ia0.b.a("MuxStats", "Ignoring playing event, seeking in progress !!!");
            return;
        }
        if (com.amazon.aps.iva.lb0.o.N(new u[]{u.PAUSED, u.FINISHED_PLAYING_ADS, u.INIT}, this.c)) {
            d();
        } else {
            u uVar = this.c;
            if (uVar == u.REBUFFERING) {
                a(new com.amazon.aps.iva.fa0.l(null, 1));
            } else if (uVar == u.PLAYING) {
                return;
            }
        }
        this.c = u.PLAYING;
        a(new com.amazon.aps.iva.fa0.k(null, 1));
    }

    public final void f() {
        if (this.t) {
            a(new com.amazon.aps.iva.fa0.q(null, 1));
            this.t = false;
            this.c = u.SEEKED;
        }
        if (this.w == 0) {
            this.t = false;
        }
    }
}
