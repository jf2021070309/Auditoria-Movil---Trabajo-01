package com.amazon.aps.iva.dr;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fr.e;
import com.amazon.aps.iva.gr.i;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.Map;
/* compiled from: OreoFragmentLifecycleCallbacks.kt */
/* loaded from: classes2.dex */
public final class d extends FragmentManager.FragmentLifecycleCallbacks implements b<Activity> {
    public final l<Fragment, Map<String, Object>> a;
    public final com.amazon.aps.iva.gr.f<Fragment> b;
    public final f c;
    public final com.amazon.aps.iva.sq.f d;
    public final com.amazon.aps.iva.ar.a e;
    public final com.amazon.aps.iva.aq.d f;

    public d(i iVar, com.amazon.aps.iva.gr.f fVar, com.amazon.aps.iva.sq.f fVar2, com.amazon.aps.iva.ar.a aVar) {
        f fVar3 = new f();
        r rVar = new r();
        j.f(fVar, "componentPredicate");
        j.f(fVar2, "rumMonitor");
        this.a = iVar;
        this.b = fVar;
        this.c = fVar3;
        this.d = fVar2;
        this.e = aVar;
        this.f = rVar;
    }

    public static boolean c(Fragment fragment) {
        return j.a(fragment.getClass().getName(), "androidx.lifecycle.ReportFragment");
    }

    @Override // com.amazon.aps.iva.dr.b
    public final void a(Activity activity) {
        j.f(activity, "activity");
        if (this.f.b() >= 26) {
            activity.getFragmentManager().registerFragmentLifecycleCallbacks(this, true);
        }
    }

    @Override // com.amazon.aps.iva.dr.b
    public final void b(Activity activity) {
        j.f(activity, "activity");
        if (this.f.b() >= 26) {
            activity.getFragmentManager().unregisterFragmentLifecycleCallbacks(this);
        }
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        Window window;
        j.f(fragmentManager, "fm");
        j.f(fragment, "f");
        super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
        if (c(fragment)) {
            return;
        }
        Context context = fragment.getContext();
        if ((fragment instanceof DialogFragment) && context != null) {
            Dialog dialog = ((DialogFragment) fragment).getDialog();
            if (dialog == null) {
                window = null;
            } else {
                window = dialog.getWindow();
            }
            com.amazon.aps.iva.tq.c.f.getClass();
            com.amazon.aps.iva.tq.c.k.g().a(context, window);
        }
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        j.f(fragment, "f");
        super.onFragmentAttached(fragmentManager, fragment, context);
        if (!c(fragment) && this.b.a(fragment)) {
            try {
                this.c.c(fragment);
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        j.f(fragment, "f");
        super.onFragmentDestroyed(fragmentManager, fragment);
        if (!c(fragment) && this.b.a(fragment)) {
            try {
                f fVar = this.c;
                fVar.getClass();
                fVar.a.remove(fragment);
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        j.f(fragmentManager, "fm");
        j.f(fragment, "f");
        super.onFragmentPaused(fragmentManager, fragment);
        if (!c(fragment) && this.b.a(fragment)) {
            try {
                this.d.e(fragment, a0.b);
                this.c.e(fragment);
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        e.r rVar;
        f fVar = this.c;
        j.f(fragmentManager, "fm");
        j.f(fragment, "f");
        super.onFragmentResumed(fragmentManager, fragment);
        if (c(fragment)) {
            return;
        }
        com.amazon.aps.iva.gr.f<Fragment> fVar2 = this.b;
        if (fVar2.a(fragment)) {
            try {
                fVar2.b(fragment);
                String F = l1.F(fragment);
                fVar.d(fragment);
                this.d.l(fragment, this.a.invoke(fragment), F);
                Long a = fVar.a(fragment);
                if (a != null) {
                    com.amazon.aps.iva.ar.a aVar = this.e;
                    long longValue = a.longValue();
                    if (fVar.b(fragment)) {
                        rVar = e.r.FRAGMENT_DISPLAY;
                    } else {
                        rVar = e.r.FRAGMENT_REDISPLAY;
                    }
                    aVar.m(fragment, longValue, rVar);
                }
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        j.f(fragment, "f");
        super.onFragmentStarted(fragmentManager, fragment);
        if (!c(fragment) && this.b.a(fragment)) {
            try {
                this.c.f(fragment);
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }
}
