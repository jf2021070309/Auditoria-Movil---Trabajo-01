package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzcgt;
/* loaded from: classes.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzv zzvVar, zzt zztVar, boolean z) {
        if (z) {
            return zzc(context, intent.getData(), zzvVar, zztVar);
        }
        try {
            String valueOf = String.valueOf(intent.toURI());
            com.google.android.gms.ads.internal.util.zze.zza(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzP(context, intent);
            if (zzvVar != null) {
                zzvVar.zzg();
            }
            if (zztVar != null) {
                zztVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            zzcgt.zzi(e2.getMessage());
            if (zztVar != null) {
                zztVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzcVar, zzv zzvVar, zzt zztVar) {
        int i2 = 0;
        if (zzcVar == null) {
            zzcgt.zzi("No intent data for launcher overlay.");
            return false;
        }
        zzbjl.zza(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzvVar, zztVar, zzcVar.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.zzb)) {
            zzcgt.zzi("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(zzcVar.zzc)) {
            intent2.setData(Uri.parse(zzcVar.zzb));
        } else {
            intent2.setDataAndType(Uri.parse(zzcVar.zzb), zzcVar.zzc);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzcVar.zzd)) {
            intent2.setPackage(zzcVar.zzd);
        }
        if (!TextUtils.isEmpty(zzcVar.zze)) {
            String[] split = zzcVar.zze.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(zzcVar.zze);
                zzcgt.zzi(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str = zzcVar.zzf;
        if (!TextUtils.isEmpty(str)) {
            try {
                i2 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzcgt.zzi("Could not parse intent flags.");
            }
            intent2.addFlags(i2);
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzcU)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzcT)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzu(context, intent2);
            }
        }
        return zza(context, intent2, zzvVar, zztVar, zzcVar.zzj);
    }

    private static final boolean zzc(Context context, Uri uri, zzv zzvVar, zzt zztVar) {
        int i2;
        try {
            i2 = com.google.android.gms.ads.internal.zzt.zzc().zzs(context, uri);
            if (zzvVar != null) {
                zzvVar.zzg();
            }
        } catch (ActivityNotFoundException e2) {
            zzcgt.zzi(e2.getMessage());
            i2 = 6;
        }
        if (zztVar != null) {
            zztVar.zzb(i2);
        }
        return i2 == 5;
    }
}
