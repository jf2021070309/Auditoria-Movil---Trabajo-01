package com.amazon.aps.iva.gr;

import android.app.Activity;
import android.os.Bundle;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fr.e;
import com.amazon.aps.iva.lb0.a0;
import java.util.Map;
/* compiled from: ActivityViewTrackingStrategy.kt */
/* loaded from: classes2.dex */
public final class e extends d implements q {
    public final boolean b;
    public final f<Activity> c;
    public final com.amazon.aps.iva.dr.f d;

    public e(boolean z, f<Activity> fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "componentPredicate");
        this.b = z;
        this.c = fVar;
        this.d = new com.amazon.aps.iva.dr.f();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!com.amazon.aps.iva.yb0.j.a(e.class, cls)) {
            return false;
        }
        if (obj != null) {
            e eVar = (e) obj;
            if (this.b == eVar.b && com.amazon.aps.iva.yb0.j.a(this.c, eVar.c)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.datadog.android.rum.tracking.ActivityViewTrackingStrategy");
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        if (this.c.a(activity)) {
            try {
                this.d.c(activity);
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        if (this.c.a(activity)) {
            try {
                com.amazon.aps.iva.dr.f fVar = this.d;
                fVar.getClass();
                fVar.a.remove(activity);
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        com.amazon.aps.iva.ar.a aVar;
        e.r rVar;
        com.amazon.aps.iva.dr.f fVar = this.d;
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        if (this.c.a(activity)) {
            try {
                Long a = fVar.a(activity);
                if (a != null) {
                    long longValue = a.longValue();
                    com.amazon.aps.iva.sq.f fVar2 = com.amazon.aps.iva.sq.c.c;
                    if (fVar2 instanceof com.amazon.aps.iva.ar.a) {
                        aVar = (com.amazon.aps.iva.ar.a) fVar2;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        if (fVar.b(activity)) {
                            rVar = e.r.ACTIVITY_DISPLAY;
                        } else {
                            rVar = e.r.ACTIVITY_REDISPLAY;
                        }
                        aVar.m(activity, longValue, rVar);
                    }
                }
                com.amazon.aps.iva.sq.c.c.e(activity, a0.b);
                fVar.e(activity);
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        if (this.c.a(activity)) {
            try {
                this.d.d(activity);
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Map map;
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        f<Activity> fVar = this.c;
        if (fVar.a(activity)) {
            try {
                fVar.b(activity);
                String F = l1.F(activity);
                if (this.b) {
                    map = d.b(activity.getIntent());
                } else {
                    map = a0.b;
                }
                com.amazon.aps.iva.sq.c.c.l(activity, map, F);
                this.d.d(activity);
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }

    @Override // com.amazon.aps.iva.gr.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        if (this.c.a(activity)) {
            try {
                this.d.f(activity);
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }
}
