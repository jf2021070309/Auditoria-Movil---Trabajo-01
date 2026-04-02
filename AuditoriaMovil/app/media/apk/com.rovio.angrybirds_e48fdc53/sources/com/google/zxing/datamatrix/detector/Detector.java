package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class Detector {
    private final BitMatrix a;
    private final WhiteRectangleDetector b;

    public Detector(BitMatrix bitMatrix) {
        this.a = bitMatrix;
        this.b = new WhiteRectangleDetector(bitMatrix);
    }

    public DetectorResult detect() {
        ResultPoint resultPoint;
        ResultPoint a2;
        BitMatrix a3;
        ResultPoint resultPoint2 = null;
        ResultPoint[] detect = this.b.detect();
        ResultPoint resultPoint3 = detect[0];
        ResultPoint resultPoint4 = detect[1];
        ResultPoint resultPoint5 = detect[2];
        ResultPoint resultPoint6 = detect[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(b(resultPoint3, resultPoint4));
        arrayList.add(b(resultPoint3, resultPoint5));
        arrayList.add(b(resultPoint4, resultPoint6));
        arrayList.add(b(resultPoint5, resultPoint6));
        Collections.sort(arrayList, new b());
        a aVar = (a) arrayList.get(0);
        a aVar2 = (a) arrayList.get(1);
        HashMap hashMap = new HashMap();
        a(hashMap, aVar.a());
        a(hashMap, aVar.b());
        a(hashMap, aVar2.a());
        a(hashMap, aVar2.b());
        ResultPoint resultPoint7 = null;
        ResultPoint resultPoint8 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            ResultPoint resultPoint9 = (ResultPoint) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                resultPoint7 = resultPoint9;
            } else if (resultPoint8 == null) {
                resultPoint8 = resultPoint9;
            } else {
                resultPoint2 = resultPoint9;
            }
        }
        if (resultPoint8 == null || resultPoint7 == null || resultPoint2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint[] resultPointArr = {resultPoint8, resultPoint7, resultPoint2};
        ResultPoint.orderBestPatterns(resultPointArr);
        ResultPoint resultPoint10 = resultPointArr[0];
        ResultPoint resultPoint11 = resultPointArr[1];
        ResultPoint resultPoint12 = resultPointArr[2];
        if (!hashMap.containsKey(resultPoint3)) {
            resultPoint = resultPoint3;
        } else if (hashMap.containsKey(resultPoint4)) {
            resultPoint = !hashMap.containsKey(resultPoint5) ? resultPoint5 : resultPoint6;
        } else {
            resultPoint = resultPoint4;
        }
        int c = b(resultPoint12, resultPoint).c();
        int c2 = b(resultPoint10, resultPoint).c();
        if ((c & 1) == 1) {
            c++;
        }
        int i = c + 2;
        if ((c2 & 1) == 1) {
            c2++;
        }
        int i2 = c2 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            a2 = a(resultPoint11, resultPoint10, resultPoint12, resultPoint, i, i2);
            if (a2 == null) {
                a2 = resultPoint;
            }
            int c3 = b(resultPoint12, a2).c();
            int c4 = b(resultPoint10, a2).c();
            if ((c3 & 1) == 1) {
                c3++;
            }
            if ((c4 & 1) == 1) {
                c4++;
            }
            a3 = a(this.a, resultPoint12, resultPoint11, resultPoint10, a2, c3, c4);
        } else {
            a2 = a(resultPoint11, resultPoint10, resultPoint12, resultPoint, Math.min(i2, i));
            if (a2 == null) {
                a2 = resultPoint;
            }
            int max = Math.max(b(resultPoint12, a2).c(), b(resultPoint10, a2).c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            a3 = a(this.a, resultPoint12, resultPoint11, resultPoint10, a2, max, max);
        }
        return new DetectorResult(a3, new ResultPoint[]{resultPoint12, resultPoint11, resultPoint10, a2});
    }

    private ResultPoint a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) {
        float a2 = a(resultPoint, resultPoint2) / i;
        int a3 = a(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint((((resultPoint4.getX() - resultPoint3.getX()) / a3) * a2) + resultPoint4.getX(), (a2 * ((resultPoint4.getY() - resultPoint3.getY()) / a3)) + resultPoint4.getY());
        float a4 = a(resultPoint, resultPoint3) / i2;
        int a5 = a(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint((((resultPoint4.getX() - resultPoint2.getX()) / a5) * a4) + resultPoint4.getX(), (a4 * ((resultPoint4.getY() - resultPoint2.getY()) / a5)) + resultPoint4.getY());
        if (a(resultPoint5)) {
            return (a(resultPoint6) && Math.abs(i - b(resultPoint3, resultPoint5).c()) + Math.abs(i2 - b(resultPoint2, resultPoint5).c()) > Math.abs(i - b(resultPoint3, resultPoint6).c()) + Math.abs(i2 - b(resultPoint2, resultPoint6).c())) ? resultPoint6 : resultPoint5;
        } else if (!a(resultPoint6)) {
            return null;
        } else {
            return resultPoint6;
        }
    }

    private ResultPoint a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i) {
        float a2 = a(resultPoint, resultPoint2) / i;
        int a3 = a(resultPoint3, resultPoint4);
        ResultPoint resultPoint5 = new ResultPoint((((resultPoint4.getX() - resultPoint3.getX()) / a3) * a2) + resultPoint4.getX(), (a2 * ((resultPoint4.getY() - resultPoint3.getY()) / a3)) + resultPoint4.getY());
        float a4 = a(resultPoint, resultPoint3) / i;
        int a5 = a(resultPoint2, resultPoint4);
        ResultPoint resultPoint6 = new ResultPoint((((resultPoint4.getX() - resultPoint2.getX()) / a5) * a4) + resultPoint4.getX(), (a4 * ((resultPoint4.getY() - resultPoint2.getY()) / a5)) + resultPoint4.getY());
        if (a(resultPoint5)) {
            return (a(resultPoint6) && Math.abs(b(resultPoint3, resultPoint5).c() - b(resultPoint2, resultPoint5).c()) > Math.abs(b(resultPoint3, resultPoint6).c() - b(resultPoint2, resultPoint6).c())) ? resultPoint6 : resultPoint5;
        } else if (!a(resultPoint6)) {
            return null;
        } else {
            return resultPoint6;
        }
    }

    private boolean a(ResultPoint resultPoint) {
        return resultPoint.getX() >= 0.0f && resultPoint.getX() < ((float) this.a.getWidth()) && resultPoint.getY() > 0.0f && resultPoint.getY() < ((float) this.a.getHeight());
    }

    private static int a(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2));
    }

    private static void a(Map<ResultPoint, Integer> map, ResultPoint resultPoint) {
        Integer num = map.get(resultPoint);
        map.put(resultPoint, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
    }

    private static BitMatrix a(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) {
        return GridSampler.getInstance().sampleGrid(bitMatrix, i, i2, 0.5f, 0.5f, i - 0.5f, 0.5f, i - 0.5f, i2 - 0.5f, 0.5f, i2 - 0.5f, resultPoint.getX(), resultPoint.getY(), resultPoint4.getX(), resultPoint4.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private a b(ResultPoint resultPoint, ResultPoint resultPoint2) {
        int x = (int) resultPoint.getX();
        int y = (int) resultPoint.getY();
        int x2 = (int) resultPoint2.getX();
        int y2 = (int) resultPoint2.getY();
        boolean z = Math.abs(y2 - y) > Math.abs(x2 - x);
        if (!z) {
            y2 = x2;
            x2 = y2;
            y = x;
            x = y;
        }
        int abs = Math.abs(y2 - y);
        int abs2 = Math.abs(x2 - x);
        int i = (-abs) / 2;
        int i2 = x < x2 ? 1 : -1;
        int i3 = y < y2 ? 1 : -1;
        int i4 = 0;
        boolean z2 = this.a.get(z ? x : y, z ? y : x);
        int i5 = x;
        int i6 = i;
        while (y != y2) {
            boolean z3 = this.a.get(z ? i5 : y, z ? y : i5);
            if (z3 != z2) {
                i4++;
                z2 = z3;
            }
            int i7 = i6 + abs2;
            if (i7 > 0) {
                if (i5 == x2) {
                    break;
                }
                i5 += i2;
                i7 -= abs;
            }
            y += i3;
            i6 = i7;
        }
        return new a(resultPoint, resultPoint2, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a {
        private final ResultPoint a;
        private final ResultPoint b;
        private final int c;

        private a(ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
            this.a = resultPoint;
            this.b = resultPoint2;
            this.c = i;
        }

        ResultPoint a() {
            return this.a;
        }

        ResultPoint b() {
            return this.b;
        }

        int c() {
            return this.c;
        }

        public String toString() {
            return this.a + "/" + this.b + '/' + this.c;
        }
    }

    /* loaded from: classes2.dex */
    private static final class b implements Serializable, Comparator<a> {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(a aVar, a aVar2) {
            return aVar.c() - aVar2.c();
        }
    }
}
