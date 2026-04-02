package e.d.e.c0.z;

import e.d.e.a0;
import e.d.e.w;
import e.d.e.z;
import java.io.IOException;
/* loaded from: classes2.dex */
public class s implements a0 {
    public final /* synthetic */ Class a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f7894b;

    /* JADX INFO: Add missing generic type declarations: [T1] */
    /* loaded from: classes2.dex */
    public class a<T1> extends z<T1> {
        public final /* synthetic */ Class a;

        public a(Class cls) {
            this.a = cls;
        }

        @Override // e.d.e.z
        public T1 a(e.d.e.e0.a aVar) throws IOException {
            T1 t1 = (T1) s.this.f7894b.a(aVar);
            if (t1 == null || this.a.isInstance(t1)) {
                return t1;
            }
            StringBuilder y = e.a.d.a.a.y("Expected a ");
            y.append(this.a.getName());
            y.append(" but was ");
            y.append(t1.getClass().getName());
            throw new w(y.toString());
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, T1 t1) throws IOException {
            s.this.f7894b.b(cVar, t1);
        }
    }

    public s(Class cls, z zVar) {
        this.a = cls;
        this.f7894b = zVar;
    }

    @Override // e.d.e.a0
    public <T2> z<T2> a(e.d.e.j jVar, e.d.e.d0.a<T2> aVar) {
        Class<? super T2> cls = aVar.a;
        if (this.a.isAssignableFrom(cls)) {
            return new a(cls);
        }
        return null;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Factory[typeHierarchy=");
        y.append(this.a.getName());
        y.append(",adapter=");
        y.append(this.f7894b);
        y.append("]");
        return y.toString();
    }
}
