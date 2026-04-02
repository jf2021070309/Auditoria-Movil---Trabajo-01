package com.amazon.aps.iva.jk;

import com.amazon.aps.iva.nk.g;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.g0;
/* compiled from: PlayerSessionHeartbeatListener.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.listeners.PlayerSessionHeartbeatListener$sendSessionHeartbeat$1$1", f = "PlayerSessionHeartbeatListener.kt", l = {175}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ j i;
    public final /* synthetic */ com.amazon.aps.iva.nk.h j;

    /* compiled from: PlayerSessionHeartbeatListener.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.h, com.amazon.aps.iva.nk.h> {
        public final /* synthetic */ com.amazon.aps.iva.nk.g h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.nk.g gVar) {
            super(1);
            this.h = gVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.h invoke(com.amazon.aps.iva.nk.h hVar) {
            com.amazon.aps.iva.nk.h hVar2 = hVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "$this$set");
            return com.amazon.aps.iva.nk.h.a(hVar2, ((g.a) this.h).a, null, null, 6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(j jVar, com.amazon.aps.iva.nk.h hVar, com.amazon.aps.iva.ob0.d<? super r> dVar) {
        super(2, dVar);
        this.i = jVar;
        this.j = hVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new r(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((r) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        com.amazon.aps.iva.nk.h hVar = this.j;
        j jVar = this.i;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.p0.e eVar = jVar.f;
            String str = hVar.b;
            com.amazon.aps.iva.yb0.j.c(str);
            long a2 = jVar.e.a();
            String str2 = hVar.c;
            com.amazon.aps.iva.yb0.j.c(str2);
            this.h = 1;
            obj = ((com.amazon.aps.iva.zj.e) ((com.amazon.aps.iva.yj.a) eVar.b).c.a).c(str, str2, a2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        com.amazon.aps.iva.nk.g gVar = (com.amazon.aps.iva.nk.g) obj;
        if (gVar instanceof g.a) {
            com.amazon.aps.iva.ve0.g0<com.amazon.aps.iva.nk.h> g0Var = jVar.d;
            a aVar2 = new a(gVar);
            com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
            g0Var.setValue(aVar2.invoke(g0Var.getValue()));
            c2 c2Var = jVar.n;
            if (c2Var != null) {
                c2Var.a(null);
            }
            jVar.n = null;
        } else if (gVar instanceof g.b) {
            g.b bVar = (g.b) gVar;
            Integer num = bVar.a;
            jVar.K();
            jVar.Q();
            jVar.h.invoke(num, bVar.b);
        } else if (gVar instanceof g.d) {
            String str3 = hVar.b;
            jVar.K();
            jVar.n = com.amazon.aps.iva.se0.i.d(jVar.b, null, null, new q(jVar, str3, hVar.c, null), 3);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
