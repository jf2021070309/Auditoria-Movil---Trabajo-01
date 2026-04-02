package com.amazon.aps.iva.c6;

import com.amazon.aps.iva.r5.b;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
/* compiled from: ChannelMappingAudioProcessor.java */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.r5.d {
    public int[] i;
    public int[] j;

    @Override // com.amazon.aps.iva.r5.b
    public final void c(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j = j(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                j.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        j.flip();
    }

    @Override // com.amazon.aps.iva.r5.d
    @CanIgnoreReturnValue
    public final b.a f(b.a aVar) throws b.C0666b {
        boolean z;
        boolean z2;
        int[] iArr = this.i;
        if (iArr == null) {
            return b.a.e;
        }
        if (aVar.c == 2) {
            int length = iArr.length;
            int i = aVar.b;
            if (i != length) {
                z = true;
            } else {
                z = false;
            }
            for (int i2 = 0; i2 < iArr.length; i2++) {
                int i3 = iArr[i2];
                if (i3 < i) {
                    if (i3 != i2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                } else {
                    throw new b.C0666b(aVar);
                }
            }
            if (z) {
                return new b.a(aVar.a, iArr.length, 2);
            }
            return b.a.e;
        }
        throw new b.C0666b(aVar);
    }

    @Override // com.amazon.aps.iva.r5.d
    public final void g() {
        this.j = this.i;
    }

    @Override // com.amazon.aps.iva.r5.d
    public final void i() {
        this.j = null;
        this.i = null;
    }
}
