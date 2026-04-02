package com.google.crypto.tink.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.util.Bytes;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;
import org.apache.commons.codec.binary.Hex;
/* loaded from: classes4.dex */
public final class Util {
    public static final Charset UTF_8 = Charset.forName(Hex.DEFAULT_CHARSET_NAME);

    private Util() {
    }

    public static Integer getAndroidApiLevel() {
        if (!isAndroid()) {
            return null;
        }
        return BuildDispatchedCode.getApiLevel();
    }

    public static boolean isAndroid() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static int randKeyId() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Ascii.DEL) << 24) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE);
        }
        return i;
    }

    private static final byte toByteFromPrintableAscii(char c) {
        if (c >= '!' && c <= '~') {
            return (byte) c;
        }
        throw new TinkBugException("Not a printable ASCII character: " + c);
    }

    public static final Bytes toBytesFromPrintableAscii(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = toByteFromPrintableAscii(str.charAt(i));
        }
        return Bytes.copyFrom(bArr);
    }
}
