package com.amazon.aps.iva.b8;

import com.google.common.util.concurrent.AbstractFuture;
/* compiled from: SequencedFutureManager.java */
/* loaded from: classes.dex */
public final class w1 {
    public int b;
    public final Object a = new Object();
    public final com.amazon.aps.iva.x.a<Integer, a<?>> c = new com.amazon.aps.iva.x.a<>();

    /* compiled from: SequencedFutureManager.java */
    /* loaded from: classes.dex */
    public static final class a<T> extends AbstractFuture<T> {
        public final void a() {
            super.set(null);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final boolean set(T t) {
            return super.set(t);
        }
    }
}
