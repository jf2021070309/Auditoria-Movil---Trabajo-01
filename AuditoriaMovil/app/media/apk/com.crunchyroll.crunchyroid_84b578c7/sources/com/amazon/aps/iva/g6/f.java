package com.amazon.aps.iva.g6;

import android.os.Looper;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.g6.d;
import com.amazon.aps.iva.g6.e;
/* compiled from: DrmSessionManager.java */
/* loaded from: classes.dex */
public interface f {
    public static final a a = new a();

    /* compiled from: DrmSessionManager.java */
    /* loaded from: classes.dex */
    public interface b {
        public static final com.amazon.aps.iva.g1.n d0 = new com.amazon.aps.iva.g1.n(3);

        void release();
    }

    void a(Looper looper, p1 p1Var);

    d b(e.a aVar, com.amazon.aps.iva.q5.v vVar);

    int c(com.amazon.aps.iva.q5.v vVar);

    default b d(e.a aVar, com.amazon.aps.iva.q5.v vVar) {
        return b.d0;
    }

    default void g() {
    }

    default void release() {
    }

    /* compiled from: DrmSessionManager.java */
    /* loaded from: classes.dex */
    public class a implements f {
        @Override // com.amazon.aps.iva.g6.f
        public final d b(e.a aVar, com.amazon.aps.iva.q5.v vVar) {
            if (vVar.p == null) {
                return null;
            }
            return new l(new d.a(6001, new y()));
        }

        @Override // com.amazon.aps.iva.g6.f
        public final int c(com.amazon.aps.iva.q5.v vVar) {
            if (vVar.p != null) {
                return 1;
            }
            return 0;
        }

        @Override // com.amazon.aps.iva.g6.f
        public final void a(Looper looper, p1 p1Var) {
        }
    }
}
