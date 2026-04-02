package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzavk extends Surface {
    private static boolean zza;
    private static boolean zzb;
    private final zzavi zzc;
    private boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzavk(zzavi zzaviVar, SurfaceTexture surfaceTexture, boolean z, zzavj zzavjVar) {
        super(surfaceTexture);
        this.zzc = zzaviVar;
    }

    public static synchronized boolean zza(Context context) {
        boolean z;
        synchronized (zzavk.class) {
            if (!zzb) {
                if (zzave.zza >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content") && (zzave.zza != 24 || ((!zzave.zzd.startsWith("SM-G950") && !zzave.zzd.startsWith("SM-G955")) || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")))) {
                        z2 = true;
                    }
                    zza = z2;
                }
                zzb = true;
            }
            z = zza;
        }
        return z;
    }

    public static zzavk zzb(Context context, boolean z) {
        if (zzave.zza >= 17) {
            boolean z2 = true;
            if (z && !zza(context)) {
                z2 = false;
            }
            zzaup.zzd(z2);
            return new zzavi().zza(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzc) {
            if (!this.zzd) {
                this.zzc.zzb();
                this.zzd = true;
            }
        }
    }
}
