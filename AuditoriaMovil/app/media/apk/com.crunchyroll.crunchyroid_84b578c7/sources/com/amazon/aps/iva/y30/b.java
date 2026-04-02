package com.amazon.aps.iva.y30;

import com.amazon.aps.iva.ks.a;
import java.io.IOException;
/* compiled from: ForgotPasswordAnalytics.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ds.a a;

    public b(com.amazon.aps.iva.ds.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.y30.a
    public final void a() {
        this.a.c(new com.amazon.aps.iva.es.j(com.amazon.aps.iva.ls.a.FORGOT_PASSWORD, new com.amazon.aps.iva.is.a[0]));
    }

    @Override // com.amazon.aps.iva.y30.a
    public final void b(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new com.amazon.aps.iva.es.w(a.C0456a.c(com.amazon.aps.iva.ls.a.FORGOT_PASSWORD, bVar), 3));
    }

    @Override // com.amazon.aps.iva.y30.a
    public final void c(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new com.amazon.aps.iva.es.x(a.C0456a.c(com.amazon.aps.iva.ls.a.FORGOT_PASSWORD, bVar)));
    }

    @Override // com.amazon.aps.iva.y30.a
    public final void d(com.amazon.aps.iva.fs.b bVar, IOException iOException) {
        com.amazon.aps.iva.ks.a c = a.C0456a.c(com.amazon.aps.iva.ls.a.FORGOT_PASSWORD, bVar);
        String message = iOException.getMessage();
        if (message == null) {
            message = "";
        }
        this.a.e(new com.amazon.aps.iva.es.k(c, message));
    }
}
