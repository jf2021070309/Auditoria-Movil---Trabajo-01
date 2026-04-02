package com.amazon.aps.iva.v4;

import java.util.List;
/* compiled from: LazyStringList.java */
/* loaded from: classes.dex */
public interface e0 extends List {
    void c(h hVar);

    Object getRaw(int i);

    List<?> getUnderlyingElements();

    e0 getUnmodifiableView();
}
