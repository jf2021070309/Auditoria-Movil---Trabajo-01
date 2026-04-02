package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfwe extends zzftt<zzftk, zzfzv> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwe(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final /* bridge */ /* synthetic */ zzftk zzb(zzfzv zzfzvVar) throws GeneralSecurityException {
        zzfzv zzfzvVar2 = zzfzvVar;
        zzfzs zzc = zzfzvVar2.zzc().zzc();
        zzgab zza = zzc.zza();
        int zzc2 = zzfwp.zzc(zza.zzg());
        byte[] zzz = zzfzvVar2.zzd().zzz();
        return new zzgcu((ECPrivateKey) zzgdb.zzg.zzb("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, zzz), zzgcz.zzd(zzc2))), zza.zza().zzz(), zzfwp.zzb(zza.zzh()), zzfwp.zzd(zzc.zzi()), new zzfwq(zzc.zzc().zza()));
    }
}
