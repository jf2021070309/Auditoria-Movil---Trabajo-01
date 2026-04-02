package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.h;
import com.amazon.aps.iva.v4.w;
import java.io.IOException;
/* compiled from: MessageLite.java */
/* loaded from: classes.dex */
public interface p0 extends q0 {

    /* compiled from: MessageLite.java */
    /* loaded from: classes.dex */
    public interface a extends q0, Cloneable {
    }

    void b(k kVar) throws IOException;

    int getSerializedSize();

    w.a newBuilderForType();

    w.a toBuilder();

    h.f toByteString();
}
