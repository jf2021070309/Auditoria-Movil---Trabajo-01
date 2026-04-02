package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.core.view.PointerIconCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcy implements zzahl, zzdq, zzmu, zzhp, zzkh, zzfb {
    private final zzaku zza;
    private final zzain zzb = new zzain();
    private final zzaip zzc = new zzaip();
    private final zzcx zzd = new zzcx(this.zzb);
    private final SparseArray<zzcz> zze = new SparseArray<>();
    private zzalm<zzda> zzf;
    private zzahp zzg;
    private zzalg zzh;
    private boolean zzi;

    public zzcy(zzaku zzakuVar) {
        this.zza = zzakuVar;
        this.zzf = new zzalm<>(zzamq.zzk(), zzakuVar, zzbb.zza);
    }

    private final zzcz zzag() {
        return zzaf(this.zzd.zzc());
    }

    private final zzcz zzah() {
        return zzaf(this.zzd.zzd());
    }

    private final zzcz zzai(int i, zzhf zzhfVar) {
        zzahp zzahpVar = this.zzg;
        if (zzahpVar != null) {
            if (zzhfVar != null) {
                if (this.zzd.zzf(zzhfVar) != null) {
                    return zzaf(zzhfVar);
                }
                return zzZ(zzaiq.zzc, i, zzhfVar);
            }
            zzaiq zzF = zzahpVar.zzF();
            if (i >= zzF.zza()) {
                zzF = zzaiq.zzc;
            }
            return zzZ(zzF, i, null);
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzA(final Exception exc) {
        final zzcz zzah = zzah();
        zzX(zzah, IronSourceError.ERROR_RV_SHOW_EXCEPTION, new zzalj(zzah, exc) { // from class: com.google.android.gms.internal.ads.zzbs
            private final zzcz zza;
            private final Exception zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
                this.zzb = exc;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final void zzB(final int i, final int i2) {
        final zzcz zzah = zzah();
        zzX(zzah, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new zzalj(zzah, i, i2) { // from class: com.google.android.gms.internal.ads.zzbt
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzC(int i, zzhf zzhfVar, final zzgx zzgxVar, final zzhc zzhcVar) {
        final zzcz zzai = zzai(i, zzhfVar);
        zzX(zzai, 1000, new zzalj(zzai, zzgxVar, zzhcVar) { // from class: com.google.android.gms.internal.ads.zzbu
            private final zzcz zza;
            private final zzgx zzb;
            private final zzhc zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzai;
                this.zzb = zzgxVar;
                this.zzc = zzhcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzD(int i, zzhf zzhfVar, final zzgx zzgxVar, final zzhc zzhcVar) {
        final zzcz zzai = zzai(i, zzhfVar);
        zzX(zzai, 1001, new zzalj(zzai, zzgxVar, zzhcVar) { // from class: com.google.android.gms.internal.ads.zzbw
            private final zzcz zza;
            private final zzgx zzb;
            private final zzhc zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzai;
                this.zzb = zzgxVar;
                this.zzc = zzhcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzE(int i, zzhf zzhfVar, final zzgx zzgxVar, final zzhc zzhcVar) {
        final zzcz zzai = zzai(i, zzhfVar);
        zzX(zzai, 1002, new zzalj(zzai, zzgxVar, zzhcVar) { // from class: com.google.android.gms.internal.ads.zzbx
            private final zzcz zza;
            private final zzgx zzb;
            private final zzhc zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzai;
                this.zzb = zzgxVar;
                this.zzc = zzhcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzF(int i, zzhf zzhfVar, final zzgx zzgxVar, final zzhc zzhcVar, final IOException iOException, final boolean z) {
        final zzcz zzai = zzai(i, zzhfVar);
        zzX(zzai, 1003, new zzalj(zzai, zzgxVar, zzhcVar, iOException, z) { // from class: com.google.android.gms.internal.ads.zzby
            private final zzcz zza;
            private final zzgx zzb;
            private final zzhc zzc;
            private final IOException zzd;
            private final boolean zze;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzai;
                this.zzb = zzgxVar;
                this.zzc = zzhcVar;
                this.zzd = iOException;
                this.zze = z;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                ((zzda) obj).zzg(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzG(int i, zzhf zzhfVar, final zzhc zzhcVar) {
        final zzcz zzai = zzai(i, zzhfVar);
        zzX(zzai, 1004, new zzalj(zzai, zzhcVar) { // from class: com.google.android.gms.internal.ads.zzbz
            private final zzcz zza;
            private final zzhc zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzai;
                this.zzb = zzhcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzI(final zzagk zzagkVar, final int i) {
        final zzcz zzY = zzY();
        zzX(zzY, 1, new zzalj(zzY, zzagkVar, i) { // from class: com.google.android.gms.internal.ads.zzcb
            private final zzcz zza;
            private final zzagk zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzY;
                this.zzb = zzagkVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzJ(final zzs zzsVar, final zzt zztVar) {
        final zzcz zzY = zzY();
        zzX(zzY, 2, new zzalj(zzY, zzsVar, zztVar) { // from class: com.google.android.gms.internal.ads.zzcc
            private final zzcz zza;
            private final zzs zzb;
            private final zzt zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzY;
                this.zzb = zzsVar;
                this.zzc = zztVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzK(final boolean z) {
        final zzcz zzY = zzY();
        zzX(zzY, 3, new zzalj(zzY, z) { // from class: com.google.android.gms.internal.ads.zzcd
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzL(final zzahi zzahiVar) {
        final zzcz zzY = zzY();
        zzX(zzY, 13, new zzalj(zzY, zzahiVar) { // from class: com.google.android.gms.internal.ads.zzce
            private final zzcz zza;
            private final zzahi zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzY;
                this.zzb = zzahiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzM(final boolean z, final int i) {
        final zzcz zzY = zzY();
        zzX(zzY, -1, new zzalj(zzY, z, i) { // from class: com.google.android.gms.internal.ads.zzcg
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzN(final int i) {
        final zzcz zzY = zzY();
        zzX(zzY, 4, new zzalj(zzY, i) { // from class: com.google.android.gms.internal.ads.zzch
            private final zzcz zza;
            private final int zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzY;
                this.zzb = i;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                ((zzda) obj).zze(this.zza, this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzO(final boolean z, final int i) {
        final zzcz zzY = zzY();
        zzX(zzY, 5, new zzalj(zzY, z, i) { // from class: com.google.android.gms.internal.ads.zzci
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzP(final int i) {
        final zzcz zzY = zzY();
        zzX(zzY, 6, new zzalj(zzY, i) { // from class: com.google.android.gms.internal.ads.zzcj
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzQ(final boolean z) {
        final zzcz zzY = zzY();
        zzX(zzY, 7, new zzalj(zzY, z) { // from class: com.google.android.gms.internal.ads.zzck
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzR(final zzahc zzahcVar) {
        zzo zzoVar;
        final zzcz zzczVar = null;
        if ((zzahcVar instanceof zzaeg) && (zzoVar = ((zzaeg) zzahcVar).zzf) != null) {
            zzczVar = zzaf(new zzhf(zzoVar));
        }
        if (zzczVar == null) {
            zzczVar = zzY();
        }
        zzX(zzczVar, 10, new zzalj(zzczVar, zzahcVar) { // from class: com.google.android.gms.internal.ads.zzcl
            private final zzcz zza;
            private final zzahc zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzczVar;
                this.zzb = zzahcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                ((zzda) obj).zzf(this.zza, this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzT(final zzahf zzahfVar) {
        final zzcz zzY = zzY();
        zzX(zzY, 12, new zzalj(zzY, zzahfVar) { // from class: com.google.android.gms.internal.ads.zzcn
            private final zzcz zza;
            private final zzahf zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzY;
                this.zzb = zzahfVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzU(final zzago zzagoVar) {
        final zzcz zzY = zzY();
        zzX(zzY, 14, new zzalj(zzY, zzagoVar) { // from class: com.google.android.gms.internal.ads.zzcp
            private final zzcz zza;
            private final zzago zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzY;
                this.zzb = zzagoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzV() {
        final zzcz zzY = zzY();
        zzX(zzY, -1, new zzalj(zzY) { // from class: com.google.android.gms.internal.ads.zzcq
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void zzW(final int i, final long j, final long j2) {
        final zzcz zzaf = zzaf(this.zzd.zze());
        zzX(zzaf, 1006, new zzalj(zzaf, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzcr
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzaf;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    protected final void zzX(zzcz zzczVar, int i, zzalj<zzda> zzaljVar) {
        this.zze.put(i, zzczVar);
        zzalm<zzda> zzalmVar = this.zzf;
        zzalmVar.zzd(i, zzaljVar);
        zzalmVar.zze();
    }

    protected final zzcz zzY() {
        return zzaf(this.zzd.zzb());
    }

    @RequiresNonNull({"player"})
    protected final zzcz zzZ(zzaiq zzaiqVar, int i, zzhf zzhfVar) {
        boolean z = true;
        zzhf zzhfVar2 = true == zzaiqVar.zzt() ? null : zzhfVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!zzaiqVar.equals(this.zzg.zzF()) || i != this.zzg.zzv()) {
            z = false;
        }
        long j = 0;
        if (zzhfVar2 == null || !zzhfVar2.zzb()) {
            if (z) {
                j = this.zzg.zzD();
            } else if (!zzaiqVar.zzt()) {
                long j2 = zzaiqVar.zzf(i, this.zzc, 0L).zzl;
                j = zzadx.zza(0L);
            }
        } else if (z && this.zzg.zzB() == zzhfVar2.zzb && this.zzg.zzC() == zzhfVar2.zzc) {
            j = this.zzg.zzx();
        }
        return new zzcz(elapsedRealtime, zzaiqVar, i, zzhfVar2, j, this.zzg.zzF(), this.zzg.zzv(), this.zzd.zzb(), this.zzg.zzx(), this.zzg.zzz());
    }

    public final void zza(zzda zzdaVar) {
        this.zzf.zzb(zzdaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaa() {
        this.zzf.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzab(zzahp zzahpVar, zzda zzdaVar, zzale zzaleVar) {
        SparseArray<zzcz> sparseArray = this.zze;
        SparseArray sparseArray2 = new SparseArray(zzaleVar.zza());
        for (int i = 0; i < zzaleVar.zza(); i++) {
            int zzb = zzaleVar.zzb(i);
            zzcz zzczVar = sparseArray.get(zzb);
            if (zzczVar == null) {
                throw null;
            }
            sparseArray2.append(zzb, zzczVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final void zzac(zzaee zzaeeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final void zzad(int i, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final void zzae() {
    }

    public final void zzb(zzda zzdaVar) {
        this.zzf.zzc(zzdaVar);
    }

    public final void zzc(final zzahp zzahpVar, Looper looper) {
        zzfoj zzfojVar;
        boolean z = true;
        if (this.zzg != null) {
            zzfojVar = this.zzd.zzb;
            if (!zzfojVar.isEmpty()) {
                z = false;
            }
        }
        zzakt.zzd(z);
        this.zzg = zzahpVar;
        this.zzh = this.zza.zza(looper, null);
        this.zzf = this.zzf.zza(looper, new zzalk(this, zzahpVar) { // from class: com.google.android.gms.internal.ads.zzbk
            private final zzcy zza;
            private final zzahp zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzahpVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalk
            public final void zza(Object obj, zzale zzaleVar) {
                this.zza.zzab(this.zzb, (zzda) obj, zzaleVar);
            }
        });
    }

    public final void zzd() {
        final zzcz zzY = zzY();
        this.zze.put(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, zzY);
        zzX(zzY, IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, new zzalj(zzY) { // from class: com.google.android.gms.internal.ads.zzbv
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
        zzalg zzalgVar = this.zzh;
        zzakt.zze(zzalgVar);
        zzalgVar.zzj(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcf
            private final zzcy zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaa();
            }
        });
    }

    public final void zzf() {
        if (this.zzi) {
            return;
        }
        final zzcz zzY = zzY();
        this.zzi = true;
        zzX(zzY, -1, new zzalj(zzY) { // from class: com.google.android.gms.internal.ads.zzco
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzY;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzg(final zzaz zzazVar) {
        final zzcz zzah = zzah();
        zzX(zzah, 1008, new zzalj(zzah, zzazVar) { // from class: com.google.android.gms.internal.ads.zzcs
            private final zzcz zza;
            private final zzaz zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
                this.zzb = zzazVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzh(final String str, final long j, final long j2) {
        final zzcz zzah = zzah();
        zzX(zzah, PointerIconCompat.TYPE_VERTICAL_TEXT, new zzalj(zzah, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzct
            private final zzcz zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
                this.zzb = str;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzi(final zzafv zzafvVar, final zzba zzbaVar) {
        final zzcz zzah = zzah();
        zzX(zzah, 1010, new zzalj(zzah, zzafvVar, zzbaVar) { // from class: com.google.android.gms.internal.ads.zzcu
            private final zzcz zza;
            private final zzafv zzb;
            private final zzba zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
                this.zzb = zzafvVar;
                this.zzc = zzbaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                ((zzda) obj).zzh(this.zza, this.zzb, this.zzc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzj(final long j) {
        final zzcz zzah = zzah();
        zzX(zzah, 1011, new zzalj(zzah, j) { // from class: com.google.android.gms.internal.ads.zzcv
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzk(final int i, final long j, final long j2) {
        final zzcz zzah = zzah();
        zzX(zzah, PointerIconCompat.TYPE_NO_DROP, new zzalj(zzah, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzcw
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzl(final String str) {
        final zzcz zzah = zzah();
        zzX(zzah, PointerIconCompat.TYPE_ALL_SCROLL, new zzalj(zzah, str) { // from class: com.google.android.gms.internal.ads.zzbc
            private final zzcz zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
                this.zzb = str;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzm(final zzaz zzazVar) {
        final zzcz zzag = zzag();
        zzX(zzag, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, new zzalj(zzag, zzazVar) { // from class: com.google.android.gms.internal.ads.zzbd
            private final zzcz zza;
            private final zzaz zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzag;
                this.zzb = zzazVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahl, com.google.android.gms.internal.ads.zzdq
    public final void zzn(final boolean z) {
        final zzcz zzah = zzah();
        zzX(zzah, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, new zzalj(zzah, z) { // from class: com.google.android.gms.internal.ads.zzbe
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzo(final Exception exc) {
        final zzcz zzah = zzah();
        zzX(zzah, PointerIconCompat.TYPE_ZOOM_IN, new zzalj(zzah, exc) { // from class: com.google.android.gms.internal.ads.zzbf
            private final zzcz zza;
            private final Exception zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
                this.zzb = exc;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdq
    public final void zzp(final Exception exc) {
        final zzcz zzah = zzah();
        zzX(zzah, IronSourceError.ERROR_IS_LOAD_DURING_SHOW, new zzalj(zzah, exc) { // from class: com.google.android.gms.internal.ads.zzbg
            private final zzcz zza;
            private final Exception zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
                this.zzb = exc;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final void zzq(final float f) {
        final zzcz zzah = zzah();
        zzX(zzah, PointerIconCompat.TYPE_ZOOM_OUT, new zzalj(zzah, f) { // from class: com.google.android.gms.internal.ads.zzbh
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzr(final zzaz zzazVar) {
        final zzcz zzah = zzah();
        zzX(zzah, 1020, new zzalj(zzah, zzazVar) { // from class: com.google.android.gms.internal.ads.zzbi
            private final zzcz zza;
            private final zzaz zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
                this.zzb = zzazVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzs(final String str, final long j, final long j2) {
        final zzcz zzah = zzah();
        zzX(zzah, 1021, new zzalj(zzah, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzbj
            private final zzcz zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
                this.zzb = str;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzt(final zzafv zzafvVar, final zzba zzbaVar) {
        final zzcz zzah = zzah();
        zzX(zzah, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, new zzalj(zzah, zzafvVar, zzbaVar) { // from class: com.google.android.gms.internal.ads.zzbl
            private final zzcz zza;
            private final zzafv zzb;
            private final zzba zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
                this.zzb = zzafvVar;
                this.zzc = zzbaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                ((zzda) obj).zzi(this.zza, this.zzb, this.zzc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzu(final int i, final long j) {
        final zzcz zzag = zzag();
        zzX(zzag, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, new zzalj(zzag, i, j) { // from class: com.google.android.gms.internal.ads.zzbm
            private final zzcz zza;
            private final int zzb;
            private final long zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzag;
                this.zzb = i;
                this.zzc = j;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                ((zzda) obj).zzj(this.zza, this.zzb, this.zzc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzv(final String str) {
        final zzcz zzah = zzah();
        zzX(zzah, 1024, new zzalj(zzah, str) { // from class: com.google.android.gms.internal.ads.zzbn
            private final zzcz zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
                this.zzb = str;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzw(final zzaz zzazVar) {
        final zzcz zzag = zzag();
        zzX(zzag, 1025, new zzalj(zzag, zzazVar) { // from class: com.google.android.gms.internal.ads.zzbo
            private final zzcz zza;
            private final zzaz zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzag;
                this.zzb = zzazVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzahl, com.google.android.gms.internal.ads.zzmu
    public final void zzx(final zzy zzyVar) {
        final zzcz zzah = zzah();
        zzX(zzah, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new zzalj(zzah, zzyVar) { // from class: com.google.android.gms.internal.ads.zzbp
            private final zzcz zza;
            private final zzy zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
                this.zzb = zzyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzcz zzczVar = this.zza;
                zzy zzyVar2 = this.zzb;
                ((zzda) obj).zzl(zzczVar, zzyVar2);
                int i = zzyVar2.zzb;
                int i2 = zzyVar2.zzc;
                int i3 = zzyVar2.zzd;
                float f = zzyVar2.zze;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzy(final Object obj, final long j) {
        final zzcz zzah = zzah();
        zzX(zzah, IronSourceError.ERROR_RV_LOAD_DURING_SHOW, new zzalj(zzah, obj, j) { // from class: com.google.android.gms.internal.ads.zzbq
            private final zzcz zza;
            private final Object zzb;
            private final long zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzah;
                this.zzb = obj;
                this.zzc = j;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj2) {
                ((zzda) obj2).zzk(this.zza, this.zzb, this.zzc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzz(final long j, final int i) {
        final zzcz zzag = zzag();
        zzX(zzag, IronSourceError.ERROR_RV_LOAD_DURING_LOAD, new zzalj(zzag, j, i) { // from class: com.google.android.gms.internal.ads.zzbr
            private final zzcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzag;
            }

            @Override // com.google.android.gms.internal.ads.zzalj
            public final void zza(Object obj) {
                zzda zzdaVar = (zzda) obj;
            }
        });
    }

    private final zzcz zzaf(zzhf zzhfVar) {
        if (this.zzg != null) {
            zzaiq zzf = zzhfVar == null ? null : this.zzd.zzf(zzhfVar);
            if (zzhfVar == null || zzf == null) {
                int zzv = this.zzg.zzv();
                zzaiq zzF = this.zzg.zzF();
                if (zzv >= zzF.zza()) {
                    zzF = zzaiq.zzc;
                }
                return zzZ(zzF, zzv, null);
            }
            return zzZ(zzf, zzf.zzy(zzhfVar.zza, this.zzb).zzc, zzhfVar);
        }
        throw null;
    }

    public final void zze(List<zzhf> list, zzhf zzhfVar) {
        zzcx zzcxVar = this.zzd;
        zzahp zzahpVar = this.zzg;
        if (zzahpVar != null) {
            zzcxVar.zzi(list, zzhfVar, zzahpVar);
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzH(zzaiq zzaiqVar, final int i) {
        zzcx zzcxVar = this.zzd;
        zzahp zzahpVar = this.zzg;
        if (zzahpVar != null) {
            zzcxVar.zzh(zzahpVar);
            final zzcz zzY = zzY();
            zzX(zzY, 0, new zzalj(zzY, i) { // from class: com.google.android.gms.internal.ads.zzca
                private final zzcz zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzY;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj) {
                    zzda zzdaVar = (zzda) obj;
                }
            });
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzahj
    public final void zzS(final zzaho zzahoVar, final zzaho zzahoVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzcx zzcxVar = this.zzd;
        zzahp zzahpVar = this.zzg;
        if (zzahpVar != null) {
            zzcxVar.zzg(zzahpVar);
            final zzcz zzY = zzY();
            zzX(zzY, 11, new zzalj(zzY, i, zzahoVar, zzahoVar2) { // from class: com.google.android.gms.internal.ads.zzcm
                private final zzcz zza;
                private final zzaho zzb;
                private final zzaho zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzY;
                    this.zzb = zzahoVar;
                    this.zzc = zzahoVar2;
                }

                @Override // com.google.android.gms.internal.ads.zzalj
                public final void zza(Object obj) {
                    zzda zzdaVar = (zzda) obj;
                }
            });
            return;
        }
        throw null;
    }
}
