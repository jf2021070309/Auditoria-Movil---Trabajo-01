package com.amazon.aps.iva.j8;

import com.amazon.aps.iva.j8.d;
import java.util.concurrent.Executor;
/* compiled from: ContiguousDataSource.java */
/* loaded from: classes.dex */
public abstract class c<Key, Value> extends e<Key, Value> {
    @Override // com.amazon.aps.iva.j8.e
    public final boolean d() {
        return true;
    }

    public abstract void f(int i, int i2, Executor executor, d.a aVar);

    public abstract void g(int i, int i2, Executor executor, d.a aVar);

    public abstract void h(Object obj, int i, int i2, boolean z, Executor executor, d.a aVar);

    public abstract Object i(int i);
}
