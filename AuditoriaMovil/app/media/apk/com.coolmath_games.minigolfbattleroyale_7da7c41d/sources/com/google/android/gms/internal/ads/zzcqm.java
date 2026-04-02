package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcqm implements zzezs {
    private final zzcqu zza;
    private Context zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqm(zzcqu zzcquVar, zzcql zzcqlVar) {
        this.zza = zzcquVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezs
    public final zzezt zza() {
        zzgli.zzc(this.zzb, Context.class);
        return new zzcqn(this.zza, this.zzb, this.zzc, null);
    }

    @Override // com.google.android.gms.internal.ads.zzezs
    public final /* bridge */ /* synthetic */ zzezs zzb(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezs
    public final /* bridge */ /* synthetic */ zzezs zzc(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }
}
