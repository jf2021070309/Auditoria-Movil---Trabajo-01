package e.j.d;

import ch.qos.logback.classic.Level;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper", f = "PremiumHelper.kt", l = {583, 584, 588, 625, 627}, m = "doInitialize")
/* loaded from: classes2.dex */
public final class l extends h.m.i.a.c {
    public Object a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8829b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f8830c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f8831d;

    /* renamed from: e  reason: collision with root package name */
    public int f8832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, h.m.d<? super l> dVar) {
        super(dVar);
        this.f8831d = kVar;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        this.f8830c = obj;
        this.f8832e |= Level.ALL_INT;
        return k.a(this.f8831d, this);
    }
}
