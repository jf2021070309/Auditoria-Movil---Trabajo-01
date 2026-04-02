package com.amazon.aps.iva.f8;

import com.amazon.aps.iva.f8.f0;
/* compiled from: MediaRouter.java */
/* loaded from: classes.dex */
public final class h0 extends com.amazon.aps.iva.n5.h {
    public final /* synthetic */ f0.d.C0244d f;

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.h hVar = f0.d.this.t;
            if (hVar != null) {
                hVar.l(this.b);
            }
        }
    }

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f0.h hVar = f0.d.this.t;
            if (hVar != null) {
                hVar.m(this.b);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(f0.d.C0244d c0244d, int i, int i2, int i3, String str) {
        super(i, i2, str, i3);
        this.f = c0244d;
    }

    @Override // com.amazon.aps.iva.n5.h
    public final void b(int i) {
        f0.d.this.n.post(new b(i));
    }

    @Override // com.amazon.aps.iva.n5.h
    public final void c(int i) {
        f0.d.this.n.post(new a(i));
    }
}
