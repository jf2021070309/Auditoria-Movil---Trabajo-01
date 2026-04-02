package com.amazon.aps.iva.b6;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.t5.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements o.a, com.amazon.aps.iva.t5.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(Object obj, int i) {
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // com.amazon.aps.iva.t5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.c
            com.amazon.aps.iva.b8.q$d r0 = (com.amazon.aps.iva.b8.q.d) r0
            com.google.common.util.concurrent.ListenableFuture r3 = (com.google.common.util.concurrent.ListenableFuture) r3
            int r1 = com.amazon.aps.iva.b8.p1.i
            java.lang.Object r3 = r3.get()     // Catch: java.lang.InterruptedException -> L14 java.util.concurrent.ExecutionException -> L16 java.util.concurrent.CancellationException -> L2e
            com.amazon.aps.iva.b8.a2 r3 = (com.amazon.aps.iva.b8.a2) r3     // Catch: java.lang.InterruptedException -> L14 java.util.concurrent.ExecutionException -> L16 java.util.concurrent.CancellationException -> L2e
            java.lang.String r1 = "SessionResult must not be null"
            com.amazon.aps.iva.cq.b.B(r3, r1)     // Catch: java.lang.InterruptedException -> L14 java.util.concurrent.ExecutionException -> L16 java.util.concurrent.CancellationException -> L2e
            goto L3a
        L14:
            r3 = move-exception
            goto L17
        L16:
            r3 = move-exception
        L17:
            java.lang.String r1 = "Session operation failed"
            com.amazon.aps.iva.t5.p.h(r1, r3)
            com.amazon.aps.iva.b8.a2 r1 = new com.amazon.aps.iva.b8.a2
            java.lang.Throwable r3 = r3.getCause()
            boolean r3 = r3 instanceof java.lang.UnsupportedOperationException
            if (r3 == 0) goto L28
            r3 = -6
            goto L29
        L28:
            r3 = -1
        L29:
            r1.<init>(r3)
            r3 = r1
            goto L3a
        L2e:
            r3 = move-exception
            java.lang.String r1 = "Session operation cancelled"
            com.amazon.aps.iva.t5.p.h(r1, r3)
            com.amazon.aps.iva.b8.a2 r3 = new com.amazon.aps.iva.b8.a2
            r1 = 1
            r3.<init>(r1)
        L3a:
            int r1 = r2.b
            com.amazon.aps.iva.b8.p1.A0(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b6.l.a(java.lang.Object):void");
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        ((b) obj).u((b.a) this.c, this.b);
    }
}
