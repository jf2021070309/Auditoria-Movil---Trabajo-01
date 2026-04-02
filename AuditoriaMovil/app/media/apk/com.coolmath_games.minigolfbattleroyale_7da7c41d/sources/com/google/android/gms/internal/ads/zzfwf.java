package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfwf extends zzfts<zzfzp, zzfzv> {
    final /* synthetic */ zzfwg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwf(zzfwg zzfwgVar, Class cls) {
        super(cls);
        this.zza = zzfwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ void zzb(zzfzp zzfzpVar) throws GeneralSecurityException {
        zzfwp.zza(zzfzpVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfzp zzc(zzgex zzgexVar) throws zzggm {
        return zzfzp.zzc(zzgexVar, zzgfm.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final /* bridge */ /* synthetic */ zzfzv zzd(zzfzp zzfzpVar) throws GeneralSecurityException {
        zzfzp zzfzpVar2 = zzfzpVar;
        KeyPair zzc = zzgcz.zzc(zzgcz.zzd(zzfwp.zzc(zzfzpVar2.zza().zza().zzg())));
        ECPoint w = ((ECPublicKey) zzc.getPublic()).getW();
        zzfzx zzg = zzfzy.zzg();
        zzg.zza(0);
        zzg.zzb(zzfzpVar2.zza());
        zzg.zzc(zzgex.zzt(w.getAffineX().toByteArray()));
        zzg.zzd(zzgex.zzt(w.getAffineY().toByteArray()));
        zzfzu zzf = zzfzv.zzf();
        zzf.zza(0);
        zzf.zzb(zzg.zzah());
        zzf.zzc(zzgex.zzt(((ECPrivateKey) zzc.getPrivate()).getS().toByteArray()));
        return zzf.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final Map<String, zzftr<zzfzp>> zze() throws GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        HashMap hashMap = new HashMap();
        zzftp zza = zzftq.zza("AES128_GCM");
        bArr = zzfwg.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzfwg.zzl(4, 5, 3, zza, bArr, 1));
        zzftp zza2 = zzftq.zza("AES128_GCM");
        bArr2 = zzfwg.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzfwg.zzl(4, 5, 3, zza2, bArr2, 3));
        zzftp zza3 = zzftq.zza("AES128_GCM");
        bArr3 = zzfwg.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzfwg.zzl(4, 5, 4, zza3, bArr3, 1));
        zzftp zza4 = zzftq.zza("AES128_GCM");
        bArr4 = zzfwg.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzfwg.zzl(4, 5, 4, zza4, bArr4, 3));
        zzftp zza5 = zzftq.zza("AES128_GCM");
        bArr5 = zzfwg.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzfwg.zzl(4, 5, 4, zza5, bArr5, 3));
        zzftp zza6 = zzftq.zza("AES128_CTR_HMAC_SHA256");
        bArr6 = zzfwg.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzfwg.zzl(4, 5, 3, zza6, bArr6, 1));
        zzftp zza7 = zzftq.zza("AES128_CTR_HMAC_SHA256");
        bArr7 = zzfwg.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzfwg.zzl(4, 5, 3, zza7, bArr7, 3));
        zzftp zza8 = zzftq.zza("AES128_CTR_HMAC_SHA256");
        bArr8 = zzfwg.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzfwg.zzl(4, 5, 4, zza8, bArr8, 1));
        zzftp zza9 = zzftq.zza("AES128_CTR_HMAC_SHA256");
        bArr9 = zzfwg.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzfwg.zzl(4, 5, 4, zza9, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }
}
