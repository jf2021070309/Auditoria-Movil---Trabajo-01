package com.amazon.aps.iva.lb0;

import java.util.Iterator;
/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public final class v implements com.amazon.aps.iva.ne0.h<Object> {
    public final /* synthetic */ Iterable a;

    public v(Iterable iterable) {
        this.a = iterable;
    }

    @Override // com.amazon.aps.iva.ne0.h
    public final Iterator<Object> iterator() {
        return this.a.iterator();
    }
}
