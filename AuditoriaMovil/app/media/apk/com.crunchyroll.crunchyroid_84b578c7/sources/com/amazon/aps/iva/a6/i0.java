package com.amazon.aps.iva.a6;

import android.view.Display;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.t;
import com.amazon.aps.iva.o6.c0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.t5.o;
import com.amazon.aps.iva.v6.h;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.search.SearchBar;
import com.google.firebase.crashlytics.internal.common.Utils;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements o.a, c0.a, h.b.a, t.c, p1.e, OnCompleteListener, com.amazon.aps.iva.q3.d, Continuation {
    public final /* synthetic */ Object b;

    public /* synthetic */ i0(Object obj, int i) {
        this.b = obj;
    }

    public final void a(Display display) {
        com.amazon.aps.iva.v6.h hVar = (com.amazon.aps.iva.v6.h) this.b;
        hVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            hVar.k = refreshRate;
            hVar.l = (refreshRate * 80) / 100;
            return;
        }
        com.amazon.aps.iva.t5.p.g();
        hVar.k = -9223372036854775807L;
        hVar.l = -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.b8.p1.e
    public final Object e(com.amazon.aps.iva.b8.t tVar, q.d dVar, int i) {
        int i2 = com.amazon.aps.iva.b8.p1.i;
        ((com.amazon.aps.iva.b8.o) tVar).getClass();
        throw null;
    }

    @Override // com.amazon.aps.iva.b8.t.c
    public final void g(q.c cVar, int i) {
        cVar.getClass();
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        ((l0.c) obj).Z(((k1) this.b).f);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        com.amazon.aps.iva.xb0.a aVar = (com.amazon.aps.iva.xb0.a) this.b;
        com.amazon.aps.iva.yb0.j.f(aVar, "$onComplete");
        com.amazon.aps.iva.yb0.j.f(task, "it");
        aVar.invoke();
    }

    @Override // com.amazon.aps.iva.q3.d
    public final void onTouchExplorationStateChanged(boolean z) {
        SearchBar.G((SearchBar) this.b, z);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Void lambda$race$1;
        lambda$race$1 = Utils.lambda$race$1((TaskCompletionSource) this.b, task);
        return lambda$race$1;
    }
}
