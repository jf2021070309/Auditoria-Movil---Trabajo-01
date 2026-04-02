package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzflh extends zzfkv {
    private zzfpg<Integer> zza;
    private zzfpg<Integer> zzb;
    private zzflg zzc;
    private HttpURLConnection zzd;

    public zzflh(zzfpg<Integer> zzfpgVar, zzfpg<Integer> zzfpgVar2, zzflg zzflgVar) {
        this.zza = zzfpgVar;
        this.zzb = zzfpgVar2;
        this.zzc = zzflgVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfkw.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfkw.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzflg zzflgVar = this.zzc;
        zzflgVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzflgVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzflg zzflgVar, final int i, final int i2) throws IOException {
        this.zza = new zzfpg() { // from class: com.google.android.gms.internal.ads.zzfkx
            @Override // com.google.android.gms.internal.ads.zzfpg
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzfpg() { // from class: com.google.android.gms.internal.ads.zzfky
            @Override // com.google.android.gms.internal.ads.zzfpg
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = zzflgVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzfpg() { // from class: com.google.android.gms.internal.ads.zzfkz
            @Override // com.google.android.gms.internal.ads.zzfpg
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzfpg() { // from class: com.google.android.gms.internal.ads.zzfla
            @Override // com.google.android.gms.internal.ads.zzfpg
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = new zzflg() { // from class: com.google.android.gms.internal.ads.zzflb
            @Override // com.google.android.gms.internal.ads.zzflg
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i) throws IOException {
        this.zza = new zzfpg() { // from class: com.google.android.gms.internal.ads.zzflc
            @Override // com.google.android.gms.internal.ads.zzfpg
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzc = new zzflg() { // from class: com.google.android.gms.internal.ads.zzfld
            @Override // com.google.android.gms.internal.ads.zzflg
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = url.openConnection();
                return openConnection;
            }
        };
        return zzm();
    }

    public zzflh() {
        this(new zzfpg() { // from class: com.google.android.gms.internal.ads.zzfle
            @Override // com.google.android.gms.internal.ads.zzfpg
            public final Object zza() {
                return zzflh.zzf();
            }
        }, new zzfpg() { // from class: com.google.android.gms.internal.ads.zzflf
            @Override // com.google.android.gms.internal.ads.zzfpg
            public final Object zza() {
                return zzflh.zzg();
            }
        }, null);
    }
}
