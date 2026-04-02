package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.i;
/* compiled from: ByteString.java */
/* loaded from: classes.dex */
public final class h extends i.a {
    public int b = 0;
    public final int c;
    public final /* synthetic */ i d;

    public h(i iVar) {
        this.d = iVar;
        this.c = iVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.c) {
            return true;
        }
        return false;
    }
}
