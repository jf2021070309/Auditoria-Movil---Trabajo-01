package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.a;
import com.amazon.aps.iva.v4.a.AbstractC0782a;
import com.amazon.aps.iva.v4.h;
import com.amazon.aps.iva.v4.k;
import com.amazon.aps.iva.v4.p0;
import java.io.IOException;
import java.util.logging.Logger;
/* compiled from: AbstractMessageLite.java */
/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0782a<MessageType, BuilderType>> implements p0 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.amazon.aps.iva.v4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0782a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0782a<MessageType, BuilderType>> implements p0.a {
    }

    int c() {
        throw new UnsupportedOperationException();
    }

    public final int d(e1 e1Var) {
        int c = c();
        if (c == -1) {
            int serializedSize = e1Var.getSerializedSize(this);
            e(serializedSize);
            return serializedSize;
        }
        return c;
    }

    void e(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.v4.p0
    public final h.f toByteString() {
        try {
            w wVar = (w) this;
            int serializedSize = wVar.getSerializedSize();
            h.f fVar = h.c;
            byte[] bArr = new byte[serializedSize];
            Logger logger = k.b;
            k.b bVar = new k.b(bArr, serializedSize);
            wVar.b(bVar);
            if (bVar.e - bVar.f == 0) {
                return new h.f(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
