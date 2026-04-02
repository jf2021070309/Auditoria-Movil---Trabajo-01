package m;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import m.c;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
@IgnoreJRERequirement
/* loaded from: classes.dex */
public final class g extends c.a {
    public static final c.a a = new g();

    @IgnoreJRERequirement
    /* loaded from: classes2.dex */
    public static final class a<R> implements c<R, CompletableFuture<R>> {
        public final Type a;

        public a(Type type) {
            this.a = type;
        }

        @Override // m.c
        public Type a() {
            return this.a;
        }

        @Override // m.c
        public Object b(m.b bVar) {
            e eVar = new e(this, bVar);
            bVar.h(new f(this, eVar));
            return eVar;
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes2.dex */
    public static final class b<R> implements c<R, CompletableFuture<a0<R>>> {
        public final Type a;

        public b(Type type) {
            this.a = type;
        }

        @Override // m.c
        public Type a() {
            return this.a;
        }

        @Override // m.c
        public Object b(m.b bVar) {
            h hVar = new h(this, bVar);
            bVar.h(new i(this, hVar));
            return hVar;
        }
    }

    @Override // m.c.a
    @Nullable
    public c<?, ?> a(Type type, Annotation[] annotationArr, c0 c0Var) {
        if (g0.f(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e2 = g0.e(0, (ParameterizedType) type);
            if (g0.f(e2) != a0.class) {
                return new a(e2);
            }
            if (e2 instanceof ParameterizedType) {
                return new b(g0.e(0, (ParameterizedType) e2));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
