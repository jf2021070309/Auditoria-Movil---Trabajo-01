package com.amazon.aps.iva.g1;
/* compiled from: ColorSpaces.kt */
/* loaded from: classes.dex */
public final class g {
    public static final float[] a;
    public static final float[] b;
    public static final u c;
    public static final u d;
    public static final u e;
    public static final u f;
    public static final u g;
    public static final u h;
    public static final u i;
    public static final u j;
    public static final u k;
    public static final u l;
    public static final u m;
    public static final u n;
    public static final u o;
    public static final u p;
    public static final x q;
    public static final k r;
    public static final u s;
    public static final l t;
    public static final c[] u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        v vVar = new v(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        v vVar2 = new v(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        w wVar = com.amazon.aps.iva.aq.k.e;
        u uVar = new u("sRGB IEC61966-2.1", fArr, wVar, vVar, 0);
        c = uVar;
        u uVar2 = new u("sRGB IEC61966-2.1 (Linear)", fArr, wVar, 1.0d, 0.0f, 1.0f, 1);
        d = uVar2;
        u uVar3 = new u("scRGB-nl IEC 61966-2-2:2003", fArr, wVar, null, new e(0), new f(0), -0.799f, 2.399f, vVar, 2);
        e = uVar3;
        u uVar4 = new u("scRGB IEC 61966-2-2:2003", fArr, wVar, 1.0d, -0.5f, 7.499f, 3);
        f = uVar4;
        u uVar5 = new u("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, wVar, new v(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        g = uVar5;
        u uVar6 = new u("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, wVar, new v(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        h = uVar6;
        u uVar7 = new u("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new w(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        i = uVar7;
        u uVar8 = new u("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, wVar, vVar, 7);
        j = uVar8;
        u uVar9 = new u("NTSC (1953)", fArr2, com.amazon.aps.iva.aq.k.b, new v(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        k = uVar9;
        u uVar10 = new u("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, wVar, new v(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        l = uVar10;
        u uVar11 = new u("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, wVar, 2.2d, 0.0f, 1.0f, 10);
        m = uVar11;
        u uVar12 = new u("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, com.amazon.aps.iva.aq.k.c, new v(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        n = uVar12;
        w wVar2 = com.amazon.aps.iva.aq.k.d;
        u uVar13 = new u("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, wVar2, 1.0d, -65504.0f, 65504.0f, 12);
        o = uVar13;
        u uVar14 = new u("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, wVar2, 1.0d, -65504.0f, 65504.0f, 13);
        p = uVar14;
        x xVar = new x();
        q = xVar;
        k kVar = new k();
        r = kVar;
        u uVar15 = new u("None", fArr, wVar, vVar2, 16);
        s = uVar15;
        l lVar = new l();
        t = lVar;
        u = new c[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, xVar, kVar, uVar15, lVar};
    }
}
