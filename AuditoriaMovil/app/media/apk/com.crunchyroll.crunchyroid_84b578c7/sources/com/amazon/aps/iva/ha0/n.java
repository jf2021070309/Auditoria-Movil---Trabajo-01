package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.da0.s;
import com.amazon.aps.iva.fa0.t;
/* loaded from: classes4.dex */
public final class n extends c {
    public int d;

    public n(com.amazon.aps.iva.da0.f fVar) {
        super(fVar);
        this.d = 0;
    }

    @Override // com.amazon.aps.iva.ha0.c
    public final void d(t tVar) {
        Long valueOf;
        boolean z;
        com.amazon.aps.iva.ga0.o oVar = tVar.e;
        if (oVar.i().booleanValue()) {
            com.amazon.aps.iva.ia0.b.a("TimeToFirstFrameTracker", "Skipping Time to first frame calculation, this is a program change view");
            return;
        }
        String a = oVar.a("xctpbti");
        if (a == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(a));
        }
        if (valueOf != null && valueOf.longValue() > 1000) {
            z = false;
        } else {
            z = true;
        }
        String type = tVar.getType();
        type.getClass();
        if (!type.equals("adplaying")) {
            if (type.equals("playing") && this.d <= 0) {
                this.d = 1;
                e(oVar.j().longValue());
            }
        } else if (this.d < 2 && z) {
            this.d = 2;
            e(oVar.j().longValue());
        }
    }

    public final void e(long j) {
        com.amazon.aps.iva.ga0.o oVar = new com.amazon.aps.iva.ga0.o();
        Long valueOf = Long.valueOf(j);
        if (valueOf != null) {
            oVar.b("xtitofifr", valueOf.toString());
        }
        this.c.a(new s(oVar));
    }
}
