package com.amazon.aps.iva.f5;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: Grid.java */
/* loaded from: classes.dex */
public abstract class e {
    public b b;
    public boolean c;
    public int d;
    public int e;
    public com.amazon.aps.iva.x.d[] h;
    public final Object[] a = new Object[1];
    public int f = -1;
    public int g = -1;
    public int i = -1;

    /* compiled from: Grid.java */
    /* loaded from: classes.dex */
    public static class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    /* compiled from: Grid.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public abstract boolean a(int i, boolean z);

    public final boolean b(int i) {
        if (this.g < 0) {
            return false;
        }
        if (this.c) {
            if (g(true, null) > i + this.d) {
                return false;
            }
        } else if (e(false, null) < i - this.d) {
            return false;
        }
        return true;
    }

    public final boolean c(int i) {
        if (this.g < 0) {
            return false;
        }
        if (this.c) {
            if (e(false, null) < i - this.d) {
                return false;
            }
        } else if (g(true, null) > i + this.d) {
            return false;
        }
        return true;
    }

    public final int e(boolean z, int[] iArr) {
        int i;
        if (this.c) {
            i = this.f;
        } else {
            i = this.g;
        }
        return f(iArr, i, z);
    }

    public abstract int f(int[] iArr, int i, boolean z);

    public final int g(boolean z, int[] iArr) {
        int i;
        if (this.c) {
            i = this.g;
        } else {
            i = this.f;
        }
        return h(iArr, i, z);
    }

    public abstract int h(int[] iArr, int i, boolean z);

    public abstract com.amazon.aps.iva.x.d[] i(int i, int i2);

    public abstract a j(int i);

    public void k(int i) {
        int i2;
        if (i < 0 || (i2 = this.g) < 0) {
            return;
        }
        if (i2 >= i) {
            this.g = i - 1;
        }
        if (this.g < this.f) {
            this.g = -1;
            this.f = -1;
        }
        if (this.f < 0) {
            this.i = i;
        }
    }

    public abstract boolean l(int i, boolean z);

    public final void m(int i) {
        if (i > 0) {
            if (this.e == i) {
                return;
            }
            this.e = i;
            this.h = new com.amazon.aps.iva.x.d[i];
            for (int i2 = 0; i2 < this.e; i2++) {
                this.h[i2] = new com.amazon.aps.iva.x.d();
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void d(int i, int i2, RecyclerView.p.c cVar) {
    }
}
