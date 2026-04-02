package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
/* compiled from: ProcessLifecycleOwner.kt */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.i5.h {
    final /* synthetic */ m this$0;

    /* compiled from: ProcessLifecycleOwner.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.i5.h {
        final /* synthetic */ m this$0;

        public a(m mVar) {
            this.this$0 = mVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            this.this$0.g();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            m mVar = this.this$0;
            int i = mVar.b + 1;
            mVar.b = i;
            if (i == 1 && mVar.e) {
                mVar.g.c(g.a.ON_START);
                mVar.e = false;
            }
        }
    }

    public n(m mVar) {
        this.this$0 = mVar;
    }

    @Override // com.amazon.aps.iva.i5.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = o.c;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            com.amazon.aps.iva.yb0.j.d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((o) findFragmentByTag).b = this.this$0.i;
        }
    }

    @Override // com.amazon.aps.iva.i5.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        m mVar = this.this$0;
        int i = mVar.c - 1;
        mVar.c = i;
        if (i == 0) {
            Handler handler = mVar.f;
            com.amazon.aps.iva.yb0.j.c(handler);
            handler.postDelayed(mVar.h, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        m.a.a(activity, new a(this.this$0));
    }

    @Override // com.amazon.aps.iva.i5.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        m mVar = this.this$0;
        int i = mVar.b - 1;
        mVar.b = i;
        if (i == 0 && mVar.d) {
            mVar.g.c(g.a.ON_STOP);
            mVar.e = true;
        }
    }
}
