package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class zzlj extends zzag {
    private final Resources zza;
    private final String zzb;
    private Uri zzc;
    private AssetFileDescriptor zzd;
    private InputStream zze;
    private long zzf;
    private boolean zzg;

    public zzlj(Context context) {
        super(false);
        this.zza = context.getResources();
        this.zzb = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i2) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i2);
        return Uri.parse(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i2, int i3) throws zzli {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.zzf;
        if (j2 != 0) {
            if (j2 != -1) {
                try {
                    i3 = (int) Math.min(j2, i3);
                } catch (IOException e2) {
                    throw new zzli(null, e2, 2000);
                }
            }
            InputStream inputStream = this.zze;
            int i4 = zzamq.zza;
            int read = inputStream.read(bArr, i2, i3);
            if (read == -1) {
                if (this.zzf == -1) {
                    return -1;
                }
                throw new zzli("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            long j3 = this.zzf;
            if (j3 != -1) {
                this.zzf = j3 - read;
            }
            zzd(read);
            return read;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
        if (r1.matches("\\d+") != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015c  */
    @Override // com.google.android.gms.internal.ads.zzaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzh(com.google.android.gms.internal.ads.zzan r15) throws com.google.android.gms.internal.ads.zzli {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlj.zzh(com.google.android.gms.internal.ads.zzan):long");
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() throws zzli {
        this.zzc = null;
        try {
            try {
                InputStream inputStream = this.zze;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zze = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzd;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.zzd = null;
                        if (this.zzg) {
                            this.zzg = false;
                            zze();
                        }
                    }
                } catch (IOException e2) {
                    throw new zzli(null, e2, 2000);
                }
            } catch (IOException e3) {
                throw new zzli(null, e3, 2000);
            }
        } catch (Throwable th) {
            this.zze = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzd;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzd = null;
                    if (this.zzg) {
                        this.zzg = false;
                        zze();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new zzli(null, e4, 2000);
                }
            } catch (Throwable th2) {
                this.zzd = null;
                if (this.zzg) {
                    this.zzg = false;
                    zze();
                }
                throw th2;
            }
        }
    }
}
