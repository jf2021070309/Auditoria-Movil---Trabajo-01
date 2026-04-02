package com.amazon.aps.iva.hq;

import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.qc.a;
import com.amazon.aps.iva.sq.c;
import com.amazon.aps.iva.sq.e;
/* compiled from: DatadogRUMUncaughtThrowableStrategy.kt */
/* loaded from: classes2.dex */
public final class a implements a.c {
    public final String b;

    public a(String str) {
        this.b = str;
    }

    @Override // com.amazon.aps.iva.qc.a.c
    public final void a(Throwable th) {
        c.c.r(b.c(new StringBuilder("Glide "), this.b, " error"), e.SOURCE, th, a0.b);
    }
}
