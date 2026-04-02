package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.da0.s;
import com.amazon.aps.iva.fa0.t;
/* loaded from: classes4.dex */
public final class i extends c {
    public long d;
    public long e;
    public long f;
    public long g;
    public final com.amazon.aps.iva.ia0.a h;
    public boolean i;

    public i(com.amazon.aps.iva.da0.f fVar) {
        super(fVar);
        this.d = -1L;
        this.e = 0L;
        this.f = -1L;
        this.g = -1L;
        this.h = new com.amazon.aps.iva.ia0.a();
    }

    @Override // com.amazon.aps.iva.ha0.c
    public final void d(t tVar) {
        Long i = tVar.d.i();
        if (i == null) {
            return;
        }
        String type = tVar.getType();
        if (i.longValue() > this.f) {
            this.f = i.longValue();
        }
        if (tVar.B()) {
            String type2 = ((com.amazon.aps.iva.fa0.e) tVar).getType();
            type2.getClass();
            char c = 65535;
            switch (type2.hashCode()) {
                case -1535613269:
                    if (type2.equals("adplaying")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1422144041:
                    if (type2.equals("adplay")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1146889097:
                    if (type2.equals("adended")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1137100877:
                    if (type2.equals("adpause")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1651552038:
                    if (type2.equals("adbreakstart")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2133546143:
                    if (type2.equals("adbreakend")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.i = true;
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    this.i = false;
                    this.g = 0L;
                    break;
            }
        }
        if (type == "internalheartbeat") {
            e(i.longValue());
        } else if (type != "internalheartbeatend" && type != "seeking") {
            if (type == "seeked") {
                this.d = i.longValue();
            }
        } else {
            e(i.longValue());
            this.d = -1L;
            this.g = -1L;
        }
    }

    public final void e(long j) {
        long j2;
        Long valueOf;
        long a = this.h.a();
        boolean z = this.i;
        if (z) {
            j2 = a - this.g;
        } else {
            j2 = j - this.d;
        }
        long j3 = this.d;
        if ((j3 >= 0 && j > j3) || z) {
            if (j2 <= 1000) {
                this.e += j2;
                com.amazon.aps.iva.ga0.o oVar = new com.amazon.aps.iva.ga0.o();
                Long valueOf2 = Long.valueOf(this.e);
                if (valueOf2 != null) {
                    oVar.b("xctpbti", valueOf2.toString());
                }
                long j4 = this.f;
                if (j4 > -1 && (valueOf = Long.valueOf(j4)) != null) {
                    oVar.b("xmaphps", valueOf.toString());
                }
                c(new s(oVar));
            } else {
                com.amazon.aps.iva.ia0.b.a("PlaybackTimeTracker", "Playhead position jump of over 1 seconds detected.");
            }
        }
        this.g = a;
        this.d = j;
    }
}
