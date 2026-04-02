package com.amazon.aps.iva.c4;

import com.amazon.aps.iva.c4.f;
import com.amazon.aps.iva.e4.e1;
import com.amazon.aps.iva.e4.r0;
import com.amazon.aps.iva.e4.x;
import com.amazon.aps.iva.e4.z0;
/* compiled from: PreferencesProto.java */
/* loaded from: classes.dex */
public final class g extends x<g, a> implements r0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final g DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile z0<g> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* compiled from: PreferencesProto.java */
    /* loaded from: classes.dex */
    public static final class a extends x.a<g, a> implements r0 {
        public a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PreferencesProto.java */
    /* loaded from: classes.dex */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);
        
        private final int value;

        b(int i) {
            this.value = i;
        }

        public static b forNumber(int i) {
            switch (i) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        x.j(g.class, gVar);
    }

    public static a B() {
        g gVar = DEFAULT_INSTANCE;
        gVar.getClass();
        return (a) ((x.a) gVar.f(x.f.NEW_BUILDER));
    }

    public static void k(g gVar, long j) {
        gVar.valueCase_ = 4;
        gVar.value_ = Long.valueOf(j);
    }

    public static void l(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.valueCase_ = 5;
        gVar.value_ = str;
    }

    public static void m(g gVar, f.a aVar) {
        gVar.getClass();
        gVar.value_ = aVar.c();
        gVar.valueCase_ = 6;
    }

    public static void n(g gVar, double d) {
        gVar.valueCase_ = 7;
        gVar.value_ = Double.valueOf(d);
    }

    public static void p(g gVar, boolean z) {
        gVar.valueCase_ = 1;
        gVar.value_ = Boolean.valueOf(z);
    }

    public static void q(g gVar, float f) {
        gVar.valueCase_ = 2;
        gVar.value_ = Float.valueOf(f);
    }

    public static void r(g gVar, int i) {
        gVar.valueCase_ = 3;
        gVar.value_ = Integer.valueOf(i);
    }

    public static g t() {
        return DEFAULT_INSTANCE;
    }

    public final b A() {
        return b.forNumber(this.valueCase_);
    }

    @Override // com.amazon.aps.iva.e4.x
    public final Object f(x.f fVar) {
        switch (d.a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a();
            case 3:
                return new e1(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", f.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<g> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (g.class) {
                        try {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new x.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        } finally {
                        }
                    }
                }
                return z0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean s() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double u() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float v() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int w() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long x() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String y() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final f z() {
        if (this.valueCase_ == 6) {
            return (f) this.value_;
        }
        return f.m();
    }
}
