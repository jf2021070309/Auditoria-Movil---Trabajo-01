package com.bumptech.glide.manager;

import androidx.lifecycle.g;
import androidx.lifecycle.l;
import com.amazon.aps.iva.ad.g;
import com.amazon.aps.iva.ad.h;
import com.amazon.aps.iva.i5.n;
import com.amazon.aps.iva.i5.o;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
final class LifecycleLifecycle implements g, n {
    public final HashSet b = new HashSet();
    public final androidx.lifecycle.g c;

    public LifecycleLifecycle(androidx.lifecycle.g gVar) {
        this.c = gVar;
        gVar.addObserver(this);
    }

    @Override // com.amazon.aps.iva.ad.g
    public final void a(h hVar) {
        this.b.add(hVar);
        androidx.lifecycle.g gVar = this.c;
        if (gVar.getCurrentState() == g.b.DESTROYED) {
            hVar.onDestroy();
        } else if (gVar.getCurrentState().isAtLeast(g.b.STARTED)) {
            hVar.onStart();
        } else {
            hVar.onStop();
        }
    }

    @Override // com.amazon.aps.iva.ad.g
    public final void d(h hVar) {
        this.b.remove(hVar);
    }

    @l(g.a.ON_DESTROY)
    public void onDestroy(o oVar) {
        Iterator it = com.amazon.aps.iva.hd.l.d(this.b).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onDestroy();
        }
        oVar.getLifecycle().removeObserver(this);
    }

    @l(g.a.ON_START)
    public void onStart(o oVar) {
        Iterator it = com.amazon.aps.iva.hd.l.d(this.b).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStart();
        }
    }

    @l(g.a.ON_STOP)
    public void onStop(o oVar) {
        Iterator it = com.amazon.aps.iva.hd.l.d(this.b).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStop();
        }
    }
}
