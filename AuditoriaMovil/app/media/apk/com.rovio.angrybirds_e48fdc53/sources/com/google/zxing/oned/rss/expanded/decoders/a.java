package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a extends f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.i
    protected void a(StringBuilder sb, int i) {
        sb.append("(3103)");
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.i
    protected int a(int i) {
        return i;
    }
}
