package com.amazon.aps.iva.u4;

import com.amazon.aps.iva.v4.b1;
import com.amazon.aps.iva.v4.c1;
import com.amazon.aps.iva.v4.e0;
import com.amazon.aps.iva.v4.q0;
import com.amazon.aps.iva.v4.w;
import com.amazon.aps.iva.v4.x0;
import com.amazon.aps.iva.v4.y;
import com.amazon.aps.iva.v4.y0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: LayoutProto.java */
/* loaded from: classes.dex */
public final class g extends w<g, a> implements q0 {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final g DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile x0<g> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private y.d<g> children_ = b1.e;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    /* compiled from: LayoutProto.java */
    /* loaded from: classes.dex */
    public static final class a extends w.a<g, a> implements q0 {
        public a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        w.j(g.class, gVar);
    }

    public static void l(g gVar, h hVar) {
        gVar.getClass();
        gVar.type_ = hVar.getNumber();
    }

    public static void m(g gVar, c cVar) {
        gVar.getClass();
        gVar.width_ = cVar.getNumber();
    }

    public static void n(g gVar, c cVar) {
        gVar.getClass();
        gVar.height_ = cVar.getNumber();
    }

    public static void o(g gVar, d dVar) {
        gVar.getClass();
        gVar.horizontalAlignment_ = dVar.getNumber();
    }

    public static void p(g gVar, j jVar) {
        gVar.getClass();
        gVar.verticalAlignment_ = jVar.getNumber();
    }

    public static void q(g gVar, b bVar) {
        gVar.getClass();
        gVar.imageScale_ = bVar.getNumber();
    }

    public static void r(g gVar, i iVar) {
        gVar.getClass();
        gVar.identity_ = iVar.getNumber();
    }

    public static void s(g gVar, ArrayList arrayList) {
        int i;
        y.d<g> dVar = gVar.children_;
        if (!dVar.isModifiable()) {
            int size = dVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            gVar.children_ = dVar.mutableCopyWithCapacity(i);
        }
        List list = gVar.children_;
        Charset charset = y.a;
        if (arrayList instanceof e0) {
            List<?> underlyingElements = ((e0) arrayList).getUnderlyingElements();
            e0 e0Var = (e0) list;
            int size2 = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (e0Var.size() - size2) + " is null.";
                    int size3 = e0Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size2) {
                            break;
                        }
                        e0Var.remove(size3);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof com.amazon.aps.iva.v4.h) {
                    e0Var.c((com.amazon.aps.iva.v4.h) obj);
                } else {
                    e0Var.add((String) obj);
                }
            }
        } else if (arrayList instanceof y0) {
            list.addAll(arrayList);
        } else {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
            }
            int size4 = list.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next == null) {
                    String str2 = "Element at index " + (list.size() - size4) + " is null.";
                    int size5 = list.size();
                    while (true) {
                        size5--;
                        if (size5 < size4) {
                            break;
                        }
                        list.remove(size5);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(next);
            }
        }
    }

    public static g t() {
        return DEFAULT_INSTANCE;
    }

    public static a u() {
        g gVar = DEFAULT_INSTANCE;
        gVar.getClass();
        return (a) ((w.a) gVar.f(w.f.NEW_BUILDER));
    }

    @Override // com.amazon.aps.iva.v4.w
    public final Object f(w.f fVar) {
        switch (com.amazon.aps.iva.u4.a.a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a();
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", g.class, "identity_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                x0<g> x0Var = PARSER;
                if (x0Var == null) {
                    synchronized (g.class) {
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
}
