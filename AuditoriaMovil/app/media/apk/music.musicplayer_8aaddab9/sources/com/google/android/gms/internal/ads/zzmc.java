package com.google.android.gms.internal.ads;

import android.view.Surface;
/* loaded from: classes.dex */
public final class zzmc {
    public static void zza(Surface surface, float f2) {
        try {
            surface.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e2) {
            zzaln.zzb("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }
}
