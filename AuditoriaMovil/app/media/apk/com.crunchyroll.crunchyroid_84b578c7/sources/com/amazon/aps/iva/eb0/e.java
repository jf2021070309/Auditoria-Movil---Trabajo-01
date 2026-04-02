package com.amazon.aps.iva.eb0;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: MapBackedMetadataContainer.java */
/* loaded from: classes4.dex */
public final class e<T> implements f {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final a<T> b;

    /* compiled from: MapBackedMetadataContainer.java */
    /* loaded from: classes4.dex */
    public interface a<T> {
        T a(com.amazon.aps.iva.ab0.f fVar);
    }

    public e(a<T> aVar) {
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.eb0.f
    public final void a(com.amazon.aps.iva.ab0.f fVar) {
        this.a.put(this.b.a(fVar), fVar);
    }
}
