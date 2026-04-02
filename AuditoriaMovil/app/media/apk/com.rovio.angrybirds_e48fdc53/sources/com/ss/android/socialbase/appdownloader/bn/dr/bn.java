package com.ss.android.socialbase.appdownloader.bn.dr;

import java.io.IOException;
/* loaded from: classes3.dex */
public class bn {
    private int[] dr;
    private int[] ge;

    public static bn dr(g gVar) throws IOException {
        ge.dr(gVar, 1835009);
        int ge = gVar.ge();
        int ge2 = gVar.ge();
        int ge3 = gVar.ge();
        gVar.ge();
        int ge4 = gVar.ge();
        int ge5 = gVar.ge();
        bn bnVar = new bn();
        bnVar.dr = gVar.ge(ge2);
        if (ge3 != 0) {
            gVar.ge(ge3);
        }
        int i = (ge5 == 0 ? ge : ge5) - ge4;
        if (i % 4 != 0) {
            throw new IOException("String data size is not multiple of 4 (" + i + ").");
        }
        bnVar.ge = gVar.ge(i / 4);
        if (ge5 != 0) {
            int i2 = ge - ge5;
            if (i2 % 4 != 0) {
                throw new IOException("Style data size is not multiple of 4 (" + i2 + ").");
            }
            gVar.ge(i2 / 4);
        }
        return bnVar;
    }

    public String dr(int i) {
        int[] iArr;
        if (i >= 0 && (iArr = this.dr) != null && i < iArr.length) {
            int i2 = iArr[i];
            int dr = dr(this.ge, i2);
            StringBuilder sb = new StringBuilder(dr);
            while (dr != 0) {
                i2 += 2;
                sb.append((char) dr(this.ge, i2));
                dr--;
            }
            return sb.toString();
        }
        return null;
    }

    private bn() {
    }

    private static final int dr(int[] iArr, int i) {
        int i2 = iArr[i / 4];
        return (i % 4) / 2 == 0 ? i2 & 65535 : i2 >>> 16;
    }
}
