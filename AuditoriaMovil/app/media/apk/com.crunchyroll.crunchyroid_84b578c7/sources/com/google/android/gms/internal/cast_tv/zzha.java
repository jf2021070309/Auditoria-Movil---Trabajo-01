package com.google.android.gms.internal.cast_tv;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzha extends IOException {
    public zzha() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzha(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzha(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
