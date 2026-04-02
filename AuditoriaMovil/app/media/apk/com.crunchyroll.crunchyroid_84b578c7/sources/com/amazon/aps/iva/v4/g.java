package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.h;
/* compiled from: ByteString.java */
/* loaded from: classes.dex */
public final class g extends h.a {
    public int b = 0;
    public final int c;
    public final /* synthetic */ h d;

    public g(h hVar) {
        this.d = hVar;
        this.c = hVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.c) {
            return true;
        }
        return false;
    }
}
