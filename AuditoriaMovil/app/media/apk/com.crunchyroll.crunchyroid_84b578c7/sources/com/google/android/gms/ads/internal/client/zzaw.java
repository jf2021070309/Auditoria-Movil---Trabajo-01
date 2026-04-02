package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbgl;
import com.google.android.gms.internal.ads.zzbjd;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbrj;
import com.google.android.gms.internal.ads.zzbrn;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbyf;
import com.google.android.gms.internal.ads.zzbzo;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzeq zzc;
    private final zzbgk zzd;
    private final zzbvw zze;
    private final zzbrn zzf;
    private final zzbgl zzg;
    private zzbsv zzh;

    public zzaw(zzk zzkVar, zzi zziVar, zzeq zzeqVar, zzbgk zzbgkVar, zzbvw zzbvwVar, zzbrn zzbrnVar, zzbgl zzbglVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzeqVar;
        this.zzd = zzbgkVar;
        this.zze = zzbvwVar;
        this.zzf = zzbrnVar;
        this.zzg = zzbglVar;
    }

    public static /* bridge */ /* synthetic */ void zzt(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zzb().zzn(context, zzay.zzc().zza, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String str, zzbnt zzbntVar) {
        return (zzbq) new zzao(this, context, str, zzbntVar).zzd(context, false);
    }

    public final zzbu zzd(Context context, zzq zzqVar, String str, zzbnt zzbntVar) {
        return (zzbu) new zzak(this, context, zzqVar, str, zzbntVar).zzd(context, false);
    }

    public final zzbu zze(Context context, zzq zzqVar, String str, zzbnt zzbntVar) {
        return (zzbu) new zzam(this, context, zzqVar, str, zzbntVar).zzd(context, false);
    }

    public final zzdj zzf(Context context, zzbnt zzbntVar) {
        return (zzdj) new zzac(this, context, zzbntVar).zzd(context, false);
    }

    public final zzbep zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbep) new zzas(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbev zzi(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbev) new zzau(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzbjd zzl(Context context, zzbnt zzbntVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbjd) new zzai(this, context, zzbntVar, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbrj zzm(Context context, zzbnt zzbntVar) {
        return (zzbrj) new zzag(this, context, zzbntVar).zzd(context, false);
    }

    public final zzbrq zzo(Activity activity) {
        zzaa zzaaVar = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzbzo.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbrq) zzaaVar.zzd(activity, z);
    }

    public final zzbvk zzq(Context context, String str, zzbnt zzbntVar) {
        return (zzbvk) new zzav(this, context, str, zzbntVar).zzd(context, false);
    }

    public final zzbyf zzr(Context context, zzbnt zzbntVar) {
        return (zzbyf) new zzae(this, context, zzbntVar).zzd(context, false);
    }
}
