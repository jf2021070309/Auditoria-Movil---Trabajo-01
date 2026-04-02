package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzesw implements zzery<zzesx> {
    private final Context zza;
    private final String zzb;
    private final zzfsn zzc;

    public zzesw(zzcbl zzcblVar, Context context, String str, zzfsn zzfsnVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzfsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzesx> zza() {
        return this.zzc.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzesv
            private final zzesw zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzesx(new JSONObject());
            }
        });
    }
}
