package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.j0;
/* compiled from: MapFieldSchema.java */
/* loaded from: classes.dex */
public interface l0 {
    k0 a();

    k0 forMapData(Object obj);

    j0.a<?, ?> forMapMetadata(Object obj);

    k0 forMutableMapData(Object obj);

    int getSerializedSize(int i, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    k0 mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
