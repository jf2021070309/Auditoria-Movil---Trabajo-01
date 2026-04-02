package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.j0.j0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzafw extends IllegalArgumentException {
    public zzafw(int i, int i2) {
        super(j0.e("Unpaired surrogate at index ", i, " of ", i2));
    }
}
