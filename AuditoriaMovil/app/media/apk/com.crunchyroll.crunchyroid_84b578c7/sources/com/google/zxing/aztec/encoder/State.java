package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class State {
    static final State INITIAL_STATE = new State(Token.EMPTY, 0, 0, 0);
    private final int binaryShiftByteCount;
    private final int binaryShiftCost;
    private final int bitCount;
    private final int mode;
    private final Token token;

    private State(Token token, int i, int i2, int i3) {
        this.token = token;
        this.mode = i;
        this.binaryShiftByteCount = i2;
        this.bitCount = i3;
        this.binaryShiftCost = calculateBinaryShiftCost(i2);
    }

    private static int calculateBinaryShiftCost(int i) {
        if (i > 62) {
            return 21;
        }
        if (i > 31) {
            return 20;
        }
        if (i > 0) {
            return 10;
        }
        return 0;
    }

    public State addBinaryShiftChar(int i) {
        int i2;
        Token token = this.token;
        int i3 = this.mode;
        int i4 = this.bitCount;
        if (i3 == 4 || i3 == 2) {
            int i5 = HighLevelEncoder.LATCH_TABLE[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            token = token.add(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.binaryShiftByteCount;
        if (i8 != 0 && i8 != 31) {
            if (i8 == 62) {
                i2 = 9;
            } else {
                i2 = 8;
            }
        } else {
            i2 = 18;
        }
        State state = new State(token, i3, i8 + 1, i4 + i2);
        if (state.binaryShiftByteCount == 2078) {
            return state.endBinaryShift(i + 1);
        }
        return state;
    }

    public State appendFLGn(int i) {
        Token token;
        Token token2 = shiftAndAppend(4, 0).token;
        int i2 = 3;
        if (i < 0) {
            token = token2.add(0, 3);
        } else if (i <= 999999) {
            byte[] bytes = Integer.toString(i).getBytes(StandardCharsets.ISO_8859_1);
            Token add = token2.add(bytes.length, 3);
            for (byte b : bytes) {
                add = add.add((b - 48) + 2, 4);
            }
            i2 = 3 + (bytes.length * 4);
            token = add;
        } else {
            throw new IllegalArgumentException("ECI code must be between 0 and 999999");
        }
        return new State(token, this.mode, 0, this.bitCount + i2);
    }

    public State endBinaryShift(int i) {
        int i2 = this.binaryShiftByteCount;
        if (i2 == 0) {
            return this;
        }
        return new State(this.token.addBinaryShift(i - i2, i2), this.mode, 0, this.bitCount);
    }

    public int getBinaryShiftByteCount() {
        return this.binaryShiftByteCount;
    }

    public int getBitCount() {
        return this.bitCount;
    }

    public int getMode() {
        return this.mode;
    }

    public Token getToken() {
        return this.token;
    }

    public boolean isBetterThanOrEqualTo(State state) {
        int i = this.bitCount + (HighLevelEncoder.LATCH_TABLE[this.mode][state.mode] >> 16);
        int i2 = this.binaryShiftByteCount;
        int i3 = state.binaryShiftByteCount;
        if (i2 < i3) {
            i += state.binaryShiftCost - this.binaryShiftCost;
        } else if (i2 > i3 && i3 > 0) {
            i += 10;
        }
        if (i <= state.bitCount) {
            return true;
        }
        return false;
    }

    public State latchAndAppend(int i, int i2) {
        int i3;
        int i4 = this.bitCount;
        Token token = this.token;
        int i5 = this.mode;
        if (i != i5) {
            int i6 = HighLevelEncoder.LATCH_TABLE[i5][i];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            token = token.add(i7, i8);
            i4 += i8;
        }
        if (i == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new State(token.add(i2, i3), i, 0, i4 + i3);
    }

    public State shiftAndAppend(int i, int i2) {
        int i3;
        Token token = this.token;
        int i4 = this.mode;
        if (i4 == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new State(token.add(HighLevelEncoder.SHIFT_TABLE[i4][i], i3).add(i2, 5), this.mode, 0, this.bitCount + i3 + 5);
    }

    public BitArray toBitArray(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (Token token = endBinaryShift(bArr.length).token; token != null; token = token.getPrevious()) {
            arrayList.add(token);
        }
        BitArray bitArray = new BitArray();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Token) arrayList.get(size)).appendTo(bitArray, bArr);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.MODE_NAMES[this.mode], Integer.valueOf(this.bitCount), Integer.valueOf(this.binaryShiftByteCount));
    }
}
