package com.amazon.aps.iva.u4;

import com.amazon.aps.iva.v4.b1;
import com.amazon.aps.iva.v4.c1;
import com.amazon.aps.iva.v4.i;
import com.amazon.aps.iva.v4.j1;
import com.amazon.aps.iva.v4.o;
import com.amazon.aps.iva.v4.q0;
import com.amazon.aps.iva.v4.w;
import com.amazon.aps.iva.v4.x0;
import com.amazon.aps.iva.v4.y;
import com.amazon.aps.iva.v4.z;
import java.io.FileInputStream;
import java.io.IOException;
/* compiled from: LayoutProto.java */
/* loaded from: classes.dex */
public final class e extends w<e, a> implements q0 {
    private static final e DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile x0<e> PARSER;
    private y.d<f> layout_ = b1.e;
    private int nextIndex_;

    /* compiled from: LayoutProto.java */
    /* loaded from: classes.dex */
    public static final class a extends w.a<e, a> implements q0 {
        public a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        w.j(e.class, eVar);
    }

    public static void l(e eVar, f fVar) {
        int i;
        eVar.getClass();
        y.d<f> dVar = eVar.layout_;
        if (!dVar.isModifiable()) {
            int size = dVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            eVar.layout_ = dVar.mutableCopyWithCapacity(i);
        }
        eVar.layout_.add(fVar);
    }

    public static void m(e eVar) {
        eVar.getClass();
        eVar.layout_ = b1.e;
    }

    public static void n(e eVar, int i) {
        eVar.nextIndex_ = i;
    }

    public static e o() {
        return DEFAULT_INSTANCE;
    }

    public static e r(FileInputStream fileInputStream) throws IOException {
        w i = w.i(DEFAULT_INSTANCE, new i.b(fileInputStream), o.a());
        if (i.isInitialized()) {
            return (e) i;
        }
        throw new z(new j1().getMessage());
    }

    @Override // com.amazon.aps.iva.v4.w
    public final Object f(w.f fVar) {
        switch (com.amazon.aps.iva.u4.a.a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new a();
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", f.class, "nextIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                x0<e> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (e.class) {
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

    public final y.d p() {
        return this.layout_;
    }

    public final int q() {
        return this.nextIndex_;
    }
}
