package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import java.math.BigInteger;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcgg {
    private BigInteger zza = BigInteger.ONE;
    private String zzb = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    public final synchronized String zza() {
        String bigInteger;
        bigInteger = this.zza.toString();
        this.zza = this.zza.add(BigInteger.ONE);
        this.zzb = bigInteger;
        return bigInteger;
    }

    public final synchronized String zzb() {
        return this.zzb;
    }
}
