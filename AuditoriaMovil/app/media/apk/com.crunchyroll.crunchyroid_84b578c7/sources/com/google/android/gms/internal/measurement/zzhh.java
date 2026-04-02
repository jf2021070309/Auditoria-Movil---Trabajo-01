package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.amazon.aps.iva.x.h;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzhh {
    private final h zza;

    public zzhh(h hVar) {
        this.zza = hVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        h hVar;
        if (uri != null) {
            hVar = (h) this.zza.getOrDefault(uri.toString(), null);
        } else {
            hVar = null;
        }
        if (hVar == null) {
            return null;
        }
        return (String) hVar.getOrDefault("".concat(str3), null);
    }
}
