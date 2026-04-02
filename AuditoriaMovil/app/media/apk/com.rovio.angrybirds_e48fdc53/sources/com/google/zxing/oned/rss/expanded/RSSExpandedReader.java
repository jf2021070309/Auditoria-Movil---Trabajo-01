package com.google.zxing.oned.rss.expanded;

import androidx.renderscript.ScriptIntrinsicBLAS;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import com.qq.e.comm.adevent.AdEventType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class RSSExpandedReader extends AbstractRSSReader {
    private static final int[] a = {7, 5, 4, 3, 1};
    private static final int[] b = {4, 20, 52, 104, AdEventType.VIDEO_PAUSE};
    private static final int[] c = {0, 348, 1388, 2948, 3988};
    private static final int[][] d = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] e = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, AdEventType.VIDEO_INIT, AdEventType.VIDEO_STOP}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, ScriptIntrinsicBLAS.UNIT}, new int[]{185, 133, 188, ScriptIntrinsicBLAS.RIGHT, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, AdEventType.VIDEO_COMPLETE, 196, TTAdConstant.IMAGE_MODE_LIVE}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, AdEventType.VIDEO_READY, AdEventType.VIDEO_CLICKED, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, AdEventType.VIDEO_PAUSE, FacebookRequestErrorClassification.EC_INVALID_TOKEN}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, AdEventType.VIDEO_ERROR, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
    private static final int[][] f = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    private final List<b> g = new ArrayList(11);
    private final List<c> h = new ArrayList();
    private final int[] i = new int[2];
    private boolean j;

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) {
        this.g.clear();
        this.j = false;
        try {
            return a(a(i, bitArray));
        } catch (NotFoundException e2) {
            this.g.clear();
            this.j = true;
            return a(a(i, bitArray));
        }
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.g.clear();
        this.h.clear();
    }

    List<b> a(int i, BitArray bitArray) {
        while (true) {
            try {
                this.g.add(a(bitArray, this.g, i));
            } catch (NotFoundException e2) {
                if (this.g.isEmpty()) {
                    throw e2;
                }
                if (a()) {
                    return this.g;
                }
                boolean z = !this.h.isEmpty();
                a(i, false);
                if (z) {
                    List<b> a2 = a(false);
                    if (a2 == null) {
                        List<b> a3 = a(true);
                        if (a3 != null) {
                            return a3;
                        }
                    } else {
                        return a2;
                    }
                }
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    private List<b> a(boolean z) {
        List<b> list = null;
        if (this.h.size() > 25) {
            this.h.clear();
        } else {
            this.g.clear();
            if (z) {
                Collections.reverse(this.h);
            }
            try {
                list = a(new ArrayList(), 0);
            } catch (NotFoundException e2) {
            }
            if (z) {
                Collections.reverse(this.h);
            }
        }
        return list;
    }

    private List<b> a(List<c> list, int i) {
        while (i < this.h.size()) {
            c cVar = this.h.get(i);
            this.g.clear();
            for (c cVar2 : list) {
                this.g.addAll(cVar2.a());
            }
            this.g.addAll(cVar.a());
            if (b(this.g)) {
                if (a()) {
                    return this.g;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(cVar);
                try {
                    return a(arrayList, i + 1);
                } catch (NotFoundException e2) {
                }
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static boolean b(List<b> list) {
        int[][] iArr;
        boolean z;
        for (int[] iArr2 : f) {
            if (list.size() <= iArr2.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i).c().getValue() != iArr2[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(int i, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= this.h.size()) {
                break;
            }
            c cVar = this.h.get(i2);
            if (cVar.b() > i) {
                z2 = cVar.a(this.g);
                break;
            }
            i2++;
            z3 = cVar.a(this.g);
        }
        if (!z2 && !z3 && !a((Iterable<b>) this.g, (Iterable<c>) this.h)) {
            this.h.add(i2, new c(this.g, i, z));
            a(this.g, this.h);
        }
    }

    private static void a(List<b> list, List<c> list2) {
        boolean z;
        boolean z2;
        Iterator<c> it = list2.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.a().size() != list.size()) {
                Iterator<b> it2 = next.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    b next2 = it2.next();
                    Iterator<b> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z2 = false;
                            continue;
                            break;
                        } else if (next2.equals(it3.next())) {
                            z2 = true;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    private static boolean a(Iterable<b> iterable, Iterable<c> iterable2) {
        boolean z;
        boolean z2;
        for (c cVar : iterable2) {
            Iterator<b> it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    continue;
                    break;
                }
                b next = it.next();
                Iterator<b> it2 = cVar.a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (next.equals(it2.next())) {
                            z2 = true;
                            continue;
                            break;
                        }
                    } else {
                        z2 = false;
                        continue;
                        break;
                    }
                }
                if (!z2) {
                    z = false;
                    continue;
                    break;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    static Result a(List<b> list) {
        String parseInformation = AbstractExpandedDecoder.createDecoder(a.a(list)).parseInformation();
        ResultPoint[] resultPoints = list.get(0).c().getResultPoints();
        ResultPoint[] resultPoints2 = list.get(list.size() - 1).c().getResultPoints();
        return new Result(parseInformation, null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    private boolean a() {
        b bVar = this.g.get(0);
        DataCharacter a2 = bVar.a();
        DataCharacter b2 = bVar.b();
        if (b2 == null) {
            return false;
        }
        int i = 2;
        int checksumPortion = b2.getChecksumPortion();
        for (int i2 = 1; i2 < this.g.size(); i2++) {
            b bVar2 = this.g.get(i2);
            checksumPortion += bVar2.a().getChecksumPortion();
            i++;
            DataCharacter b3 = bVar2.b();
            if (b3 != null) {
                checksumPortion += b3.getChecksumPortion();
                i++;
            }
        }
        return (checksumPortion % AdEventType.VIDEO_LOADING) + ((i + (-4)) * AdEventType.VIDEO_LOADING) == a2.getValue();
    }

    private static int a(BitArray bitArray, int i) {
        if (bitArray.get(i)) {
            return bitArray.getNextSet(bitArray.getNextUnset(i));
        }
        return bitArray.getNextUnset(bitArray.getNextSet(i));
    }

    b a(BitArray bitArray, List<b> list, int i) {
        boolean z;
        FinderPattern a2;
        DataCharacter dataCharacter;
        boolean z2 = list.size() % 2 == 0;
        if (this.j) {
            z = !z2;
        } else {
            z = z2;
        }
        int i2 = -1;
        boolean z3 = true;
        do {
            b(bitArray, list, i2);
            a2 = a(bitArray, i, z);
            if (a2 == null) {
                i2 = a(bitArray, this.i[0]);
                continue;
            } else {
                z3 = false;
                continue;
            }
        } while (z3);
        DataCharacter a3 = a(bitArray, a2, z, true);
        if (!list.isEmpty() && list.get(list.size() - 1).d()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            dataCharacter = a(bitArray, a2, z, false);
        } catch (NotFoundException e2) {
            dataCharacter = null;
        }
        return new b(a3, dataCharacter, a2, true);
    }

    private void b(BitArray bitArray, List<b> list, int i) {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        if (i < 0) {
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = list.get(list.size() - 1).c().getStartEnd()[1];
            }
        }
        boolean z = list.size() % 2 != 0;
        if (this.j) {
            z = !z;
        }
        boolean z2 = false;
        int i2 = i;
        while (i2 < size) {
            z2 = !bitArray.get(i2);
            if (!z2) {
                break;
            }
            i2++;
        }
        int i3 = i2;
        int i4 = 0;
        boolean z3 = z2;
        int i5 = i3;
        for (int i6 = i2; i6 < size; i6++) {
            if (bitArray.get(i6) ^ z3) {
                decodeFinderCounters[i4] = decodeFinderCounters[i4] + 1;
            } else {
                if (i4 == 3) {
                    if (z) {
                        a(decodeFinderCounters);
                    }
                    if (isFinderPattern(decodeFinderCounters)) {
                        this.i[0] = i5;
                        this.i[1] = i6;
                        return;
                    }
                    if (z) {
                        a(decodeFinderCounters);
                    }
                    i5 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i4--;
                } else {
                    i4++;
                }
                decodeFinderCounters[i4] = 1;
                z3 = !z3;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static void a(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(length - i) - 1];
            iArr[(length - i) - 1] = i2;
        }
    }

    private FinderPattern a(BitArray bitArray, int i, boolean z) {
        int i2;
        int nextUnset;
        int i3;
        if (z) {
            int i4 = this.i[0] - 1;
            while (i4 >= 0 && !bitArray.get(i4)) {
                i4--;
            }
            i2 = i4 + 1;
            i3 = this.i[0] - i2;
            nextUnset = this.i[1];
        } else {
            i2 = this.i[0];
            nextUnset = bitArray.getNextUnset(this.i[1] + 1);
            i3 = nextUnset - this.i[1];
        }
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i3;
        try {
            return new FinderPattern(parseFinderValue(decodeFinderCounters, d), new int[]{i2, nextUnset}, i2, nextUnset, i);
        } catch (NotFoundException e2) {
            return null;
        }
    }

    DataCharacter a(BitArray bitArray, FinderPattern finderPattern, boolean z, boolean z2) {
        int[] dataCharacterCounters = getDataCharacterCounters();
        dataCharacterCounters[0] = 0;
        dataCharacterCounters[1] = 0;
        dataCharacterCounters[2] = 0;
        dataCharacterCounters[3] = 0;
        dataCharacterCounters[4] = 0;
        dataCharacterCounters[5] = 0;
        dataCharacterCounters[6] = 0;
        dataCharacterCounters[7] = 0;
        if (z2) {
            recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            recordPattern(bitArray, finderPattern.getStartEnd()[1], dataCharacterCounters);
            int i = 0;
            for (int length = dataCharacterCounters.length - 1; i < length; length--) {
                int i2 = dataCharacterCounters[i];
                dataCharacterCounters[i] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i2;
                i++;
            }
        }
        float sum = MathUtils.sum(dataCharacterCounters) / 17.0f;
        float f2 = (finderPattern.getStartEnd()[1] - finderPattern.getStartEnd()[0]) / 15.0f;
        if (Math.abs(sum - f2) / f2 > 0.3f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i3 = 0; i3 < dataCharacterCounters.length; i3++) {
            float f3 = (1.0f * dataCharacterCounters[i3]) / sum;
            int i4 = (int) (0.5f + f3);
            if (i4 <= 0) {
                if (f3 < 0.3f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i4 = 1;
            } else if (i4 > 8) {
                if (f3 > 8.7f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i4 = 8;
            }
            int i5 = i3 / 2;
            if ((i3 & 1) == 0) {
                oddCounts[i5] = i4;
                oddRoundingErrors[i5] = f3 - i4;
            } else {
                evenCounts[i5] = i4;
                evenRoundingErrors[i5] = f3 - i4;
            }
        }
        a(17);
        int value = ((z2 ? 0 : 1) + ((finderPattern.getValue() * 4) + (z ? 0 : 2))) - 1;
        int i6 = 0;
        int length2 = oddCounts.length - 1;
        int i7 = 0;
        while (length2 >= 0) {
            if (a(finderPattern, z, z2)) {
                i7 += e[value][length2 * 2] * oddCounts[length2];
            }
            length2--;
            i6 = oddCounts[length2] + i6;
        }
        int i8 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            if (a(finderPattern, z, z2)) {
                i8 += e[value][(length3 * 2) + 1] * evenCounts[length3];
            }
        }
        int i9 = i7 + i8;
        if ((i6 & 1) != 0 || i6 > 13 || i6 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i10 = (13 - i6) / 2;
        int i11 = a[i10];
        return new DataCharacter(c[i10] + (RSSUtils.getRSSvalue(oddCounts, i11, true) * b[i10]) + RSSUtils.getRSSvalue(evenCounts, 9 - i11, false), i9);
    }

    private static boolean a(FinderPattern finderPattern, boolean z, boolean z2) {
        return (finderPattern.getValue() == 0 && z && z2) ? false : true;
    }

    private void a(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        int sum = MathUtils.sum(getOddCounts());
        int sum2 = MathUtils.sum(getEvenCounts());
        if (sum > 13) {
            z = true;
            z2 = false;
        } else if (sum < 4) {
            z = false;
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        if (sum2 > 13) {
            z3 = true;
            z4 = false;
        } else if (sum2 < 4) {
            z3 = false;
            z4 = true;
        } else {
            z3 = false;
            z4 = false;
        }
        int i2 = (sum + sum2) - i;
        boolean z8 = (sum & 1) == 1;
        boolean z9 = (sum2 & 1) == 0;
        if (i2 == 1) {
            if (z8) {
                if (z9) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z6 = z2;
                z7 = z4;
                z5 = true;
            } else if (!z9) {
                throw NotFoundException.getNotFoundInstance();
            } else {
                z3 = true;
                z7 = z4;
                z5 = z;
                z6 = z2;
            }
        } else if (i2 == -1) {
            if (z8) {
                if (z9) {
                    throw NotFoundException.getNotFoundInstance();
                }
                boolean z10 = z4;
                z5 = z;
                z6 = true;
                z7 = z10;
            } else if (!z9) {
                throw NotFoundException.getNotFoundInstance();
            } else {
                z5 = z;
                z6 = z2;
            }
        } else if (i2 == 0) {
            if (z8) {
                if (!z9) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (sum < sum2) {
                    z3 = true;
                    boolean z11 = z4;
                    z5 = z;
                    z6 = true;
                    z7 = z11;
                } else {
                    z5 = true;
                    z6 = z2;
                }
            } else if (z9) {
                throw NotFoundException.getNotFoundInstance();
            } else {
                z7 = z4;
                z5 = z;
                z6 = z2;
            }
        } else {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z6) {
            if (z5) {
                throw NotFoundException.getNotFoundInstance();
            }
            increment(getOddCounts(), getOddRoundingErrors());
        }
        if (z5) {
            decrement(getOddCounts(), getOddRoundingErrors());
        }
        if (z7) {
            if (z3) {
                throw NotFoundException.getNotFoundInstance();
            }
            increment(getEvenCounts(), getOddRoundingErrors());
        }
        if (z3) {
            decrement(getEvenCounts(), getEvenRoundingErrors());
        }
    }
}
