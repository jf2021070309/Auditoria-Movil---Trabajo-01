package com.amazon.aps.iva.xq;

import com.amazon.aps.iva.xq.f;
import java.util.concurrent.TimeUnit;
/* compiled from: DefaultViewUpdatePredicate.kt */
/* loaded from: classes2.dex */
public final class a implements r {
    public static final long c = TimeUnit.SECONDS.toNanos(30);
    public final long a;
    public long b;

    public a() {
        long j = c;
        this.a = j;
        this.b = System.nanoTime() - j;
    }

    @Override // com.amazon.aps.iva.xq.r
    public final boolean a(boolean z, f fVar) {
        boolean z2;
        boolean z3;
        if ((fVar instanceof f.d) && ((f.d) fVar).e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (System.nanoTime() - this.b > this.a) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z && !z2 && !z3) {
            return false;
        }
        this.b = System.nanoTime();
        return true;
    }
}
