package com.amazon.aps.iva.fe;

import com.amazon.aps.iva.es.k0;
import com.amazon.aps.iva.fe.h;
import com.amazon.aps.iva.js.e;
import com.amazon.aps.iva.ks.a;
/* compiled from: OtpAnalytics.kt */
/* loaded from: classes.dex */
public final class e implements d {
    public final com.amazon.aps.iva.ds.a a = com.amazon.aps.iva.ds.c.b;
    public final com.amazon.aps.iva.xb0.a<String> b;

    public e(h.a aVar) {
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.fe.d
    public final void a() {
        this.a.c(new com.amazon.aps.iva.es.j(com.amazon.aps.iva.ls.a.OTP_VALIDATION, new com.amazon.aps.iva.is.a[0]));
    }

    @Override // com.amazon.aps.iva.fe.d
    public final void b() {
        this.a.e(new com.amazon.aps.iva.es.q(a.C0456a.c(com.amazon.aps.iva.ls.a.OTP_VALIDATION, null)));
    }

    @Override // com.amazon.aps.iva.fe.d
    public final void c(String str) {
        this.a.e(new com.amazon.aps.iva.es.f(null, str, e.b.a, null));
    }

    @Override // com.amazon.aps.iva.fe.d
    public final void d(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new com.amazon.aps.iva.es.r(a.C0456a.c(com.amazon.aps.iva.ls.a.OTP_VALIDATION, bVar), 3));
    }

    @Override // com.amazon.aps.iva.fe.d
    public final void e() {
        this.a.e(new k0(null, this.b.invoke(), null, e.b.a, null));
    }
}
