package com.amazon.aps.iva.c6;

import android.os.Handler;
/* compiled from: AudioRendererEventListener.java */
/* loaded from: classes.dex */
public interface j {

    /* compiled from: AudioRendererEventListener.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final Handler a;
        public final j b;

        public a(Handler handler, j jVar) {
            this.a = handler;
            this.b = jVar;
        }

        public final void a(com.amazon.aps.iva.a6.f fVar) {
            synchronized (fVar) {
            }
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new com.amazon.aps.iva.x2.u(2, this, fVar));
            }
        }
    }

    default void d(String str) {
    }

    default void h(boolean z) {
    }

    default void i(Exception exc) {
    }

    default void j(long j) {
    }

    default void n(com.amazon.aps.iva.a6.f fVar) {
    }

    default void v(com.amazon.aps.iva.a6.f fVar) {
    }

    default void y(Exception exc) {
    }

    default void k(com.amazon.aps.iva.q5.v vVar, com.amazon.aps.iva.a6.g gVar) {
    }

    default void A(int i, long j, long j2) {
    }

    default void o(long j, long j2, String str) {
    }
}
