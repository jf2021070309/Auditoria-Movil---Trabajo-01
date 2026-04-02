package com.google.zxing.qrcode.encoder;

import com.flurry.android.Constants;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes2.dex */
public final class Encoder {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    private Encoder() {
    }

    private static int a(ByteMatrix byteMatrix) {
        return b.a(byteMatrix) + b.b(byteMatrix) + b.c(byteMatrix) + b.d(byteMatrix);
    }

    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel) {
        return encode(str, errorCorrectionLevel, null);
    }

    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) {
        Version a2;
        CharacterSetECI characterSetECIByName;
        String str2 = "ISO-8859-1";
        if (map != null && map.containsKey(EncodeHintType.CHARACTER_SET)) {
            str2 = map.get(EncodeHintType.CHARACTER_SET).toString();
        }
        Mode a3 = a(str, str2);
        BitArray bitArray = new BitArray();
        if (a3 == Mode.BYTE && !"ISO-8859-1".equals(str2) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(str2)) != null) {
            a(characterSetECIByName, bitArray);
        }
        a(a3, bitArray);
        BitArray bitArray2 = new BitArray();
        a(str, a3, bitArray2, str2);
        if (map != null && map.containsKey(EncodeHintType.QR_VERSION)) {
            a2 = Version.getVersionForNumber(Integer.parseInt(map.get(EncodeHintType.QR_VERSION).toString()));
            if (!a(a(a3, bitArray, bitArray2, a2), a2, errorCorrectionLevel)) {
                throw new WriterException("Data too big for requested version");
            }
        } else {
            a2 = a(errorCorrectionLevel, a3, bitArray, bitArray2);
        }
        BitArray bitArray3 = new BitArray();
        bitArray3.appendBitArray(bitArray);
        a(a3 == Mode.BYTE ? bitArray2.getSizeInBytes() : str.length(), a2, a3, bitArray3);
        bitArray3.appendBitArray(bitArray2);
        Version.ECBlocks eCBlocksForLevel = a2.getECBlocksForLevel(errorCorrectionLevel);
        int totalCodewords = a2.getTotalCodewords() - eCBlocksForLevel.getTotalECCodewords();
        a(totalCodewords, bitArray3);
        BitArray a4 = a(bitArray3, a2.getTotalCodewords(), totalCodewords, eCBlocksForLevel.getNumBlocks());
        QRCode qRCode = new QRCode();
        qRCode.setECLevel(errorCorrectionLevel);
        qRCode.setMode(a3);
        qRCode.setVersion(a2);
        int dimensionForVersion = a2.getDimensionForVersion();
        ByteMatrix byteMatrix = new ByteMatrix(dimensionForVersion, dimensionForVersion);
        int a5 = a(a4, errorCorrectionLevel, a2, byteMatrix);
        qRCode.setMaskPattern(a5);
        c.a(a4, errorCorrectionLevel, a2, a5, byteMatrix);
        qRCode.setMatrix(byteMatrix);
        return qRCode;
    }

    private static Version a(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, BitArray bitArray, BitArray bitArray2) {
        return a(a(mode, bitArray, bitArray2, a(a(mode, bitArray, bitArray2, Version.getVersionForNumber(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    private static int a(Mode mode, BitArray bitArray, BitArray bitArray2, Version version) {
        return bitArray.getSize() + mode.getCharacterCountBits(version) + bitArray2.getSize();
    }

    static int a(int i) {
        if (i < a.length) {
            return a[i];
        }
        return -1;
    }

    public static Mode chooseMode(String str) {
        return a(str, (String) null);
    }

    private static Mode a(String str, String str2) {
        if ("Shift_JIS".equals(str2) && a(str)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (a(charAt) == -1) {
                return Mode.BYTE;
            } else {
                z = true;
            }
        }
        if (z) {
            return Mode.ALPHANUMERIC;
        }
        if (z2) {
            return Mode.NUMERIC;
        }
        return Mode.BYTE;
    }

    private static boolean a(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & Constants.UNKNOWN;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException e) {
            return false;
        }
    }

    private static int a(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, ByteMatrix byteMatrix) {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (i3 < 8) {
            c.a(bitArray, errorCorrectionLevel, version, i3, byteMatrix);
            int a2 = a(byteMatrix);
            if (a2 < i) {
                i2 = i3;
            } else {
                a2 = i;
            }
            i3++;
            i = a2;
        }
        return i2;
    }

    private static Version a(int i, ErrorCorrectionLevel errorCorrectionLevel) {
        for (int i2 = 1; i2 <= 40; i2++) {
            Version versionForNumber = Version.getVersionForNumber(i2);
            if (a(i, versionForNumber, errorCorrectionLevel)) {
                return versionForNumber;
            }
        }
        throw new WriterException("Data too big");
    }

    private static boolean a(int i, Version version, ErrorCorrectionLevel errorCorrectionLevel) {
        return version.getTotalCodewords() - version.getECBlocksForLevel(errorCorrectionLevel).getTotalECCodewords() >= (i + 7) / 8;
    }

    static void a(int i, BitArray bitArray) {
        int i2 = i << 3;
        if (bitArray.getSize() > i2) {
            throw new WriterException("data bits cannot fit in the QR Code" + bitArray.getSize() + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && bitArray.getSize() < i2; i3++) {
            bitArray.appendBit(false);
        }
        int size = bitArray.getSize() & 7;
        if (size > 0) {
            while (size < 8) {
                bitArray.appendBit(false);
                size++;
            }
        }
        int sizeInBytes = i - bitArray.getSizeInBytes();
        for (int i4 = 0; i4 < sizeInBytes; i4++) {
            bitArray.appendBits((i4 & 1) == 0 ? 236 : 17, 8);
        }
        if (bitArray.getSize() != i2) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    static void a(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        if (i4 >= i3) {
            throw new WriterException("Block ID too large");
        }
        int i5 = i % i3;
        int i6 = i3 - i5;
        int i7 = i / i3;
        int i8 = i7 + 1;
        int i9 = i2 / i3;
        int i10 = i9 + 1;
        int i11 = i7 - i9;
        int i12 = i8 - i10;
        if (i11 != i12) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i3 != i6 + i5) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i != (i5 * (i10 + i12)) + ((i9 + i11) * i6)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i4 < i6) {
            iArr[0] = i9;
            iArr2[0] = i11;
            return;
        }
        iArr[0] = i10;
        iArr2[0] = i12;
    }

    static BitArray a(BitArray bitArray, int i, int i2, int i3) {
        if (bitArray.getSizeInBytes() != i2) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList<a> arrayList = new ArrayList(i3);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < i3) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            a(i, i2, i3, i4, iArr, iArr2);
            int i8 = iArr[0];
            byte[] bArr = new byte[i8];
            bitArray.toBytes(i7 << 3, bArr, 0, i8);
            byte[] a2 = a(bArr, iArr2[0]);
            arrayList.add(new a(bArr, a2));
            int max = Math.max(i6, i8);
            i4++;
            i5 = Math.max(i5, a2.length);
            i6 = max;
            i7 = iArr[0] + i7;
        }
        if (i2 != i7) {
            throw new WriterException("Data bytes does not match offset");
        }
        BitArray bitArray2 = new BitArray();
        for (int i9 = 0; i9 < i6; i9++) {
            for (a aVar : arrayList) {
                byte[] a3 = aVar.a();
                if (i9 < a3.length) {
                    bitArray2.appendBits(a3[i9], 8);
                }
            }
        }
        for (int i10 = 0; i10 < i5; i10++) {
            for (a aVar2 : arrayList) {
                byte[] b = aVar2.b();
                if (i10 < b.length) {
                    bitArray2.appendBits(b[i10], 8);
                }
            }
        }
        if (i != bitArray2.getSizeInBytes()) {
            throw new WriterException("Interleaving error: " + i + " and " + bitArray2.getSizeInBytes() + " differ.");
        }
        return bitArray2;
    }

    static byte[] a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & Constants.UNKNOWN;
        }
        new ReedSolomonEncoder(GenericGF.QR_CODE_FIELD_256).encode(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    static void a(Mode mode, BitArray bitArray) {
        bitArray.appendBits(mode.getBits(), 4);
    }

    static void a(int i, Version version, Mode mode, BitArray bitArray) {
        int characterCountBits = mode.getCharacterCountBits(version);
        if (i >= (1 << characterCountBits)) {
            throw new WriterException(i + " is bigger than " + ((1 << characterCountBits) - 1));
        }
        bitArray.appendBits(i, characterCountBits);
    }

    static void a(String str, Mode mode, BitArray bitArray, String str2) {
        switch (mode) {
            case NUMERIC:
                a((CharSequence) str, bitArray);
                return;
            case ALPHANUMERIC:
                b(str, bitArray);
                return;
            case BYTE:
                a(str, bitArray, str2);
                return;
            case KANJI:
                a(str, bitArray);
                return;
            default:
                throw new WriterException("Invalid mode: " + mode);
        }
    }

    static void a(CharSequence charSequence, BitArray bitArray) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            if (i + 2 < length) {
                bitArray.appendBits((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i + 2) - '0'), 10);
                i += 3;
            } else if (i + 1 < length) {
                bitArray.appendBits((charAt * 10) + (charSequence.charAt(i + 1) - '0'), 7);
                i += 2;
            } else {
                bitArray.appendBits(charAt, 4);
                i++;
            }
        }
    }

    static void b(CharSequence charSequence, BitArray bitArray) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int a2 = a(charSequence.charAt(i));
            if (a2 == -1) {
                throw new WriterException();
            }
            if (i + 1 < length) {
                int a3 = a(charSequence.charAt(i + 1));
                if (a3 == -1) {
                    throw new WriterException();
                }
                bitArray.appendBits((a2 * 45) + a3, 11);
                i += 2;
            } else {
                bitArray.appendBits(a2, 6);
                i++;
            }
        }
    }

    static void a(String str, BitArray bitArray, String str2) {
        try {
            for (byte b : str.getBytes(str2)) {
                bitArray.appendBits(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    static void a(String str, BitArray bitArray) {
        int i;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i2 = 0; i2 < length; i2 += 2) {
                int i3 = ((bytes[i2] & Constants.UNKNOWN) << 8) | (bytes[i2 + 1] & Constants.UNKNOWN);
                if (i3 >= 33088 && i3 <= 40956) {
                    i = i3 - 33088;
                } else {
                    i = (i3 < 57408 || i3 > 60351) ? -1 : i3 - 49472;
                }
                if (i == -1) {
                    throw new WriterException("Invalid byte sequence");
                }
                bitArray.appendBits((i & 255) + ((i >> 8) * 192), 13);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    private static void a(CharacterSetECI characterSetECI, BitArray bitArray) {
        bitArray.appendBits(Mode.ECI.getBits(), 4);
        bitArray.appendBits(characterSetECI.getValue(), 8);
    }
}
