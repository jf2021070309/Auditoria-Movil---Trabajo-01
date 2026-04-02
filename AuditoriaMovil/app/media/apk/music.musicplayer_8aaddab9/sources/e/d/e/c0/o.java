package e.d.e.c0;

import e.d.e.a0;
import e.d.e.z;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class o implements a0, Cloneable {
    public static final o a = new o();

    /* renamed from: b  reason: collision with root package name */
    public List<e.d.e.a> f7815b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public List<e.d.e.a> f7816c = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class a<T> extends z<T> {
        public z<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f7817b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f7818c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e.d.e.j f7819d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e.d.e.d0.a f7820e;

        public a(boolean z, boolean z2, e.d.e.j jVar, e.d.e.d0.a aVar) {
            this.f7817b = z;
            this.f7818c = z2;
            this.f7819d = jVar;
            this.f7820e = aVar;
        }

        @Override // e.d.e.z
        public T a(e.d.e.e0.a aVar) throws IOException {
            if (this.f7817b) {
                aVar.l0();
                return null;
            }
            z<T> zVar = this.a;
            if (zVar == null) {
                zVar = this.f7819d.d(o.this, this.f7820e);
                this.a = zVar;
            }
            return zVar.a(aVar);
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, T t) throws IOException {
            if (this.f7818c) {
                cVar.y();
                return;
            }
            z<T> zVar = this.a;
            if (zVar == null) {
                zVar = this.f7819d.d(o.this, this.f7820e);
                this.a = zVar;
            }
            zVar.b(cVar, t);
        }
    }

    @Override // e.d.e.a0
    public <T> z<T> a(e.d.e.j jVar, e.d.e.d0.a<T> aVar) {
        Class<? super T> cls = aVar.a;
        boolean c2 = c(cls);
        boolean z = c2 || b(cls, true);
        boolean z2 = c2 || b(cls, false);
        if (z || z2) {
            return new a(z2, z, jVar, aVar);
        }
        return null;
    }

    public final boolean b(Class<?> cls, boolean z) {
        for (e.d.e.a aVar : z ? this.f7815b : this.f7816c) {
            if (aVar.b(cls)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return (o) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
