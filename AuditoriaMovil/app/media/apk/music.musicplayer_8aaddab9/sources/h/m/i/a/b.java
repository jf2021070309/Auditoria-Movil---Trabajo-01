package h.m.i.a;
/* loaded from: classes2.dex */
public final class b implements h.m.d<Object> {
    public static final b a = new b();

    @Override // h.m.d
    public h.m.f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // h.m.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
