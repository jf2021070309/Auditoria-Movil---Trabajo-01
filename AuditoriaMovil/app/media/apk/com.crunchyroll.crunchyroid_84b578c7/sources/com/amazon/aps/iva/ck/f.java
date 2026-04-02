package com.amazon.aps.iva.ck;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.t6.j;
/* compiled from: PlayerLoadErrorHandlingPolicy.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes.dex */
public final class f implements j {
    public final j a;
    public j.c b;

    public f(j jVar) {
        this.a = jVar;
    }

    @Override // com.amazon.aps.iva.t6.j
    public final int a(int i) {
        return this.a.a(i);
    }

    @Override // com.amazon.aps.iva.t6.j
    public final j.b b(j.a aVar, j.c cVar) {
        return this.a.b(aVar, cVar);
    }

    @Override // com.amazon.aps.iva.t6.j
    @SuppressLint({"UnsafeOptInUsageError"})
    public final long c(j.c cVar) {
        this.b = cVar;
        return this.a.c(cVar);
    }
}
