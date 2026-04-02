package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.if0.c;
import java.util.HashSet;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzde extends zzda {
    public zzde(zzct zzctVar, HashSet hashSet, c cVar, long j) {
        super(zzctVar, hashSet, cVar, j);
    }

    private final void zzc(String str) {
        zzbx zza = zzbx.zza();
        if (zza != null) {
            for (com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar : zza.zzc()) {
                if (((zzda) this).zza.contains(zzeVar.zzi())) {
                    zzeVar.zzh().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzdb, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzdb
    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
