package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzpj {
    private static final zzpj zza = new zzpj();
    private final AtomicReference zzb = new AtomicReference(new zzqb(new zzpv(), null));

    public static zzpj zzb() {
        return zza;
    }

    public final zzka zza(zzps zzpsVar, zzlg zzlgVar) {
        try {
            try {
                return ((zzqb) this.zzb.get()).zza(zzpsVar, zzlgVar);
            } catch (GeneralSecurityException e) {
                throw new zzqc("Creating a LegacyProtoKey failed", e);
            }
        } catch (GeneralSecurityException unused) {
            return new zzpc(zzpsVar, zzlgVar);
        }
    }

    public final synchronized void zzc(zzou zzouVar) throws GeneralSecurityException {
        zzpv zzpvVar = new zzpv((zzqb) this.zzb.get());
        zzpvVar.zza(zzouVar);
        this.zzb.set(new zzqb(zzpvVar, null));
    }

    public final synchronized void zzd(zzox zzoxVar) throws GeneralSecurityException {
        zzpv zzpvVar = new zzpv((zzqb) this.zzb.get());
        zzpvVar.zzb(zzoxVar);
        this.zzb.set(new zzqb(zzpvVar, null));
    }

    public final synchronized void zze(zzpm zzpmVar) throws GeneralSecurityException {
        zzpv zzpvVar = new zzpv((zzqb) this.zzb.get());
        zzpvVar.zzc(zzpmVar);
        this.zzb.set(new zzqb(zzpvVar, null));
    }

    public final synchronized void zzf(zzpp zzppVar) throws GeneralSecurityException {
        zzpv zzpvVar = new zzpv((zzqb) this.zzb.get());
        zzpvVar.zzd(zzppVar);
        this.zzb.set(new zzqb(zzpvVar, null));
    }
}
