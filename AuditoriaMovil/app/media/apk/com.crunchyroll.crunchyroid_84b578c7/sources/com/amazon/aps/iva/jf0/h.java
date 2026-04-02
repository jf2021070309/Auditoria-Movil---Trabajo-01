package com.amazon.aps.iva.jf0;

import com.amazon.aps.iva.a6.m;
import com.amazon.aps.iva.jf0.c;
import com.amazon.aps.iva.jf0.d;
import com.amazon.aps.iva.jf0.h;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.player.interactiveads.InteractiveAdsManagerImpl;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;
/* compiled from: DefaultCallAdapterFactory.java */
/* loaded from: classes4.dex */
public final class h extends c.a {
    public final Executor a;

    /* compiled from: DefaultCallAdapterFactory.java */
    /* loaded from: classes4.dex */
    public static final class a<T> implements b<T> {
        public final Executor b;
        public final b<T> c;

        /* compiled from: DefaultCallAdapterFactory.java */
        /* renamed from: com.amazon.aps.iva.jf0.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0416a implements d<T> {
            public final /* synthetic */ d a;

            public C0416a(d dVar) {
                this.a = dVar;
            }

            @Override // com.amazon.aps.iva.jf0.d
            public final void onFailure(b<T> bVar, final Throwable th) {
                Executor executor = a.this.b;
                final d dVar = this.a;
                executor.execute(new Runnable() { // from class: com.amazon.aps.iva.qk.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = r4;
                        Object obj = dVar;
                        Object obj2 = this;
                        switch (i) {
                            case 0:
                                m mVar = (m) obj2;
                                j.f((InteractiveAdsManagerImpl) obj, "this$0");
                                if (mVar != null) {
                                    mVar.pause();
                                }
                                j.m("ivaSdk");
                                throw null;
                            default:
                                ((d) obj).onFailure(h.a.this, (Throwable) th);
                                return;
                        }
                    }
                });
            }

            @Override // com.amazon.aps.iva.jf0.d
            public final void onResponse(b<T> bVar, a0<T> a0Var) {
                a.this.b.execute(new androidx.fragment.app.c(this, 6, this.a, a0Var));
            }
        }

        public a(Executor executor, b<T> bVar) {
            this.b = executor;
            this.c = bVar;
        }

        @Override // com.amazon.aps.iva.jf0.b
        public final void cancel() {
            this.c.cancel();
        }

        @Override // com.amazon.aps.iva.jf0.b
        public final a0<T> execute() throws IOException {
            return this.c.execute();
        }

        @Override // com.amazon.aps.iva.jf0.b
        public final boolean isCanceled() {
            return this.c.isCanceled();
        }

        @Override // com.amazon.aps.iva.jf0.b
        public final void n(d<T> dVar) {
            this.c.n(new C0416a(dVar));
        }

        @Override // com.amazon.aps.iva.jf0.b
        public final Request request() {
            return this.c.request();
        }

        @Override // com.amazon.aps.iva.jf0.b
        /* renamed from: clone */
        public final b<T> m19clone() {
            return new a(this.b, this.c.clone());
        }
    }

    public h(Executor executor) {
        this.a = executor;
    }

    @Override // com.amazon.aps.iva.jf0.c.a
    public final c a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (f0.e(type) != b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type d = f0.d(0, (ParameterizedType) type);
            if (!f0.h(annotationArr, d0.class)) {
                executor = this.a;
            }
            return new g(d, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
