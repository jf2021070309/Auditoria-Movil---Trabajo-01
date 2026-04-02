package com.google.android.gms.internal.cast;

import com.amazon.aps.iva.j0.j0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzwm extends IllegalArgumentException {
    public zzwm(int i, int i2) {
        super(j0.e("Unpaired surrogate at index ", i, " of ", i2));
    }
}
