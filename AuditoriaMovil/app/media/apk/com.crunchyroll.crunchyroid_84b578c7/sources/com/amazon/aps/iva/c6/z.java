package com.amazon.aps.iva.c6;

import com.amazon.aps.iva.r5.b;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
/* compiled from: ToFloatPcmAudioProcessor.java */
/* loaded from: classes.dex */
public final class z extends com.amazon.aps.iva.r5.d {
    public static final int i = Float.floatToIntBits(Float.NaN);

    @Override // com.amazon.aps.iva.r5.b
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer j;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        int i4 = i;
        if (i3 != 536870912) {
            if (i3 == 805306368) {
                j = j(i2);
                while (position < limit) {
                    int floatToIntBits = Float.floatToIntBits((float) (((byteBuffer.get(position) & UnsignedBytes.MAX_VALUE) | ((byteBuffer.get(position + 1) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(position + 2) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(position + 3) & UnsignedBytes.MAX_VALUE) << 24)) * 4.656612875245797E-10d));
                    if (floatToIntBits == i4) {
                        floatToIntBits = Float.floatToIntBits(0.0f);
                    }
                    j.putInt(floatToIntBits);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            j = j((i2 / 3) * 4);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) ((((byteBuffer.get(position) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(position + 2) & UnsignedBytes.MAX_VALUE) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i4) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                j.putInt(floatToIntBits2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j.flip();
    }

    @Override // com.amazon.aps.iva.r5.d
    @CanIgnoreReturnValue
    public final b.a f(b.a aVar) throws b.C0666b {
        boolean z;
        int i2 = aVar.c;
        if (i2 != 536870912 && i2 != 805306368 && i2 != 4) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i2 != 4) {
                return new b.a(aVar.a, aVar.b, 4);
            }
            return b.a.e;
        }
        throw new b.C0666b(aVar);
    }
}
