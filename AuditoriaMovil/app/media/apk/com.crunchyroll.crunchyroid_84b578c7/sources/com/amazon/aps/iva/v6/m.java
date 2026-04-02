package com.amazon.aps.iva.v6;

import android.os.Handler;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q5.y0;
/* compiled from: VideoRendererEventListener.java */
/* loaded from: classes.dex */
public interface m {

    /* compiled from: VideoRendererEventListener.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final Handler a;
        public final m b;

        public a(Handler handler, m mVar) {
            this.a = handler;
            this.b = mVar;
        }

        public final void a(y0 y0Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new com.amazon.aps.iva.c6.f(3, this, y0Var));
            }
        }
    }

    default void B(y0 y0Var) {
    }

    default void c(String str) {
    }

    default void l(Exception exc) {
    }

    default void r(com.amazon.aps.iva.a6.f fVar) {
    }

    default void s(com.amazon.aps.iva.a6.f fVar) {
    }

    default void m(long j, Object obj) {
    }

    default void q(int i, long j) {
    }

    default void u(int i, long j) {
    }

    default void x(v vVar, com.amazon.aps.iva.a6.g gVar) {
    }

    default void z(long j, long j2, String str) {
    }
}
