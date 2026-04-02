package com.amazon.aps.iva.ue0;

import com.amazon.aps.iva.se0.k1;
import com.amazon.aps.iva.ue0.o;
import java.util.concurrent.CancellationException;
/* compiled from: ChannelCoroutine.kt */
/* loaded from: classes4.dex */
public class g<E> extends com.amazon.aps.iva.se0.a<com.amazon.aps.iva.kb0.q> implements f<E> {
    public final f<E> d;

    public g(com.amazon.aps.iva.ob0.g gVar, a aVar) {
        super(gVar, true);
        this.d = aVar;
    }

    @Override // com.amazon.aps.iva.se0.o1
    public final void E(CancellationException cancellationException) {
        this.d.a(cancellationException);
        D(cancellationException);
    }

    @Override // com.amazon.aps.iva.se0.o1, com.amazon.aps.iva.se0.j1
    public final void a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new k1(M(), null, this);
        }
        E(cancellationException);
    }

    @Override // com.amazon.aps.iva.ue0.w
    public final void b(o.b bVar) {
        this.d.b(bVar);
    }

    @Override // com.amazon.aps.iva.ue0.w
    public final Object g(E e, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return this.d.g(e, dVar);
    }

    @Override // com.amazon.aps.iva.ue0.w
    public final Object h(E e) {
        return this.d.h(e);
    }

    @Override // com.amazon.aps.iva.ue0.s
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // com.amazon.aps.iva.ue0.s
    public final h<E> iterator() {
        return this.d.iterator();
    }

    @Override // com.amazon.aps.iva.ue0.s
    public final Object j(com.amazon.aps.iva.ob0.d<? super i<? extends E>> dVar) {
        Object j = this.d.j(dVar);
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        return j;
    }

    @Override // com.amazon.aps.iva.ue0.s
    public final Object o(com.amazon.aps.iva.qb0.c cVar) {
        return this.d.o(cVar);
    }

    @Override // com.amazon.aps.iva.ue0.s
    public final Object q() {
        return this.d.q();
    }

    @Override // com.amazon.aps.iva.ue0.w
    public final boolean r(Throwable th) {
        return this.d.r(th);
    }

    @Override // com.amazon.aps.iva.ue0.w
    public final boolean u() {
        return this.d.u();
    }
}
