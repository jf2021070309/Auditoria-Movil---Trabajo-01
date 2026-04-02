package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.CastStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public class zzd extends zzp {
    private final List zzb;

    public zzd(String str, String str2, String str3) {
        super(str, "MediaControlChannel", null);
        this.zzb = Collections.synchronizedList(new ArrayList());
    }

    public final List zza() {
        return this.zzb;
    }

    public final void zzb() {
        synchronized (this.zzb) {
            for (zzau zzauVar : this.zzb) {
                zzauVar.zzc(CastStatusCodes.CANCELED);
            }
        }
    }

    public final void zzc(zzau zzauVar) {
        this.zzb.add(zzauVar);
    }
}
