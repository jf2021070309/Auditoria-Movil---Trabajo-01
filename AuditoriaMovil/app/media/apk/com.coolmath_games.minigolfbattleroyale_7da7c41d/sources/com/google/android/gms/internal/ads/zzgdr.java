package com.google.android.gms.internal.ads;

import java.security.SecureRandom;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzgdr extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ SecureRandom initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
