package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.List;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzgt implements zzgv {
    final String zza;

    public zzgt(String str) {
        this.zza = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgv
    public final boolean zza(zzgu zzguVar, boolean z) {
        String host;
        if (!z && zzguVar.zzc && this.zza.contains("GOOGLE_INSTREAM_VIDEO_NONCE")) {
            String str = this.zza;
            List<String> list = zzguVar.zze;
            if (str != null && list != null && (host = Uri.parse(str).getHost()) != null) {
                if (host.startsWith("www.")) {
                    host = host.substring(4);
                }
                for (String str2 : list) {
                    if (host != str2) {
                        if (host != null && host.equals(str2)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
