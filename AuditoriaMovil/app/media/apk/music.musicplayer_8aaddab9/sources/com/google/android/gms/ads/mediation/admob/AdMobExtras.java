package com.google.android.gms.ads.mediation.admob;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.ads.mediation.NetworkExtras;
@Deprecated
/* loaded from: classes.dex */
public final class AdMobExtras implements NetworkExtras {
    private final Bundle zza;

    public AdMobExtras(@RecentlyNonNull Bundle bundle) {
        this.zza = bundle != null ? new Bundle(bundle) : null;
    }

    @RecentlyNullable
    public Bundle getExtras() {
        return this.zza;
    }
}
