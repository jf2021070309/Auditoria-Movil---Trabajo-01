package com.amazon.aps.iva.t6;

import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.t6.j;
import com.amazon.aps.iva.t6.k;
import com.amazon.aps.iva.w5.o;
import com.amazon.aps.iva.w5.r;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: DefaultLoadErrorHandlingPolicy.java */
/* loaded from: classes.dex */
public final class i implements j {
    @Override // com.amazon.aps.iva.t6.j
    public final int a(int i) {
        if (i == 7) {
            return 6;
        }
        return 3;
    }

    @Override // com.amazon.aps.iva.t6.j
    public final j.b b(j.a aVar, j.c cVar) {
        boolean z;
        int i;
        IOException iOException = cVar.b;
        if (!(iOException instanceof r) || ((i = ((r) iOException).f) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        if (aVar.a(1)) {
            return new j.b(1, 300000L);
        }
        if (!aVar.a(2)) {
            return null;
        }
        return new j.b(2, 60000L);
    }

    @Override // com.amazon.aps.iva.t6.j
    public final long c(j.c cVar) {
        boolean z;
        Throwable th = cVar.b;
        if (!(th instanceof h0) && !(th instanceof FileNotFoundException) && !(th instanceof o) && !(th instanceof k.g)) {
            int i = com.amazon.aps.iva.w5.g.c;
            while (true) {
                if (th != null) {
                    if ((th instanceof com.amazon.aps.iva.w5.g) && ((com.amazon.aps.iva.w5.g) th).b == 2008) {
                        z = true;
                        break;
                    }
                    th = th.getCause();
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return Math.min((cVar.c - 1) * 1000, 5000);
            }
        }
        return -9223372036854775807L;
    }
}
