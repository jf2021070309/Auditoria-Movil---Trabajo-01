package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.fa0.s;
import com.amazon.aps.iva.fa0.t;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public final class h extends c {
    public static final long h = TimeUnit.HOURS.toMillis(1);
    public final com.amazon.aps.iva.ia0.a d;
    public final com.amazon.aps.iva.ca0.c e;
    public long f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.amazon.aps.iva.ca0.c cVar) {
        super(cVar);
        com.amazon.aps.iva.ia0.a aVar = new com.amazon.aps.iva.ia0.a();
        this.d = aVar;
        this.e = cVar;
        this.f = aVar.a();
    }

    @Override // com.amazon.aps.iva.ha0.c
    public final void d(t tVar) {
        String type = tVar.getType();
        type.getClass();
        if (!type.equals("internalheartbeat")) {
            if (type.equals("internalheartbeatend")) {
                this.g = false;
            }
        } else {
            this.g = true;
        }
        long a = this.d.a();
        long j = h;
        if (a - this.f >= j && !tVar.getType().equals("viewinit")) {
            com.amazon.aps.iva.ia0.b.a("LongResumeTracker", "Event handled after " + j + "ms. That's a new view");
            com.amazon.aps.iva.ea0.a aVar = new com.amazon.aps.iva.ea0.a();
            com.amazon.aps.iva.ca0.c cVar = this.e;
            aVar.d = cVar.e;
            aVar.e = cVar.f;
            aVar.i = cVar.j;
            aVar.f = cVar.g;
            com.amazon.aps.iva.ga0.k kVar = tVar.d;
            c(new com.amazon.aps.iva.fa0.k(kVar, 2));
            c(aVar);
            com.amazon.aps.iva.ga0.o oVar = cVar.d;
            tVar.e = oVar;
            if (this.g && (!"play".equals(tVar.getType()) || !"adbreakstart".equals(tVar.getType()))) {
                s sVar = new s(kVar, 0);
                sVar.e = oVar;
                cVar.a(sVar);
                if (!"playing".equals(tVar.getType())) {
                    com.amazon.aps.iva.fa0.k kVar2 = new com.amazon.aps.iva.fa0.k(kVar, 1);
                    kVar2.e = oVar;
                    cVar.a(kVar2);
                }
            }
        }
        this.f = a;
    }
}
