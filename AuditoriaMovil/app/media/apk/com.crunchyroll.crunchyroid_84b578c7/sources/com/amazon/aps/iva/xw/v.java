package com.amazon.aps.iva.xw;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ButterKnife.kt */
/* loaded from: classes2.dex */
public final class v<T, V> implements com.amazon.aps.iva.bc0.b<T, V> {
    public final com.amazon.aps.iva.xb0.p<T, com.amazon.aps.iva.fc0.l<?>, V> a;
    public Object b = a.a;

    /* compiled from: ButterKnife.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final a a = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(com.amazon.aps.iva.xb0.p<? super T, ? super com.amazon.aps.iva.fc0.l<?>, ? extends V> pVar) {
        this.a = pVar;
    }

    @Override // com.amazon.aps.iva.bc0.b
    public final V getValue(T t, com.amazon.aps.iva.fc0.l<?> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        if (com.amazon.aps.iva.yb0.j.a(this.b, a.a)) {
            this.b = this.a.invoke(t, lVar);
            WeakHashMap<Object, Collection<v<?, ?>>> weakHashMap = w.a;
            WeakHashMap<Object, Collection<v<?, ?>>> weakHashMap2 = w.a;
            Set set = weakHashMap2.get(t);
            if (set == null) {
                set = Collections.newSetFromMap(new WeakHashMap());
                weakHashMap2.put(t, set);
            }
            set.add(this);
        }
        return (V) this.b;
    }
}
