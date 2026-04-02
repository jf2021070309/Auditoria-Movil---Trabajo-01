package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzzf {
    public static zzwr zza(zzacv zzacvVar) throws zzwv {
        boolean z;
        try {
            try {
                zzacvVar.zzt();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return (zzwr) zzaby.zzV.read(zzacvVar);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return zzwt.zza;
                }
                throw new zzwz(e);
            }
        } catch (zzacy e3) {
            throw new zzwz(e3);
        } catch (IOException e4) {
            throw new zzws(e4);
        } catch (NumberFormatException e5) {
            throw new zzwz(e5);
        }
    }
}
