package com.amazon.aps.iva.bw;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
/* compiled from: DashDrmLicenseManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.drm.DashDrmLicenseManagerImpl$downloadLicense$1", f = "DashDrmLicenseManager.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<byte[], q> j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, q> k;
    public final /* synthetic */ g l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(com.amazon.aps.iva.xb0.l<? super byte[], q> lVar, com.amazon.aps.iva.xb0.l<? super Throwable, q> lVar2, g gVar, String str, String str2, String str3, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(2, dVar);
        this.j = lVar;
        this.k = lVar2;
        this.l = gVar;
        this.m = str;
        this.n = str2;
        this.o = str3;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        f fVar = new f(this.j, this.k, this.l, this.m, this.n, this.o, dVar);
        fVar.i = obj;
        return fVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((f) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object H;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        try {
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                g0 g0Var = (g0) this.i;
                g gVar = this.l;
                String str = this.m;
                String str2 = this.n;
                String str3 = this.o;
                a aVar2 = gVar.c;
                this.h = 1;
                obj = aVar2.b(str, str2, str3);
                if (obj == aVar) {
                    return aVar;
                }
            }
            H = (byte[]) obj;
        } catch (Throwable th) {
            H = x.H(th);
        }
        if (!(H instanceof k.a)) {
            this.j.invoke(H);
        }
        Throwable a = com.amazon.aps.iva.kb0.k.a(H);
        if (a != null) {
            this.k.invoke(a);
        }
        return q.a;
    }
}
