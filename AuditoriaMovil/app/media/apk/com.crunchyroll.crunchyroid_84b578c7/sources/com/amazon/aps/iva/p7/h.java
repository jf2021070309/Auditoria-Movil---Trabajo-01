package com.amazon.aps.iva.p7;

import com.amazon.aps.iva.p7.b;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.f0;
import com.amazon.aps.iva.x6.p;
import java.io.IOException;
/* compiled from: StreamReader.java */
/* loaded from: classes.dex */
public abstract class h {
    public f0 b;
    public p c;
    public f d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final d a = new d();
    public a j = new a();

    /* compiled from: StreamReader.java */
    /* loaded from: classes.dex */
    public static class a {
        public v a;
        public b.a b;
    }

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(com.amazon.aps.iva.t5.v vVar);

    public abstract boolean c(com.amazon.aps.iva.t5.v vVar, long j, a aVar) throws IOException;

    public void d(boolean z) {
        if (z) {
            this.j = new a();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    /* compiled from: StreamReader.java */
    /* loaded from: classes.dex */
    public static final class b implements f {
        @Override // com.amazon.aps.iva.p7.f
        public final long a(com.amazon.aps.iva.x6.i iVar) {
            return -1L;
        }

        @Override // com.amazon.aps.iva.p7.f
        public final d0 b() {
            return new d0.b(-9223372036854775807L);
        }

        @Override // com.amazon.aps.iva.p7.f
        public final void c(long j) {
        }
    }
}
