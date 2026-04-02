package com.amazon.aps.iva.t0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.lb0.i;
import com.amazon.aps.iva.o0.m2;
import com.amazon.aps.iva.q0.e;
import com.amazon.aps.iva.s0.d;
import com.amazon.aps.iva.s0.t;
import com.amazon.aps.iva.yb0.j;
import java.util.Iterator;
/* compiled from: PersistentOrderedSet.kt */
/* loaded from: classes.dex */
public final class b<E> extends i<E> implements e<E> {
    public static final b e;
    public final Object b;
    public final Object c;
    public final d<E, a> d;

    static {
        l1 l1Var = l1.e;
        d dVar = d.d;
        j.d(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        e = new b(l1Var, l1Var, dVar);
    }

    public b(Object obj, Object obj2, d<E, a> dVar) {
        this.b = obj;
        this.c = obj2;
        this.d = dVar;
    }

    @Override // com.amazon.aps.iva.lb0.a
    public final int b() {
        d<E, a> dVar = this.d;
        dVar.getClass();
        return dVar.c;
    }

    @Override // com.amazon.aps.iva.lb0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new c(this.b, this.d);
    }

    @Override // java.util.Collection, java.util.Set, com.amazon.aps.iva.q0.e
    public final b remove(Object obj) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        Object obj2;
        d<E, a> dVar = this.d;
        a aVar = dVar.get(obj);
        if (aVar == null) {
            return this;
        }
        boolean z4 = false;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        t<E, a> tVar = dVar.b;
        t<E, a> v = tVar.v(i, 0, obj);
        if (tVar != v) {
            if (v == null) {
                dVar = d.d;
                j.d(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            } else {
                dVar = new d<>(v, dVar.c - 1);
            }
        }
        l1 l1Var = l1.e;
        Object obj3 = aVar.a;
        if (obj3 != l1Var) {
            z = true;
        } else {
            z = false;
        }
        Object obj4 = aVar.b;
        if (z) {
            a aVar2 = dVar.get(obj3);
            j.c(aVar2);
            dVar = dVar.d(obj3, new a(aVar2.a, obj4));
        }
        if (obj4 != l1Var) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            a aVar3 = dVar.get(obj4);
            j.c(aVar3);
            dVar = dVar.d(obj4, new a(obj3, aVar3.b));
        }
        if (obj3 != l1Var) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            obj2 = obj4;
        } else {
            obj2 = this.b;
        }
        if (obj4 != l1Var) {
            z4 = true;
        }
        if (z4) {
            obj3 = this.c;
        }
        return new b(obj2, obj3, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.q0.e
    public final b t(m2.c cVar) {
        d<E, a> dVar = this.d;
        if (dVar.containsKey(cVar)) {
            return this;
        }
        if (isEmpty()) {
            return new b(cVar, cVar, dVar.d(cVar, new a()));
        }
        Object obj = this.c;
        Object obj2 = dVar.get(obj);
        j.c(obj2);
        return new b(this.b, cVar, dVar.d(obj, new a(((a) obj2).a, cVar)).d(cVar, new a(obj, l1.e)));
    }
}
