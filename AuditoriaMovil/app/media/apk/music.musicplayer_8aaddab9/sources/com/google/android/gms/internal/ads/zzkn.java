package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;
/* loaded from: classes.dex */
public final class zzkn extends zzag {
    private zzan zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzkn() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.zzd;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i3, i4);
        System.arraycopy(zzamq.zzd(this.zzb), this.zzc, bArr, i2, min);
        this.zzc += min;
        this.zzd -= min;
        zzd(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) throws IOException {
        zzb(zzanVar);
        this.zza = zzanVar;
        Uri uri = zzanVar.zza;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        zzakt.zzb(equals, valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        String[] zzt = zzamq.zzt(uri.getSchemeSpecificPart(), ",");
        if (zzt.length != 2) {
            String valueOf2 = String.valueOf(uri);
            valueOf2.length();
            throw zzaha.zza("Unexpected URI format: ".concat(valueOf2), null);
        }
        String str = zzt[1];
        if (zzt[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                String valueOf3 = String.valueOf(str);
                throw zzaha.zza(valueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf3) : new String("Error while parsing Base64 encoded string: "), e2);
            }
        } else {
            this.zzb = zzamq.zzs(URLDecoder.decode(str, zzfll.zza.name()));
        }
        long j2 = zzanVar.zzf;
        int length = this.zzb.length;
        if (j2 > length) {
            this.zzb = null;
            throw new zzak(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i2 = (int) j2;
        this.zzc = i2;
        int i3 = length - i2;
        this.zzd = i3;
        long j3 = zzanVar.zzg;
        if (j3 != -1) {
            this.zzd = (int) Math.min(i3, j3);
        }
        zzc(zzanVar);
        long j4 = zzanVar.zzg;
        return j4 != -1 ? j4 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        zzan zzanVar = this.zza;
        if (zzanVar != null) {
            return zzanVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() {
        if (this.zzb != null) {
            this.zzb = null;
            zze();
        }
        this.zza = null;
    }
}
