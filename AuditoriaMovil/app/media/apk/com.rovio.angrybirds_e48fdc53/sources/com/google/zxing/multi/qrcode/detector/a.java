package com.google.zxing.multi.qrcode.detector;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
final class a extends FinderPatternFinder {
    private static final FinderPatternInfo[] a = new FinderPatternInfo[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.zxing.multi.qrcode.detector.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0136a implements Serializable, Comparator<FinderPattern> {
        private C0136a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            float estimatedModuleSize = finderPattern2.getEstimatedModuleSize() - finderPattern.getEstimatedModuleSize();
            if (estimatedModuleSize < PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                return -1;
            }
            return ((double) estimatedModuleSize) > PangleAdapterUtils.CPM_DEFLAUT_VALUE ? 1 : 0;
        }
    }

    a(BitMatrix bitMatrix) {
        super(bitMatrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        super(bitMatrix, resultPointCallback);
    }

    private FinderPattern[][] a() {
        List<FinderPattern> possibleCenters = getPossibleCenters();
        int size = possibleCenters.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (size == 3) {
            return new FinderPattern[][]{new FinderPattern[]{possibleCenters.get(0), possibleCenters.get(1), possibleCenters.get(2)}};
        }
        Collections.sort(possibleCenters, new C0136a());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size - 2) {
                break;
            }
            FinderPattern finderPattern = possibleCenters.get(i2);
            if (finderPattern != null) {
                int i3 = i2 + 1;
                while (true) {
                    int i4 = i3;
                    if (i4 >= size - 1) {
                        break;
                    }
                    FinderPattern finderPattern2 = possibleCenters.get(i4);
                    if (finderPattern2 != null) {
                        float estimatedModuleSize = (finderPattern.getEstimatedModuleSize() - finderPattern2.getEstimatedModuleSize()) / Math.min(finderPattern.getEstimatedModuleSize(), finderPattern2.getEstimatedModuleSize());
                        if (Math.abs(finderPattern.getEstimatedModuleSize() - finderPattern2.getEstimatedModuleSize()) <= 0.5f || estimatedModuleSize < 0.05f) {
                            for (int i5 = i4 + 1; i5 < size; i5++) {
                                FinderPattern finderPattern3 = possibleCenters.get(i5);
                                if (finderPattern3 != null) {
                                    float estimatedModuleSize2 = (finderPattern2.getEstimatedModuleSize() - finderPattern3.getEstimatedModuleSize()) / Math.min(finderPattern2.getEstimatedModuleSize(), finderPattern3.getEstimatedModuleSize());
                                    if (Math.abs(finderPattern2.getEstimatedModuleSize() - finderPattern3.getEstimatedModuleSize()) <= 0.5f || estimatedModuleSize2 < 0.05f) {
                                        FinderPattern[] finderPatternArr = {finderPattern, finderPattern2, finderPattern3};
                                        ResultPoint.orderBestPatterns(finderPatternArr);
                                        FinderPatternInfo finderPatternInfo = new FinderPatternInfo(finderPatternArr);
                                        float distance = ResultPoint.distance(finderPatternInfo.getTopLeft(), finderPatternInfo.getBottomLeft());
                                        float distance2 = ResultPoint.distance(finderPatternInfo.getTopRight(), finderPatternInfo.getBottomLeft());
                                        float distance3 = ResultPoint.distance(finderPatternInfo.getTopLeft(), finderPatternInfo.getTopRight());
                                        float estimatedModuleSize3 = (distance + distance3) / (finderPattern.getEstimatedModuleSize() * 2.0f);
                                        if (estimatedModuleSize3 <= 180.0f && estimatedModuleSize3 >= 9.0f && Math.abs((distance - distance3) / Math.min(distance, distance3)) < 0.1f) {
                                            float sqrt = (float) Math.sqrt((distance3 * distance3) + (distance * distance));
                                            if (Math.abs((distance2 - sqrt) / Math.min(distance2, sqrt)) < 0.1f) {
                                                arrayList.add(finderPatternArr);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i3 = i4 + 1;
                }
            }
            i = i2 + 1;
        }
        if (!arrayList.isEmpty()) {
            return (FinderPattern[][]) arrayList.toArray(new FinderPattern[arrayList.size()]);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public FinderPatternInfo[] a(Map<DecodeHintType, ?> map) {
        boolean z = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        boolean z2 = map != null && map.containsKey(DecodeHintType.PURE_BARCODE);
        BitMatrix image = getImage();
        int height = image.getHeight();
        int width = image.getWidth();
        int i = (((int) ((((float) height) / 228.0f) * 3.0f)) < 3 || z) ? 3 : 3;
        int[] iArr = new int[5];
        for (int i2 = i - 1; i2 < height; i2 += i) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < width; i4++) {
                if (image.get(i4, i2)) {
                    if ((i3 & 1) == 1) {
                        i3++;
                    }
                    iArr[i3] = iArr[i3] + 1;
                } else if ((i3 & 1) == 0) {
                    if (i3 == 4) {
                        if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i2, i4, z2)) {
                            i3 = 0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            iArr[2] = 0;
                            iArr[3] = 0;
                            iArr[4] = 0;
                        } else {
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                            i3 = 3;
                        }
                    } else {
                        i3++;
                        iArr[i3] = iArr[i3] + 1;
                    }
                } else {
                    iArr[i3] = iArr[i3] + 1;
                }
            }
            if (foundPatternCross(iArr)) {
                handlePossibleCenter(iArr, i2, width, z2);
            }
        }
        FinderPattern[][] a2 = a();
        ArrayList arrayList = new ArrayList();
        for (FinderPattern[] finderPatternArr : a2) {
            ResultPoint.orderBestPatterns(finderPatternArr);
            arrayList.add(new FinderPatternInfo(finderPatternArr));
        }
        return arrayList.isEmpty() ? a : (FinderPatternInfo[]) arrayList.toArray(new FinderPatternInfo[arrayList.size()]);
    }
}
