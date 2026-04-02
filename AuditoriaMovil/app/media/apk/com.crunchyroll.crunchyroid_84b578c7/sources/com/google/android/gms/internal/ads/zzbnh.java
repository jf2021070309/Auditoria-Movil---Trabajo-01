package com.google.android.gms.internal.ads;

import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbnh extends zzbzt {
    private final zzbng zza;

    public zzbnh(zzbng zzbngVar, String str) {
        super(str);
        this.zza = zzbngVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzt, com.google.android.gms.internal.ads.zzbzg
    public final boolean zza(String str) {
        zzbzo.zze("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(str)));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        zzbzo.zze("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.zza(str);
    }
}
