package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.i;
import com.amazon.aps.iva.v4.w;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
import org.apache.commons.codec.binary.Hex;
/* compiled from: Internal.java */
/* loaded from: classes.dex */
public final class y {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
    public static final byte[] c;

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface a {
        int getNumber();
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface b<T extends a> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface c {
        boolean isInRange(int i);
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface d<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        d<E> mutableCopyWithCapacity(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        c = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new i.a(bArr, 0, 0, false).e(0);
        } catch (z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static w b(Object obj, Object obj2) {
        w.a builder = ((p0) obj).toBuilder();
        p0 p0Var = (p0) obj2;
        builder.getClass();
        if (builder.b.getClass().isInstance(p0Var)) {
            builder.e();
            w.a.f(builder.c, (w) ((com.amazon.aps.iva.v4.a) p0Var));
            return builder.d();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
