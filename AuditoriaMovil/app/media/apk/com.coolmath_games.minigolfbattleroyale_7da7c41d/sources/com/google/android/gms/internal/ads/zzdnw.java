package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdnw {
    private final zzdss zza;
    private final zzdrh zzb;
    private final zzcua zzc;
    private final zzdmu zzd;

    public zzdnw(zzdss zzdssVar, zzdrh zzdrhVar, zzcua zzcuaVar, zzdmu zzdmuVar) {
        this.zza = zzdssVar;
        this.zzb = zzdrhVar;
        this.zzc = zzcuaVar;
        this.zzd = zzdmuVar;
    }

    public final View zza() throws zzcmw {
        zzcml zzb = this.zza.zzb(zzbdl.zzb(), null, null);
        View view = (View) zzb;
        view.setVisibility(8);
        zzb.zzab("/sendMessageToSdk", new zzbpr(this) { // from class: com.google.android.gms.internal.ads.zzdnq
            private final zzdnw zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                this.zza.zzf((zzcml) obj, map);
            }
        });
        zzb.zzab("/adMuted", new zzbpr(this) { // from class: com.google.android.gms.internal.ads.zzdnr
            private final zzdnw zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                this.zza.zze((zzcml) obj, map);
            }
        });
        this.zzb.zzi(new WeakReference(zzb), "/loadHtml", new zzbpr(this) { // from class: com.google.android.gms.internal.ads.zzdns
            private final zzdnw zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, final Map map) {
                final zzdnw zzdnwVar = this.zza;
                zzcml zzcmlVar = (zzcml) obj;
                zzcmlVar.zzR().zzy(new zzcnx(zzdnwVar, map) { // from class: com.google.android.gms.internal.ads.zzdnv
                    private final zzdnw zza;
                    private final Map zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzdnwVar;
                        this.zzb = map;
                    }

                    @Override // com.google.android.gms.internal.ads.zzcnx
                    public final void zza(boolean z) {
                        this.zza.zzd(this.zzb, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcmlVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcmlVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzi(new WeakReference(zzb), "/showOverlay", new zzbpr(this) { // from class: com.google.android.gms.internal.ads.zzdnt
            private final zzdnw zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcml) obj, map);
            }
        });
        this.zzb.zzi(new WeakReference(zzb), "/hideOverlay", new zzbpr(this) { // from class: com.google.android.gms.internal.ads.zzdnu
            private final zzdnw zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcml) obj, map);
            }
        });
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcml zzcmlVar, Map map) {
        com.google.android.gms.ads.internal.util.zze.zzh("Hiding native ads overlay.");
        zzcmlVar.zzH().setVisibility(8);
        this.zzc.zze(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcml zzcmlVar, Map map) {
        com.google.android.gms.ads.internal.util.zze.zzh("Showing native ads overlay.");
        zzcmlVar.zzH().setVisibility(0);
        this.zzc.zze(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcml zzcmlVar, Map map) {
        this.zzd.zzw();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcml zzcmlVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }
}
