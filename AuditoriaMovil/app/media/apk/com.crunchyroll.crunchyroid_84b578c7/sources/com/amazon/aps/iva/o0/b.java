package com.amazon.aps.iva.o0;

import android.os.Looper;
/* compiled from: ActualAndroid.android.kt */
/* loaded from: classes.dex */
public final class b {
    public static final /* synthetic */ int a = 0;

    /* compiled from: ActualAndroid.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<i1> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final i1 invoke() {
            if (Looper.getMainLooper() != null) {
                return p0.b;
            }
            return w2.b;
        }
    }

    static {
        com.amazon.aps.iva.kb0.f.b(a.h);
    }
}
