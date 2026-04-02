package com.amazon.aps.iva.ag;

import com.amazon.aps.iva.jp.d;
import com.amazon.aps.iva.jp.g;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.yb0.j;
import okhttp3.EventListener;
import okhttp3.Interceptor;
/* compiled from: DatadogTools.kt */
/* loaded from: classes.dex */
public final class a {
    public final Interceptor a;
    public final EventListener.Factory b;
    public final a.b c;

    public a(g gVar, d.a aVar, com.amazon.aps.iva.jr.a aVar2) {
        this.a = gVar;
        this.b = aVar;
        this.c = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b) && j.a(this.c, aVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DatadogTools(okHttpInterceptor=" + this.a + ", okHttpEventListenerFactory=" + this.b + ", timberTree=" + this.c + ")";
    }
}
