package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.da0.s;
import com.amazon.aps.iva.fa0.t;
/* loaded from: classes4.dex */
public final class j extends b {
    public boolean e;
    public int f;
    public double g;
    public long h;
    public double i;
    public Long j;

    public j(com.amazon.aps.iva.da0.f fVar) {
        super(fVar);
        this.e = false;
        this.f = 0;
        this.g = 0.0d;
        this.h = 0L;
        this.i = 0.0d;
        this.j = 0L;
    }

    @Override // com.amazon.aps.iva.ha0.c
    public final void d(t tVar) {
        String type = tVar.getType();
        com.amazon.aps.iva.ga0.o oVar = tVar.e;
        if (oVar != null && oVar.j() != null) {
            this.g = tVar.e.j().longValue();
        }
        if (type.equals("rebufferstart")) {
            if (!this.e) {
                this.e = true;
                this.f++;
                if (tVar.e.k() != null) {
                    this.j = Long.valueOf(tVar.e.k().longValue());
                }
                e(tVar);
            }
        } else if (type.equals("rebufferend")) {
            e(tVar);
            this.e = false;
        } else if (type.equals("internalheartbeat") || type.equals("internalheartbeatend")) {
            e(tVar);
        }
    }

    public final void e(t tVar) {
        com.amazon.aps.iva.ga0.o oVar = new com.amazon.aps.iva.ga0.o();
        Long valueOf = Long.valueOf(tVar.e.k().longValue());
        if (valueOf != null && this.j != null && valueOf.longValue() - this.j.longValue() > 0 && this.e) {
            this.h = (valueOf.longValue() - this.j.longValue()) + this.h;
            this.j = valueOf;
        }
        Integer valueOf2 = Integer.valueOf(this.f);
        if (valueOf2 != null) {
            oVar.b("xreco", valueOf2.toString());
        }
        Long valueOf3 = Long.valueOf(this.h);
        if (valueOf3 != null) {
            oVar.b("xredu", valueOf3.toString());
        }
        if (tVar.e.j() != null && tVar.e.j().longValue() > 0) {
            double d = this.g;
            this.i = this.h / d;
            Double valueOf4 = Double.valueOf(this.f / d);
            if (valueOf4 != null) {
                oVar.b("xrefq", valueOf4.toString());
            }
            Double valueOf5 = Double.valueOf(this.i);
            if (valueOf5 != null) {
                oVar.b("xrepe", valueOf5.toString());
            }
        }
        c(new s(oVar));
    }
}
