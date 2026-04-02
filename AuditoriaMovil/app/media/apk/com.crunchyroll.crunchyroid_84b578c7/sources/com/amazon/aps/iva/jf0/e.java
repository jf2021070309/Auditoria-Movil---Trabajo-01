package com.amazon.aps.iva.jf0;

import com.amazon.aps.iva.jf0.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* compiled from: CompletableFutureCallAdapterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes4.dex */
public final class e extends c.a {
    public static final e a = new e();

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class a<R> implements com.amazon.aps.iva.jf0.c<R, CompletableFuture<R>> {
        public final Type a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        /* renamed from: com.amazon.aps.iva.jf0.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0415a implements d<R> {
            public final CompletableFuture<R> a;

            public C0415a(b bVar) {
                this.a = bVar;
            }

            @Override // com.amazon.aps.iva.jf0.d
            public final void onFailure(com.amazon.aps.iva.jf0.b<R> bVar, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // com.amazon.aps.iva.jf0.d
            public final void onResponse(com.amazon.aps.iva.jf0.b<R> bVar, a0<R> a0Var) {
                boolean a = a0Var.a();
                CompletableFuture<R> completableFuture = this.a;
                if (a) {
                    completableFuture.complete(a0Var.b);
                } else {
                    completableFuture.completeExceptionally(new i(a0Var));
                }
            }
        }

        public a(Type type) {
            this.a = type;
        }

        @Override // com.amazon.aps.iva.jf0.c
        public final Type a() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.jf0.c
        public final Object b(s sVar) {
            b bVar = new b(sVar);
            sVar.n(new C0415a(bVar));
            return bVar;
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class b<T> extends CompletableFuture<T> {
        public final com.amazon.aps.iva.jf0.b<?> b;

        public b(s sVar) {
            this.b = sVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.b.cancel();
            }
            return super.cancel(z);
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class c<R> implements com.amazon.aps.iva.jf0.c<R, CompletableFuture<a0<R>>> {
        public final Type a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        /* loaded from: classes4.dex */
        public class a implements d<R> {
            public final CompletableFuture<a0<R>> a;

            public a(b bVar) {
                this.a = bVar;
            }

            @Override // com.amazon.aps.iva.jf0.d
            public final void onFailure(com.amazon.aps.iva.jf0.b<R> bVar, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // com.amazon.aps.iva.jf0.d
            public final void onResponse(com.amazon.aps.iva.jf0.b<R> bVar, a0<R> a0Var) {
                this.a.complete(a0Var);
            }
        }

        public c(Type type) {
            this.a = type;
        }

        @Override // com.amazon.aps.iva.jf0.c
        public final Type a() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.jf0.c
        public final Object b(s sVar) {
            b bVar = new b(sVar);
            sVar.n(new a(bVar));
            return bVar;
        }
    }

    @Override // com.amazon.aps.iva.jf0.c.a
    public final com.amazon.aps.iva.jf0.c a(Type type, Annotation[] annotationArr) {
        if (f0.e(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type d = f0.d(0, (ParameterizedType) type);
            if (f0.e(d) != a0.class) {
                return new a(d);
            }
            if (d instanceof ParameterizedType) {
                return new c(f0.d(0, (ParameterizedType) d));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
