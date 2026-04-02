package com.amazon.aps.iva.z9;

import java.io.InputStream;
import java.util.concurrent.Callable;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Callable {
    public final /* synthetic */ InputStream a;
    public final /* synthetic */ String b;

    public /* synthetic */ j(InputStream inputStream, String str) {
        this.a = inputStream;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return p.c(this.a, this.b);
    }
}
