package com.amazon.aps.iva.yk;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yk.f;
/* compiled from: PlaybackButtonStateProvider.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ij.b, f> {
    public static final d h = new d();

    public d() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final f invoke(com.amazon.aps.iva.ij.b bVar) {
        com.amazon.aps.iva.ij.b bVar2 = bVar;
        j.f(bVar2, "it");
        if (bVar2.b) {
            return f.a.c;
        }
        if (bVar2.c) {
            return f.c.c;
        }
        return f.b.c;
    }
}
