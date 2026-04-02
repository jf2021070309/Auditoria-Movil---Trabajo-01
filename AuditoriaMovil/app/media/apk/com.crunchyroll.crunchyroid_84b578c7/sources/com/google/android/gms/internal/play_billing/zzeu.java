package com.google.android.gms.internal.play_billing;

import com.amazon.aps.iva.j0.j0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public final class zzeu extends IllegalArgumentException {
    public zzeu(int i, int i2) {
        super(j0.e("Unpaired surrogate at index ", i, " of ", i2));
    }
}
