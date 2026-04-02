package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzcs extends zzct {
    private static final String zzv = "zzcs";
    private AdvertisingIdClient.Info zzw;

    public zzcs(Context context) {
        super(context, "");
    }

    public static zzcs zzl(Context context) {
        zzct.zzt(context, true);
        return new zzcs(context);
    }

    @Override // com.google.android.gms.internal.pal.zzct, com.google.android.gms.internal.pal.zzcr
    public final zzr zzh(Context context, View view, Activity activity) {
        return null;
    }

    @Override // com.google.android.gms.internal.pal.zzct, com.google.android.gms.internal.pal.zzcr
    public final zzr zzj(Context context, View view, Activity activity) {
        return null;
    }

    public final String zzm(String str, String str2) {
        byte[] zze = zzbn.zze(str, str2, true);
        if (zze != null) {
            return zzbj.zza(zze, true);
        }
        return Integer.toString(7);
    }

    @Override // com.google.android.gms.internal.pal.zzct
    public final List zzn(zzdu zzduVar, Context context, zzr zzrVar, zzi zziVar) {
        ArrayList arrayList = new ArrayList();
        if (zzduVar.zzk() == null) {
            return arrayList;
        }
        arrayList.add(new zzem(zzduVar, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", zzrVar, zzduVar.zza(), 24));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.pal.zzct
    public final void zzo(zzdu zzduVar, Context context, zzr zzrVar, zzi zziVar) {
        if (zzduVar.zzb) {
            AdvertisingIdClient.Info info = this.zzw;
            if (info != null) {
                String id = info.getId();
                if (!TextUtils.isEmpty(id)) {
                    zzrVar.zzs(zzdx.zzd(id));
                    zzrVar.zzac(6);
                    zzrVar.zzr(this.zzw.isLimitAdTrackingEnabled());
                }
                this.zzw = null;
                return;
            }
            return;
        }
        zzct.zzu(zzn(zzduVar, context, zzrVar, zziVar));
    }

    public final void zzp(AdvertisingIdClient.Info info) {
        this.zzw = info;
    }
}
