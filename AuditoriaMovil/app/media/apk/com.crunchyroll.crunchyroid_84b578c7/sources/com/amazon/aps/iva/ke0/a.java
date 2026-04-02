package com.amazon.aps.iva.ke0;

import java.util.Iterator;
/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes4.dex */
public abstract class a<K, V> implements Iterable<V>, com.amazon.aps.iva.zb0.a {

    /* compiled from: ArrayMapOwner.kt */
    /* renamed from: com.amazon.aps.iva.ke0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0443a<K, V, T extends V> {
        public final com.amazon.aps.iva.fc0.d<? extends K> a;
        public final int b;

        public AbstractC0443a(com.amazon.aps.iva.fc0.d<? extends K> dVar, int i) {
            this.a = dVar;
            this.b = i;
        }
    }

    public abstract c<V> b();

    public final boolean isEmpty() {
        if (((e) this).b.b() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return b().iterator();
    }
}
