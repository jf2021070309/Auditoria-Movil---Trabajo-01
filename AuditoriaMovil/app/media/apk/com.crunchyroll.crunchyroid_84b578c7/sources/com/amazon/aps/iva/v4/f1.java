package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.s;
import com.amazon.aps.iva.v4.y;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;
/* compiled from: SchemaUtil.java */
/* loaded from: classes.dex */
public final class f1 {
    public static final Class<?> a;
    public static final k1<?, ?> b;
    public static final k1<?, ?> c;
    public static final m1 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = A(false);
        c = A(true);
        d = new m1();
    }

    public static k1<?, ?> A(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (k1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static <T, FT extends s.b<FT>> void B(p<FT> pVar, T t, T t2) {
        h1<FT, Object> h1Var;
        s<FT> c2 = pVar.c(t2);
        if (!c2.h()) {
            s<FT> d2 = pVar.d(t);
            d2.getClass();
            int i = 0;
            while (true) {
                h1Var = c2.a;
                if (i >= h1Var.e()) {
                    break;
                }
                d2.l(h1Var.d(i));
                i++;
            }
            for (Map.Entry<FT, Object> entry : h1Var.g()) {
                d2.l(entry);
            }
        }
    }

    public static boolean C(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static <UT, UB> UB D(int i, int i2, UB ub, k1<UT, UB> k1Var) {
        if (ub == null) {
            ub = (UB) k1Var.m();
        }
        k1Var.e(ub, i, i2);
        return ub;
    }

    public static void E(int i, List list, l lVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                kVar.M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    Logger logger = k.b;
                    i3++;
                }
                kVar.O(i3);
                while (i2 < list.size()) {
                    kVar.z(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kVar.A(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void F(int i, List list, l lVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            lVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                lVar.a.B(i, (h) list.get(i2));
            }
        }
    }

    public static void G(int i, List list, l lVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                kVar.M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    Logger logger = k.b;
                    i3 += 8;
                }
                kVar.O(i3);
                while (i2 < list.size()) {
                    kVar.F(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                kVar.getClass();
                kVar.E(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
        }
    }

    public static void H(int i, List list, l lVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                kVar.M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += k.k(((Integer) list.get(i4)).intValue());
                }
                kVar.O(i3);
                while (i2 < list.size()) {
                    kVar.H(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kVar.G(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void I(int i, List list, l lVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                kVar.M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = k.b;
                    i3 += 4;
                }
                kVar.O(i3);
                while (i2 < list.size()) {
                    kVar.D(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kVar.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void J(int i, List list, l lVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                kVar.M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = k.b;
                    i3 += 8;
                }
                kVar.O(i3);
                while (i2 < list.size()) {
                    kVar.F(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kVar.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void K(int i, List list, l lVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                kVar.M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    Logger logger = k.b;
                    i3 += 4;
                }
                kVar.O(i3);
                while (i2 < list.size()) {
                    kVar.D(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                kVar.getClass();
                kVar.C(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
        }
    }

    public static void L(int i, List list, l lVar, e1 e1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            lVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                lVar.h(i, e1Var, list.get(i2));
            }
        }
    }

    public static void M(int i, List list, l lVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                kVar.M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += k.k(((Integer) list.get(i4)).intValue());
                }
                kVar.O(i3);
                while (i2 < list.size()) {
                    kVar.H(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kVar.G(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void N(int i, List list, l lVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                kVar.M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += k.x(((Long) list.get(i4)).longValue());
                }
                kVar.O(i3);
                while (i2 < list.size()) {
                    kVar.Q(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kVar.P(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void O(int i, List list, l lVar, e1 e1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            lVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                lVar.k(i, e1Var, list.get(i2));
            }
        }
    }

    public static void P(int i, List list, l lVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                kVar.M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = k.b;
                    i3 += 4;
                }
                kVar.O(i3);
                while (i2 < list.size()) {
                    kVar.D(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kVar.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void Q(int i, List list, l lVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                kVar.M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = k.b;
                    i3 += 8;
                }
                kVar.O(i3);
                while (i2 < list.size()) {
                    kVar.F(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kVar.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void R(int i, List list, l lVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                kVar.M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += k.v((intValue >> 31) ^ (intValue << 1));
                }
                kVar.O(i3);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    kVar.O((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                kVar.N(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    public static void S(int i, List list, l lVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                kVar.M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += k.x((longValue >> 63) ^ (longValue << 1));
                }
                kVar.O(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    kVar.Q((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                kVar.P(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    public static void T(int i, List list, l lVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            lVar.getClass();
            boolean z = list instanceof e0;
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                e0 e0Var = (e0) list;
                while (i2 < list.size()) {
                    Object raw = e0Var.getRaw(i2);
                    if (raw instanceof String) {
                        kVar.L(i, (String) raw);
                    } else {
                        kVar.B(i, (h) raw);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kVar.L(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    public static void U(int i, List list, l lVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                kVar.M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += k.v(((Integer) list.get(i4)).intValue());
                }
                kVar.O(i3);
                while (i2 < list.size()) {
                    kVar.O(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kVar.N(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void V(int i, List list, l lVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            k kVar = lVar.a;
            int i2 = 0;
            if (z) {
                kVar.M(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += k.x(((Long) list.get(i4)).longValue());
                }
                kVar.O(i3);
                while (i2 < list.size()) {
                    kVar.Q(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kVar.P(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k.b(i) * size;
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(int i, List<h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = k.t(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int size2 = list.get(i2).size();
            t += k.v(size2) + size2;
        }
        return t;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.t(i) * size) + e(list);
    }

    public static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i = 0;
            while (i2 < size) {
                xVar.d(i2);
                i += k.k(xVar.c[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += k.k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k.f(i) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k.g(i) * size;
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i, List<p0> list, e1 e1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += k.i(i, list.get(i3), e1Var);
        }
        return i2;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.t(i) * size) + l(list);
    }

    public static int l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i = 0;
            while (i2 < size) {
                xVar.d(i2);
                i += k.k(xVar.c[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += k.k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (k.t(i) * list.size()) + n(list);
    }

    public static int n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            i = 0;
            while (i2 < size) {
                g0Var.d(i2);
                i += k.x(g0Var.c[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += k.x(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int o(int i, e1 e1Var, Object obj) {
        if (obj instanceof c0) {
            return k.m((c0) obj) + k.t(i);
        }
        int t = k.t(i);
        int d2 = ((a) ((p0) obj)).d(e1Var);
        return k.v(d2) + d2 + t;
    }

    public static int p(int i, List<?> list, e1 e1Var) {
        int v;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = k.t(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof c0) {
                v = k.m((c0) obj);
            } else {
                int d2 = ((a) ((p0) obj)).d(e1Var);
                v = d2 + k.v(d2);
            }
            t += v;
        }
        return t;
    }

    public static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.t(i) * size) + r(list);
    }

    public static int r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i = 0;
            while (i2 < size) {
                xVar.d(i2);
                int i3 = xVar.c[i2];
                i += k.v((i3 >> 31) ^ (i3 << 1));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i += k.v((intValue >> 31) ^ (intValue << 1));
                i2++;
            }
        }
        return i;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.t(i) * size) + t(list);
    }

    public static int t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            i = 0;
            while (i2 < size) {
                g0Var.d(i2);
                long j = g0Var.c[i2];
                i += k.x((j >> 63) ^ (j << 1));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i += k.x((longValue >> 63) ^ (longValue << 1));
                i2++;
            }
        }
        return i;
    }

    public static int u(int i, List<?> list) {
        int s;
        int s2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int t = k.t(i) * size;
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            while (i2 < size) {
                Object raw = e0Var.getRaw(i2);
                if (raw instanceof h) {
                    int size2 = ((h) raw).size();
                    s2 = k.v(size2) + size2;
                } else {
                    s2 = k.s((String) raw);
                }
                t += s2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof h) {
                    int size3 = ((h) obj).size();
                    s = k.v(size3) + size3;
                } else {
                    s = k.s((String) obj);
                }
                t += s;
                i2++;
            }
        }
        return t;
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.t(i) * size) + w(list);
    }

    public static int w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i = 0;
            while (i2 < size) {
                xVar.d(i2);
                i += k.v(xVar.c[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += k.v(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.t(i) * size) + y(list);
    }

    public static int y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            i = 0;
            while (i2 < size) {
                g0Var.d(i2);
                i += k.x(g0Var.c[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += k.x(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static <UT, UB> UB z(int i, List<Integer> list, y.c cVar, UB ub, k1<UT, UB> k1Var) {
        if (cVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (cVar.isInRange(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) D(i, intValue, ub, k1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!cVar.isInRange(intValue2)) {
                    ub = (UB) D(i, intValue2, ub, k1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
