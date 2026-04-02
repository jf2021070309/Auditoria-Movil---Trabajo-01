package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzady extends IOException {
    public zzady() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzady(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzady(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
