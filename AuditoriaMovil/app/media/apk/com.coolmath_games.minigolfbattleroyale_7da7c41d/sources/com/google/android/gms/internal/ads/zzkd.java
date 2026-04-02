package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
    public final int zzg(byte[] bArr, int i, int i2) throws zzkc {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzd;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzkc(e, 2000);
                }
            }
            InputStream inputStream = this.zzc;
            int i3 = zzamq.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.zzd;
            if (j2 != -1) {
                this.zzd = j2 - read;
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
            if (path != null) {
                if (path.startsWith("/android_asset/")) {
                    path = path.substring(15);
                } else if (path.startsWith("/")) {
                    path = path.substring(1);
                }
                zzb(zzanVar);
                InputStream open = this.zza.open(path, 1);
                this.zzc = open;
                if (open.skip(zzanVar.zzf) < zzanVar.zzf) {
                    throw new zzkc(null, 2008);
                }
                long j = zzanVar.zzg;
                if (j != -1) {
                    this.zzd = j;
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
            throw null;
        } catch (zzkc e) {
            throw e;
        } catch (IOException e2) {
            throw new zzkc(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : IronSourceConstants.IS_INSTANCE_OPENED);
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
            } catch (IOException e) {
                throw new zzkc(e, 2000);
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
