package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b extends f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.i
    protected void a(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.i
    protected int a(int i) {
        return i < 10000 ? i : i - 10000;
    }
}
