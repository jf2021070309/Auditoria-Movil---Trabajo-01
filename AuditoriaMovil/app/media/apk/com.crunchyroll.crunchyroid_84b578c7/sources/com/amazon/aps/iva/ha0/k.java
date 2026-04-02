package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.fa0.t;
import com.amazon.aps.iva.fa0.v;
import com.amazon.aps.iva.fa0.w;
import com.amazon.aps.iva.fa0.x;
/* loaded from: classes4.dex */
public final class k extends c {
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public double j;

    public k(com.amazon.aps.iva.da0.f fVar) {
        super(fVar);
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0.0d;
    }

    @Override // com.amazon.aps.iva.ha0.c
    public final void d(t tVar) {
        char c;
        long j;
        long longValue;
        double doubleValue;
        String type = tVar.getType();
        type.getClass();
        int hashCode = type.hashCode();
        if (hashCode != -1893763032) {
            if (hashCode != -456624996) {
                if (hashCode == 1929584524 && type.equals("requestfailed")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (type.equals("requestcompleted")) {
                    c = 1;
                }
                c = 65535;
            }
        } else {
            if (type.equals("requestcanceled")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    x xVar = (x) tVar;
                    long j2 = this.d + 1;
                    this.d = j2;
                    this.g++;
                    com.amazon.aps.iva.ga0.o oVar = xVar.e;
                    Long valueOf = Long.valueOf(j2);
                    oVar.getClass();
                    if (valueOf != null) {
                        oVar.b("xrqco", valueOf.toString());
                    }
                    Long valueOf2 = Long.valueOf(this.g);
                    if (valueOf2 != null) {
                        oVar.b("xrqfbco", valueOf2.toString());
                    }
                    xVar.e = oVar;
                    return;
                }
                return;
            }
            w wVar = (w) tVar;
            this.d++;
            com.amazon.aps.iva.ga0.b bVar = wVar.g;
            if (bVar != null) {
                if (bVar.m() != null) {
                    j = bVar.l().longValue() - bVar.m().longValue();
                } else {
                    j = 0;
                }
                long longValue2 = bVar.j().longValue() - bVar.l().longValue();
                if (longValue2 > 0 && bVar.g() != null && bVar.g().longValue() > 0) {
                    long longValue3 = (bVar.g().longValue() / longValue2) * 8000;
                    this.e++;
                    this.h = bVar.g().longValue() + this.h;
                    this.i += longValue2;
                    com.amazon.aps.iva.ga0.o oVar2 = wVar.e;
                    if (oVar2.h() == null) {
                        longValue = Long.MAX_VALUE;
                    } else {
                        longValue = oVar2.h().longValue();
                    }
                    Long valueOf3 = Long.valueOf(Math.min(longValue, longValue3));
                    if (valueOf3 != null) {
                        oVar2.b("xmmrqth", valueOf3.toString());
                    }
                    Long valueOf4 = Long.valueOf((long) ((this.h / this.i) * 8000.0d));
                    if (valueOf4 != null) {
                        oVar2.b("xavrqth", valueOf4.toString());
                    }
                    Long valueOf5 = Long.valueOf(this.d);
                    if (valueOf5 != null) {
                        oVar2.b("xrqco", valueOf5.toString());
                    }
                    if (j > 0) {
                        double d = j;
                        this.j += d;
                        if (oVar2.g() == null) {
                            doubleValue = 0.0d;
                        } else {
                            doubleValue = oVar2.g().doubleValue();
                        }
                        Double valueOf6 = Double.valueOf(Math.max(doubleValue, d));
                        if (valueOf6 != null) {
                            oVar2.b("xmarqlt", valueOf6.toString());
                        }
                        Double valueOf7 = Double.valueOf(this.j / this.e);
                        if (valueOf7 != null) {
                            oVar2.b("xavrqlt", valueOf7.toString());
                        }
                    }
                    wVar.e = oVar2;
                    return;
                }
                return;
            }
            return;
        }
        v vVar = (v) tVar;
        long j3 = this.d + 1;
        this.d = j3;
        this.f++;
        com.amazon.aps.iva.ga0.o oVar3 = vVar.e;
        Long valueOf8 = Long.valueOf(j3);
        oVar3.getClass();
        if (valueOf8 != null) {
            oVar3.b("xrqco", valueOf8.toString());
        }
        Long valueOf9 = Long.valueOf(this.f);
        if (valueOf9 != null) {
            oVar3.b("xrqcbco", valueOf9.toString());
        }
        vVar.e = oVar3;
    }
}
