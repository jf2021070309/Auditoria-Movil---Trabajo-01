package com.google.zxing.qrcode.encoder;

import com.amazon.aps.iva.e4.t0;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.ECIEncoderSet;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class MinimalEncoder {
    private final ErrorCorrectionLevel ecLevel;
    private final ECIEncoderSet encoders;
    private final boolean isGS1;
    private final String stringToEncode;

    /* renamed from: com.google.zxing.qrcode.encoder.MinimalEncoder$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$qrcode$decoder$Mode;
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$qrcode$encoder$MinimalEncoder$VersionSize;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$qrcode$decoder$Mode = iArr;
            try {
                iArr[Mode.KANJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[VersionSize.values().length];
            $SwitchMap$com$google$zxing$qrcode$encoder$MinimalEncoder$VersionSize = iArr2;
            try {
                iArr2[VersionSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$encoder$MinimalEncoder$VersionSize[VersionSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$encoder$MinimalEncoder$VersionSize[VersionSize.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class Edge {
        private final int cachedTotalSize;
        private final int characterLength;
        private final int charsetEncoderIndex;
        private final int fromPosition;
        private final Mode mode;
        private final Edge previous;

        public /* synthetic */ Edge(MinimalEncoder minimalEncoder, Mode mode, int i, int i2, int i3, Edge edge, Version version, AnonymousClass1 anonymousClass1) {
            this(mode, i, i2, i3, edge, version);
        }

        private Edge(Mode mode, int i, int i2, int i3, Edge edge, Version version) {
            this.mode = mode;
            this.fromPosition = i;
            Mode mode2 = Mode.BYTE;
            int i4 = (mode == mode2 || edge == null) ? i2 : edge.charsetEncoderIndex;
            this.charsetEncoderIndex = i4;
            this.characterLength = i3;
            this.previous = edge;
            boolean z = false;
            int i5 = edge != null ? edge.cachedTotalSize : 0;
            if ((mode == mode2 && edge == null && i4 != 0) || (edge != null && i4 != edge.charsetEncoderIndex)) {
                z = true;
            }
            i5 = (edge == null || mode != edge.mode || z) ? i5 + mode.getCharacterCountBits(version) + 4 : i5;
            int i6 = AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode.ordinal()];
            if (i6 == 1) {
                i5 += 13;
            } else if (i6 == 2) {
                i5 += i3 == 1 ? 6 : 11;
            } else if (i6 == 3) {
                i5 += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
            } else if (i6 == 4) {
                i5 += MinimalEncoder.this.encoders.encode(MinimalEncoder.this.stringToEncode.substring(i, i3 + i), i2).length * 8;
                if (z) {
                    i5 += 12;
                }
            }
            this.cachedTotalSize = i5;
        }
    }

    /* loaded from: classes4.dex */
    public final class ResultList {
        private final List<ResultNode> list = new ArrayList();
        private final Version version;

        /* loaded from: classes4.dex */
        public final class ResultNode {
            private final int characterLength;
            private final int charsetEncoderIndex;
            private final int fromPosition;
            private final Mode mode;

            public ResultNode(Mode mode, int i, int i2, int i3) {
                this.mode = mode;
                this.fromPosition = i;
                this.charsetEncoderIndex = i2;
                this.characterLength = i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void getBits(BitArray bitArray) throws WriterException {
                bitArray.appendBits(this.mode.getBits(), 4);
                if (this.characterLength > 0) {
                    bitArray.appendBits(getCharacterCountIndicator(), this.mode.getCharacterCountBits(ResultList.this.version));
                }
                if (this.mode == Mode.ECI) {
                    bitArray.appendBits(MinimalEncoder.this.encoders.getECIValue(this.charsetEncoderIndex), 8);
                } else if (this.characterLength > 0) {
                    String str = MinimalEncoder.this.stringToEncode;
                    int i = this.fromPosition;
                    Encoder.appendBytes(str.substring(i, this.characterLength + i), this.mode, bitArray, MinimalEncoder.this.encoders.getCharset(this.charsetEncoderIndex));
                }
            }

            private int getCharacterCountIndicator() {
                if (this.mode == Mode.BYTE) {
                    ECIEncoderSet eCIEncoderSet = MinimalEncoder.this.encoders;
                    String str = MinimalEncoder.this.stringToEncode;
                    int i = this.fromPosition;
                    return eCIEncoderSet.encode(str.substring(i, this.characterLength + i), this.charsetEncoderIndex).length;
                }
                return this.characterLength;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int getSize(Version version) {
                int i = 4;
                int characterCountBits = this.mode.getCharacterCountBits(version) + 4;
                int i2 = AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[this.mode.ordinal()];
                if (i2 != 1) {
                    int i3 = 0;
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    return characterCountBits + 8;
                                }
                                return characterCountBits;
                            }
                            i = getCharacterCountIndicator() * 8;
                        } else {
                            int i4 = this.characterLength;
                            characterCountBits = t0.c(i4, 3, 10, characterCountBits);
                            int i5 = i4 % 3;
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    i = 7;
                                } else {
                                    i = 0;
                                }
                            }
                        }
                    } else {
                        int i6 = this.characterLength;
                        int c = t0.c(i6, 2, 11, characterCountBits);
                        if (i6 % 2 == 1) {
                            i3 = 6;
                        }
                        return c + i3;
                    }
                } else {
                    i = this.characterLength * 13;
                }
                return characterCountBits + i;
            }

            private String makePrintable(String str) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= ' ' && str.charAt(i) <= '~') {
                        sb.append(str.charAt(i));
                    } else {
                        sb.append('.');
                    }
                }
                return sb.toString();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(this.mode);
                sb.append('(');
                if (this.mode != Mode.ECI) {
                    String str = MinimalEncoder.this.stringToEncode;
                    int i = this.fromPosition;
                    sb.append(makePrintable(str.substring(i, this.characterLength + i)));
                } else {
                    sb.append(MinimalEncoder.this.encoders.getCharset(this.charsetEncoderIndex).displayName());
                }
                sb.append(')');
                return sb.toString();
            }
        }

        public ResultList(Version version, Edge edge) {
            int i;
            int i2;
            boolean z;
            int i3 = 0;
            boolean z2 = false;
            while (true) {
                i = 1;
                if (edge == null) {
                    break;
                }
                int i4 = i3 + edge.characterLength;
                Edge edge2 = edge.previous;
                if ((edge.mode == Mode.BYTE && edge2 == null && edge.charsetEncoderIndex != 0) || (edge2 != null && edge.charsetEncoderIndex != edge2.charsetEncoderIndex)) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z ? true : z2;
                if (edge2 == null || edge2.mode != edge.mode || z) {
                    this.list.add(0, new ResultNode(edge.mode, edge.fromPosition, edge.charsetEncoderIndex, i4));
                    i4 = 0;
                }
                if (z) {
                    this.list.add(0, new ResultNode(Mode.ECI, edge.fromPosition, edge.charsetEncoderIndex, 0));
                }
                edge = edge2;
                i3 = i4;
            }
            if (MinimalEncoder.this.isGS1) {
                ResultNode resultNode = this.list.get(0);
                if (resultNode != null) {
                    Mode mode = resultNode.mode;
                    Mode mode2 = Mode.ECI;
                    if (mode != mode2 && z2) {
                        this.list.add(0, new ResultNode(mode2, 0, 0, 0));
                    }
                }
                this.list.add(this.list.get(0).mode == Mode.ECI ? 1 : 0, new ResultNode(Mode.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int versionNumber = version.getVersionNumber();
            int i5 = AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$encoder$MinimalEncoder$VersionSize[MinimalEncoder.getVersionSize(version).ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    i = 27;
                    i2 = 40;
                } else {
                    i = 10;
                    i2 = 26;
                }
            } else {
                i2 = 9;
            }
            int size = getSize(version);
            while (versionNumber < i2 && !Encoder.willFit(size, Version.getVersionForNumber(versionNumber), MinimalEncoder.this.ecLevel)) {
                versionNumber++;
            }
            while (versionNumber > i && Encoder.willFit(size, Version.getVersionForNumber(versionNumber - 1), MinimalEncoder.this.ecLevel)) {
                versionNumber--;
            }
            this.version = Version.getVersionForNumber(versionNumber);
        }

        public void getBits(BitArray bitArray) throws WriterException {
            for (ResultNode resultNode : this.list) {
                resultNode.getBits(bitArray);
            }
        }

        public int getSize() {
            return getSize(this.version);
        }

        public Version getVersion() {
            return this.version;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            ResultNode resultNode = null;
            for (ResultNode resultNode2 : this.list) {
                if (resultNode != null) {
                    sb.append(",");
                }
                sb.append(resultNode2.toString());
                resultNode = resultNode2;
            }
            return sb.toString();
        }

        private int getSize(Version version) {
            int i = 0;
            for (ResultNode resultNode : this.list) {
                i += resultNode.getSize(version);
            }
            return i;
        }
    }

    /* loaded from: classes4.dex */
    public enum VersionSize {
        SMALL("version 1-9"),
        MEDIUM("version 10-26"),
        LARGE("version 27-40");
        
        private final String description;

        VersionSize(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    public MinimalEncoder(String str, Charset charset, boolean z, ErrorCorrectionLevel errorCorrectionLevel) {
        this.stringToEncode = str;
        this.isGS1 = z;
        this.encoders = new ECIEncoderSet(str, charset, -1);
        this.ecLevel = errorCorrectionLevel;
    }

    public static ResultList encode(String str, Version version, Charset charset, boolean z, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        return new MinimalEncoder(str, charset, z, errorCorrectionLevel).encode(version);
    }

    public static int getCompactedOrdinal(Mode mode) {
        int i;
        if (mode == null || (i = AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode.ordinal()]) == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new IllegalStateException("Illegal mode " + mode);
    }

    public static Version getVersion(VersionSize versionSize) {
        int i = AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$encoder$MinimalEncoder$VersionSize[versionSize.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return Version.getVersionForNumber(40);
            }
            return Version.getVersionForNumber(26);
        }
        return Version.getVersionForNumber(9);
    }

    public static VersionSize getVersionSize(Version version) {
        if (version.getVersionNumber() <= 9) {
            return VersionSize.SMALL;
        }
        if (version.getVersionNumber() <= 26) {
            return VersionSize.MEDIUM;
        }
        return VersionSize.LARGE;
    }

    public static boolean isAlphanumeric(char c) {
        if (Encoder.getAlphanumericCode(c) != -1) {
            return true;
        }
        return false;
    }

    public static boolean isDoubleByteKanji(char c) {
        return Encoder.isOnlyDoubleByteKanji(String.valueOf(c));
    }

    public static boolean isNumeric(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    public void addEdge(Edge[][][] edgeArr, int i, Edge edge) {
        Edge[] edgeArr2 = edgeArr[i + edge.characterLength][edge.charsetEncoderIndex];
        int compactedOrdinal = getCompactedOrdinal(edge.mode);
        Edge edge2 = edgeArr2[compactedOrdinal];
        if (edge2 == null || edge2.cachedTotalSize > edge.cachedTotalSize) {
            edgeArr2[compactedOrdinal] = edge;
        }
    }

    public void addEdges(Version version, Edge[][][] edgeArr, int i, Edge edge) {
        int i2;
        int i3;
        int length = this.encoders.length();
        int priorityEncoderIndex = this.encoders.getPriorityEncoderIndex();
        if (priorityEncoderIndex >= 0 && this.encoders.canEncode(this.stringToEncode.charAt(i), priorityEncoderIndex)) {
            length = priorityEncoderIndex + 1;
        } else {
            priorityEncoderIndex = 0;
        }
        int i4 = length;
        for (int i5 = priorityEncoderIndex; i5 < i4; i5++) {
            if (this.encoders.canEncode(this.stringToEncode.charAt(i), i5)) {
                addEdge(edgeArr, i, new Edge(this, Mode.BYTE, i, i5, 1, edge, version, null));
            }
        }
        Mode mode = Mode.KANJI;
        if (canEncode(mode, this.stringToEncode.charAt(i))) {
            addEdge(edgeArr, i, new Edge(this, mode, i, 0, 1, edge, version, null));
        }
        int length2 = this.stringToEncode.length();
        Mode mode2 = Mode.ALPHANUMERIC;
        if (canEncode(mode2, this.stringToEncode.charAt(i))) {
            int i6 = i + 1;
            if (i6 < length2 && canEncode(mode2, this.stringToEncode.charAt(i6))) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            addEdge(edgeArr, i, new Edge(this, mode2, i, 0, i3, edge, version, null));
        }
        Mode mode3 = Mode.NUMERIC;
        if (canEncode(mode3, this.stringToEncode.charAt(i))) {
            int i7 = i + 1;
            if (i7 < length2 && canEncode(mode3, this.stringToEncode.charAt(i7))) {
                int i8 = i + 2;
                if (i8 < length2 && canEncode(mode3, this.stringToEncode.charAt(i8))) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
            } else {
                i2 = 1;
            }
            addEdge(edgeArr, i, new Edge(this, mode3, i, 0, i2, edge, version, null));
        }
    }

    public boolean canEncode(Mode mode, char c) {
        int i = AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return true;
                    }
                    return false;
                }
                return isNumeric(c);
            }
            return isAlphanumeric(c);
        }
        return isDoubleByteKanji(c);
    }

    public ResultList encodeSpecificVersion(Version version) throws WriterException {
        int length = this.stringToEncode.length();
        Edge[][][] edgeArr = (Edge[][][]) Array.newInstance(Edge.class, length + 1, this.encoders.length(), 4);
        addEdges(version, edgeArr, 0, null);
        for (int i = 1; i <= length; i++) {
            for (int i2 = 0; i2 < this.encoders.length(); i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    Edge edge = edgeArr[i][i2][i3];
                    if (edge != null && i < length) {
                        addEdges(version, edgeArr, i, edge);
                    }
                }
            }
        }
        int i4 = -1;
        int i5 = Integer.MAX_VALUE;
        int i6 = -1;
        for (int i7 = 0; i7 < this.encoders.length(); i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                Edge edge2 = edgeArr[length][i7][i8];
                if (edge2 != null && edge2.cachedTotalSize < i5) {
                    i5 = edge2.cachedTotalSize;
                    i4 = i7;
                    i6 = i8;
                }
            }
        }
        if (i4 >= 0) {
            return new ResultList(version, edgeArr[length][i4][i6]);
        }
        throw new WriterException(b.c(new StringBuilder("Internal error: failed to encode \""), this.stringToEncode, "\""));
    }

    public ResultList encode(Version version) throws WriterException {
        if (version == null) {
            Version[] versionArr = {getVersion(VersionSize.SMALL), getVersion(VersionSize.MEDIUM), getVersion(VersionSize.LARGE)};
            ResultList[] resultListArr = {encodeSpecificVersion(versionArr[0]), encodeSpecificVersion(versionArr[1]), encodeSpecificVersion(versionArr[2])};
            int i = Integer.MAX_VALUE;
            int i2 = -1;
            for (int i3 = 0; i3 < 3; i3++) {
                int size = resultListArr[i3].getSize();
                if (Encoder.willFit(size, versionArr[i3], this.ecLevel) && size < i) {
                    i2 = i3;
                    i = size;
                }
            }
            if (i2 >= 0) {
                return resultListArr[i2];
            }
            throw new WriterException("Data too big for any version");
        }
        ResultList encodeSpecificVersion = encodeSpecificVersion(version);
        if (Encoder.willFit(encodeSpecificVersion.getSize(), getVersion(getVersionSize(encodeSpecificVersion.getVersion())), this.ecLevel)) {
            return encodeSpecificVersion;
        }
        throw new WriterException("Data too big for version" + version);
    }
}
