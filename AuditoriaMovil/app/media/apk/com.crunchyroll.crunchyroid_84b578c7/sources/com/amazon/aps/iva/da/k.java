package com.amazon.aps.iva.da;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q0;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.se0.u;
/* compiled from: LottieCompositionResult.kt */
/* loaded from: classes.dex */
public final class k implements p3 {
    public final u b = com.amazon.aps.iva.a60.b.e();
    public final y1 c = com.amazon.aps.iva.cq.b.c0(null);
    public final y1 d = com.amazon.aps.iva.cq.b.c0(null);
    public final q0 e;
    public final q0 f;

    /* compiled from: LottieCompositionResult.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            boolean z;
            k kVar = k.this;
            if (((com.amazon.aps.iva.z9.h) kVar.c.getValue()) == null && ((Throwable) kVar.d.getValue()) == null) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: LottieCompositionResult.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            boolean z;
            if (((Throwable) k.this.d.getValue()) != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: LottieCompositionResult.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            boolean z;
            k kVar = k.this;
            if (((com.amazon.aps.iva.z9.h) kVar.c.getValue()) == null && ((Throwable) kVar.d.getValue()) == null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: LottieCompositionResult.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            boolean z;
            if (((com.amazon.aps.iva.z9.h) k.this.c.getValue()) != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public k() {
        com.amazon.aps.iva.cq.b.M(new c());
        this.e = com.amazon.aps.iva.cq.b.M(new a());
        com.amazon.aps.iva.cq.b.M(new b());
        this.f = com.amazon.aps.iva.cq.b.M(new d());
    }

    @Override // com.amazon.aps.iva.o0.p3
    public final Object getValue() {
        return (com.amazon.aps.iva.z9.h) this.c.getValue();
    }
}
