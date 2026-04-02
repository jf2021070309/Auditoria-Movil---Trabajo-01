package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.ee0.v1;
import com.google.android.gms.ads.AdRequest;
/* compiled from: TypeMappingMode.kt */
/* loaded from: classes4.dex */
public final class b0 {
    public static final b0 k = new b0(false, false, false, false, false, new b0(false, false, false, false, false, null, false, null, null, false, 1023), false, null, null, false, 988);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final b0 f;
    public final boolean g;
    public final b0 h;
    public final b0 i;
    public final boolean j;

    /* compiled from: TypeMappingMode.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[v1.values().length];
            try {
                iArr[v1.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v1.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public b0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, b0 b0Var, boolean z6, b0 b0Var2, b0 b0Var3, boolean z7, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        b0Var = (i & 32) != 0 ? null : b0Var;
        z6 = (i & 64) != 0 ? true : z6;
        b0Var2 = (i & 128) != 0 ? b0Var : b0Var2;
        b0Var3 = (i & 256) != 0 ? b0Var : b0Var3;
        z7 = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? false : z7;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = b0Var;
        this.g = z6;
        this.h = b0Var2;
        this.i = b0Var3;
        this.j = z7;
    }
}
