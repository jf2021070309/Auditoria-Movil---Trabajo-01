package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;
/* loaded from: classes2.dex */
abstract class h extends AbstractExpandedDecoder {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h(BitArray bitArray) {
        super(bitArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        a(sb, i, length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int a = getGeneralDecoder().a((i3 * 10) + i, 10);
            if (a / 100 == 0) {
                sb.append('0');
            }
            if (a / 10 == 0) {
                sb.append('0');
            }
            sb.append(a);
        }
        a(sb, i2);
    }

    private static void a(StringBuilder sb, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 13; i3++) {
            int charAt = sb.charAt(i3 + i) - '0';
            if ((i3 & 1) == 0) {
                charAt *= 3;
            }
            i2 += charAt;
        }
        int i4 = 10 - (i2 % 10);
        if (i4 == 10) {
            i4 = 0;
        }
        sb.append(i4);
    }
}
