package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import c.g.a.i.c;
import c.g.a.i.d;
import c.g.a.i.e;
import c.g.a.i.f;
import c.g.a.i.h;
import c.g.a.i.k;
import c.g.a.i.l.b;
import c.g.c.c;
import c.g.c.d;
import c.g.c.g;
import c.g.c.i;
import c.g.c.j;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static j a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<View> f281b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<c.g.c.b> f282c;

    /* renamed from: d  reason: collision with root package name */
    public e f283d;

    /* renamed from: e  reason: collision with root package name */
    public int f284e;

    /* renamed from: f  reason: collision with root package name */
    public int f285f;

    /* renamed from: g  reason: collision with root package name */
    public int f286g;

    /* renamed from: h  reason: collision with root package name */
    public int f287h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f288i;

    /* renamed from: j  reason: collision with root package name */
    public int f289j;

    /* renamed from: k  reason: collision with root package name */
    public d f290k;

    /* renamed from: l  reason: collision with root package name */
    public c f291l;

    /* renamed from: m  reason: collision with root package name */
    public int f292m;

    /* renamed from: n  reason: collision with root package name */
    public HashMap<String, Integer> f293n;
    public int o;
    public int p;
    public SparseArray<c.g.a.i.d> q;
    public b r;
    public int s;
    public int t;

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;
        public int a;
        public boolean a0;

        /* renamed from: b  reason: collision with root package name */
        public int f294b;
        public boolean b0;

        /* renamed from: c  reason: collision with root package name */
        public float f295c;
        public boolean c0;

        /* renamed from: d  reason: collision with root package name */
        public boolean f296d;
        public boolean d0;

        /* renamed from: e  reason: collision with root package name */
        public int f297e;
        public boolean e0;

        /* renamed from: f  reason: collision with root package name */
        public int f298f;
        public boolean f0;

        /* renamed from: g  reason: collision with root package name */
        public int f299g;
        public int g0;

        /* renamed from: h  reason: collision with root package name */
        public int f300h;
        public int h0;

        /* renamed from: i  reason: collision with root package name */
        public int f301i;
        public int i0;

        /* renamed from: j  reason: collision with root package name */
        public int f302j;
        public int j0;

        /* renamed from: k  reason: collision with root package name */
        public int f303k;
        public int k0;

        /* renamed from: l  reason: collision with root package name */
        public int f304l;
        public int l0;

        /* renamed from: m  reason: collision with root package name */
        public int f305m;
        public float m0;

        /* renamed from: n  reason: collision with root package name */
        public int f306n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public c.g.a.i.d q0;
        public float r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public int z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0002a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 22);
                sparseIntArray.append(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(FacebookMediationAdapter.ERROR_NULL_CONTEXT, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(SyslogConstants.LOG_ALERT, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public a(int i2, int i3) {
            super(i2, i3);
            this.a = -1;
            this.f294b = -1;
            this.f295c = -1.0f;
            this.f296d = true;
            this.f297e = -1;
            this.f298f = -1;
            this.f299g = -1;
            this.f300h = -1;
            this.f301i = -1;
            this.f302j = -1;
            this.f303k = -1;
            this.f304l = -1;
            this.f305m = -1;
            this.f306n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Level.ALL_INT;
            this.x = Level.ALL_INT;
            this.y = Level.ALL_INT;
            this.z = Level.ALL_INT;
            this.A = Level.ALL_INT;
            this.B = Level.ALL_INT;
            this.C = Level.ALL_INT;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Level.ALL_INT;
            this.l0 = Level.ALL_INT;
            this.m0 = 0.5f;
            this.q0 = new c.g.a.i.d();
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.f294b = -1;
            this.f295c = -1.0f;
            this.f296d = true;
            this.f297e = -1;
            this.f298f = -1;
            this.f299g = -1;
            this.f300h = -1;
            this.f301i = -1;
            this.f302j = -1;
            this.f303k = -1;
            this.f304l = -1;
            this.f305m = -1;
            this.f306n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Level.ALL_INT;
            this.x = Level.ALL_INT;
            this.y = Level.ALL_INT;
            this.z = Level.ALL_INT;
            this.A = Level.ALL_INT;
            this.B = Level.ALL_INT;
            this.C = Level.ALL_INT;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Level.ALL_INT;
            this.l0 = Level.ALL_INT;
            this.m0 = 0.5f;
            this.q0 = new c.g.a.i.d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f1909b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0002a.a.get(index);
                switch (i3) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f2;
                        if (f2 < 0.0f) {
                            this.r = (360.0f - f2) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.f294b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f294b);
                        break;
                    case 7:
                        this.f295c = obtainStyledAttributes.getFloat(index, this.f295c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f297e);
                        this.f297e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f297e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f298f);
                        this.f298f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f298f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f299g);
                        this.f299g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f299g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f300h);
                        this.f300h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f300h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f301i);
                        this.f301i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f301i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f302j);
                        this.f302j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f302j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f303k);
                        this.f303k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f303k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f304l);
                        this.f304l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f304l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f305m);
                        this.f305m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f305m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i5;
                        if (i5 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                d.h(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                continue;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                continue;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case SyslogConstants.LOG_LPR /* 48 */:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                continue;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                continue;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f306n);
                                this.f306n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f306n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case ModuleDescriptor.MODULE_VERSION /* 55 */:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i3) {
                                    case 64:
                                        d.g(this, obtainStyledAttributes, index, 0);
                                        continue;
                                        continue;
                                    case 65:
                                        d.g(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 67:
                                        this.f296d = obtainStyledAttributes.getBoolean(index, this.f296d);
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.f294b = -1;
            this.f295c = -1.0f;
            this.f296d = true;
            this.f297e = -1;
            this.f298f = -1;
            this.f299g = -1;
            this.f300h = -1;
            this.f301i = -1;
            this.f302j = -1;
            this.f303k = -1;
            this.f304l = -1;
            this.f305m = -1;
            this.f306n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Level.ALL_INT;
            this.x = Level.ALL_INT;
            this.y = Level.ALL_INT;
            this.z = Level.ALL_INT;
            this.A = Level.ALL_INT;
            this.B = Level.ALL_INT;
            this.C = Level.ALL_INT;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.a0 = true;
            this.b0 = true;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = false;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = -1;
            this.k0 = Level.ALL_INT;
            this.l0 = Level.ALL_INT;
            this.m0 = 0.5f;
            this.q0 = new c.g.a.i.d();
        }

        public void a() {
            this.d0 = false;
            this.a0 = true;
            this.b0 = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.W) {
                this.a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.X) {
                this.b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.a0 = false;
                if (i2 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.b0 = false;
                if (i3 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.f295c == -1.0f && this.a == -1 && this.f294b == -1) {
                return;
            }
            this.d0 = true;
            this.a0 = true;
            this.b0 = true;
            if (!(this.q0 instanceof f)) {
                this.q0 = new f();
            }
            ((f) this.q0).X(this.V);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0029b {
        public ConstraintLayout a;

        /* renamed from: b  reason: collision with root package name */
        public int f307b;

        /* renamed from: c  reason: collision with root package name */
        public int f308c;

        /* renamed from: d  reason: collision with root package name */
        public int f309d;

        /* renamed from: e  reason: collision with root package name */
        public int f310e;

        /* renamed from: f  reason: collision with root package name */
        public int f311f;

        /* renamed from: g  reason: collision with root package name */
        public int f312g;

        public b(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        public final boolean a(int i2, int i3, int i4) {
            if (i2 == i3) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:124:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x01ef A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:159:0x01f0  */
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(c.g.a.i.d r18, c.g.a.i.l.b.a r19) {
            /*
                Method dump skipped, instructions count: 740
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.b(c.g.a.i.d, c.g.a.i.l.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f281b = new SparseArray<>();
        this.f282c = new ArrayList<>(4);
        this.f283d = new e();
        this.f284e = 0;
        this.f285f = 0;
        this.f286g = Integer.MAX_VALUE;
        this.f287h = Integer.MAX_VALUE;
        this.f288i = true;
        this.f289j = 257;
        this.f290k = null;
        this.f291l = null;
        this.f292m = -1;
        this.f293n = new HashMap<>();
        this.o = -1;
        this.p = -1;
        this.q = new SparseArray<>();
        this.r = new b(this);
        this.s = 0;
        this.t = 0;
        g(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f281b = new SparseArray<>();
        this.f282c = new ArrayList<>(4);
        this.f283d = new e();
        this.f284e = 0;
        this.f285f = 0;
        this.f286g = Integer.MAX_VALUE;
        this.f287h = Integer.MAX_VALUE;
        this.f288i = true;
        this.f289j = 257;
        this.f290k = null;
        this.f291l = null;
        this.f292m = -1;
        this.f293n = new HashMap<>();
        this.o = -1;
        this.p = -1;
        this.q = new SparseArray<>();
        this.r = new b(this);
        this.s = 0;
        this.t = 0;
        g(attributeSet, i2, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static j getSharedValues() {
        if (a == null) {
            a = new j();
        }
        return a;
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public Object c(int i2, Object obj) {
        if (i2 == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f293n;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.f293n.get(str);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public View d(int i2) {
        return this.f281b.get(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<c.g.c.b> arrayList = this.f282c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f282c.get(i2).m();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((parseInt / 1080.0f) * width);
                        int i5 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i4;
                        float f3 = i5;
                        float f4 = i4 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i5 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    public final c.g.a.i.d f(View view) {
        if (view == this) {
            return this.f283d;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof a) {
                return ((a) view.getLayoutParams()).q0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof a) {
                return ((a) view.getLayoutParams()).q0;
            }
            return null;
        }
        return null;
    }

    @Override // android.view.View
    public void forceLayout() {
        this.f288i = true;
        this.o = -1;
        this.p = -1;
        super.forceLayout();
    }

    public final void g(AttributeSet attributeSet, int i2, int i3) {
        e eVar = this.f283d;
        eVar.h0 = this;
        b bVar = this.r;
        eVar.v0 = bVar;
        eVar.t0.f1771f = bVar;
        this.f281b.put(getId(), this);
        this.f290k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f1909b, i2, i3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 16) {
                    this.f284e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f284e);
                } else if (index == 17) {
                    this.f285f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f285f);
                } else if (index == 14) {
                    this.f286g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f286g);
                } else if (index == 15) {
                    this.f287h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f287h);
                } else if (index == 113) {
                    this.f289j = obtainStyledAttributes.getInt(index, this.f289j);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            i(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f291l = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f290k = dVar;
                        dVar.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f290k = null;
                    }
                    this.f292m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f283d.h0(this.f289j);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f287h;
    }

    public int getMaxWidth() {
        return this.f286g;
    }

    public int getMinHeight() {
        return this.f285f;
    }

    public int getMinWidth() {
        return this.f284e;
    }

    public int getOptimizationLevel() {
        return this.f283d.E0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f283d.f1749j == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f283d.f1749j = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f283d.f1749j = "parent";
            }
        }
        e eVar = this.f283d;
        if (eVar.j0 == null) {
            eVar.j0 = eVar.f1749j;
        }
        Iterator<c.g.a.i.d> it = eVar.r0.iterator();
        while (it.hasNext()) {
            c.g.a.i.d next = it.next();
            View view = (View) next.h0;
            if (view != null) {
                if (next.f1749j == null && (id = view.getId()) != -1) {
                    next.f1749j = getContext().getResources().getResourceEntryName(id);
                }
                if (next.j0 == null) {
                    next.j0 = next.f1749j;
                }
            }
        }
        this.f283d.q(sb);
        return sb.toString();
    }

    public boolean h() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void i(int i2) {
        this.f291l = new c(getContext(), this, i2);
    }

    public void j(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        b bVar = this.r;
        int i6 = bVar.f310e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i4 + bVar.f309d, i2, 0);
        int min = Math.min(this.f286g, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f287h, ViewGroup.resolveSizeAndState(i5 + i6, i3, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.o = min;
        this.p = min2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) childAt.getLayoutParams();
            c.g.a.i.d dVar = aVar.q0;
            if ((childAt.getVisibility() != 8 || aVar.d0 || aVar.e0 || isInEditMode) && !aVar.f0) {
                int v = dVar.v();
                int w = dVar.w();
                int u = dVar.u() + v;
                int l2 = dVar.l() + w;
                childAt.layout(v, w, u, l2);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(v, w, u, l2);
                }
            }
        }
        int size = this.f282c.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f282c.get(i7).k();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:289:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0557 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        c.g.a.i.d f2 = f(view);
        if ((view instanceof Guideline) && !(f2 instanceof f)) {
            a aVar = (a) view.getLayoutParams();
            f fVar = new f();
            aVar.q0 = fVar;
            aVar.d0 = true;
            fVar.X(aVar.V);
        }
        if (view instanceof c.g.c.b) {
            c.g.c.b bVar = (c.g.c.b) view;
            bVar.n();
            ((a) view.getLayoutParams()).e0 = true;
            if (!this.f282c.contains(bVar)) {
                this.f282c.add(bVar);
            }
        }
        this.f281b.put(view.getId(), view);
        this.f288i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f281b.remove(view.getId());
        c.g.a.i.d f2 = f(view);
        this.f283d.r0.remove(f2);
        f2.G();
        this.f282c.remove(view);
        this.f288i = true;
    }

    public void p(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f293n == null) {
                this.f293n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f293n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public final void q(c.g.a.i.d dVar, a aVar, SparseArray<c.g.a.i.d> sparseArray, int i2, c.a aVar2) {
        View view = this.f281b.get(i2);
        c.g.a.i.d dVar2 = sparseArray.get(i2);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof a)) {
            return;
        }
        aVar.c0 = true;
        c.a aVar3 = c.a.BASELINE;
        if (aVar2 == aVar3) {
            a aVar4 = (a) view.getLayoutParams();
            aVar4.c0 = true;
            aVar4.q0.E = true;
        }
        dVar.i(aVar3).a(dVar2.i(aVar2), aVar.D, aVar.C, true);
        dVar.E = true;
        dVar.i(c.a.TOP).h();
        dVar.i(c.a.BOTTOM).h();
    }

    public final boolean r() {
        boolean z;
        boolean z2;
        int i2;
        c.g.a.i.d dVar;
        c.g.a.i.d dVar2;
        c.g.a.i.d dVar3;
        c.g.a.i.d dVar4;
        int i3;
        int i4;
        float parseFloat;
        int i5;
        String str;
        int h2;
        c.g.a.i.d dVar5;
        ConstraintLayout constraintLayout = this;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            z = true;
            if (i7 >= childCount) {
                z2 = false;
                break;
            } else if (constraintLayout.getChildAt(i7).isLayoutRequested()) {
                z2 = true;
                break;
            } else {
                i7++;
            }
        }
        if (z2) {
            boolean isInEditMode = isInEditMode();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                c.g.a.i.d f2 = constraintLayout.f(constraintLayout.getChildAt(i8));
                if (f2 != null) {
                    f2.G();
                }
            }
            Object obj = null;
            if (isInEditMode) {
                for (int i9 = 0; i9 < childCount2; i9++) {
                    View childAt = constraintLayout.getChildAt(i9);
                    try {
                        String resourceName = getResources().getResourceName(childAt.getId());
                        constraintLayout.p(0, resourceName, Integer.valueOf(childAt.getId()));
                        int indexOf = resourceName.indexOf(47);
                        if (indexOf != -1) {
                            resourceName = resourceName.substring(indexOf + 1);
                        }
                        int id = childAt.getId();
                        if (id == 0) {
                            dVar5 = constraintLayout.f283d;
                        } else {
                            View view = constraintLayout.f281b.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            dVar5 = view == constraintLayout ? constraintLayout.f283d : view == null ? null : ((a) view.getLayoutParams()).q0;
                        }
                        dVar5.j0 = resourceName;
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            }
            if (constraintLayout.f292m != -1) {
                for (int i10 = 0; i10 < childCount2; i10++) {
                    View childAt2 = constraintLayout.getChildAt(i10);
                    if (childAt2.getId() == constraintLayout.f292m && (childAt2 instanceof c.g.c.e)) {
                        constraintLayout.f290k = ((c.g.c.e) childAt2).getConstraintSet();
                    }
                }
            }
            d dVar6 = constraintLayout.f290k;
            if (dVar6 != null) {
                dVar6.b(constraintLayout, true);
            }
            constraintLayout.f283d.r0.clear();
            int size = constraintLayout.f282c.size();
            if (size > 0) {
                int i11 = 0;
                while (i11 < size) {
                    c.g.c.b bVar = constraintLayout.f282c.get(i11);
                    if (bVar.isInEditMode()) {
                        bVar.setIds(bVar.f1826e);
                    }
                    c.g.a.i.g gVar = bVar.f1825d;
                    if (gVar != null) {
                        h hVar = (h) gVar;
                        hVar.s0 = i6;
                        Arrays.fill(hVar.r0, obj);
                        for (int i12 = 0; i12 < bVar.f1823b; i12++) {
                            int i13 = bVar.a[i12];
                            View d2 = constraintLayout.d(i13);
                            if (d2 == null && (h2 = bVar.h(constraintLayout, (str = bVar.f1829h.get(Integer.valueOf(i13))))) != 0) {
                                bVar.a[i12] = h2;
                                bVar.f1829h.put(Integer.valueOf(h2), str);
                                d2 = constraintLayout.d(h2);
                            }
                            if (d2 != null) {
                                c.g.a.i.g gVar2 = bVar.f1825d;
                                c.g.a.i.d f3 = constraintLayout.f(d2);
                                h hVar2 = (h) gVar2;
                                Objects.requireNonNull(hVar2);
                                if (f3 != hVar2 && f3 != null) {
                                    int i14 = hVar2.s0 + 1;
                                    c.g.a.i.d[] dVarArr = hVar2.r0;
                                    if (i14 > dVarArr.length) {
                                        hVar2.r0 = (c.g.a.i.d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                    }
                                    c.g.a.i.d[] dVarArr2 = hVar2.r0;
                                    int i15 = hVar2.s0;
                                    dVarArr2[i15] = f3;
                                    hVar2.s0 = i15 + 1;
                                }
                            }
                        }
                        bVar.f1825d.a(constraintLayout.f283d);
                    }
                    i11++;
                    obj = null;
                    i6 = 0;
                }
            }
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt3 = constraintLayout.getChildAt(i16);
                if (childAt3 instanceof g) {
                    g gVar3 = (g) childAt3;
                    if (gVar3.a == -1 && !gVar3.isInEditMode()) {
                        gVar3.setVisibility(gVar3.f1908c);
                    }
                    View findViewById = constraintLayout.findViewById(gVar3.a);
                    gVar3.f1907b = findViewById;
                    if (findViewById != null) {
                        ((a) findViewById.getLayoutParams()).f0 = true;
                        gVar3.f1907b.setVisibility(0);
                        gVar3.setVisibility(0);
                    }
                }
            }
            constraintLayout.q.clear();
            constraintLayout.q.put(0, constraintLayout.f283d);
            constraintLayout.q.put(getId(), constraintLayout.f283d);
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt4 = constraintLayout.getChildAt(i17);
                constraintLayout.q.put(childAt4.getId(), constraintLayout.f(childAt4));
            }
            int i18 = 0;
            while (i18 < childCount2) {
                View childAt5 = constraintLayout.getChildAt(i18);
                c.g.a.i.d f4 = constraintLayout.f(childAt5);
                if (f4 != null) {
                    a aVar = (a) childAt5.getLayoutParams();
                    e eVar = constraintLayout.f283d;
                    eVar.r0.add(f4);
                    c.g.a.i.d dVar7 = f4.V;
                    if (dVar7 != null) {
                        ((k) dVar7).r0.remove(f4);
                        f4.G();
                    }
                    f4.V = eVar;
                    SparseArray<c.g.a.i.d> sparseArray = constraintLayout.q;
                    aVar.a();
                    f4.i0 = childAt5.getVisibility();
                    if (aVar.f0) {
                        f4.F = z;
                        f4.i0 = 8;
                    }
                    f4.h0 = childAt5;
                    if (childAt5 instanceof c.g.c.b) {
                        ((c.g.c.b) childAt5).j(f4, constraintLayout.f283d.w0);
                    }
                    if (aVar.d0) {
                        f fVar = (f) f4;
                        int i19 = aVar.n0;
                        int i20 = aVar.o0;
                        float f5 = aVar.p0;
                        if (f5 != -1.0f) {
                            if (f5 > -1.0f) {
                                fVar.r0 = f5;
                                fVar.s0 = -1;
                                fVar.t0 = -1;
                            }
                        } else if (i19 != -1) {
                            if (i19 > -1) {
                                fVar.r0 = -1.0f;
                                fVar.s0 = i19;
                                fVar.t0 = -1;
                            }
                        } else if (i20 != -1 && i20 > -1) {
                            fVar.r0 = -1.0f;
                            fVar.s0 = -1;
                            fVar.t0 = i20;
                        }
                    } else {
                        int i21 = aVar.g0;
                        int i22 = aVar.h0;
                        int i23 = aVar.i0;
                        int i24 = aVar.j0;
                        int i25 = aVar.k0;
                        int i26 = aVar.l0;
                        float f6 = aVar.m0;
                        int i27 = aVar.p;
                        i2 = childCount2;
                        if (i27 != -1) {
                            c.g.a.i.d dVar8 = sparseArray.get(i27);
                            if (dVar8 != null) {
                                float f7 = aVar.r;
                                int i28 = aVar.q;
                                c.a aVar2 = c.a.CENTER;
                                f4.z(aVar2, dVar8, aVar2, i28, 0);
                                f4.D = f7;
                            }
                        } else {
                            if (i21 != -1) {
                                c.g.a.i.d dVar9 = sparseArray.get(i21);
                                if (dVar9 != null) {
                                    c.a aVar3 = c.a.LEFT;
                                    f4.z(aVar3, dVar9, aVar3, ((ViewGroup.MarginLayoutParams) aVar).leftMargin, i25);
                                }
                            } else if (i22 != -1 && (dVar = sparseArray.get(i22)) != null) {
                                f4.z(c.a.LEFT, dVar, c.a.RIGHT, ((ViewGroup.MarginLayoutParams) aVar).leftMargin, i25);
                            }
                            if (i23 != -1) {
                                c.g.a.i.d dVar10 = sparseArray.get(i23);
                                if (dVar10 != null) {
                                    f4.z(c.a.RIGHT, dVar10, c.a.LEFT, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, i26);
                                }
                            } else if (i24 != -1 && (dVar2 = sparseArray.get(i24)) != null) {
                                c.a aVar4 = c.a.RIGHT;
                                f4.z(aVar4, dVar2, aVar4, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, i26);
                            }
                            int i29 = aVar.f301i;
                            if (i29 != -1) {
                                c.g.a.i.d dVar11 = sparseArray.get(i29);
                                if (dVar11 != null) {
                                    c.a aVar5 = c.a.TOP;
                                    f4.z(aVar5, dVar11, aVar5, ((ViewGroup.MarginLayoutParams) aVar).topMargin, aVar.x);
                                }
                            } else {
                                int i30 = aVar.f302j;
                                if (i30 != -1 && (dVar3 = sparseArray.get(i30)) != null) {
                                    f4.z(c.a.TOP, dVar3, c.a.BOTTOM, ((ViewGroup.MarginLayoutParams) aVar).topMargin, aVar.x);
                                }
                            }
                            int i31 = aVar.f303k;
                            if (i31 != -1) {
                                c.g.a.i.d dVar12 = sparseArray.get(i31);
                                if (dVar12 != null) {
                                    f4.z(c.a.BOTTOM, dVar12, c.a.TOP, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.z);
                                }
                            } else {
                                int i32 = aVar.f304l;
                                if (i32 != -1 && (dVar4 = sparseArray.get(i32)) != null) {
                                    c.a aVar6 = c.a.BOTTOM;
                                    f4.z(aVar6, dVar4, aVar6, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.z);
                                }
                            }
                            int i33 = aVar.f305m;
                            if (i33 != -1) {
                                q(f4, aVar, sparseArray, i33, c.a.BASELINE);
                            } else {
                                int i34 = aVar.f306n;
                                if (i34 != -1) {
                                    q(f4, aVar, sparseArray, i34, c.a.TOP);
                                } else {
                                    int i35 = aVar.o;
                                    if (i35 != -1) {
                                        q(f4, aVar, sparseArray, i35, c.a.BOTTOM);
                                    }
                                }
                            }
                            if (f6 >= 0.0f) {
                                f4.f0 = f6;
                            }
                            float f8 = aVar.F;
                            if (f8 >= 0.0f) {
                                f4.g0 = f8;
                            }
                        }
                        if (isInEditMode && ((i5 = aVar.T) != -1 || aVar.U != -1)) {
                            int i36 = aVar.U;
                            f4.a0 = i5;
                            f4.b0 = i36;
                        }
                        if (aVar.a0) {
                            f4.P(d.a.FIXED);
                            f4.T(((ViewGroup.MarginLayoutParams) aVar).width);
                            if (((ViewGroup.MarginLayoutParams) aVar).width == -2) {
                                f4.P(d.a.WRAP_CONTENT);
                            }
                        } else if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                            if (aVar.W) {
                                f4.P(d.a.MATCH_CONSTRAINT);
                            } else {
                                f4.P(d.a.MATCH_PARENT);
                            }
                            f4.i(c.a.LEFT).f1738g = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                            f4.i(c.a.RIGHT).f1738g = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        } else {
                            f4.P(d.a.MATCH_CONSTRAINT);
                            f4.T(0);
                        }
                        if (aVar.b0) {
                            f4.S(d.a.FIXED);
                            f4.O(((ViewGroup.MarginLayoutParams) aVar).height);
                            if (((ViewGroup.MarginLayoutParams) aVar).height == -2) {
                                f4.S(d.a.WRAP_CONTENT);
                            }
                        } else if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                            if (aVar.X) {
                                f4.S(d.a.MATCH_CONSTRAINT);
                            } else {
                                f4.S(d.a.MATCH_PARENT);
                            }
                            f4.i(c.a.TOP).f1738g = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                            f4.i(c.a.BOTTOM).f1738g = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        } else {
                            f4.S(d.a.MATCH_CONSTRAINT);
                            f4.O(0);
                        }
                        String str2 = aVar.G;
                        if (str2 == null || str2.length() == 0) {
                            f4.Y = 0.0f;
                        } else {
                            int length = str2.length();
                            int indexOf2 = str2.indexOf(44);
                            if (indexOf2 <= 0 || indexOf2 >= length - 1) {
                                i3 = -1;
                                i4 = 0;
                            } else {
                                String substring = str2.substring(0, indexOf2);
                                i4 = indexOf2 + 1;
                                i3 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                            }
                            int indexOf3 = str2.indexOf(58);
                            if (indexOf3 < 0 || indexOf3 >= length - 1) {
                                String substring2 = str2.substring(i4);
                                if (substring2.length() > 0) {
                                    parseFloat = Float.parseFloat(substring2);
                                }
                                parseFloat = 0.0f;
                            } else {
                                String substring3 = str2.substring(i4, indexOf3);
                                String substring4 = str2.substring(indexOf3 + 1);
                                if (substring3.length() > 0 && substring4.length() > 0) {
                                    try {
                                        float parseFloat2 = Float.parseFloat(substring3);
                                        float parseFloat3 = Float.parseFloat(substring4);
                                        if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                            parseFloat = i3 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                        }
                                    } catch (NumberFormatException unused2) {
                                    }
                                }
                                parseFloat = 0.0f;
                            }
                            if (parseFloat > 0.0f) {
                                f4.Y = parseFloat;
                                f4.Z = i3;
                            }
                        }
                        float f9 = aVar.H;
                        float[] fArr = f4.m0;
                        fArr[0] = f9;
                        fArr[1] = aVar.I;
                        f4.k0 = aVar.J;
                        f4.l0 = aVar.K;
                        int i37 = aVar.Z;
                        if (i37 >= 0 && i37 <= 3) {
                            f4.q = i37;
                        }
                        int i38 = aVar.L;
                        int i39 = aVar.N;
                        int i40 = aVar.P;
                        float f10 = aVar.R;
                        f4.r = i38;
                        f4.u = i39;
                        if (i40 == Integer.MAX_VALUE) {
                            i40 = 0;
                        }
                        f4.v = i40;
                        f4.w = f10;
                        if (f10 > 0.0f && f10 < 1.0f && i38 == 0) {
                            f4.r = 2;
                        }
                        int i41 = aVar.M;
                        int i42 = aVar.O;
                        int i43 = aVar.Q;
                        float f11 = aVar.S;
                        f4.s = i41;
                        f4.x = i42;
                        if (i43 == Integer.MAX_VALUE) {
                            i43 = 0;
                        }
                        f4.y = i43;
                        f4.z = f11;
                        if (f11 > 0.0f && f11 < 1.0f && i41 == 0) {
                            f4.s = 2;
                        }
                        i18++;
                        constraintLayout = this;
                        childCount2 = i2;
                        z = true;
                    }
                }
                i2 = childCount2;
                i18++;
                constraintLayout = this;
                childCount2 = i2;
                z = true;
            }
        }
        return z2;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f288i = true;
        this.o = -1;
        this.p = -1;
        super.requestLayout();
    }

    public void setConstraintSet(c.g.c.d dVar) {
        this.f290k = dVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.f281b.remove(getId());
        super.setId(i2);
        this.f281b.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f287h) {
            return;
        }
        this.f287h = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f286g) {
            return;
        }
        this.f286g = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f285f) {
            return;
        }
        this.f285f = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f284e) {
            return;
        }
        this.f284e = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(c.g.c.f fVar) {
        c.g.c.c cVar = this.f291l;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f289j = i2;
        e eVar = this.f283d;
        eVar.E0 = i2;
        c.g.a.d.a = eVar.g0(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
