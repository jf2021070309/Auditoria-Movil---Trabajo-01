package com.amazon.aps.iva.xw;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* compiled from: ViewGroupExtensions.kt */
/* loaded from: classes2.dex */
public final class u0 implements Iterator<View>, com.amazon.aps.iva.zb0.a {
    public int b;
    public final /* synthetic */ ViewGroup c;

    public u0(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.c.getChildCount()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final View next() {
        int i = this.b;
        this.b = i + 1;
        return this.c.getChildAt(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
