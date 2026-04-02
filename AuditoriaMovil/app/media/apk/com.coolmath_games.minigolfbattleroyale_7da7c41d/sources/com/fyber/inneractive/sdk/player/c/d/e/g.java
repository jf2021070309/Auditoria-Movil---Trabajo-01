package com.fyber.inneractive.sdk.player.c.d.e;

import com.fyber.inneractive.sdk.player.c.d.e.h;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;
/* loaded from: classes.dex */
final class g extends h {
    private static final int a = t.e("Opus");
    private static final byte[] d = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean e;

    public static boolean b(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        int b = kVar.b();
        byte[] bArr = d;
        if (b < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        kVar.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.d.e.h
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.e = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.e.h
    protected final long a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        int i;
        byte[] bArr = kVar.a;
        int i2 = bArr[0] & UByte.MAX_VALUE;
        int i3 = i2 & 3;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1 && i3 != 2) {
            i4 = bArr[1] & 63;
        }
        int i5 = i2 >> 3;
        return b(i4 * (i5 >= 16 ? IronSourceConstants.IS_INSTANCE_NOT_FOUND << i : i5 >= 12 ? 10000 << (i & 1) : (i5 & 3) == 3 ? 60000 : 10000 << i));
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.e.h
    protected final boolean a(com.fyber.inneractive.sdk.player.c.k.k kVar, long j, h.a aVar) throws IOException, InterruptedException {
        if (!this.e) {
            byte[] copyOf = Arrays.copyOf(kVar.a, kVar.c);
            int i = copyOf[9] & UByte.MAX_VALUE;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            a(arrayList, ((copyOf[11] & UByte.MAX_VALUE) << 8) | (copyOf[10] & UByte.MAX_VALUE));
            a(arrayList, 3840);
            aVar.a = com.fyber.inneractive.sdk.player.c.h.a(null, "audio/opus", -1, -1, i, 48000, arrayList, null, null);
            this.e = true;
            return true;
        }
        boolean z = kVar.j() == a;
        kVar.c(0);
        return z;
    }

    private static void a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i * 1000000000) / 48000).array());
    }
}
