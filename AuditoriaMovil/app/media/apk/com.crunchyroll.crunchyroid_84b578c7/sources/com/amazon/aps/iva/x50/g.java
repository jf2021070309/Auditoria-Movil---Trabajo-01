package com.amazon.aps.iva.x50;

import android.os.Handler;
/* compiled from: DebouncedRunnable.kt */
/* loaded from: classes2.dex */
public final class g {
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> a;
    public final j b;

    public g(Handler handler, com.amazon.aps.iva.xb0.a aVar) {
        this.a = aVar;
        this.b = new j(100L, new n(handler), new f(this));
    }
}
