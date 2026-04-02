package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Du  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0548Du {
    public final int A00;
    public final String A01;
    public final List<C0547Dt> A02;
    public final byte[] A03;

    public C0548Du(int i2, String str, List<C0547Dt> list, byte[] bArr) {
        List<C0547Dt> unmodifiableList;
        this.A00 = i2;
        this.A01 = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A03 = bArr;
    }
}
