package com.amazon.aps.iva.za0;

import com.amazon.aps.iva.ya0.d;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: -InterceptorChain.kt */
/* loaded from: classes4.dex */
public final class b {
    public final List<d> a;
    public final int b;
    public final com.amazon.aps.iva.ya0.b c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends d> list, int i, com.amazon.aps.iva.ya0.b bVar) {
        j.g(list, "interceptors");
        j.g(bVar, "request");
        this.a = list;
        this.b = i;
        this.c = bVar;
    }

    public final com.amazon.aps.iva.ya0.c a(com.amazon.aps.iva.ya0.b bVar) {
        j.g(bVar, "request");
        List<d> list = this.a;
        int size = list.size();
        int i = this.b;
        if (i < size) {
            return list.get(i).a(new b(list, i + 1, bVar));
        }
        throw new AssertionError("no interceptors added to the chain");
    }
}
