package com.ellation.crunchyroll.mvp.lifecycle;

import androidx.lifecycle.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: LifecycleAwareState.kt */
/* loaded from: classes2.dex */
public final class LifecycleAwareState<T> {
    public final ArrayList a = new ArrayList();

    public final void a(final g gVar, final l<? super T, q> lVar) {
        j.f(gVar, "lifecycle");
        this.a.add(new LifecycleAwareObserver<T>(gVar, lVar) { // from class: com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareState$observeChanges$1
            @Override // com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareObserver
            public final void a() {
                this.a.remove(this);
            }
        });
    }

    public final void b(T t) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            LifecycleAwareObserver lifecycleAwareObserver = (LifecycleAwareObserver) it.next();
            if (lifecycleAwareObserver.b.getCurrentState().isAtLeast(g.b.RESUMED)) {
                lifecycleAwareObserver.c.invoke(t);
                lifecycleAwareObserver.d = null;
            } else {
                lifecycleAwareObserver.d = t;
            }
        }
    }
}
