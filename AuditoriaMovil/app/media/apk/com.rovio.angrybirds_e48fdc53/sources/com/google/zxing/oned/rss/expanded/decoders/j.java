package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j extends AbstractExpandedDecoder {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        return getGeneralDecoder().a(new StringBuilder(), 5);
    }
}
