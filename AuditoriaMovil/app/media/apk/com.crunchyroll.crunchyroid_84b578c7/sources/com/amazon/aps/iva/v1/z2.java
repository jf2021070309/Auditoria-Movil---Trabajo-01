package com.amazon.aps.iva.v1;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
/* compiled from: WeakCache.kt */
/* loaded from: classes.dex */
public final class z2<T> {
    public final com.amazon.aps.iva.p0.f<Reference<T>> a = new com.amazon.aps.iva.p0.f<>(new Reference[16]);
    public final ReferenceQueue<T> b = new ReferenceQueue<>();
}
