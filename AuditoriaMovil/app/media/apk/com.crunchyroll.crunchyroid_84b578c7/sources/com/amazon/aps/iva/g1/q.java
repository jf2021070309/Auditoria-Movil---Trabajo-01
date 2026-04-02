package com.amazon.aps.iva.g1;

import android.os.Bundle;
import android.os.SystemClock;
import com.amazon.aps.iva.ApsIvaSdkImpl;
import com.amazon.aps.iva.a6.m0;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.m6.i;
import com.amazon.aps.iva.m6.o;
import com.amazon.aps.iva.q.t0;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.d0;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.t5.o;
import com.amazon.aps.iva.types.AdMediaState;
import com.amazon.aps.iva.x5.i;
import com.ellation.crunchyroll.cast.IntroductoryOverlayFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.cast.framework.IntroductoryOverlay;
import com.google.common.util.concurrent.Futures;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import java.util.List;
import java.util.Objects;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements j, o.a, i.a, p1.e, com.amazon.aps.iva.wa.r, IntroductoryOverlay.OnOverlayDismissedListener, t0.a, SynchronizationGuard.CriticalSection, AnalyticsEventLogger {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.amazon.aps.iva.wa.r
    public final AdMediaState a(Object obj) {
        return ((ApsIvaSdkImpl) this.c).g.get((String) obj);
    }

    @Override // com.amazon.aps.iva.x5.i.a
    public final void b(long j, long j2, long j3) {
        float f;
        o.a aVar = ((com.amazon.aps.iva.m6.s) this.c).e;
        if (aVar != null) {
            if (j != -1 && j != 0) {
                f = (((float) j2) * 100.0f) / ((float) j);
            } else {
                f = -1.0f;
            }
            ((i.d) aVar).b(j, j2, f);
        }
    }

    @Override // com.amazon.aps.iva.b8.p1.e
    public final Object e(com.amazon.aps.iva.b8.t tVar, q.d dVar, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 5:
                int i3 = p1.i;
                return tVar.h((List) obj);
            default:
                com.amazon.aps.iva.b8.l lVar = (com.amazon.aps.iva.b8.l) obj;
                com.amazon.aps.iva.b8.o oVar = (com.amazon.aps.iva.b8.o) tVar;
                int i4 = p1.i;
                oVar.getClass();
                if (lVar != null && lVar.c && Objects.equals(dVar.a.a.a, "com.android.systemui")) {
                    if (!oVar.f.j) {
                        return Futures.immediateFuture(com.amazon.aps.iva.b8.k.a(-6));
                    }
                    b0.b bVar = new b0.b();
                    bVar.a = "androidx.media3.session.recent.root";
                    d0.a aVar = new d0.a();
                    aVar.p = Boolean.TRUE;
                    aVar.q = Boolean.FALSE;
                    bVar.k = new d0(aVar);
                    b0 a = bVar.a();
                    com.amazon.aps.iva.b8.k.b(a);
                    return Futures.immediateFuture(new com.amazon.aps.iva.b8.k(0, SystemClock.elapsedRealtime(), lVar, a, 2));
                }
                throw null;
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        return ((ClientHealthMetricsStore) this.c).loadClientMetrics();
    }

    @Override // com.amazon.aps.iva.g1.j
    public final double f(double d) {
        v vVar = (v) this.c;
        com.amazon.aps.iva.yb0.j.f(vVar, "$function");
        if (d >= vVar.e) {
            return Math.pow((vVar.b * d) + vVar.c, vVar.a);
        }
        return d * vVar.d;
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                ((l0.c) obj).o0(((m0) obj2).M);
                return;
            case 2:
                ((l0.c) obj).t((f0) obj2);
                return;
            default:
                ((com.amazon.aps.iva.b6.b) obj).j((b.a) obj2);
                return;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public final void logEvent(String str, Bundle bundle) {
        AnalyticsDeferredProxy.b((AnalyticsDeferredProxy) this.c, str, bundle);
    }

    @Override // com.google.android.gms.cast.framework.IntroductoryOverlay.OnOverlayDismissedListener
    public final void onOverlayDismissed() {
        IntroductoryOverlayFactory.create$lambda$0((com.amazon.aps.iva.xb0.a) this.c);
    }
}
