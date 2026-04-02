package com.amazon.aps.iva.bw;

import android.net.Uri;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.google.common.collect.ImmutableList;
import java.util.List;
/* compiled from: DashDrmLicenseManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.drm.DashDrmLicenseManagerImpl$renewLicense$2$1$1$1", f = "DashDrmLicenseManager.kt", l = {138}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.se0.m<com.amazon.aps.iva.m6.m> j;
    public final /* synthetic */ g k;
    public final /* synthetic */ com.amazon.aps.iva.m6.m l;
    public final /* synthetic */ byte[] m;
    public final /* synthetic */ Stream n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(com.amazon.aps.iva.se0.m<? super com.amazon.aps.iva.m6.m> mVar, g gVar, com.amazon.aps.iva.m6.m mVar2, byte[] bArr, Stream stream, com.amazon.aps.iva.ob0.d<? super h> dVar) {
        super(2, dVar);
        this.j = mVar;
        this.k = gVar;
        this.l = mVar2;
        this.m = bArr;
        this.n = stream;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        h hVar = new h(this.j, this.k, this.l, this.m, this.n, dVar);
        hVar.i = obj;
        return hVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((h) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object H;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        Stream stream = this.n;
        com.amazon.aps.iva.m6.m mVar = this.l;
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
                a aVar2 = this.k.c;
                String str = mVar.b;
                com.amazon.aps.iva.yb0.j.e(str, "downloadRequest.id");
                String videoToken = stream.getVideoToken();
                String url = stream.getUrl();
                this.h = 1;
                obj = aVar2.a(str, videoToken, url, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            H = (byte[]) obj;
        } catch (Throwable th) {
            H = x.H(th);
        }
        boolean z = !(H instanceof k.a);
        com.amazon.aps.iva.se0.m<com.amazon.aps.iva.m6.m> mVar2 = this.j;
        if (z) {
            byte[] bArr = (byte[]) H;
            String url2 = stream.getUrl();
            String str2 = mVar.b;
            Uri parse = Uri.parse(url2);
            com.amazon.aps.iva.yb0.j.e(parse, "parse(this)");
            String str3 = mVar.g;
            byte[] bArr2 = mVar.h;
            String str4 = mVar.d;
            List list = mVar.e;
            if (list == null) {
                list = ImmutableList.of();
            }
            mVar2.resumeWith(new com.amazon.aps.iva.m6.m(str2, parse, str4, list, bArr, str3, bArr2));
        }
        Throwable a = com.amazon.aps.iva.kb0.k.a(H);
        if (a != null) {
            mVar2.resumeWith(x.H(a));
        }
        return q.a;
    }
}
