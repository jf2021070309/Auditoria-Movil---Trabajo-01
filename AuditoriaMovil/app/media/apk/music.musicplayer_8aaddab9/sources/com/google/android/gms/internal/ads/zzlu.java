package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
/* loaded from: classes.dex */
public final class zzlu extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzls zzd;
    private boolean zze;

    public /* synthetic */ zzlu(zzls zzlsVar, SurfaceTexture surfaceTexture, boolean z, zzlt zzltVar) {
        super(surfaceTexture);
        this.zzd = zzlsVar;
        this.zza = z;
    }

    public static synchronized boolean zza(Context context) {
        int i2;
        String eglQueryString;
        String eglQueryString2;
        synchronized (zzlu.class) {
            if (!zzc) {
                int i3 = zzamq.zza;
                int i4 = 2;
                if (i3 >= 24 && ((i3 >= 26 || (!"samsung".equals(zzamq.zzc) && !"XT1650".equals(zzamq.zzd))) && ((i3 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    if (i3 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i4 = 1;
                    }
                    zzb = i4;
                    zzc = true;
                }
                i4 = 0;
                zzb = i4;
                zzc = true;
            }
            i2 = zzb;
        }
        return i2 != 0;
    }

    public static zzlu zzb(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zza(context)) {
            z2 = false;
        }
        zzakt.zzd(z2);
        return new zzls().zza(z ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
