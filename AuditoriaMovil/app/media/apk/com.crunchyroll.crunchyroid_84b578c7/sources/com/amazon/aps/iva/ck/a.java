package com.amazon.aps.iva.ck;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.t6.i;
import com.amazon.aps.iva.t6.j;
import com.amazon.aps.iva.w5.p;
import com.amazon.aps.iva.w5.r;
import java.io.IOException;
/* compiled from: InfiniteNetworkErrorRetryErrorPolicy.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes.dex */
public final class a implements j {
    public final j a;
    public final g b;

    public a(i iVar, g gVar) {
        this.a = iVar;
        this.b = gVar;
    }

    @Override // com.amazon.aps.iva.t6.j
    public final int a(int i) {
        return Integer.MAX_VALUE;
    }

    @Override // com.amazon.aps.iva.t6.j
    public final j.b b(j.a aVar, j.c cVar) {
        return this.a.b(aVar, cVar);
    }

    @Override // com.amazon.aps.iva.t6.j
    public final long c(j.c cVar) {
        IOException iOException = cVar.b;
        boolean z = iOException instanceof p;
        boolean z2 = iOException instanceof r;
        com.amazon.aps.iva.yb0.j.e(iOException, "loadErrorInfo.exception");
        long j = -9223372036854775807L;
        if (this.b.a(iOException)) {
            return -9223372036854775807L;
        }
        j jVar = this.a;
        if (z && !z2) {
            return jVar.c(cVar);
        }
        if (cVar.c < 5) {
            j = jVar.c(cVar);
        }
        return j;
    }
}
