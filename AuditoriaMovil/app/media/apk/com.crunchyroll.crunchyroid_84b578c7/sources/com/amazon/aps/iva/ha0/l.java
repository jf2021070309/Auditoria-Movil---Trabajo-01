package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.da0.s;
import com.amazon.aps.iva.fa0.t;
import java.util.HashSet;
/* loaded from: classes4.dex */
public final class l extends b {
    public Long e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public final HashSet<String> j;
    public final HashSet<String> k;
    public long l;
    public double m;
    public double n;
    public double o;
    public double p;

    public l(com.amazon.aps.iva.da0.f fVar) {
        super(fVar);
        this.l = 0L;
        this.m = 0.0d;
        this.n = 0.0d;
        this.o = 0.0d;
        this.p = 0.0d;
        HashSet<String> hashSet = new HashSet<>();
        this.j = hashSet;
        hashSet.add("pause");
        hashSet.add("rebufferstart");
        hashSet.add("seeking");
        hashSet.add("adbreakstart");
        hashSet.add("timeupdate");
        hashSet.add("viewend");
        hashSet.add("error");
        HashSet<String> hashSet2 = new HashSet<>();
        this.k = hashSet2;
        hashSet2.add("playing");
        hashSet2.add("timeupdate");
    }

    @Override // com.amazon.aps.iva.ha0.c
    public final void d(t tVar) {
        Long i;
        Integer num;
        String type = tVar.getType();
        type.getClass();
        char c = 65535;
        switch (type.hashCode()) {
            case -493563858:
                if (type.equals("playing")) {
                    c = 0;
                    break;
                }
                break;
            case 3443508:
                if (type.equals("play")) {
                    c = 1;
                    break;
                }
                break;
            case 454234134:
                if (type.equals("viewend")) {
                    c = 2;
                    break;
                }
                break;
            case 1651552038:
                if (type.equals("adbreakstart")) {
                    c = 3;
                    break;
                }
                break;
            case 1971820138:
                if (type.equals("seeking")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
                this.d = false;
                break;
            case 3:
                this.d = true;
                break;
        }
        boolean contains = this.j.contains(tVar.getType());
        com.amazon.aps.iva.ga0.k kVar = tVar.d;
        if (contains && (i = kVar.i()) != null) {
            long longValue = i.longValue();
            if (!this.d && this.e != null && (num = this.f) != null && this.g != null && this.h != null && this.i != null && num.intValue() > 0 && this.g.intValue() > 0 && this.h.intValue() > 0 && this.i.intValue() > 0) {
                long longValue2 = longValue - this.e.longValue();
                if (longValue2 >= 0) {
                    double min = Math.min(this.f.intValue() / this.h.intValue(), this.g.intValue() / this.i.intValue());
                    double max = Math.max(0.0d, min - 1.0d);
                    double max2 = Math.max(0.0d, 1.0d - min);
                    this.m = Math.max(this.m, max);
                    this.n = Math.max(this.n, max2);
                    this.l += longValue2;
                    double d = longValue2;
                    this.o = (max * d) + this.o;
                    this.p = (max2 * d) + this.p;
                    com.amazon.aps.iva.ga0.o oVar = new com.amazon.aps.iva.ga0.o();
                    Double valueOf = Double.valueOf(this.m);
                    if (valueOf != null) {
                        oVar.b("xmauppe", valueOf.toString());
                    }
                    Double valueOf2 = Double.valueOf(this.n);
                    if (valueOf2 != null) {
                        oVar.b("xmadope", valueOf2.toString());
                    }
                    Long valueOf3 = Long.valueOf(this.l);
                    if (valueOf3 != null) {
                        oVar.b("xtlctpbti", valueOf3.toString());
                    }
                    Double valueOf4 = Double.valueOf(this.o);
                    if (valueOf4 != null) {
                        oVar.b("xtlug", valueOf4.toString());
                    }
                    Double valueOf5 = Double.valueOf(this.p);
                    if (valueOf5 != null) {
                        oVar.b("xtldg", valueOf5.toString());
                    }
                    c(new s(oVar));
                }
            }
            this.e = null;
        }
        if (this.k.contains(tVar.getType())) {
            this.e = kVar.i();
            this.f = kVar.j();
            this.g = kVar.g();
            com.amazon.aps.iva.ga0.n nVar = tVar.f;
            this.h = nVar.k();
            this.i = nVar.j();
        }
    }
}
