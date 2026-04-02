package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbkj;
import com.google.android.gms.internal.ads.zzglo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zzl implements zzbkh {
    final /* synthetic */ zzbkj zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(zzs zzsVar, zzbkj zzbkjVar, Context context, Uri uri) {
        this.zza = zzbkjVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbkh
    public final void zza() {
        CustomTabsIntent build = new CustomTabsIntent.Builder(this.zza.zzc()).build();
        build.intent.setPackage(zzglo.zza(this.zzb));
        build.launchUrl(this.zzb, this.zzc);
        this.zza.zzb((Activity) this.zzb);
    }
}
