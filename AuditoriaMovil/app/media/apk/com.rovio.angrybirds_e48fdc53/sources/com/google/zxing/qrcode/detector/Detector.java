package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.qrcode.decoder.Version;
import java.util.Map;
/* loaded from: classes2.dex */
public class Detector {
    private final BitMatrix a;
    private ResultPointCallback b;

    public Detector(BitMatrix bitMatrix) {
        this.a = bitMatrix;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final BitMatrix getImage() {
        return this.a;
    }

    protected final ResultPointCallback getResultPointCallback() {
        return this.b;
    }

    public DetectorResult detect() {
        return detect(null);
    }

    public final DetectorResult detect(Map<DecodeHintType, ?> map) {
        this.b = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        return processFinderPatternInfo(new FinderPatternFinder(this.a, this.b).b(map));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final DetectorResult processFinderPatternInfo(FinderPatternInfo finderPatternInfo) {
        FinderPattern topLeft = finderPatternInfo.getTopLeft();
        FinderPattern topRight = finderPatternInfo.getTopRight();
        FinderPattern bottomLeft = finderPatternInfo.getBottomLeft();
        float calculateModuleSize = calculateModuleSize(topLeft, topRight, bottomLeft);
        if (calculateModuleSize < 1.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int a = a(topLeft, topRight, bottomLeft, calculateModuleSize);
        Version provisionalVersionForDimension = Version.getProvisionalVersionForDimension(a);
        int dimensionForVersion = provisionalVersionForDimension.getDimensionForVersion() - 7;
        AlignmentPattern alignmentPattern = null;
        if (provisionalVersionForDimension.getAlignmentPatternCenters().length > 0) {
            float x = (topRight.getX() - topLeft.getX()) + bottomLeft.getX();
            float y = (topRight.getY() - topLeft.getY()) + bottomLeft.getY();
            float f = 1.0f - (3.0f / dimensionForVersion);
            int x2 = (int) (((x - topLeft.getX()) * f) + topLeft.getX());
            int y2 = (int) (topLeft.getY() + (f * (y - topLeft.getY())));
            for (int i = 4; i <= 16; i <<= 1) {
                try {
                    alignmentPattern = findAlignmentInRegion(calculateModuleSize, x2, y2, i);
                    break;
                } catch (NotFoundException e) {
                }
            }
        }
        return new DetectorResult(a(this.a, a(topLeft, topRight, bottomLeft, alignmentPattern, a), a), alignmentPattern == null ? new ResultPoint[]{bottomLeft, topLeft, topRight} : new ResultPoint[]{bottomLeft, topLeft, topRight, alignmentPattern});
    }

    private static PerspectiveTransform a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i) {
        float x;
        float y;
        float f;
        float f2;
        float f3 = i - 3.5f;
        if (resultPoint4 != null) {
            x = resultPoint4.getX();
            y = resultPoint4.getY();
            f = f3 - 3.0f;
            f2 = f;
        } else {
            x = (resultPoint2.getX() - resultPoint.getX()) + resultPoint3.getX();
            y = (resultPoint2.getY() - resultPoint.getY()) + resultPoint3.getY();
            f = f3;
            f2 = f3;
        }
        return PerspectiveTransform.quadrilateralToQuadrilateral(3.5f, 3.5f, f3, 3.5f, f2, f, 3.5f, f3, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), x, y, resultPoint3.getX(), resultPoint3.getY());
    }

    private static BitMatrix a(BitMatrix bitMatrix, PerspectiveTransform perspectiveTransform, int i) {
        return GridSampler.getInstance().sampleGrid(bitMatrix, i, i, perspectiveTransform);
    }

    private static int a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, float f) {
        int round = ((MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2) / f) + MathUtils.round(ResultPoint.distance(resultPoint, resultPoint3) / f)) / 2) + 7;
        switch (round & 3) {
            case 0:
                return round + 1;
            case 1:
            default:
                return round;
            case 2:
                return round - 1;
            case 3:
                throw NotFoundException.getNotFoundInstance();
        }
    }

    protected final float calculateModuleSize(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        return (a(resultPoint, resultPoint2) + a(resultPoint, resultPoint3)) / 2.0f;
    }

    private float a(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float a = a((int) resultPoint.getX(), (int) resultPoint.getY(), (int) resultPoint2.getX(), (int) resultPoint2.getY());
        float a2 = a((int) resultPoint2.getX(), (int) resultPoint2.getY(), (int) resultPoint.getX(), (int) resultPoint.getY());
        if (Float.isNaN(a)) {
            return a2 / 7.0f;
        }
        if (Float.isNaN(a2)) {
            return a / 7.0f;
        }
        return (a + a2) / 14.0f;
    }

    private float a(int i, int i2, int i3, int i4) {
        int i5;
        float f;
        float f2;
        int i6 = 0;
        float b = b(i, i2, i3, i4);
        int i7 = i - (i3 - i);
        if (i7 < 0) {
            f = i / (i - i7);
            i5 = 0;
        } else if (i7 >= this.a.getWidth()) {
            f = ((this.a.getWidth() - 1) - i) / (i7 - i);
            i5 = this.a.getWidth() - 1;
        } else {
            i5 = i7;
            f = 1.0f;
        }
        int i8 = (int) (i2 - (f * (i4 - i2)));
        if (i8 < 0) {
            f2 = i2 / (i2 - i8);
        } else if (i8 >= this.a.getHeight()) {
            f2 = ((this.a.getHeight() - 1) - i2) / (i8 - i2);
            i6 = this.a.getHeight() - 1;
        } else {
            i6 = i8;
            f2 = 1.0f;
        }
        return (b(i, i2, (int) ((f2 * (i5 - i)) + i), i6) + b) - 1.0f;
    }

    private float b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (!z) {
            i4 = i3;
            i3 = i4;
            i2 = i;
            i = i2;
        }
        int abs = Math.abs(i4 - i2);
        int abs2 = Math.abs(i3 - i);
        int i9 = (-abs) / 2;
        int i10 = i2 < i4 ? 1 : -1;
        int i11 = i < i3 ? 1 : -1;
        int i12 = 0;
        int i13 = i4 + i10;
        int i14 = i2;
        int i15 = i9;
        int i16 = i;
        while (true) {
            if (i14 == i13) {
                i5 = i12;
                break;
            }
            if ((i12 == 1) != this.a.get(z ? i16 : i14, z ? i14 : i16)) {
                i6 = i12;
            } else if (i12 == 2) {
                return MathUtils.distance(i14, i16, i2, i);
            } else {
                i6 = i12 + 1;
            }
            int i17 = i15 + abs2;
            if (i17 <= 0) {
                i7 = i16;
                i8 = i17;
            } else if (i16 == i3) {
                i5 = i6;
                break;
            } else {
                i7 = i16 + i11;
                i8 = i17 - abs;
            }
            i14 += i10;
            i12 = i6;
            i15 = i8;
            i16 = i7;
        }
        if (i5 == 2) {
            return MathUtils.distance(i4 + i10, i3, i2, i);
        }
        return Float.NaN;
    }

    protected final AlignmentPattern findAlignmentInRegion(float f, int i, int i2, float f2) {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.a.getWidth() - 1, i + i3);
        if (min - max < f * 3.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int max2 = Math.max(0, i2 - i3);
        int min2 = Math.min(this.a.getHeight() - 1, i3 + i2);
        if (min2 - max2 < f * 3.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        return new a(this.a, max, max2, min - max, min2 - max2, f, this.b).a();
    }
}
