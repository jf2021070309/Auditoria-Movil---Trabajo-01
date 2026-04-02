package com.google.android.gms.internal.pal;

import java.io.EOFException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzzs {
    public static zzyy zza(zzabc zzabcVar) throws zzzc {
        boolean z;
        try {
            try {
                zzabcVar.zzl();
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return (zzyy) zzaba.zzV.zza(zzabcVar);
            } catch (EOFException e2) {
                e = e2;
                z = false;
                if (z) {
                    return zzza.zza;
                }
                throw new zzze(e);
            }
        } catch (zzabf e3) {
            throw new zzze(e3);
        } catch (IOException e4) {
            throw new zzyz(e4);
        } catch (NumberFormatException e5) {
            throw new zzze(e5);
        }
    }
}
