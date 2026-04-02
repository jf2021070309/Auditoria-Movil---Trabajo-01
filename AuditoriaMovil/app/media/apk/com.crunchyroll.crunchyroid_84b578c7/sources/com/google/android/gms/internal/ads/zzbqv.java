package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbqv extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbqv(zzbed zzbedVar) {
        zzbel zzbelVar;
        try {
            this.zzb = zzbedVar.zzg();
        } catch (RemoteException e) {
            zzbzo.zzh("", e);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbedVar.zzh()) {
                if (obj instanceof IBinder) {
                    zzbelVar = zzbek.zzg((IBinder) obj);
                } else {
                    zzbelVar = null;
                }
                if (zzbelVar != null) {
                    this.zza.add(new zzbqx(zzbelVar));
                }
            }
        } catch (RemoteException e2) {
            zzbzo.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
