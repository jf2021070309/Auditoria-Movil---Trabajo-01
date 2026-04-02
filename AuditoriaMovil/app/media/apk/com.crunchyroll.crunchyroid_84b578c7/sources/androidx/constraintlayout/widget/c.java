package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.amazon.aps.iva.x2.o;
import com.google.ads.AdSize;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.codec.binary.BaseNCodec;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public final class c {
    public static final int[] f = {0, 4, 8};
    public static final SparseIntArray g;
    public static final SparseIntArray h;
    public String a;
    public String b = "";
    public final HashMap<String, androidx.constraintlayout.widget.a> c = new HashMap<>();
    public boolean d = true;
    public final HashMap<Integer, a> e = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public String b;
        public final d c = new d();
        public final C0025c d = new C0025c();
        public final b e = new b();
        public final e f = new e();
        public HashMap<String, androidx.constraintlayout.widget.a> g = new HashMap<>();
        public C0024a h;

        /* compiled from: ConstraintSet.java */
        /* renamed from: androidx.constraintlayout.widget.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0024a {
            public int[] a = new int[10];
            public int[] b = new int[10];
            public int c = 0;
            public int[] d = new int[10];
            public float[] e = new float[10];
            public int f = 0;
            public int[] g = new int[5];
            public String[] h = new String[5];
            public int i = 0;
            public int[] j = new int[4];
            public boolean[] k = new boolean[4];
            public int l = 0;

            public final void a(float f, int i) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            public final void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            public final void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            public final void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }

            public final void e(a aVar) {
                for (int i = 0; i < this.c; i++) {
                    int i2 = this.a[i];
                    int i3 = this.b[i];
                    int[] iArr = c.f;
                    if (i2 != 6) {
                        if (i2 != 7) {
                            if (i2 != 8) {
                                if (i2 != 27) {
                                    if (i2 != 28) {
                                        if (i2 != 41) {
                                            if (i2 != 42) {
                                                if (i2 != 61) {
                                                    if (i2 != 62) {
                                                        if (i2 != 72) {
                                                            if (i2 != 73) {
                                                                if (i2 != 88) {
                                                                    if (i2 != 89) {
                                                                        if (i2 != 2) {
                                                                            if (i2 != 31) {
                                                                                if (i2 != 34) {
                                                                                    if (i2 != 38) {
                                                                                        if (i2 != 64) {
                                                                                            if (i2 != 66) {
                                                                                                if (i2 != 76) {
                                                                                                    if (i2 != 78) {
                                                                                                        if (i2 != 97) {
                                                                                                            if (i2 != 93) {
                                                                                                                if (i2 != 94) {
                                                                                                                    switch (i2) {
                                                                                                                        case 11:
                                                                                                                            aVar.e.Q = i3;
                                                                                                                            continue;
                                                                                                                        case 12:
                                                                                                                            aVar.e.R = i3;
                                                                                                                            continue;
                                                                                                                        case 13:
                                                                                                                            aVar.e.N = i3;
                                                                                                                            continue;
                                                                                                                        case 14:
                                                                                                                            aVar.e.P = i3;
                                                                                                                            continue;
                                                                                                                        case 15:
                                                                                                                            aVar.e.S = i3;
                                                                                                                            continue;
                                                                                                                        case 16:
                                                                                                                            aVar.e.O = i3;
                                                                                                                            continue;
                                                                                                                        case 17:
                                                                                                                            aVar.e.e = i3;
                                                                                                                            continue;
                                                                                                                        case 18:
                                                                                                                            aVar.e.f = i3;
                                                                                                                            continue;
                                                                                                                        default:
                                                                                                                            switch (i2) {
                                                                                                                                case 21:
                                                                                                                                    aVar.e.d = i3;
                                                                                                                                    continue;
                                                                                                                                case 22:
                                                                                                                                    aVar.c.b = i3;
                                                                                                                                    continue;
                                                                                                                                case ConnectionResult.API_DISABLED /* 23 */:
                                                                                                                                    aVar.e.c = i3;
                                                                                                                                    continue;
                                                                                                                                case 24:
                                                                                                                                    aVar.e.G = i3;
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                                default:
                                                                                                                                    switch (i2) {
                                                                                                                                        case 54:
                                                                                                                                            aVar.e.Y = i3;
                                                                                                                                            continue;
                                                                                                                                        case 55:
                                                                                                                                            aVar.e.Z = i3;
                                                                                                                                            continue;
                                                                                                                                        case 56:
                                                                                                                                            aVar.e.a0 = i3;
                                                                                                                                            continue;
                                                                                                                                        case 57:
                                                                                                                                            aVar.e.b0 = i3;
                                                                                                                                            continue;
                                                                                                                                        case 58:
                                                                                                                                            aVar.e.c0 = i3;
                                                                                                                                            continue;
                                                                                                                                        case 59:
                                                                                                                                            aVar.e.d0 = i3;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                        default:
                                                                                                                                            switch (i2) {
                                                                                                                                                case 82:
                                                                                                                                                    aVar.d.c = i3;
                                                                                                                                                    continue;
                                                                                                                                                case 83:
                                                                                                                                                    aVar.f.i = i3;
                                                                                                                                                    continue;
                                                                                                                                                case 84:
                                                                                                                                                    aVar.d.h = i3;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                            }
                                                                                                                                    }
                                                                                                                            }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    aVar.e.T = i3;
                                                                                                                }
                                                                                                            } else {
                                                                                                                aVar.e.M = i3;
                                                                                                            }
                                                                                                        } else {
                                                                                                            aVar.e.p0 = i3;
                                                                                                        }
                                                                                                    } else {
                                                                                                        aVar.c.c = i3;
                                                                                                    }
                                                                                                } else {
                                                                                                    aVar.d.d = i3;
                                                                                                }
                                                                                            } else {
                                                                                                aVar.d.getClass();
                                                                                            }
                                                                                        } else {
                                                                                            aVar.d.b = i3;
                                                                                        }
                                                                                    } else {
                                                                                        aVar.a = i3;
                                                                                    }
                                                                                } else {
                                                                                    aVar.e.I = i3;
                                                                                }
                                                                            } else {
                                                                                aVar.e.L = i3;
                                                                            }
                                                                        } else {
                                                                            aVar.e.J = i3;
                                                                        }
                                                                    } else {
                                                                        aVar.d.j = i3;
                                                                    }
                                                                } else {
                                                                    aVar.d.getClass();
                                                                }
                                                            } else {
                                                                aVar.e.h0 = i3;
                                                            }
                                                        } else {
                                                            aVar.e.g0 = i3;
                                                        }
                                                    } else {
                                                        aVar.e.B = i3;
                                                    }
                                                } else {
                                                    aVar.e.A = i3;
                                                }
                                            } else {
                                                aVar.e.X = i3;
                                            }
                                        } else {
                                            aVar.e.W = i3;
                                        }
                                    } else {
                                        aVar.e.H = i3;
                                    }
                                } else {
                                    aVar.e.F = i3;
                                }
                            } else {
                                aVar.e.K = i3;
                            }
                        } else {
                            aVar.e.E = i3;
                        }
                    } else {
                        aVar.e.D = i3;
                    }
                }
                for (int i4 = 0; i4 < this.f; i4++) {
                    int i5 = this.d[i4];
                    float f = this.e[i4];
                    int[] iArr2 = c.f;
                    if (i5 != 19) {
                        if (i5 != 20) {
                            if (i5 != 37) {
                                if (i5 != 60) {
                                    if (i5 != 63) {
                                        if (i5 != 79) {
                                            if (i5 != 85) {
                                                if (i5 != 39) {
                                                    if (i5 != 40) {
                                                        switch (i5) {
                                                            case 43:
                                                                aVar.c.d = f;
                                                                continue;
                                                            case 44:
                                                                e eVar = aVar.f;
                                                                eVar.n = f;
                                                                eVar.m = true;
                                                                continue;
                                                            case 45:
                                                                aVar.f.c = f;
                                                                continue;
                                                            case 46:
                                                                aVar.f.d = f;
                                                                continue;
                                                            case 47:
                                                                aVar.f.e = f;
                                                                continue;
                                                            case 48:
                                                                aVar.f.f = f;
                                                                continue;
                                                            case 49:
                                                                aVar.f.g = f;
                                                                continue;
                                                            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                                                                aVar.f.h = f;
                                                                continue;
                                                            case 51:
                                                                aVar.f.j = f;
                                                                continue;
                                                            case 52:
                                                                aVar.f.k = f;
                                                                continue;
                                                            case 53:
                                                                aVar.f.l = f;
                                                                continue;
                                                            default:
                                                                switch (i5) {
                                                                    case 67:
                                                                        aVar.d.f = f;
                                                                        continue;
                                                                    case 68:
                                                                        aVar.c.e = f;
                                                                        continue;
                                                                    case 69:
                                                                        aVar.e.e0 = f;
                                                                        continue;
                                                                    case 70:
                                                                        aVar.e.f0 = f;
                                                                        continue;
                                                                        continue;
                                                                }
                                                        }
                                                    } else {
                                                        aVar.e.U = f;
                                                    }
                                                } else {
                                                    aVar.e.V = f;
                                                }
                                            } else {
                                                aVar.d.g = f;
                                            }
                                        } else {
                                            aVar.d.e = f;
                                        }
                                    } else {
                                        aVar.e.C = f;
                                    }
                                } else {
                                    aVar.f.b = f;
                                }
                            } else {
                                aVar.e.y = f;
                            }
                        } else {
                            aVar.e.x = f;
                        }
                    } else {
                        aVar.e.g = f;
                    }
                }
                for (int i6 = 0; i6 < this.i; i6++) {
                    int i7 = this.g[i6];
                    String str = this.h[i6];
                    int[] iArr3 = c.f;
                    if (i7 != 5) {
                        if (i7 != 65) {
                            if (i7 != 74) {
                                if (i7 != 77) {
                                    if (i7 == 90) {
                                        aVar.d.i = str;
                                    }
                                } else {
                                    aVar.e.l0 = str;
                                }
                            } else {
                                b bVar = aVar.e;
                                bVar.k0 = str;
                                bVar.j0 = null;
                            }
                        } else {
                            aVar.d.getClass();
                        }
                    } else {
                        aVar.e.z = str;
                    }
                }
                for (int i8 = 0; i8 < this.l; i8++) {
                    int i9 = this.j[i8];
                    boolean z = this.k[i8];
                    int[] iArr4 = c.f;
                    if (i9 != 44) {
                        if (i9 != 75) {
                            if (i9 != 80) {
                                if (i9 == 81) {
                                    aVar.e.n0 = z;
                                }
                            } else {
                                aVar.e.m0 = z;
                            }
                        } else {
                            aVar.e.o0 = z;
                        }
                    } else {
                        aVar.f.m = z;
                    }
                }
            }
        }

        public final void a(ConstraintLayout.b bVar) {
            b bVar2 = this.e;
            bVar.e = bVar2.i;
            bVar.f = bVar2.j;
            bVar.g = bVar2.k;
            bVar.h = bVar2.l;
            bVar.i = bVar2.m;
            bVar.j = bVar2.n;
            bVar.k = bVar2.o;
            bVar.l = bVar2.p;
            bVar.m = bVar2.q;
            bVar.n = bVar2.r;
            bVar.o = bVar2.s;
            bVar.s = bVar2.t;
            bVar.t = bVar2.u;
            bVar.u = bVar2.v;
            bVar.v = bVar2.w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.J;
            bVar.A = bVar2.S;
            bVar.B = bVar2.R;
            bVar.x = bVar2.O;
            bVar.z = bVar2.Q;
            bVar.E = bVar2.x;
            bVar.F = bVar2.y;
            bVar.p = bVar2.A;
            bVar.q = bVar2.B;
            bVar.r = bVar2.C;
            bVar.G = bVar2.z;
            bVar.T = bVar2.D;
            bVar.U = bVar2.E;
            bVar.I = bVar2.U;
            bVar.H = bVar2.V;
            bVar.K = bVar2.X;
            bVar.J = bVar2.W;
            bVar.W = bVar2.m0;
            bVar.X = bVar2.n0;
            bVar.L = bVar2.Y;
            bVar.M = bVar2.Z;
            bVar.P = bVar2.a0;
            bVar.Q = bVar2.b0;
            bVar.N = bVar2.c0;
            bVar.O = bVar2.d0;
            bVar.R = bVar2.e0;
            bVar.S = bVar2.f0;
            bVar.V = bVar2.F;
            bVar.c = bVar2.g;
            bVar.a = bVar2.e;
            bVar.b = bVar2.f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.d;
            String str = bVar2.l0;
            if (str != null) {
                bVar.Y = str;
            }
            bVar.Z = bVar2.p0;
            bVar.setMarginStart(bVar2.L);
            bVar.setMarginEnd(bVar2.K);
            bVar.a();
        }

        /* renamed from: b */
        public final a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            d dVar = aVar.c;
            dVar.getClass();
            d dVar2 = this.c;
            dVar.a = dVar2.a;
            dVar.b = dVar2.b;
            dVar.d = dVar2.d;
            dVar.e = dVar2.e;
            dVar.c = dVar2.c;
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }

        public final void c(int i, ConstraintLayout.b bVar) {
            this.a = i;
            int i2 = bVar.e;
            b bVar2 = this.e;
            bVar2.i = i2;
            bVar2.j = bVar.f;
            bVar2.k = bVar.g;
            bVar2.l = bVar.h;
            bVar2.m = bVar.i;
            bVar2.n = bVar.j;
            bVar2.o = bVar.k;
            bVar2.p = bVar.l;
            bVar2.q = bVar.m;
            bVar2.r = bVar.n;
            bVar2.s = bVar.o;
            bVar2.t = bVar.s;
            bVar2.u = bVar.t;
            bVar2.v = bVar.u;
            bVar2.w = bVar.v;
            bVar2.x = bVar.E;
            bVar2.y = bVar.F;
            bVar2.z = bVar.G;
            bVar2.A = bVar.p;
            bVar2.B = bVar.q;
            bVar2.C = bVar.r;
            bVar2.D = bVar.T;
            bVar2.E = bVar.U;
            bVar2.F = bVar.V;
            bVar2.g = bVar.c;
            bVar2.e = bVar.a;
            bVar2.f = bVar.b;
            bVar2.c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.M = bVar.D;
            bVar2.U = bVar.I;
            bVar2.V = bVar.H;
            bVar2.X = bVar.K;
            bVar2.W = bVar.J;
            bVar2.m0 = bVar.W;
            bVar2.n0 = bVar.X;
            bVar2.Y = bVar.L;
            bVar2.Z = bVar.M;
            bVar2.a0 = bVar.P;
            bVar2.b0 = bVar.Q;
            bVar2.c0 = bVar.N;
            bVar2.d0 = bVar.O;
            bVar2.e0 = bVar.R;
            bVar2.f0 = bVar.S;
            bVar2.l0 = bVar.Y;
            bVar2.O = bVar.x;
            bVar2.Q = bVar.z;
            bVar2.N = bVar.w;
            bVar2.P = bVar.y;
            bVar2.S = bVar.A;
            bVar2.R = bVar.B;
            bVar2.T = bVar.C;
            bVar2.p0 = bVar.Z;
            bVar2.K = bVar.getMarginEnd();
            bVar2.L = bVar.getMarginStart();
        }

        public final void d(int i, d.a aVar) {
            c(i, aVar);
            this.c.d = aVar.r0;
            float f = aVar.u0;
            e eVar = this.f;
            eVar.b = f;
            eVar.c = aVar.v0;
            eVar.d = aVar.w0;
            eVar.e = aVar.x0;
            eVar.f = aVar.y0;
            eVar.g = aVar.z0;
            eVar.h = aVar.A0;
            eVar.j = aVar.B0;
            eVar.k = aVar.C0;
            eVar.l = aVar.D0;
            eVar.n = aVar.t0;
            eVar.m = aVar.s0;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class b {
        public static final SparseIntArray q0;
        public int c;
        public int d;
        public int[] j0;
        public String k0;
        public String l0;
        public boolean a = false;
        public boolean b = false;
        public int e = -1;
        public int f = -1;
        public float g = -1.0f;
        public boolean h = true;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public float x = 0.5f;
        public float y = 0.5f;
        public String z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public float e0 = 1.0f;
        public float f0 = 1.0f;
        public int g0 = -1;
        public int h0 = 0;
        public int i0 = -1;
        public boolean m0 = false;
        public boolean n0 = false;
        public boolean o0 = true;
        public int p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(b bVar) {
            this.a = bVar.a;
            this.c = bVar.c;
            this.b = bVar.b;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.l0 = bVar.l0;
            int[] iArr = bVar.j0;
            if (iArr != null && bVar.k0 == null) {
                this.j0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.j0 = null;
            }
            this.k0 = bVar.k0;
            this.m0 = bVar.m0;
            this.n0 = bVar.n0;
            this.o0 = bVar.o0;
            this.p0 = bVar.p0;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.k);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = q0;
                int i2 = sparseIntArray.get(index);
                switch (i2) {
                    case 1:
                        this.q = c.o(obtainStyledAttributes, index, this.q);
                        break;
                    case 2:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        this.p = c.o(obtainStyledAttributes, index, this.p);
                        break;
                    case 4:
                        this.o = c.o(obtainStyledAttributes, index, this.o);
                        break;
                    case 5:
                        this.z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        this.w = c.o(obtainStyledAttributes, index, this.w);
                        break;
                    case 10:
                        this.v = c.o(obtainStyledAttributes, index, this.v);
                        break;
                    case 11:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                        break;
                    case 18:
                        this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 19:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 20:
                        this.x = obtainStyledAttributes.getFloat(index, this.x);
                        break;
                    case 21:
                        this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 22:
                        this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        this.i = c.o(obtainStyledAttributes, index, this.i);
                        break;
                    case 25:
                        this.j = c.o(obtainStyledAttributes, index, this.j);
                        break;
                    case 26:
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        this.k = c.o(obtainStyledAttributes, index, this.k);
                        break;
                    case 29:
                        this.l = c.o(obtainStyledAttributes, index, this.l);
                        break;
                    case 30:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        this.t = c.o(obtainStyledAttributes, index, this.t);
                        break;
                    case 32:
                        this.u = c.o(obtainStyledAttributes, index, this.u);
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        this.n = c.o(obtainStyledAttributes, index, this.n);
                        break;
                    case 35:
                        this.m = c.o(obtainStyledAttributes, index, this.m);
                        break;
                    case 36:
                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 37:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        c.p(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        c.p(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.A = c.o(obtainStyledAttributes, index, this.A);
                                continue;
                            case 62:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                continue;
                            case 63:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                continue;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        continue;
                                    case 72:
                                        this.g0 = obtainStyledAttributes.getInt(index, this.g0);
                                        continue;
                                    case 73:
                                        this.h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                        continue;
                                    case 74:
                                        this.k0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                        continue;
                                    case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
                                        this.p0 = obtainStyledAttributes.getInt(index, this.p0);
                                        continue;
                                    case 77:
                                        this.r = c.o(obtainStyledAttributes, index, this.r);
                                        continue;
                                    case 78:
                                        this.s = c.o(obtainStyledAttributes, index, this.s);
                                        continue;
                                    case 79:
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        continue;
                                    case 80:
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        continue;
                                    case 81:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        continue;
                                    case 82:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 83:
                                        this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        continue;
                                    case 84:
                                        this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                        continue;
                                    case 85:
                                        this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        continue;
                                    case 86:
                                        this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        continue;
                                    case 87:
                                        this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                                        continue;
                                    case 88:
                                        this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                        continue;
                                    case 89:
                                        this.l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.h = obtainStyledAttributes.getBoolean(index, this.h);
                                        continue;
                                    case 91:
                                        Integer.toHexString(index);
                                        sparseIntArray.get(index);
                                        continue;
                                    default:
                                        Integer.toHexString(index);
                                        sparseIntArray.get(index);
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0025c {
        public static final SparseIntArray k;
        public boolean a = false;
        public int b = -1;
        public int c = 0;
        public int d = -1;
        public float e = Float.NaN;
        public float f = Float.NaN;
        public float g = Float.NaN;
        public int h = -1;
        public String i = null;
        public int j = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            k = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(C0025c c0025c) {
            this.a = c0025c.a;
            this.b = c0025c.b;
            this.d = c0025c.d;
            this.f = c0025c.f;
            this.e = c0025c.e;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.l);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (k.get(index)) {
                    case 1:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 2:
                        this.d = obtainStyledAttributes.getInt(index, this.d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            String str = com.amazon.aps.iva.t2.c.c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = c.o(obtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.c = obtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 8:
                        this.h = obtainStyledAttributes.getInteger(index, this.h);
                        break;
                    case 9:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            this.j = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.i = string;
                            if (string.indexOf("/") > 0) {
                                this.j = obtainStyledAttributes.getResourceId(index, -1);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index, this.j);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.q);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == 0) {
                    int i2 = obtainStyledAttributes.getInt(index, this.b);
                    this.b = i2;
                    this.b = c.f[i2];
                } else if (index == 4) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == 3) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class e {
        public static final SparseIntArray o;
        public boolean a = false;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public int i = -1;
        public float j = 0.0f;
        public float k = 0.0f;
        public float l = 0.0f;
        public boolean m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.n = eVar.n;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.y2.d.t);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.l = obtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = obtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        this.i = c.o(obtainStyledAttributes, index, this.i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        g = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        h = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(MediaError.DetailedErrorCode.MEDIA_DECODE, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED, 83);
        sparseIntArray2.append(MediaError.DetailedErrorCode.MEDIA_NETWORK, 84);
        sparseIntArray2.append(MediaError.DetailedErrorCode.MEDIA_DECODE, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static a d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, com.amazon.aps.iva.y2.d.c);
        r(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int[] i(Barrier barrier, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = com.amazon.aps.iva.y2.c.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    public static a j(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        a aVar = new a();
        if (z) {
            iArr = com.amazon.aps.iva.y2.d.c;
        } else {
            iArr = com.amazon.aps.iva.y2.d.a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (z) {
            r(aVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i = 0;
            while (true) {
                b bVar = aVar.e;
                if (i < indexCount) {
                    int index = obtainStyledAttributes.getIndex(i);
                    d dVar = aVar.c;
                    e eVar = aVar.f;
                    C0025c c0025c = aVar.d;
                    if (index != 1 && 23 != index && 24 != index) {
                        c0025c.a = true;
                        bVar.b = true;
                        dVar.a = true;
                        eVar.a = true;
                    }
                    SparseIntArray sparseIntArray = g;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            bVar.q = o(obtainStyledAttributes, index, bVar.q);
                            break;
                        case 2:
                            bVar.J = obtainStyledAttributes.getDimensionPixelSize(index, bVar.J);
                            break;
                        case 3:
                            bVar.p = o(obtainStyledAttributes, index, bVar.p);
                            break;
                        case 4:
                            bVar.o = o(obtainStyledAttributes, index, bVar.o);
                            break;
                        case 5:
                            bVar.z = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            bVar.D = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.D);
                            break;
                        case 7:
                            bVar.E = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.E);
                            break;
                        case 8:
                            bVar.K = obtainStyledAttributes.getDimensionPixelSize(index, bVar.K);
                            break;
                        case 9:
                            bVar.w = o(obtainStyledAttributes, index, bVar.w);
                            break;
                        case 10:
                            bVar.v = o(obtainStyledAttributes, index, bVar.v);
                            break;
                        case 11:
                            bVar.Q = obtainStyledAttributes.getDimensionPixelSize(index, bVar.Q);
                            break;
                        case 12:
                            bVar.R = obtainStyledAttributes.getDimensionPixelSize(index, bVar.R);
                            break;
                        case 13:
                            bVar.N = obtainStyledAttributes.getDimensionPixelSize(index, bVar.N);
                            break;
                        case 14:
                            bVar.P = obtainStyledAttributes.getDimensionPixelSize(index, bVar.P);
                            break;
                        case 15:
                            bVar.S = obtainStyledAttributes.getDimensionPixelSize(index, bVar.S);
                            break;
                        case 16:
                            bVar.O = obtainStyledAttributes.getDimensionPixelSize(index, bVar.O);
                            break;
                        case 17:
                            bVar.e = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.e);
                            break;
                        case 18:
                            bVar.f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f);
                            break;
                        case 19:
                            bVar.g = obtainStyledAttributes.getFloat(index, bVar.g);
                            break;
                        case 20:
                            bVar.x = obtainStyledAttributes.getFloat(index, bVar.x);
                            break;
                        case 21:
                            bVar.d = obtainStyledAttributes.getLayoutDimension(index, bVar.d);
                            break;
                        case 22:
                            dVar.b = f[obtainStyledAttributes.getInt(index, dVar.b)];
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            bVar.c = obtainStyledAttributes.getLayoutDimension(index, bVar.c);
                            break;
                        case 24:
                            bVar.G = obtainStyledAttributes.getDimensionPixelSize(index, bVar.G);
                            break;
                        case 25:
                            bVar.i = o(obtainStyledAttributes, index, bVar.i);
                            break;
                        case 26:
                            bVar.j = o(obtainStyledAttributes, index, bVar.j);
                            break;
                        case 27:
                            bVar.F = obtainStyledAttributes.getInt(index, bVar.F);
                            break;
                        case 28:
                            bVar.H = obtainStyledAttributes.getDimensionPixelSize(index, bVar.H);
                            break;
                        case 29:
                            bVar.k = o(obtainStyledAttributes, index, bVar.k);
                            break;
                        case 30:
                            bVar.l = o(obtainStyledAttributes, index, bVar.l);
                            break;
                        case 31:
                            bVar.L = obtainStyledAttributes.getDimensionPixelSize(index, bVar.L);
                            break;
                        case 32:
                            bVar.t = o(obtainStyledAttributes, index, bVar.t);
                            break;
                        case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                            bVar.u = o(obtainStyledAttributes, index, bVar.u);
                            break;
                        case 34:
                            bVar.I = obtainStyledAttributes.getDimensionPixelSize(index, bVar.I);
                            break;
                        case 35:
                            bVar.n = o(obtainStyledAttributes, index, bVar.n);
                            break;
                        case 36:
                            bVar.m = o(obtainStyledAttributes, index, bVar.m);
                            break;
                        case 37:
                            bVar.y = obtainStyledAttributes.getFloat(index, bVar.y);
                            break;
                        case 38:
                            aVar.a = obtainStyledAttributes.getResourceId(index, aVar.a);
                            break;
                        case 39:
                            bVar.V = obtainStyledAttributes.getFloat(index, bVar.V);
                            break;
                        case 40:
                            bVar.U = obtainStyledAttributes.getFloat(index, bVar.U);
                            break;
                        case 41:
                            bVar.W = obtainStyledAttributes.getInt(index, bVar.W);
                            break;
                        case 42:
                            bVar.X = obtainStyledAttributes.getInt(index, bVar.X);
                            break;
                        case 43:
                            dVar.d = obtainStyledAttributes.getFloat(index, dVar.d);
                            break;
                        case 44:
                            eVar.m = true;
                            eVar.n = obtainStyledAttributes.getDimension(index, eVar.n);
                            break;
                        case 45:
                            eVar.c = obtainStyledAttributes.getFloat(index, eVar.c);
                            break;
                        case 46:
                            eVar.d = obtainStyledAttributes.getFloat(index, eVar.d);
                            break;
                        case 47:
                            eVar.e = obtainStyledAttributes.getFloat(index, eVar.e);
                            break;
                        case 48:
                            eVar.f = obtainStyledAttributes.getFloat(index, eVar.f);
                            break;
                        case 49:
                            eVar.g = obtainStyledAttributes.getDimension(index, eVar.g);
                            break;
                        case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                            eVar.h = obtainStyledAttributes.getDimension(index, eVar.h);
                            break;
                        case 51:
                            eVar.j = obtainStyledAttributes.getDimension(index, eVar.j);
                            break;
                        case 52:
                            eVar.k = obtainStyledAttributes.getDimension(index, eVar.k);
                            break;
                        case 53:
                            eVar.l = obtainStyledAttributes.getDimension(index, eVar.l);
                            break;
                        case 54:
                            bVar.Y = obtainStyledAttributes.getInt(index, bVar.Y);
                            break;
                        case 55:
                            bVar.Z = obtainStyledAttributes.getInt(index, bVar.Z);
                            break;
                        case 56:
                            bVar.a0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.a0);
                            break;
                        case 57:
                            bVar.b0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.b0);
                            break;
                        case 58:
                            bVar.c0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.c0);
                            break;
                        case 59:
                            bVar.d0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.d0);
                            break;
                        case 60:
                            eVar.b = obtainStyledAttributes.getFloat(index, eVar.b);
                            break;
                        case 61:
                            bVar.A = o(obtainStyledAttributes, index, bVar.A);
                            break;
                        case 62:
                            bVar.B = obtainStyledAttributes.getDimensionPixelSize(index, bVar.B);
                            break;
                        case 63:
                            bVar.C = obtainStyledAttributes.getFloat(index, bVar.C);
                            break;
                        case 64:
                            c0025c.b = o(obtainStyledAttributes, index, c0025c.b);
                            break;
                        case 65:
                            if (obtainStyledAttributes.peekValue(index).type == 3) {
                                obtainStyledAttributes.getString(index);
                                c0025c.getClass();
                                break;
                            } else {
                                String str = com.amazon.aps.iva.t2.c.c[obtainStyledAttributes.getInteger(index, 0)];
                                c0025c.getClass();
                                break;
                            }
                        case 66:
                            obtainStyledAttributes.getInt(index, 0);
                            c0025c.getClass();
                            break;
                        case 67:
                            c0025c.f = obtainStyledAttributes.getFloat(index, c0025c.f);
                            break;
                        case 68:
                            dVar.e = obtainStyledAttributes.getFloat(index, dVar.e);
                            break;
                        case 69:
                            bVar.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            bVar.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            break;
                        case 72:
                            bVar.g0 = obtainStyledAttributes.getInt(index, bVar.g0);
                            break;
                        case 73:
                            bVar.h0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.h0);
                            break;
                        case 74:
                            bVar.k0 = obtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            bVar.o0 = obtainStyledAttributes.getBoolean(index, bVar.o0);
                            break;
                        case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
                            c0025c.d = obtainStyledAttributes.getInt(index, c0025c.d);
                            break;
                        case 77:
                            bVar.l0 = obtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            dVar.c = obtainStyledAttributes.getInt(index, dVar.c);
                            break;
                        case 79:
                            c0025c.e = obtainStyledAttributes.getFloat(index, c0025c.e);
                            break;
                        case 80:
                            bVar.m0 = obtainStyledAttributes.getBoolean(index, bVar.m0);
                            break;
                        case 81:
                            bVar.n0 = obtainStyledAttributes.getBoolean(index, bVar.n0);
                            break;
                        case 82:
                            c0025c.c = obtainStyledAttributes.getInteger(index, c0025c.c);
                            break;
                        case 83:
                            eVar.i = o(obtainStyledAttributes, index, eVar.i);
                            break;
                        case 84:
                            c0025c.h = obtainStyledAttributes.getInteger(index, c0025c.h);
                            break;
                        case 85:
                            c0025c.g = obtainStyledAttributes.getFloat(index, c0025c.g);
                            break;
                        case 86:
                            int i2 = obtainStyledAttributes.peekValue(index).type;
                            if (i2 == 1) {
                                int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                c0025c.j = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    c0025c.getClass();
                                    break;
                                }
                            } else if (i2 == 3) {
                                String string = obtainStyledAttributes.getString(index);
                                c0025c.i = string;
                                if (string.indexOf("/") > 0) {
                                    c0025c.j = obtainStyledAttributes.getResourceId(index, -1);
                                    c0025c.getClass();
                                    break;
                                } else {
                                    c0025c.getClass();
                                    break;
                                }
                            } else {
                                obtainStyledAttributes.getInteger(index, c0025c.j);
                                c0025c.getClass();
                                break;
                            }
                        case 87:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 91:
                            bVar.r = o(obtainStyledAttributes, index, bVar.r);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 92 */:
                            bVar.s = o(obtainStyledAttributes, index, bVar.s);
                            break;
                        case 93:
                            bVar.M = obtainStyledAttributes.getDimensionPixelSize(index, bVar.M);
                            break;
                        case 94:
                            bVar.T = obtainStyledAttributes.getDimensionPixelSize(index, bVar.T);
                            break;
                        case 95:
                            p(bVar, obtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            p(bVar, obtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            bVar.p0 = obtainStyledAttributes.getInt(index, bVar.p0);
                            break;
                    }
                    i++;
                } else if (bVar.k0 != null) {
                    bVar.j0 = null;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int o(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.p(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void q(ConstraintLayout.b bVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                }
                i2 = i;
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.G = str;
    }

    public static void r(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0024a c0024a = new a.C0024a();
        aVar.h = c0024a;
        C0025c c0025c = aVar.d;
        c0025c.a = false;
        b bVar = aVar.e;
        bVar.b = false;
        d dVar = aVar.c;
        dVar.a = false;
        e eVar = aVar.f;
        eVar.a = false;
        int i = 0;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int i3 = h.get(index);
            SparseIntArray sparseIntArray = g;
            switch (i3) {
                case 2:
                    c0024a.b(2, typedArray.getDimensionPixelSize(index, bVar.J));
                    continue;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case ModuleDescriptor.MODULE_VERSION /* 92 */:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    continue;
                case 5:
                    c0024a.c(5, typedArray.getString(index));
                    continue;
                case 6:
                    c0024a.b(6, typedArray.getDimensionPixelOffset(index, bVar.D));
                    continue;
                case 7:
                    c0024a.b(7, typedArray.getDimensionPixelOffset(index, bVar.E));
                    continue;
                case 8:
                    c0024a.b(8, typedArray.getDimensionPixelSize(index, bVar.K));
                    continue;
                case 11:
                    c0024a.b(11, typedArray.getDimensionPixelSize(index, bVar.Q));
                    continue;
                case 12:
                    c0024a.b(12, typedArray.getDimensionPixelSize(index, bVar.R));
                    continue;
                case 13:
                    c0024a.b(13, typedArray.getDimensionPixelSize(index, bVar.N));
                    continue;
                case 14:
                    c0024a.b(14, typedArray.getDimensionPixelSize(index, bVar.P));
                    continue;
                case 15:
                    c0024a.b(15, typedArray.getDimensionPixelSize(index, bVar.S));
                    continue;
                case 16:
                    c0024a.b(16, typedArray.getDimensionPixelSize(index, bVar.O));
                    continue;
                case 17:
                    c0024a.b(17, typedArray.getDimensionPixelOffset(index, bVar.e));
                    continue;
                case 18:
                    c0024a.b(18, typedArray.getDimensionPixelOffset(index, bVar.f));
                    continue;
                case 19:
                    c0024a.a(typedArray.getFloat(index, bVar.g), 19);
                    continue;
                case 20:
                    c0024a.a(typedArray.getFloat(index, bVar.x), 20);
                    continue;
                case 21:
                    c0024a.b(21, typedArray.getLayoutDimension(index, bVar.d));
                    continue;
                case 22:
                    c0024a.b(22, f[typedArray.getInt(index, dVar.b)]);
                    continue;
                case ConnectionResult.API_DISABLED /* 23 */:
                    c0024a.b(23, typedArray.getLayoutDimension(index, bVar.c));
                    continue;
                case 24:
                    c0024a.b(24, typedArray.getDimensionPixelSize(index, bVar.G));
                    continue;
                case 27:
                    c0024a.b(27, typedArray.getInt(index, bVar.F));
                    continue;
                case 28:
                    c0024a.b(28, typedArray.getDimensionPixelSize(index, bVar.H));
                    continue;
                case 31:
                    c0024a.b(31, typedArray.getDimensionPixelSize(index, bVar.L));
                    continue;
                case 34:
                    c0024a.b(34, typedArray.getDimensionPixelSize(index, bVar.I));
                    continue;
                case 37:
                    c0024a.a(typedArray.getFloat(index, bVar.y), 37);
                    continue;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.a);
                    aVar.a = resourceId;
                    c0024a.b(38, resourceId);
                    continue;
                case 39:
                    c0024a.a(typedArray.getFloat(index, bVar.V), 39);
                    continue;
                case 40:
                    c0024a.a(typedArray.getFloat(index, bVar.U), 40);
                    continue;
                case 41:
                    c0024a.b(41, typedArray.getInt(index, bVar.W));
                    continue;
                case 42:
                    c0024a.b(42, typedArray.getInt(index, bVar.X));
                    continue;
                case 43:
                    c0024a.a(typedArray.getFloat(index, dVar.d), 43);
                    continue;
                case 44:
                    c0024a.d(44, true);
                    c0024a.a(typedArray.getDimension(index, eVar.n), 44);
                    continue;
                case 45:
                    c0024a.a(typedArray.getFloat(index, eVar.c), 45);
                    continue;
                case 46:
                    c0024a.a(typedArray.getFloat(index, eVar.d), 46);
                    continue;
                case 47:
                    c0024a.a(typedArray.getFloat(index, eVar.e), 47);
                    continue;
                case 48:
                    c0024a.a(typedArray.getFloat(index, eVar.f), 48);
                    continue;
                case 49:
                    c0024a.a(typedArray.getDimension(index, eVar.g), 49);
                    continue;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    c0024a.a(typedArray.getDimension(index, eVar.h), 50);
                    continue;
                case 51:
                    c0024a.a(typedArray.getDimension(index, eVar.j), 51);
                    continue;
                case 52:
                    c0024a.a(typedArray.getDimension(index, eVar.k), 52);
                    continue;
                case 53:
                    c0024a.a(typedArray.getDimension(index, eVar.l), 53);
                    continue;
                case 54:
                    c0024a.b(54, typedArray.getInt(index, bVar.Y));
                    continue;
                case 55:
                    c0024a.b(55, typedArray.getInt(index, bVar.Z));
                    continue;
                case 56:
                    c0024a.b(56, typedArray.getDimensionPixelSize(index, bVar.a0));
                    continue;
                case 57:
                    c0024a.b(57, typedArray.getDimensionPixelSize(index, bVar.b0));
                    continue;
                case 58:
                    c0024a.b(58, typedArray.getDimensionPixelSize(index, bVar.c0));
                    continue;
                case 59:
                    c0024a.b(59, typedArray.getDimensionPixelSize(index, bVar.d0));
                    continue;
                case 60:
                    c0024a.a(typedArray.getFloat(index, eVar.b), 60);
                    continue;
                case 62:
                    c0024a.b(62, typedArray.getDimensionPixelSize(index, bVar.B));
                    continue;
                case 63:
                    c0024a.a(typedArray.getFloat(index, bVar.C), 63);
                    continue;
                case 64:
                    c0024a.b(64, o(typedArray, index, c0025c.b));
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0024a.c(65, typedArray.getString(index));
                        continue;
                    } else {
                        c0024a.c(65, com.amazon.aps.iva.t2.c.c[typedArray.getInteger(index, i)]);
                    }
                case 66:
                    c0024a.b(66, typedArray.getInt(index, 0));
                    i = 0;
                    continue;
                case 67:
                    c0024a.a(typedArray.getFloat(index, c0025c.f), 67);
                    break;
                case 68:
                    c0024a.a(typedArray.getFloat(index, dVar.e), 68);
                    break;
                case 69:
                    c0024a.a(typedArray.getFloat(index, 1.0f), 69);
                    break;
                case 70:
                    c0024a.a(typedArray.getFloat(index, 1.0f), 70);
                    break;
                case 71:
                    break;
                case 72:
                    c0024a.b(72, typedArray.getInt(index, bVar.g0));
                    break;
                case 73:
                    c0024a.b(73, typedArray.getDimensionPixelSize(index, bVar.h0));
                    break;
                case 74:
                    c0024a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0024a.d(75, typedArray.getBoolean(index, bVar.o0));
                    break;
                case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
                    c0024a.b(76, typedArray.getInt(index, c0025c.d));
                    break;
                case 77:
                    c0024a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0024a.b(78, typedArray.getInt(index, dVar.c));
                    break;
                case 79:
                    c0024a.a(typedArray.getFloat(index, c0025c.e), 79);
                    break;
                case 80:
                    c0024a.d(80, typedArray.getBoolean(index, bVar.m0));
                    break;
                case 81:
                    c0024a.d(81, typedArray.getBoolean(index, bVar.n0));
                    break;
                case 82:
                    c0024a.b(82, typedArray.getInteger(index, c0025c.c));
                    break;
                case 83:
                    c0024a.b(83, o(typedArray, index, eVar.i));
                    break;
                case 84:
                    c0024a.b(84, typedArray.getInteger(index, c0025c.h));
                    break;
                case 85:
                    c0024a.a(typedArray.getFloat(index, c0025c.g), 85);
                    break;
                case 86:
                    int i4 = typedArray.peekValue(index).type;
                    if (i4 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        c0025c.j = resourceId2;
                        c0024a.b(89, resourceId2);
                        if (c0025c.j != -1) {
                            c0025c.getClass();
                            c0024a.b(88, -2);
                            break;
                        }
                    } else if (i4 == 3) {
                        String string = typedArray.getString(index);
                        c0025c.i = string;
                        c0024a.c(90, string);
                        if (c0025c.i.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            c0025c.j = resourceId3;
                            c0024a.b(89, resourceId3);
                            c0025c.getClass();
                            c0024a.b(88, -2);
                            break;
                        } else {
                            c0025c.getClass();
                            c0024a.b(88, -1);
                            break;
                        }
                    } else {
                        int integer = typedArray.getInteger(index, c0025c.j);
                        c0025c.getClass();
                        c0024a.b(88, integer);
                        break;
                    }
                    break;
                case 87:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                case 93:
                    c0024a.b(93, typedArray.getDimensionPixelSize(index, bVar.M));
                    break;
                case 94:
                    c0024a.b(94, typedArray.getDimensionPixelSize(index, bVar.T));
                    break;
                case 95:
                    p(c0024a, typedArray, index, i);
                    break;
                case 96:
                    p(c0024a, typedArray, index, 1);
                    break;
                case 97:
                    c0024a.b(97, typedArray.getInt(index, bVar.p0));
                    break;
                case 98:
                    int i5 = o.R;
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.a = typedArray.getResourceId(index, aVar.a);
                        break;
                    }
                case 99:
                    c0024a.d(99, typedArray.getBoolean(index, bVar.h));
                    break;
            }
            i = 0;
        }
    }

    public static String s(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return AdError.UNDEFINED_DOMAIN;
        }
    }

    public final void a(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap<Integer, a> hashMap = this.e;
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                com.amazon.aps.iva.x2.a.c(childAt);
            } else if (this.d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (hashMap.containsKey(Integer.valueOf(id)) && (aVar = hashMap.get(Integer.valueOf(id))) != null) {
                    androidx.constraintlayout.widget.a.e(childAt, aVar.g);
                }
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = this.e;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                com.amazon.aps.iva.x2.a.c(childAt);
            } else if (this.d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1 && hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = hashMap.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            b bVar = aVar.e;
                            bVar.i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(bVar.g0);
                            barrier.setMargin(bVar.h0);
                            barrier.setAllowsGoneWidget(bVar.o0);
                            int[] iArr = bVar.j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.k0;
                                if (str != null) {
                                    int[] i2 = i(barrier, str);
                                    bVar.j0 = i2;
                                    barrier.setReferencedIds(i2);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.a(bVar2);
                        androidx.constraintlayout.widget.a.e(childAt, aVar.g);
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.c;
                        if (dVar.c == 0) {
                            childAt.setVisibility(dVar.b);
                        }
                        childAt.setAlpha(dVar.d);
                        e eVar = aVar.f;
                        childAt.setRotation(eVar.b);
                        childAt.setRotationX(eVar.c);
                        childAt.setRotationY(eVar.d);
                        childAt.setScaleX(eVar.e);
                        childAt.setScaleY(eVar.f);
                        if (eVar.i != -1) {
                            if (((View) childAt.getParent()).findViewById(eVar.i) != null) {
                                float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.g)) {
                                childAt.setPivotX(eVar.g);
                            }
                            if (!Float.isNaN(eVar.h)) {
                                childAt.setPivotY(eVar.h);
                            }
                        }
                        childAt.setTranslationX(eVar.j);
                        childAt.setTranslationY(eVar.k);
                        childAt.setTranslationZ(eVar.l);
                        if (eVar.m) {
                            childAt.setElevation(eVar.n);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = hashMap.get(num);
            if (aVar2 != null) {
                b bVar3 = aVar2.e;
                if (bVar3.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = bVar3.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.k0;
                        if (str2 != null) {
                            int[] i3 = i(barrier2, str2);
                            bVar3.j0 = i3;
                            barrier2.setReferencedIds(i3);
                        }
                    }
                    barrier2.setType(bVar3.g0);
                    barrier2.setMargin(bVar3.h0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.l();
                    aVar2.a(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (bVar3.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.a(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).h(constraintLayout);
            }
        }
    }

    public final void e(int i, int i2) {
        a aVar;
        HashMap<Integer, a> hashMap = this.e;
        if (!hashMap.containsKey(Integer.valueOf(i)) || (aVar = hashMap.get(Integer.valueOf(i))) == null) {
            return;
        }
        b bVar = aVar.e;
        switch (i2) {
            case 1:
                bVar.j = -1;
                bVar.i = -1;
                bVar.G = -1;
                bVar.N = Integer.MIN_VALUE;
                return;
            case 2:
                bVar.l = -1;
                bVar.k = -1;
                bVar.H = -1;
                bVar.P = Integer.MIN_VALUE;
                return;
            case 3:
                bVar.n = -1;
                bVar.m = -1;
                bVar.I = 0;
                bVar.O = Integer.MIN_VALUE;
                return;
            case 4:
                bVar.o = -1;
                bVar.p = -1;
                bVar.J = 0;
                bVar.Q = Integer.MIN_VALUE;
                return;
            case 5:
                bVar.q = -1;
                bVar.r = -1;
                bVar.s = -1;
                bVar.M = 0;
                bVar.T = Integer.MIN_VALUE;
                return;
            case 6:
                bVar.t = -1;
                bVar.u = -1;
                bVar.L = 0;
                bVar.S = Integer.MIN_VALUE;
                return;
            case 7:
                bVar.v = -1;
                bVar.w = -1;
                bVar.K = 0;
                bVar.R = Integer.MIN_VALUE;
                return;
            case 8:
                bVar.C = -1.0f;
                bVar.B = -1;
                bVar.A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int i;
        int i2;
        c cVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = cVar.e;
        hashMap.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (cVar.d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new a());
            }
            a aVar = hashMap.get(Integer.valueOf(id));
            if (aVar == null) {
                i = childCount;
            } else {
                HashMap<String, androidx.constraintlayout.widget.a> hashMap2 = cVar.c;
                HashMap<String, androidx.constraintlayout.widget.a> hashMap3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    androidx.constraintlayout.widget.a aVar2 = hashMap2.get(str);
                    try {
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        i2 = childCount;
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                        i2 = childCount;
                    } catch (InvocationTargetException e4) {
                        e = e4;
                        i2 = childCount;
                    }
                    if (str.equals("BackgroundColor")) {
                        hashMap3.put(str, new androidx.constraintlayout.widget.a(aVar2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        i2 = childCount;
                        try {
                            hashMap3.put(str, new androidx.constraintlayout.widget.a(aVar2, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e5) {
                            e = e5;
                            e.printStackTrace();
                            childCount = i2;
                        } catch (NoSuchMethodException e6) {
                            e = e6;
                            e.printStackTrace();
                            childCount = i2;
                        } catch (InvocationTargetException e7) {
                            e = e7;
                            e.printStackTrace();
                            childCount = i2;
                        }
                        childCount = i2;
                    }
                }
                i = childCount;
                aVar.g = hashMap3;
                aVar.c(id, bVar);
                int visibility = childAt.getVisibility();
                d dVar = aVar.c;
                dVar.b = visibility;
                dVar.d = childAt.getAlpha();
                float rotation = childAt.getRotation();
                e eVar = aVar.f;
                eVar.b = rotation;
                eVar.c = childAt.getRotationX();
                eVar.d = childAt.getRotationY();
                eVar.e = childAt.getScaleX();
                eVar.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.g = pivotX;
                    eVar.h = pivotY;
                }
                eVar.j = childAt.getTranslationX();
                eVar.k = childAt.getTranslationY();
                eVar.l = childAt.getTranslationZ();
                if (eVar.m) {
                    eVar.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    b bVar2 = aVar.e;
                    bVar2.o0 = allowsGoneWidget;
                    bVar2.j0 = barrier.getReferencedIds();
                    bVar2.g0 = barrier.getType();
                    bVar2.h0 = barrier.getMargin();
                }
            }
            i3++;
            cVar = this;
            childCount = i;
        }
    }

    public final void g(int i, int i2, int i3, int i4) {
        HashMap<Integer, a> hashMap = this.e;
        if (!hashMap.containsKey(Integer.valueOf(i))) {
            hashMap.put(Integer.valueOf(i), new a());
        }
        a aVar = hashMap.get(Integer.valueOf(i));
        if (aVar == null) {
            return;
        }
        b bVar = aVar.e;
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    bVar.i = i3;
                    bVar.j = -1;
                    return;
                } else if (i4 == 2) {
                    bVar.j = i3;
                    bVar.i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + s(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    bVar.k = i3;
                    bVar.l = -1;
                    return;
                } else if (i4 == 2) {
                    bVar.l = i3;
                    bVar.k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    bVar.m = i3;
                    bVar.n = -1;
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.s = -1;
                    return;
                } else if (i4 == 4) {
                    bVar.n = i3;
                    bVar.m = -1;
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.s = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i4) + " undefined");
                }
            case 4:
                if (i4 == 4) {
                    bVar.p = i3;
                    bVar.o = -1;
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.s = -1;
                    return;
                } else if (i4 == 3) {
                    bVar.o = i3;
                    bVar.p = -1;
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.s = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i4) + " undefined");
                }
            case 5:
                if (i4 == 5) {
                    bVar.q = i3;
                    bVar.p = -1;
                    bVar.o = -1;
                    bVar.m = -1;
                    bVar.n = -1;
                    return;
                } else if (i4 == 3) {
                    bVar.r = i3;
                    bVar.p = -1;
                    bVar.o = -1;
                    bVar.m = -1;
                    bVar.n = -1;
                    return;
                } else if (i4 == 4) {
                    bVar.s = i3;
                    bVar.p = -1;
                    bVar.o = -1;
                    bVar.m = -1;
                    bVar.n = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i4) + " undefined");
                }
            case 6:
                if (i4 == 6) {
                    bVar.u = i3;
                    bVar.t = -1;
                    return;
                } else if (i4 == 7) {
                    bVar.t = i3;
                    bVar.u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    bVar.w = i3;
                    bVar.v = -1;
                    return;
                } else if (i4 == 6) {
                    bVar.v = i3;
                    bVar.w = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(s(i2) + " to " + s(i4) + " unknown");
        }
    }

    public final void h(int i, int i2, int i3, int i4, int i5) {
        HashMap<Integer, a> hashMap = this.e;
        if (!hashMap.containsKey(Integer.valueOf(i))) {
            hashMap.put(Integer.valueOf(i), new a());
        }
        a aVar = hashMap.get(Integer.valueOf(i));
        if (aVar == null) {
            return;
        }
        b bVar = aVar.e;
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    bVar.i = i3;
                    bVar.j = -1;
                } else if (i4 == 2) {
                    bVar.j = i3;
                    bVar.i = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + s(i4) + " undefined");
                }
                bVar.G = i5;
                return;
            case 2:
                if (i4 == 1) {
                    bVar.k = i3;
                    bVar.l = -1;
                } else if (i4 == 2) {
                    bVar.l = i3;
                    bVar.k = -1;
                } else {
                    throw new IllegalArgumentException("right to " + s(i4) + " undefined");
                }
                bVar.H = i5;
                return;
            case 3:
                if (i4 == 3) {
                    bVar.m = i3;
                    bVar.n = -1;
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.s = -1;
                } else if (i4 == 4) {
                    bVar.n = i3;
                    bVar.m = -1;
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.s = -1;
                } else {
                    throw new IllegalArgumentException("right to " + s(i4) + " undefined");
                }
                bVar.I = i5;
                return;
            case 4:
                if (i4 == 4) {
                    bVar.p = i3;
                    bVar.o = -1;
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.s = -1;
                } else if (i4 == 3) {
                    bVar.o = i3;
                    bVar.p = -1;
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.s = -1;
                } else {
                    throw new IllegalArgumentException("right to " + s(i4) + " undefined");
                }
                bVar.J = i5;
                return;
            case 5:
                if (i4 == 5) {
                    bVar.q = i3;
                    bVar.p = -1;
                    bVar.o = -1;
                    bVar.m = -1;
                    bVar.n = -1;
                    return;
                } else if (i4 == 3) {
                    bVar.r = i3;
                    bVar.p = -1;
                    bVar.o = -1;
                    bVar.m = -1;
                    bVar.n = -1;
                    return;
                } else if (i4 == 4) {
                    bVar.s = i3;
                    bVar.p = -1;
                    bVar.o = -1;
                    bVar.m = -1;
                    bVar.n = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i4) + " undefined");
                }
            case 6:
                if (i4 == 6) {
                    bVar.u = i3;
                    bVar.t = -1;
                } else if (i4 == 7) {
                    bVar.t = i3;
                    bVar.u = -1;
                } else {
                    throw new IllegalArgumentException("right to " + s(i4) + " undefined");
                }
                bVar.L = i5;
                return;
            case 7:
                if (i4 == 7) {
                    bVar.w = i3;
                    bVar.v = -1;
                } else if (i4 == 6) {
                    bVar.v = i3;
                    bVar.w = -1;
                } else {
                    throw new IllegalArgumentException("right to " + s(i4) + " undefined");
                }
                bVar.K = i5;
                return;
            default:
                throw new IllegalArgumentException(s(i2) + " to " + s(i4) + " unknown");
        }
    }

    public final a k(int i) {
        HashMap<Integer, a> hashMap = this.e;
        if (!hashMap.containsKey(Integer.valueOf(i))) {
            hashMap.put(Integer.valueOf(i), new a());
        }
        return hashMap.get(Integer.valueOf(i));
    }

    public final a l(int i) {
        HashMap<Integer, a> hashMap = this.e;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            return hashMap.get(Integer.valueOf(i));
        }
        return null;
    }

    public final void m(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        a j = j(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            j.e.a = true;
                        }
                        this.e.put(Integer.valueOf(j.a), j);
                        continue;
                    }
                } else {
                    xml.getName();
                    continue;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.n(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
