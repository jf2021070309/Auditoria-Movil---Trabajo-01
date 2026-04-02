package com.amazon.aps.iva.ec0;

import com.amazon.aps.iva.lb0.f0;
import java.util.NoSuchElementException;
/* compiled from: ProgressionIterators.kt */
/* loaded from: classes4.dex */
public final class i extends f0 {
    public final int b;
    public final int c;
    public boolean d;
    public int e;

    public i(int i, int i2, int i3) {
        this.b = i3;
        this.c = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.d = z;
        this.e = z ? i : i2;
    }

    @Override // com.amazon.aps.iva.lb0.f0
    public final int b() {
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
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }
}
