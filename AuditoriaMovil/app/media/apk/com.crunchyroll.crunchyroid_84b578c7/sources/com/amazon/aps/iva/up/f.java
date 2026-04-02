package com.amazon.aps.iva.up;

import com.amazon.aps.iva.a6.g1;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: ScheduledWriter.kt */
/* loaded from: classes2.dex */
public final class f<T> implements com.amazon.aps.iva.sp.c<T> {
    public final com.amazon.aps.iva.sp.c<T> a;
    public final ExecutorService b;
    public final com.amazon.aps.iva.iq.a c;

    public f(com.amazon.aps.iva.sp.c<T> cVar, ExecutorService executorService, com.amazon.aps.iva.iq.a aVar) {
        j.f(executorService, "executorService");
        j.f(aVar, "internalLogger");
        this.a = cVar;
        this.b = executorService;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.sp.c
    public final void a(List<? extends T> list) {
        try {
            this.b.submit(new com.amazon.aps.iva.n4.d(9, this, list));
        } catch (RejectedExecutionException e) {
            com.amazon.aps.iva.iq.a.a(this.c, "Unable to schedule writing on the executor", e, 4);
        }
    }

    @Override // com.amazon.aps.iva.sp.c
    public final void b(T t) {
        try {
            this.b.submit(new g1(6, this, t));
        } catch (RejectedExecutionException e) {
            com.amazon.aps.iva.iq.a.a(this.c, "Unable to schedule writing on the executor", e, 4);
        }
    }
}
