package com.amazon.aps.iva.r2;

import com.amazon.aps.iva.r2.a;
import com.amazon.aps.iva.r2.e;
/* compiled from: CallbackToFutureAdapter.java */
/* loaded from: classes.dex */
public final class b<T> {
    public Object a;
    public e<T> b;
    public f<Void> c = new f<>();
    public boolean d;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r1 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            r0 = 1
            r6.d = r0
            com.amazon.aps.iva.r2.e<T> r1 = r6.b
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L21
            com.amazon.aps.iva.r2.e$a r1 = r1.c
            r1.getClass()
            java.lang.Object r4 = com.amazon.aps.iva.r2.a.h
            com.amazon.aps.iva.r2.a$a r5 = com.amazon.aps.iva.r2.a.g
            boolean r4 = r5.b(r1, r2, r4)
            if (r4 == 0) goto L1d
            com.amazon.aps.iva.r2.a.b(r1)
            r1 = r0
            goto L1e
        L1d:
            r1 = r3
        L1e:
            if (r1 == 0) goto L21
            goto L22
        L21:
            r0 = r3
        L22:
            if (r0 == 0) goto L2a
            r6.a = r2
            r6.b = r2
            r6.c = r2
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r2.b.a():void");
    }

    public final void finalize() {
        f<Void> fVar;
        e<T> eVar = this.b;
        if (eVar != null && !eVar.isDone()) {
            c cVar = new c("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a);
            e.a aVar = eVar.c;
            aVar.getClass();
            if (a.g.b(aVar, null, new a.c(cVar))) {
                a.b(aVar);
            }
        }
        if (!this.d && (fVar = this.c) != null) {
            fVar.g(null);
        }
    }
}
