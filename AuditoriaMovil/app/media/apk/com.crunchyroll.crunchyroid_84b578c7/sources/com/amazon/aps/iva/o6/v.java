package com.amazon.aps.iva.o6;

import android.os.Handler;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.t6.e;
import java.io.IOException;
/* compiled from: MediaSource.java */
/* loaded from: classes.dex */
public interface v {

    /* compiled from: MediaSource.java */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.q5.e0 {
        public b(long j, int i, Object obj) {
            super(-1, -1, i, j, obj);
        }

        public final b b(Object obj) {
            com.amazon.aps.iva.q5.e0 e0Var;
            if (this.a.equals(obj)) {
                e0Var = this;
            } else {
                e0Var = new com.amazon.aps.iva.q5.e0(this.b, this.c, this.e, this.d, obj);
            }
            return new b(e0Var);
        }

        public b(Object obj, int i, int i2, long j) {
            super(i, i2, -1, j, obj);
        }
    }

    /* compiled from: MediaSource.java */
    /* loaded from: classes.dex */
    public interface c {
        void b(v vVar, r0 r0Var);
    }

    void a(Handler handler, com.amazon.aps.iva.g6.e eVar);

    com.amazon.aps.iva.q5.b0 b();

    void c(u uVar);

    void d(c cVar, com.amazon.aps.iva.w5.y yVar, p1 p1Var);

    void e(c cVar);

    void f(z zVar);

    void g(Handler handler, z zVar);

    u h(b bVar, com.amazon.aps.iva.t6.b bVar2, long j);

    void i(com.amazon.aps.iva.g6.e eVar);

    void j() throws IOException;

    default boolean k() {
        return true;
    }

    default r0 l() {
        return null;
    }

    void m(c cVar);

    void n(c cVar);

    /* compiled from: MediaSource.java */
    /* loaded from: classes.dex */
    public interface a {
        a a(com.amazon.aps.iva.g6.g gVar);

        int[] c();

        v d(com.amazon.aps.iva.q5.b0 b0Var);

        a e(com.amazon.aps.iva.t6.j jVar);

        default void b(e.a aVar) {
        }
    }
}
