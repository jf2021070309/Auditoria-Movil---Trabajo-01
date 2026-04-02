package com.amazon.aps.iva.v4;
/* compiled from: MapFieldSchema.java */
/* loaded from: classes.dex */
public interface k0 {
    j0 a();

    j0 forMapData(Object obj);

    void forMapMetadata(Object obj);

    j0 forMutableMapData(Object obj);

    int getSerializedSize(int i, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    j0 mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
