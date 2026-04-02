package e.c.a.m;

import java.nio.charset.Charset;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public interface k {
    public static final Charset a = Charset.forName("UTF-8");

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
