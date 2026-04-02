package com.ss.android.socialbase.appdownloader.bn.dr;

import java.io.IOException;
/* loaded from: classes3.dex */
public class ge {
    public static final void dr(g gVar, int i) throws IOException {
        int ge = gVar.ge();
        if (ge != i) {
            throw new IOException("Expected chunk of type 0x" + Integer.toHexString(i) + ", read 0x" + Integer.toHexString(ge) + ".");
        }
    }
}
