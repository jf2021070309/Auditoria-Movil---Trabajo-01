package com.kwad.sdk.c;

import android.content.Context;
import com.kuaishou.weapon.p0.WeaponHI;
import com.kwad.sdk.core.e.c;
/* loaded from: classes.dex */
public final class a {
    public static void init(Context context) {
        if (com.kwad.framework.a.a.HS.booleanValue()) {
            try {
                WeaponHI.init(context, new b());
            } catch (Throwable th) {
                c.printStackTraceOnly(th);
            }
        }
    }
}
