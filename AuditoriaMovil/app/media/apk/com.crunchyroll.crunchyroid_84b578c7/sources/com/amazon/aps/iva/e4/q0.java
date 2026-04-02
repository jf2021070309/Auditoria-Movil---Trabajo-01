package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.i;
import com.amazon.aps.iva.e4.x;
import java.io.IOException;
/* compiled from: MessageLite.java */
/* loaded from: classes.dex */
public interface q0 extends r0 {

    /* compiled from: MessageLite.java */
    /* loaded from: classes.dex */
    public interface a extends r0, Cloneable {
    }

    void b(l lVar) throws IOException;

    int getSerializedSize();

    x.a newBuilderForType();

    x.a toBuilder();

    i.e toByteString();
}
