package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.o;
/* compiled from: ProcessLifecycleOwner.kt */
/* loaded from: classes.dex */
public final class m implements com.amazon.aps.iva.i5.o {
    public static final m j = new m();
    public int b;
    public int c;
    public Handler f;
    public boolean d = true;
    public boolean e = true;
    public final k g = new k(this);
    public final com.amazon.aps.iva.v1.p h = new com.amazon.aps.iva.v1.p(this, 2);
    public final b i = new b();

    /* compiled from: ProcessLifecycleOwner.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            com.amazon.aps.iva.yb0.j.f(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public final void g() {
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            if (this.d) {
                this.g.c(g.a.ON_RESUME);
                this.d = false;
                return;
            }
            Handler handler = this.f;
            com.amazon.aps.iva.yb0.j.c(handler);
            handler.removeCallbacks(this.h);
        }
    }

    @Override // com.amazon.aps.iva.i5.o
    public final g getLifecycle() {
        return this.g;
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    /* loaded from: classes.dex */
    public static final class b implements o.a {
        public b() {
        }

        @Override // androidx.lifecycle.o.a
        public final void onResume() {
            m.this.g();
        }

        @Override // androidx.lifecycle.o.a
        public final void onStart() {
            m mVar = m.this;
            int i = mVar.b + 1;
            mVar.b = i;
            if (i == 1 && mVar.e) {
                mVar.g.c(g.a.ON_START);
                mVar.e = false;
            }
        }

        @Override // androidx.lifecycle.o.a
        public final void onCreate() {
        }
    }
}
