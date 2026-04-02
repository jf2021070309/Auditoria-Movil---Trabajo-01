package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzmf implements zzme {
    private final WindowManager zza;

    private zzmf(WindowManager windowManager) {
        this.zza = windowManager;
    }

    public static zzme zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzmf(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zza(zzmd zzmdVar) {
        zzmdVar.zza(this.zza.getDefaultDisplay());
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzb() {
    }
}
