package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* loaded from: classes.dex */
public final class zzkm extends zzag {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzkm(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i2, int i3) throws zzkl {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.zze;
        if (j2 != 0) {
            if (j2 != -1) {
                try {
                    i3 = (int) Math.min(j2, i3);
                } catch (IOException e2) {
                    throw new zzkl(e2, 2000);
                }
            }
            FileInputStream fileInputStream = this.zzd;
            int i4 = zzamq.zza;
            int read = fileInputStream.read(bArr, i2, i3);
            if (read == -1) {
                return -1;
            }
            long j3 = this.zze;
            if (j3 != -1) {
                this.zze = j3 - read;
            }
            zzd(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) throws zzkl {
        AssetFileDescriptor openAssetFileDescriptor;
        long j2;
        try {
            Uri uri = zzanVar.zza;
            this.zzb = uri;
            zzb(zzanVar);
            if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(zzanVar.zza.getScheme())) {
                Bundle bundle = new Bundle();
                if (zzamq.zza >= 31) {
                    zzkk.zza(bundle);
                }
                openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.zza.openAssetFileDescriptor(uri, "r");
            }
            this.zzc = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(valueOf.length() + 36);
                sb.append("Could not open file descriptor for: ");
                sb.append(valueOf);
                throw new zzkl(new IOException(sb.toString()), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.zzd = fileInputStream;
            if (length != -1 && zzanVar.zzf > length) {
                throw new zzkl(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(zzanVar.zzf + startOffset) - startOffset;
            if (skip == zzanVar.zzf) {
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.zze = -1L;
                        j2 = -1;
                    } else {
                        j2 = size - channel.position();
                        this.zze = j2;
                        if (j2 < 0) {
                            throw new zzkl(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.zze = j3;
                    if (j3 < 0) {
                        throw new zzkl(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                    j2 = j3;
                }
                long j4 = zzanVar.zzg;
                if (j4 != -1) {
                    if (j2 != -1) {
                        j4 = Math.min(j2, j4);
                    }
                    this.zze = j4;
                }
                this.zzf = true;
                zzc(zzanVar);
                long j5 = zzanVar.zzg;
                return j5 != -1 ? j5 : this.zze;
            }
            throw new zzkl(null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (zzkl e2) {
            throw e2;
        } catch (IOException e3) {
            throw new zzkl(e3, true == (e3 instanceof FileNotFoundException) ? 2005 : 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() throws zzkl {
        this.zzb = null;
        try {
            try {
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zze();
                        }
                    }
                } catch (IOException e2) {
                    throw new zzkl(e2, 2000);
                }
            } catch (IOException e3) {
                throw new zzkl(e3, 2000);
            }
        } catch (Throwable th) {
            this.zzd = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zze();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new zzkl(e4, 2000);
                }
            } catch (Throwable th2) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zze();
                }
                throw th2;
            }
        }
    }
}
