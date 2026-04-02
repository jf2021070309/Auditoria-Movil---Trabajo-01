package i.a;
/* loaded from: classes2.dex */
public final class b2 extends c0 {

    /* renamed from: b  reason: collision with root package name */
    public static final b2 f8969b = new b2();

    @Override // i.a.c0
    public void e0(h.m.f fVar, Runnable runnable) {
        e2 e2Var = (e2) fVar.get(e2.a);
        if (e2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        e2Var.f8979b = true;
    }

    @Override // i.a.c0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
