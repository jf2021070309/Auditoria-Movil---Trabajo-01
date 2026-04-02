package e.j.a.o;

import ch.qos.logback.classic.Level;
@h.m.i.a.e(c = "com.zipoapps.ads.exitads.ExitAds", f = "ExitAds.kt", l = {194, 194}, m = "getExitAdView")
/* loaded from: classes2.dex */
public final class h extends h.m.i.a.c {
    public Object a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8494b;

    /* renamed from: c  reason: collision with root package name */
    public Object f8495c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f8496d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f8497e;

    /* renamed from: f  reason: collision with root package name */
    public int f8498f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, h.m.d<? super h> dVar) {
        super(dVar);
        this.f8497e = fVar;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        this.f8496d = obj;
        this.f8498f |= Level.ALL_INT;
        return f.a(this.f8497e, null, this);
    }
}
