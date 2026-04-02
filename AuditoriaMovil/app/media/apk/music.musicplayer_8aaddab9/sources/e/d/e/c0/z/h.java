package e.d.e.c0.z;

import e.d.e.a0;
import e.d.e.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class h extends z<Object> {
    public static final a0 a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final e.d.e.j f7852b;

    /* loaded from: classes2.dex */
    public class a implements a0 {
        @Override // e.d.e.a0
        public <T> z<T> a(e.d.e.j jVar, e.d.e.d0.a<T> aVar) {
            if (aVar.a == Object.class) {
                return new h(jVar);
            }
            return null;
        }
    }

    public h(e.d.e.j jVar) {
        this.f7852b = jVar;
    }

    @Override // e.d.e.z
    public Object a(e.d.e.e0.a aVar) throws IOException {
        int ordinal = aVar.g0().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.y()) {
                arrayList.add(a(aVar));
            }
            aVar.m();
            return arrayList;
        } else if (ordinal == 2) {
            e.d.e.c0.s sVar = new e.d.e.c0.s();
            aVar.f();
            while (aVar.y()) {
                sVar.put(aVar.Q(), a(aVar));
            }
            aVar.r();
            return sVar;
        } else if (ordinal != 5) {
            if (ordinal != 6) {
                if (ordinal != 7) {
                    if (ordinal == 8) {
                        aVar.a0();
                        return null;
                    }
                    throw new IllegalStateException();
                }
                return Boolean.valueOf(aVar.H());
            }
            return Double.valueOf(aVar.I());
        } else {
            return aVar.e0();
        }
    }

    @Override // e.d.e.z
    public void b(e.d.e.e0.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.y();
            return;
        }
        e.d.e.j jVar = this.f7852b;
        Class<?> cls = obj.getClass();
        Objects.requireNonNull(jVar);
        z c2 = jVar.c(new e.d.e.d0.a(cls));
        if (!(c2 instanceof h)) {
            c2.b(cVar, obj);
            return;
        }
        cVar.h();
        cVar.r();
    }
}
