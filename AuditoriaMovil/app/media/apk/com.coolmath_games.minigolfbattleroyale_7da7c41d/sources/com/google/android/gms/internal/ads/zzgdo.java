package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgdo extends ThreadLocal<Mac> {
    final /* synthetic */ zzgdp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgdo(zzgdp zzgdpVar) {
        this.zza = zzgdpVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzgdb<zzgdg, Mac> zzgdbVar = zzgdb.zzb;
            str = this.zza.zzb;
            Mac zzb = zzgdbVar.zzb(str);
            key = this.zza.zzc;
            zzb.init(key);
            return zzb;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
