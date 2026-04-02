package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzetg implements zzery<zzeth> {
    final zzfsn zza;
    final Context zzb;
    final zzayq zzc;

    public zzetg(zzayq zzayqVar, zzfsn zzfsnVar, Context context, byte[] bArr) {
        this.zzc = zzayqVar;
        this.zza = zzfsnVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzeth> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzetf
            private final zzetg zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeth(new JSONObject());
            }
        });
    }
}
