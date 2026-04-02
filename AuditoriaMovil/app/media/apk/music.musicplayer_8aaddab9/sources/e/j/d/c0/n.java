package e.j.d.c0;

import android.app.Activity;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$launchBillingFlow$1", f = "Billing.kt", l = {393, 395, 399, 410}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> {
    public Object a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8740b;

    /* renamed from: c  reason: collision with root package name */
    public Object f8741c;

    /* renamed from: d  reason: collision with root package name */
    public Object f8742d;

    /* renamed from: e  reason: collision with root package name */
    public Object f8743e;

    /* renamed from: f  reason: collision with root package name */
    public int f8744f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e.j.d.h f8745g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f8746h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Activity f8747i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e.j.d.h hVar, i iVar, Activity activity, h.m.d<? super n> dVar) {
        super(2, dVar);
        this.f8745g = hVar;
        this.f8746h = iVar;
        this.f8747i = activity;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new n(this.f8745g, this.f8746h, this.f8747i, dVar);
    }

    @Override // h.o.b.p
    public Object i(i.a.e0 e0Var, h.m.d<? super h.k> dVar) {
        return new n(this.f8745g, this.f8746h, this.f8747i, dVar).invokeSuspend(h.k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    @Override // h.m.i.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
