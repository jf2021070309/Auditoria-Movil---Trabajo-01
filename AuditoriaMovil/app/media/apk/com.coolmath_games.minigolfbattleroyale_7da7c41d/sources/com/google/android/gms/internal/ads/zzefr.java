package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzefr implements zzeec<zzdji> {
    private final Context zza;
    private final zzdkf zzb;
    private final Executor zzc;
    private final zzezy zzd;

    public zzefr(Context context, Executor executor, zzdkf zzdkfVar, zzezy zzezyVar) {
        this.zza = context;
        this.zzb = zzdkfVar;
        this.zzc = executor;
        this.zzd = zzezyVar;
    }

    private static String zzd(zzezz zzezzVar) {
        try {
            return zzezzVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final boolean zza(zzfal zzfalVar, zzezz zzezzVar) {
        return (this.zza instanceof Activity) && PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzbkj.zza(this.zza) && !TextUtils.isEmpty(zzd(zzezzVar));
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final zzfsm<zzdji> zzb(final zzfal zzfalVar, final zzezz zzezzVar) {
        String zzd = zzd(zzezzVar);
        final Uri parse = zzd != null ? Uri.parse(zzd) : null;
        return zzfsd.zzi(zzfsd.zza(null), new zzfrk(this, parse, zzfalVar, zzezzVar) { // from class: com.google.android.gms.internal.ads.zzefp
            private final zzefr zza;
            private final Uri zzb;
            private final zzfal zzc;
            private final zzezz zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = parse;
                this.zzc = zzfalVar;
                this.zzd = zzezzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return this.zza.zzc(this.zzb, this.zzc, this.zzd, obj);
            }
        }, this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfsm zzc(Uri uri, zzfal zzfalVar, zzezz zzezzVar, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(build.intent, null);
            final zzchl zzchlVar = new zzchl();
            zzdjj zzQ = this.zzb.zzQ(new zzcxv(zzfalVar, zzezzVar, null), new zzdjm(new zzdkn(zzchlVar) { // from class: com.google.android.gms.internal.ads.zzefq
                private final zzchl zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzchlVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdkn
                public final void zza(boolean z, Context context, zzdbp zzdbpVar) {
                    zzchl zzchlVar2 = this.zza;
                    try {
                        com.google.android.gms.ads.internal.zzt.zzb();
                        com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzchlVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzchlVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzQ.zzi(), null, new zzcgz(0, 0, false, false, false), null, null));
            this.zzd.zzd();
            return zzfsd.zza(zzQ.zzh());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
