package com.amazon.aps.iva.kc;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import org.apache.commons.codec.binary.Hex;
/* compiled from: Key.java */
/* loaded from: classes.dex */
public interface f {
    public static final Charset a = Charset.forName(Hex.DEFAULT_CHARSET_NAME);

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
