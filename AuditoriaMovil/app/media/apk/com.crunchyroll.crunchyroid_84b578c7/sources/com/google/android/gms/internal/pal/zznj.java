package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zznj extends zzoz {
    final /* synthetic */ zznk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zznj(zznk zznkVar, Class cls) {
        super(cls);
        this.zza = zznkVar;
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ zzaef zza(zzaef zzaefVar) throws GeneralSecurityException {
        zztw zztwVar = (zztw) zzaefVar;
        KeyPair zzc = zzxx.zzc(zzxx.zzk(zznt.zzc(zztwVar.zze().zzf().zzg())));
        ECPoint w = ((ECPublicKey) zzc.getPublic()).getW();
        zzue zzd = zzuf.zzd();
        zzd.zzb(0);
        zzd.zza(zztwVar.zze());
        zzd.zzc(zzaby.zzn(w.getAffineX().toByteArray()));
        zzd.zzd(zzaby.zzn(w.getAffineY().toByteArray()));
        zzub zzc2 = zzuc.zzc();
        zzc2.zzc(0);
        zzc2.zzb((zzuf) zzd.zzan());
        zzc2.zza(zzaby.zzn(((ECPrivateKey) zzc.getPrivate()).getS().toByteArray()));
        return (zzuc) zzc2.zzan();
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* synthetic */ zzaef zzb(zzaby zzabyVar) throws zzadi {
        return zztw.zzd(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final Map zzc() throws GeneralSecurityException {
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
        zzkk zza = zzkl.zza("AES128_GCM");
        bArr = zznk.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zznk.zzh(4, 5, 3, zza, bArr, 1));
        zzkk zza2 = zzkl.zza("AES128_GCM");
        bArr2 = zznk.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zznk.zzh(4, 5, 3, zza2, bArr2, 3));
        zzkk zza3 = zzkl.zza("AES128_GCM");
        bArr3 = zznk.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zznk.zzh(4, 5, 4, zza3, bArr3, 1));
        zzkk zza4 = zzkl.zza("AES128_GCM");
        bArr4 = zznk.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zznk.zzh(4, 5, 4, zza4, bArr4, 3));
        zzkk zza5 = zzkl.zza("AES128_GCM");
        bArr5 = zznk.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zznk.zzh(4, 5, 4, zza5, bArr5, 3));
        zzkk zza6 = zzkl.zza("AES128_CTR_HMAC_SHA256");
        bArr6 = zznk.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zznk.zzh(4, 5, 3, zza6, bArr6, 1));
        zzkk zza7 = zzkl.zza("AES128_CTR_HMAC_SHA256");
        bArr7 = zznk.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zznk.zzh(4, 5, 3, zza7, bArr7, 3));
        zzkk zza8 = zzkl.zza("AES128_CTR_HMAC_SHA256");
        bArr8 = zznk.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zznk.zzh(4, 5, 4, zza8, bArr8, 1));
        zzkk zza9 = zzkl.zza("AES128_CTR_HMAC_SHA256");
        bArr9 = zznk.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zznk.zzh(4, 5, 4, zza9, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* synthetic */ void zzd(zzaef zzaefVar) throws GeneralSecurityException {
        zznt.zza(((zztw) zzaefVar).zze());
    }
}
