package com.amazon.aps.iva.c7;

import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.e0;
import com.amazon.aps.iva.x6.f0;
import com.amazon.aps.iva.x6.p;
/* compiled from: StartOffsetExtractorOutput.java */
/* loaded from: classes.dex */
public final class d implements p {
    public final long b;
    public final p c;

    /* compiled from: StartOffsetExtractorOutput.java */
    /* loaded from: classes.dex */
    public class a implements d0 {
        public final /* synthetic */ d0 a;

        public a(d0 d0Var) {
            this.a = d0Var;
        }

        @Override // com.amazon.aps.iva.x6.d0
        public final d0.a d(long j) {
            d0.a d = this.a.d(j);
            e0 e0Var = d.a;
            long j2 = e0Var.a;
            long j3 = e0Var.b;
            long j4 = d.this.b;
            e0 e0Var2 = new e0(j2, j3 + j4);
            e0 e0Var3 = d.b;
            return new d0.a(e0Var2, new e0(e0Var3.a, e0Var3.b + j4));
        }

        @Override // com.amazon.aps.iva.x6.d0
        public final boolean f() {
            return this.a.f();
        }

        @Override // com.amazon.aps.iva.x6.d0
        public final long i() {
            return this.a.i();
        }
    }

    public d(long j, p pVar) {
        this.b = j;
        this.c = pVar;
    }

    @Override // com.amazon.aps.iva.x6.p
    public final void m(d0 d0Var) {
        this.c.m(new a(d0Var));
    }

    @Override // com.amazon.aps.iva.x6.p
    public final void o() {
        this.c.o();
    }

    @Override // com.amazon.aps.iva.x6.p
    public final f0 r(int i, int i2) {
        return this.c.r(i, i2);
    }
}
