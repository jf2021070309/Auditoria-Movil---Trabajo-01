package com.vungle.publisher;

import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.vungle.publisher.bw;
import com.vungle.publisher.cn;
import com.vungle.publisher.eb;
import com.vungle.publisher.env.r;
import com.vungle.publisher.hr;
import com.vungle.publisher.log.Logger;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import rx.Observable;
import rx.Observer;
@Singleton
/* loaded from: classes4.dex */
public class c extends pi {
    @Inject
    r a;
    @Inject
    Context b;
    @Inject
    com.vungle.publisher.env.i c;
    @Inject
    qg d;
    @Inject
    Class e;
    @Inject
    Class f;
    @Inject
    Class g;
    @Inject
    bw h;
    @Inject
    sz i;
    @Inject
    Lazy<a> j;
    @Inject
    Provider<b> k;
    @Inject
    vc l;
    @Inject
    com.vungle.publisher.env.o m;
    @Inject
    u n;
    @Inject
    com.vungle.publisher.env.k o;
    @Inject
    eb.b p;
    @Inject
    xg q;
    @Inject
    com.vungle.publisher.log.g r;

    public void a() {
        register();
        this.a.a(this.m.d());
        if (this.a.c(this.m.e()) == 0) {
            b(this.m.e(), true);
        } else {
            this.h.b(d.a(this), bw.b.sleepWakeup, PushUIConfig.dismissTime);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void e() {
        this.d.a(new bl(this.m.e()));
    }

    public boolean a(String str) {
        return (str == null || this.p.b(str) == null) ? false : true;
    }

    public boolean b(String str) {
        this.r.b.info("isAdPlayable called for placement: " + str);
        return !this.o.a() && this.o.b() && a(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cn c(String str) {
        dr<?> d = d(str);
        hr m_ = d != null ? d.m_() : null;
        hr a2 = a(str, m_ == null ? null : m_.l());
        if (a2 == null) {
            a2 = m_;
        }
        this.r.b.info("next ad " + (a2 != null ? a2.B() : null));
        return a2;
    }

    void a(Observable<dr<?>> observable, final String str) {
        this.r.b.info("requestLocalAd processing: " + str);
        if (this.a.a(false, true)) {
            this.a.b(str);
            observable.subscribe(new Observer<dr<?>>() { // from class: com.vungle.publisher.c.1
                @Override // rx.Observer
                public void onCompleted() {
                    c.this.r.b.info("ad observable onComplete");
                    c.this.a.a(false);
                }

                @Override // rx.Observer
                public void onError(Throwable th) {
                    c.this.r.b.info("ad observable onError");
                    c.this.a.a(false);
                    c.this.a.b((String) null);
                    if (str.contentEquals(c.this.m.e())) {
                        c.this.r.b.info("ad observable onError , queuing it for retry at end of the queue !");
                        c.this.a.a(str);
                    } else {
                        c.this.r.b.info("ad observable onError , ignoring this No retries !");
                    }
                    c.this.d.a(new al());
                }

                @Override // rx.Observer
                /* renamed from: a */
                public void onNext(dr<?> drVar) {
                    c.this.r.b.info("ad observable onNext");
                    c.this.a.a(false);
                    c.this.a.b((String) null);
                    c.this.d.a(new al());
                    c.this.d.a(new am(str));
                }
            });
            return;
        }
        this.r.b.info("queuing this for now, will get back to this Ad Prepare");
        this.a.a(str);
    }

    dr<?> a(String str, boolean z) {
        dr<?> drVar = null;
        if (this.c.l()) {
            dr<?> a2 = z ? this.p.a(str) : this.p.b(str);
            if (a2 == null) {
                this.r.b.info("no local ad available");
                if (z) {
                    a(this.q.a(str), str);
                    return a2;
                }
                return a2;
            }
            cn.c g = a2.g();
            if (g == cn.c.preparing) {
                if (z) {
                    this.r.b.info("local ad partially prepared, restarting preparation for " + a2.d());
                    a(this.q.a(a2), str);
                } else {
                    this.r.b.info("local ad partially prepared, but not restarting preparation for " + a2.d());
                }
            } else {
                if (g == cn.c.ready) {
                    this.r.b.info("local ad already available for " + a2.d());
                }
                drVar = a2;
            }
            return drVar;
        }
        this.r.b.warning("unable to fetch local ad -  no external storage available");
        return null;
    }

    public dr<?> d(String str) {
        return a(str, false);
    }

    public void a(String str, t tVar) {
        Class cls;
        boolean z = false;
        if (this.m.b(str) == null) {
            this.d.a(new bm(null, str));
        } else if (this.o.a(str)) {
            this.r.b.fine("AdManager.playAd()");
            try {
                cn c = c(str);
                if (c == null) {
                    this.r.b.info("no ad to play");
                    this.d.a(new bq(null, str));
                } else {
                    this.j.get().register();
                    if (c.a_() == m.vungle_local || c.a_() == m.vungle_streaming) {
                        cls = this.e;
                    } else if (c.a_() == m.vungle_mraid && x.flexview == x.a(c.s)) {
                        cls = this.g;
                    } else {
                        cls = this.f;
                    }
                    Intent intent = new Intent(this.b, cls);
                    intent.addFlags(805306368);
                    this.n.a(intent, tVar);
                    intent.putExtra(VungleAdActivity.AD_ID_EXTRA_KEY, c.c_());
                    intent.putExtra(VungleAdActivity.AD_TYPE_EXTRA_KEY, c.a_());
                    intent.putExtra(VungleAdActivity.AD_PLACEMENT_REFERENCE_ID_KEY, str);
                    this.b.startActivity(intent);
                    z = true;
                }
                if (!z) {
                }
            } catch (Exception e) {
                this.r.b.severe("Error launching ad: " + e.getMessage());
                this.d.a(new bu(null, str, false));
            } finally {
                this.l.c();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v5, types: [long] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    hr a(String str, String str2) {
        hr hrVar;
        Exception exc;
        hr hrVar2 = null;
        try {
            if (!this.m.b()) {
                return null;
            }
            this.r.b.info("requesting streaming ad");
            b bVar = this.k.get();
            bVar.register();
            this.l.a(str, str2);
            ?? r2 = bVar.c;
            long c = this.m.c() + r2;
            synchronized (bVar) {
                while (!bVar.a) {
                    try {
                        try {
                            long currentTimeMillis = c - System.currentTimeMillis();
                            if (currentTimeMillis <= 0) {
                                break;
                            }
                            try {
                                bVar.wait(currentTimeMillis);
                            } catch (InterruptedException e) {
                            }
                        } catch (Throwable th) {
                            r2 = 0;
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis() - r2;
                if (bVar.a) {
                    hr hrVar3 = bVar.b;
                    if (hrVar3 != null) {
                        this.r.b.info("request streaming ad success after " + currentTimeMillis2 + " ms " + hrVar3.B());
                        hrVar2 = hrVar3;
                    } else {
                        hrVar2 = hrVar3;
                    }
                } else {
                    this.r.b.info("request streaming ad timeout after " + currentTimeMillis2 + " ms");
                    bVar.a();
                }
                try {
                    return hrVar2;
                } catch (Throwable th3) {
                    r2 = hrVar2;
                    th = th3;
                }
            }
            try {
                throw th;
            } catch (Exception e2) {
                exc = e2;
                hrVar = r2;
                Logger.e(Logger.EVENT_TAG, "error getting streaming ad", exc);
                this.r.b.severe("error getting streaming ad: " + exc.getMessage());
                return hrVar;
            }
        } catch (Exception e3) {
            hrVar = null;
            exc = e3;
        }
    }

    void b() {
        this.h.a(bw.b.deleteExpiredAds);
        Long c = this.p.c();
        if (c != null) {
            this.h.a(e.a(this), bw.b.deleteExpiredAds, c.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void d() {
        this.p.a();
    }

    void b(String str, boolean z) {
        a(str, z);
        b();
    }

    public void onEvent(ql qlVar) {
        b(qlVar.a(), true);
    }

    public void onEvent(al alVar) {
        this.r.b.finest("HandleQueuedAdAvailabilityEvent");
        if (!this.a.n()) {
            b(this.a.m(), true);
        } else {
            f();
        }
    }

    private void f() {
        this.h.a(f.a(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void c() {
        this.r.b.finest("cleanUpInactivePlacements");
        this.p.a(this.m.f());
    }

    public void onEvent(ag agVar) {
        this.r.b.finest("decreasedAdAvailabilityEvent: " + agVar.a());
        if (agVar.a().equals(this.m.e())) {
            b(this.m.e(), true);
        }
    }

    public void e(String str) {
        if (this.m.b(str) == null) {
            this.d.a(new bl(str));
        } else if (a(str)) {
            this.d.a(new as(str));
        } else if (this.a.c(str) > 0) {
            this.d.a(new bl(str));
        } else if (!str.equals(this.a.o())) {
            a(str, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.vungle.publisher.cn] */
    public boolean f(String str) {
        dr<?> c;
        if (this.m.b(str) != null && (c = this.p.c(str)) != null) {
            ?? m_ = c.m_();
            if (m_.a_() == m.vungle_mraid && x.flexview == x.a(m_.s)) {
                this.d.a(new sf(str));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends pi {
        final String a = Logger.PREPARE_TAG;
        @Inject
        com.vungle.publisher.log.g b;

        public void onEvent(av<cn> avVar) {
            try {
                avVar.b().b(cn.c.viewed);
            } catch (Exception e) {
                Logger.e(Logger.PREPARE_TAG, "could not start Ad play: " + e.getLocalizedMessage());
                this.b.b.severe("error processing start play ad event: " + e.getMessage());
            }
        }

        public void onEvent(aj ajVar) {
            this.b.b.info("sent ad report - un-registering play ad listener");
            unregister();
        }

        public void onEvent(bk bkVar) {
            this.b.b.info("play ad failure - un-registering play ad listener");
            unregister();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class b extends pi {
        volatile boolean a;
        volatile hr b;
        final long c = System.currentTimeMillis();
        @Inject
        hr.a d;
        @Inject
        com.vungle.publisher.log.g e;

        void a() {
            this.a = true;
            synchronized (this) {
                notifyAll();
            }
        }

        public void onEvent(ak akVar) {
            unregister();
            this.e.b.info("request streaming ad failure after " + (akVar.e() - this.c) + " ms");
            a();
        }

        public void onEvent(au auVar) {
            unregister();
            long e = auVar.e() - this.c;
            wm a = auVar.a();
            if (Boolean.TRUE.equals(a.n())) {
                String g = a.g();
                this.e.b.info("received streaming ad: " + g + " after " + e + " ms");
                hr hrVar = (hr) this.d.a((hr.a) g, true);
                if (hrVar == null) {
                    hr a2 = this.d.a(a);
                    this.b = a2;
                    this.e.b.info("inserting new " + a2.B());
                    try {
                        a2.d_();
                    } catch (SQLException e2) {
                        this.e.b.info("did not insert streaming ad - possible duplicate");
                    }
                } else {
                    try {
                        this.d.a((hr.a) hrVar, (hr) a);
                    } catch (Exception e3) {
                        this.e.b.warning("error updating ad " + g + ": " + e3.getMessage());
                    }
                    cn.c g2 = hrVar.g();
                    switch (g2) {
                        case aware:
                            this.e.b.warning("unexpected ad status " + g2 + " for " + hrVar.B());
                        case ready:
                        case viewed:
                            this.e.b.info("existing " + hrVar.B() + " with status " + g2);
                            if (g2 != cn.c.ready) {
                                hrVar.b(cn.c.ready);
                            }
                            this.b = hrVar;
                            break;
                        default:
                            this.e.b.warning("existing " + hrVar.B() + " with status " + g2 + " - ignoring");
                            break;
                    }
                }
            } else {
                this.e.b.info("no streaming ad to play after " + e + " ms");
            }
            a();
        }
    }
}
