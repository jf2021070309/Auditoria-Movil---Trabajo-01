package com.amazon.aps.iva.qz;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.ez.h;
import com.amazon.aps.iva.f00.r;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: AssetListViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.assets.AssetListViewModelImpl$reloadPlayheads$1", f = "AssetListViewModel.kt", l = {MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, 207}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public Object h;
    public Object i;
    public Object j;
    public c k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ c n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, com.amazon.aps.iva.ob0.d<? super e> dVar) {
        super(2, dVar);
        this.n = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        e eVar = new e(this.n, dVar);
        eVar.m = obj;
        return eVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((e) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        v<g<a>> vVar;
        Object H;
        v<g<a>> vVar2;
        c cVar;
        v<g<a>> vVar3;
        a aVar;
        com.amazon.aps.iva.e00.a aVar2;
        com.amazon.aps.iva.e00.a aVar3;
        a aVar4;
        c cVar2;
        com.amazon.aps.iva.pb0.a aVar5 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.l;
        ?? r3 = 1;
        try {
        } catch (Throwable th) {
            th = th;
            vVar = r3;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    cVar2 = this.k;
                    aVar4 = (a) this.j;
                    aVar3 = (com.amazon.aps.iva.e00.a) this.i;
                    v vVar4 = (v) this.h;
                    aVar = (a) this.m;
                    x.i0(obj);
                    r3 = vVar4;
                    ArrayList N8 = c.N8(cVar2, (List) obj, aVar.b);
                    aVar4.getClass();
                    j.f(aVar3, "rawData");
                    H = new a(aVar3, N8);
                    vVar2 = r3;
                    vVar2.k(h.e(H));
                    return q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (com.amazon.aps.iva.e00.a) this.j;
            vVar3 = (v) this.i;
            aVar = (a) this.h;
            cVar = (c) this.m;
            x.i0(obj);
        } else {
            x.i0(obj);
            g0 g0Var = (g0) this.m;
            c cVar3 = this.n;
            a Q8 = cVar3.Q8();
            if (Q8 != null) {
                vVar = cVar3.d;
                try {
                    com.amazon.aps.iva.e00.a aVar6 = Q8.a;
                    com.amazon.aps.iva.o40.c cVar4 = cVar3.c;
                    String[] L = k.L(aVar6.a);
                    this.m = cVar3;
                    this.h = Q8;
                    this.i = vVar;
                    this.j = aVar6;
                    this.l = 1;
                    Object o = cVar4.o((String[]) Arrays.copyOf(L, L.length), this);
                    if (o == aVar5) {
                        return aVar5;
                    }
                    cVar = cVar3;
                    obj = o;
                    vVar3 = vVar;
                    aVar = Q8;
                    aVar2 = aVar6;
                } catch (Throwable th2) {
                    th = th2;
                    H = x.H(th);
                    vVar2 = vVar;
                    vVar2.k(h.e(H));
                    return q.a;
                }
            }
            return q.a;
        }
        com.amazon.aps.iva.e00.a a = com.amazon.aps.iva.e00.a.a(aVar2, null, (Map) obj, 5);
        r rVar = cVar.b;
        this.m = aVar;
        this.h = vVar3;
        this.i = a;
        this.j = aVar;
        this.k = cVar;
        this.l = 2;
        Object d = rVar.d(a.a, a.b, a.c, this);
        if (d == aVar5) {
            return aVar5;
        }
        aVar3 = a;
        obj = d;
        aVar4 = aVar;
        cVar2 = cVar;
        r3 = vVar3;
        ArrayList N82 = c.N8(cVar2, (List) obj, aVar.b);
        aVar4.getClass();
        j.f(aVar3, "rawData");
        H = new a(aVar3, N82);
        vVar2 = r3;
        vVar2.k(h.e(H));
        return q.a;
    }
}
