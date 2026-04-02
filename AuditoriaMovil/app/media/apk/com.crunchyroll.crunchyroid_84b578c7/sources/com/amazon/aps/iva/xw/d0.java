package com.amazon.aps.iva.xw;

import okhttp3.Call;
import okhttp3.Response;
/* compiled from: OkHttpCallExtensions.kt */
/* loaded from: classes2.dex */
public final class d0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.se0.t<Response> h;
    public final /* synthetic */ Call i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.amazon.aps.iva.se0.u uVar, Call call) {
        super(1);
        this.h = uVar;
        this.i = call;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        if (this.h.isCancelled()) {
            this.i.cancel();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
