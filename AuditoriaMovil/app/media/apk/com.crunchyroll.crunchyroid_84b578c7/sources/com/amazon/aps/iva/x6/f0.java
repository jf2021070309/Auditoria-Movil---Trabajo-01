package com.amazon.aps.iva.x6;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: TrackOutput.java */
/* loaded from: classes.dex */
public interface f0 {

    /* compiled from: TrackOutput.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
        }
    }

    default void a(int i, com.amazon.aps.iva.t5.v vVar) {
        f(i, vVar);
    }

    default int b(com.amazon.aps.iva.q5.o oVar, int i, boolean z) throws IOException {
        return e(oVar, i, z);
    }

    void c(com.amazon.aps.iva.q5.v vVar);

    void d(long j, int i, int i2, int i3, a aVar);

    int e(com.amazon.aps.iva.q5.o oVar, int i, boolean z) throws IOException;

    void f(int i, com.amazon.aps.iva.t5.v vVar);
}
