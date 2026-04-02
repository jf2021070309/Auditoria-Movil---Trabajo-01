package com.amazon.aps.iva.md0;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
/* compiled from: BitEncoding.java */
/* loaded from: classes4.dex */
public final class a {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 1 && i != 3 && i != 6 && i != 8 && i != 10 && i != 12 && i != 14) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 3 && i != 6 && i != 8 && i != 10 && i != 12 && i != 14) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (i != 1 && i != 3 && i != 6 && i != 8 && i != 10 && i != 12 && i != 14) {
            objArr[0] = "data";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        }
        if (i != 1) {
            if (i != 3) {
                if (i != 6) {
                    if (i != 8) {
                        if (i != 10) {
                            if (i != 12) {
                                if (i != 14) {
                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
                                } else {
                                    objArr[1] = "decode7to8";
                                }
                            } else {
                                objArr[1] = "combineStringArrayIntoBytes";
                            }
                        } else {
                            objArr[1] = "dropMarker";
                        }
                    } else {
                        objArr[1] = "decodeBytes";
                    }
                } else {
                    objArr[1] = "splitBytesToStringArray";
                }
            } else {
                objArr[1] = "encode8to7";
            }
        } else {
            objArr[1] = "encodeBytes";
        }
        switch (i) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 3 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) {
            throw new IllegalStateException(format);
        }
    }

    public static byte[] b(String[] strArr) {
        if (strArr != null) {
            if (strArr.length > 0 && !strArr[0].isEmpty()) {
                char charAt = strArr[0].charAt(0);
                if (charAt == 0) {
                    String[] strArr2 = (String[]) strArr.clone();
                    strArr2[0] = strArr2[0].substring(1);
                    int i = 0;
                    for (String str : strArr2) {
                        i += str.length();
                    }
                    byte[] bArr = new byte[i];
                    int i2 = 0;
                    for (String str2 : strArr2) {
                        int length = str2.length();
                        int i3 = 0;
                        while (i3 < length) {
                            bArr[i2] = (byte) str2.charAt(i3);
                            i3++;
                            i2++;
                        }
                    }
                    return bArr;
                } else if (charAt == 65535) {
                    strArr = (String[]) strArr.clone();
                    strArr[0] = strArr[0].substring(1);
                }
            }
            int i4 = 0;
            for (String str3 : strArr) {
                i4 += str3.length();
            }
            byte[] bArr2 = new byte[i4];
            int i5 = 0;
            for (String str4 : strArr) {
                int length2 = str4.length();
                int i6 = 0;
                while (i6 < length2) {
                    bArr2[i5] = (byte) str4.charAt(i6);
                    i6++;
                    i5++;
                }
            }
            for (int i7 = 0; i7 < i4; i7++) {
                bArr2[i7] = (byte) ((bArr2[i7] + Ascii.DEL) & 127);
            }
            int i8 = (i4 * 7) / 8;
            byte[] bArr3 = new byte[i8];
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < i8; i11++) {
                i9++;
                int i12 = i10 + 1;
                bArr3[i11] = (byte) (((bArr2[i9] & UnsignedBytes.MAX_VALUE) >>> i10) + ((bArr2[i9] & ((1 << i12) - 1)) << (7 - i10)));
                if (i10 == 6) {
                    i9++;
                    i10 = 0;
                } else {
                    i10 = i12;
                }
            }
            return bArr3;
        }
        a(7);
        throw null;
    }
}
