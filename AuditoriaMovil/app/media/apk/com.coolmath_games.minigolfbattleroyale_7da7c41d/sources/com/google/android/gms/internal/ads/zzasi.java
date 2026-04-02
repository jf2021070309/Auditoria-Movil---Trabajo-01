package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzasi implements zzaul {
    final /* synthetic */ zzasl zza;
    private final Uri zzb;
    private final zzatz zzc;
    private final zzasj zzd;
    private final zzaur zze;
    private final zzapt zzf;
    private volatile boolean zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;

    public zzasi(zzasl zzaslVar, Uri uri, zzatz zzatzVar, zzasj zzasjVar, zzaur zzaurVar) {
        this.zza = zzaslVar;
        if (uri == null) {
            throw null;
        }
        this.zzb = uri;
        if (zzatzVar == null) {
            throw null;
        }
        this.zzc = zzatzVar;
        if (zzasjVar == null) {
            throw null;
        }
        this.zzd = zzasjVar;
        this.zze = zzaurVar;
        this.zzf = new zzapt();
        this.zzh = true;
        this.zzj = -1L;
    }

    public final void zzb(long j, long j2) {
        this.zzf.zza = j;
        this.zzi = j2;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zzc() {
        this.zzg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final boolean zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zze() throws IOException, InterruptedException {
        zzapn zzapnVar;
        long j;
        while (!this.zzg) {
            int i = 0;
            try {
                long j2 = this.zzf.zza;
                long zza = this.zzc.zza(new zzaub(this.zzb, null, j2, j2, -1L, null, 0));
                this.zzj = zza;
                if (zza != -1) {
                    j = j2;
                    zza += j;
                    this.zzj = zza;
                } else {
                    j = j2;
                }
                zzapnVar = new zzapn(this.zzc, j, zza);
                try {
                    zzapo zzb = this.zzd.zzb(zzapnVar, this.zzc.zzc());
                    if (this.zzh) {
                        zzb.zze(j, this.zzi);
                        this.zzh = false;
                    }
                    int i2 = 0;
                    long j3 = j;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.zzg) {
                                i2 = 0;
                                break;
                            }
                            this.zze.zzc();
                            i2 = zzb.zzg(zzapnVar, this.zzf);
                            if (zzapnVar.zzh() > zzasl.zze(this.zza) + j3) {
                                j3 = zzapnVar.zzh();
                                this.zze.zzb();
                                zzasl.zzg(this.zza).post(zzasl.zzf(this.zza));
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            if (i != 1 && zzapnVar != null) {
                                this.zzf.zza = zzapnVar.zzh();
                            }
                            zzave.zzc(this.zzc);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.zzf.zza = zzapnVar.zzh();
                        i = i2;
                    }
                    zzave.zzc(this.zzc);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                zzapnVar = null;
            }
        }
    }
}
