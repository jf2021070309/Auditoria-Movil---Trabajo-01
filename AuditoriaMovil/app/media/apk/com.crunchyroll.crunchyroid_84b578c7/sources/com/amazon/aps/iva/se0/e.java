package com.amazon.aps.iva.se0;

import java.util.Iterator;
/* compiled from: Await.kt */
@com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {66}, m = "joinAll")
/* loaded from: classes4.dex */
public final class e extends com.amazon.aps.iva.qb0.c {
    public Iterator h;
    public /* synthetic */ Object i;
    public int j;

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return d.b(null, this);
    }
}
