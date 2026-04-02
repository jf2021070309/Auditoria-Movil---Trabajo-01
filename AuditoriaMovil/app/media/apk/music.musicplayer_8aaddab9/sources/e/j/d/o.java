package e.j.d;

import e.j.d.c0.f0;
/* loaded from: classes2.dex */
public final class o extends h.o.c.k implements h.o.b.a<f0> {
    public final /* synthetic */ k a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k kVar) {
        super(0);
        this.a = kVar;
    }

    @Override // h.o.b.a
    public f0 invoke() {
        return new f0(((Number) this.a.f8812i.f(e.j.d.y.b.w)).longValue() * 1000, ((Number) this.a.f8811h.b("interstitial_capping_timestamp", 0L)).longValue(), false);
    }
}
