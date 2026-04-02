package m;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import m.c;
/* loaded from: classes.dex */
public final class k extends c.a {
    @Nullable
    public final Executor a;

    /* loaded from: classes2.dex */
    public class a implements c<Object, m.b<?>> {
        public final /* synthetic */ Type a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Executor f9859b;

        public a(k kVar, Type type, Executor executor) {
            this.a = type;
            this.f9859b = executor;
        }

        @Override // m.c
        public Type a() {
            return this.a;
        }

        @Override // m.c
        public m.b<?> b(m.b<Object> bVar) {
            Executor executor = this.f9859b;
            return executor == null ? bVar : new b(executor, bVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements m.b<T> {
        public final Executor a;

        /* renamed from: b  reason: collision with root package name */
        public final m.b<T> f9860b;

        /* loaded from: classes2.dex */
        public class a implements d<T> {
            public final /* synthetic */ d a;

            /* renamed from: m.k$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class RunnableC0219a implements Runnable {
                public final /* synthetic */ a0 a;

                public RunnableC0219a(a0 a0Var) {
                    this.a = a0Var;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.f9860b.i()) {
                        a aVar = a.this;
                        aVar.a.a(b.this, new IOException("Canceled"));
                        return;
                    }
                    a aVar2 = a.this;
                    aVar2.a.b(b.this, this.a);
                }
            }

            /* renamed from: m.k$b$a$b  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class RunnableC0220b implements Runnable {
                public final /* synthetic */ Throwable a;

                public RunnableC0220b(Throwable th) {
                    this.a = th;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    aVar.a.a(b.this, this.a);
                }
            }

            public a(d dVar) {
                this.a = dVar;
            }

            @Override // m.d
            public void a(m.b<T> bVar, Throwable th) {
                b.this.a.execute(new RunnableC0220b(th));
            }

            @Override // m.d
            public void b(m.b<T> bVar, a0<T> a0Var) {
                b.this.a.execute(new RunnableC0219a(a0Var));
            }
        }

        public b(Executor executor, m.b<T> bVar) {
            this.a = executor;
            this.f9860b = bVar;
        }

        @Override // m.b
        public j.z M() {
            return this.f9860b.M();
        }

        @Override // m.b
        public void cancel() {
            this.f9860b.cancel();
        }

        public Object clone() throws CloneNotSupportedException {
            return new b(this.a, this.f9860b.v());
        }

        @Override // m.b
        public void h(d<T> dVar) {
            this.f9860b.h(new a(dVar));
        }

        @Override // m.b
        public boolean i() {
            return this.f9860b.i();
        }

        @Override // m.b
        public m.b<T> v() {
            return new b(this.a, this.f9860b.v());
        }
    }

    public k(@Nullable Executor executor) {
        this.a = executor;
    }

    @Override // m.c.a
    @Nullable
    public c<?, ?> a(Type type, Annotation[] annotationArr, c0 c0Var) {
        if (g0.f(type) != m.b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(this, g0.e(0, (ParameterizedType) type), g0.i(annotationArr, e0.class) ? null : this.a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
