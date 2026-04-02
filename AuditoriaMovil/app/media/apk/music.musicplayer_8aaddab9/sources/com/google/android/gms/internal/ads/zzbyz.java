package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
/* loaded from: classes.dex */
public final class zzbyz implements NativeCustomFormatAd {
    private final zzbnb zza;
    private final MediaView zzb;
    private final VideoController zzc = new VideoController();
    private NativeCustomFormatAd.DisplayOpenMeasurement zzd;

    @VisibleForTesting
    public zzbyz(zzbnb zzbnbVar) {
        Context context;
        this.zza = zzbnbVar;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbnbVar.zzm());
        } catch (RemoteException | NullPointerException e2) {
            zzcgt.zzg("", e2);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.zza.zzn(ObjectWrapper.wrap(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e3) {
                zzcgt.zzg("", e3);
            }
        }
        this.zzb = mediaView;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final String getCustomFormatId() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzd == null && this.zza.zzo()) {
                this.zzd = new zzbys(this.zza);
            }
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeAd.Image getImage(String str) {
        try {
            zzbmh zzf = this.zza.zzf(str);
            if (zzf != null) {
                return new zzbyt(zzf);
            }
            return null;
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final CharSequence getText(String str) {
        try {
            return this.zza.zze(str);
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final VideoController getVideoController() {
        try {
            zzbhc zzk = this.zza.zzk();
            if (zzk != null) {
                this.zzc.zza(zzk);
            }
        } catch (RemoteException e2) {
            zzcgt.zzg("Exception occurred while getting video controller", e2);
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final MediaView getVideoMediaView() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String str) {
        try {
            this.zza.zzi(str);
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.zza.zzj();
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
    }
}
