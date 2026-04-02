package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.a;
import com.amazon.aps.iva.e4.a.AbstractC0214a;
import com.amazon.aps.iva.e4.i;
import com.amazon.aps.iva.e4.l;
import com.amazon.aps.iva.e4.q0;
import java.io.IOException;
import java.util.logging.Logger;
/* compiled from: AbstractMessageLite.java */
/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0214a<MessageType, BuilderType>> implements q0 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.amazon.aps.iva.e4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0214a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0214a<MessageType, BuilderType>> implements q0.a {
    }

    int c() {
        throw new UnsupportedOperationException();
    }

    public final int d(g1 g1Var) {
        int c = c();
        if (c == -1) {
            int serializedSize = g1Var.getSerializedSize(this);
            e(serializedSize);
            return serializedSize;
        }
        return c;
    }

    void e(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.e4.q0
    public final i.e toByteString() {
        try {
            x xVar = (x) this;
            int serializedSize = xVar.getSerializedSize();
            i.e eVar = i.c;
            byte[] bArr = new byte[serializedSize];
            Logger logger = l.b;
            l.b bVar = new l.b(bArr, serializedSize);
            xVar.b(bVar);
            if (bVar.e - bVar.f == 0) {
                return new i.e(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
