package com.flurry.sdk;

import com.flurry.sdk.ky;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class kz<ReportInfo extends ky> {
    private static final String a = kz.class.getSimpleName();
    public static long b = 10000;
    public boolean c;
    public long d;
    private final kh<List<ReportInfo>> f;
    private int h;
    private final int e = Integer.MAX_VALUE;
    private final List<ReportInfo> g = new ArrayList();
    private final Runnable i = new mc() { // from class: com.flurry.sdk.kz.1
        @Override // com.flurry.sdk.mc
        public final void a() {
            kz.this.b();
        }
    };
    private final kj<js> j = new kj<js>() { // from class: com.flurry.sdk.kz.2
        @Override // com.flurry.sdk.kj
        public final /* bridge */ /* synthetic */ void a(js jsVar) {
            if (jsVar.a) {
                kz.this.b();
            }
        }
    };

    public abstract kh<List<ReportInfo>> a();

    public abstract void a(ReportInfo reportinfo);

    public kz() {
        kk.a().a("com.flurry.android.sdk.NetworkStateEvent", this.j);
        this.f = a();
        this.d = b;
        this.h = -1;
        ka.a().b(new mc() { // from class: com.flurry.sdk.kz.3
            @Override // com.flurry.sdk.mc
            public final void a() {
                kz.this.a(kz.this.g);
                kz.this.b();
            }
        });
    }

    public synchronized void a(List<ReportInfo> list) {
        ma.b();
        List<ReportInfo> a2 = this.f.a();
        if (a2 != null) {
            list.addAll(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        if (!this.c) {
            if (this.h >= 0) {
                ko.a(3, a, "Transmit is in progress");
            } else {
                d();
                if (this.g.isEmpty()) {
                    this.d = b;
                    this.h = -1;
                } else {
                    this.h = 0;
                    ka.a().b(new mc() { // from class: com.flurry.sdk.kz.4
                        @Override // com.flurry.sdk.mc
                        public final void a() {
                            kz.this.e();
                        }
                    });
                }
            }
        }
    }

    private synchronized void d() {
        Iterator<ReportInfo> it = this.g.iterator();
        while (it.hasNext()) {
            ReportInfo next = it.next();
            if (next.o) {
                ko.a(3, a, "Url transmitted - " + next.q + " Attempts: " + next.p);
                it.remove();
            } else if (next.p > next.a()) {
                ko.a(3, a, "Exceeded max no of attempts - " + next.q + " Attempts: " + next.p);
                it.remove();
            } else if (System.currentTimeMillis() > next.n && next.p > 0) {
                ko.a(3, a, "Expired: Time expired - " + next.q + " Attempts: " + next.p);
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() {
        ReportInfo reportinfo;
        ma.b();
        if (jt.a().b) {
            while (this.h < this.g.size()) {
                List<ReportInfo> list = this.g;
                int i = this.h;
                this.h = i + 1;
                reportinfo = list.get(i);
                if (!reportinfo.o) {
                    break;
                }
            }
        } else {
            ko.a(3, a, "Network is not available, aborting transmission");
        }
        reportinfo = null;
        if (reportinfo == null) {
            f();
        } else {
            a((kz<ReportInfo>) reportinfo);
        }
    }

    private synchronized void f() {
        d();
        b(this.g);
        if (this.c) {
            ko.a(3, a, "Reporter paused");
            this.d = b;
        } else if (this.g.isEmpty()) {
            ko.a(3, a, "All reports sent successfully");
            this.d = b;
        } else {
            this.d <<= 1;
            ko.a(3, a, "One or more reports failed to send, backing off: " + this.d + "ms");
            ka.a().a(this.i, this.d);
        }
        this.h = -1;
    }

    public synchronized void b(List<ReportInfo> list) {
        ma.b();
        this.f.a(new ArrayList(list));
    }

    public final void c() {
        this.c = false;
        ka.a().b(new mc() { // from class: com.flurry.sdk.kz.5
            @Override // com.flurry.sdk.mc
            public final void a() {
                kz.this.b();
            }
        });
    }

    public final synchronized void b(ReportInfo reportinfo) {
        if (reportinfo != null) {
            this.g.add(reportinfo);
            ka.a().b(new mc() { // from class: com.flurry.sdk.kz.6
                @Override // com.flurry.sdk.mc
                public final void a() {
                    kz.this.b();
                }
            });
        }
    }

    public final synchronized void c(ReportInfo reportinfo) {
        reportinfo.o = true;
        ka.a().b(new mc() { // from class: com.flurry.sdk.kz.7
            @Override // com.flurry.sdk.mc
            public final void a() {
                kz.this.e();
            }
        });
    }

    public final synchronized void d(ReportInfo reportinfo) {
        reportinfo.a_();
        ka.a().b(new mc() { // from class: com.flurry.sdk.kz.8
            @Override // com.flurry.sdk.mc
            public final void a() {
                kz.this.e();
            }
        });
    }
}
