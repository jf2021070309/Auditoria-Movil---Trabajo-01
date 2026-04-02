package com.google.zxing.common;

import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Map;
/* loaded from: classes4.dex */
public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS;
    private static final Charset EUC_JP;
    public static final String GB2312 = "GB2312";
    public static final Charset GB2312_CHARSET;
    private static final Charset PLATFORM_DEFAULT_ENCODING = Charset.defaultCharset();
    public static final String SHIFT_JIS = "SJIS";
    public static final Charset SHIFT_JIS_CHARSET = Charset.forName(SHIFT_JIS);

    static {
        Charset charset;
        boolean z;
        try {
            charset = Charset.forName(GB2312);
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        GB2312_CHARSET = charset;
        Charset forName = Charset.forName("EUC_JP");
        EUC_JP = forName;
        Charset charset2 = SHIFT_JIS_CHARSET;
        Charset charset3 = PLATFORM_DEFAULT_ENCODING;
        if (!charset2.equals(charset3) && !forName.equals(charset3)) {
            z = false;
        } else {
            z = true;
        }
        ASSUME_SHIFT_JIS = z;
    }

    private StringUtils() {
    }

    public static Charset guessCharset(byte[] bArr, Map<DecodeHintType, ?> map) {
        boolean z;
        byte b;
        byte[] bArr2 = bArr;
        if (map != null) {
            DecodeHintType decodeHintType = DecodeHintType.CHARACTER_SET;
            if (map.containsKey(decodeHintType)) {
                return Charset.forName(map.get(decodeHintType).toString());
            }
        }
        boolean z2 = true;
        int i = 0;
        if (bArr2.length > 2 && (((b = bArr2[0]) == -2 && bArr2[1] == -1) || (b == -1 && bArr2[1] == -2))) {
            return StandardCharsets.UTF_16;
        }
        int length = bArr2.length;
        if (bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = true;
        boolean z4 = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i3 < length && (z2 || z3 || z4)) {
            int i13 = bArr2[i3] & UnsignedBytes.MAX_VALUE;
            if (z4) {
                if (i4 > 0) {
                    if ((i13 & 128) != 0) {
                        i4--;
                    }
                    z4 = false;
                } else if ((i13 & 128) != 0) {
                    if ((i13 & 64) != 0) {
                        i4++;
                        if ((i13 & 32) == 0) {
                            i6++;
                        } else {
                            i4++;
                            if ((i13 & 16) == 0) {
                                i7++;
                            } else {
                                i4++;
                                if ((i13 & 8) == 0) {
                                    i8++;
                                }
                            }
                        }
                    }
                    z4 = false;
                }
            }
            if (z2) {
                if (i13 > 127 && i13 < 160) {
                    z2 = false;
                } else if (i13 > 159 && (i13 < 192 || i13 == 215 || i13 == 247)) {
                    i10++;
                }
            }
            if (z3) {
                if (i5 > 0) {
                    if (i13 >= 64 && i13 != 127 && i13 <= 252) {
                        i5--;
                    }
                    z3 = false;
                } else {
                    if (i13 != 128 && i13 != 160 && i13 <= 239) {
                        if (i13 > 160 && i13 < 224) {
                            i2++;
                            int i14 = i12 + 1;
                            if (i14 > i9) {
                                i9 = i14;
                                i12 = i9;
                            } else {
                                i12 = i14;
                            }
                            i11 = 0;
                        } else {
                            if (i13 > 127) {
                                i5++;
                                int i15 = i11 + 1;
                                if (i15 > i) {
                                    i = i15;
                                    i11 = i;
                                } else {
                                    i11 = i15;
                                }
                            } else {
                                i11 = 0;
                            }
                            i12 = 0;
                        }
                    }
                    z3 = false;
                }
            }
            i3++;
            bArr2 = bArr;
        }
        if (z4 && i4 > 0) {
            z4 = false;
        }
        if (z3 && i5 > 0) {
            z3 = false;
        }
        if (z4 && (z || i6 + i7 + i8 > 0)) {
            return StandardCharsets.UTF_8;
        }
        if (z3 && (ASSUME_SHIFT_JIS || i9 >= 3 || i >= 3)) {
            return SHIFT_JIS_CHARSET;
        }
        if (z2 && z3) {
            if ((i9 == 2 && i2 == 2) || i10 * 10 >= length) {
                return SHIFT_JIS_CHARSET;
            }
            return StandardCharsets.ISO_8859_1;
        } else if (z2) {
            return StandardCharsets.ISO_8859_1;
        } else {
            if (z3) {
                return SHIFT_JIS_CHARSET;
            }
            if (z4) {
                return StandardCharsets.UTF_8;
            }
            return PLATFORM_DEFAULT_ENCODING;
        }
    }

    public static String guessEncoding(byte[] bArr, Map<DecodeHintType, ?> map) {
        Charset guessCharset = guessCharset(bArr, map);
        if (guessCharset.equals(SHIFT_JIS_CHARSET)) {
            return SHIFT_JIS;
        }
        if (guessCharset.equals(StandardCharsets.UTF_8)) {
            return "UTF8";
        }
        if (guessCharset.equals(StandardCharsets.ISO_8859_1)) {
            return "ISO8859_1";
        }
        return guessCharset.name();
    }
}
