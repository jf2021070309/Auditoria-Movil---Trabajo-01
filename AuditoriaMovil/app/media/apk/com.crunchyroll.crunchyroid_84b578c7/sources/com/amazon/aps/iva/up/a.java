package com.amazon.aps.iva.up;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.tp.l;
import com.amazon.aps.iva.tp.m;
import com.amazon.aps.iva.yb0.j;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: ConsentAwareFileMigrator.kt */
/* loaded from: classes2.dex */
public final class a {
    public final l a;
    public final ExecutorService b;
    public final com.amazon.aps.iva.iq.a c;

    public a(com.amazon.aps.iva.vp.e eVar, ExecutorService executorService, com.amazon.aps.iva.iq.a aVar) {
        j.f(aVar, "internalLogger");
        this.a = eVar;
        this.b = executorService;
        this.c = aVar;
    }

    public final void a(m mVar, com.amazon.aps.iva.rq.a aVar, m mVar2) {
        boolean a;
        boolean a2;
        boolean a3;
        boolean a4;
        boolean a5;
        boolean a6;
        boolean a7;
        Runnable eVar;
        j.f(mVar, "previousFileOrchestrator");
        j.f(aVar, "newState");
        j.f(mVar2, "newFileOrchestrator");
        com.amazon.aps.iva.kb0.j jVar = new com.amazon.aps.iva.kb0.j(null, aVar);
        com.amazon.aps.iva.rq.a aVar2 = com.amazon.aps.iva.rq.a.PENDING;
        boolean z = true;
        if (j.a(jVar, new com.amazon.aps.iva.kb0.j(null, aVar2))) {
            a = true;
        } else {
            a = j.a(jVar, new com.amazon.aps.iva.kb0.j(null, com.amazon.aps.iva.rq.a.GRANTED));
        }
        if (a) {
            a2 = true;
        } else {
            a2 = j.a(jVar, new com.amazon.aps.iva.kb0.j(null, com.amazon.aps.iva.rq.a.NOT_GRANTED));
        }
        if (a2) {
            a3 = true;
        } else {
            a3 = j.a(jVar, new com.amazon.aps.iva.kb0.j(aVar2, com.amazon.aps.iva.rq.a.NOT_GRANTED));
        }
        com.amazon.aps.iva.iq.a aVar3 = this.c;
        l lVar = this.a;
        if (a3) {
            eVar = new g(mVar.b(), lVar, aVar3);
        } else {
            com.amazon.aps.iva.rq.a aVar4 = com.amazon.aps.iva.rq.a.GRANTED;
            if (j.a(jVar, new com.amazon.aps.iva.kb0.j(aVar4, aVar2))) {
                a4 = true;
            } else {
                a4 = j.a(jVar, new com.amazon.aps.iva.kb0.j(com.amazon.aps.iva.rq.a.NOT_GRANTED, aVar2));
            }
            if (a4) {
                eVar = new g(mVar2.b(), lVar, aVar3);
            } else if (j.a(jVar, new com.amazon.aps.iva.kb0.j(aVar2, aVar4))) {
                eVar = new d(mVar.b(), mVar2.b(), lVar, aVar3);
            } else {
                if (j.a(jVar, new com.amazon.aps.iva.kb0.j(aVar2, aVar2))) {
                    a5 = true;
                } else {
                    a5 = j.a(jVar, new com.amazon.aps.iva.kb0.j(aVar4, aVar4));
                }
                if (a5) {
                    a6 = true;
                } else {
                    a6 = j.a(jVar, new com.amazon.aps.iva.kb0.j(aVar4, com.amazon.aps.iva.rq.a.NOT_GRANTED));
                }
                if (a6) {
                    a7 = true;
                } else {
                    com.amazon.aps.iva.rq.a aVar5 = com.amazon.aps.iva.rq.a.NOT_GRANTED;
                    a7 = j.a(jVar, new com.amazon.aps.iva.kb0.j(aVar5, aVar5));
                }
                if (!a7) {
                    z = j.a(jVar, new com.amazon.aps.iva.kb0.j(com.amazon.aps.iva.rq.a.NOT_GRANTED, aVar4));
                }
                if (z) {
                    eVar = new e();
                } else {
                    l1.M(com.amazon.aps.iva.dq.c.a, "Unexpected consent migration from null to " + aVar, null, 6);
                    eVar = new e();
                }
            }
        }
        try {
            this.b.submit(eVar);
        } catch (RejectedExecutionException e) {
            com.amazon.aps.iva.iq.a.a(aVar3, "Unable to schedule migration on the executor", e, 4);
        }
    }
}
