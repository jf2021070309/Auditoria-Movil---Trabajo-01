package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import com.amazon.aps.iva.if0.c;
import java.util.HashSet;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzdf extends zzda {
    public zzdf(zzct zzctVar, HashSet hashSet, c cVar, long j) {
        super(zzctVar, hashSet, cVar, j);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzcn.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzdb, android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzbx zza;
        if (!TextUtils.isEmpty(str) && (zza = zzbx.zza()) != null) {
            for (com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar : zza.zzc()) {
                if (((zzda) this).zza.contains(zzeVar.zzi())) {
                    zzeVar.zzh().zze(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
