package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcjx implements zzatz {
    private final zzauo<zzatz> zza;
    private final Context zzb;
    private final zzatz zzc;
    private final zzcjw zzd;
    private final String zze;
    private final int zzf;
    private InputStream zzh;
    private boolean zzi;
    private Uri zzj;
    private volatile zzayn zzk;
    private boolean zzl = false;
    private boolean zzm = false;
    private boolean zzn = false;
    private boolean zzo = false;
    private long zzp = 0;
    private final AtomicLong zzr = new AtomicLong(-1);
    private zzfsm<Long> zzq = null;
    private final boolean zzg = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue();

    public zzcjx(Context context, zzatz zzatzVar, String str, int i, zzauo<zzatz> zzauoVar, zzcjw zzcjwVar) {
        this.zzb = context;
        this.zzc = zzatzVar;
        this.zza = zzauoVar;
        this.zzd = zzcjwVar;
        this.zze = str;
        this.zzf = i;
    }

    private final void zzl(zzaub zzaubVar) {
        zzauo<zzatz> zzauoVar = this.zza;
        if (zzauoVar != null) {
            ((zzcki) zzauoVar).zzj(this, zzaubVar);
        }
    }

    private final boolean zzm() {
        if (this.zzg) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzcL)).booleanValue() || this.zzn) {
                return ((Boolean) zzbet.zzc().zzc(zzbjl.zzcM)).booleanValue() && !this.zzo;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzatz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zza(com.google.android.gms.internal.ads.zzaub r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjx.zza(com.google.android.gms.internal.ads.zzaub):long");
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final int zzb(byte[] bArr, int i, int i2) throws IOException {
        int zzb;
        zzauo<zzatz> zzauoVar;
        if (!this.zzi) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzh;
        if (inputStream != null) {
            zzb = inputStream.read(bArr, i, i2);
        } else {
            zzb = this.zzc.zzb(bArr, i, i2);
        }
        if ((!this.zzg || this.zzh != null) && (zzauoVar = this.zza) != null) {
            ((zzcki) zzauoVar).zzS(this, zzb);
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final Uri zzc() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final void zzd() throws IOException {
        if (!this.zzi) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzi = false;
        this.zzj = null;
        InputStream inputStream = this.zzh;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzh = null;
            return;
        }
        this.zzc.zzd();
    }

    public final boolean zze() {
        return this.zzl;
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        return this.zzn;
    }

    public final boolean zzh() {
        return this.zzo;
    }

    public final long zzi() {
        return this.zzp;
    }

    public final long zzj() {
        if (this.zzk == null) {
            return -1L;
        }
        if (this.zzr.get() != -1) {
            return this.zzr.get();
        }
        synchronized (this) {
            if (this.zzq == null) {
                this.zzq = zzchg.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcjv
                    private final zzcjx zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzk();
                    }
                });
            }
        }
        if (this.zzq.isDone()) {
            try {
                this.zzr.compareAndSet(-1L, this.zzq.get().longValue());
                return this.zzr.get();
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Long zzk() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzg(this.zzk));
    }
}
