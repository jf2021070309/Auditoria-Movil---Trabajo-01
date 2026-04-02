package com.vungle.publisher;

import android.app.AlertDialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.vungle.publisher.inject.Injector;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.mm;
import com.vungle.publisher.mq;
import com.vungle.publisher.og;
import com.vungle.publisher.rf;
import com.vungle.publisher.ro;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class my extends mm<rf> {
    final Handler n = new Handler();
    AtomicInteger o = new AtomicInteger(0);
    AtomicInteger p = new AtomicInteger(0);
    ro q;
    og r;
    @Inject
    rf.a s;
    @Inject
    b.a t;
    @Inject
    rr u;
    @Inject
    ro.a v;
    @Inject
    og.a w;

    @Override // com.vungle.publisher.mm, android.app.Fragment
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            if (Injector.getInstance().d()) {
                Injector.c().a(this);
                this.t.a(this).register();
            } else {
                Logger.w(Logger.AD_TAG, "SDK not initialized");
                getActivity().finish();
            }
        } catch (Exception e2) {
            Logger.e(Logger.AD_TAG, "exception while creating Mraid ad fragment", e2);
        }
    }

    @Override // com.vungle.publisher.mm, android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.u.a(this.f);
    }

    @Override // com.vungle.publisher.mm, android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RelativeLayout relativeLayout = (RelativeLayout) super.onCreateView(layoutInflater, viewGroup, bundle);
        try {
            this.q = this.v.a();
            relativeLayout.addView(this.q);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.q.getLayoutParams();
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            this.v.a(this.q);
            a(ro.b.visible, 0, 3000L);
            this.q.setOnClickListener(mz.a(this));
            this.r = this.w.a(this.m, true);
            relativeLayout.addView(this.r);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.r.getLayoutParams();
            layoutParams2.addRule(9);
            layoutParams2.addRule(10);
            a(true, 0, 3000L);
            relativeLayout.setBackgroundColor(0);
        } catch (Exception e2) {
            Logger.e(Logger.AD_TAG, "error creating MraidAdFragment", e2);
        }
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(View view) {
        d();
    }

    void a(ro.b bVar, int i, long j) {
        this.n.postDelayed(new c(bVar, i), j);
    }

    void a(boolean z, int i, long j) {
        this.n.postDelayed(new e(Integer.valueOf(z ? 0 : 8), i), j);
    }

    public boolean c() {
        return ((rf) this.f).b();
    }

    @Override // com.vungle.publisher.mm, android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.t != null) {
            this.t.a(this).unregister();
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        try {
            super.onResume();
            this.u.a(true, this.f);
        } catch (Exception e2) {
            Logger.e(Logger.AD_TAG, "error resuming mraid ad", e2);
        }
    }

    @Override // android.app.Fragment
    public void onPause() {
        try {
            super.onPause();
            this.u.a(false, this.f);
        } catch (Exception e2) {
            Logger.e(Logger.AD_TAG, "error pausing mraid ad", e2);
        }
    }

    @Override // com.vungle.publisher.mf
    public void a(boolean z) {
        super.a(z);
        if (z) {
            onResume();
        } else {
            onPause();
        }
    }

    void d() {
        this.k.a(new sj());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vungle.publisher.mm
    /* renamed from: b */
    public rf a(String str, p pVar, x xVar) {
        this.u.a(xVar);
        return this.s.a(str, pVar, this.c, xVar);
    }

    @Override // com.vungle.publisher.mf
    public void a() {
        try {
            if (!((rf) this.f).a()) {
                d();
            }
        } catch (Exception e2) {
            Logger.w(Logger.AD_TAG, "exception in onBackPressed", e2);
        }
    }

    @Override // com.vungle.publisher.mf
    public String b() {
        return "fullScreenMraidFragment";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.a = f();
        this.a.show();
    }

    private AlertDialog f() {
        if (this.a != null) {
            return this.a;
        }
        return this.d.a(getActivity(), this.h, new mq.a() { // from class: com.vungle.publisher.my.1
            @Override // com.vungle.publisher.mq.a
            public void a() {
                my.this.u.a(my.this.f, true);
            }

            @Override // com.vungle.publisher.mq.a
            public void b() {
                Logger.d(Logger.AD_TAG, "cancel video");
                my.this.u.a(my.this.f, false);
            }

            @Override // com.vungle.publisher.mq.a
            public void c() {
                my.this.u.a(my.this.f, true);
            }
        });
    }

    /* loaded from: classes4.dex */
    abstract class d<V> implements Runnable {
        final V b;
        final int c;

        abstract AtomicInteger a();

        abstract void a(V v);

        public d(V v, int i) {
            this.c = i;
            this.b = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            try {
                AtomicInteger a = a();
                do {
                    i = a.get();
                    if (this.c < i) {
                        return;
                    }
                } while (!a.compareAndSet(i, this.c));
                a(this.b);
            } catch (Exception e) {
                Logger.w(Logger.AD_TAG, e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends d<ro.b> {
        public c(ro.b bVar, int i) {
            super(bVar, i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.vungle.publisher.my.d
        public void a(ro.b bVar) {
            my.this.q.setCloseVisibility(bVar);
        }

        @Override // com.vungle.publisher.my.d
        AtomicInteger a() {
            return my.this.o;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends d<Integer> {
        public e(Integer num, int i) {
            super(num, i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.vungle.publisher.my.d
        public void a(Integer num) {
            my.this.r.setVisibility(num.intValue());
        }

        @Override // com.vungle.publisher.my.d
        AtomicInteger a() {
            return my.this.p;
        }
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends mm.a<my> {
        @Inject
        Provider<my> a;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.mm.a
        /* renamed from: c */
        public my a() {
            return this.a.get();
        }

        @Override // com.vungle.publisher.mm.a
        protected String b() {
            return "fullScreenMraidFragment";
        }
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class b extends pi {
        my a;

        public void onEvent(st stVar) {
            ro.b a2 = stVar.a();
            Logger.v(Logger.EVENT_TAG, "set close region: " + a2);
            this.a.a(a2, 2, 0L);
        }

        public void onEvent(su suVar) {
            boolean a2 = suVar.a();
            Logger.v(Logger.EVENT_TAG, "use custom privacy icon? " + a2);
            this.a.a(!a2, 2, 0L);
        }

        public void onEvent(ss ssVar) {
            Logger.v(Logger.EVENT_TAG, "throw incentivized dialog");
            this.a.e();
        }

        public void onEvent(sq sqVar) {
            this.a.a(ro.b.visible, 1, 500L);
            this.a.a(true, 1, 500L);
        }

        @Singleton
        /* loaded from: classes4.dex */
        public static class a {
            @Inject
            b a;

            public b a(my myVar) {
                this.a.a = myVar;
                return this.a;
            }
        }
    }
}
