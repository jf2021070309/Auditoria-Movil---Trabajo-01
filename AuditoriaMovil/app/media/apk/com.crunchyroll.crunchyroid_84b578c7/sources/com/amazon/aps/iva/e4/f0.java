package com.amazon.aps.iva.e4;

import java.util.List;
/* compiled from: LazyStringList.java */
/* loaded from: classes.dex */
public interface f0 extends List {
    Object getRaw(int i);

    List<?> getUnderlyingElements();

    f0 getUnmodifiableView();

    void v(i iVar);
}
