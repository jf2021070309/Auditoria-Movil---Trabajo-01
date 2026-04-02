package com.amazon.aps.iva.f1;

import android.animation.Animator;
import android.graphics.ColorSpace;
import com.amazon.aps.iva.ApsIvaImaAdapter;
import com.amazon.aps.iva.b8.m0;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.t5.o;
import com.amazon.aps.iva.types.AdMediaState;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.animation.AnimatableView;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements com.amazon.aps.iva.g1.j, o.a, m0.g, p1.e, com.amazon.aps.iva.wa.r, AnimatableView.Listener, Deferred.DeferredHandler, Continuation {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.amazon.aps.iva.wa.r
    public final AdMediaState a(Object obj) {
        return ((ApsIvaImaAdapter) this.c).g.get((String) obj);
    }

    @Override // com.amazon.aps.iva.b8.m0.g
    public final void b(q.d dVar) {
        com.amazon.aps.iva.b8.t tVar = ((com.amazon.aps.iva.b8.m0) this.c).b;
        if (tVar.i()) {
            v1 v1Var = tVar.o;
            if (v1Var.F() == 0) {
                tVar.k(v1Var);
            } else {
                com.amazon.aps.iva.t5.g0.I(v1Var);
            }
        }
    }

    @Override // com.amazon.aps.iva.b8.p1.e
    public final Object e(com.amazon.aps.iva.b8.t tVar, q.d dVar, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 5:
                int i3 = p1.i;
                tVar.c.getClass();
                ListenableFuture f = q.a.f();
                com.amazon.aps.iva.cq.b.B(f, "Callback.onSetRating must return non-null future");
                return f;
            case 6:
                int i4 = p1.i;
                return tVar.h((List) obj);
            case 7:
                int i5 = p1.i;
                return tVar.h(ImmutableList.of((com.amazon.aps.iva.q5.b0) obj));
            default:
                return p1.v0(tVar, dVar, i, (p1.e) obj, new com.amazon.aps.iva.b6.l(dVar, i));
        }
    }

    @Override // com.amazon.aps.iva.g1.j
    public final double f(double d) {
        ColorSpace colorSpace = (ColorSpace) this.c;
        com.amazon.aps.iva.yb0.j.f(colorSpace, "$this_composeColorSpace");
        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public final void handle(Provider provider) {
        ((CrashlyticsNativeComponentDeferredProxy) this.c).lambda$new$0(provider);
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                int i2 = com.amazon.aps.iva.a6.m0.o0;
                ((l0.c) obj).e((com.amazon.aps.iva.q5.f) obj2);
                return;
            case 2:
                int i3 = com.amazon.aps.iva.a6.m0.o0;
                ((l0.c) obj).c0((com.amazon.aps.iva.q5.u0) obj2);
                return;
            default:
                ((l0.c) obj).e0((com.amazon.aps.iva.q5.q) obj2);
                return;
        }
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public final void onAnimationEnd() {
        ((Animator) this.c).start();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean onReportSendComplete;
        onReportSendComplete = ((SessionReportingCoordinator) this.c).onReportSendComplete(task);
        return Boolean.valueOf(onReportSendComplete);
    }
}
