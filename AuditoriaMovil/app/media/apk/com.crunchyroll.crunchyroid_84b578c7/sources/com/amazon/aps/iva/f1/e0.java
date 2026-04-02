package com.amazon.aps.iva.f1;

import android.graphics.ColorSpace;
import com.amazon.aps.iva.g1.u;
import java.util.function.DoubleUnaryOperator;
/* compiled from: AndroidColorSpace.android.kt */
/* loaded from: classes.dex */
public final class e0 {
    public static final ColorSpace a(com.amazon.aps.iva.g1.c cVar) {
        ColorSpace colorSpace;
        com.amazon.aps.iva.g1.u uVar;
        ColorSpace.Rgb.TransferParameters transferParameters;
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.c)) {
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.SRGB);
            com.amazon.aps.iva.yb0.j.e(colorSpace2, "get(android.graphics.ColorSpace.Named.SRGB)");
            return colorSpace2;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.o)) {
            ColorSpace colorSpace3 = ColorSpace.get(ColorSpace.Named.ACES);
            com.amazon.aps.iva.yb0.j.e(colorSpace3, "get(android.graphics.ColorSpace.Named.ACES)");
            return colorSpace3;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.p)) {
            ColorSpace colorSpace4 = ColorSpace.get(ColorSpace.Named.ACESCG);
            com.amazon.aps.iva.yb0.j.e(colorSpace4, "get(android.graphics.ColorSpace.Named.ACESCG)");
            return colorSpace4;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.m)) {
            ColorSpace colorSpace5 = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
            com.amazon.aps.iva.yb0.j.e(colorSpace5, "get(android.graphics.ColorSpace.Named.ADOBE_RGB)");
            return colorSpace5;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.h)) {
            ColorSpace colorSpace6 = ColorSpace.get(ColorSpace.Named.BT2020);
            com.amazon.aps.iva.yb0.j.e(colorSpace6, "get(android.graphics.ColorSpace.Named.BT2020)");
            return colorSpace6;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.g)) {
            ColorSpace colorSpace7 = ColorSpace.get(ColorSpace.Named.BT709);
            com.amazon.aps.iva.yb0.j.e(colorSpace7, "get(android.graphics.ColorSpace.Named.BT709)");
            return colorSpace7;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.r)) {
            ColorSpace colorSpace8 = ColorSpace.get(ColorSpace.Named.CIE_LAB);
            com.amazon.aps.iva.yb0.j.e(colorSpace8, "get(android.graphics.ColorSpace.Named.CIE_LAB)");
            return colorSpace8;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.q)) {
            ColorSpace colorSpace9 = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
            com.amazon.aps.iva.yb0.j.e(colorSpace9, "get(android.graphics.ColorSpace.Named.CIE_XYZ)");
            return colorSpace9;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.i)) {
            ColorSpace colorSpace10 = ColorSpace.get(ColorSpace.Named.DCI_P3);
            com.amazon.aps.iva.yb0.j.e(colorSpace10, "get(android.graphics.ColorSpace.Named.DCI_P3)");
            return colorSpace10;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.j)) {
            ColorSpace colorSpace11 = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
            com.amazon.aps.iva.yb0.j.e(colorSpace11, "get(android.graphics.ColorSpace.Named.DISPLAY_P3)");
            return colorSpace11;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.e)) {
            ColorSpace colorSpace12 = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
            com.amazon.aps.iva.yb0.j.e(colorSpace12, "get(android.graphics.Col…pace.Named.EXTENDED_SRGB)");
            return colorSpace12;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.f)) {
            ColorSpace colorSpace13 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            com.amazon.aps.iva.yb0.j.e(colorSpace13, "get(android.graphics.Col…med.LINEAR_EXTENDED_SRGB)");
            return colorSpace13;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.d)) {
            ColorSpace colorSpace14 = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
            com.amazon.aps.iva.yb0.j.e(colorSpace14, "get(android.graphics.ColorSpace.Named.LINEAR_SRGB)");
            return colorSpace14;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.k)) {
            ColorSpace colorSpace15 = ColorSpace.get(ColorSpace.Named.NTSC_1953);
            com.amazon.aps.iva.yb0.j.e(colorSpace15, "get(android.graphics.ColorSpace.Named.NTSC_1953)");
            return colorSpace15;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.n)) {
            ColorSpace colorSpace16 = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
            com.amazon.aps.iva.yb0.j.e(colorSpace16, "get(android.graphics.Col…pace.Named.PRO_PHOTO_RGB)");
            return colorSpace16;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, com.amazon.aps.iva.g1.g.l)) {
            ColorSpace colorSpace17 = ColorSpace.get(ColorSpace.Named.SMPTE_C);
            com.amazon.aps.iva.yb0.j.e(colorSpace17, "get(android.graphics.ColorSpace.Named.SMPTE_C)");
            return colorSpace17;
        } else {
            if (cVar instanceof com.amazon.aps.iva.g1.u) {
                com.amazon.aps.iva.g1.u uVar2 = (com.amazon.aps.iva.g1.u) cVar;
                float[] a = uVar2.d.a();
                com.amazon.aps.iva.g1.v vVar = uVar2.g;
                if (vVar != null) {
                    uVar = uVar2;
                    transferParameters = new ColorSpace.Rgb.TransferParameters(vVar.b, vVar.c, vVar.d, vVar.e, vVar.f, vVar.g, vVar.a);
                } else {
                    uVar = uVar2;
                    transferParameters = null;
                }
                if (transferParameters != null) {
                    colorSpace = new ColorSpace.Rgb(cVar.a, uVar.h, a, transferParameters);
                } else {
                    com.amazon.aps.iva.g1.u uVar3 = uVar;
                    String str = cVar.a;
                    float[] fArr = uVar3.h;
                    final u.c cVar2 = uVar3.l;
                    DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: com.amazon.aps.iva.f1.a0
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d) {
                            com.amazon.aps.iva.xb0.l lVar = cVar2;
                            com.amazon.aps.iva.yb0.j.f(lVar, "$tmp0");
                            return ((Number) lVar.invoke(Double.valueOf(d))).doubleValue();
                        }
                    };
                    final u.b bVar = uVar3.o;
                    colorSpace = new ColorSpace.Rgb(str, fArr, a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: com.amazon.aps.iva.f1.b0
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d) {
                            com.amazon.aps.iva.xb0.l lVar = bVar;
                            com.amazon.aps.iva.yb0.j.f(lVar, "$tmp0");
                            return ((Number) lVar.invoke(Double.valueOf(d))).doubleValue();
                        }
                    }, cVar.c(0), cVar.b(0));
                }
            } else {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            com.amazon.aps.iva.yb0.j.e(colorSpace, "{\n                if (th…          }\n            }");
            return colorSpace;
        }
    }

    public static final com.amazon.aps.iva.g1.c b(ColorSpace colorSpace) {
        com.amazon.aps.iva.g1.w wVar;
        ColorSpace.Rgb rgb;
        com.amazon.aps.iva.g1.w wVar2;
        com.amazon.aps.iva.g1.v vVar;
        com.amazon.aps.iva.yb0.j.f(colorSpace, "<this>");
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return com.amazon.aps.iva.g1.g.c;
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return com.amazon.aps.iva.g1.g.o;
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return com.amazon.aps.iva.g1.g.p;
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return com.amazon.aps.iva.g1.g.m;
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return com.amazon.aps.iva.g1.g.h;
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return com.amazon.aps.iva.g1.g.g;
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return com.amazon.aps.iva.g1.g.r;
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return com.amazon.aps.iva.g1.g.q;
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return com.amazon.aps.iva.g1.g.i;
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return com.amazon.aps.iva.g1.g.j;
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return com.amazon.aps.iva.g1.g.e;
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return com.amazon.aps.iva.g1.g.f;
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return com.amazon.aps.iva.g1.g.d;
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return com.amazon.aps.iva.g1.g.k;
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return com.amazon.aps.iva.g1.g.n;
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return com.amazon.aps.iva.g1.g.l;
        }
        if (colorSpace instanceof ColorSpace.Rgb) {
            ColorSpace.Rgb rgb2 = (ColorSpace.Rgb) colorSpace;
            ColorSpace.Rgb.TransferParameters transferParameters = rgb2.getTransferParameters();
            if (rgb2.getWhitePoint().length == 3) {
                float f = rgb2.getWhitePoint()[0];
                float f2 = rgb2.getWhitePoint()[1];
                float f3 = f + f2 + rgb2.getWhitePoint()[2];
                wVar = new com.amazon.aps.iva.g1.w(f / f3, f2 / f3);
            } else {
                wVar = new com.amazon.aps.iva.g1.w(rgb2.getWhitePoint()[0], rgb2.getWhitePoint()[1]);
            }
            com.amazon.aps.iva.g1.w wVar3 = wVar;
            if (transferParameters != null) {
                wVar2 = wVar3;
                rgb = rgb2;
                vVar = new com.amazon.aps.iva.g1.v(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f);
            } else {
                rgb = rgb2;
                wVar2 = wVar3;
                vVar = null;
            }
            String name = rgb.getName();
            com.amazon.aps.iva.yb0.j.e(name, "this.name");
            float[] primaries = rgb.getPrimaries();
            com.amazon.aps.iva.yb0.j.e(primaries, "this.primaries");
            return new com.amazon.aps.iva.g1.u(name, primaries, wVar2, rgb.getTransform(), new c0(colorSpace, 0), new d0(colorSpace, 0), colorSpace.getMinValue(0), colorSpace.getMaxValue(0), vVar, rgb.getId());
        }
        return com.amazon.aps.iva.g1.g.c;
    }
}
