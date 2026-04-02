package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.util.Clock;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdno implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference<View> zzc;
    private final zzdrh zzd;
    private final Clock zze;
    private zzbob zzf;
    private zzbpr<Object> zzg;

    public zzdno(zzdrh zzdrhVar, Clock clock) {
        this.zzd = zzdrhVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference<View> weakReference = this.zzc;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference<View> weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.zza);
            hashMap.put(SDKConstants.PARAM_A2U_TIME_INTERVAL, String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzd.zzg("sendMessageToNativeJs", hashMap);
        }
        zzd();
    }

    public final void zza(final zzbob zzbobVar) {
        this.zzf = zzbobVar;
        zzbpr<Object> zzbprVar = this.zzg;
        if (zzbprVar != null) {
            this.zzd.zzf("/unconfirmedClick", zzbprVar);
        }
        zzbpr<Object> zzbprVar2 = new zzbpr(this, zzbobVar) { // from class: com.google.android.gms.internal.ads.zzdnn
            private final zzdno zza;
            private final zzbob zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzbobVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                zzdno zzdnoVar = this.zza;
                zzbob zzbobVar2 = this.zzb;
                try {
                    zzdnoVar.zzb = Long.valueOf(Long.parseLong((String) map.get(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP)));
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.zze.zzf("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzdnoVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbobVar2 == null) {
                    com.google.android.gms.ads.internal.util.zze.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbobVar2.zze(str);
                } catch (RemoteException e) {
                    zzcgt.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzg = zzbprVar2;
        this.zzd.zze("/unconfirmedClick", zzbprVar2);
    }

    public final zzbob zzb() {
        return this.zzf;
    }

    public final void zzc() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zzf();
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
    }
}
