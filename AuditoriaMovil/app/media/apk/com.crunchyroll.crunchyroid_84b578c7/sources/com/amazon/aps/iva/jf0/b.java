package com.amazon.aps.iva.jf0;

import java.io.IOException;
import okhttp3.Request;
/* compiled from: Call.java */
/* loaded from: classes4.dex */
public interface b<T> extends Cloneable {
    void cancel();

    b<T> clone();

    a0<T> execute() throws IOException;

    boolean isCanceled();

    void n(d<T> dVar);

    Request request();
}
