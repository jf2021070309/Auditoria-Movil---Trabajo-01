package com.amazon.aps.iva.ka0;

import com.amazon.aps.iva.ca0.a;
import com.amazon.aps.iva.ee0.f1;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes4.dex */
public final class a0 extends com.amazon.aps.iva.da0.b {
    public static d r;
    public static e s;
    public Timer c;
    public final String d;
    public com.amazon.aps.iva.ga0.e e;
    public Integer f;
    public Integer g;
    public com.amazon.aps.iva.ga0.n h;
    public String i;
    public int j;
    public String k;
    public v l;
    public String m;
    public String n;
    public String o;
    public final boolean p = true;
    public f q;

    /* loaded from: classes4.dex */
    public static class a extends TimerTask {
        public final WeakReference<a0> b;
        public final WeakReference<Timer> c;

        public a(a0 a0Var, Timer timer) {
            this.b = new WeakReference<>(a0Var);
            this.c = new WeakReference<>(timer);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            a0 a0Var = this.b.get();
            if (a0Var != null) {
                try {
                    if (!a0Var.q.g()) {
                        a0Var.b(new com.amazon.aps.iva.fa0.s(null, 1));
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    Boolean bool = com.amazon.aps.iva.ia0.b.a;
                    a0Var.g();
                    return;
                }
            }
            Timer timer = this.c.get();
            if (timer != null) {
                timer.cancel();
                timer.purge();
            }
        }
    }

    public a0(f fVar, String str, com.amazon.aps.iva.ga0.e eVar, com.amazon.aps.iva.ca0.d dVar) {
        com.amazon.aps.iva.ga0.i iVar;
        com.amazon.aps.iva.ga0.d dVar2;
        com.amazon.aps.iva.ga0.h hVar;
        com.amazon.aps.iva.ga0.g gVar;
        com.amazon.aps.iva.ga0.f fVar2;
        this.h = new com.amazon.aps.iva.ga0.n();
        this.e = eVar;
        this.d = str;
        if (dVar == null) {
            throw new IllegalArgumentException("customOptions cannot be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("playerName cannot be null");
        }
        if (eVar == null || eVar.d == null) {
            throw new IllegalArgumentException("customerPlayerData cannot be null");
        }
        if (!com.amazon.aps.iva.ca0.a.e) {
            com.amazon.aps.iva.ca0.f fVar3 = com.amazon.aps.iva.ca0.a.d;
            long a2 = fVar3.d.a();
            fVar3.a = f1.w();
            fVar3.b = a2;
            fVar3.c = a2 + 1500000;
            com.amazon.aps.iva.ga0.j jVar = com.amazon.aps.iva.ca0.a.b;
            jVar.b("mapve", "2.1");
            jVar.b("memve", "7.8.0");
            jVar.b("mem", "mux-stats-sdk-java");
            com.amazon.aps.iva.ca0.a.e = true;
        }
        com.amazon.aps.iva.ca0.b bVar = new com.amazon.aps.iva.ca0.b(dVar);
        bVar.b(new a.C0166a(str));
        com.amazon.aps.iva.ca0.a.a.put(str, bVar);
        this.q = fVar;
        try {
            com.amazon.aps.iva.ga0.j jVar2 = new com.amazon.aps.iva.ga0.j();
            d dVar3 = r;
            if (dVar3 != null) {
                this.m = dVar3.getDeviceId();
                this.n = r.j();
                this.o = r.a();
            }
            String str2 = this.m;
            if (str2 != null) {
                jVar2.b("mvrid", str2);
            }
            com.amazon.aps.iva.ga0.q qVar = new com.amazon.aps.iva.ga0.q();
            d dVar4 = r;
            if (dVar4 != null) {
                dVar4.g();
                qVar.b("uosfm", "Android");
                String i = r.i();
                if (i != null) {
                    qVar.b("uosar", i);
                }
                String e = r.e();
                if (e != null) {
                    qVar.b("uosve", e);
                }
                String h = r.h();
                if (h != null) {
                    qVar.b("udvmn", h);
                }
                String modelName = r.getModelName();
                if (modelName != null) {
                    qVar.b("udvmo", modelName);
                }
                r.getDeviceName();
                qVar.b("udvnm", "");
                r.b();
                qVar.b("udvcg", "");
                String f = r.f();
                if (f != null) {
                    qVar.b("ucxty", f);
                }
            }
            String str3 = this.n;
            if (str3 != null) {
                qVar.b("ualnm", str3);
            }
            String str4 = this.o;
            if (str4 != null) {
                qVar.b("ualve", str4);
            }
            com.amazon.aps.iva.ea0.a aVar = new com.amazon.aps.iva.ea0.a();
            aVar.c = qVar;
            com.amazon.aps.iva.ca0.a.b.e(jVar2);
            com.amazon.aps.iva.ca0.a.c.e(aVar.c);
        } catch (Throwable unused) {
            Boolean bool = com.amazon.aps.iva.ia0.b.a;
        }
        com.amazon.aps.iva.ga0.k f2 = f();
        d(new com.amazon.aps.iva.fa0.k(f2, 2));
        Timer timer = new Timer();
        this.c = timer;
        timer.scheduleAtFixedRate(new a(this, this.c), 0L, 100L);
        this.h = new com.amazon.aps.iva.ga0.n();
        com.amazon.aps.iva.ea0.a aVar2 = new com.amazon.aps.iva.ea0.a();
        com.amazon.aps.iva.ga0.e eVar2 = this.e;
        if (eVar2 != null && (fVar2 = eVar2.d) != null) {
            aVar2.g = fVar2;
        }
        if (eVar2 != null && (gVar = eVar2.e) != null) {
            aVar2.e = gVar;
        }
        if (eVar2 != null && (hVar = eVar2.f) != null) {
            aVar2.f = hVar;
        }
        if (eVar2 != null && (dVar2 = eVar2.h) != null) {
            aVar2.i = dVar2;
        }
        if (eVar2 != null && (iVar = eVar2.g) != null) {
            aVar2.h = iVar;
        }
        if (eVar2 != null && (eVar2.d != null || eVar2.e != null || eVar2.f != null || eVar2.h != null || eVar2.g != null)) {
            d(aVar2);
        }
        d(new com.amazon.aps.iva.fa0.u(f2, 0));
    }

    @Override // com.amazon.aps.iva.da0.g
    public final synchronized void b(com.amazon.aps.iva.da0.e eVar) {
        char c;
        com.amazon.aps.iva.fa0.t sVar;
        com.amazon.aps.iva.ga0.b bVar;
        if (!eVar.w() && !eVar.u()) {
            com.amazon.aps.iva.ia0.b.a("MuxStats", "unexpected internal event");
        } else if (eVar.u() && !this.p) {
            com.amazon.aps.iva.ia0.b.a("MuxStats", "error detected, but automatic error reporting is disabled");
        } else {
            String type = eVar.getType();
            char c2 = 3;
            switch (type.hashCode()) {
                case -1893763032:
                    if (type.equals("requestcanceled")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1535613269:
                    if (type.equals("adplaying")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -1519101404:
                    if (type.equals("renditionchange")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1422144041:
                    if (type.equals("adplay")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case -1300510776:
                    if (type.equals("rebufferend")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146889097:
                    if (type.equals("adended")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146756155:
                    if (type.equals("aderror")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1137100877:
                    if (type.equals("adpause")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -906224361:
                    if (type.equals("seeked")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -493563858:
                    if (type.equals("playing")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -456624996:
                    if (type.equals("requestcompleted")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -215092057:
                    if (type.equals("adthirdquartile")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 3443508:
                    if (type.equals("play")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 53643532:
                    if (type.equals("adrequest")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 57736207:
                    if (type.equals("rebufferstart")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 96651962:
                    if (type.equals("ended")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 106440182:
                    if (type.equals("pause")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 417371499:
                    if (type.equals("admidpoint")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 1651552038:
                    if (type.equals("adbreakstart")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 1682958576:
                    if (type.equals("adfirstquartile")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 1715883364:
                    if (type.equals("adresponse")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 1762557398:
                    if (type.equals("timeupdate")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1832171883:
                    if (type.equals("internalerror")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1929584524:
                    if (type.equals("requestfailed")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1971820138:
                    if (type.equals("seeking")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1975570407:
                    if (type.equals("sampling")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 2133546143:
                    if (type.equals("adbreakend")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    e();
                    sVar = new com.amazon.aps.iva.fa0.s(f(), 1);
                    d(sVar);
                    break;
                case 1:
                    e();
                    sVar = new com.amazon.aps.iva.fa0.s(f(), 0);
                    d(sVar);
                    break;
                case 2:
                    e();
                    d(new com.amazon.aps.iva.fa0.k(f(), 1));
                    break;
                case 3:
                    sVar = new com.amazon.aps.iva.fa0.p(f(), 1);
                    d(sVar);
                    break;
                case 4:
                    e();
                    sVar = new com.amazon.aps.iva.fa0.r(f(), 1);
                    d(sVar);
                    break;
                case 5:
                    e();
                    sVar = new com.amazon.aps.iva.fa0.q(f(), 1);
                    d(sVar);
                    break;
                case 6:
                    e();
                    sVar = new com.amazon.aps.iva.fa0.m(f(), 1);
                    d(sVar);
                    break;
                case 7:
                    e();
                    sVar = new com.amazon.aps.iva.fa0.l(f(), 1);
                    d(sVar);
                    break;
                case '\b':
                    e();
                    sVar = new com.amazon.aps.iva.fa0.r(f(), 0);
                    d(sVar);
                    break;
                case '\t':
                    e();
                    sVar = new com.amazon.aps.iva.fa0.k(f(), 0);
                    d(sVar);
                    break;
                case '\n':
                    com.amazon.aps.iva.da0.h hVar = (com.amazon.aps.iva.da0.h) eVar;
                    this.i = hVar.c;
                    this.j = hVar.d;
                    this.k = hVar.e;
                    com.amazon.aps.iva.ia0.b.a("MuxStats", "internal error: " + this.i);
                    e();
                    sVar = new com.amazon.aps.iva.fa0.l(f(), 0);
                    d(sVar);
                    break;
                case 11:
                    e();
                    sVar = new com.amazon.aps.iva.fa0.w(f());
                    bVar = ((com.amazon.aps.iva.fa0.t) eVar).g;
                    sVar.g = bVar;
                    d(sVar);
                    break;
                case '\f':
                    e();
                    sVar = new com.amazon.aps.iva.fa0.v(f());
                    bVar = ((com.amazon.aps.iva.fa0.t) eVar).g;
                    sVar.g = bVar;
                    d(sVar);
                    break;
                case '\r':
                    e();
                    sVar = new com.amazon.aps.iva.fa0.x(f());
                    bVar = ((com.amazon.aps.iva.fa0.t) eVar).g;
                    sVar.g = bVar;
                    d(sVar);
                    break;
                case 14:
                    e();
                    sVar = new com.amazon.aps.iva.fa0.o(f(), 1);
                    d(sVar);
                    break;
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 24:
                case 25:
                case 26:
                    String type2 = eVar.getType();
                    switch (type2.hashCode()) {
                        case -1535613269:
                            if (type2.equals("adplaying")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1422144041:
                            if (type2.equals("adplay")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1146889097:
                            if (type2.equals("adended")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1146756155:
                            if (type2.equals("aderror")) {
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1137100877:
                            if (type2.equals("adpause")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -215092057:
                            if (type2.equals("adthirdquartile")) {
                                c2 = 11;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 53643532:
                            if (type2.equals("adrequest")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 417371499:
                            if (type2.equals("admidpoint")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1651552038:
                            if (type2.equals("adbreakstart")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1682958576:
                            if (type2.equals("adfirstquartile")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1715883364:
                            if (type2.equals("adresponse")) {
                                c2 = '\n';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2133546143:
                            if (type2.equals("adbreakend")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            sVar = new com.amazon.aps.iva.fa0.b(f(), 0);
                            sVar.e = ((com.amazon.aps.iva.fa0.t) eVar).e;
                            sVar.c = ((com.amazon.aps.iva.fa0.e) eVar).c;
                            d(sVar);
                            break;
                        case 1:
                            sVar = new com.amazon.aps.iva.fa0.a(f(), 0);
                            sVar.e = ((com.amazon.aps.iva.fa0.t) eVar).e;
                            sVar.c = ((com.amazon.aps.iva.fa0.e) eVar).c;
                            d(sVar);
                            break;
                        case 2:
                            sVar = new com.amazon.aps.iva.fa0.c(f(), 0);
                            sVar.e = ((com.amazon.aps.iva.fa0.t) eVar).e;
                            sVar.c = ((com.amazon.aps.iva.fa0.e) eVar).c;
                            d(sVar);
                            break;
                        case 3:
                            sVar = new com.amazon.aps.iva.fa0.d(f());
                            sVar.e = ((com.amazon.aps.iva.fa0.t) eVar).e;
                            sVar.c = ((com.amazon.aps.iva.fa0.e) eVar).c;
                            d(sVar);
                            break;
                        case 4:
                            sVar = new com.amazon.aps.iva.fa0.f(f());
                            sVar.e = ((com.amazon.aps.iva.fa0.t) eVar).e;
                            sVar.c = ((com.amazon.aps.iva.fa0.e) eVar).c;
                            d(sVar);
                            break;
                        case 5:
                            sVar = new com.amazon.aps.iva.fa0.g(f());
                            sVar.e = ((com.amazon.aps.iva.fa0.t) eVar).e;
                            sVar.c = ((com.amazon.aps.iva.fa0.e) eVar).c;
                            d(sVar);
                            break;
                        case 6:
                            sVar = new com.amazon.aps.iva.fa0.h(f());
                            sVar.e = ((com.amazon.aps.iva.fa0.t) eVar).e;
                            sVar.c = ((com.amazon.aps.iva.fa0.e) eVar).c;
                            d(sVar);
                            break;
                        case 7:
                            sVar = new com.amazon.aps.iva.fa0.i(f());
                            sVar.e = ((com.amazon.aps.iva.fa0.t) eVar).e;
                            sVar.c = ((com.amazon.aps.iva.fa0.e) eVar).c;
                            d(sVar);
                            break;
                        case '\b':
                            sVar = new com.amazon.aps.iva.fa0.j(f());
                            sVar.e = ((com.amazon.aps.iva.fa0.t) eVar).e;
                            sVar.c = ((com.amazon.aps.iva.fa0.e) eVar).c;
                            d(sVar);
                            break;
                        case '\t':
                            sVar = new com.amazon.aps.iva.fa0.a(f(), 1);
                            sVar.e = ((com.amazon.aps.iva.fa0.t) eVar).e;
                            sVar.c = ((com.amazon.aps.iva.fa0.e) eVar).c;
                            d(sVar);
                            break;
                        case '\n':
                            sVar = new com.amazon.aps.iva.fa0.b(f(), 1);
                            sVar.e = ((com.amazon.aps.iva.fa0.t) eVar).e;
                            sVar.c = ((com.amazon.aps.iva.fa0.e) eVar).c;
                            d(sVar);
                            break;
                        case 11:
                            sVar = new com.amazon.aps.iva.fa0.c(f(), 1);
                            sVar.e = ((com.amazon.aps.iva.fa0.t) eVar).e;
                            sVar.c = ((com.amazon.aps.iva.fa0.e) eVar).c;
                            d(sVar);
                            break;
                    }
            }
            if (this.q != null) {
                new Date().getTime();
                this.q.a();
            }
        }
    }

    public final void d(com.amazon.aps.iva.da0.a aVar) {
        String str = this.d;
        try {
            if (aVar.w()) {
                com.amazon.aps.iva.ga0.o oVar = ((com.amazon.aps.iva.fa0.t) aVar).e;
                if (oVar == null) {
                    oVar = new com.amazon.aps.iva.ga0.o();
                }
                Long l = 0L;
                if (l != null) {
                    oVar.b("xdrfrco", l.toString());
                }
                ((com.amazon.aps.iva.fa0.t) aVar).e = oVar;
            }
            com.amazon.aps.iva.ca0.a.a(str, aVar);
        } catch (Throwable unused) {
            aVar.toString();
            Boolean bool = com.amazon.aps.iva.ia0.b.a;
            com.amazon.aps.iva.ga0.e eVar = this.e;
            if (eVar != null && eVar.d != null) {
                aVar.toString();
            }
        }
    }

    public final void e() {
        boolean z;
        f fVar = this.q;
        if (fVar == null) {
            return;
        }
        if (fVar.d() != null && this.q.d().longValue() != -1) {
            com.amazon.aps.iva.ga0.n nVar = this.h;
            Long d = this.q.d();
            nVar.getClass();
            if (d != null) {
                nVar.b("vhb", d.toString());
            }
        }
        if (this.q.n() != null && this.q.n().longValue() != -1) {
            com.amazon.aps.iva.ga0.n nVar2 = this.h;
            Long n = this.q.n();
            nVar2.getClass();
            if (n != null) {
                nVar2.b("vpthb", n.toString());
            }
        }
        if (this.q.l() != null && this.q.l().longValue() != -1) {
            com.amazon.aps.iva.ga0.n nVar3 = this.h;
            Long l = this.q.l();
            nVar3.getClass();
            if (l != null) {
                nVar3.b("vpttgdu", l.toString());
            }
        }
        if (this.q.k() != null && this.q.k().longValue() != -1) {
            com.amazon.aps.iva.ga0.n nVar4 = this.h;
            Long k = this.q.k();
            nVar4.getClass();
            if (k != null) {
                nVar4.b("vtgdu", k.toString());
            }
        }
        boolean z2 = true;
        if (this.q.c() != null && this.h.k() != this.q.c()) {
            com.amazon.aps.iva.ga0.n nVar5 = this.h;
            Integer c = this.q.c();
            nVar5.getClass();
            if (c != null) {
                nVar5.b("vsowd", c.toString());
            }
            z = true;
        } else {
            z = false;
        }
        if (this.q.f() != null && this.h.j() != this.q.f()) {
            com.amazon.aps.iva.ga0.n nVar6 = this.h;
            Integer f = this.q.f();
            nVar6.getClass();
            if (f != null) {
                nVar6.b("vsoht", f.toString());
            }
            z = true;
        }
        if (this.q.i() != null && this.h.a("vsomity") != this.q.i()) {
            com.amazon.aps.iva.ga0.n nVar7 = this.h;
            String i = this.q.i();
            if (i != null) {
                nVar7.b("vsomity", i);
            } else {
                nVar7.getClass();
            }
            z = true;
        }
        if (this.q.j() != null && this.h.i() != this.q.j()) {
            com.amazon.aps.iva.ga0.n nVar8 = this.h;
            Long j = this.q.j();
            nVar8.getClass();
            if (j != null) {
                nVar8.b("vsodu", j.toString());
            }
            z = true;
        }
        if (this.q.h() != null && this.h.g() != this.q.h()) {
            com.amazon.aps.iva.ga0.n nVar9 = this.h;
            Integer h = this.q.h();
            nVar9.getClass();
            if (h != null) {
                nVar9.b("vsobi", h.toString());
            }
            z = true;
        }
        if (this.q.p() != null && this.h.h() != this.q.p()) {
            com.amazon.aps.iva.ga0.n nVar10 = this.h;
            Float p = this.q.p();
            nVar10.getClass();
            if (p != null) {
                nVar10.b("vsofp", p.toString());
            }
        } else {
            z2 = z;
        }
        if (z2) {
            com.amazon.aps.iva.ea0.a aVar = new com.amazon.aps.iva.ea0.a();
            aVar.d = this.h;
            d(aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0105, code lost:
        if (r6.f != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011e, code lost:
        if (r6.f != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0120, code lost:
        r0.k(r1);
        r0.l(r6.f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.ga0.k f() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ka0.a0.f():com.amazon.aps.iva.ga0.k");
    }

    public final void g() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c.purge();
            this.c = null;
        }
        String str = this.d;
        if (str != null) {
            d(new com.amazon.aps.iva.fa0.u(f(), 1));
            com.amazon.aps.iva.ca0.b remove = com.amazon.aps.iva.ca0.a.a.remove(str);
            if (remove != null) {
                com.amazon.aps.iva.ha0.d dVar = remove.h;
                dVar.d(true);
                ScheduledExecutorService scheduledExecutorService = dVar.o;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                    dVar.o = null;
                }
            }
        }
        this.q = null;
    }

    public final void h(com.amazon.aps.iva.ga0.e eVar) {
        if (eVar.d != null) {
            com.amazon.aps.iva.ea0.a aVar = new com.amazon.aps.iva.ea0.a();
            com.amazon.aps.iva.ga0.h hVar = eVar.f;
            if (hVar != null) {
                aVar.f = hVar;
            }
            com.amazon.aps.iva.ga0.f fVar = eVar.d;
            if (fVar != null) {
                aVar.g = fVar;
            }
            com.amazon.aps.iva.ga0.g gVar = eVar.e;
            if (gVar != null) {
                aVar.e = gVar;
            }
            com.amazon.aps.iva.ga0.d dVar = eVar.h;
            if (dVar != null) {
                aVar.i = dVar;
            }
            com.amazon.aps.iva.ga0.i iVar = eVar.g;
            if (iVar != null) {
                aVar.h = iVar;
            }
            this.e = eVar;
            d(aVar);
            return;
        }
        throw new IllegalArgumentException("customerPlayerData cannot be null");
    }
}
