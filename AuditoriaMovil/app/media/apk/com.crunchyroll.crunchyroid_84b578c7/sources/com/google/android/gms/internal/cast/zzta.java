package com.google.android.gms.internal.cast;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzta extends IOException {
    public zzta() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzta(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzta(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
