package e.j.d.c0;

import ch.qos.logback.classic.Level;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {154, 155}, m = "queryOffer")
/* loaded from: classes2.dex */
public final class q extends h.m.i.a.c {
    public Object a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8756b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f8757c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i f8758d;

    /* renamed from: e  reason: collision with root package name */
    public int f8759e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(i iVar, h.m.d<? super q> dVar) {
        super(dVar);
        this.f8758d = iVar;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        this.f8757c = obj;
        this.f8759e |= Level.ALL_INT;
        return i.e(this.f8758d, null, this);
    }
}
