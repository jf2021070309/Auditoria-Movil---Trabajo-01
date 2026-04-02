package e.j.d.c0;

import com.google.android.gms.common.api.CommonStatusCodes;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.InstallReferrer$get$2", f = "InstallReferrer.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class x extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super String>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f8791b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, h.m.d<? super x> dVar) {
        super(2, dVar);
        this.f8791b = zVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new x(this.f8791b, dVar);
    }

    @Override // h.o.b.p
    public Object i(i.a.e0 e0Var, h.m.d<? super String> dVar) {
        return new x(this.f8791b, dVar).invokeSuspend(h.k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    @Override // h.m.i.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
