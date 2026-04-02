package com.amazon.aps.iva.u4;

import com.amazon.aps.iva.v4.c1;
import com.amazon.aps.iva.v4.q0;
import com.amazon.aps.iva.v4.w;
import com.amazon.aps.iva.v4.x0;
/* compiled from: LayoutProto.java */
/* loaded from: classes.dex */
public final class f extends w<f, a> implements q0 {
    private static final f DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile x0<f> PARSER;
    private int layoutIndex_;
    private g layout_;

    /* compiled from: LayoutProto.java */
    /* loaded from: classes.dex */
    public static final class a extends w.a<f, a> implements q0 {
        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        w.j(f.class, fVar);
    }

    public static void l(f fVar, g gVar) {
        fVar.getClass();
        gVar.getClass();
        fVar.layout_ = gVar;
    }

    public static void m(f fVar, int i) {
        fVar.layoutIndex_ = i;
    }

    public static a p() {
        f fVar = DEFAULT_INSTANCE;
        fVar.getClass();
        return (a) ((w.a) fVar.f(w.f.NEW_BUILDER));
    }

    @Override // com.amazon.aps.iva.v4.w
    public final Object f(w.f fVar) {
        switch (com.amazon.aps.iva.u4.a.a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a();
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0004", new Object[]{"layout_", "layoutIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                x0<f> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (f.class) {
                        try {
                            x0Var = PARSER;
                            if (x0Var == null) {
                                x0Var = new w.b<>(DEFAULT_INSTANCE);
                                PARSER = x0Var;
                            }
                        } finally {
                        }
                    }
                }
                return x0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final g n() {
        g gVar = this.layout_;
        if (gVar == null) {
            return g.t();
        }
        return gVar;
    }

    public final int o() {
        return this.layoutIndex_;
    }
}
