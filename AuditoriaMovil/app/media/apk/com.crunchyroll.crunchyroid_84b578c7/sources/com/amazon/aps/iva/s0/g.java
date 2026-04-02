package com.amazon.aps.iva.s0;

import com.amazon.aps.iva.yb0.h0;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes.dex */
public class g<K, V, T> extends e<K, V, T> {
    public final f<K, V> e;
    public K f;
    public boolean g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f<K, V> fVar, u<K, V, T>[] uVarArr) {
        super(fVar.d, uVarArr);
        com.amazon.aps.iva.yb0.j.f(fVar, "builder");
        this.e = fVar;
        this.h = fVar.f;
    }

    public final void d(int i, t<?, ?> tVar, K k, int i2) {
        int i3 = i2 * 5;
        u<K, V, T>[] uVarArr = this.b;
        if (i3 > 30) {
            u<K, V, T> uVar = uVarArr[i2];
            Object[] objArr = tVar.d;
            int length = objArr.length;
            uVar.getClass();
            uVar.b = objArr;
            uVar.c = length;
            uVar.d = 0;
            while (true) {
                u<K, V, T> uVar2 = uVarArr[i2];
                if (!com.amazon.aps.iva.yb0.j.a(uVar2.b[uVar2.d], k)) {
                    uVarArr[i2].d += 2;
                } else {
                    this.c = i2;
                    return;
                }
            }
        } else {
            int i4 = 1 << ((i >> i3) & 31);
            if (tVar.h(i4)) {
                int f = tVar.f(i4);
                u<K, V, T> uVar3 = uVarArr[i2];
                Object[] objArr2 = tVar.d;
                uVar3.getClass();
                com.amazon.aps.iva.yb0.j.f(objArr2, "buffer");
                uVar3.b = objArr2;
                uVar3.c = Integer.bitCount(tVar.a) * 2;
                uVar3.d = f;
                this.c = i2;
                return;
            }
            int t = tVar.t(i4);
            t<?, ?> s = tVar.s(t);
            u<K, V, T> uVar4 = uVarArr[i2];
            Object[] objArr3 = tVar.d;
            uVar4.getClass();
            com.amazon.aps.iva.yb0.j.f(objArr3, "buffer");
            uVar4.b = objArr3;
            uVar4.c = Integer.bitCount(tVar.a) * 2;
            uVar4.d = t;
            d(i, s, k, i2 + 1);
        }
    }

    @Override // com.amazon.aps.iva.s0.e, java.util.Iterator
    public final T next() {
        if (this.e.f == this.h) {
            if (this.d) {
                u<K, V, T> uVar = this.b[this.c];
                this.f = (K) uVar.b[uVar.d];
                this.g = true;
                return (T) super.next();
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.s0.e, java.util.Iterator
    public final void remove() {
        int i;
        if (this.g) {
            boolean z = this.d;
            f<K, V> fVar = this.e;
            if (z) {
                if (z) {
                    u<K, V, T> uVar = this.b[this.c];
                    Object obj = uVar.b[uVar.d];
                    K k = this.f;
                    h0.c(fVar);
                    fVar.remove(k);
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    d(i, fVar.d, obj, 0);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                K k2 = this.f;
                h0.c(fVar);
                fVar.remove(k2);
            }
            this.f = null;
            this.g = false;
            this.h = fVar.f;
            return;
        }
        throw new IllegalStateException();
    }
}
