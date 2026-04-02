package com.amazon.aps.iva.ha0;

import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class a extends b {
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final long l;
    public long m;
    public long n;
    public final com.amazon.aps.iva.ia0.a o;
    public long p;
    public long q;
    public long r;
    public long s;
    public boolean t;
    public final ArrayList<Long> u;
    public boolean v;
    public boolean w;
    public com.amazon.aps.iva.ga0.a x;

    public a(com.amazon.aps.iva.da0.f fVar) {
        super(fVar);
        this.e = false;
        this.f = false;
        com.amazon.aps.iva.ia0.a aVar = new com.amazon.aps.iva.ia0.a();
        this.o = aVar;
        this.t = false;
        this.u = new ArrayList<>();
        this.v = true;
        this.w = false;
        this.l = aVar.a();
    }

    public static boolean e(com.amazon.aps.iva.ga0.o oVar) {
        Long valueOf;
        String a = oVar.a("xctpbti");
        if (a == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(a));
        }
        if (valueOf != null && valueOf.longValue() >= 1000) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e7, code lost:
        if (r11.equals("adended") == false) goto L138;
     */
    @Override // com.amazon.aps.iva.ha0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.amazon.aps.iva.fa0.t r11) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ha0.a.d(com.amazon.aps.iva.fa0.t):void");
    }
}
