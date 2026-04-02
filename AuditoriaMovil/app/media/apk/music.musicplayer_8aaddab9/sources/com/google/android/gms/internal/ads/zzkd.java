package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzkd extends zzag {
    private final AssetManager zza;
    private Uri zzb;
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzkd(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i2, int i3) throws zzkc {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.zzd;
        if (j2 != 0) {
            if (j2 != -1) {
                try {
                    i3 = (int) Math.min(j2, i3);
                } catch (IOException e2) {
                    throw new zzkc(e2, 2000);
                }
            }
            InputStream inputStream = this.zzc;
            int i4 = zzamq.zza;
            int read = inputStream.read(bArr, i2, i3);
            if (read == -1) {
                return -1;
            }
            long j3 = this.zzd;
            if (j3 != -1) {
                this.zzd = j3 - read;
            }
            zzd(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) throws zzkc {
        try {
            Uri uri = zzanVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzb(zzanVar);
            InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            if (open.skip(zzanVar.zzf) >= zzanVar.zzf) {
                long j2 = zzanVar.zzg;
                if (j2 != -1) {
                    this.zzd = j2;
                } else {
                    long available = this.zzc.available();
                    this.zzd = available;
                    if (available == 2147483647L) {
                        this.zzd = -1L;
                    }
                }
                this.zze = true;
                zzc(zzanVar);
                return this.zzd;
            }
            throw new zzkc(null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (zzkc e2) {
            throw e2;
        } catch (IOException e3) {
            throw new zzkc(e3, true != (e3 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() throws zzkc {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zze();
                }
            } catch (IOException e2) {
                throw new zzkc(e2, 2000);
            }
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zze();
            }
            throw th;
        }
    }
}
