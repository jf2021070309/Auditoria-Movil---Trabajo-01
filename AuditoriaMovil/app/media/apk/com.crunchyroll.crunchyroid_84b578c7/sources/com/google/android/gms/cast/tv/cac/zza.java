package com.google.android.gms.cast.tv.cac;

import com.google.android.gms.cast.tv.media.UserActionRequestData;
import com.google.android.gms.internal.cast_tv.zzaj;
import com.google.android.gms.tasks.Task;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zza {
    private final zzaj zza;

    public zza(zzaj zzajVar) {
        this.zza = zzajVar;
    }

    public final Task zza(String str, UserActionRequestData userActionRequestData) {
        return this.zza.zzf().onUserAction(str, userActionRequestData);
    }
}
