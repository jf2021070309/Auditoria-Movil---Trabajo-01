package e.j.d.c0;

import ch.qos.logback.classic.Level;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {365}, m = "hasPurchased")
/* loaded from: classes2.dex */
public final class m extends h.m.i.a.c {
    public /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f8738b;

    /* renamed from: c  reason: collision with root package name */
    public int f8739c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, h.m.d<? super m> dVar) {
        super(dVar);
        this.f8738b = iVar;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.f8739c |= Level.ALL_INT;
        return i.c(this.f8738b, null, null, this);
    }
}
