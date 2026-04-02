package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.t;
import com.amazon.aps.iva.e4.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;
/* compiled from: SchemaUtil.java */
/* loaded from: classes.dex */
public final class h1 {
    public static final Class<?> a;
    public static final n1<?, ?> b;
    public static final n1<?, ?> c;
    public static final p1 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = A(false);
        c = A(true);
        d = new p1();
    }

    public static n1<?, ?> A(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (n1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static <T, FT extends t.b<FT>> void B(q<FT> qVar, T t, T t2) {
        j1<FT, Object> j1Var;
        t<FT> c2 = qVar.c(t2);
        if (!c2.h()) {
            t<FT> d2 = qVar.d(t);
            d2.getClass();
            int i = 0;
            while (true) {
                j1Var = c2.a;
                if (i >= j1Var.e()) {
                    break;
                }
                d2.l(j1Var.d(i));
                i++;
            }
            for (Map.Entry<FT, Object> entry : j1Var.g()) {
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

    public static <UT, UB> UB D(int i, int i2, UB ub, n1<UT, UB> n1Var) {
        if (ub == null) {
            ub = (UB) n1Var.m();
        }
        n1Var.e(ub, i, i2);
        return ub;
    }

    public static void E(int i, List list, m mVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                lVar.Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    Logger logger = l.b;
                    i3++;
                }
                lVar.S(i3);
                while (i2 < list.size()) {
                    lVar.z(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                lVar.A(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void F(int i, List list, m mVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            mVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                mVar.a.C(i, (i) list.get(i2));
            }
        }
    }

    public static void G(int i, List list, m mVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                lVar.Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    Logger logger = l.b;
                    i3 += 8;
                }
                lVar.S(i3);
                while (i2 < list.size()) {
                    lVar.H(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                lVar.getClass();
                lVar.G(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
        }
    }

    public static void H(int i, List list, m mVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                lVar.Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += l.k(((Integer) list.get(i4)).intValue());
                }
                lVar.S(i3);
                while (i2 < list.size()) {
                    lVar.J(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                lVar.I(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void I(int i, List list, m mVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                lVar.Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = l.b;
                    i3 += 4;
                }
                lVar.S(i3);
                while (i2 < list.size()) {
                    lVar.F(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                lVar.E(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void J(int i, List list, m mVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                lVar.Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = l.b;
                    i3 += 8;
                }
                lVar.S(i3);
                while (i2 < list.size()) {
                    lVar.H(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                lVar.G(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void K(int i, List list, m mVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                lVar.Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    Logger logger = l.b;
                    i3 += 4;
                }
                lVar.S(i3);
                while (i2 < list.size()) {
                    lVar.F(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                lVar.getClass();
                lVar.E(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
        }
    }

    public static void L(int i, List list, m mVar, g1 g1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            mVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                mVar.h(i, g1Var, list.get(i2));
            }
        }
    }

    public static void M(int i, List list, m mVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                lVar.Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += l.k(((Integer) list.get(i4)).intValue());
                }
                lVar.S(i3);
                while (i2 < list.size()) {
                    lVar.J(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                lVar.I(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void N(int i, List list, m mVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                lVar.Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += l.x(((Long) list.get(i4)).longValue());
                }
                lVar.S(i3);
                while (i2 < list.size()) {
                    lVar.U(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                lVar.T(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void O(int i, List list, m mVar, g1 g1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            mVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                mVar.k(i, g1Var, list.get(i2));
            }
        }
    }

    public static void P(int i, List list, m mVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                lVar.Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = l.b;
                    i3 += 4;
                }
                lVar.S(i3);
                while (i2 < list.size()) {
                    lVar.F(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                lVar.E(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void Q(int i, List list, m mVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                lVar.Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = l.b;
                    i3 += 8;
                }
                lVar.S(i3);
                while (i2 < list.size()) {
                    lVar.H(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                lVar.G(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void R(int i, List list, m mVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                lVar.Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += l.v((intValue >> 31) ^ (intValue << 1));
                }
                lVar.S(i3);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    lVar.S((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                lVar.R(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    public static void S(int i, List list, m mVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                lVar.Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += l.x((longValue >> 63) ^ (longValue << 1));
                }
                lVar.S(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    lVar.U((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                lVar.T(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    public static void T(int i, List list, m mVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            mVar.getClass();
            boolean z = list instanceof f0;
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                f0 f0Var = (f0) list;
                while (i2 < list.size()) {
                    Object raw = f0Var.getRaw(i2);
                    if (raw instanceof String) {
                        lVar.O(i, (String) raw);
                    } else {
                        lVar.C(i, (i) raw);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                lVar.O(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    public static void U(int i, List list, m mVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                lVar.Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += l.v(((Integer) list.get(i4)).intValue());
                }
                lVar.S(i3);
                while (i2 < list.size()) {
                    lVar.S(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                lVar.R(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void V(int i, List list, m mVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.a;
            int i2 = 0;
            if (z) {
                lVar.Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += l.x(((Long) list.get(i4)).longValue());
                }
                lVar.S(i3);
                while (i2 < list.size()) {
                    lVar.U(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                lVar.T(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l.b(i) * size;
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(int i, List<i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = l.t(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int size2 = list.get(i2).size();
            t += l.v(size2) + size2;
        }
        return t;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.t(i) * size) + e(list);
    }

    public static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i = 0;
            while (i2 < size) {
                yVar.d(i2);
                i += l.k(yVar.c[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += l.k(list.get(i2).intValue());
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
        return l.f(i) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l.g(i) * size;
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i, List<q0> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += l.i(i, list.get(i3), g1Var);
        }
        return i2;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.t(i) * size) + l(list);
    }

    public static int l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i = 0;
            while (i2 < size) {
                yVar.d(i2);
                i += l.k(yVar.c[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += l.k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (l.t(i) * list.size()) + n(list);
    }

    public static int n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i = 0;
            while (i2 < size) {
                h0Var.d(i2);
                i += l.x(h0Var.c[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += l.x(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int o(int i, g1 g1Var, Object obj) {
        if (obj instanceof d0) {
            return l.m((d0) obj) + l.t(i);
        }
        int t = l.t(i);
        int d2 = ((a) ((q0) obj)).d(g1Var);
        return l.v(d2) + d2 + t;
    }

    public static int p(int i, List<?> list, g1 g1Var) {
        int v;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = l.t(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof d0) {
                v = l.m((d0) obj);
            } else {
                int d2 = ((a) ((q0) obj)).d(g1Var);
                v = d2 + l.v(d2);
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
        return (l.t(i) * size) + r(list);
    }

    public static int r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i = 0;
            while (i2 < size) {
                yVar.d(i2);
                int i3 = yVar.c[i2];
                i += l.v((i3 >> 31) ^ (i3 << 1));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i += l.v((intValue >> 31) ^ (intValue << 1));
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
        return (l.t(i) * size) + t(list);
    }

    public static int t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i = 0;
            while (i2 < size) {
                h0Var.d(i2);
                long j = h0Var.c[i2];
                i += l.x((j >> 63) ^ (j << 1));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i += l.x((longValue >> 63) ^ (longValue << 1));
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
        int t = l.t(i) * size;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            while (i2 < size) {
                Object raw = f0Var.getRaw(i2);
                if (raw instanceof i) {
                    int size2 = ((i) raw).size();
                    s2 = l.v(size2) + size2;
                } else {
                    s2 = l.s((String) raw);
                }
                t += s2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof i) {
                    int size3 = ((i) obj).size();
                    s = l.v(size3) + size3;
                } else {
                    s = l.s((String) obj);
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
        return (l.t(i) * size) + w(list);
    }

    public static int w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i = 0;
            while (i2 < size) {
                yVar.d(i2);
                i += l.v(yVar.c[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += l.v(list.get(i2).intValue());
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
        return (l.t(i) * size) + y(list);
    }

    public static int y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i = 0;
            while (i2 < size) {
                h0Var.d(i2);
                i += l.x(h0Var.c[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += l.x(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static <UT, UB> UB z(int i, List<Integer> list, z.b bVar, UB ub, n1<UT, UB> n1Var) {
        if (bVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (bVar.a()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) D(i, intValue, ub, n1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!bVar.a()) {
                    ub = (UB) D(i, intValue2, ub, n1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
