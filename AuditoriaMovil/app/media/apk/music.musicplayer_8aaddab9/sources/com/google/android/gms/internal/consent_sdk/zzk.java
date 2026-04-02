package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import e.d.b.f.f;
/* loaded from: classes.dex */
public final class zzk extends Exception {
    private final int zza;

    public zzk(int i2, String str) {
        super(str);
        this.zza = i2;
    }

    public zzk(int i2, String str, Throwable th) {
        super(str, th);
        this.zza = i2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public final f zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", getMessage());
        } else {
            Log.w("UserMessagingPlatform", getMessage(), getCause());
        }
        return new f(this.zza, getMessage());
    }
}
