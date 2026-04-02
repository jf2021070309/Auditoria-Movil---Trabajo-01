package com.amazon.aps.iva.u9;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.amazon.aps.iva.k9.p;
import java.util.HashSet;
/* compiled from: EnqueueRunnable.java */
/* loaded from: classes.dex */
public final class e implements Runnable {
    public final com.amazon.aps.iva.l9.g b;
    public final com.amazon.aps.iva.l9.c c = new com.amazon.aps.iva.l9.c();

    static {
        com.amazon.aps.iva.k9.m.e("EnqueueRunnable");
    }

    public e(com.amazon.aps.iva.l9.g gVar) {
        this.b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0181  */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.amazon.aps.iva.l9.g r23) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.u9.e.a(com.amazon.aps.iva.l9.g):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.amazon.aps.iva.l9.c cVar = this.c;
        com.amazon.aps.iva.l9.g gVar = this.b;
        try {
            gVar.getClass();
            com.amazon.aps.iva.l9.k kVar = gVar.a;
            if (!com.amazon.aps.iva.l9.g.b(gVar, new HashSet())) {
                WorkDatabase workDatabase = kVar.c;
                workDatabase.c();
                boolean a = a(gVar);
                workDatabase.h();
                workDatabase.f();
                if (a) {
                    g.a(kVar.a, RescheduleReceiver.class, true);
                    com.amazon.aps.iva.l9.f.a(kVar.b, kVar.c, kVar.e);
                }
                cVar.a(com.amazon.aps.iva.k9.p.a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", gVar));
        } catch (Throwable th) {
            cVar.a(new p.a.C0438a(th));
        }
    }
}
