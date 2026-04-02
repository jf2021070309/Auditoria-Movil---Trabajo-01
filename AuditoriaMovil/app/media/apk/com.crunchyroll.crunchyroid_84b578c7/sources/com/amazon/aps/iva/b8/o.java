package com.amazon.aps.iva.b8;

import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.t;
/* compiled from: MediaLibrarySessionImpl.java */
/* loaded from: classes.dex */
public final class o extends t {
    @Override // com.amazon.aps.iva.b8.t
    public final void d(t.c cVar) {
        super.d(cVar);
        synchronized (this.a) {
        }
    }

    @Override // com.amazon.aps.iva.b8.t
    public final boolean f(q.d dVar) {
        if (super.f(dVar)) {
            return true;
        }
        synchronized (this.a) {
        }
        return false;
    }
}
