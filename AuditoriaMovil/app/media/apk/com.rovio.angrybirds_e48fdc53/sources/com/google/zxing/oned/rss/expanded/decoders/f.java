package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
/* loaded from: classes2.dex */
abstract class f extends i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        if (getInformation().getSize() != 60) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        b(sb, 5);
        b(sb, 45, 15);
        return sb.toString();
    }
}
