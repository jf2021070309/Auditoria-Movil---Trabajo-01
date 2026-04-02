package com.amazon.aps.iva.xe0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: Atomic.kt */
/* loaded from: classes4.dex */
public abstract class a<T> extends m {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = com.amazon.aps.iva.hc.m.g;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xe0.m
    public final Object a(Object obj) {
        boolean z;
        Object obj2 = this._consensus;
        s sVar = com.amazon.aps.iva.hc.m.g;
        if (obj2 == sVar) {
            s c = c(obj);
            obj2 = this._consensus;
            if (obj2 == sVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, c)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != sVar) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    obj2 = c;
                } else {
                    obj2 = this._consensus;
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t, Object obj);

    public abstract s c(Object obj);
}
