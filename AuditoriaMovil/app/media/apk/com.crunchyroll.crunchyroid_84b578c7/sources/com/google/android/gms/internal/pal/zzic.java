package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzic extends zzhw {
    private zzis zza;
    private final zzis zzb;
    private HttpURLConnection zzc;
    private zzhz zzd;

    public zzic() {
        zzia zziaVar = new zzis() { // from class: com.google.android.gms.internal.pal.zzia
            @Override // com.google.android.gms.internal.pal.zzis
            public final Object zza() {
                return -1;
            }
        };
        zzib zzibVar = new zzis() { // from class: com.google.android.gms.internal.pal.zzib
            @Override // com.google.android.gms.internal.pal.zzis
            public final Object zza() {
                return -1;
            }
        };
        this.zza = zziaVar;
        this.zzb = zzibVar;
        this.zzd = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.zzc;
        zzhx.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final URLConnection zzb(URL url, int i) throws IOException {
        this.zza = new zzis(26624) { // from class: com.google.android.gms.internal.pal.zzhy
            @Override // com.google.android.gms.internal.pal.zzis
            public final Object zza() {
                return 26624;
            }
        };
        this.zzd = new zzhz(url);
        Integer num = -1;
        zzhx.zzb(((Integer) this.zza.zza()).intValue(), num.intValue());
        zzhz zzhzVar = this.zzd;
        zzhzVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzhzVar.zza.openConnection();
        this.zzc = httpURLConnection;
        return httpURLConnection;
    }
}
