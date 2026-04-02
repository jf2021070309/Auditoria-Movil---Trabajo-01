package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzkx extends zzag {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzkx() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i, int i2) throws zzkw {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzc;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i3 = zzamq.zza;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.zzc -= read;
                zzd(read);
            }
            return read;
        } catch (IOException e) {
            throw new zzkw(e, 2000);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (r1 != false) goto L33;
     */
    @Override // com.google.android.gms.internal.ads.zzaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzh(com.google.android.gms.internal.ads.zzan r10) throws com.google.android.gms.internal.ads.zzkw {
        /*
            r9 = this;
            android.net.Uri r0 = r10.zza
            r9.zzb = r0
            r9.zzb(r10)
            r1 = 1
            r2 = 2000(0x7d0, float:2.803E-42)
            r3 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            java.lang.String r5 = r0.getPath()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            r6 = 0
            if (r5 == 0) goto L51
            java.lang.String r7 = "r"
            r4.<init>(r5, r7)     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            r9.zza = r4
            long r7 = r10.zzf     // Catch: java.io.IOException -> L4a
            r4.seek(r7)     // Catch: java.io.IOException -> L4a
            long r3 = r10.zzg     // Catch: java.io.IOException -> L4a
            r7 = -1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L32
            java.io.RandomAccessFile r0 = r9.zza     // Catch: java.io.IOException -> L4a
            long r3 = r0.length()     // Catch: java.io.IOException -> L4a
            long r7 = r10.zzf     // Catch: java.io.IOException -> L4a
            long r3 = r3 - r7
        L32:
            r9.zzc = r3     // Catch: java.io.IOException -> L4a
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L42
            r9.zzd = r1
            r9.zzc(r10)
            long r0 = r9.zzc
            return r0
        L42:
            com.google.android.gms.internal.ads.zzkw r10 = new com.google.android.gms.internal.ads.zzkw
            r0 = 2008(0x7d8, float:2.814E-42)
            r10.<init>(r6, r6, r0)
            throw r10
        L4a:
            r10 = move-exception
            com.google.android.gms.internal.ads.zzkw r0 = new com.google.android.gms.internal.ads.zzkw
            r0.<init>(r10, r2)
            throw r0
        L51:
            throw r6     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
        L52:
            r10 = move-exception
            com.google.android.gms.internal.ads.zzkw r0 = new com.google.android.gms.internal.ads.zzkw
            r0.<init>(r10, r2)
            throw r0
        L59:
            r10 = move-exception
            com.google.android.gms.internal.ads.zzkw r0 = new com.google.android.gms.internal.ads.zzkw
            r0.<init>(r10, r3)
            throw r0
        L60:
            r10 = move-exception
            java.lang.String r2 = r0.getQuery()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L8f
            java.lang.String r2 = r0.getFragment()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L8f
            com.google.android.gms.internal.ads.zzkw r0 = new com.google.android.gms.internal.ads.zzkw
            int r1 = com.google.android.gms.internal.ads.zzamq.zza
            r2 = 21
            r4 = 2005(0x7d5, float:2.81E-42)
            if (r1 < r2) goto L8a
            java.lang.Throwable r1 = r10.getCause()
            boolean r1 = com.google.android.gms.internal.ads.zzkv.zza(r1)
            if (r1 == 0) goto L8a
            goto L8b
        L8a:
            r3 = r4
        L8b:
            r0.<init>(r10, r3)
            throw r0
        L8f:
            com.google.android.gms.internal.ads.zzkw r2 = new com.google.android.gms.internal.ads.zzkw
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.String r5 = r0.getPath()
            r3[r4] = r5
            java.lang.String r4 = r0.getQuery()
            r3[r1] = r4
            r1 = 2
            java.lang.String r0 = r0.getFragment()
            r3[r1] = r0
            java.lang.String r0 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1 = 1004(0x3ec, float:1.407E-42)
            r2.<init>(r0, r10, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkx.zzh(com.google.android.gms.internal.ads.zzan):long");
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() throws zzkw {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zze();
                }
            } catch (IOException e) {
                throw new zzkw(e, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zze();
            }
            throw th;
        }
    }
}
