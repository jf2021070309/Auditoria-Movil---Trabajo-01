package com.facebook.ads.redexgen.X;

import java.util.Comparator;
/* renamed from: com.facebook.ads.redexgen.X.Ir  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0669Ir implements Comparator<C0670Is> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(C0670Is c0670Is, C0670Is c0670Is2) {
        if (c0670Is.A00 < c0670Is2.A00) {
            return -1;
        }
        return c0670Is2.A00 < c0670Is.A00 ? 1 : 0;
    }
}
