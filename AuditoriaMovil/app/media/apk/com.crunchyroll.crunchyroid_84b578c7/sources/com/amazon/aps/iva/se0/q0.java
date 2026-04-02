package com.amazon.aps.iva.se0;

import java.util.concurrent.CancellationException;
/* compiled from: DispatchedTask.kt */
/* loaded from: classes4.dex */
public abstract class q0<T> extends com.amazon.aps.iva.ye0.g {
    public int d;

    public q0(int i) {
        this.d = i;
    }

    public abstract com.amazon.aps.iva.ob0.d<T> b();

    public Throwable f(Object obj) {
        w wVar;
        if (obj instanceof w) {
            wVar = (w) obj;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            return null;
        }
        return wVar.a;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            com.amazon.aps.iva.aq.k.f(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        com.amazon.aps.iva.yb0.j.c(th);
        i.c(b().getContext(), new i0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        r6 = (com.amazon.aps.iva.se0.j1) r6.get(com.amazon.aps.iva.se0.j1.b.b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r12 = this;
            com.amazon.aps.iva.ye0.h r0 = r12.c
            com.amazon.aps.iva.ob0.d r1 = r12.b()     // Catch: java.lang.Throwable -> L99
            com.amazon.aps.iva.xe0.e r1 = (com.amazon.aps.iva.xe0.e) r1     // Catch: java.lang.Throwable -> L99
            com.amazon.aps.iva.ob0.d<T> r2 = r1.f     // Catch: java.lang.Throwable -> L99
            java.lang.Object r1 = r1.h     // Catch: java.lang.Throwable -> L99
            com.amazon.aps.iva.ob0.g r3 = r2.getContext()     // Catch: java.lang.Throwable -> L99
            java.lang.Object r1 = com.amazon.aps.iva.xe0.u.c(r3, r1)     // Catch: java.lang.Throwable -> L99
            com.amazon.aps.iva.xe0.s r4 = com.amazon.aps.iva.xe0.u.a     // Catch: java.lang.Throwable -> L99
            r5 = 0
            if (r1 == r4) goto L1e
            com.amazon.aps.iva.se0.l2 r4 = com.amazon.aps.iva.se0.b0.c(r2, r3, r1)     // Catch: java.lang.Throwable -> L99
            goto L1f
        L1e:
            r4 = r5
        L1f:
            com.amazon.aps.iva.ob0.g r6 = r2.getContext()     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r12.i()     // Catch: java.lang.Throwable -> L5a
            java.lang.Throwable r8 = r12.f(r7)     // Catch: java.lang.Throwable -> L5a
            if (r8 != 0) goto L42
            int r9 = r12.d     // Catch: java.lang.Throwable -> L5a
            r10 = 1
            if (r9 == r10) goto L37
            r11 = 2
            if (r9 != r11) goto L36
            goto L37
        L36:
            r10 = 0
        L37:
            if (r10 == 0) goto L42
            com.amazon.aps.iva.se0.j1$b r9 = com.amazon.aps.iva.se0.j1.b.b     // Catch: java.lang.Throwable -> L5a
            com.amazon.aps.iva.ob0.g$b r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L5a
            com.amazon.aps.iva.se0.j1 r6 = (com.amazon.aps.iva.se0.j1) r6     // Catch: java.lang.Throwable -> L5a
            goto L43
        L42:
            r6 = r5
        L43:
            if (r6 == 0) goto L5c
            boolean r9 = r6.isActive()     // Catch: java.lang.Throwable -> L5a
            if (r9 != 0) goto L5c
            java.util.concurrent.CancellationException r6 = r6.p()     // Catch: java.lang.Throwable -> L5a
            r12.a(r7, r6)     // Catch: java.lang.Throwable -> L5a
            com.amazon.aps.iva.kb0.k$a r6 = com.amazon.aps.iva.ab.x.H(r6)     // Catch: java.lang.Throwable -> L5a
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L5a
            goto L6d
        L5a:
            r2 = move-exception
            goto L8d
        L5c:
            if (r8 == 0) goto L66
            com.amazon.aps.iva.kb0.k$a r6 = com.amazon.aps.iva.ab.x.H(r8)     // Catch: java.lang.Throwable -> L5a
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L5a
            goto L6d
        L66:
            java.lang.Object r6 = r12.g(r7)     // Catch: java.lang.Throwable -> L5a
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L5a
        L6d:
            com.amazon.aps.iva.kb0.q r2 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L77
            boolean r2 = r4.y0()     // Catch: java.lang.Throwable -> L99
            if (r2 == 0) goto L7a
        L77:
            com.amazon.aps.iva.xe0.u.a(r3, r1)     // Catch: java.lang.Throwable -> L99
        L7a:
            r0.a()     // Catch: java.lang.Throwable -> L80
            com.amazon.aps.iva.kb0.q r0 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L80
            goto L85
        L80:
            r0 = move-exception
            com.amazon.aps.iva.kb0.k$a r0 = com.amazon.aps.iva.ab.x.H(r0)
        L85:
            java.lang.Throwable r0 = com.amazon.aps.iva.kb0.k.a(r0)
            r12.h(r5, r0)
            goto Lac
        L8d:
            if (r4 == 0) goto L95
            boolean r4 = r4.y0()     // Catch: java.lang.Throwable -> L99
            if (r4 == 0) goto L98
        L95:
            com.amazon.aps.iva.xe0.u.a(r3, r1)     // Catch: java.lang.Throwable -> L99
        L98:
            throw r2     // Catch: java.lang.Throwable -> L99
        L99:
            r1 = move-exception
            r0.a()     // Catch: java.lang.Throwable -> La0
            com.amazon.aps.iva.kb0.q r0 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> La0
            goto La5
        La0:
            r0 = move-exception
            com.amazon.aps.iva.kb0.k$a r0 = com.amazon.aps.iva.ab.x.H(r0)
        La5:
            java.lang.Throwable r0 = com.amazon.aps.iva.kb0.k.a(r0)
            r12.h(r1, r0)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.se0.q0.run():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(Object obj) {
        return obj;
    }

    public void a(Object obj, CancellationException cancellationException) {
    }
}
