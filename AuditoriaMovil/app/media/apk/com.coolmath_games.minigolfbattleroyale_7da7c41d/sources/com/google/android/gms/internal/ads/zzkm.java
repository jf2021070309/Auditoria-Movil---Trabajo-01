package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
    public final int zzg(byte[] bArr, int i, int i2) throws zzkl {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzkl(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.zzd;
            int i3 = zzamq.zza;
            int read = fileInputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.zze;
            if (j2 != -1) {
                this.zze = j2 - read;
            }
            zzd(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) throws zzkl {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            try {
                Uri uri = zzanVar.zza;
                this.zzb = uri;
                zzb(zzanVar);
                if ("content".equals(zzanVar.zza.getScheme())) {
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
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb.append("Could not open file descriptor for: ");
                    sb.append(valueOf);
                    i = 2000;
                    try {
                        throw new zzkl(new IOException(sb.toString()), 2000);
                    } catch (IOException e) {
                        e = e;
                        if (true == (e instanceof FileNotFoundException)) {
                            i = IronSourceConstants.IS_INSTANCE_OPENED;
                        }
                        throw new zzkl(e, i);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i2 != 0 && zzanVar.zzf > length) {
                    throw new zzkl(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(zzanVar.zzf + startOffset) - startOffset;
                if (skip != zzanVar.zzf) {
                    throw new zzkl(null, 2008);
                }
                if (i2 == 0) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.zze = -1L;
                        j = -1;
                    } else {
                        j = size - channel.position();
                        this.zze = j;
                        if (j < 0) {
                            throw new zzkl(null, 2008);
                        }
                    }
                } else {
                    j = length - skip;
                    this.zze = j;
                    if (j < 0) {
                        throw new zzkl(null, 2008);
                    }
                }
                long j2 = zzanVar.zzg;
                if (j2 != -1) {
                    if (j != -1) {
                        j2 = Math.min(j, j2);
                    }
                    this.zze = j2;
                }
                this.zzf = true;
                zzc(zzanVar);
                long j3 = zzanVar.zzg;
                return j3 != -1 ? j3 : this.zze;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (zzkl e3) {
            throw e3;
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
                } catch (IOException e) {
                    throw new zzkl(e, 2000);
                }
            } catch (IOException e2) {
                throw new zzkl(e2, 2000);
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
                } catch (IOException e3) {
                    throw new zzkl(e3, 2000);
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
