package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* loaded from: classes.dex */
public final class zzws implements Comparator<byte[]> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
        return bArr.length - bArr2.length;
    }
}
