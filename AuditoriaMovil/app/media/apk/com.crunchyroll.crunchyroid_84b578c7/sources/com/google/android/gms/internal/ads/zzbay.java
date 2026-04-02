package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbay {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbax zzbaxVar : this.zzb) {
            String str = (String) zzba.zzc().zzb(zzbaxVar);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbbj.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza = zza();
        for (zzbax zzbaxVar : this.zzc) {
            String str = (String) zzba.zzc().zzb(zzbaxVar);
            if (!TextUtils.isEmpty(str)) {
                zza.add(str);
            }
        }
        zza.addAll(zzbbj.zzb());
        return zza;
    }

    public final void zzc(zzbax zzbaxVar) {
        this.zzb.add(zzbaxVar);
    }

    public final void zzd(zzbax zzbaxVar) {
        this.zza.add(zzbaxVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i, c cVar) {
        for (zzbax zzbaxVar : this.zza) {
            if (zzbaxVar.zze() == 1) {
                zzbaxVar.zzd(editor, zzbaxVar.zza(cVar));
            }
        }
        if (cVar != null) {
            editor.putString("flag_configuration", cVar.toString());
        } else {
            zzbzo.zzg("Flag Json is null.");
        }
    }
}
