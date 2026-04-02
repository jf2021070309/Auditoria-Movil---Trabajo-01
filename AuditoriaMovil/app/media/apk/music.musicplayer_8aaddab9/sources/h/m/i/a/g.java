package h.m.i.a;
/* loaded from: classes2.dex */
public abstract class g extends a {
    public g(h.m.d<Object> dVar) {
        super(dVar);
        if (dVar == null) {
            return;
        }
        if (!(dVar.getContext() == h.m.g.a)) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // h.m.d
    public h.m.f getContext() {
        return h.m.g.a;
    }
}
