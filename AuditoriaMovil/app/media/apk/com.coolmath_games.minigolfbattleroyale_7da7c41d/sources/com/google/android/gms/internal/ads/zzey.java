package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzey extends IOException {
    public final int zza;

    public zzey(Throwable th, int i) {
        super(th);
        this.zza = GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER;
    }
}
