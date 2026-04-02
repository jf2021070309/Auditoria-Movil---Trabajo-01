package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.da0.s;
import com.amazon.aps.iva.fa0.t;
/* loaded from: classes4.dex */
public final class m extends c {
    public long d;
    public boolean e;
    public int f;
    public long g;
    public long h;

    public m(com.amazon.aps.iva.da0.f fVar) {
        super(fVar);
        this.d = 0L;
        this.e = false;
        this.f = 0;
        this.g = 0L;
        this.h = 0L;
    }

    @Override // com.amazon.aps.iva.ha0.c
    public final void d(t tVar) {
        String type = tVar.getType();
        if (type == "seeking") {
            Long k = tVar.e.k();
            if (!this.e) {
                this.e = true;
                com.amazon.aps.iva.fa0.r rVar = new com.amazon.aps.iva.fa0.r(tVar.d, 1);
                rVar.h = false;
                rVar.e = tVar.e;
                c(rVar);
            }
            this.d = k.longValue();
        } else if (type == "seeked") {
            Long k2 = tVar.e.k();
            if (this.d > 0) {
                this.f++;
                long longValue = k2.longValue() - this.d;
                this.g += longValue;
                if (longValue > this.h) {
                    this.h = longValue;
                }
                com.amazon.aps.iva.ga0.o oVar = new com.amazon.aps.iva.ga0.o();
                Integer valueOf = Integer.valueOf(this.f);
                if (valueOf != null) {
                    oVar.b("xskco", valueOf.toString());
                }
                Long valueOf2 = Long.valueOf(this.g);
                if (valueOf2 != null) {
                    oVar.b("xskdu", valueOf2.toString());
                }
                Long valueOf3 = Long.valueOf(this.h);
                if (valueOf3 != null) {
                    oVar.b("xmaskti", valueOf3.toString());
                }
                c(new s(oVar));
            }
            this.e = false;
            this.d = 0L;
        } else if (type == "viewend") {
            this.e = false;
        }
    }
}
