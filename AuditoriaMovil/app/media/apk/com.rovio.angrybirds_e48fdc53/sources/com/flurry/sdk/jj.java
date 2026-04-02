package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.flurry.android.FlurryEventRecordStatus;
import com.flurry.sdk.jg;
import com.flurry.sdk.ln;
import com.flurry.sdk.ls;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class jj implements ls.a {
    static final String a = jj.class.getSimpleName();
    static int b = 100;
    static int c = 10;
    static int d = 1000;
    static int e = 160000;
    static int f = 50;
    private String A;
    WeakReference<lm> g;
    File h;
    kh<List<jg>> i;
    public boolean j;
    boolean k;
    String l;
    byte m;
    Long n;
    private long z;
    private final AtomicInteger q = new AtomicInteger(0);
    private final AtomicInteger r = new AtomicInteger(0);
    private final List<jg> s = new ArrayList();
    private final Map<String, List<String>> t = new HashMap();
    private final Map<String, String> u = new HashMap();
    private final Map<String, jc> v = new HashMap();
    private final List<jd> w = new ArrayList();
    private final List<jb> x = new ArrayList();
    private final ht y = new ht();
    private int B = -1;
    private boolean C = true;
    private int D = 0;
    private int E = 0;
    private int F = 0;
    boolean o = true;
    final kj<jo> p = new kj<jo>() { // from class: com.flurry.sdk.jj.1
        @Override // com.flurry.sdk.kj
        public final /* synthetic */ void a(jo joVar) {
            ka.a().b(new mc() { // from class: com.flurry.sdk.jj.1.1
                @Override // com.flurry.sdk.mc
                public final void a() {
                    jj jjVar = jj.this;
                    jm.a();
                    jjVar.a(true, jm.d());
                }
            });
        }
    };
    private final kj<ln> G = new kj<ln>() { // from class: com.flurry.sdk.jj.9
        @Override // com.flurry.sdk.kj
        public final /* synthetic */ void a(ln lnVar) {
            ln lnVar2 = lnVar;
            if (jj.this.g == null || lnVar2.b == jj.this.g.get()) {
                switch (AnonymousClass8.a[lnVar2.c - 1]) {
                    case 1:
                        final jj jjVar = jj.this;
                        lm lmVar = lnVar2.b;
                        Context context = lnVar2.a.get();
                        jjVar.g = new WeakReference<>(lmVar);
                        lr a2 = lr.a();
                        jjVar.k = ((Boolean) a2.a("LogEvents")).booleanValue();
                        a2.a("LogEvents", (ls.a) jjVar);
                        ko.a(4, jj.a, "initSettings, LogEvents = " + jjVar.k);
                        jjVar.l = (String) a2.a("UserId");
                        a2.a("UserId", (ls.a) jjVar);
                        ko.a(4, jj.a, "initSettings, UserId = " + jjVar.l);
                        jjVar.m = ((Byte) a2.a("Gender")).byteValue();
                        a2.a("Gender", (ls.a) jjVar);
                        ko.a(4, jj.a, "initSettings, Gender = " + ((int) jjVar.m));
                        jjVar.n = (Long) a2.a("Age");
                        a2.a("Age", (ls.a) jjVar);
                        ko.a(4, jj.a, "initSettings, BirthDate = " + jjVar.n);
                        jjVar.o = ((Boolean) a2.a("analyticsEnabled")).booleanValue();
                        a2.a("analyticsEnabled", (ls.a) jjVar);
                        ko.a(4, jj.a, "initSettings, AnalyticsEnabled = " + jjVar.o);
                        jjVar.h = context.getFileStreamPath(".flurryagent." + Integer.toString(ka.a().d.hashCode(), 16));
                        jjVar.i = new kh<>(context.getFileStreamPath(".yflurryreport." + Long.toString(ma.i(ka.a().d), 16)), ".yflurryreport.", 1, new ll<List<jg>>() { // from class: com.flurry.sdk.jj.10
                            @Override // com.flurry.sdk.ll
                            public final li<List<jg>> a(int i) {
                                return new lh(new jg.a());
                            }
                        });
                        jjVar.a(context);
                        jjVar.a(true);
                        if (hs.a().a != null) {
                            ka.a().b(new mc() { // from class: com.flurry.sdk.jj.11
                                @Override // com.flurry.sdk.mc
                                public final void a() {
                                    hs.a().a.a();
                                }
                            });
                        }
                        ka.a().b(new mc() { // from class: com.flurry.sdk.jj.12
                            @Override // com.flurry.sdk.mc
                            public final void a() {
                                jj.this.e();
                            }
                        });
                        ka.a().b(new mc() { // from class: com.flurry.sdk.jj.13
                            @Override // com.flurry.sdk.mc
                            public final void a() {
                                jj.d(jj.this);
                            }
                        });
                        if (jn.a().b()) {
                            ka.a().b(new mc() { // from class: com.flurry.sdk.jj.14
                                @Override // com.flurry.sdk.mc
                                public final void a() {
                                    jj jjVar2 = jj.this;
                                    jm.a();
                                    jjVar2.a(true, jm.d());
                                }
                            });
                            return;
                        } else {
                            kk.a().a("com.flurry.android.sdk.IdProviderFinishedEvent", jjVar.p);
                            return;
                        }
                    case 2:
                        jj jjVar2 = jj.this;
                        lnVar2.a.get();
                        jjVar2.b();
                        return;
                    case 3:
                        jj jjVar3 = jj.this;
                        lnVar2.a.get();
                        jjVar3.c();
                        return;
                    case 4:
                        kk.a().b("com.flurry.android.sdk.FlurrySessionEvent", jj.this.G);
                        jj.this.a(lnVar2.d);
                        return;
                    default:
                        return;
                }
            }
        }
    };

    /* renamed from: com.flurry.sdk.jj$8  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] a = new int[ln.a.a().length];

        static {
            try {
                a[ln.a.a - 1] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[ln.a.c - 1] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[ln.a.d - 1] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[ln.a.e - 1] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public jj() {
        kk.a().a("com.flurry.android.sdk.FlurrySessionEvent", this.G);
    }

    final void a(Context context) {
        Bundle extras;
        if ((context instanceof Activity) && (extras = ((Activity) context).getIntent().getExtras()) != null) {
            ko.a(3, a, "Launch Options Bundle is present " + extras.toString());
            for (String str : extras.keySet()) {
                if (str != null) {
                    Object obj = extras.get(str);
                    String obj2 = obj != null ? obj.toString() : "null";
                    this.t.put(str, Collections.singletonList(obj2));
                    ko.a(3, a, "Launch options Key: " + str + ". Its value: " + obj2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void a(boolean r11) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.jj.a(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() {
        ko.a(4, a, "Loading persistent session report data.");
        List<jg> a2 = this.i.a();
        if (a2 != null) {
            this.s.addAll(a2);
        } else if (this.h.exists()) {
            ko.a(4, a, "Legacy persistent agent data found, converting.");
            jk a3 = hv.a(this.h);
            if (a3 != null) {
                boolean z = a3.b;
                long j = a3.c;
                if (j <= 0) {
                    jm.a();
                    j = jm.d();
                }
                this.j = z;
                this.z = j;
                f();
                List unmodifiableList = Collections.unmodifiableList(a3.a);
                if (unmodifiableList != null) {
                    this.s.addAll(unmodifiableList);
                }
            }
            this.h.delete();
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z, long j) {
        byte[] bArr;
        if (!this.o) {
            ko.a(3, a, "Analytics disabled, not sending agent report.");
        } else if (z || !this.s.isEmpty()) {
            ko.a(3, a, "generating agent report");
            try {
                bArr = new je(ka.a().d, jw.a().g(), this.j, jn.a().c(), this.z, j, this.s, Collections.unmodifiableMap(jn.a().a), this.y.a(), this.t, kc.a().b(), System.currentTimeMillis()).a;
            } catch (Exception e2) {
                ko.e(a, "Exception while generating report: " + e2);
                bArr = null;
            }
            if (bArr == null) {
                ko.e(a, "Error generating report");
            } else {
                ko.a(3, a, "generated report of size " + bArr.length + " with " + this.s.size() + " reports.");
                hs.a().b.b(bArr, ka.a().d, new StringBuilder().append(kb.b()).toString());
            }
            this.s.clear();
            this.i.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        SharedPreferences.Editor edit = ka.a().a.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
        edit.putBoolean("com.flurry.sdk.previous_successful_report", this.j);
        edit.putLong("com.flurry.sdk.initial_run_time", this.z);
        edit.putString("com.flurry.sdk.api_key", ka.a().d);
        edit.apply();
    }

    public final synchronized void a() {
        ko.a(4, a, "Saving persistent agent data.");
        this.i.a(this.s);
    }

    public final synchronized void b() {
        this.B = ly.d();
        if (hs.a().c != null) {
            ka.a().b(new mc() { // from class: com.flurry.sdk.jj.15
                @Override // com.flurry.sdk.mc
                public final void a() {
                    hs.a().c.c();
                }
            });
        }
        if (this.o && hs.a().a != null) {
            ka.a().b(new mc() { // from class: com.flurry.sdk.jj.16
                @Override // com.flurry.sdk.mc
                public final void a() {
                    hs.a().a.b();
                }
            });
        }
    }

    public final synchronized void c() {
        g();
    }

    private synchronized void g() {
        a(false);
        jm.a();
        final long d2 = jm.d();
        jm.a();
        final long f2 = jm.f();
        jm.a();
        final long j = 0;
        jz c2 = jm.c();
        if (c2 != null) {
            j = c2.f;
        }
        jm.a();
        final int h = jm.h() - 1;
        if (this.o && hs.a().a != null) {
            ka.a().b(new mc() { // from class: com.flurry.sdk.jj.2
                @Override // com.flurry.sdk.mc
                public final void a() {
                    hs.a().a.a(d2);
                }
            });
        }
        ka.a().b(new mc() { // from class: com.flurry.sdk.jj.3
            @Override // com.flurry.sdk.mc
            public final void a() {
                jj.this.f();
            }
        });
        if (jn.a().b()) {
            ka.a().b(new mc() { // from class: com.flurry.sdk.jj.4
                @Override // com.flurry.sdk.mc
                public final void a() {
                    jg a2 = jj.this.a(d2, f2, j, h);
                    jj.this.s.clear();
                    jj.this.s.add(a2);
                    jj.this.a();
                }
            });
        }
    }

    final synchronized jg a(long j, long j2, long j3, int i) {
        jg jgVar;
        jh jhVar = new jh();
        jhVar.a = jw.a().g();
        jhVar.b = j;
        jhVar.c = j2;
        jhVar.d = j3;
        jhVar.e = this.u;
        jm.a();
        jz c2 = jm.c();
        jhVar.f = c2 != null ? c2.d() : null;
        jm.a();
        jz c3 = jm.c();
        jhVar.g = c3 != null ? c3.e() : null;
        jm.a();
        jz c4 = jm.c();
        jhVar.h = c4 != null ? c4.f() : null;
        jq.a();
        jhVar.i = jq.b();
        jq.a();
        jhVar.j = TimeZone.getDefault().getID();
        jhVar.k = i;
        jhVar.l = this.B != -1 ? this.B : ly.d();
        jhVar.m = this.l == null ? "" : this.l;
        jhVar.n = jr.a().g();
        jhVar.o = this.F;
        jhVar.p = this.m;
        jhVar.q = this.n;
        jhVar.r = this.v;
        jhVar.s = this.w;
        jhVar.t = this.C;
        jhVar.v = this.x;
        jhVar.u = this.E;
        try {
            jgVar = new jg(jhVar);
        } catch (IOException e2) {
            ko.a(5, a, "Error creating analytics session report: " + e2);
            jgVar = null;
        }
        if (jgVar == null) {
            ko.e(a, "New session report wasn't created");
        }
        return jgVar;
    }

    private synchronized void b(long j) {
        for (jd jdVar : this.w) {
            if (jdVar.b && !jdVar.c) {
                jdVar.a(j);
            }
        }
    }

    public final synchronized void a(final long j) {
        kk.a().a(this.p);
        jm.a();
        b(jm.f());
        ka.a().b(new mc() { // from class: com.flurry.sdk.jj.5
            @Override // com.flurry.sdk.mc
            public final void a() {
                if (jj.this.o && hs.a().a != null) {
                    hs.a().a.c();
                }
                if (hs.a().c != null) {
                    ka.a().b(new mc() { // from class: com.flurry.sdk.jj.5.1
                        @Override // com.flurry.sdk.mc
                        public final void a() {
                            hs.a().c.c = true;
                        }
                    });
                }
            }
        });
        if (jn.a().b()) {
            ka.a().b(new mc() { // from class: com.flurry.sdk.jj.6
                @Override // com.flurry.sdk.mc
                public final void a() {
                    jj.this.a(false, j);
                }
            });
        }
        lr.a().b("Gender", this);
        lr.a().b("UserId", this);
        lr.a().b("Age", this);
        lr.a().b("LogEvents", this);
    }

    @Override // com.flurry.sdk.ls.a
    public final void a(String str, Object obj) {
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1752163738:
                if (str.equals("UserId")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1720015653:
                if (str.equals("analyticsEnabled")) {
                    c2 = 4;
                    break;
                }
                break;
            case -738063011:
                if (str.equals("LogEvents")) {
                    c2 = 0;
                    break;
                }
                break;
            case 65759:
                if (str.equals("Age")) {
                    c2 = 3;
                    break;
                }
                break;
            case 2129321697:
                if (str.equals("Gender")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.k = ((Boolean) obj).booleanValue();
                ko.a(4, a, "onSettingUpdate, LogEvents = " + this.k);
                return;
            case 1:
                this.l = (String) obj;
                ko.a(4, a, "onSettingUpdate, UserId = " + this.l);
                return;
            case 2:
                this.m = ((Byte) obj).byteValue();
                ko.a(4, a, "onSettingUpdate, Gender = " + ((int) this.m));
                return;
            case 3:
                this.n = (Long) obj;
                ko.a(4, a, "onSettingUpdate, Birthdate = " + this.n);
                return;
            case 4:
                this.o = ((Boolean) obj).booleanValue();
                ko.a(4, a, "onSettingUpdate, AnalyticsEnabled = " + this.o);
                return;
            default:
                ko.a(6, a, "onSettingUpdate internal error!");
                return;
        }
    }

    public final synchronized void d() {
        this.F++;
    }

    public final synchronized FlurryEventRecordStatus a(String str, String str2, Map<String, String> map) {
        FlurryEventRecordStatus flurryEventRecordStatus;
        flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (map != null && !TextUtils.isEmpty(str2)) {
            map.put("\ue8ffsid+Tumblr", str2);
            flurryEventRecordStatus = a(str, map, false, 0);
            ko.a(5, a, "logEvent status for syndication:" + flurryEventRecordStatus);
        }
        return flurryEventRecordStatus;
    }

    public final synchronized FlurryEventRecordStatus a(String str, Map<String, String> map, boolean z, int i) {
        FlurryEventRecordStatus flurryEventRecordStatus;
        FlurryEventRecordStatus flurryEventRecordStatus2 = FlurryEventRecordStatus.kFlurryEventRecorded;
        if (!this.o) {
            flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventAnalyticsDisabled;
            ko.e(a, "Analytics has been disabled, not logging event.");
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            jm.a();
            long e2 = elapsedRealtime - jm.e();
            final String b2 = ma.b(str);
            if (b2.length() == 0) {
                flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
            } else {
                jc jcVar = this.v.get(b2);
                if (jcVar == null) {
                    if (this.v.size() < b) {
                        jc jcVar2 = new jc();
                        jcVar2.a = 1;
                        this.v.put(b2, jcVar2);
                        ko.e(a, "Event count started: " + b2);
                        flurryEventRecordStatus = flurryEventRecordStatus2;
                    } else {
                        ko.e(a, "Too many different events. Event not counted: " + b2);
                        flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventUniqueCountExceeded;
                    }
                } else {
                    jcVar.a++;
                    ko.e(a, "Event count incremented: " + b2);
                    flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventRecorded;
                }
                if (this.k && this.w.size() < d && this.D < e) {
                    final Map<String, String> emptyMap = map == null ? Collections.emptyMap() : map;
                    if (emptyMap.size() - i > c) {
                        ko.e(a, "MaxEventParams exceeded: " + (emptyMap.size() - i));
                        flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventParamsCountExceeded;
                    } else {
                        jd jdVar = new jd(this.q.incrementAndGet(), b2, emptyMap, e2, z);
                        if (jdVar.b().length + this.D <= e) {
                            this.w.add(jdVar);
                            this.D = jdVar.b().length + this.D;
                            flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventRecorded;
                            if (this.o && hs.a().a != null) {
                                ka.a().b(new Runnable() { // from class: com.flurry.sdk.jj.7
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        hs.a().a.a(b2, emptyMap);
                                    }
                                });
                            }
                        } else {
                            this.D = e;
                            this.C = false;
                            ko.e(a, "Event Log size exceeded. No more event details logged.");
                            flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventLogCountExceeded;
                        }
                    }
                } else {
                    this.C = false;
                }
            }
        }
        return flurryEventRecordStatus;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        r2 = android.os.SystemClock.elapsedRealtime();
        com.flurry.sdk.jm.a();
        r2 = r2 - com.flurry.sdk.jm.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r10 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r10.size() <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r8.D >= com.flurry.sdk.jj.e) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        r1 = r8.D - r0.b().length;
        r4 = new java.util.HashMap(r0.a());
        r0.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        if ((r0.b().length + r1) > com.flurry.sdk.jj.e) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (r0.a().size() <= com.flurry.sdk.jj.c) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        com.flurry.sdk.ko.e(com.flurry.sdk.jj.a, "MaxEventParams exceeded on endEvent: " + r0.a().size());
        r0.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
        r0.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
        r8.D = r1 + r0.b().length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
        r0.b(r4);
        r8.C = false;
        r8.D = com.flurry.sdk.jj.e;
        com.flurry.sdk.ko.e(com.flurry.sdk.jj.a, "Event Log size exceeded. No more event details logged.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            r8 = this;
            r2 = 0
            monitor-enter(r8)
            java.util.List<com.flurry.sdk.jd> r0 = r8.w     // Catch: java.lang.Throwable -> L9e
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L9e
        L8:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L91
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L9e
            com.flurry.sdk.jd r0 = (com.flurry.sdk.jd) r0     // Catch: java.lang.Throwable -> L9e
            boolean r1 = r0.b     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L93
            long r4 = r0.d     // Catch: java.lang.Throwable -> L9e
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L93
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> L9e
            boolean r1 = r1.equals(r9)     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L93
            r1 = 1
        L29:
            if (r1 == 0) goto L8
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L9e
            com.flurry.sdk.jm.a()     // Catch: java.lang.Throwable -> L9e
            long r4 = com.flurry.sdk.jm.e()     // Catch: java.lang.Throwable -> L9e
            long r2 = r2 - r4
            if (r10 == 0) goto L8e
            int r1 = r10.size()     // Catch: java.lang.Throwable -> L9e
            if (r1 <= 0) goto L8e
            int r1 = r8.D     // Catch: java.lang.Throwable -> L9e
            int r4 = com.flurry.sdk.jj.e     // Catch: java.lang.Throwable -> L9e
            if (r1 >= r4) goto L8e
            int r1 = r8.D     // Catch: java.lang.Throwable -> L9e
            byte[] r4 = r0.b()     // Catch: java.lang.Throwable -> L9e
            int r4 = r4.length     // Catch: java.lang.Throwable -> L9e
            int r1 = r1 - r4
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L9e
            java.util.Map r5 = r0.a()     // Catch: java.lang.Throwable -> L9e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L9e
            r0.a(r10)     // Catch: java.lang.Throwable -> L9e
            byte[] r5 = r0.b()     // Catch: java.lang.Throwable -> L9e
            int r5 = r5.length     // Catch: java.lang.Throwable -> L9e
            int r5 = r5 + r1
            int r6 = com.flurry.sdk.jj.e     // Catch: java.lang.Throwable -> L9e
            if (r5 > r6) goto La1
            java.util.Map r5 = r0.a()     // Catch: java.lang.Throwable -> L9e
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L9e
            int r6 = com.flurry.sdk.jj.c     // Catch: java.lang.Throwable -> L9e
            if (r5 <= r6) goto L95
            java.lang.String r1 = com.flurry.sdk.jj.a     // Catch: java.lang.Throwable -> L9e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            java.lang.String r6 = "MaxEventParams exceeded on endEvent: "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L9e
            java.util.Map r6 = r0.a()     // Catch: java.lang.Throwable -> L9e
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L9e
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L9e
            com.flurry.sdk.ko.e(r1, r5)     // Catch: java.lang.Throwable -> L9e
            r0.b(r4)     // Catch: java.lang.Throwable -> L9e
        L8e:
            r0.a(r2)     // Catch: java.lang.Throwable -> L9e
        L91:
            monitor-exit(r8)
            return
        L93:
            r1 = r2
            goto L29
        L95:
            byte[] r4 = r0.b()     // Catch: java.lang.Throwable -> L9e
            int r4 = r4.length     // Catch: java.lang.Throwable -> L9e
            int r1 = r1 + r4
            r8.D = r1     // Catch: java.lang.Throwable -> L9e
            goto L8e
        L9e:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        La1:
            r0.b(r4)     // Catch: java.lang.Throwable -> L9e
            r1 = 0
            r8.C = r1     // Catch: java.lang.Throwable -> L9e
            int r1 = com.flurry.sdk.jj.e     // Catch: java.lang.Throwable -> L9e
            r8.D = r1     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = com.flurry.sdk.jj.a     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = "Event Log size exceeded. No more event details logged."
            com.flurry.sdk.ko.e(r1, r4)     // Catch: java.lang.Throwable -> L9e
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.jj.a(java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:8:0x000d, B:10:0x001d, B:16:0x005a, B:18:0x0062, B:20:0x006e, B:22:0x0078, B:28:0x00a0), top: B:30:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Throwable r13) {
        /*
            r9 = this;
            r0 = 0
            monitor-enter(r9)
            if (r10 == 0) goto L55
            java.lang.String r1 = "uncaught"
            boolean r1 = r1.equals(r10)     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L55
            r1 = 1
        Ld:
            int r2 = r9.E     // Catch: java.lang.Throwable -> L99
            int r2 = r2 + 1
            r9.E = r2     // Catch: java.lang.Throwable -> L99
            java.util.List<com.flurry.sdk.jb> r2 = r9.x     // Catch: java.lang.Throwable -> L99
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L99
            int r3 = com.flurry.sdk.jj.f     // Catch: java.lang.Throwable -> L99
            if (r2 >= r3) goto L57
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L99
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L99
            com.flurry.sdk.jb r0 = new com.flurry.sdk.jb     // Catch: java.lang.Throwable -> L99
            java.util.concurrent.atomic.AtomicInteger r1 = r9.r     // Catch: java.lang.Throwable -> L99
            int r1 = r1.incrementAndGet()     // Catch: java.lang.Throwable -> L99
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L99
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L99
            java.util.List<com.flurry.sdk.jb> r1 = r9.x     // Catch: java.lang.Throwable -> L99
            r1.add(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = com.flurry.sdk.jj.a     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = "Error logged: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = r0.a     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L99
            com.flurry.sdk.ko.e(r1, r0)     // Catch: java.lang.Throwable -> L99
        L53:
            monitor-exit(r9)
            return
        L55:
            r1 = r0
            goto Ld
        L57:
            if (r1 == 0) goto La0
            r8 = r0
        L5a:
            java.util.List<com.flurry.sdk.jb> r0 = r9.x     // Catch: java.lang.Throwable -> L99
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L99
            if (r8 >= r0) goto L53
            java.util.List<com.flurry.sdk.jb> r0 = r9.x     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L99
            com.flurry.sdk.jb r0 = (com.flurry.sdk.jb) r0     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L9c
            java.lang.String r1 = "uncaught"
            java.lang.String r0 = r0.a     // Catch: java.lang.Throwable -> L99
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L9c
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L99
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L99
            com.flurry.sdk.jb r0 = new com.flurry.sdk.jb     // Catch: java.lang.Throwable -> L99
            java.util.concurrent.atomic.AtomicInteger r1 = r9.r     // Catch: java.lang.Throwable -> L99
            int r1 = r1.incrementAndGet()     // Catch: java.lang.Throwable -> L99
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L99
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L99
            java.util.List<com.flurry.sdk.jb> r1 = r9.x     // Catch: java.lang.Throwable -> L99
            r1.set(r8, r0)     // Catch: java.lang.Throwable -> L99
            goto L53
        L99:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L9c:
            int r0 = r8 + 1
            r8 = r0
            goto L5a
        La0:
            java.lang.String r0 = com.flurry.sdk.jj.a     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "Max errors logged. No more errors logged."
            com.flurry.sdk.ko.e(r0, r1)     // Catch: java.lang.Throwable -> L99
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.jj.a(java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    static /* synthetic */ void d(jj jjVar) {
        SharedPreferences sharedPreferences = ka.a().a.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0);
        jjVar.j = sharedPreferences.getBoolean("com.flurry.sdk.previous_successful_report", false);
        jm.a();
        jjVar.z = sharedPreferences.getLong("com.flurry.sdk.initial_run_time", jm.d());
        jjVar.A = sharedPreferences.getString("com.flurry.sdk.api_key", "");
        if (TextUtils.isEmpty(jjVar.A) && jjVar.z > 0) {
            jjVar.A = ka.a().d;
        } else if (jjVar.A.equals(ka.a().d)) {
        } else {
            jm.a();
            jjVar.z = jm.d();
        }
    }
}
