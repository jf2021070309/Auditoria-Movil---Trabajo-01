package m;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import m.j;
/* loaded from: classes.dex */
public final class a extends j.a {
    public boolean a = true;

    /* renamed from: m.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0218a implements j<j.f0, j.f0> {
        public static final C0218a a = new C0218a();

        @Override // m.j
        public j.f0 a(j.f0 f0Var) throws IOException {
            j.f0 f0Var2 = f0Var;
            try {
                return g0.a(f0Var2);
            } finally {
                f0Var2.close();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements j<j.c0, j.c0> {
        public static final b a = new b();

        @Override // m.j
        public j.c0 a(j.c0 c0Var) throws IOException {
            return c0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements j<j.f0, j.f0> {
        public static final c a = new c();

        @Override // m.j
        public j.f0 a(j.f0 f0Var) throws IOException {
            return f0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements j<Object, String> {
        public static final d a = new d();

        @Override // m.j
        public String a(Object obj) throws IOException {
            return obj.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements j<j.f0, h.k> {
        public static final e a = new e();

        @Override // m.j
        public h.k a(j.f0 f0Var) throws IOException {
            f0Var.close();
            return h.k.a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements j<j.f0, Void> {
        public static final f a = new f();

        @Override // m.j
        public Void a(j.f0 f0Var) throws IOException {
            f0Var.close();
            return null;
        }
    }

    @Override // m.j.a
    @Nullable
    public j<?, j.c0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, c0 c0Var) {
        if (j.c0.class.isAssignableFrom(g0.f(type))) {
            return b.a;
        }
        return null;
    }

    @Override // m.j.a
    @Nullable
    public j<j.f0, ?> b(Type type, Annotation[] annotationArr, c0 c0Var) {
        if (type == j.f0.class) {
            return g0.i(annotationArr, m.i0.w.class) ? c.a : C0218a.a;
        } else if (type == Void.class) {
            return f.a;
        } else {
            if (this.a && type == h.k.class) {
                try {
                    return e.a;
                } catch (NoClassDefFoundError unused) {
                    this.a = false;
                    return null;
                }
            }
            return null;
        }
    }
}
