package com.flurry.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import bolts.MeasurementEvent;
import com.flurry.sdk.il;
import com.flurry.sdk.iu;
import com.flurry.sdk.ku;
import com.flurry.sdk.kw;
import com.flurry.sdk.ls;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class in implements ls.a {
    private static final String a = in.class.getSimpleName();
    private kh<il> g;
    private kh<List<iu>> h;
    private boolean i;
    private String j;
    private boolean k;
    private boolean l;
    private long n;
    private boolean o;
    private ia p;
    private boolean q;
    private final ks<hz> b = new ks<>("proton config request", new iz());
    private final ks<ia> c = new ks<>("proton config response", new ja());
    private final im d = new im();
    private final kf<String, id> e = new kf<>();
    private final List<iu> f = new ArrayList();
    private long m = 10000;
    private final Runnable r = new mc() { // from class: com.flurry.sdk.in.1
        @Override // com.flurry.sdk.mc
        public final void a() {
            in.this.e();
        }
    };
    private final kj<jo> s = new kj<jo>() { // from class: com.flurry.sdk.in.4
        @Override // com.flurry.sdk.kj
        public final /* bridge */ /* synthetic */ void a(jo joVar) {
            in.this.e();
        }
    };
    private final kj<jp> t = new kj<jp>() { // from class: com.flurry.sdk.in.5
        @Override // com.flurry.sdk.kj
        public final /* bridge */ /* synthetic */ void a(jp jpVar) {
            in.this.e();
        }
    };
    private final kj<js> u = new kj<js>() { // from class: com.flurry.sdk.in.6
        @Override // com.flurry.sdk.kj
        public final /* bridge */ /* synthetic */ void a(js jsVar) {
            if (jsVar.a) {
                in.this.e();
            }
        }
    };

    static /* synthetic */ boolean g(in inVar) {
        inVar.q = true;
        return true;
    }

    public in() {
        this.k = true;
        lr a2 = lr.a();
        this.i = ((Boolean) a2.a("ProtonEnabled")).booleanValue();
        a2.a("ProtonEnabled", (ls.a) this);
        ko.a(4, a, "initSettings, protonEnabled = " + this.i);
        this.j = (String) a2.a("ProtonConfigUrl");
        a2.a("ProtonConfigUrl", (ls.a) this);
        ko.a(4, a, "initSettings, protonConfigUrl = " + this.j);
        this.k = ((Boolean) a2.a("analyticsEnabled")).booleanValue();
        a2.a("analyticsEnabled", (ls.a) this);
        ko.a(4, a, "initSettings, AnalyticsEnabled = " + this.k);
        kk.a().a("com.flurry.android.sdk.IdProviderFinishedEvent", this.s);
        kk.a().a("com.flurry.android.sdk.IdProviderUpdatedAdvertisingId", this.t);
        kk.a().a("com.flurry.android.sdk.NetworkStateEvent", this.u);
        Context context = ka.a().a;
        this.g = new kh<>(context.getFileStreamPath(".yflurryprotonconfig." + Long.toString(ma.i(ka.a().d), 16)), ".yflurryprotonconfig.", 1, new ll<il>() { // from class: com.flurry.sdk.in.7
            @Override // com.flurry.sdk.ll
            public final li<il> a(int i) {
                return new il.a();
            }
        });
        this.h = new kh<>(context.getFileStreamPath(".yflurryprotonreport." + Long.toString(ma.i(ka.a().d), 16)), ".yflurryprotonreport.", 1, new ll<List<iu>>() { // from class: com.flurry.sdk.in.8
            @Override // com.flurry.sdk.ll
            public final li<List<iu>> a(int i) {
                return new lh(new iu.a());
            }
        });
        ka.a().b(new mc() { // from class: com.flurry.sdk.in.9
            @Override // com.flurry.sdk.mc
            public final void a() {
                in.this.l();
            }
        });
        ka.a().b(new mc() { // from class: com.flurry.sdk.in.10
            @Override // com.flurry.sdk.mc
            public final void a() {
                in.this.m();
            }
        });
    }

    @Override // com.flurry.sdk.ls.a
    public final void a(String str, Object obj) {
        char c = 65535;
        switch (str.hashCode()) {
            case -1720015653:
                if (str.equals("analyticsEnabled")) {
                    c = 2;
                    break;
                }
                break;
            case 640941243:
                if (str.equals("ProtonEnabled")) {
                    c = 0;
                    break;
                }
                break;
            case 1591403975:
                if (str.equals("ProtonConfigUrl")) {
                    c = 1;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.i = ((Boolean) obj).booleanValue();
                ko.a(4, a, "onSettingUpdate, protonEnabled = " + this.i);
                return;
            case 1:
                this.j = (String) obj;
                ko.a(4, a, "onSettingUpdate, protonConfigUrl = " + this.j);
                return;
            case 2:
                this.k = ((Boolean) obj).booleanValue();
                ko.a(4, a, "onSettingUpdate, AnalyticsEnabled = " + this.k);
                return;
            default:
                ko.a(6, a, "onSettingUpdate internal error!");
                return;
        }
    }

    public final synchronized void a() {
        if (this.i) {
            ma.b();
            jm.a();
            ip.a = jm.d();
            this.q = false;
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v1, types: [RequestObjectType, byte[]] */
    public synchronized void e() {
        if (this.i) {
            ma.b();
            if (this.l && jn.a().b()) {
                final long currentTimeMillis = System.currentTimeMillis();
                final boolean z = !jn.a().c();
                if (this.p != null) {
                    if (this.o != z) {
                        ko.a(3, a, "Limit ad tracking value has changed, purging");
                        this.p = null;
                    } else if (System.currentTimeMillis() < this.n + (this.p.b * 1000)) {
                        ko.a(3, a, "Cached Proton config valid, no need to refresh");
                        if (!this.q) {
                            this.q = true;
                            b("flurry.session_start", (Map<String, String>) null);
                        }
                    } else if (System.currentTimeMillis() >= this.n + (this.p.c * 1000)) {
                        ko.a(3, a, "Cached Proton config expired, purging");
                        this.p = null;
                        this.e.a();
                    }
                }
                jy.a().a(this);
                ko.a(3, a, "Requesting proton config");
                ?? f = f();
                if (f != 0) {
                    ku kuVar = new ku();
                    kuVar.g = TextUtils.isEmpty(this.j) ? "https://proton.flurry.col/sdk/v1/config" : this.j;
                    kuVar.u = 5000;
                    kuVar.h = kw.a.kPost;
                    String num = Integer.toString(ks.a((byte[]) f));
                    kuVar.a(DownloadUtils.CONTENT_TYPE, "application/x-flurry;version=2");
                    kuVar.a("Accept", "application/x-flurry;version=2");
                    kuVar.a("FM-Checksum", num);
                    kuVar.c = new le();
                    kuVar.d = new le();
                    kuVar.b = f;
                    kuVar.a = new ku.a<byte[], byte[]>() { // from class: com.flurry.sdk.in.11
                        @Override // com.flurry.sdk.ku.a
                        public final /* synthetic */ void a(ku<byte[], byte[]> kuVar2, byte[] bArr) {
                            long j;
                            ia iaVar;
                            final byte[] bArr2 = bArr;
                            int i = kuVar2.q;
                            ko.a(3, in.a, "Proton config request: HTTP status code is:" + i);
                            if (i == 400 || i == 406 || i == 412 || i == 415) {
                                in.this.m = 10000L;
                                return;
                            }
                            if (kuVar2.b() && bArr2 != null) {
                                ka.a().b(new mc() { // from class: com.flurry.sdk.in.11.1
                                    @Override // com.flurry.sdk.mc
                                    public final void a() {
                                        in.this.a(currentTimeMillis, z, bArr2);
                                    }
                                });
                                try {
                                    iaVar = (ia) in.this.c.b(bArr2);
                                } catch (Exception e) {
                                    ko.a(5, in.a, "Failed to decode proton config response: " + e);
                                    iaVar = null;
                                }
                                r1 = in.b(iaVar) ? iaVar : null;
                                if (r1 != null) {
                                    in.this.m = 10000L;
                                    in.this.n = currentTimeMillis;
                                    in.this.o = z;
                                    in.this.p = r1;
                                    in.this.g();
                                    if (!in.this.q) {
                                        in.g(in.this);
                                        in.this.b("flurry.session_start", (Map<String, String>) null);
                                    }
                                    in.this.h();
                                }
                            }
                            if (r1 == null) {
                                long j2 = in.this.m << 1;
                                if (i == 429) {
                                    List<String> a2 = kuVar2.a("Retry-After");
                                    if (!a2.isEmpty()) {
                                        String str = a2.get(0);
                                        ko.a(3, in.a, "Server returned retry time: " + str);
                                        try {
                                            j = Long.parseLong(str) * 1000;
                                        } catch (NumberFormatException e2) {
                                            ko.a(3, in.a, "Server returned nonsensical retry time");
                                        }
                                        in.this.m = j;
                                        ko.a(3, in.a, "Proton config request failed, backing off: " + in.this.m + "ms");
                                        ka.a().a(in.this.r, in.this.m);
                                    }
                                }
                                j = j2;
                                in.this.m = j;
                                ko.a(3, in.a, "Proton config request failed, backing off: " + in.this.m + "ms");
                                ka.a().a(in.this.r, in.this.m);
                            }
                        }
                    };
                    jy.a().a((Object) this, (in) kuVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(String str, Map<String, String> map) {
        iy iyVar;
        boolean z;
        ko.a(3, a, "Event triggered: " + str);
        if (!this.k) {
            ko.e(a, "Analytics and pulse have been disabled.");
        } else if (this.p == null) {
            ko.a(3, a, "Config response is empty. No events to fire.");
        } else {
            ma.b();
            if (!TextUtils.isEmpty(str)) {
                List<id> a2 = this.e.a((kf<String, id>) str);
                if (a2 == null) {
                    ko.a(3, a, "No events to fire. Returning.");
                } else if (a2.size() == 0) {
                    ko.a(3, a, "No events to fire. Returning.");
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    boolean z2 = map != null;
                    char c = 65535;
                    switch (str.hashCode()) {
                        case 645204782:
                            if (str.equals("flurry.session_end")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1371447545:
                            if (str.equals("flurry.app_install")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1579613685:
                            if (str.equals("flurry.session_start")) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            iyVar = iy.SESSION_START;
                            break;
                        case 1:
                            iyVar = iy.SESSION_END;
                            break;
                        case 2:
                            iyVar = iy.INSTALL;
                            break;
                        default:
                            iyVar = iy.APPLICATION_EVENT;
                            break;
                    }
                    HashMap hashMap = new HashMap();
                    for (id idVar : a2) {
                        boolean z3 = false;
                        if (idVar instanceof ie) {
                            ko.a(4, a, "Event contains triggers.");
                            String[] strArr = ((ie) idVar).d;
                            if (strArr == null) {
                                ko.a(4, a, "Template does not contain trigger values. Firing.");
                                z3 = true;
                            } else if (strArr.length == 0) {
                                ko.a(4, a, "Template does not contain trigger values. Firing.");
                                z3 = true;
                            } else if (map == null) {
                                ko.a(4, a, "Publisher has not passed in params list. Not firing.");
                            }
                            String str2 = map.get(((ie) idVar).c);
                            if (str2 == null) {
                                ko.a(4, a, "Publisher params has no value associated with proton key. Not firing.");
                            } else {
                                int length = strArr.length;
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        z = z3;
                                    } else if (!strArr[i].equals(str2)) {
                                        i++;
                                    } else {
                                        z = true;
                                    }
                                }
                                if (!z) {
                                    ko.a(4, a, "Publisher params list does not match proton param values. Not firing.");
                                } else {
                                    ko.a(4, a, "Publisher params match proton values. Firing.");
                                }
                            }
                        }
                        hx hxVar = idVar.b;
                        if (hxVar == null) {
                            ko.a(3, a, "Template is empty. Not firing current event.");
                        } else {
                            ko.a(3, a, "Creating callback report for partner: " + hxVar.b);
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, str);
                            hashMap2.put("event_time_millis", String.valueOf(currentTimeMillis));
                            String a3 = this.d.a(hxVar.e, hashMap2);
                            String str3 = null;
                            if (hxVar.f != null) {
                                str3 = this.d.a(hxVar.f, hashMap2);
                            }
                            hashMap.put(Long.valueOf(hxVar.a), new iq(hxVar.b, hxVar.a, a3, System.currentTimeMillis() + 259200000, this.p.e.b, hxVar.g, hxVar.d, hxVar.j, hxVar.i, hxVar.h, str3));
                        }
                    }
                    if (hashMap.size() != 0) {
                        jm.a();
                        long d = jm.d();
                        jm.a();
                        iu iuVar = new iu(str, z2, d, jm.g(), iyVar, hashMap);
                        if ("flurry.session_end".equals(str)) {
                            ko.a(3, a, "Storing Pulse callbacks for event: " + str);
                            this.f.add(iuVar);
                        } else {
                            ko.a(3, a, "Firing Pulse callbacks for event: " + str);
                            it.c().a(iuVar);
                        }
                    }
                }
            }
        }
    }

    private byte[] f() {
        try {
            hz hzVar = new hz();
            hzVar.a = ka.a().d;
            hzVar.b = lx.a(ka.a().a);
            hzVar.c = lx.b(ka.a().a);
            hzVar.d = kb.b();
            hzVar.e = 3;
            jw.a();
            hzVar.f = jw.b();
            hzVar.g = !jn.a().c();
            hzVar.h = new ic();
            hzVar.h.a = new hw();
            hzVar.h.a.a = Build.MODEL;
            hzVar.h.a.b = Build.BRAND;
            hzVar.h.a.c = Build.ID;
            hzVar.h.a.d = Build.DEVICE;
            hzVar.h.a.e = Build.PRODUCT;
            hzVar.h.a.f = Build.VERSION.RELEASE;
            hzVar.i = new ArrayList();
            for (Map.Entry entry : Collections.unmodifiableMap(jn.a().a).entrySet()) {
                ib ibVar = new ib();
                ibVar.a = ((jv) entry.getKey()).c;
                if (((jv) entry.getKey()).d) {
                    ibVar.b = new String((byte[]) entry.getValue());
                } else {
                    ibVar.b = ma.b((byte[]) entry.getValue());
                }
                hzVar.i.add(ibVar);
            }
            Location g = jr.a().g();
            if (g != null) {
                int d = jr.d();
                hzVar.j = new ig();
                hzVar.j.a = new Cif();
                hzVar.j.a.a = ma.a(g.getLatitude(), d);
                hzVar.j.a.b = ma.a(g.getLongitude(), d);
                hzVar.j.a.c = (float) ma.a(g.getAccuracy(), d);
            }
            String str = (String) lr.a().a("UserId");
            if (!str.equals("")) {
                hzVar.k = new ij();
                hzVar.k.a = str;
            }
            return this.b.a((ks<hz>) hzVar);
        } catch (Exception e) {
            ko.a(5, a, "Proton config request failed with exception: " + e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(long j, boolean z, byte[] bArr) {
        if (bArr != null) {
            ko.a(4, a, "Saving proton config response");
            il ilVar = new il();
            ilVar.a = j;
            ilVar.b = z;
            ilVar.c = bArr;
            this.g.a(ilVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(ia iaVar) {
        boolean z;
        boolean z2;
        if (iaVar == null) {
            return false;
        }
        hy hyVar = iaVar.e;
        if (hyVar != null && hyVar.a != null) {
            for (int i = 0; i < hyVar.a.size(); i++) {
                hx hxVar = hyVar.a.get(i);
                if (hxVar != null) {
                    if (!hxVar.b.equals("") && hxVar.a != -1 && !hxVar.e.equals("")) {
                        List<id> list = hxVar.c;
                        if (list != null) {
                            for (id idVar : list) {
                                if (idVar.a.equals("")) {
                                    ko.a(3, a, "An event is missing a name");
                                    z2 = false;
                                    break;
                                } else if ((idVar instanceof ie) && ((ie) idVar).c.equals("")) {
                                    ko.a(3, a, "An event trigger is missing a param name");
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                        z2 = true;
                        if (!z2) {
                        }
                    }
                    ko.a(3, a, "A callback template is missing required values");
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z && (iaVar.e == null || iaVar.e.e == null || !iaVar.e.e.equals(""))) {
            return true;
        }
        ko.a(3, a, "Config response is missing required values.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        List<hx> list;
        List<id> list2;
        if (this.p != null) {
            ko.a(5, a, "Processing config response");
            it.a(this.p.e.c);
            it.b(this.p.e.d * 1000);
            iv a2 = iv.a();
            String str = this.p.e.e;
            if (str != null && !str.endsWith(".do")) {
                ko.a(5, iv.a, "overriding analytics agent report URL without an endpoint, are you sure?");
            }
            a2.b = str;
            if (this.i) {
                lr.a().a("analyticsEnabled", Boolean.valueOf(this.p.f.b));
            }
            this.e.a();
            hy hyVar = this.p.e;
            if (hyVar != null && (list = hyVar.a) != null) {
                for (hx hxVar : list) {
                    if (hxVar != null && (list2 = hxVar.c) != null) {
                        for (id idVar : list2) {
                            if (idVar != null && !TextUtils.isEmpty(idVar.a)) {
                                idVar.b = hxVar;
                                this.e.a((kf<String, id>) idVar.a, (String) idVar);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h() {
        if (this.i) {
            ma.b();
            SharedPreferences sharedPreferences = ka.a().a.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0);
            if (sharedPreferences.getBoolean("com.flurry.android.flurryAppInstall", true)) {
                b("flurry.app_install", (Map<String, String>) null);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("com.flurry.android.flurryAppInstall", false);
                edit.apply();
            }
        }
    }

    public final synchronized void b() {
        if (this.i) {
            ma.b();
            jm.a();
            b(jm.d());
            i();
        }
    }

    private synchronized void b(long j) {
        Iterator<iu> it = this.f.iterator();
        while (it.hasNext()) {
            if (j == it.next().a) {
                it.remove();
            }
        }
    }

    private synchronized void i() {
        if (!this.k) {
            ko.e(a, "Analytics disabled, not sending pulse reports.");
        } else {
            ko.a(4, a, "Sending " + this.f.size() + " queued reports.");
            for (iu iuVar : this.f) {
                ko.a(3, a, "Firing Pulse callbacks for event: " + iuVar.c);
                it.c().a(iuVar);
            }
            j();
        }
    }

    private synchronized void j() {
        this.f.clear();
        this.h.b();
    }

    public final synchronized void a(long j) {
        if (this.i) {
            ma.b();
            b(j);
            b("flurry.session_end", (Map<String, String>) null);
            ka.a().b(new mc() { // from class: com.flurry.sdk.in.2
                @Override // com.flurry.sdk.mc
                public final void a() {
                    in.this.k();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k() {
        ko.a(4, a, "Saving queued report data.");
        this.h.a(this.f);
    }

    public final synchronized void c() {
        if (this.i) {
            ma.b();
            i();
        }
    }

    public final synchronized void a(String str, Map<String, String> map) {
        if (this.i) {
            ma.b();
            b(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l() {
        ia iaVar;
        il a2 = this.g.a();
        if (a2 != null) {
            try {
                iaVar = this.c.b(a2.c);
            } catch (Exception e) {
                ko.a(5, a, "Failed to decode saved proton config response: " + e);
                this.g.b();
                iaVar = null;
            }
            if (!b(iaVar)) {
                iaVar = null;
            }
            if (iaVar != null) {
                ko.a(4, a, "Loaded saved proton config response");
                this.m = 10000L;
                this.n = a2.a;
                this.o = a2.b;
                this.p = iaVar;
                g();
            }
        }
        this.l = true;
        ka.a().b(new mc() { // from class: com.flurry.sdk.in.3
            @Override // com.flurry.sdk.mc
            public final void a() {
                in.this.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m() {
        ko.a(4, a, "Loading queued report data.");
        List<iu> a2 = this.h.a();
        if (a2 != null) {
            this.f.addAll(a2);
        }
    }
}
