package com.ironsource.mediationsdk.b;
/* loaded from: classes2.dex */
public final class c extends com.ironsource.mediationsdk.b.a<a> {

    /* loaded from: classes2.dex */
    public interface a {
        void b();
    }

    public c(long j) {
        super(j);
    }

    @Override // com.ironsource.mediationsdk.b.a
    protected final void a() {
        if (this.a != 0) {
            ((a) this.a).b();
        }
    }

    public final void a(a aVar) {
        a((c) aVar);
    }

    public final void d() {
        b();
    }
}
