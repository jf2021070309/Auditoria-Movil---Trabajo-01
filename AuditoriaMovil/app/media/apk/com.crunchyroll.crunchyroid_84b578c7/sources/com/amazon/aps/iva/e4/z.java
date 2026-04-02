package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.j;
import com.amazon.aps.iva.e4.x;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
import org.apache.commons.codec.binary.Hex;
/* compiled from: Internal.java */
/* loaded from: classes.dex */
public final class z {
    public static final Charset a = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
    public static final byte[] b;

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface a {
        int getNumber();
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a();
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface c<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        c<E> mutableCopyWithCapacity(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new j.a(bArr, 0, 0, false).e(0);
        } catch (a0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static x b(Object obj, Object obj2) {
        x.a builder = ((q0) obj).toBuilder();
        q0 q0Var = (q0) obj2;
        builder.getClass();
        if (builder.b.getClass().isInstance(q0Var)) {
            builder.e();
            x.a.f(builder.c, (x) ((com.amazon.aps.iva.e4.a) q0Var));
            return builder.d();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
