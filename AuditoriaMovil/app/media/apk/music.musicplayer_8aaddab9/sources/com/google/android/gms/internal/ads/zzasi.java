package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzasi implements zzaul {
    public final /* synthetic */ zzasl zza;
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
        Objects.requireNonNull(uri);
        this.zzb = uri;
        Objects.requireNonNull(zzatzVar);
        this.zzc = zzatzVar;
        Objects.requireNonNull(zzasjVar);
        this.zzd = zzasjVar;
        this.zze = zzaurVar;
        this.zzf = new zzapt();
        this.zzh = true;
        this.zzj = -1L;
    }

    public final void zzb(long j2, long j3) {
        this.zzf.zza = j2;
        this.zzi = j3;
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
        long j2;
        while (!this.zzg) {
            int i2 = 0;
            try {
                long j3 = this.zzf.zza;
                long zza = this.zzc.zza(new zzaub(this.zzb, null, j3, j3, -1L, null, 0));
                this.zzj = zza;
                if (zza != -1) {
                    j2 = j3;
                    zza += j2;
                    this.zzj = zza;
                } else {
                    j2 = j3;
                }
                zzapnVar = new zzapn(this.zzc, j2, zza);
                try {
                    zzapo zzb = this.zzd.zzb(zzapnVar, this.zzc.zzc());
                    if (this.zzh) {
                        zzb.zze(j2, this.zzi);
                        this.zzh = false;
                    }
                    long j4 = j2;
                    int i3 = 0;
                    while (true) {
                        if (i3 != 0) {
                            break;
                        }
                        try {
                            if (this.zzg) {
                                i3 = 0;
                                break;
                            }
                            this.zze.zzc();
                            i3 = zzb.zzg(zzapnVar, this.zzf);
                            if (zzapnVar.zzh() > zzasl.zze(this.zza) + j4) {
                                j4 = zzapnVar.zzh();
                                this.zze.zzb();
                                zzasl.zzg(this.zza).post(zzasl.zzf(this.zza));
                            }
                        } catch (Throwable th) {
                            th = th;
                            i2 = i3;
                            if (i2 != 1 && zzapnVar != null) {
                                this.zzf.zza = zzapnVar.zzh();
                            }
                            zzave.zzc(this.zzc);
                            throw th;
                        }
                    }
                    if (i3 != 1) {
                        this.zzf.zza = zzapnVar.zzh();
                        i2 = i3;
                    }
                    zzave.zzc(this.zzc);
                    if (i2 != 0) {
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
