package com.google.android.gms.internal.measurement;

import com.amazon.aps.iva.j0.j0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzny extends IllegalArgumentException {
    public zzny(int i, int i2) {
        super(j0.e("Unpaired surrogate at index ", i, " of ", i2));
    }
}
