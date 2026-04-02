package com.google.android.gms.internal.cast_tv;

import com.amazon.aps.iva.j0.j0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzks extends IllegalArgumentException {
    public zzks(int i, int i2) {
        super(j0.e("Unpaired surrogate at index ", i, " of ", i2));
    }
}
