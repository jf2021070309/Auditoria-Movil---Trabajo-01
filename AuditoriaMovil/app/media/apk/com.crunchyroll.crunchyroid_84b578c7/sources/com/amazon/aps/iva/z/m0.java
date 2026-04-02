package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.y;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: AnimationSpec.kt */
/* loaded from: classes.dex */
public final class m0<T> implements w<T> {
    public final b<T> a;

    /* compiled from: AnimationSpec.kt */
    /* loaded from: classes.dex */
    public static final class a<T> {
        public final T a;
        public x b;

        public a() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Float f) {
            y.a aVar = y.b;
            com.amazon.aps.iva.yb0.j.f(aVar, "easing");
            this.a = f;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (com.amazon.aps.iva.yb0.j.a(aVar.a, this.a) && com.amazon.aps.iva.yb0.j.a(aVar.b, this.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i;
            T t = this.a;
            if (t != null) {
                i = t.hashCode();
            } else {
                i = 0;
            }
            return this.b.hashCode() + (i * 31);
        }
    }

    /* compiled from: AnimationSpec.kt */
    /* loaded from: classes.dex */
    public static final class b<T> {
        public int a = 300;
        public final LinkedHashMap b = new LinkedHashMap();

        public final a a(int i, Float f) {
            a aVar = new a(f);
            this.b.put(Integer.valueOf(i), aVar);
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                bVar.getClass();
                if (this.a == bVar.a && com.amazon.aps.iva.yb0.j.a(this.b, bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (((this.a * 31) + 0) * 31);
        }
    }

    public m0(b<T> bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            if (com.amazon.aps.iva.yb0.j.a(this.a, ((m0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.z.w, com.amazon.aps.iva.z.j
    /* renamed from: f */
    public final <V extends p> x1<V> a(l1<T, V> l1Var) {
        com.amazon.aps.iva.yb0.j.f(l1Var, "converter");
        b<T> bVar = this.a;
        LinkedHashMap linkedHashMap = bVar.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(com.amazon.aps.iva.aq.k.w(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            a aVar = (a) entry.getValue();
            com.amazon.aps.iva.xb0.l<T, V> a2 = l1Var.a();
            aVar.getClass();
            com.amazon.aps.iva.yb0.j.f(a2, "convertToVector");
            linkedHashMap2.put(key, new com.amazon.aps.iva.kb0.j(a2.invoke(aVar.a), aVar.b));
        }
        return new x1<>(bVar.a, linkedHashMap2);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
