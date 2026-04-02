package com.google.zxing.aztec.decoder;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.AppEventsConstants;
import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.kuaishou.weapon.p0.t;
import com.umeng.analytics.pro.bg;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class Decoder {
    private static final String[] a = {"CTRL_PS", " ", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] b = {"CTRL_PS", " ", "a", t.l, "c", t.t, "e", "f", "g", bg.aG, "i", "j", t.a, t.d, t.m, t.h, "o", "p", "q", t.k, "s", bg.aI, "u", "v", "w", "x", "y", bg.aD, "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] c = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] d = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    private static final String[] e = {"CTRL_PS", " ", AppEventsConstants.EVENT_PARAM_VALUE_NO, "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};
    private AztecDetectorResult f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum a {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public DecoderResult decode(AztecDetectorResult aztecDetectorResult) {
        this.f = aztecDetectorResult;
        boolean[] c2 = c(a(aztecDetectorResult.getBits()));
        DecoderResult decoderResult = new DecoderResult(a(c2), b(c2), null, null);
        decoderResult.setNumBits(c2.length);
        return decoderResult;
    }

    public static String highLevelDecode(boolean[] zArr) {
        return b(zArr);
    }

    private static String b(boolean[] zArr) {
        int i;
        a aVar;
        int length = zArr.length;
        a aVar2 = a.UPPER;
        a aVar3 = a.UPPER;
        StringBuilder sb = new StringBuilder(20);
        int i2 = 0;
        a aVar4 = aVar3;
        while (i2 < length) {
            if (aVar4 == a.BINARY) {
                if (length - i2 < 5) {
                    break;
                }
                int a2 = a(zArr, i2, 5);
                int i3 = i2 + 5;
                if (a2 == 0) {
                    if (length - i3 < 11) {
                        break;
                    }
                    a2 = a(zArr, i3, 11) + 31;
                    i3 += 11;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= a2) {
                        i = i3;
                        break;
                    } else if (length - i3 < 8) {
                        i = length;
                        break;
                    } else {
                        sb.append((char) a(zArr, i3, 8));
                        i4++;
                        i3 += 8;
                    }
                }
                i2 = i;
                aVar4 = aVar2;
            } else {
                int i5 = aVar4 == a.DIGIT ? 4 : 5;
                if (length - i2 < i5) {
                    break;
                }
                int a3 = a(zArr, i2, i5);
                i2 += i5;
                String a4 = a(aVar4, a3);
                if (a4.startsWith("CTRL_")) {
                    aVar = a(a4.charAt(5));
                    if (a4.charAt(6) == 'L') {
                        aVar4 = aVar;
                        aVar2 = aVar;
                    } else {
                        aVar2 = aVar4;
                    }
                } else {
                    sb.append(a4);
                    aVar = aVar2;
                }
                aVar4 = aVar;
            }
        }
        return sb.toString();
    }

    private static a a(char c2) {
        switch (c2) {
            case 'B':
                return a.BINARY;
            case 'D':
                return a.DIGIT;
            case 'L':
                return a.LOWER;
            case 'M':
                return a.MIXED;
            case 'P':
                return a.PUNCT;
            default:
                return a.UPPER;
        }
    }

    private static String a(a aVar, int i) {
        switch (aVar) {
            case UPPER:
                return a[i];
            case LOWER:
                return b[i];
            case MIXED:
                return c[i];
            case PUNCT:
                return d[i];
            case DIGIT:
                return e[i];
            default:
                throw new IllegalStateException("Bad table");
        }
    }

    private boolean[] c(boolean[] zArr) {
        GenericGF genericGF;
        int i;
        int i2 = 8;
        if (this.f.getNbLayers() <= 2) {
            i2 = 6;
            genericGF = GenericGF.AZTEC_DATA_6;
        } else if (this.f.getNbLayers() <= 8) {
            genericGF = GenericGF.AZTEC_DATA_8;
        } else if (this.f.getNbLayers() <= 22) {
            i2 = 10;
            genericGF = GenericGF.AZTEC_DATA_10;
        } else {
            i2 = 12;
            genericGF = GenericGF.AZTEC_DATA_12;
        }
        int nbDatablocks = this.f.getNbDatablocks();
        int length = zArr.length / i2;
        if (length < nbDatablocks) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr = new int[length];
        int length2 = zArr.length % i2;
        int i3 = 0;
        while (i3 < length) {
            iArr[i3] = a(zArr, length2, i2);
            i3++;
            length2 += i2;
        }
        try {
            new ReedSolomonDecoder(genericGF).decode(iArr, length - nbDatablocks);
            int i4 = (1 << i2) - 1;
            int i5 = 0;
            for (int i6 = 0; i6 < nbDatablocks; i6++) {
                int i7 = iArr[i6];
                if (i7 == 0 || i7 == i4) {
                    throw FormatException.getFormatInstance();
                }
                if (i7 == 1 || i7 == i4 - 1) {
                    i5++;
                }
            }
            boolean[] zArr2 = new boolean[(nbDatablocks * i2) - i5];
            int i8 = 0;
            int i9 = 0;
            while (i8 < nbDatablocks) {
                int i10 = iArr[i8];
                if (i10 == 1 || i10 == i4 - 1) {
                    Arrays.fill(zArr2, i9, (i9 + i2) - 1, i10 > 1);
                    i = (i2 - 1) + i9;
                } else {
                    int i11 = i2 - 1;
                    while (i11 >= 0) {
                        int i12 = i9 + 1;
                        zArr2[i9] = ((1 << i11) & i10) != 0;
                        i11--;
                        i9 = i12;
                    }
                    i = i9;
                }
                i8++;
                i9 = i;
            }
            return zArr2;
        } catch (ReedSolomonException e2) {
            throw FormatException.getFormatInstance(e2);
        }
    }

    private boolean[] a(BitMatrix bitMatrix) {
        int i;
        boolean isCompact = this.f.isCompact();
        int nbLayers = this.f.getNbLayers();
        int i2 = (isCompact ? 11 : 14) + (nbLayers << 2);
        int[] iArr = new int[i2];
        boolean[] zArr = new boolean[a(nbLayers, isCompact)];
        if (isCompact) {
            for (int i3 = 0; i3 < iArr.length; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i2 / 2;
            int i5 = ((i2 + 1) + ((((i2 / 2) - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                iArr[(i4 - i6) - 1] = (i5 - i) - 1;
                iArr[i4 + i6] = (i6 / 15) + i6 + i5 + 1;
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < nbLayers; i8++) {
            int i9 = ((nbLayers - i8) << 2) + (isCompact ? 9 : 12);
            int i10 = i8 << 1;
            int i11 = (i2 - 1) - i10;
            for (int i12 = 0; i12 < i9; i12++) {
                int i13 = i12 << 1;
                for (int i14 = 0; i14 < 2; i14++) {
                    zArr[i7 + i13 + i14] = bitMatrix.get(iArr[i10 + i14], iArr[i10 + i12]);
                    zArr[(i9 * 2) + i7 + i13 + i14] = bitMatrix.get(iArr[i10 + i12], iArr[i11 - i14]);
                    zArr[(i9 * 4) + i7 + i13 + i14] = bitMatrix.get(iArr[i11 - i14], iArr[i11 - i12]);
                    zArr[(i9 * 6) + i7 + i13 + i14] = bitMatrix.get(iArr[i11 - i12], iArr[i10 + i14]);
                }
            }
            i7 = (i9 << 3) + i7;
        }
        return zArr;
    }

    private static int a(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    private static byte a(boolean[] zArr, int i) {
        int length = zArr.length - i;
        return length >= 8 ? (byte) a(zArr, i, 8) : (byte) (a(zArr, i, length) << (8 - length));
    }

    static byte[] a(boolean[] zArr) {
        byte[] bArr = new byte[(zArr.length + 7) / 8];
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = a(zArr, i << 3);
        }
        return bArr;
    }

    private static int a(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}
