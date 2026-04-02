package com.amazon.aps.iva.ef0;

import java.io.Closeable;
import java.io.IOException;
/* compiled from: Source.kt */
/* loaded from: classes4.dex */
public interface d0 extends Closeable {
    long read(e eVar, long j) throws IOException;

    e0 timeout();
}
