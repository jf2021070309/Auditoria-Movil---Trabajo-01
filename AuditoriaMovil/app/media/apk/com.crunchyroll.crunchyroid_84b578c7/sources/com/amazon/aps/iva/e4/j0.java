package com.amazon.aps.iva.e4;

import java.io.IOException;
/* compiled from: MapEntryLite.java */
/* loaded from: classes.dex */
public final class j0<K, V> {
    public final a<K, V> a;
    public final K b = "";
    public final V c;

    /* compiled from: MapEntryLite.java */
    /* loaded from: classes.dex */
    public static class a<K, V> {
        public final u1 a;
        public final K b = "";
        public final u1 c;
        public final V d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(u1 u1Var, u1 u1Var2, com.amazon.aps.iva.c4.g gVar) {
            this.a = u1Var;
            this.c = u1Var2;
            this.d = gVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j0(u1 u1Var, u1 u1Var2, com.amazon.aps.iva.c4.g gVar) {
        this.a = new a<>(u1Var, u1Var2, gVar);
        this.c = gVar;
    }

    public static <K, V> int a(a<K, V> aVar, K k, V v) {
        return t.b(aVar.c, 2, v) + t.b(aVar.a, 1, k);
    }

    public static <K, V> void b(l lVar, a<K, V> aVar, K k, V v) throws IOException {
        t.o(lVar, aVar.a, 1, k);
        t.o(lVar, aVar.c, 2, v);
    }
}
