package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzcq {
    public static float zza(View view) {
        return view.getZ();
    }

    public static String zzb(View view) {
        if (view.isAttachedToWindow()) {
            int visibility = view.getVisibility();
            if (visibility == 8) {
                return "viewGone";
            }
            if (visibility == 4) {
                return "viewInvisible";
            }
            if (visibility != 0) {
                return "viewNotVisible";
            }
            if (view.getAlpha() == 0.0f) {
                return "viewAlphaZero";
            }
            return null;
        }
        return "notAttached";
    }
}
