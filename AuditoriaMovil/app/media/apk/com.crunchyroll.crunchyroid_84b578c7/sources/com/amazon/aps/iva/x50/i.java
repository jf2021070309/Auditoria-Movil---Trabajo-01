package com.amazon.aps.iva.x50;
/* compiled from: DebouncedTimeTaskExecutor.kt */
/* loaded from: classes2.dex */
public final class i implements h {
    public final long a;
    public final com.amazon.aps.iva.t50.c b;
    public long c;

    public i(long j, com.amazon.aps.iva.t50.c cVar) {
        this.a = j;
        this.b = cVar;
        this.c = cVar.a();
    }

    @Override // com.amazon.aps.iva.x50.h
    public final void a(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        com.amazon.aps.iva.t50.c cVar = this.b;
        if (cVar.a() - this.c >= this.a) {
            aVar.invoke();
            this.c = cVar.a();
        }
    }
}
