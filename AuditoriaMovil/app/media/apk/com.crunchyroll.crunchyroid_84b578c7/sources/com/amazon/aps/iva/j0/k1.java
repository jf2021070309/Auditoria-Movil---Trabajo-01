package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.z.m0;
import com.google.android.gms.cast.MediaError;
/* compiled from: TextFieldCursor.kt */
/* loaded from: classes.dex */
public final class k1 {
    public static final com.amazon.aps.iva.z.g0 a = com.amazon.aps.iva.z.k.a(com.amazon.aps.iva.z.k.b(a.h));
    public static final float b = 2;

    /* compiled from: TextFieldCursor.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<m0.b<Float>, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(m0.b<Float> bVar) {
            m0.b<Float> bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "$this$keyframes");
            bVar2.a = 1000;
            Float valueOf = Float.valueOf(1.0f);
            bVar2.a(0, valueOf);
            bVar2.a(499, valueOf);
            Float valueOf2 = Float.valueOf(0.0f);
            bVar2.a(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN, valueOf2);
            bVar2.a(MediaError.DetailedErrorCode.GENERIC, valueOf2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }
}
