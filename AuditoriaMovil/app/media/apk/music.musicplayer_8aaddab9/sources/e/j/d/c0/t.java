package e.j.d.c0;

import ch.qos.logback.classic.Level;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.ContactSupport", f = "ContactSupport.kt", l = {178, 183}, m = "prepareAttachment")
/* loaded from: classes2.dex */
public final class t extends h.m.i.a.c {
    public Object a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8774b;

    /* renamed from: c  reason: collision with root package name */
    public Object f8775c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f8776d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u f8777e;

    /* renamed from: f  reason: collision with root package name */
    public int f8778f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, h.m.d<? super t> dVar) {
        super(dVar);
        this.f8777e = uVar;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        this.f8776d = obj;
        this.f8778f |= Level.ALL_INT;
        return u.a(this.f8777e, null, this);
    }
}
