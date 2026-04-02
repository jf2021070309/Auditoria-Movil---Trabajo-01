package com.amazon.aps.iva.s0;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes.dex */
public abstract class e<K, V, T> implements Iterator<T>, com.amazon.aps.iva.zb0.a {
    public final u<K, V, T>[] b;
    public int c;
    public boolean d;

    public e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        com.amazon.aps.iva.yb0.j.f(tVar, "node");
        this.b = uVarArr;
        this.d = true;
        u<K, V, T> uVar = uVarArr[0];
        Object[] objArr = tVar.d;
        uVar.getClass();
        com.amazon.aps.iva.yb0.j.f(objArr, "buffer");
        uVar.b = objArr;
        uVar.c = Integer.bitCount(tVar.a) * 2;
        uVar.d = 0;
        this.c = 0;
        b();
    }

    public final void b() {
        boolean z;
        boolean z2;
        int i = this.c;
        u<K, V, T>[] uVarArr = this.b;
        u<K, V, T> uVar = uVarArr[i];
        if (uVar.d < uVar.c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        while (-1 < i) {
            int c = c(i);
            if (c == -1) {
                u<K, V, T> uVar2 = uVarArr[i];
                int i2 = uVar2.d;
                Object[] objArr = uVar2.b;
                if (i2 < objArr.length) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int length = objArr.length;
                    uVar2.d = i2 + 1;
                    c = c(i);
                }
            }
            if (c != -1) {
                this.c = c;
                return;
            }
            if (i > 0) {
                u<K, V, T> uVar3 = uVarArr[i - 1];
                int i3 = uVar3.d;
                int length2 = uVar3.b.length;
                uVar3.d = i3 + 1;
            }
            u<K, V, T> uVar4 = uVarArr[i];
            Object[] objArr2 = t.e.d;
            uVar4.getClass();
            com.amazon.aps.iva.yb0.j.f(objArr2, "buffer");
            uVar4.b = objArr2;
            uVar4.c = 0;
            uVar4.d = 0;
            i--;
        }
        this.d = false;
    }

    public final int c(int i) {
        boolean z;
        boolean z2;
        u<K, V, T>[] uVarArr = this.b;
        u<K, V, T> uVar = uVarArr[i];
        int i2 = uVar.d;
        if (i2 < uVar.c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return i;
        }
        Object[] objArr = uVar.b;
        if (i2 < objArr.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int length = objArr.length;
            Object obj = objArr[i2];
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
            t tVar = (t) obj;
            if (i == 6) {
                u<K, V, T> uVar2 = uVarArr[i + 1];
                Object[] objArr2 = tVar.d;
                int length2 = objArr2.length;
                uVar2.getClass();
                uVar2.b = objArr2;
                uVar2.c = length2;
                uVar2.d = 0;
            } else {
                u<K, V, T> uVar3 = uVarArr[i + 1];
                Object[] objArr3 = tVar.d;
                uVar3.getClass();
                com.amazon.aps.iva.yb0.j.f(objArr3, "buffer");
                uVar3.b = objArr3;
                uVar3.c = Integer.bitCount(tVar.a) * 2;
                uVar3.d = 0;
            }
            return c(i + 1);
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.d) {
            T next = this.b[this.c].next();
            b();
            return next;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
