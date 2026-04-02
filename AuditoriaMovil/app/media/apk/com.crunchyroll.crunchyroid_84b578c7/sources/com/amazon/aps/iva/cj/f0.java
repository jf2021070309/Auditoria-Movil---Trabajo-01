package com.amazon.aps.iva.cj;

import com.amazon.aps.iva.ve0.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PlayerSettingsAdapter.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.PlayerSettingsAdapterImpl$init$5", f = "PlayerSettingsAdapter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.kj.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ u0<com.amazon.aps.iva.nk.i> i;
    public final /* synthetic */ com.amazon.aps.iva.k.w j;
    public final /* synthetic */ com.amazon.aps.iva.uj.c k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(u0<com.amazon.aps.iva.nk.i> u0Var, com.amazon.aps.iva.k.w wVar, com.amazon.aps.iva.uj.c cVar, com.amazon.aps.iva.ob0.d<? super f0> dVar) {
        super(2, dVar);
        this.i = u0Var;
        this.j = wVar;
        this.k = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        f0 f0Var = new f0(this.i, this.j, this.k, dVar);
        f0Var.h = obj;
        return f0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.kj.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((f0) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        String str2 = this.i.getValue().e;
        List<com.amazon.aps.iva.kj.d> e = ((com.amazon.aps.iva.kj.c) this.h).e();
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(e));
        for (com.amazon.aps.iva.kj.d dVar : e) {
            arrayList.add(dVar.a);
        }
        if (!arrayList.contains(str2)) {
            com.amazon.aps.iva.k.w wVar = this.j;
            wVar.getClass();
            com.amazon.aps.iva.yb0.j.f(str2, "languageTag");
            Iterator<T> it = ((com.amazon.aps.iva.jh.i) wVar.b).readFallback().iterator();
            while (true) {
                str = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.jh.e) obj2).b(), str2)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            com.amazon.aps.iva.jh.e eVar = (com.amazon.aps.iva.jh.e) obj2;
            if (eVar != null) {
                Iterator<T> it2 = eVar.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (arrayList.contains((String) next)) {
                        str = next;
                        break;
                    }
                }
                str = str;
            }
            if (str != null) {
                this.k.b(str);
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
