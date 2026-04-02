package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzym extends ThreadLocal {
    final /* synthetic */ zzyn zza;

    public zzym(zzyn zzynVar) {
        this.zza = zzynVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzxz zzxzVar = zzxz.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzxzVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
