package com.amazon.aps.iva.cj;

import android.content.Context;
/* compiled from: AdvertisingInfoProvider.kt */
/* loaded from: classes.dex */
public interface b {

    /* compiled from: AdvertisingInfoProvider.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static c a;

        public static c a(Context context) {
            com.amazon.aps.iva.xe0.d j = com.amazon.aps.iva.e.z.j();
            com.amazon.aps.iva.yb0.j.f(context, "context");
            c cVar = a;
            if (cVar == null) {
                c cVar2 = new c(context, j);
                a = cVar2;
                return cVar2;
            }
            return cVar;
        }
    }

    com.amazon.aps.iva.cj.a a();
}
