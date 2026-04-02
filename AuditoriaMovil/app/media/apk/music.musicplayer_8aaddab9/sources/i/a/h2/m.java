package i.a.h2;

import i.a.g1;
/* loaded from: classes2.dex */
public final class m<T> implements r<T>, b {
    public final /* synthetic */ r<T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public m(r<? extends T> rVar, g1 g1Var) {
        this.a = rVar;
    }

    @Override // i.a.h2.b
    public Object a(c<? super T> cVar, h.m.d<? super h.k> dVar) {
        return this.a.a(cVar, dVar);
    }

    @Override // i.a.h2.r
    public T getValue() {
        return this.a.getValue();
    }
}
