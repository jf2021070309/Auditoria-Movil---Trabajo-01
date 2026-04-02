package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c extends h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        if (getInformation().getSize() < 48) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        b(sb, 8);
        int a = getGeneralDecoder().a(48, 2);
        sb.append("(392");
        sb.append(a);
        sb.append(')');
        sb.append(getGeneralDecoder().a(50, (String) null).a());
        return sb.toString();
    }
}
