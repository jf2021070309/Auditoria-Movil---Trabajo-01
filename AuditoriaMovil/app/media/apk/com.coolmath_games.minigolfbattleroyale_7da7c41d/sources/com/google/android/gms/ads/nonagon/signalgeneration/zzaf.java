package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.zzcbj;
import com.google.android.gms.internal.ads.zzdzk;
import com.google.android.gms.internal.ads.zzfrk;
import com.google.android.gms.internal.ads.zzfsd;
import com.google.android.gms.internal.ads.zzfsm;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zzaf implements zzfrk<zzcbj, zzah> {
    private final Executor zza;
    private final zzdzk zzb;

    public zzaf(Executor executor, zzdzk zzdzkVar) {
        this.zza = executor;
        this.zzb = zzdzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final /* bridge */ /* synthetic */ zzfsm<zzah> zza(zzcbj zzcbjVar) throws Exception {
        final zzcbj zzcbjVar2 = zzcbjVar;
        return zzfsd.zzi(this.zzb.zza(zzcbjVar2), new zzfrk(zzcbjVar2) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
            private final zzcbj zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzcbjVar2;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                zzcbj zzcbjVar3 = this.zza;
                zzah zzahVar = new zzah(new JsonReader(new InputStreamReader((InputStream) obj)));
                try {
                    zzahVar.zzb = com.google.android.gms.ads.internal.zzt.zzc().zzl(zzcbjVar3.zza).toString();
                } catch (JSONException unused) {
                    zzahVar.zzb = JsonUtils.EMPTY_JSON;
                }
                return zzfsd.zza(zzahVar);
            }
        }, this.zza);
    }
}
