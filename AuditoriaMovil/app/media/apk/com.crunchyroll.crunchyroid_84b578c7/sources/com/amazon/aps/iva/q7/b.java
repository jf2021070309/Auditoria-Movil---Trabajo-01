package com.amazon.aps.iva.q7;
/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: classes.dex */
public final class b extends h {
    public final /* synthetic */ c f;

    public b(c cVar) {
        this.f = cVar;
    }

    @Override // com.amazon.aps.iva.z5.g
    public final void k() {
        c cVar = this.f;
        synchronized (cVar.b) {
            boolean z = false;
            this.b = 0;
            this.d = null;
            int i = cVar.h;
            cVar.h = i + 1;
            cVar.f[i] = this;
            if (!cVar.c.isEmpty() && cVar.h > 0) {
                z = true;
            }
            if (z) {
                cVar.b.notify();
            }
        }
    }
}
