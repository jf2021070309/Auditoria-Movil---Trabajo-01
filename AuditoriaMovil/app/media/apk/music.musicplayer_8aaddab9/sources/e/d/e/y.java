package e.d.e;

import java.io.IOException;
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public class y<T> extends z<T> {
    public final /* synthetic */ z a;

    public y(z zVar) {
        this.a = zVar;
    }

    @Override // e.d.e.z
    public T a(e.d.e.e0.a aVar) throws IOException {
        if (aVar.g0() == e.d.e.e0.b.NULL) {
            aVar.a0();
            return null;
        }
        return (T) this.a.a(aVar);
    }

    @Override // e.d.e.z
    public void b(e.d.e.e0.c cVar, T t) throws IOException {
        if (t == null) {
            cVar.y();
        } else {
            this.a.b(cVar, t);
        }
    }
}
