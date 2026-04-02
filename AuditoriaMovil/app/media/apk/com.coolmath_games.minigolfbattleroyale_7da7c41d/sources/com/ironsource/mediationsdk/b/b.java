package com.ironsource.mediationsdk.b;
/* loaded from: classes2.dex */
public final class b extends com.ironsource.mediationsdk.b.a<a> {

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public b(int i) {
        super(i * 1000);
    }

    @Override // com.ironsource.mediationsdk.b.a
    protected final void a() {
        if (this.a != 0) {
            ((a) this.a).a();
        }
    }

    public final void a(a aVar) {
        a((b) aVar);
    }

    public final void d() {
        b();
    }
}
