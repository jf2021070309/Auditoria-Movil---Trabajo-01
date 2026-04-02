package com.amazon.aps.iva.r0;

import java.util.ListIterator;
/* compiled from: AbstractListIterator.kt */
/* loaded from: classes.dex */
public abstract class a implements ListIterator, com.amazon.aps.iva.zb0.a {
    public final /* synthetic */ int b;
    public int c;
    public int d;

    public /* synthetic */ a(int i, int i2, int i3) {
        this.b = i3;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final int b() {
        switch (this.b) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public final int c() {
        switch (this.b) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    public final void d(int i) {
        switch (this.b) {
            case 0:
                this.c = i;
                return;
            default:
                this.c = i;
                return;
        }
    }

    public final void e(int i) {
        switch (this.b) {
            case 0:
                this.d = i;
                return;
            default:
                this.d = i;
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.b) {
            case 0:
                if (this.c < this.d) {
                    return true;
                }
                return false;
            default:
                if (this.c < this.d) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.b) {
            case 0:
                if (this.c > 0) {
                    return true;
                }
                return false;
            default:
                if (this.c > 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.b) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.b) {
            case 0:
                i = this.c;
                break;
            default:
                i = this.c;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
