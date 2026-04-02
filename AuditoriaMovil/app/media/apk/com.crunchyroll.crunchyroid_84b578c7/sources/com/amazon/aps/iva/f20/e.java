package com.amazon.aps.iva.f20;

import android.content.Context;
import com.amazon.aps.iva.rs.l;
/* compiled from: CrPlusSubscriptionModule.kt */
/* loaded from: classes2.dex */
public interface e extends g {

    /* compiled from: CrPlusSubscriptionModule.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static e a(Context context) {
            d dVar = new d(context);
            com.amazon.aps.iva.yb0.j.f(context, "context");
            f.f++;
            e eVar = f.e;
            if (eVar == null) {
                return new f(context, dVar);
            }
            return eVar;
        }
    }

    com.amazon.aps.iva.b30.a a();

    l d(com.amazon.aps.iva.i60.b bVar);
}
