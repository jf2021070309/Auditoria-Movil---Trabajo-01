package com.flurry.sdk;

import com.flurry.sdk.iq;
import com.flurry.sdk.ku;
import com.flurry.sdk.kw;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class ip extends kz<iq> {
    public static long a;
    private static final String e = ip.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v26, types: [RequestObjectType, byte[]] */
    @Override // com.flurry.sdk.kz
    public final /* synthetic */ void a(iq iqVar) {
        final iq iqVar2 = iqVar;
        ko.a(3, e, "Sending next pulse report to " + iqVar2.l + " at: " + iqVar2.r);
        jm.a();
        long d = jm.d();
        if (d == 0) {
            d = a;
        }
        jm.a();
        long g = jm.g();
        if (g == 0) {
            g = System.currentTimeMillis() - d;
        }
        final ir irVar = new ir(iqVar2, d, g, iqVar2.p);
        ku kuVar = new ku();
        kuVar.g = iqVar2.r;
        kuVar.u = 100000;
        if (iqVar2.d.equals(ix.POST)) {
            kuVar.c = new le();
            if (iqVar2.k != null) {
                kuVar.b = iqVar2.k.getBytes();
            }
            kuVar.h = kw.a.kPost;
        } else {
            kuVar.h = kw.a.kGet;
        }
        kuVar.i = iqVar2.i * 1000;
        kuVar.j = iqVar2.j * 1000;
        kuVar.m = true;
        kuVar.r = true;
        kuVar.s = (iqVar2.i + iqVar2.j) * 1000;
        Map<String, String> map = iqVar2.e;
        if (map != null) {
            for (String str : iqVar2.e.keySet()) {
                kuVar.a(str, map.get(str));
            }
        }
        kuVar.k = false;
        kuVar.a = new ku.a<byte[], String>() { // from class: com.flurry.sdk.ip.2
            @Override // com.flurry.sdk.ku.a
            public final /* synthetic */ void a(ku<byte[], String> kuVar2, String str2) {
                boolean z = false;
                String str3 = str2;
                ko.a(3, ip.e, "Pulse report to " + iqVar2.l + " for " + iqVar2.g.c + ", HTTP status code is: " + kuVar2.q);
                int i = kuVar2.q;
                ir irVar2 = irVar;
                int i2 = (int) kuVar2.o;
                if (i2 < 0) {
                    if (irVar2.k <= 0) {
                        irVar2.k = 0L;
                    }
                } else {
                    irVar2.k = i2 + irVar2.k;
                }
                irVar.e = i;
                if (kuVar2.b()) {
                    if (i >= 200 && i < 300) {
                        ip.b(ip.this, irVar, iqVar2);
                        return;
                    } else if (i >= 300 && i < 400) {
                        ip.a(ip.this, irVar, iqVar2, kuVar2);
                        return;
                    } else {
                        ko.a(3, ip.e, iqVar2.g.c + " report failed sending to : " + iqVar2.l);
                        ip.a(ip.this, irVar, iqVar2, str3);
                        return;
                    }
                }
                Exception exc = kuVar2.p;
                boolean z2 = kuVar2.p != null && (kuVar2.p instanceof SocketTimeoutException);
                if (kuVar2.t || z2) {
                    z = true;
                }
                if (z) {
                    if (kuVar2.c()) {
                        ko.a(3, ip.e, "Timeout occured when trying to connect to: " + iqVar2.l + ". Exception: " + kuVar2.p.getMessage());
                    } else {
                        ko.a(3, ip.e, "Manually managed http request timeout occured for: " + iqVar2.l);
                    }
                    ip.a(ip.this, irVar, iqVar2);
                    return;
                }
                ko.a(3, ip.e, "Error occured when trying to connect to: " + iqVar2.l + ". Exception: " + exc.getMessage());
                ip.a(ip.this, irVar, iqVar2, str3);
            }
        };
        jy.a().a((Object) this, (ip) kuVar);
    }

    public ip() {
        kz.b = 30000L;
        this.d = kz.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.flurry.sdk.kz
    public final kh<List<iq>> a() {
        return new kh<>(ka.a().a.getFileStreamPath(".yflurryanpulsecallbackreporter"), ".yflurryanpulsecallbackreporter", 2, new ll<List<iq>>() { // from class: com.flurry.sdk.ip.1
            @Override // com.flurry.sdk.ll
            public final li<List<iq>> a(int i) {
                return new lh(new iq.a());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.flurry.sdk.kz
    public final synchronized void a(List<iq> list) {
        it.c();
        List<iu> d = it.d();
        if (d != null && d.size() != 0) {
            ko.a(3, e, "Restoring " + d.size() + " from report queue.");
            for (iu iuVar : d) {
                it.c().b(iuVar);
            }
            it.c();
            for (iu iuVar2 : it.b()) {
                for (iq iqVar : iuVar2.a()) {
                    if (!iqVar.m) {
                        ko.a(3, e, "Callback for " + iqVar.g.c + " to " + iqVar.l + " not completed.  Adding to reporter queue.");
                        list.add(iqVar);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.flurry.sdk.kz
    public final synchronized void b(List<iq> list) {
        it.c().a();
    }

    static /* synthetic */ void a(ip ipVar, ir irVar, iq iqVar) {
        it.c().b(irVar);
        ipVar.c((ip) iqVar);
    }

    static /* synthetic */ void a(ip ipVar, ir irVar, iq iqVar, String str) {
        boolean b = it.c().b(irVar, str);
        ko.a(3, e, "Failed report retrying: " + b);
        if (b) {
            ipVar.d(iqVar);
        } else {
            ipVar.c((ip) iqVar);
        }
    }

    static /* synthetic */ void b(ip ipVar, ir irVar, iq iqVar) {
        ko.a(3, e, iqVar.g.c + " report sent successfully to : " + iqVar.l);
        it.c().a(irVar);
        ipVar.c((ip) iqVar);
    }

    static /* synthetic */ void a(ip ipVar, ir irVar, iq iqVar, ku kuVar) {
        String str = null;
        List<String> a2 = kuVar.a("Location");
        if (a2 != null && a2.size() > 0) {
            str = me.b(a2.get(0), iqVar.q);
        }
        boolean a3 = it.c().a(irVar, str);
        if (a3) {
            ko.a(3, e, "Received redirect url. Retrying: " + str);
        } else {
            ko.a(3, e, "Received redirect url. Retrying: false");
        }
        if (!a3) {
            ipVar.c((ip) iqVar);
            return;
        }
        iqVar.r = str;
        kuVar.g = str;
        if (kuVar.f != null && kuVar.f.a.containsKey("Location")) {
            kuVar.f.b("Location");
        }
        jy.a().a((Object) ipVar, (ip) kuVar);
    }
}
