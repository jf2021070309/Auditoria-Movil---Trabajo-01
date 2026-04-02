package com.amazon.aps.iva.jf0;

import com.amazon.aps.iva.jf0.h;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
/* compiled from: DefaultCallAdapterFactory.java */
/* loaded from: classes4.dex */
public final class g implements c<Object, b<?>> {
    public final /* synthetic */ Type a;
    public final /* synthetic */ Executor b;

    public g(Type type, Executor executor) {
        this.a = type;
        this.b = executor;
    }

    @Override // com.amazon.aps.iva.jf0.c
    public final Type a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.jf0.c
    public final Object b(s sVar) {
        Executor executor = this.b;
        if (executor != null) {
            return new h.a(executor, sVar);
        }
        return sVar;
    }
}
