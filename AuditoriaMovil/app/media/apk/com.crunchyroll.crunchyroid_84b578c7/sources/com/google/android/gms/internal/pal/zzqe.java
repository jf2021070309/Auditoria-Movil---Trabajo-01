package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzqe extends zzqt {
    private final zzqj zza;
    private final zzyw zzb;
    private final Integer zzc;

    private zzqe(zzqj zzqjVar, zzyw zzywVar, Integer num) {
        this.zza = zzqjVar;
        this.zzb = zzywVar;
        this.zzc = num;
    }

    public static zzqe zzb(zzqj zzqjVar, zzyw zzywVar, Integer num) throws GeneralSecurityException {
        if (zzywVar.zza() == 32) {
            if (zzqjVar.zzc() && num == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
            }
            if (!zzqjVar.zzc() && num != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
            }
            return new zzqe(zzqjVar, zzywVar, num);
        }
        throw new GeneralSecurityException("Invalid key size");
    }

    @Override // com.google.android.gms.internal.pal.zzqt, com.google.android.gms.internal.pal.zzka
    public final /* synthetic */ zzks zza() {
        return this.zza;
    }
}
