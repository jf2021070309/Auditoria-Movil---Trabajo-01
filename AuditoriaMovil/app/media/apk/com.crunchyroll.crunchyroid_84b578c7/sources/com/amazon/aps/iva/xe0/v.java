package com.amazon.aps.iva.xe0;

import com.amazon.aps.iva.se0.y0;
import com.amazon.aps.iva.xe0.w;
import java.lang.Comparable;
import java.util.Arrays;
/* compiled from: ThreadSafeHeap.kt */
/* loaded from: classes4.dex */
public class v<T extends w & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;
    public T[] a;

    public final void a(y0.c cVar) {
        cVar.a((y0.d) this);
        T[] tArr = this.a;
        if (tArr == null) {
            tArr = (T[]) new w[4];
            this.a = tArr;
        } else if (this._size >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((w[]) copyOf);
            this.a = tArr;
        }
        int i = this._size;
        this._size = i + 1;
        tArr[i] = cVar;
        cVar.c = i;
        e(i);
    }

    public final boolean b() {
        if (this._size == 0) {
            return true;
        }
        return false;
    }

    public final T c(int i) {
        T[] tArr = this.a;
        com.amazon.aps.iva.yb0.j.c(tArr);
        this._size--;
        if (i < this._size) {
            f(i, this._size);
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                com.amazon.aps.iva.yb0.j.c(t);
                T t2 = tArr[i2];
                com.amazon.aps.iva.yb0.j.c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    f(i, i2);
                    e(i2);
                }
            }
            while (true) {
                int i3 = (i * 2) + 1;
                if (i3 >= this._size) {
                    break;
                }
                T[] tArr2 = this.a;
                com.amazon.aps.iva.yb0.j.c(tArr2);
                int i4 = i3 + 1;
                if (i4 < this._size) {
                    T t3 = tArr2[i4];
                    com.amazon.aps.iva.yb0.j.c(t3);
                    T t4 = tArr2[i3];
                    com.amazon.aps.iva.yb0.j.c(t4);
                    if (((Comparable) t3).compareTo(t4) < 0) {
                        i3 = i4;
                    }
                }
                T t5 = tArr2[i];
                com.amazon.aps.iva.yb0.j.c(t5);
                T t6 = tArr2[i3];
                com.amazon.aps.iva.yb0.j.c(t6);
                if (((Comparable) t5).compareTo(t6) <= 0) {
                    break;
                }
                f(i, i3);
                i = i3;
            }
        }
        T t7 = tArr[this._size];
        com.amazon.aps.iva.yb0.j.c(t7);
        t7.a(null);
        t7.setIndex(-1);
        tArr[this._size] = null;
        return t7;
    }

    public final T d() {
        T t;
        synchronized (this) {
            if (this._size > 0) {
                t = c(0);
            } else {
                t = null;
            }
        }
        return t;
    }

    public final void e(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            com.amazon.aps.iva.yb0.j.c(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            com.amazon.aps.iva.yb0.j.c(t);
            T t2 = tArr[i];
            com.amazon.aps.iva.yb0.j.c(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            f(i, i2);
            i = i2;
        }
    }

    public final void f(int i, int i2) {
        T[] tArr = this.a;
        com.amazon.aps.iva.yb0.j.c(tArr);
        T t = tArr[i2];
        com.amazon.aps.iva.yb0.j.c(t);
        T t2 = tArr[i];
        com.amazon.aps.iva.yb0.j.c(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
