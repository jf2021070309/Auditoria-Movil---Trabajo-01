package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import com.amazon.aps.iva.e.m;
import com.amazon.aps.iva.e.n;
import com.amazon.aps.iva.e.p;
import com.amazon.aps.iva.e.r;
import com.amazon.aps.iva.e.s;
import com.amazon.aps.iva.e.t;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.k;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
/* compiled from: OnBackPressedDispatcher.kt */
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    public final Runnable a;
    public final com.amazon.aps.iva.o3.a<Boolean> b;
    public final k<m> c;
    public m d;
    public final OnBackInvokedCallback e;
    public OnBackInvokedDispatcher f;
    public boolean g;
    public boolean h;

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/j;", "Lcom/amazon/aps/iva/e/c;", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public final class LifecycleOnBackPressedCancellable implements j, com.amazon.aps.iva.e.c {
        public final g b;
        public final m c;
        public c d;
        public final /* synthetic */ OnBackPressedDispatcher e;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, g gVar, m mVar) {
            com.amazon.aps.iva.yb0.j.f(mVar, "onBackPressedCallback");
            this.e = onBackPressedDispatcher;
            this.b = gVar;
            this.c = mVar;
            gVar.addObserver(this);
        }

        @Override // androidx.lifecycle.j
        public final void U2(o oVar, g.a aVar) {
            if (aVar == g.a.ON_START) {
                this.d = this.e.b(this.c);
            } else if (aVar == g.a.ON_STOP) {
                c cVar = this.d;
                if (cVar != null) {
                    cVar.cancel();
                }
            } else if (aVar == g.a.ON_DESTROY) {
                cancel();
            }
        }

        @Override // com.amazon.aps.iva.e.c
        public final void cancel() {
            this.b.removeObserver(this);
            this.c.removeCancellable(this);
            c cVar = this.d;
            if (cVar != null) {
                cVar.cancel();
            }
            this.d = null;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final a a = new a();

        public final OnBackInvokedCallback a(com.amazon.aps.iva.xb0.a<q> aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "onBackInvoked");
            return new s(aVar, 0);
        }

        public final void b(Object obj, int i, Object obj2) {
            com.amazon.aps.iva.yb0.j.f(obj, "dispatcher");
            com.amazon.aps.iva.yb0.j.f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        public final void c(Object obj, Object obj2) {
            com.amazon.aps.iva.yb0.j.f(obj, "dispatcher");
            com.amazon.aps.iva.yb0.j.f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public static final b a = new b();

        /* compiled from: OnBackPressedDispatcher.kt */
        /* loaded from: classes.dex */
        public static final class a implements OnBackAnimationCallback {
            public final /* synthetic */ l<com.amazon.aps.iva.e.b, q> a;
            public final /* synthetic */ l<com.amazon.aps.iva.e.b, q> b;
            public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> c;
            public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(l<? super com.amazon.aps.iva.e.b, q> lVar, l<? super com.amazon.aps.iva.e.b, q> lVar2, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.xb0.a<q> aVar2) {
                this.a = lVar;
                this.b = lVar2;
                this.c = aVar;
                this.d = aVar2;
            }

            public final void onBackCancelled() {
                this.d.invoke();
            }

            public final void onBackInvoked() {
                this.c.invoke();
            }

            public final void onBackProgressed(BackEvent backEvent) {
                com.amazon.aps.iva.yb0.j.f(backEvent, "backEvent");
                this.b.invoke(new com.amazon.aps.iva.e.b(backEvent));
            }

            public final void onBackStarted(BackEvent backEvent) {
                com.amazon.aps.iva.yb0.j.f(backEvent, "backEvent");
                this.a.invoke(new com.amazon.aps.iva.e.b(backEvent));
            }
        }

        public final OnBackInvokedCallback a(l<? super com.amazon.aps.iva.e.b, q> lVar, l<? super com.amazon.aps.iva.e.b, q> lVar2, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.xb0.a<q> aVar2) {
            com.amazon.aps.iva.yb0.j.f(lVar, "onBackStarted");
            com.amazon.aps.iva.yb0.j.f(lVar2, "onBackProgressed");
            com.amazon.aps.iva.yb0.j.f(aVar, "onBackInvoked");
            com.amazon.aps.iva.yb0.j.f(aVar2, "onBackCancelled");
            return new a(lVar, lVar2, aVar, aVar2);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: classes.dex */
    public final class c implements com.amazon.aps.iva.e.c {
        public final m b;
        public final /* synthetic */ OnBackPressedDispatcher c;

        public c(OnBackPressedDispatcher onBackPressedDispatcher, m mVar) {
            com.amazon.aps.iva.yb0.j.f(mVar, "onBackPressedCallback");
            this.c = onBackPressedDispatcher;
            this.b = mVar;
        }

        @Override // com.amazon.aps.iva.e.c
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.c;
            k<m> kVar = onBackPressedDispatcher.c;
            m mVar = this.b;
            kVar.remove(mVar);
            if (com.amazon.aps.iva.yb0.j.a(onBackPressedDispatcher.d, mVar)) {
                mVar.handleOnBackCancelled();
                onBackPressedDispatcher.d = null;
            }
            mVar.removeCancellable(this);
            com.amazon.aps.iva.xb0.a<q> enabledChangedCallback$activity_release = mVar.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            mVar.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class d extends i implements com.amazon.aps.iva.xb0.a<q> {
        public d(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ((OnBackPressedDispatcher) this.receiver).e();
            return q.a;
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        OnBackInvokedCallback a2;
        this.a = runnable;
        this.b = null;
        this.c = new k<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                a2 = b.a.a(new n(this), new com.amazon.aps.iva.e.o(this), new p(this), new com.amazon.aps.iva.e.q(this));
            } else {
                a2 = a.a.a(new r(this));
            }
            this.e = a2;
        }
    }

    public final void a(o oVar, m mVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
        com.amazon.aps.iva.yb0.j.f(mVar, "onBackPressedCallback");
        g lifecycle = oVar.getLifecycle();
        if (lifecycle.getCurrentState() == g.b.DESTROYED) {
            return;
        }
        mVar.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, mVar));
        e();
        mVar.setEnabledChangedCallback$activity_release(new d(this));
    }

    public final c b(m mVar) {
        com.amazon.aps.iva.yb0.j.f(mVar, "onBackPressedCallback");
        this.c.addLast(mVar);
        c cVar = new c(this, mVar);
        mVar.addCancellable(cVar);
        e();
        mVar.setEnabledChangedCallback$activity_release(new t(this));
        return cVar;
    }

    public final void c() {
        m mVar;
        k<m> kVar = this.c;
        ListIterator<m> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                mVar = listIterator.previous();
                if (mVar.isEnabled()) {
                    break;
                }
            } else {
                mVar = null;
                break;
            }
        }
        m mVar2 = mVar;
        this.d = null;
        if (mVar2 != null) {
            mVar2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.e) != null) {
            a aVar = a.a;
            if (z && !this.g) {
                aVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.g = true;
            } else if (!z && this.g) {
                aVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.g = false;
            }
        }
    }

    public final void e() {
        boolean z = this.h;
        k<m> kVar = this.c;
        boolean z2 = false;
        if (!(kVar instanceof Collection) || !kVar.isEmpty()) {
            Iterator<m> it = kVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().isEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.h = z2;
        if (z2 != z) {
            com.amazon.aps.iva.o3.a<Boolean> aVar = this.b;
            if (aVar != null) {
                aVar.a(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                d(z2);
            }
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }
}
