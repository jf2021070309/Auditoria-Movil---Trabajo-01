package c.g.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import c.g.c.e;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.ads.AdSize;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class d {
    public static final int[] a = {0, 4, 8};

    /* renamed from: b  reason: collision with root package name */
    public static SparseIntArray f1842b = new SparseIntArray();

    /* renamed from: c  reason: collision with root package name */
    public static SparseIntArray f1843c = new SparseIntArray();

    /* renamed from: d  reason: collision with root package name */
    public HashMap<String, c.g.c.a> f1844d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f1845e = true;

    /* renamed from: f  reason: collision with root package name */
    public HashMap<Integer, a> f1846f = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final C0033d f1847b = new C0033d();

        /* renamed from: c  reason: collision with root package name */
        public final c f1848c = new c();

        /* renamed from: d  reason: collision with root package name */
        public final b f1849d = new b();

        /* renamed from: e  reason: collision with root package name */
        public final e f1850e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, c.g.c.a> f1851f = new HashMap<>();

        /* renamed from: g  reason: collision with root package name */
        public C0032a f1852g;

        /* renamed from: c.g.c.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0032a {
            public int[] a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f1853b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            public int f1854c = 0;

            /* renamed from: d  reason: collision with root package name */
            public int[] f1855d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f1856e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f1857f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f1858g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f1859h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f1860i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f1861j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f1862k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f1863l = 0;

            public void a(int i2, float f2) {
                int i3 = this.f1857f;
                int[] iArr = this.f1855d;
                if (i3 >= iArr.length) {
                    this.f1855d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1856e;
                    this.f1856e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1855d;
                int i4 = this.f1857f;
                iArr2[i4] = i2;
                float[] fArr2 = this.f1856e;
                this.f1857f = i4 + 1;
                fArr2[i4] = f2;
            }

            public void b(int i2, int i3) {
                int i4 = this.f1854c;
                int[] iArr = this.a;
                if (i4 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1853b;
                    this.f1853b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i5 = this.f1854c;
                iArr3[i5] = i2;
                int[] iArr4 = this.f1853b;
                this.f1854c = i5 + 1;
                iArr4[i5] = i3;
            }

            public void c(int i2, String str) {
                int i3 = this.f1860i;
                int[] iArr = this.f1858g;
                if (i3 >= iArr.length) {
                    this.f1858g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1859h;
                    this.f1859h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1858g;
                int i4 = this.f1860i;
                iArr2[i4] = i2;
                String[] strArr2 = this.f1859h;
                this.f1860i = i4 + 1;
                strArr2[i4] = str;
            }

            public void d(int i2, boolean z) {
                int i3 = this.f1863l;
                int[] iArr = this.f1861j;
                if (i3 >= iArr.length) {
                    this.f1861j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1862k;
                    this.f1862k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1861j;
                int i4 = this.f1863l;
                iArr2[i4] = i2;
                boolean[] zArr2 = this.f1862k;
                this.f1863l = i4 + 1;
                zArr2[i4] = z;
            }
        }

        public void a(ConstraintLayout.a aVar) {
            b bVar = this.f1849d;
            aVar.f297e = bVar.f1872j;
            aVar.f298f = bVar.f1873k;
            aVar.f299g = bVar.f1874l;
            aVar.f300h = bVar.f1875m;
            aVar.f301i = bVar.f1876n;
            aVar.f302j = bVar.o;
            aVar.f303k = bVar.p;
            aVar.f304l = bVar.q;
            aVar.f305m = bVar.r;
            aVar.f306n = bVar.s;
            aVar.o = bVar.t;
            aVar.s = bVar.u;
            aVar.t = bVar.v;
            aVar.u = bVar.w;
            aVar.v = bVar.x;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = bVar.I;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = bVar.J;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = bVar.K;
            aVar.A = bVar.T;
            aVar.B = bVar.S;
            aVar.x = bVar.P;
            aVar.z = bVar.R;
            aVar.E = bVar.y;
            aVar.F = bVar.z;
            b bVar2 = this.f1849d;
            aVar.p = bVar2.B;
            aVar.q = bVar2.C;
            aVar.r = bVar2.D;
            aVar.G = bVar2.A;
            aVar.T = bVar2.E;
            aVar.U = bVar2.F;
            aVar.I = bVar2.V;
            aVar.H = bVar2.W;
            aVar.K = bVar2.Y;
            aVar.J = bVar2.X;
            aVar.W = bVar2.n0;
            aVar.X = bVar2.o0;
            aVar.L = bVar2.Z;
            aVar.M = bVar2.a0;
            aVar.P = bVar2.b0;
            aVar.Q = bVar2.c0;
            aVar.N = bVar2.d0;
            aVar.O = bVar2.e0;
            aVar.R = bVar2.f0;
            aVar.S = bVar2.g0;
            aVar.V = bVar2.G;
            aVar.f295c = bVar2.f1870h;
            aVar.a = bVar2.f1868f;
            aVar.f294b = bVar2.f1869g;
            ((ViewGroup.MarginLayoutParams) aVar).width = bVar2.f1866d;
            b bVar3 = this.f1849d;
            ((ViewGroup.MarginLayoutParams) aVar).height = bVar3.f1867e;
            String str = bVar3.m0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = bVar3.q0;
            aVar.setMarginStart(bVar3.M);
            aVar.setMarginEnd(this.f1849d.L);
            aVar.a();
        }

        public final void b(int i2, ConstraintLayout.a aVar) {
            this.a = i2;
            b bVar = this.f1849d;
            bVar.f1872j = aVar.f297e;
            bVar.f1873k = aVar.f298f;
            bVar.f1874l = aVar.f299g;
            bVar.f1875m = aVar.f300h;
            bVar.f1876n = aVar.f301i;
            bVar.o = aVar.f302j;
            bVar.p = aVar.f303k;
            bVar.q = aVar.f304l;
            bVar.r = aVar.f305m;
            bVar.s = aVar.f306n;
            bVar.t = aVar.o;
            bVar.u = aVar.s;
            bVar.v = aVar.t;
            bVar.w = aVar.u;
            bVar.x = aVar.v;
            bVar.y = aVar.E;
            bVar.z = aVar.F;
            bVar.A = aVar.G;
            bVar.B = aVar.p;
            bVar.C = aVar.q;
            bVar.D = aVar.r;
            bVar.E = aVar.T;
            bVar.F = aVar.U;
            bVar.G = aVar.V;
            bVar.f1870h = aVar.f295c;
            b bVar2 = this.f1849d;
            bVar2.f1868f = aVar.a;
            bVar2.f1869g = aVar.f294b;
            bVar2.f1866d = ((ViewGroup.MarginLayoutParams) aVar).width;
            bVar2.f1867e = ((ViewGroup.MarginLayoutParams) aVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            bVar2.N = aVar.D;
            bVar2.V = aVar.I;
            bVar2.W = aVar.H;
            bVar2.Y = aVar.K;
            bVar2.X = aVar.J;
            bVar2.n0 = aVar.W;
            bVar2.o0 = aVar.X;
            bVar2.Z = aVar.L;
            bVar2.a0 = aVar.M;
            bVar2.b0 = aVar.P;
            bVar2.c0 = aVar.Q;
            bVar2.d0 = aVar.N;
            bVar2.e0 = aVar.O;
            bVar2.f0 = aVar.R;
            bVar2.g0 = aVar.S;
            bVar2.m0 = aVar.Y;
            bVar2.P = aVar.x;
            b bVar3 = this.f1849d;
            bVar3.R = aVar.z;
            bVar3.O = aVar.w;
            bVar3.Q = aVar.y;
            bVar3.T = aVar.A;
            bVar3.S = aVar.B;
            bVar3.U = aVar.C;
            bVar3.q0 = aVar.Z;
            bVar3.L = aVar.getMarginEnd();
            this.f1849d.M = aVar.getMarginStart();
        }

        public final void c(int i2, e.a aVar) {
            b(i2, aVar);
            this.f1847b.f1892d = aVar.r0;
            e eVar = this.f1850e;
            eVar.f1895c = aVar.u0;
            eVar.f1896d = aVar.v0;
            eVar.f1897e = aVar.w0;
            eVar.f1898f = aVar.x0;
            eVar.f1899g = aVar.y0;
            eVar.f1900h = aVar.z0;
            eVar.f1901i = aVar.A0;
            eVar.f1903k = aVar.B0;
            eVar.f1904l = aVar.C0;
            eVar.f1905m = aVar.D0;
            eVar.o = aVar.t0;
            eVar.f1906n = aVar.s0;
        }

        public Object clone() throws CloneNotSupportedException {
            a aVar = new a();
            b bVar = aVar.f1849d;
            b bVar2 = this.f1849d;
            Objects.requireNonNull(bVar);
            bVar.f1864b = bVar2.f1864b;
            bVar.f1866d = bVar2.f1866d;
            bVar.f1865c = bVar2.f1865c;
            bVar.f1867e = bVar2.f1867e;
            bVar.f1868f = bVar2.f1868f;
            bVar.f1869g = bVar2.f1869g;
            bVar.f1870h = bVar2.f1870h;
            bVar.f1871i = bVar2.f1871i;
            bVar.f1872j = bVar2.f1872j;
            bVar.f1873k = bVar2.f1873k;
            bVar.f1874l = bVar2.f1874l;
            bVar.f1875m = bVar2.f1875m;
            bVar.f1876n = bVar2.f1876n;
            bVar.o = bVar2.o;
            bVar.p = bVar2.p;
            bVar.q = bVar2.q;
            bVar.r = bVar2.r;
            bVar.s = bVar2.s;
            bVar.t = bVar2.t;
            bVar.u = bVar2.u;
            bVar.v = bVar2.v;
            bVar.w = bVar2.w;
            bVar.x = bVar2.x;
            bVar.y = bVar2.y;
            bVar.z = bVar2.z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.a0 = bVar2.a0;
            bVar.b0 = bVar2.b0;
            bVar.c0 = bVar2.c0;
            bVar.d0 = bVar2.d0;
            bVar.e0 = bVar2.e0;
            bVar.f0 = bVar2.f0;
            bVar.g0 = bVar2.g0;
            bVar.h0 = bVar2.h0;
            bVar.i0 = bVar2.i0;
            bVar.j0 = bVar2.j0;
            bVar.m0 = bVar2.m0;
            int[] iArr = bVar2.k0;
            if (iArr == null || bVar2.l0 != null) {
                bVar.k0 = null;
            } else {
                bVar.k0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.l0 = bVar2.l0;
            bVar.n0 = bVar2.n0;
            bVar.o0 = bVar2.o0;
            bVar.p0 = bVar2.p0;
            bVar.q0 = bVar2.q0;
            c cVar = aVar.f1848c;
            c cVar2 = this.f1848c;
            Objects.requireNonNull(cVar);
            cVar.f1877b = cVar2.f1877b;
            cVar.f1878c = cVar2.f1878c;
            cVar.f1880e = cVar2.f1880e;
            cVar.f1881f = cVar2.f1881f;
            cVar.f1882g = cVar2.f1882g;
            cVar.f1885j = cVar2.f1885j;
            cVar.f1883h = cVar2.f1883h;
            cVar.f1884i = cVar2.f1884i;
            C0033d c0033d = aVar.f1847b;
            C0033d c0033d2 = this.f1847b;
            Objects.requireNonNull(c0033d);
            c0033d.a = c0033d2.a;
            c0033d.f1890b = c0033d2.f1890b;
            c0033d.f1892d = c0033d2.f1892d;
            c0033d.f1893e = c0033d2.f1893e;
            c0033d.f1891c = c0033d2.f1891c;
            e eVar = aVar.f1850e;
            e eVar2 = this.f1850e;
            Objects.requireNonNull(eVar);
            eVar.f1894b = eVar2.f1894b;
            eVar.f1895c = eVar2.f1895c;
            eVar.f1896d = eVar2.f1896d;
            eVar.f1897e = eVar2.f1897e;
            eVar.f1898f = eVar2.f1898f;
            eVar.f1899g = eVar2.f1899g;
            eVar.f1900h = eVar2.f1900h;
            eVar.f1901i = eVar2.f1901i;
            eVar.f1902j = eVar2.f1902j;
            eVar.f1903k = eVar2.f1903k;
            eVar.f1904l = eVar2.f1904l;
            eVar.f1905m = eVar2.f1905m;
            eVar.f1906n = eVar2.f1906n;
            eVar.o = eVar2.o;
            aVar.a = this.a;
            aVar.f1852g = this.f1852g;
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static SparseIntArray a;

        /* renamed from: d  reason: collision with root package name */
        public int f1866d;

        /* renamed from: e  reason: collision with root package name */
        public int f1867e;
        public int[] k0;
        public String l0;
        public String m0;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1864b = false;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1865c = false;

        /* renamed from: f  reason: collision with root package name */
        public int f1868f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1869g = -1;

        /* renamed from: h  reason: collision with root package name */
        public float f1870h = -1.0f;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1871i = true;

        /* renamed from: j  reason: collision with root package name */
        public int f1872j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f1873k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f1874l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f1875m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f1876n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public float y = 0.5f;
        public float z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Level.ALL_INT;
        public int P = Level.ALL_INT;
        public int Q = Level.ALL_INT;
        public int R = Level.ALL_INT;
        public int S = Level.ALL_INT;
        public int T = Level.ALL_INT;
        public int U = Level.ALL_INT;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public int e0 = 0;
        public float f0 = 1.0f;
        public float g0 = 1.0f;
        public int h0 = -1;
        public int i0 = 0;
        public int j0 = -1;
        public boolean n0 = false;
        public boolean o0 = false;
        public boolean p0 = true;
        public int q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(43, 24);
            a.append(44, 25);
            a.append(46, 28);
            a.append(47, 29);
            a.append(52, 35);
            a.append(51, 34);
            a.append(24, 4);
            a.append(23, 3);
            a.append(19, 1);
            a.append(61, 6);
            a.append(62, 7);
            a.append(31, 17);
            a.append(32, 18);
            a.append(33, 19);
            a.append(15, 90);
            a.append(0, 26);
            a.append(48, 31);
            a.append(49, 32);
            a.append(30, 10);
            a.append(29, 9);
            a.append(66, 13);
            a.append(69, 16);
            a.append(67, 14);
            a.append(64, 11);
            a.append(68, 15);
            a.append(65, 12);
            a.append(55, 38);
            a.append(41, 37);
            a.append(40, 39);
            a.append(54, 40);
            a.append(39, 20);
            a.append(53, 36);
            a.append(28, 5);
            a.append(42, 91);
            a.append(50, 91);
            a.append(45, 91);
            a.append(22, 91);
            a.append(18, 91);
            a.append(3, 23);
            a.append(5, 27);
            a.append(7, 30);
            a.append(8, 8);
            a.append(4, 33);
            a.append(6, 2);
            a.append(1, 22);
            a.append(2, 21);
            a.append(56, 41);
            a.append(34, 42);
            a.append(17, 41);
            a.append(16, 42);
            a.append(71, 76);
            a.append(25, 61);
            a.append(27, 62);
            a.append(26, 63);
            a.append(60, 69);
            a.append(38, 70);
            a.append(12, 71);
            a.append(10, 72);
            a.append(11, 73);
            a.append(13, 74);
            a.append(9, 75);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f1913f);
            this.f1865c = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = a.get(index);
                switch (i3) {
                    case 1:
                        int i4 = this.r;
                        int[] iArr = d.a;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i4);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.r = resourceId;
                        break;
                    case 2:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        int i5 = this.q;
                        int[] iArr2 = d.a;
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, i5);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.q = resourceId2;
                        break;
                    case 4:
                        int i6 = this.p;
                        int[] iArr3 = d.a;
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, i6);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.p = resourceId3;
                        break;
                    case 5:
                        this.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        int i7 = this.x;
                        int[] iArr4 = d.a;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, i7);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.x = resourceId4;
                        break;
                    case 10:
                        int i8 = this.w;
                        int[] iArr5 = d.a;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, i8);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.w = resourceId5;
                        break;
                    case 11:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f1868f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1868f);
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        this.f1869g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1869g);
                        break;
                    case 19:
                        this.f1870h = obtainStyledAttributes.getFloat(index, this.f1870h);
                        break;
                    case 20:
                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        this.f1867e = obtainStyledAttributes.getLayoutDimension(index, this.f1867e);
                        break;
                    case 22:
                        this.f1866d = obtainStyledAttributes.getLayoutDimension(index, this.f1866d);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        int i9 = this.f1872j;
                        int[] iArr6 = d.a;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, i9);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1872j = resourceId6;
                        break;
                    case 25:
                        int i10 = this.f1873k;
                        int[] iArr7 = d.a;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, i10);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1873k = resourceId7;
                        break;
                    case 26:
                        this.G = obtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        int i11 = this.f1874l;
                        int[] iArr8 = d.a;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, i11);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1874l = resourceId8;
                        break;
                    case 29:
                        int i12 = this.f1875m;
                        int[] iArr9 = d.a;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, i12);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1875m = resourceId9;
                        break;
                    case 30:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        int i13 = this.u;
                        int[] iArr10 = d.a;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, i13);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.u = resourceId10;
                        break;
                    case 32:
                        int i14 = this.v;
                        int[] iArr11 = d.a;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, i14);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.v = resourceId11;
                        break;
                    case 33:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        int i15 = this.o;
                        int[] iArr12 = d.a;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, i15);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.o = resourceId12;
                        break;
                    case 35:
                        int i16 = this.f1876n;
                        int[] iArr13 = d.a;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, i16);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1876n = resourceId13;
                        break;
                    case 36:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 37:
                        this.W = obtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        d.g(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.g(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i3) {
                            case 61:
                                int i17 = this.B;
                                int[] iArr14 = d.a;
                                int resourceId14 = obtainStyledAttributes.getResourceId(index, i17);
                                if (resourceId14 == -1) {
                                    resourceId14 = obtainStyledAttributes.getInt(index, -1);
                                }
                                this.B = resourceId14;
                                continue;
                            case 62:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            case 63:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                continue;
                            default:
                                switch (i3) {
                                    case 69:
                                        this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                        continue;
                                    case CoreConstants.OOS_RESET_FREQUENCY /* 70 */:
                                        this.g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case SyslogConstants.LOG_CRON /* 72 */:
                                        this.h0 = obtainStyledAttributes.getInt(index, this.h0);
                                        continue;
                                    case 73:
                                        this.i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.i0);
                                        continue;
                                    case 74:
                                        this.l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.p0 = obtainStyledAttributes.getBoolean(index, this.p0);
                                        continue;
                                    case 76:
                                        this.q0 = obtainStyledAttributes.getInt(index, this.q0);
                                        continue;
                                    case 77:
                                        int i18 = this.s;
                                        int[] iArr15 = d.a;
                                        int resourceId15 = obtainStyledAttributes.getResourceId(index, i18);
                                        if (resourceId15 == -1) {
                                            resourceId15 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.s = resourceId15;
                                        continue;
                                    case 78:
                                        int i19 = this.t;
                                        int[] iArr16 = d.a;
                                        int resourceId16 = obtainStyledAttributes.getResourceId(index, i19);
                                        if (resourceId16 == -1) {
                                            resourceId16 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.t = resourceId16;
                                        continue;
                                    case 79:
                                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        continue;
                                    case SyslogConstants.LOG_AUTHPRIV /* 80 */:
                                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        continue;
                                    case 81:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 82:
                                        this.a0 = obtainStyledAttributes.getInt(index, this.a0);
                                        continue;
                                    case 83:
                                        this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        continue;
                                    case 84:
                                        this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        continue;
                                    case 85:
                                        this.e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.e0);
                                        continue;
                                    case 86:
                                        this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        continue;
                                    case 87:
                                        this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                        continue;
                                    case SyslogConstants.LOG_FTP /* 88 */:
                                        this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                        continue;
                                    case 89:
                                        this.m0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case AdSize.LARGE_AD_HEIGHT /* 90 */:
                                        this.f1871i = obtainStyledAttributes.getBoolean(index, this.f1871i);
                                        continue;
                                    case 91:
                                        StringBuilder y = e.a.d.a.a.y("unused attribute 0x");
                                        y.append(Integer.toHexString(index));
                                        y.append("   ");
                                        y.append(a.get(index));
                                        Log.w("ConstraintSet", y.toString());
                                        continue;
                                    default:
                                        StringBuilder y2 = e.a.d.a.a.y("Unknown attribute 0x");
                                        y2.append(Integer.toHexString(index));
                                        y2.append("   ");
                                        y2.append(a.get(index));
                                        Log.w("ConstraintSet", y2.toString());
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static SparseIntArray a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1877b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f1878c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f1879d = 0;

        /* renamed from: e  reason: collision with root package name */
        public String f1880e = null;

        /* renamed from: f  reason: collision with root package name */
        public int f1881f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1882g = 0;

        /* renamed from: h  reason: collision with root package name */
        public float f1883h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f1884i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f1885j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public float f1886k = Float.NaN;

        /* renamed from: l  reason: collision with root package name */
        public int f1887l = -1;

        /* renamed from: m  reason: collision with root package name */
        public String f1888m = null;

        /* renamed from: n  reason: collision with root package name */
        public int f1889n = -3;
        public int o = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(3, 1);
            a.append(5, 2);
            a.append(9, 3);
            a.append(2, 4);
            a.append(1, 5);
            a.append(0, 6);
            a.append(4, 7);
            a.append(8, 8);
            a.append(7, 9);
            a.append(6, 10);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f1914g);
            this.f1877b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (a.get(index)) {
                    case 1:
                        this.f1885j = obtainStyledAttributes.getFloat(index, this.f1885j);
                        break;
                    case 2:
                        this.f1881f = obtainStyledAttributes.getInt(index, this.f1881f);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f1880e = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f1880e = c.g.a.h.a.a.f1718b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f1882g = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i3 = this.f1878c;
                        int[] iArr = d.a;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1878c = resourceId;
                        break;
                    case 6:
                        this.f1879d = obtainStyledAttributes.getInteger(index, this.f1879d);
                        break;
                    case 7:
                        this.f1883h = obtainStyledAttributes.getFloat(index, this.f1883h);
                        break;
                    case 8:
                        this.f1887l = obtainStyledAttributes.getInteger(index, this.f1887l);
                        break;
                    case 9:
                        this.f1886k = obtainStyledAttributes.getFloat(index, this.f1886k);
                        break;
                    case 10:
                        int i4 = obtainStyledAttributes.peekValue(index).type;
                        if (i4 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            this.o = resourceId2;
                            if (resourceId2 != -1) {
                                this.f1889n = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i4 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f1888m = string;
                            if (string.indexOf("/") > 0) {
                                this.o = obtainStyledAttributes.getResourceId(index, -1);
                                this.f1889n = -2;
                                break;
                            } else {
                                this.f1889n = -1;
                                break;
                            }
                        } else {
                            this.f1889n = obtainStyledAttributes.getInteger(index, this.o);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c.g.c.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0033d {
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1890b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1891c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f1892d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1893e = Float.NaN;

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f1916i);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 1) {
                    this.f1892d = obtainStyledAttributes.getFloat(index, this.f1892d);
                } else if (index == 0) {
                    int i3 = obtainStyledAttributes.getInt(index, this.f1890b);
                    this.f1890b = i3;
                    int[] iArr = d.a;
                    this.f1890b = d.a[i3];
                } else if (index == 4) {
                    this.f1891c = obtainStyledAttributes.getInt(index, this.f1891c);
                } else if (index == 3) {
                    this.f1893e = obtainStyledAttributes.getFloat(index, this.f1893e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static SparseIntArray a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1894b = false;

        /* renamed from: c  reason: collision with root package name */
        public float f1895c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1896d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1897e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1898f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f1899g = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f1900h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public float f1901i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public int f1902j = -1;

        /* renamed from: k  reason: collision with root package name */
        public float f1903k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f1904l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public float f1905m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1906n = false;
        public float o = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(6, 1);
            a.append(7, 2);
            a.append(8, 3);
            a.append(4, 4);
            a.append(5, 5);
            a.append(0, 6);
            a.append(1, 7);
            a.append(2, 8);
            a.append(3, 9);
            a.append(9, 10);
            a.append(10, 11);
            a.append(11, 12);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f1918k);
            this.f1894b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (a.get(index)) {
                    case 1:
                        this.f1895c = obtainStyledAttributes.getFloat(index, this.f1895c);
                        break;
                    case 2:
                        this.f1896d = obtainStyledAttributes.getFloat(index, this.f1896d);
                        break;
                    case 3:
                        this.f1897e = obtainStyledAttributes.getFloat(index, this.f1897e);
                        break;
                    case 4:
                        this.f1898f = obtainStyledAttributes.getFloat(index, this.f1898f);
                        break;
                    case 5:
                        this.f1899g = obtainStyledAttributes.getFloat(index, this.f1899g);
                        break;
                    case 6:
                        this.f1900h = obtainStyledAttributes.getDimension(index, this.f1900h);
                        break;
                    case 7:
                        this.f1901i = obtainStyledAttributes.getDimension(index, this.f1901i);
                        break;
                    case 8:
                        this.f1903k = obtainStyledAttributes.getDimension(index, this.f1903k);
                        break;
                    case 9:
                        this.f1904l = obtainStyledAttributes.getDimension(index, this.f1904l);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f1905m = obtainStyledAttributes.getDimension(index, this.f1905m);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f1906n = true;
                            this.o = obtainStyledAttributes.getDimension(index, this.o);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int i3 = this.f1902j;
                        int[] iArr = d.a;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1902j = resourceId;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f1842b.append(82, 25);
        f1842b.append(83, 26);
        f1842b.append(85, 29);
        f1842b.append(86, 30);
        f1842b.append(92, 36);
        f1842b.append(91, 35);
        f1842b.append(63, 4);
        f1842b.append(62, 3);
        f1842b.append(58, 1);
        f1842b.append(60, 91);
        f1842b.append(59, 92);
        f1842b.append(101, 6);
        f1842b.append(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 7);
        f1842b.append(70, 17);
        f1842b.append(71, 18);
        f1842b.append(72, 19);
        f1842b.append(54, 99);
        f1842b.append(0, 27);
        f1842b.append(87, 32);
        f1842b.append(88, 33);
        f1842b.append(69, 10);
        f1842b.append(68, 9);
        f1842b.append(106, 13);
        f1842b.append(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, 16);
        f1842b.append(FacebookMediationAdapter.ERROR_NULL_CONTEXT, 14);
        f1842b.append(104, 11);
        f1842b.append(108, 15);
        f1842b.append(105, 12);
        f1842b.append(95, 40);
        f1842b.append(80, 39);
        f1842b.append(79, 41);
        f1842b.append(94, 42);
        f1842b.append(78, 20);
        f1842b.append(93, 37);
        f1842b.append(67, 5);
        f1842b.append(81, 87);
        f1842b.append(90, 87);
        f1842b.append(84, 87);
        f1842b.append(61, 87);
        f1842b.append(57, 87);
        f1842b.append(5, 24);
        f1842b.append(7, 28);
        f1842b.append(23, 31);
        f1842b.append(24, 8);
        f1842b.append(6, 34);
        f1842b.append(8, 2);
        f1842b.append(3, 23);
        f1842b.append(4, 21);
        f1842b.append(96, 95);
        f1842b.append(73, 96);
        f1842b.append(2, 22);
        f1842b.append(13, 43);
        f1842b.append(26, 44);
        f1842b.append(21, 45);
        f1842b.append(22, 46);
        f1842b.append(20, 60);
        f1842b.append(18, 47);
        f1842b.append(19, 48);
        f1842b.append(14, 49);
        f1842b.append(15, 50);
        f1842b.append(16, 51);
        f1842b.append(17, 52);
        f1842b.append(25, 53);
        f1842b.append(97, 54);
        f1842b.append(74, 55);
        f1842b.append(98, 56);
        f1842b.append(75, 57);
        f1842b.append(99, 58);
        f1842b.append(76, 59);
        f1842b.append(64, 61);
        f1842b.append(66, 62);
        f1842b.append(65, 63);
        f1842b.append(28, 64);
        f1842b.append(121, 65);
        f1842b.append(35, 66);
        f1842b.append(122, 67);
        f1842b.append(113, 79);
        f1842b.append(1, 38);
        f1842b.append(SyslogConstants.LOG_ALERT, 68);
        f1842b.append(100, 69);
        f1842b.append(77, 70);
        f1842b.append(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 97);
        f1842b.append(32, 71);
        f1842b.append(30, 72);
        f1842b.append(31, 73);
        f1842b.append(33, 74);
        f1842b.append(29, 75);
        f1842b.append(114, 76);
        f1842b.append(89, 77);
        f1842b.append(123, 78);
        f1842b.append(56, 80);
        f1842b.append(55, 81);
        f1842b.append(116, 82);
        f1842b.append(SyslogConstants.LOG_CLOCK, 83);
        f1842b.append(119, 84);
        f1842b.append(118, 85);
        f1842b.append(117, 86);
        f1843c.append(85, 6);
        f1843c.append(85, 7);
        f1843c.append(0, 27);
        f1843c.append(89, 13);
        f1843c.append(92, 16);
        f1843c.append(90, 14);
        f1843c.append(87, 11);
        f1843c.append(91, 15);
        f1843c.append(88, 12);
        f1843c.append(78, 40);
        f1843c.append(71, 39);
        f1843c.append(70, 41);
        f1843c.append(77, 42);
        f1843c.append(69, 20);
        f1843c.append(76, 37);
        f1843c.append(60, 5);
        f1843c.append(72, 87);
        f1843c.append(75, 87);
        f1843c.append(73, 87);
        f1843c.append(57, 87);
        f1843c.append(56, 87);
        f1843c.append(5, 24);
        f1843c.append(7, 28);
        f1843c.append(23, 31);
        f1843c.append(24, 8);
        f1843c.append(6, 34);
        f1843c.append(8, 2);
        f1843c.append(3, 23);
        f1843c.append(4, 21);
        f1843c.append(79, 95);
        f1843c.append(64, 96);
        f1843c.append(2, 22);
        f1843c.append(13, 43);
        f1843c.append(26, 44);
        f1843c.append(21, 45);
        f1843c.append(22, 46);
        f1843c.append(20, 60);
        f1843c.append(18, 47);
        f1843c.append(19, 48);
        f1843c.append(14, 49);
        f1843c.append(15, 50);
        f1843c.append(16, 51);
        f1843c.append(17, 52);
        f1843c.append(25, 53);
        f1843c.append(80, 54);
        f1843c.append(65, 55);
        f1843c.append(81, 56);
        f1843c.append(66, 57);
        f1843c.append(82, 58);
        f1843c.append(67, 59);
        f1843c.append(59, 62);
        f1843c.append(58, 63);
        f1843c.append(28, 64);
        f1843c.append(105, 65);
        f1843c.append(34, 66);
        f1843c.append(106, 67);
        f1843c.append(96, 79);
        f1843c.append(1, 38);
        f1843c.append(97, 98);
        f1843c.append(95, 68);
        f1843c.append(83, 69);
        f1843c.append(68, 70);
        f1843c.append(32, 71);
        f1843c.append(30, 72);
        f1843c.append(31, 73);
        f1843c.append(33, 74);
        f1843c.append(29, 75);
        f1843c.append(98, 76);
        f1843c.append(74, 77);
        f1843c.append(FacebookMediationAdapter.ERROR_NULL_CONTEXT, 78);
        f1843c.append(55, 80);
        f1843c.append(54, 81);
        f1843c.append(100, 82);
        f1843c.append(104, 83);
        f1843c.append(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, 84);
        f1843c.append(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 85);
        f1843c.append(101, 86);
        f1843c.append(94, 97);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.c.d.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i2 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.G = str;
    }

    public void a(ConstraintLayout constraintLayout) {
        b(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void b(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1846f.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.f1846f.containsKey(Integer.valueOf(id))) {
                StringBuilder y = e.a.d.a.a.y("id unknown ");
                y.append(c.e.a.e(childAt));
                Log.w("ConstraintSet", y.toString());
            } else if (this.f1845e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1 && this.f1846f.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = this.f1846f.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f1849d.j0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f1849d.h0);
                            barrier.setMargin(aVar.f1849d.i0);
                            barrier.setAllowsGoneWidget(aVar.f1849d.p0);
                            b bVar = aVar.f1849d;
                            int[] iArr = bVar.k0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.l0;
                                if (str != null) {
                                    bVar.k0 = d(barrier, str);
                                    barrier.setReferencedIds(aVar.f1849d.k0);
                                }
                            }
                        }
                        ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                        aVar2.a();
                        aVar.a(aVar2);
                        if (z) {
                            c.g.c.a.b(childAt, aVar.f1851f);
                        }
                        childAt.setLayoutParams(aVar2);
                        C0033d c0033d = aVar.f1847b;
                        if (c0033d.f1891c == 0) {
                            childAt.setVisibility(c0033d.f1890b);
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        childAt.setAlpha(aVar.f1847b.f1892d);
                        childAt.setRotation(aVar.f1850e.f1895c);
                        childAt.setRotationX(aVar.f1850e.f1896d);
                        childAt.setRotationY(aVar.f1850e.f1897e);
                        childAt.setScaleX(aVar.f1850e.f1898f);
                        childAt.setScaleY(aVar.f1850e.f1899g);
                        e eVar = aVar.f1850e;
                        if (eVar.f1902j != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f1850e.f1902j);
                            if (findViewById != null) {
                                float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f1900h)) {
                                childAt.setPivotX(aVar.f1850e.f1900h);
                            }
                            if (!Float.isNaN(aVar.f1850e.f1901i)) {
                                childAt.setPivotY(aVar.f1850e.f1901i);
                            }
                        }
                        childAt.setTranslationX(aVar.f1850e.f1903k);
                        childAt.setTranslationY(aVar.f1850e.f1904l);
                        if (i3 >= 21) {
                            childAt.setTranslationZ(aVar.f1850e.f1905m);
                            e eVar2 = aVar.f1850e;
                            if (eVar2.f1906n) {
                                childAt.setElevation(eVar2.o);
                            }
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f1846f.get(num);
            if (aVar3 != null) {
                if (aVar3.f1849d.j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar2 = aVar3.f1849d;
                    int[] iArr2 = bVar2.k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.l0;
                        if (str2 != null) {
                            bVar2.k0 = d(barrier2, str2);
                            barrier2.setReferencedIds(aVar3.f1849d.k0);
                        }
                    }
                    barrier2.setType(aVar3.f1849d.h0);
                    barrier2.setMargin(aVar3.f1849d.i0);
                    ConstraintLayout.a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.n();
                    aVar3.a(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar3.f1849d.f1864b) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.a generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.a(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof c.g.c.b) {
                ((c.g.c.b) childAt2).g(constraintLayout);
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d dVar = this;
        int childCount = constraintLayout.getChildCount();
        dVar.f1846f.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (dVar.f1845e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!dVar.f1846f.containsKey(Integer.valueOf(id))) {
                dVar.f1846f.put(Integer.valueOf(id), new a());
            }
            a aVar2 = dVar.f1846f.get(Integer.valueOf(id));
            if (aVar2 != null) {
                HashMap<String, c.g.c.a> hashMap = dVar.f1844d;
                HashMap<String, c.g.c.a> hashMap2 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap.keySet()) {
                    c.g.c.a aVar3 = hashMap.get(str);
                    try {
                    } catch (IllegalAccessException e2) {
                        e = e2;
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                    } catch (InvocationTargetException e4) {
                        e = e4;
                    }
                    if (str.equals("BackgroundColor")) {
                        hashMap2.put(str, new c.g.c.a(aVar3, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        try {
                            hashMap2.put(str, new c.g.c.a(aVar3, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e5) {
                            e = e5;
                            e.printStackTrace();
                        } catch (NoSuchMethodException e6) {
                            e = e6;
                            e.printStackTrace();
                        } catch (InvocationTargetException e7) {
                            e = e7;
                            e.printStackTrace();
                        }
                    }
                }
                aVar2.f1851f = hashMap2;
                aVar2.b(id, aVar);
                aVar2.f1847b.f1890b = childAt.getVisibility();
                int i3 = Build.VERSION.SDK_INT;
                aVar2.f1847b.f1892d = childAt.getAlpha();
                aVar2.f1850e.f1895c = childAt.getRotation();
                aVar2.f1850e.f1896d = childAt.getRotationX();
                aVar2.f1850e.f1897e = childAt.getRotationY();
                aVar2.f1850e.f1898f = childAt.getScaleX();
                aVar2.f1850e.f1899g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar2.f1850e;
                    eVar.f1900h = pivotX;
                    eVar.f1901i = pivotY;
                }
                aVar2.f1850e.f1903k = childAt.getTranslationX();
                aVar2.f1850e.f1904l = childAt.getTranslationY();
                if (i3 >= 21) {
                    aVar2.f1850e.f1905m = childAt.getTranslationZ();
                    e eVar2 = aVar2.f1850e;
                    if (eVar2.f1906n) {
                        eVar2.o = childAt.getElevation();
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar2.f1849d.p0 = barrier.getAllowsGoneWidget();
                    aVar2.f1849d.k0 = barrier.getReferencedIds();
                    aVar2.f1849d.h0 = barrier.getType();
                    aVar2.f1849d.i0 = barrier.getMargin();
                }
            }
            i2++;
            dVar = this;
        }
    }

    public final int[] d(View view, String str) {
        int i2;
        Object c2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, FacebookAdapter.KEY_ID, context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c2 = ((ConstraintLayout) view.getParent()).c(0, trim)) != null && (c2 instanceof Integer)) {
                i2 = ((Integer) c2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    public final a e(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? i.f1910c : i.a);
        int i2 = 3;
        int i3 = 1;
        if (z) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            a.C0032a c0032a = new a.C0032a();
            aVar.f1852g = c0032a;
            aVar.f1848c.f1877b = false;
            aVar.f1849d.f1865c = false;
            aVar.f1847b.a = false;
            aVar.f1850e.f1894b = false;
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                switch (f1843c.get(index)) {
                    case 2:
                        c0032a.b(2, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.K));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case SyslogConstants.LOG_FTP /* 88 */:
                    case 89:
                    case AdSize.LARGE_AD_HEIGHT /* 90 */:
                    case 91:
                    case 92:
                    default:
                        StringBuilder y = e.a.d.a.a.y("Unknown attribute 0x");
                        y.append(Integer.toHexString(index));
                        y.append("   ");
                        y.append(f1842b.get(index));
                        Log.w("ConstraintSet", y.toString());
                        break;
                    case 5:
                        c0032a.c(5, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        c0032a.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f1849d.E));
                        break;
                    case 7:
                        c0032a.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f1849d.F));
                        break;
                    case 8:
                        c0032a.b(8, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.L));
                        break;
                    case 11:
                        c0032a.b(11, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.R));
                        break;
                    case 12:
                        c0032a.b(12, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.S));
                        break;
                    case 13:
                        c0032a.b(13, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.O));
                        break;
                    case 14:
                        c0032a.b(14, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.Q));
                        break;
                    case 15:
                        c0032a.b(15, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.T));
                        break;
                    case 16:
                        c0032a.b(16, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.P));
                        break;
                    case 17:
                        c0032a.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f1849d.f1868f));
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        c0032a.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f1849d.f1869g));
                        break;
                    case 19:
                        c0032a.a(19, obtainStyledAttributes.getFloat(index, aVar.f1849d.f1870h));
                        break;
                    case 20:
                        c0032a.a(20, obtainStyledAttributes.getFloat(index, aVar.f1849d.y));
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        c0032a.b(21, obtainStyledAttributes.getLayoutDimension(index, aVar.f1849d.f1867e));
                        break;
                    case 22:
                        c0032a.b(22, a[obtainStyledAttributes.getInt(index, aVar.f1847b.f1890b)]);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        c0032a.b(23, obtainStyledAttributes.getLayoutDimension(index, aVar.f1849d.f1866d));
                        break;
                    case 24:
                        c0032a.b(24, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.H));
                        break;
                    case 27:
                        c0032a.b(27, obtainStyledAttributes.getInt(index, aVar.f1849d.G));
                        break;
                    case 28:
                        c0032a.b(28, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.I));
                        break;
                    case 31:
                        c0032a.b(31, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.M));
                        break;
                    case 34:
                        c0032a.b(34, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.J));
                        break;
                    case 37:
                        c0032a.a(37, obtainStyledAttributes.getFloat(index, aVar.f1849d.z));
                        break;
                    case 38:
                        int resourceId = obtainStyledAttributes.getResourceId(index, aVar.a);
                        aVar.a = resourceId;
                        c0032a.b(38, resourceId);
                        break;
                    case 39:
                        c0032a.a(39, obtainStyledAttributes.getFloat(index, aVar.f1849d.W));
                        break;
                    case 40:
                        c0032a.a(40, obtainStyledAttributes.getFloat(index, aVar.f1849d.V));
                        break;
                    case 41:
                        c0032a.b(41, obtainStyledAttributes.getInt(index, aVar.f1849d.X));
                        break;
                    case 42:
                        c0032a.b(42, obtainStyledAttributes.getInt(index, aVar.f1849d.Y));
                        break;
                    case 43:
                        c0032a.a(43, obtainStyledAttributes.getFloat(index, aVar.f1847b.f1892d));
                        break;
                    case 44:
                        if (Build.VERSION.SDK_INT >= 21) {
                            c0032a.d(44, true);
                            c0032a.a(44, obtainStyledAttributes.getDimension(index, aVar.f1850e.o));
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        c0032a.a(45, obtainStyledAttributes.getFloat(index, aVar.f1850e.f1896d));
                        break;
                    case 46:
                        c0032a.a(46, obtainStyledAttributes.getFloat(index, aVar.f1850e.f1897e));
                        break;
                    case 47:
                        c0032a.a(47, obtainStyledAttributes.getFloat(index, aVar.f1850e.f1898f));
                        break;
                    case SyslogConstants.LOG_LPR /* 48 */:
                        c0032a.a(48, obtainStyledAttributes.getFloat(index, aVar.f1850e.f1899g));
                        break;
                    case 49:
                        c0032a.a(49, obtainStyledAttributes.getDimension(index, aVar.f1850e.f1900h));
                        break;
                    case 50:
                        c0032a.a(50, obtainStyledAttributes.getDimension(index, aVar.f1850e.f1901i));
                        break;
                    case 51:
                        c0032a.a(51, obtainStyledAttributes.getDimension(index, aVar.f1850e.f1903k));
                        break;
                    case 52:
                        c0032a.a(52, obtainStyledAttributes.getDimension(index, aVar.f1850e.f1904l));
                        break;
                    case 53:
                        if (Build.VERSION.SDK_INT >= 21) {
                            c0032a.a(53, obtainStyledAttributes.getDimension(index, aVar.f1850e.f1905m));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        c0032a.b(54, obtainStyledAttributes.getInt(index, aVar.f1849d.Z));
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 55 */:
                        c0032a.b(55, obtainStyledAttributes.getInt(index, aVar.f1849d.a0));
                        break;
                    case SyslogConstants.LOG_NEWS /* 56 */:
                        c0032a.b(56, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.b0));
                        break;
                    case 57:
                        c0032a.b(57, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.c0));
                        break;
                    case 58:
                        c0032a.b(58, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.d0));
                        break;
                    case 59:
                        c0032a.b(59, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.e0));
                        break;
                    case 60:
                        c0032a.a(60, obtainStyledAttributes.getFloat(index, aVar.f1850e.f1895c));
                        break;
                    case 62:
                        c0032a.b(62, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.C));
                        break;
                    case 63:
                        c0032a.a(63, obtainStyledAttributes.getFloat(index, aVar.f1849d.D));
                        break;
                    case 64:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, aVar.f1848c.f1878c);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        c0032a.b(64, resourceId2);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0032a.c(65, obtainStyledAttributes.getString(index));
                            break;
                        } else {
                            c0032a.c(65, c.g.a.h.a.a.f1718b[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        c0032a.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        c0032a.a(67, obtainStyledAttributes.getFloat(index, aVar.f1848c.f1885j));
                        break;
                    case 68:
                        c0032a.a(68, obtainStyledAttributes.getFloat(index, aVar.f1847b.f1893e));
                        break;
                    case 69:
                        c0032a.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case CoreConstants.OOS_RESET_FREQUENCY /* 70 */:
                        c0032a.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case SyslogConstants.LOG_CRON /* 72 */:
                        c0032a.b(72, obtainStyledAttributes.getInt(index, aVar.f1849d.h0));
                        break;
                    case 73:
                        c0032a.b(73, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.i0));
                        break;
                    case 74:
                        c0032a.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        c0032a.d(75, obtainStyledAttributes.getBoolean(index, aVar.f1849d.p0));
                        break;
                    case 76:
                        c0032a.b(76, obtainStyledAttributes.getInt(index, aVar.f1848c.f1881f));
                        break;
                    case 77:
                        c0032a.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        c0032a.b(78, obtainStyledAttributes.getInt(index, aVar.f1847b.f1891c));
                        break;
                    case 79:
                        c0032a.a(79, obtainStyledAttributes.getFloat(index, aVar.f1848c.f1883h));
                        break;
                    case SyslogConstants.LOG_AUTHPRIV /* 80 */:
                        c0032a.d(80, obtainStyledAttributes.getBoolean(index, aVar.f1849d.n0));
                        break;
                    case 81:
                        c0032a.d(81, obtainStyledAttributes.getBoolean(index, aVar.f1849d.o0));
                        break;
                    case 82:
                        c0032a.b(82, obtainStyledAttributes.getInteger(index, aVar.f1848c.f1879d));
                        break;
                    case 83:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, aVar.f1850e.f1902j);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        c0032a.b(83, resourceId3);
                        break;
                    case 84:
                        c0032a.b(84, obtainStyledAttributes.getInteger(index, aVar.f1848c.f1887l));
                        break;
                    case 85:
                        c0032a.a(85, obtainStyledAttributes.getFloat(index, aVar.f1848c.f1886k));
                        break;
                    case 86:
                        int i5 = obtainStyledAttributes.peekValue(index).type;
                        if (i5 == i3) {
                            aVar.f1848c.o = obtainStyledAttributes.getResourceId(index, -1);
                            c0032a.b(89, aVar.f1848c.o);
                            c cVar = aVar.f1848c;
                            if (cVar.o != -1) {
                                cVar.f1889n = -2;
                                c0032a.b(88, -2);
                                break;
                            } else {
                                break;
                            }
                        } else if (i5 == 3) {
                            aVar.f1848c.f1888m = obtainStyledAttributes.getString(index);
                            c0032a.c(90, aVar.f1848c.f1888m);
                            if (aVar.f1848c.f1888m.indexOf("/") > 0) {
                                aVar.f1848c.o = obtainStyledAttributes.getResourceId(index, -1);
                                c0032a.b(89, aVar.f1848c.o);
                                aVar.f1848c.f1889n = -2;
                                c0032a.b(88, -2);
                                break;
                            } else {
                                aVar.f1848c.f1889n = -1;
                                c0032a.b(88, -1);
                                break;
                            }
                        } else {
                            c cVar2 = aVar.f1848c;
                            cVar2.f1889n = obtainStyledAttributes.getInteger(index, cVar2.o);
                            c0032a.b(88, aVar.f1848c.f1889n);
                            break;
                        }
                    case 87:
                        StringBuilder y2 = e.a.d.a.a.y("unused attribute 0x");
                        y2.append(Integer.toHexString(index));
                        y2.append("   ");
                        y2.append(f1842b.get(index));
                        Log.w("ConstraintSet", y2.toString());
                        break;
                    case 93:
                        c0032a.b(93, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.N));
                        break;
                    case 94:
                        c0032a.b(94, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1849d.U));
                        break;
                    case 95:
                        g(c0032a, obtainStyledAttributes, index, 0);
                        break;
                    case SyslogConstants.LOG_NTP /* 96 */:
                        g(c0032a, obtainStyledAttributes, index, i3);
                        break;
                    case 97:
                        c0032a.b(97, obtainStyledAttributes.getInt(index, aVar.f1849d.q0));
                        break;
                    case 98:
                        int i6 = c.g.b.a.c.u;
                        if (obtainStyledAttributes.peekValue(index).type == i2) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            aVar.a = obtainStyledAttributes.getResourceId(index, aVar.a);
                            break;
                        }
                    case 99:
                        c0032a.d(99, obtainStyledAttributes.getBoolean(index, aVar.f1849d.f1871i));
                        break;
                }
                i4++;
                i2 = 3;
                i3 = 1;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount2; i7++) {
                int index2 = obtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2 && 24 != index2) {
                    aVar.f1848c.f1877b = true;
                    aVar.f1849d.f1865c = true;
                    aVar.f1847b.a = true;
                    aVar.f1850e.f1894b = true;
                }
                switch (f1842b.get(index2)) {
                    case 1:
                        b bVar = aVar.f1849d;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index2, bVar.r);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar.r = resourceId4;
                        break;
                    case 2:
                        b bVar2 = aVar.f1849d;
                        bVar2.K = obtainStyledAttributes.getDimensionPixelSize(index2, bVar2.K);
                        break;
                    case 3:
                        b bVar3 = aVar.f1849d;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index2, bVar3.q);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar3.q = resourceId5;
                        break;
                    case 4:
                        b bVar4 = aVar.f1849d;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index2, bVar4.p);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar4.p = resourceId6;
                        break;
                    case 5:
                        aVar.f1849d.A = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        b bVar5 = aVar.f1849d;
                        bVar5.E = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar5.E);
                        break;
                    case 7:
                        b bVar6 = aVar.f1849d;
                        bVar6.F = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar6.F);
                        break;
                    case 8:
                        b bVar7 = aVar.f1849d;
                        bVar7.L = obtainStyledAttributes.getDimensionPixelSize(index2, bVar7.L);
                        break;
                    case 9:
                        b bVar8 = aVar.f1849d;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index2, bVar8.x);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar8.x = resourceId7;
                        break;
                    case 10:
                        b bVar9 = aVar.f1849d;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index2, bVar9.w);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar9.w = resourceId8;
                        break;
                    case 11:
                        b bVar10 = aVar.f1849d;
                        bVar10.R = obtainStyledAttributes.getDimensionPixelSize(index2, bVar10.R);
                        break;
                    case 12:
                        b bVar11 = aVar.f1849d;
                        bVar11.S = obtainStyledAttributes.getDimensionPixelSize(index2, bVar11.S);
                        break;
                    case 13:
                        b bVar12 = aVar.f1849d;
                        bVar12.O = obtainStyledAttributes.getDimensionPixelSize(index2, bVar12.O);
                        break;
                    case 14:
                        b bVar13 = aVar.f1849d;
                        bVar13.Q = obtainStyledAttributes.getDimensionPixelSize(index2, bVar13.Q);
                        break;
                    case 15:
                        b bVar14 = aVar.f1849d;
                        bVar14.T = obtainStyledAttributes.getDimensionPixelSize(index2, bVar14.T);
                        break;
                    case 16:
                        b bVar15 = aVar.f1849d;
                        bVar15.P = obtainStyledAttributes.getDimensionPixelSize(index2, bVar15.P);
                        break;
                    case 17:
                        b bVar16 = aVar.f1849d;
                        bVar16.f1868f = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar16.f1868f);
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        b bVar17 = aVar.f1849d;
                        bVar17.f1869g = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar17.f1869g);
                        break;
                    case 19:
                        b bVar18 = aVar.f1849d;
                        bVar18.f1870h = obtainStyledAttributes.getFloat(index2, bVar18.f1870h);
                        break;
                    case 20:
                        b bVar19 = aVar.f1849d;
                        bVar19.y = obtainStyledAttributes.getFloat(index2, bVar19.y);
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        b bVar20 = aVar.f1849d;
                        bVar20.f1867e = obtainStyledAttributes.getLayoutDimension(index2, bVar20.f1867e);
                        break;
                    case 22:
                        C0033d c0033d = aVar.f1847b;
                        c0033d.f1890b = obtainStyledAttributes.getInt(index2, c0033d.f1890b);
                        C0033d c0033d2 = aVar.f1847b;
                        c0033d2.f1890b = a[c0033d2.f1890b];
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        b bVar21 = aVar.f1849d;
                        bVar21.f1866d = obtainStyledAttributes.getLayoutDimension(index2, bVar21.f1866d);
                        break;
                    case 24:
                        b bVar22 = aVar.f1849d;
                        bVar22.H = obtainStyledAttributes.getDimensionPixelSize(index2, bVar22.H);
                        break;
                    case 25:
                        b bVar23 = aVar.f1849d;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index2, bVar23.f1872j);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar23.f1872j = resourceId9;
                        break;
                    case 26:
                        b bVar24 = aVar.f1849d;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index2, bVar24.f1873k);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar24.f1873k = resourceId10;
                        break;
                    case 27:
                        b bVar25 = aVar.f1849d;
                        bVar25.G = obtainStyledAttributes.getInt(index2, bVar25.G);
                        break;
                    case 28:
                        b bVar26 = aVar.f1849d;
                        bVar26.I = obtainStyledAttributes.getDimensionPixelSize(index2, bVar26.I);
                        break;
                    case 29:
                        b bVar27 = aVar.f1849d;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index2, bVar27.f1874l);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar27.f1874l = resourceId11;
                        break;
                    case 30:
                        b bVar28 = aVar.f1849d;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index2, bVar28.f1875m);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar28.f1875m = resourceId12;
                        break;
                    case 31:
                        b bVar29 = aVar.f1849d;
                        bVar29.M = obtainStyledAttributes.getDimensionPixelSize(index2, bVar29.M);
                        break;
                    case 32:
                        b bVar30 = aVar.f1849d;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index2, bVar30.u);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar30.u = resourceId13;
                        break;
                    case 33:
                        b bVar31 = aVar.f1849d;
                        int resourceId14 = obtainStyledAttributes.getResourceId(index2, bVar31.v);
                        if (resourceId14 == -1) {
                            resourceId14 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar31.v = resourceId14;
                        break;
                    case 34:
                        b bVar32 = aVar.f1849d;
                        bVar32.J = obtainStyledAttributes.getDimensionPixelSize(index2, bVar32.J);
                        break;
                    case 35:
                        b bVar33 = aVar.f1849d;
                        int resourceId15 = obtainStyledAttributes.getResourceId(index2, bVar33.o);
                        if (resourceId15 == -1) {
                            resourceId15 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar33.o = resourceId15;
                        break;
                    case 36:
                        b bVar34 = aVar.f1849d;
                        int resourceId16 = obtainStyledAttributes.getResourceId(index2, bVar34.f1876n);
                        if (resourceId16 == -1) {
                            resourceId16 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar34.f1876n = resourceId16;
                        break;
                    case 37:
                        b bVar35 = aVar.f1849d;
                        bVar35.z = obtainStyledAttributes.getFloat(index2, bVar35.z);
                        break;
                    case 38:
                        aVar.a = obtainStyledAttributes.getResourceId(index2, aVar.a);
                        break;
                    case 39:
                        b bVar36 = aVar.f1849d;
                        bVar36.W = obtainStyledAttributes.getFloat(index2, bVar36.W);
                        break;
                    case 40:
                        b bVar37 = aVar.f1849d;
                        bVar37.V = obtainStyledAttributes.getFloat(index2, bVar37.V);
                        break;
                    case 41:
                        b bVar38 = aVar.f1849d;
                        bVar38.X = obtainStyledAttributes.getInt(index2, bVar38.X);
                        break;
                    case 42:
                        b bVar39 = aVar.f1849d;
                        bVar39.Y = obtainStyledAttributes.getInt(index2, bVar39.Y);
                        break;
                    case 43:
                        C0033d c0033d3 = aVar.f1847b;
                        c0033d3.f1892d = obtainStyledAttributes.getFloat(index2, c0033d3.f1892d);
                        break;
                    case 44:
                        if (Build.VERSION.SDK_INT >= 21) {
                            e eVar = aVar.f1850e;
                            eVar.f1906n = true;
                            eVar.o = obtainStyledAttributes.getDimension(index2, eVar.o);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        e eVar2 = aVar.f1850e;
                        eVar2.f1896d = obtainStyledAttributes.getFloat(index2, eVar2.f1896d);
                        break;
                    case 46:
                        e eVar3 = aVar.f1850e;
                        eVar3.f1897e = obtainStyledAttributes.getFloat(index2, eVar3.f1897e);
                        break;
                    case 47:
                        e eVar4 = aVar.f1850e;
                        eVar4.f1898f = obtainStyledAttributes.getFloat(index2, eVar4.f1898f);
                        break;
                    case SyslogConstants.LOG_LPR /* 48 */:
                        e eVar5 = aVar.f1850e;
                        eVar5.f1899g = obtainStyledAttributes.getFloat(index2, eVar5.f1899g);
                        break;
                    case 49:
                        e eVar6 = aVar.f1850e;
                        eVar6.f1900h = obtainStyledAttributes.getDimension(index2, eVar6.f1900h);
                        break;
                    case 50:
                        e eVar7 = aVar.f1850e;
                        eVar7.f1901i = obtainStyledAttributes.getDimension(index2, eVar7.f1901i);
                        break;
                    case 51:
                        e eVar8 = aVar.f1850e;
                        eVar8.f1903k = obtainStyledAttributes.getDimension(index2, eVar8.f1903k);
                        break;
                    case 52:
                        e eVar9 = aVar.f1850e;
                        eVar9.f1904l = obtainStyledAttributes.getDimension(index2, eVar9.f1904l);
                        break;
                    case 53:
                        if (Build.VERSION.SDK_INT >= 21) {
                            e eVar10 = aVar.f1850e;
                            eVar10.f1905m = obtainStyledAttributes.getDimension(index2, eVar10.f1905m);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        b bVar40 = aVar.f1849d;
                        bVar40.Z = obtainStyledAttributes.getInt(index2, bVar40.Z);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 55 */:
                        b bVar41 = aVar.f1849d;
                        bVar41.a0 = obtainStyledAttributes.getInt(index2, bVar41.a0);
                        break;
                    case SyslogConstants.LOG_NEWS /* 56 */:
                        b bVar42 = aVar.f1849d;
                        bVar42.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar42.b0);
                        break;
                    case 57:
                        b bVar43 = aVar.f1849d;
                        bVar43.c0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar43.c0);
                        break;
                    case 58:
                        b bVar44 = aVar.f1849d;
                        bVar44.d0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar44.d0);
                        break;
                    case 59:
                        b bVar45 = aVar.f1849d;
                        bVar45.e0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar45.e0);
                        break;
                    case 60:
                        e eVar11 = aVar.f1850e;
                        eVar11.f1895c = obtainStyledAttributes.getFloat(index2, eVar11.f1895c);
                        break;
                    case 61:
                        b bVar46 = aVar.f1849d;
                        int resourceId17 = obtainStyledAttributes.getResourceId(index2, bVar46.B);
                        if (resourceId17 == -1) {
                            resourceId17 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar46.B = resourceId17;
                        break;
                    case 62:
                        b bVar47 = aVar.f1849d;
                        bVar47.C = obtainStyledAttributes.getDimensionPixelSize(index2, bVar47.C);
                        break;
                    case 63:
                        b bVar48 = aVar.f1849d;
                        bVar48.D = obtainStyledAttributes.getFloat(index2, bVar48.D);
                        break;
                    case 64:
                        c cVar3 = aVar.f1848c;
                        int resourceId18 = obtainStyledAttributes.getResourceId(index2, cVar3.f1878c);
                        if (resourceId18 == -1) {
                            resourceId18 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        cVar3.f1878c = resourceId18;
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            aVar.f1848c.f1880e = obtainStyledAttributes.getString(index2);
                            break;
                        } else {
                            aVar.f1848c.f1880e = c.g.a.h.a.a.f1718b[obtainStyledAttributes.getInteger(index2, 0)];
                            break;
                        }
                    case 66:
                        aVar.f1848c.f1882g = obtainStyledAttributes.getInt(index2, 0);
                        break;
                    case 67:
                        c cVar4 = aVar.f1848c;
                        cVar4.f1885j = obtainStyledAttributes.getFloat(index2, cVar4.f1885j);
                        break;
                    case 68:
                        C0033d c0033d4 = aVar.f1847b;
                        c0033d4.f1893e = obtainStyledAttributes.getFloat(index2, c0033d4.f1893e);
                        break;
                    case 69:
                        aVar.f1849d.f0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case CoreConstants.OOS_RESET_FREQUENCY /* 70 */:
                        aVar.f1849d.g0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case SyslogConstants.LOG_CRON /* 72 */:
                        b bVar49 = aVar.f1849d;
                        bVar49.h0 = obtainStyledAttributes.getInt(index2, bVar49.h0);
                        break;
                    case 73:
                        b bVar50 = aVar.f1849d;
                        bVar50.i0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar50.i0);
                        break;
                    case 74:
                        aVar.f1849d.l0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        b bVar51 = aVar.f1849d;
                        bVar51.p0 = obtainStyledAttributes.getBoolean(index2, bVar51.p0);
                        break;
                    case 76:
                        c cVar5 = aVar.f1848c;
                        cVar5.f1881f = obtainStyledAttributes.getInt(index2, cVar5.f1881f);
                        break;
                    case 77:
                        aVar.f1849d.m0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        C0033d c0033d5 = aVar.f1847b;
                        c0033d5.f1891c = obtainStyledAttributes.getInt(index2, c0033d5.f1891c);
                        break;
                    case 79:
                        c cVar6 = aVar.f1848c;
                        cVar6.f1883h = obtainStyledAttributes.getFloat(index2, cVar6.f1883h);
                        break;
                    case SyslogConstants.LOG_AUTHPRIV /* 80 */:
                        b bVar52 = aVar.f1849d;
                        bVar52.n0 = obtainStyledAttributes.getBoolean(index2, bVar52.n0);
                        break;
                    case 81:
                        b bVar53 = aVar.f1849d;
                        bVar53.o0 = obtainStyledAttributes.getBoolean(index2, bVar53.o0);
                        break;
                    case 82:
                        c cVar7 = aVar.f1848c;
                        cVar7.f1879d = obtainStyledAttributes.getInteger(index2, cVar7.f1879d);
                        break;
                    case 83:
                        e eVar12 = aVar.f1850e;
                        int resourceId19 = obtainStyledAttributes.getResourceId(index2, eVar12.f1902j);
                        if (resourceId19 == -1) {
                            resourceId19 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        eVar12.f1902j = resourceId19;
                        break;
                    case 84:
                        c cVar8 = aVar.f1848c;
                        cVar8.f1887l = obtainStyledAttributes.getInteger(index2, cVar8.f1887l);
                        break;
                    case 85:
                        c cVar9 = aVar.f1848c;
                        cVar9.f1886k = obtainStyledAttributes.getFloat(index2, cVar9.f1886k);
                        break;
                    case 86:
                        int i8 = obtainStyledAttributes.peekValue(index2).type;
                        if (i8 == 1) {
                            aVar.f1848c.o = obtainStyledAttributes.getResourceId(index2, -1);
                            c cVar10 = aVar.f1848c;
                            if (cVar10.o != -1) {
                                cVar10.f1889n = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i8 == 3) {
                            aVar.f1848c.f1888m = obtainStyledAttributes.getString(index2);
                            if (aVar.f1848c.f1888m.indexOf("/") > 0) {
                                aVar.f1848c.o = obtainStyledAttributes.getResourceId(index2, -1);
                                aVar.f1848c.f1889n = -2;
                                break;
                            } else {
                                aVar.f1848c.f1889n = -1;
                                break;
                            }
                        } else {
                            c cVar11 = aVar.f1848c;
                            cVar11.f1889n = obtainStyledAttributes.getInteger(index2, cVar11.o);
                            break;
                        }
                    case 87:
                        StringBuilder y3 = e.a.d.a.a.y("unused attribute 0x");
                        y3.append(Integer.toHexString(index2));
                        y3.append("   ");
                        y3.append(f1842b.get(index2));
                        Log.w("ConstraintSet", y3.toString());
                        break;
                    case SyslogConstants.LOG_FTP /* 88 */:
                    case 89:
                    case AdSize.LARGE_AD_HEIGHT /* 90 */:
                    default:
                        StringBuilder y4 = e.a.d.a.a.y("Unknown attribute 0x");
                        y4.append(Integer.toHexString(index2));
                        y4.append("   ");
                        y4.append(f1842b.get(index2));
                        Log.w("ConstraintSet", y4.toString());
                        break;
                    case 91:
                        b bVar54 = aVar.f1849d;
                        int resourceId20 = obtainStyledAttributes.getResourceId(index2, bVar54.s);
                        if (resourceId20 == -1) {
                            resourceId20 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar54.s = resourceId20;
                        break;
                    case 92:
                        b bVar55 = aVar.f1849d;
                        int resourceId21 = obtainStyledAttributes.getResourceId(index2, bVar55.t);
                        if (resourceId21 == -1) {
                            resourceId21 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar55.t = resourceId21;
                        break;
                    case 93:
                        b bVar56 = aVar.f1849d;
                        bVar56.N = obtainStyledAttributes.getDimensionPixelSize(index2, bVar56.N);
                        break;
                    case 94:
                        b bVar57 = aVar.f1849d;
                        bVar57.U = obtainStyledAttributes.getDimensionPixelSize(index2, bVar57.U);
                        break;
                    case 95:
                        g(aVar.f1849d, obtainStyledAttributes, index2, 0);
                        break;
                    case SyslogConstants.LOG_NTP /* 96 */:
                        g(aVar.f1849d, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        b bVar58 = aVar.f1849d;
                        bVar58.q0 = obtainStyledAttributes.getInt(index2, bVar58.q0);
                        break;
                }
            }
            b bVar59 = aVar.f1849d;
            if (bVar59.l0 != null) {
                bVar59.k0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public void f(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a e2 = e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        e2.f1849d.f1864b = true;
                    }
                    this.f1846f.put(Integer.valueOf(e2.a), e2);
                    continue;
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }
}
