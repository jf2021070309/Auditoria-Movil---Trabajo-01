package com.amazon.aps.iva.ke0;

import com.amazon.aps.iva.lb0.o0;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: ArrayMap.kt */
/* loaded from: classes4.dex */
public final class d<T> extends c<T> {
    public Object[] b = new Object[20];
    public int c = 0;

    /* compiled from: ArrayMap.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.lb0.b<T> {
        public int d = -1;
        public final /* synthetic */ d<T> e;

        public a(d<T> dVar) {
            this.e = dVar;
        }

        @Override // com.amazon.aps.iva.lb0.b
        public final void b() {
            int i;
            Object[] objArr;
            do {
                i = this.d + 1;
                this.d = i;
                objArr = this.e.b;
                if (i >= objArr.length) {
                    break;
                }
            } while (objArr[i] == null);
            if (i >= objArr.length) {
                this.b = o0.Done;
                return;
            }
            T t = (T) objArr[i];
            com.amazon.aps.iva.yb0.j.d(t, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            this.c = t;
            this.b = o0.Ready;
        }
    }

    @Override // com.amazon.aps.iva.ke0.c
    public final int b() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ke0.c
    public final void d(int i, T t) {
        com.amazon.aps.iva.yb0.j.f(t, "value");
        Object[] objArr = this.b;
        if (objArr.length <= i) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
            this.b = copyOf;
        }
        Object[] objArr2 = this.b;
        if (objArr2[i] == null) {
            this.c++;
        }
        objArr2[i] = t;
    }

    @Override // com.amazon.aps.iva.ke0.c
    public final T get(int i) {
        return (T) com.amazon.aps.iva.lb0.o.S(this.b, i);
    }

    @Override // com.amazon.aps.iva.ke0.c, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
