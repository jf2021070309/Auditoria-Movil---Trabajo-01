package com.amazon.aps.iva.ec0;

import com.amazon.aps.iva.lb0.q;
import java.util.NoSuchElementException;
/* compiled from: ProgressionIterators.kt */
/* loaded from: classes4.dex */
public final class b extends q {
    public final int b;
    public final int c;
    public boolean d;
    public int e;

    public b(char c, char c2, int i) {
        this.b = i;
        this.c = c2;
        boolean z = true;
        if (i <= 0 ? com.amazon.aps.iva.yb0.j.h(c, c2) < 0 : com.amazon.aps.iva.yb0.j.h(c, c2) > 0) {
            z = false;
        }
        this.d = z;
        this.e = z ? c : c2;
    }

    @Override // com.amazon.aps.iva.lb0.q
    public final char b() {
        int i = this.e;
        if (i == this.c) {
            if (this.d) {
                this.d = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.e = this.b + i;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }
}
