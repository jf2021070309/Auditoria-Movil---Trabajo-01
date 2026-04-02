package com.google.zxing.qrcode.decoder;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.StringUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
/* loaded from: classes4.dex */
final class DecodedBitStreamParser {
    private static final char[] ALPHANUMERIC_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
    private static final int GB2312_SUBSET = 1;

    /* renamed from: com.google.zxing.qrcode.decoder.DecodedBitStreamParser$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$qrcode$decoder$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$qrcode$decoder$Mode = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private DecodedBitStreamParser() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static DecoderResult decode(byte[] bArr, Version version, ErrorCorrectionLevel errorCorrectionLevel, Map<DecodeHintType, ?> map) throws FormatException {
        Mode forBits;
        int i;
        int i2;
        int i3;
        Mode mode;
        int i4;
        int i5;
        ArrayList arrayList;
        BitSource bitSource = new BitSource(bArr);
        StringBuilder sb = new StringBuilder(50);
        boolean z = true;
        ArrayList arrayList2 = new ArrayList(1);
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i6 = -1;
        int i7 = -1;
        CharacterSetECI characterSetECI = null;
        while (true) {
            try {
                if (bitSource.available() < 4) {
                    forBits = Mode.TERMINATOR;
                } else {
                    forBits = Mode.forBits(bitSource.readBits(4));
                }
                Mode mode2 = forBits;
                int[] iArr = AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode;
                switch (iArr[mode2.ordinal()]) {
                    case 5:
                        i = 3;
                        i2 = 2;
                        mode = mode2;
                        i3 = 4;
                        break;
                    case 6:
                        i = 3;
                        i2 = 2;
                        i3 = 4;
                        z2 = z;
                        z3 = z2;
                        mode = mode2;
                        break;
                    case 7:
                        i = 3;
                        i2 = 2;
                        i3 = 4;
                        z2 = z;
                        z4 = z2;
                        mode = mode2;
                        break;
                    case 8:
                        if (bitSource.available() >= 16) {
                            int readBits = bitSource.readBits(8);
                            i7 = bitSource.readBits(8);
                            i6 = readBits;
                            i = 3;
                            i2 = 2;
                            mode = mode2;
                            i3 = 4;
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                    case 9:
                        characterSetECI = CharacterSetECI.getCharacterSetECIByValue(parseECIValue(bitSource));
                        if (characterSetECI == null) {
                            throw FormatException.getFormatInstance();
                        }
                        i = 3;
                        i2 = 2;
                        mode = mode2;
                        i3 = 4;
                        break;
                    case 10:
                        int readBits2 = bitSource.readBits(4);
                        int readBits3 = bitSource.readBits(mode2.getCharacterCountBits(version));
                        if (readBits2 == z) {
                            decodeHanziSegment(bitSource, sb, readBits3);
                        }
                        i = 3;
                        i2 = 2;
                        mode = mode2;
                        i3 = 4;
                        break;
                    default:
                        int readBits4 = bitSource.readBits(mode2.getCharacterCountBits(version));
                        int i8 = iArr[mode2.ordinal()];
                        if (i8 != z) {
                            if (i8 != 2) {
                                if (i8 != 3) {
                                    if (i8 == 4) {
                                        decodeKanjiSegment(bitSource, sb, readBits4);
                                        i = 3;
                                        i2 = 2;
                                        mode = mode2;
                                        i3 = 4;
                                        break;
                                    } else {
                                        throw FormatException.getFormatInstance();
                                    }
                                } else {
                                    i = 3;
                                    i2 = 2;
                                    mode = mode2;
                                    i3 = 4;
                                    decodeByteSegment(bitSource, sb, readBits4, characterSetECI, arrayList2, map);
                                    break;
                                }
                            } else {
                                i = 3;
                                i2 = 2;
                                mode = mode2;
                                i3 = 4;
                                decodeAlphanumericSegment(bitSource, sb, readBits4, z2);
                                break;
                            }
                        } else {
                            i = 3;
                            i2 = 2;
                            mode = mode2;
                            i3 = 4;
                            decodeNumericSegment(bitSource, sb, readBits4);
                            break;
                        }
                }
                if (mode == Mode.TERMINATOR) {
                    if (characterSetECI != null) {
                        if (z3) {
                            i4 = i3;
                        } else if (z4) {
                            i5 = 6;
                            i4 = i5;
                        } else {
                            i4 = i2;
                        }
                    } else if (z3) {
                        i4 = i;
                    } else if (z4) {
                        i5 = 5;
                        i4 = i5;
                    } else {
                        i4 = 1;
                    }
                    String sb2 = sb.toString();
                    if (arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayList2;
                    }
                    if (errorCorrectionLevel != null) {
                        str = errorCorrectionLevel.toString();
                    }
                    return new DecoderResult(bArr, sb2, arrayList, str, i6, i7, i4);
                }
                z = true;
            } catch (IllegalArgumentException unused) {
                throw FormatException.getFormatInstance();
            }
        }
    }

    private static void decodeAlphanumericSegment(BitSource bitSource, StringBuilder sb, int i, boolean z) throws FormatException {
        while (i > 1) {
            if (bitSource.available() >= 11) {
                int readBits = bitSource.readBits(11);
                sb.append(toAlphaNumericChar(readBits / 45));
                sb.append(toAlphaNumericChar(readBits % 45));
                i -= 2;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (i == 1) {
            if (bitSource.available() >= 6) {
                sb.append(toAlphaNumericChar(bitSource.readBits(6)));
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    private static void decodeByteSegment(BitSource bitSource, StringBuilder sb, int i, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) throws FormatException {
        Charset charset;
        if (i * 8 <= bitSource.available()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) bitSource.readBits(8);
            }
            if (characterSetECI == null) {
                charset = StringUtils.guessCharset(bArr, map);
            } else {
                charset = characterSetECI.getCharset();
            }
            sb.append(new String(bArr, charset));
            collection.add(bArr);
            return;
        }
        throw FormatException.getFormatInstance();
    }

    private static void decodeHanziSegment(BitSource bitSource, StringBuilder sb, int i) throws FormatException {
        int i2;
        if (StringUtils.GB2312_CHARSET != null) {
            if (i * 13 <= bitSource.available()) {
                byte[] bArr = new byte[i * 2];
                int i3 = 0;
                while (i > 0) {
                    int readBits = bitSource.readBits(13);
                    int i4 = (readBits % 96) | ((readBits / 96) << 8);
                    if (i4 < 2560) {
                        i2 = 41377;
                    } else {
                        i2 = 42657;
                    }
                    int i5 = i4 + i2;
                    bArr[i3] = (byte) ((i5 >> 8) & 255);
                    bArr[i3 + 1] = (byte) (i5 & 255);
                    i3 += 2;
                    i--;
                }
                sb.append(new String(bArr, StringUtils.GB2312_CHARSET));
                return;
            }
            throw FormatException.getFormatInstance();
        }
        throw FormatException.getFormatInstance();
    }

    private static void decodeKanjiSegment(BitSource bitSource, StringBuilder sb, int i) throws FormatException {
        int i2;
        if (i * 13 <= bitSource.available()) {
            byte[] bArr = new byte[i * 2];
            int i3 = 0;
            while (i > 0) {
                int readBits = bitSource.readBits(13);
                int i4 = (readBits % 192) | ((readBits / 192) << 8);
                if (i4 < 7936) {
                    i2 = 33088;
                } else {
                    i2 = 49472;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            sb.append(new String(bArr, StringUtils.SHIFT_JIS_CHARSET));
            return;
        }
        throw FormatException.getFormatInstance();
    }

    private static void decodeNumericSegment(BitSource bitSource, StringBuilder sb, int i) throws FormatException {
        while (i >= 3) {
            if (bitSource.available() >= 10) {
                int readBits = bitSource.readBits(10);
                if (readBits < 1000) {
                    sb.append(toAlphaNumericChar(readBits / 100));
                    sb.append(toAlphaNumericChar((readBits / 10) % 10));
                    sb.append(toAlphaNumericChar(readBits % 10));
                    i -= 3;
                } else {
                    throw FormatException.getFormatInstance();
                }
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (i == 2) {
            if (bitSource.available() >= 7) {
                int readBits2 = bitSource.readBits(7);
                if (readBits2 < 100) {
                    sb.append(toAlphaNumericChar(readBits2 / 10));
                    sb.append(toAlphaNumericChar(readBits2 % 10));
                    return;
                }
                throw FormatException.getFormatInstance();
            }
            throw FormatException.getFormatInstance();
        } else if (i == 1) {
            if (bitSource.available() >= 4) {
                int readBits3 = bitSource.readBits(4);
                if (readBits3 < 10) {
                    sb.append(toAlphaNumericChar(readBits3));
                    return;
                }
                throw FormatException.getFormatInstance();
            }
            throw FormatException.getFormatInstance();
        }
    }

    private static int parseECIValue(BitSource bitSource) throws FormatException {
        int readBits = bitSource.readBits(8);
        if ((readBits & 128) == 0) {
            return readBits & 127;
        }
        if ((readBits & 192) == 128) {
            return bitSource.readBits(8) | ((readBits & 63) << 8);
        }
        if ((readBits & 224) == 192) {
            return bitSource.readBits(16) | ((readBits & 31) << 16);
        }
        throw FormatException.getFormatInstance();
    }

    private static char toAlphaNumericChar(int i) throws FormatException {
        char[] cArr = ALPHANUMERIC_CHARS;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.getFormatInstance();
    }
}
