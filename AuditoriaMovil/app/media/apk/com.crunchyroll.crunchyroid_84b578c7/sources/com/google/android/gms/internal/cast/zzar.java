package com.google.android.gms.internal.cast;

import android.app.Activity;
import android.view.ViewGroup;
import com.google.android.gms.cast.framework.IntroductoryOverlay;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzar implements com.google.android.gms.cast.framework.internal.featurehighlight.zzg {
    final /* synthetic */ Activity zza;
    final /* synthetic */ com.google.android.gms.cast.framework.internal.featurehighlight.zzh zzb;
    final /* synthetic */ zzas zzc;

    public zzar(zzas zzasVar, Activity activity, com.google.android.gms.cast.framework.internal.featurehighlight.zzh zzhVar) {
        this.zzc = zzasVar;
        this.zza = activity;
        this.zzb = zzhVar;
    }

    @Override // com.google.android.gms.cast.framework.internal.featurehighlight.zzg
    public final void zza() {
        boolean z;
        z = this.zzc.zzf;
        if (!z) {
            return;
        }
        com.google.android.gms.cast.framework.zzbf.zza(this.zza);
        com.google.android.gms.cast.framework.internal.featurehighlight.zzh zzhVar = this.zzb;
        final Activity activity = this.zza;
        zzhVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.cast.zzaq
            @Override // java.lang.Runnable
            public final void run() {
                boolean z2;
                IntroductoryOverlay.OnOverlayDismissedListener onOverlayDismissedListener;
                IntroductoryOverlay.OnOverlayDismissedListener onOverlayDismissedListener2;
                zzar zzarVar = zzar.this;
                z2 = zzarVar.zzc.zzf;
                if (z2) {
                    ((ViewGroup) activity.getWindow().getDecorView()).removeView(zzarVar.zzc);
                    zzas zzasVar = zzarVar.zzc;
                    onOverlayDismissedListener = zzasVar.zzc;
                    if (onOverlayDismissedListener != null) {
                        onOverlayDismissedListener2 = zzasVar.zzc;
                        onOverlayDismissedListener2.onOverlayDismissed();
                    }
                    zzarVar.zzc.zzd();
                }
            }
        });
    }

    @Override // com.google.android.gms.cast.framework.internal.featurehighlight.zzg
    public final void zzb() {
        boolean z;
        z = this.zzc.zzf;
        if (!z) {
            return;
        }
        com.google.android.gms.cast.framework.zzbf.zza(this.zza);
        com.google.android.gms.cast.framework.internal.featurehighlight.zzh zzhVar = this.zzb;
        final Activity activity = this.zza;
        zzhVar.zzg(new Runnable() { // from class: com.google.android.gms.internal.cast.zzap
            @Override // java.lang.Runnable
            public final void run() {
                boolean z2;
                IntroductoryOverlay.OnOverlayDismissedListener onOverlayDismissedListener;
                IntroductoryOverlay.OnOverlayDismissedListener onOverlayDismissedListener2;
                zzar zzarVar = zzar.this;
                z2 = zzarVar.zzc.zzf;
                if (z2) {
                    ((ViewGroup) activity.getWindow().getDecorView()).removeView(zzarVar.zzc);
                    zzas zzasVar = zzarVar.zzc;
                    onOverlayDismissedListener = zzasVar.zzc;
                    if (onOverlayDismissedListener != null) {
                        onOverlayDismissedListener2 = zzasVar.zzc;
                        onOverlayDismissedListener2.onOverlayDismissed();
                    }
                    zzarVar.zzc.zzd();
                }
            }
        });
    }
}
