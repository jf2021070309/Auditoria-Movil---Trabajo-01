package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzdio;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zzm {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzk != 4 || adOverlayInfoParcel.zzc != null) {
            Intent intent = new Intent();
            intent.setClassName(context, AdActivity.CLASS_NAME);
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.zzd);
            intent.putExtra("shouldCallOnOverlayOpened", z);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!PlatformVersion.isAtLeastLollipop()) {
                intent.addFlags(524288);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(DriveFile.MODE_READ_ONLY);
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzP(context, intent);
            return;
        }
        zzbcv zzbcvVar = adOverlayInfoParcel.zzb;
        if (zzbcvVar != null) {
            zzbcvVar.onAdClicked();
        }
        zzdio zzdioVar = adOverlayInfoParcel.zzy;
        if (zzdioVar != null) {
            zzdioVar.zzb();
        }
        Activity zzj = adOverlayInfoParcel.zzd.zzj();
        zzc zzcVar = adOverlayInfoParcel.zza;
        if (zzcVar != null && zzcVar.zzj && zzj != null) {
            context = zzj;
        }
        com.google.android.gms.ads.internal.zzt.zza();
        zzc zzcVar2 = adOverlayInfoParcel.zza;
        zza.zzb(context, zzcVar2, adOverlayInfoParcel.zzi, zzcVar2 != null ? zzcVar2.zzi : null);
    }
}
