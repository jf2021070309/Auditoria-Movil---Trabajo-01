package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
@TargetApi(16)
/* loaded from: assets/audience_network.dex */
public final class DN implements X7, InterfaceC0479Ao, InterfaceC0477Am {
    public static byte[] A0O;
    public static String[] A0P = {"p1p2g9mbI7jG28uS1AIjZaN2DuNLisT4", "5M6TC2sONh3rGys5YKd78dMRKX2wOUqH", "h92WNkWPJTM", "jYXxaa6xf7axcTjhEWPmUH7zZsfwsjgI", "vYDSW5DyAu5jQwnIRgw24Ezub5gSEfu7", "VyMVayVAQGyPc0QthTR0tkMwCD52dsyF", "LU4FXKZXpKPxotYf", "puFnwNxTYtdaaLd9gUGAlTVzIEShK4ZY"};
    public float A00;
    public int A01;
    public int A02;
    @Nullable
    public Surface A03;
    @Nullable
    public SurfaceHolder A04;
    @Nullable
    public TextureView A05;
    public Format A06;
    public Format A07;
    public BD A08;
    public C0512Bw A09;
    public C0512Bw A0A;
    public InterfaceC0576Fa A0B;
    public List<GX> A0C;
    public boolean A0D;
    public final Handler A0E;
    public final X7 A0F;
    public final X5 A0G;
    public final X3 A0H;
    public final CopyOnWriteArraySet<BT> A0I;
    public final CopyOnWriteArraySet<EJ> A0J;
    public final CopyOnWriteArraySet<InterfaceC0603Gb> A0K;
    public final CopyOnWriteArraySet<JM> A0L;
    public final CopyOnWriteArraySet<JD> A0M;
    public final X6[] A0N;

    public static String A07(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0O = new byte[]{45, 23, 19, 14, 18, 27, 59, 6, 17, 46, 18, 31, 7, 27, 12, 9, 47, 40, 60, 59, 57, 63, 14, 63, 34, 46, 47, 40, 63, 22, 51, 41, 46, 63, 52, 63, 40, 122, 59, 54, 40, 63, 59, 62, 35, 122, 47, 52, 41, 63, 46, 122, 53, 40, 122, 40, 63, 42, 54, 59, 57, 63, 62, 116};
    }

    static {
        A0F();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public DN(InterfaceC0487Aw interfaceC0487Aw, HT ht, InterfaceC0466Ab interfaceC0466Ab, @Nullable CM<C1018Wm> cm) {
        this(interfaceC0487Aw, ht, interfaceC0466Ab, cm, new B2());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public DN(InterfaceC0487Aw interfaceC0487Aw, HT ht, InterfaceC0466Ab interfaceC0466Ab, @Nullable CM<C1018Wm> cm, B2 b2) {
        this(interfaceC0487Aw, ht, interfaceC0466Ab, cm, b2, IM.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public DN(InterfaceC0487Aw interfaceC0487Aw, HT ht, InterfaceC0466Ab interfaceC0466Ab, @Nullable CM<C1018Wm> cm, B2 b2, IM im) {
        this.A0G = new X5(this);
        this.A0M = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0I = new CopyOnWriteArraySet<>();
        this.A0E = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        Handler handler = this.A0E;
        X5 x5 = this.A0G;
        this.A0N = interfaceC0487Aw.A4Q(handler, x5, x5, x5, x5, cm);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A08 = BD.A04;
        this.A02 = 1;
        this.A0C = Collections.emptyList();
        this.A0F = A02(this.A0N, ht, interfaceC0466Ab, im);
        this.A0H = b2.A00(this.A0F, im);
        A3D(this.A0H);
        this.A0L.add(this.A0H);
        this.A0I.add(this.A0H);
        A0I(this.A0H);
        if (cm instanceof C1020Wo) {
            ((C1020Wo) cm).A04(this.A0E, this.A0H);
        }
    }

    private final X7 A02(X6[] x6Arr, HT ht, InterfaceC0466Ab interfaceC0466Ab, IM im) {
        return new C0535Dh(x6Arr, ht, interfaceC0466Ab, im);
    }

    private void A0E() {
        TextureView textureView = this.A05;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A0G) {
                Log.w(A07(0, 15, 68), A07(15, 49, 96));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        SurfaceHolder surfaceHolder = this.A04;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.A0G);
            this.A04 = null;
        }
    }

    public void A0G(@Nullable Surface surface, boolean z) {
        X6[] x6Arr;
        ArrayList<C0483As> arrayList = new ArrayList();
        for (X6 x6 : this.A0N) {
            int A7h = x6.A7h();
            String[] strArr = A0P;
            if (strArr[5].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[6] = "VrJ3McZcw7cn2zeT";
            strArr2[0] = "MNepmlV8OvsHi61EfIBswCx5NcPOIPrl";
            if (A7h == 2) {
                arrayList.add(this.A0F.A4K(x6).A06(1).A07(surface).A05());
            }
        }
        Surface surface2 = this.A03;
        if (surface2 != null && surface2 != surface) {
            try {
                for (C0483As c0483As : arrayList) {
                    c0483As.A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0D) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        if (A0P[7].charAt(22) != 'V') {
            throw new RuntimeException();
        }
        String[] strArr3 = A0P;
        strArr3[5] = "BcNzrhvciYYCifYD3J0kGNpt4Q56t2ws";
        strArr3[4] = "LBzJc3KMaCoazXjGhEegCXyOf3paMmXp";
        this.A0D = z;
    }

    private final void A0I(EJ ej) {
        this.A0J.add(ej);
    }

    public final int A0J() {
        return this.A01;
    }

    public final Format A0K() {
        return this.A06;
    }

    @Nullable
    public final Format A0L() {
        return this.A07;
    }

    public final void A0M() {
        AF9(false);
    }

    public final void A0N(float f2) {
        X6[] x6Arr;
        this.A00 = f2;
        for (X6 x6 : this.A0N) {
            String[] strArr = A0P;
            if (strArr[5].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[6] = "TZ1OBcEbhXggSiRE";
            strArr2[0] = "o47SCfAcsD46THYYRPii4HELThPbmwG8";
            if (x6.A7h() == 1) {
                this.A0F.A4K(x6).A06(2).A07(Float.valueOf(f2)).A05();
            }
        }
    }

    public final void A0O(@Nullable Surface surface) {
        A0E();
        A0G(surface, false);
    }

    public final void A0P(InterfaceC0576Fa interfaceC0576Fa) {
        ADE(interfaceC0576Fa, true, true);
    }

    public final void A0Q(JD jd) {
        this.A0M.add(jd);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final void A3D(InterfaceC0475Ak interfaceC0475Ak) {
        this.A0F.A3D(interfaceC0475Ak);
    }

    @Override // com.facebook.ads.redexgen.X.X7
    public final C0483As A4K(InterfaceC0482Ar interfaceC0482Ar) {
        return this.A0F.A4K(interfaceC0482Ar);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final int A5q() {
        return this.A0F.A5q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final long A5r() {
        return this.A0F.A5r();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final long A69() {
        return this.A0F.A69();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final int A6B() {
        return this.A0F.A6B();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final int A6C() {
        return this.A0F.A6C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final long A6E() {
        return this.A0F.A6E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final B1 A6G() {
        return this.A0F.A6G();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final int A6H() {
        return this.A0F.A6H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final long A6Q() {
        return this.A0F.A6Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final boolean A7C() {
        return this.A0F.A7C();
    }

    @Override // com.facebook.ads.redexgen.X.X7
    public final void ADE(InterfaceC0576Fa interfaceC0576Fa, boolean z, boolean z2) {
        InterfaceC0576Fa interfaceC0576Fa2 = this.A0B;
        if (interfaceC0576Fa2 != interfaceC0576Fa) {
            if (interfaceC0576Fa2 != null) {
                interfaceC0576Fa2.ADs(this.A0H);
                this.A0H.A07();
            }
            interfaceC0576Fa.A3B(this.A0E, this.A0H);
            this.A0B = interfaceC0576Fa;
        }
        this.A0F.ADE(interfaceC0576Fa, z, z2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final void ADj() {
        this.A0F.ADj();
        A0E();
        Surface surface = this.A03;
        if (surface != null) {
            if (this.A0D) {
                surface.release();
            }
            this.A03 = null;
        }
        InterfaceC0576Fa interfaceC0576Fa = this.A0B;
        if (interfaceC0576Fa != null) {
            interfaceC0576Fa.ADs(this.A0H);
        }
        this.A0C = Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final void AES(long j2) {
        this.A0H.A06();
        this.A0F.AES(j2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final void AET() {
        this.A0H.A06();
        this.A0F.AET();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final void AEj(boolean z) {
        this.A0F.AEj(z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final void AF9(boolean z) {
        this.A0F.AF9(z);
        InterfaceC0576Fa interfaceC0576Fa = this.A0B;
        if (interfaceC0576Fa != null) {
            interfaceC0576Fa.ADs(this.A0H);
            this.A0B = null;
            this.A0H.A07();
        }
        this.A0C = Collections.emptyList();
        String[] strArr = A0P;
        if (strArr[6].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[5] = "8NqoZsSfBCZ1v43okD4Pix8d8oY1Moxp";
        strArr2[4] = "VfYOa1CKuZhM9jsFhHY6jw4UB0OoLmrV";
    }
}
