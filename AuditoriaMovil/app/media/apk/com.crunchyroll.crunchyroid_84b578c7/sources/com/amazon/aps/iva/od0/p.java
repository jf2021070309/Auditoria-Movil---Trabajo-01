package com.amazon.aps.iva.od0;

import java.io.IOException;
/* compiled from: MessageLite.java */
/* loaded from: classes4.dex */
public interface p extends q {

    /* compiled from: MessageLite.java */
    /* loaded from: classes4.dex */
    public interface a extends Cloneable, q {
        a D(d dVar, f fVar) throws IOException;

        p build();
    }

    void a(e eVar) throws IOException;

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();
}
