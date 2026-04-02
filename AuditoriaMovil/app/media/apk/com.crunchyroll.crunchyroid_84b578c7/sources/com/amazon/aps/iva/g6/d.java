package com.amazon.aps.iva.g6;

import com.amazon.aps.iva.g6.e;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
/* compiled from: DrmSession.java */
/* loaded from: classes.dex */
public interface d {

    /* compiled from: DrmSession.java */
    /* loaded from: classes.dex */
    public static class a extends IOException {
        public final int b;

        public a(int i, Throwable th) {
            super(th);
            this.b = i;
        }
    }

    static void g(d dVar, d dVar2) {
        if (dVar == dVar2) {
            return;
        }
        if (dVar2 != null) {
            dVar2.f(null);
        }
        if (dVar != null) {
            dVar.e(null);
        }
    }

    UUID a();

    default boolean b() {
        return false;
    }

    byte[] c();

    com.amazon.aps.iva.z5.b d();

    void e(e.a aVar);

    void f(e.a aVar);

    a getError();

    int getState();

    Map<String, String> h();

    boolean i(String str);
}
