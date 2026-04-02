package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.da0.s;
import com.amazon.aps.iva.fa0.t;
/* loaded from: classes4.dex */
public final class q extends c {
    public long d;
    public long e;

    public q(com.amazon.aps.iva.da0.f fVar) {
        super(fVar);
        this.d = 0L;
        this.e = 0L;
        com.amazon.aps.iva.ga0.o oVar = new com.amazon.aps.iva.ga0.o();
        Long l = 0L;
        if (l != null) {
            oVar.b("xwati", l.toString());
        }
        c(new s(oVar));
    }

    @Override // com.amazon.aps.iva.ha0.c
    public final void d(t tVar) {
        String type = tVar.getType();
        if (type == "internalheartbeat") {
            long longValue = tVar.e.k().longValue();
            e(longValue);
            this.d = longValue;
        } else if (type == "internalheartbeatend") {
            e(tVar.e.k().longValue());
            this.d = 0L;
        }
    }

    public final void e(long j) {
        long j2 = this.d;
        if (j2 > 0) {
            this.e = (j - j2) + this.e;
            com.amazon.aps.iva.ga0.o oVar = new com.amazon.aps.iva.ga0.o();
            Long valueOf = Long.valueOf(this.e);
            if (valueOf != null) {
                oVar.b("xwati", valueOf.toString());
            }
            c(new s(oVar));
        }
    }
}
