package com.google.zxing.datamatrix.encoder;

import com.amazon.aps.iva.q.c0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ASCIIEncoder implements Encoder {
    private static char encodeASCIIDigits(char c, char c2) {
        if (HighLevelEncoder.isDigit(c) && HighLevelEncoder.isDigit(c2)) {
            return (char) ((c2 - '0') + ((c - '0') * 10) + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        if (HighLevelEncoder.determineConsecutiveDigitCount(encoderContext.getMessage(), encoderContext.pos) >= 2) {
            encoderContext.writeCodeword(encodeASCIIDigits(encoderContext.getMessage().charAt(encoderContext.pos), encoderContext.getMessage().charAt(encoderContext.pos + 1)));
            encoderContext.pos += 2;
            return;
        }
        char currentChar = encoderContext.getCurrentChar();
        int lookAheadTest = HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode());
        if (lookAheadTest != getEncodingMode()) {
            if (lookAheadTest != 1) {
                if (lookAheadTest != 2) {
                    if (lookAheadTest != 3) {
                        if (lookAheadTest != 4) {
                            if (lookAheadTest == 5) {
                                encoderContext.writeCodeword((char) 231);
                                encoderContext.signalEncoderChange(5);
                                return;
                            }
                            throw new IllegalStateException(c0.a("Illegal mode: ", lookAheadTest));
                        }
                        encoderContext.writeCodeword((char) 240);
                        encoderContext.signalEncoderChange(4);
                        return;
                    }
                    encoderContext.writeCodeword((char) 238);
                    encoderContext.signalEncoderChange(3);
                    return;
                }
                encoderContext.writeCodeword((char) 239);
                encoderContext.signalEncoderChange(2);
                return;
            }
            encoderContext.writeCodeword((char) 230);
            encoderContext.signalEncoderChange(1);
        } else if (HighLevelEncoder.isExtendedASCII(currentChar)) {
            encoderContext.writeCodeword((char) 235);
            encoderContext.writeCodeword((char) ((currentChar - 128) + 1));
            encoderContext.pos++;
        } else {
            encoderContext.writeCodeword((char) (currentChar + 1));
            encoderContext.pos++;
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 0;
    }
}
