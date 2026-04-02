package com.amazon.aps.iva.zp;

import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.yb0.l;
import java.security.SecureRandom;
/* compiled from: RateBasedSampler.kt */
/* loaded from: classes2.dex */
public final class a implements b {
    public final float a;
    public final m b = f.b(C0927a.h);

    /* compiled from: RateBasedSampler.kt */
    /* renamed from: com.amazon.aps.iva.zp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0927a extends l implements com.amazon.aps.iva.xb0.a<SecureRandom> {
        public static final C0927a h = new C0927a();

        public C0927a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final SecureRandom invoke() {
            return new SecureRandom();
        }
    }

    public a(float f) {
        this.a = f;
    }

    @Override // com.amazon.aps.iva.zp.b
    public final boolean a() {
        boolean z;
        boolean z2;
        float f = this.a;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        if (f == 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || ((SecureRandom) this.b.getValue()).nextFloat() <= f) {
            return true;
        }
        return false;
    }
}
