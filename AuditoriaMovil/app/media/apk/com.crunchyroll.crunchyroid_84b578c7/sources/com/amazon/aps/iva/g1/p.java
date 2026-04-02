package com.amazon.aps.iva.g1;

import android.graphics.Canvas;
import android.view.Surface;
import com.amazon.aps.iva.a6.m0;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.t;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.b8.w0;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.k0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.t5.o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.navigation.NavigationView;
import com.google.common.collect.ImmutableList;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements j, o.a, t.c, com.amazon.aps.iva.t5.g, p1.e, SynchronizationGuard.CriticalSection, CanvasCompat.CanvasOperation, BreadcrumbSource {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.amazon.aps.iva.t5.g
    public final void a(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 3:
                int i2 = p1.i;
                ((v1) obj).f((k0) obj2);
                return;
            default:
                int i3 = p1.i;
                ((v1) obj).m((Surface) obj2);
                return;
        }
    }

    @Override // com.amazon.aps.iva.b8.p1.e
    public final Object e(com.amazon.aps.iva.b8.t tVar, q.d dVar, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 5:
                int i3 = p1.i;
                return tVar.h(ImmutableList.of((b0) obj));
            default:
                return p1.v0((com.amazon.aps.iva.b8.o) tVar, dVar, i, (p1.e) obj, new w0(dVar, i));
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        Object lambda$logAndUpdateState$6;
        lambda$logAndUpdateState$6 = ((Uploader) this.c).lambda$logAndUpdateState$6();
        return lambda$logAndUpdateState$6;
    }

    @Override // com.amazon.aps.iva.g1.j
    public final double f(double d) {
        v vVar = (v) this.c;
        com.amazon.aps.iva.yb0.j.f(vVar, "$function");
        double d2 = vVar.e;
        double d3 = vVar.d;
        if (d >= d2 * d3) {
            return (Math.pow(d - vVar.f, 1.0d / vVar.a) - vVar.c) / vVar.b;
        }
        return (d - vVar.g) / d3;
    }

    @Override // com.amazon.aps.iva.b8.t.c
    public final void g(q.c cVar, int i) {
        com.amazon.aps.iva.q5.q qVar = ((com.amazon.aps.iva.b8.t) this.c).n.r;
        cVar.B();
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        ((l0.c) obj).E(m0.this.N);
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public final void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        ((AnalyticsDeferredProxy) this.c).lambda$getDeferredBreadcrumbSource$0(breadcrumbHandler);
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public final void run(Canvas canvas) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 8:
                MaskableFrameLayout.a((MaskableFrameLayout) obj, canvas);
                return;
            default:
                NavigationView.a((NavigationView) obj, canvas);
                return;
        }
    }
}
