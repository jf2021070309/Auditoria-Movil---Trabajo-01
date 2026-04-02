package com.google.zxing.qrcode.decoder;

import com.flurry.android.Constants;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;
/* loaded from: classes2.dex */
public final class Decoder {
    private final ReedSolomonDecoder a = new ReedSolomonDecoder(GenericGF.QR_CODE_FIELD_256);

    public DecoderResult decode(boolean[][] zArr) {
        return decode(zArr, (Map<DecodeHintType, ?>) null);
    }

    public DecoderResult decode(boolean[][] zArr, Map<DecodeHintType, ?> map) {
        int length = zArr.length;
        BitMatrix bitMatrix = new BitMatrix(length);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i][i2]) {
                    bitMatrix.set(i2, i);
                }
            }
        }
        return decode(bitMatrix, map);
    }

    public DecoderResult decode(BitMatrix bitMatrix) {
        return decode(bitMatrix, (Map<DecodeHintType, ?>) null);
    }

    public DecoderResult decode(BitMatrix bitMatrix, Map<DecodeHintType, ?> map) {
        FormatException formatException;
        ChecksumException e;
        a aVar = new a(bitMatrix);
        try {
            return a(aVar, map);
        } catch (ChecksumException e2) {
            e = e2;
            formatException = null;
            try {
                aVar.d();
                aVar.a(true);
                aVar.b();
                aVar.a();
                aVar.e();
                DecoderResult a = a(aVar, map);
                a.setOther(new QRCodeDecoderMetaData(true));
                return a;
            } catch (ChecksumException | FormatException e3) {
                if (formatException != null) {
                    throw formatException;
                }
                if (e != null) {
                    throw e;
                }
                throw e3;
            }
        } catch (FormatException e4) {
            formatException = e4;
            e = null;
            aVar.d();
            aVar.a(true);
            aVar.b();
            aVar.a();
            aVar.e();
            DecoderResult a2 = a(aVar, map);
            a2.setOther(new QRCodeDecoderMetaData(true));
            return a2;
        }
    }

    private DecoderResult a(a aVar, Map<DecodeHintType, ?> map) {
        Version b = aVar.b();
        ErrorCorrectionLevel a = aVar.a().a();
        b[] a2 = b.a(aVar.c(), b, a);
        int i = 0;
        for (b bVar : a2) {
            i += bVar.a();
        }
        byte[] bArr = new byte[i];
        int length = a2.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            b bVar2 = a2[i2];
            byte[] b2 = bVar2.b();
            int a3 = bVar2.a();
            a(b2, a3);
            int i4 = i3;
            int i5 = 0;
            while (i5 < a3) {
                bArr[i4] = b2[i5];
                i5++;
                i4++;
            }
            i2++;
            i3 = i4;
        }
        return d.a(bArr, b, a, map);
    }

    private void a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & Constants.UNKNOWN;
        }
        try {
            this.a.decode(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException e) {
            throw ChecksumException.getChecksumInstance();
        }
    }
}
