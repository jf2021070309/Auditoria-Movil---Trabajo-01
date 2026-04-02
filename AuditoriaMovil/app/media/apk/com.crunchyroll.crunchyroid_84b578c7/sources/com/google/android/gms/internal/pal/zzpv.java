package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzpv {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzpv() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzpv zza(zzou zzouVar) throws GeneralSecurityException {
        zzpx zzpxVar = new zzpx(zzouVar.zzd(), zzouVar.zzc(), null);
        if (this.zzb.containsKey(zzpxVar)) {
            zzou zzouVar2 = (zzou) this.zzb.get(zzpxVar);
            if (!zzouVar2.equals(zzouVar) || !zzouVar.equals(zzouVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzpxVar.toString()));
            }
        } else {
            this.zzb.put(zzpxVar, zzouVar);
        }
        return this;
    }

    public final zzpv zzb(zzox zzoxVar) throws GeneralSecurityException {
        zzpz zzpzVar = new zzpz(zzoxVar.zza(), zzoxVar.zzb(), null);
        if (this.zza.containsKey(zzpzVar)) {
            zzox zzoxVar2 = (zzox) this.zza.get(zzpzVar);
            if (!zzoxVar2.equals(zzoxVar) || !zzoxVar.equals(zzoxVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzpzVar.toString()));
            }
        } else {
            this.zza.put(zzpzVar, zzoxVar);
        }
        return this;
    }

    public final zzpv zzc(zzpm zzpmVar) throws GeneralSecurityException {
        zzpx zzpxVar = new zzpx(zzpmVar.zzb(), zzpmVar.zza(), null);
        if (this.zzd.containsKey(zzpxVar)) {
            zzpm zzpmVar2 = (zzpm) this.zzd.get(zzpxVar);
            if (!zzpmVar2.equals(zzpmVar) || !zzpmVar.equals(zzpmVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzpxVar.toString()));
            }
        } else {
            this.zzd.put(zzpxVar, zzpmVar);
        }
        return this;
    }

    public final zzpv zzd(zzpp zzppVar) throws GeneralSecurityException {
        zzpz zzpzVar = new zzpz(zzppVar.zza(), zzppVar.zzb(), null);
        if (this.zzc.containsKey(zzpzVar)) {
            zzpp zzppVar2 = (zzpp) this.zzc.get(zzpzVar);
            if (!zzppVar2.equals(zzppVar) || !zzppVar.equals(zzppVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzpzVar.toString()));
            }
        } else {
            this.zzc.put(zzpzVar, zzppVar);
        }
        return this;
    }

    public zzpv(zzqb zzqbVar) {
        this.zza = new HashMap(zzqb.zzc(zzqbVar));
        this.zzb = new HashMap(zzqb.zzb(zzqbVar));
        this.zzc = new HashMap(zzqb.zze(zzqbVar));
        this.zzd = new HashMap(zzqb.zzd(zzqbVar));
    }
}
