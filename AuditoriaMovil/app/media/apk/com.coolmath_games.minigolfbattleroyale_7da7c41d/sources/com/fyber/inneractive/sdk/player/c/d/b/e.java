package com.fyber.inneractive.sdk.player.c.d.b;

import com.fyber.inneractive.sdk.player.c.d.g;
import com.fyber.inneractive.sdk.player.c.k.k;
import java.io.IOException;
import kotlin.UByte;
/* loaded from: classes.dex */
final class e {
    final k a = new k(8);
    int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(g gVar) throws IOException, InterruptedException {
        int i = 0;
        gVar.c(this.a.a, 0, 1);
        int i2 = this.a.a[0] & UByte.MAX_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        gVar.c(this.a.a, 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.a.a[i] & UByte.MAX_VALUE) + (i5 << 8);
        }
        this.b += i4 + 1;
        return i5;
    }
}
