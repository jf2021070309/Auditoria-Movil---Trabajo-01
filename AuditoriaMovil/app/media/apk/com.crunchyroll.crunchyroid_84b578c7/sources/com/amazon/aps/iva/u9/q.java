package com.amazon.aps.iva.u9;

import androidx.work.impl.WorkDatabase;
import com.amazon.aps.iva.k9.t;
import java.util.UUID;
/* compiled from: WorkProgressUpdater.java */
/* loaded from: classes.dex */
public final class q implements Runnable {
    public final /* synthetic */ UUID b;
    public final /* synthetic */ androidx.work.b c;
    public final /* synthetic */ com.amazon.aps.iva.v9.c d;
    public final /* synthetic */ r e;

    public q(r rVar, UUID uuid, androidx.work.b bVar, com.amazon.aps.iva.v9.c cVar) {
        this.e = rVar;
        this.b = uuid;
        this.c = bVar;
        this.d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.amazon.aps.iva.t9.p i;
        com.amazon.aps.iva.v9.c cVar = this.d;
        UUID uuid = this.b;
        String uuid2 = uuid.toString();
        com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
        int i2 = r.c;
        androidx.work.b bVar = this.c;
        String.format("Updating progress for %s (%s)", uuid, bVar);
        c.a(new Throwable[0]);
        r rVar = this.e;
        WorkDatabase workDatabase = rVar.a;
        WorkDatabase workDatabase2 = rVar.a;
        workDatabase.c();
        try {
            i = ((com.amazon.aps.iva.t9.r) workDatabase2.n()).i(uuid2);
        } finally {
            try {
                return;
            } finally {
            }
        }
        if (i != null) {
            if (i.b == t.RUNNING) {
                com.amazon.aps.iva.t9.m mVar = new com.amazon.aps.iva.t9.m(uuid2, bVar);
                com.amazon.aps.iva.t9.o oVar = (com.amazon.aps.iva.t9.o) workDatabase2.m();
                com.amazon.aps.iva.p8.g gVar = oVar.a;
                gVar.b();
                gVar.c();
                oVar.b.e(mVar);
                gVar.h();
                gVar.f();
            } else {
                com.amazon.aps.iva.k9.m c2 = com.amazon.aps.iva.k9.m.c();
                String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid2);
                c2.f(new Throwable[0]);
            }
            cVar.h(null);
            workDatabase2.h();
            return;
        }
        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
    }
}
