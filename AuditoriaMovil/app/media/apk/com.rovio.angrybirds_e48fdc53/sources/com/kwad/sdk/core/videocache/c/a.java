package com.kwad.sdk.core.videocache.c;

import android.content.Context;
import com.kwad.sdk.core.videocache.f;
/* loaded from: classes.dex */
public final class a {
    private static f axi;

    public static f bl(Context context) {
        f fVar = axi;
        if (fVar == null) {
            f bm = bm(context);
            axi = bm;
            return bm;
        }
        return fVar;
    }

    private static f bm(Context context) {
        return new f.a(context).ag(104857600L).DD();
    }
}
