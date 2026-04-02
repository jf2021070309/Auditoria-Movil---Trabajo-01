package com.amazon.aps.iva.t6;

import com.amazon.aps.iva.o6.q;
import java.io.IOException;
/* compiled from: LoadErrorHandlingPolicy.java */
/* loaded from: classes.dex */
public interface j {

    /* compiled from: LoadErrorHandlingPolicy.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public final boolean a(int i) {
            if (i == 1) {
                if (this.a - this.b <= 1) {
                    return false;
                }
            } else if (this.c - this.d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.t(z);
            this.a = i;
            this.b = j;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final q a;
        public final IOException b;
        public final int c;

        public c(q qVar, IOException iOException, int i) {
            this.a = qVar;
            this.b = iOException;
            this.c = i;
        }
    }

    int a(int i);

    b b(a aVar, c cVar);

    long c(c cVar);
}
