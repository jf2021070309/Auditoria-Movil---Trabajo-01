package com.umeng.analytics.pro;

import com.facebook.share.internal.ShareConstants;
/* compiled from: TApplicationException.java */
/* loaded from: classes3.dex */
public class bo extends bv {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private static final ct j = new ct("TApplicationException");
    private static final cj k = new cj(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, (byte) 11, 1);
    private static final cj l = new cj("type", (byte) 8, 2);
    private static final long m = 1;
    protected int i;

    public bo() {
        this.i = 0;
    }

    public bo(int i) {
        this.i = 0;
        this.i = i;
    }

    public bo(int i, String str) {
        super(str);
        this.i = 0;
        this.i = i;
    }

    public bo(String str) {
        super(str);
        this.i = 0;
    }

    public int a() {
        return this.i;
    }

    public static bo a(co coVar) throws bv {
        coVar.j();
        String str = null;
        int i = 0;
        while (true) {
            cj l2 = coVar.l();
            if (l2.b != 0) {
                short s = l2.c;
                if (s != 1) {
                    if (s == 2) {
                        if (l2.b == 8) {
                            i = coVar.w();
                        } else {
                            cr.a(coVar, l2.b);
                        }
                    } else {
                        cr.a(coVar, l2.b);
                    }
                } else if (l2.b == 11) {
                    str = coVar.z();
                } else {
                    cr.a(coVar, l2.b);
                }
                coVar.m();
            } else {
                coVar.k();
                return new bo(i, str);
            }
        }
    }

    public void b(co coVar) throws bv {
        coVar.a(j);
        if (getMessage() != null) {
            coVar.a(k);
            coVar.a(getMessage());
            coVar.c();
        }
        coVar.a(l);
        coVar.a(this.i);
        coVar.c();
        coVar.d();
        coVar.b();
    }
}
