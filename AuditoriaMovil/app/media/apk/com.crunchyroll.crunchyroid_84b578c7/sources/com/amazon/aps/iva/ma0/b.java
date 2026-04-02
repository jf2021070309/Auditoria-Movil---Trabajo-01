package com.amazon.aps.iva.ma0;

import com.amazon.aps.iva.a6.l;
import com.amazon.aps.iva.k6.o;
import com.amazon.aps.iva.k6.s;
import com.amazon.aps.iva.ka0.q;
import com.amazon.aps.iva.ka0.y;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.yb0.j;
import java.io.IOException;
/* compiled from: ErrorBinding.kt */
/* loaded from: classes4.dex */
public final class b implements l0.c {
    public final y b;

    public b(y yVar) {
        j.f(yVar, "collector");
        this.b = yVar;
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void Z(l lVar) {
        j.f(lVar, "error");
        y yVar = this.b;
        j.f(yVar, "<this>");
        int i = lVar.b;
        boolean z = false;
        int i2 = lVar.j;
        if (i2 == 1) {
            if (i2 == 1) {
                z = true;
            }
            com.amazon.aps.iva.cq.b.C(z);
            Throwable cause = lVar.getCause();
            cause.getClass();
            Exception exc = (Exception) cause;
            if (exc instanceof o.b) {
                if (exc.getCause() instanceof s.b) {
                    yVar.b(new q(i, "Unable to query device decoders", null));
                    return;
                }
                o.b bVar = (o.b) exc;
                boolean z2 = bVar.c;
                String str = bVar.e;
                String str2 = bVar.b;
                if (z2) {
                    yVar.b(new q(i, com.amazon.aps.iva.oa.a.a("No secure decoder for ", str2), str));
                    return;
                } else {
                    yVar.b(new q(i, com.amazon.aps.iva.oa.a.a("No decoder for ", str2), str));
                    return;
                }
            }
            yVar.b(new q(i, exc.getClass().getCanonicalName() + " - " + exc.getMessage(), null));
        } else if (i2 == 0) {
            if (i2 == 0) {
                z = true;
            }
            com.amazon.aps.iva.cq.b.C(z);
            Throwable cause2 = lVar.getCause();
            cause2.getClass();
            IOException iOException = (IOException) cause2;
            yVar.b(new q(i, iOException.getClass().getCanonicalName() + " - " + iOException.getMessage(), null));
        } else if (i2 == 2) {
            if (i2 == 2) {
                z = true;
            }
            com.amazon.aps.iva.cq.b.C(z);
            Throwable cause3 = lVar.getCause();
            cause3.getClass();
            RuntimeException runtimeException = (RuntimeException) cause3;
            yVar.b(new q(i, runtimeException.getClass().getCanonicalName() + " - " + runtimeException.getMessage(), null));
        } else {
            yVar.b(new q(i, l.class.getCanonicalName() + " - " + lVar.getMessage(), null));
        }
    }
}
