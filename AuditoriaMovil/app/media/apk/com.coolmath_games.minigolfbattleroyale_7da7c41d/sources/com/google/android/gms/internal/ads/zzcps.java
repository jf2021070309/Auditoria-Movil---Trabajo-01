package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcps implements zzeux {
    private final zzcqu zza;
    private Context zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcps(zzcqu zzcquVar, zzcql zzcqlVar) {
        this.zza = zzcquVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final zzeuy zza() {
        zzgli.zzc(this.zzb, Context.class);
        zzgli.zzc(this.zzc, String.class);
        return new zzcpt(this.zza, this.zzb, this.zzc, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final /* bridge */ /* synthetic */ zzeux zzb(String str) {
        if (str != null) {
            this.zzc = str;
            return this;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final /* bridge */ /* synthetic */ zzeux zzc(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }
}
