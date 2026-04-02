package com.amazon.aps.iva.ke0;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes4.dex */
public abstract class v<K, V> {
    public final ConcurrentHashMap<String, Integer> a = new ConcurrentHashMap<>();
    public final AtomicInteger b = new AtomicInteger(0);

    /* compiled from: ArrayMapOwner.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, Integer> {
        public final /* synthetic */ v<K, V> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v<K, V> vVar) {
            super(1);
            this.h = vVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Integer invoke(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "it");
            return Integer.valueOf(this.h.b.getAndIncrement());
        }
    }

    public abstract int a(ConcurrentHashMap concurrentHashMap, String str, a aVar);

    public final <T extends K> int b(com.amazon.aps.iva.fc0.d<T> dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kClass");
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.a;
        String j = dVar.j();
        com.amazon.aps.iva.yb0.j.c(j);
        return a(concurrentHashMap, j, new a(this));
    }
}
