package com.amazon.aps.iva.ad;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: TargetTracker.java */
/* loaded from: classes.dex */
public final class n implements h {
    public final Set<com.amazon.aps.iva.ed.h<?>> b = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.amazon.aps.iva.ad.h
    public final void onDestroy() {
        Iterator it = com.amazon.aps.iva.hd.l.d(this.b).iterator();
        while (it.hasNext()) {
            ((com.amazon.aps.iva.ed.h) it.next()).onDestroy();
        }
    }

    @Override // com.amazon.aps.iva.ad.h
    public final void onStart() {
        Iterator it = com.amazon.aps.iva.hd.l.d(this.b).iterator();
        while (it.hasNext()) {
            ((com.amazon.aps.iva.ed.h) it.next()).onStart();
        }
    }

    @Override // com.amazon.aps.iva.ad.h
    public final void onStop() {
        Iterator it = com.amazon.aps.iva.hd.l.d(this.b).iterator();
        while (it.hasNext()) {
            ((com.amazon.aps.iva.ed.h) it.next()).onStop();
        }
    }
}
