package com.amazon.aps.iva.nc;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.util.HashMap;
/* compiled from: Jobs.java */
/* loaded from: classes.dex */
public final class t implements com.amazon.aps.iva.kc.k {
    public final Object b;
    public final Object c;

    public t() {
        this.b = new HashMap();
        this.c = new HashMap();
    }

    @Override // com.amazon.aps.iva.kc.d
    public final boolean c(Object obj, File file, com.amazon.aps.iva.kc.h hVar) {
        return ((com.amazon.aps.iva.kc.k) this.c).c(new com.amazon.aps.iva.uc.e(((BitmapDrawable) ((w) obj).get()).getBitmap(), (com.amazon.aps.iva.oc.c) this.b), file, hVar);
    }

    @Override // com.amazon.aps.iva.kc.k
    public final com.amazon.aps.iva.kc.c d(com.amazon.aps.iva.kc.h hVar) {
        return ((com.amazon.aps.iva.kc.k) this.c).d(hVar);
    }

    public t(com.amazon.aps.iva.oc.c cVar, com.amazon.aps.iva.uc.b bVar) {
        this.b = cVar;
        this.c = bVar;
    }
}
