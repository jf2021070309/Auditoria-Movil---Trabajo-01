package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class zzclp extends zzag {
    private final Context zza;
    private final zzaj zzb;
    private final zzclo zzc;
    private final String zzd;
    private final int zze;
    private final boolean zzf;
    private InputStream zzg;
    private boolean zzh;
    private Uri zzi;
    private volatile zzayn zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private long zzo;
    private zzfsm<Long> zzp;
    private final AtomicLong zzq;

    public zzclp(Context context, zzaj zzajVar, String str, int i2, zzay zzayVar, zzclo zzcloVar) {
        super(false);
        this.zza = context;
        this.zzb = zzajVar;
        this.zzc = zzcloVar;
        this.zzd = str;
        this.zze = i2;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0L;
        this.zzq = new AtomicLong(-1L);
        this.zzp = null;
        this.zzf = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue();
        zza(zzayVar);
    }

    private final boolean zzr() {
        if (this.zzf) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzcL)).booleanValue() || this.zzm) {
                return ((Boolean) zzbet.zzc().zzc(zzbjl.zzcM)).booleanValue() && !this.zzn;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i2, int i3) throws IOException {
        if (this.zzh) {
            InputStream inputStream = this.zzg;
            int read = inputStream != null ? inputStream.read(bArr, i2, i3) : this.zzb.zzg(bArr, i2, i3);
            if (!this.zzf || this.zzg != null) {
                zzd(read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzh(com.google.android.gms.internal.ads.zzan r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclp.zzh(com.google.android.gms.internal.ads.zzan):long");
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        boolean z = false;
        this.zzh = false;
        this.zzi = null;
        z = (this.zzf && this.zzg == null) ? true : true;
        InputStream inputStream = this.zzg;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzg = null;
        } else {
            this.zzb.zzj();
        }
        if (z) {
            zze();
        }
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final boolean zzl() {
        return this.zzl;
    }

    public final boolean zzm() {
        return this.zzm;
    }

    public final boolean zzn() {
        return this.zzn;
    }

    public final long zzo() {
        return this.zzo;
    }

    public final long zzp() {
        if (this.zzj == null) {
            return -1L;
        }
        if (this.zzq.get() != -1) {
            return this.zzq.get();
        }
        synchronized (this) {
            if (this.zzp == null) {
                this.zzp = zzchg.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcln
                    private final zzclp zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzq();
                    }
                });
            }
        }
        if (this.zzp.isDone()) {
            try {
                this.zzq.compareAndSet(-1L, this.zzp.get().longValue());
                return this.zzq.get();
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public final /* synthetic */ Long zzq() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzg(this.zzj));
    }
}
