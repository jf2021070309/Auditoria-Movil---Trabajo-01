package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class HashAccumulator {
    private int zaa = 1;

    @CanIgnoreReturnValue
    @KeepForSdk
    public HashAccumulator addObject(Object obj) {
        int hashCode;
        int i = this.zaa * 31;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.zaa = i + hashCode;
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.zaa;
    }

    @CanIgnoreReturnValue
    public final HashAccumulator zaa(boolean z) {
        this.zaa = (this.zaa * 31) + (z ? 1 : 0);
        return this;
    }
}
