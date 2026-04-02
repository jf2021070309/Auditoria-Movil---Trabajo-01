package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* loaded from: classes.dex */
public final class zzgdo extends ThreadLocal<Mac> {
    public final /* synthetic */ zzgdp zza;

    public zzgdo(zzgdp zzgdpVar) {
        this.zza = zzgdpVar;
    }

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
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
