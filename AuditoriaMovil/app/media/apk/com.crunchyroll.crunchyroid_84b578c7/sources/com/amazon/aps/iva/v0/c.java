package com.amazon.aps.iva.v0;

import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.g2;
import com.amazon.aps.iva.o0.k0;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.q0.d;
import com.amazon.aps.iva.s0.f;
import com.amazon.aps.iva.s0.t;
import com.amazon.aps.iva.yb0.j;
/* compiled from: PersistentCompositionLocalMap.kt */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.s0.d<k0<Object>, p3<? extends Object>> implements c2 {
    public static final c e;

    /* compiled from: PersistentCompositionLocalMap.kt */
    /* loaded from: classes.dex */
    public static final class a extends f<k0<Object>, p3<? extends Object>> {
        public c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(cVar);
            j.f(cVar, "map");
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.s0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof k0)) {
                return false;
            }
            return super.containsKey((k0) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof p3)) {
                return false;
            }
            return super.containsValue((p3) obj);
        }

        @Override // com.amazon.aps.iva.s0.f, com.amazon.aps.iva.q0.d.a
        /* renamed from: d */
        public final c build() {
            Object obj = this.d;
            c cVar = this.h;
            if (obj != cVar.b) {
                this.c = new com.amazon.aps.iva.u0.b(0);
                cVar = new c(this.d, this.g);
            }
            this.h = cVar;
            return cVar;
        }

        @Override // com.amazon.aps.iva.s0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (!(obj instanceof k0)) {
                return null;
            }
            return (p3) super.get((k0) obj);
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof k0)) {
                return obj2;
            }
            return (p3) super.getOrDefault((k0) obj, (p3) obj2);
        }

        @Override // com.amazon.aps.iva.s0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof k0)) {
                return null;
            }
            return (p3) super.remove((k0) obj);
        }
    }

    static {
        t tVar = t.e;
        j.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>");
        e = new c(tVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t<k0<Object>, p3<Object>> tVar, int i) {
        super(tVar, i);
        j.f(tVar, "node");
    }

    @Override // com.amazon.aps.iva.s0.d, com.amazon.aps.iva.q0.d
    public final d.a<k0<Object>, p3<? extends Object>> a() {
        return new a(this);
    }

    @Override // com.amazon.aps.iva.o0.m0
    public final Object b(g2 g2Var) {
        j.f(g2Var, "key");
        return com.amazon.aps.iva.cq.b.f0(this, g2Var);
    }

    @Override // com.amazon.aps.iva.s0.d
    public final f<k0<Object>, p3<? extends Object>> c() {
        return new a(this);
    }

    @Override // com.amazon.aps.iva.s0.d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        return super.containsKey((k0) obj);
    }

    @Override // com.amazon.aps.iva.lb0.d, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof p3)) {
            return false;
        }
        return super.containsValue((p3) obj);
    }

    @Override // com.amazon.aps.iva.s0.d, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof k0)) {
            return null;
        }
        return (p3) super.get((k0) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof k0)) {
            return obj2;
        }
        return (p3) super.getOrDefault((k0) obj, (p3) obj2);
    }

    @Override // com.amazon.aps.iva.s0.d, com.amazon.aps.iva.q0.d
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public final d.a<k0<Object>, p3<? extends Object>> a2() {
        return new a(this);
    }
}
