package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.b0.c;
import java.util.concurrent.CancellationException;
/* compiled from: BringIntoViewRequestPriorityQueue.kt */
/* loaded from: classes.dex */
public final class b {
    public final com.amazon.aps.iva.p0.f<c.a> a = new com.amazon.aps.iva.p0.f<>(new c.a[16]);

    public final void a(CancellationException cancellationException) {
        com.amazon.aps.iva.p0.f<c.a> fVar = this.a;
        int i = fVar.d;
        com.amazon.aps.iva.se0.m[] mVarArr = new com.amazon.aps.iva.se0.m[i];
        for (int i2 = 0; i2 < i; i2++) {
            mVarArr[i2] = fVar.b[i2].b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            mVarArr[i3].J(cancellationException);
        }
        if (fVar.i()) {
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void b() {
        com.amazon.aps.iva.p0.f<c.a> fVar = this.a;
        int i = 0;
        int i2 = new com.amazon.aps.iva.ec0.j(0, fVar.d - 1).c;
        if (i2 >= 0) {
            while (true) {
                fVar.b[i].b.resumeWith(com.amazon.aps.iva.kb0.q.a);
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        fVar.f();
    }
}
