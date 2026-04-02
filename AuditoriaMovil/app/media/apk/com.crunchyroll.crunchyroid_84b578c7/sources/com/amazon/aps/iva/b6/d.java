package com.amazon.aps.iva.b6;

import android.os.Handler;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b8.a2;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.s6.g;
import com.amazon.aps.iva.t5.o;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements o.a, g.AbstractC0697g.a, p1.e, SynchronizationGuard.CriticalSection {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    @Override // com.amazon.aps.iva.s6.g.AbstractC0697g.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.collect.ImmutableList a(int r19, com.amazon.aps.iva.q5.s0 r20, int[] r21) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b6.d.a(int, com.amazon.aps.iva.q5.s0, int[]):com.google.common.collect.ImmutableList");
    }

    @Override // com.amazon.aps.iva.b8.p1.e
    public final Object e(final com.amazon.aps.iva.b8.t tVar, final q.d dVar, int i) {
        switch (this.b) {
            case 5:
                int i2 = com.amazon.aps.iva.b8.p1.i;
                tVar.c.getClass();
                ListenableFuture h = q.a.h();
                com.amazon.aps.iva.cq.b.B(h, "Callback.onSetRating must return non-null future");
                return h;
            default:
                p1.e eVar = (p1.e) this.c;
                final p1.c cVar = (p1.c) this.d;
                int i3 = com.amazon.aps.iva.b8.p1.i;
                if (tVar.g()) {
                    return Futures.immediateFuture(new a2(-100));
                }
                return com.amazon.aps.iva.t5.g0.d0((ListenableFuture) eVar.e(tVar, dVar, i), new AsyncFunction() { // from class: com.amazon.aps.iva.b8.g1
                    @Override // com.google.common.util.concurrent.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        q.d dVar2 = dVar;
                        p1.c cVar2 = cVar;
                        List list = (List) obj;
                        t tVar2 = t.this;
                        Handler handler = tVar2.j;
                        com.amazon.aps.iva.a6.x0 a = tVar2.a(dVar2, new com.amazon.aps.iva.o6.x(tVar2, cVar2, dVar2, list, 2));
                        a2 a2Var = new a2(0);
                        SettableFuture create = SettableFuture.create();
                        com.amazon.aps.iva.t5.g0.U(handler, new com.amazon.aps.iva.n4.h(create, 1, a, a2Var));
                        return create;
                    }
                });
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        return Uploader.b((Uploader) this.c, (TransportContext) this.d);
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((b) obj).l((b.a) obj2, (com.amazon.aps.iva.q5.k0) this.d);
                return;
            case 1:
                ((b) obj).getClass();
                return;
            case 2:
                ((b) obj).P((b.a) obj2);
                return;
            default:
                ((b) obj).getClass();
                return;
        }
    }
}
