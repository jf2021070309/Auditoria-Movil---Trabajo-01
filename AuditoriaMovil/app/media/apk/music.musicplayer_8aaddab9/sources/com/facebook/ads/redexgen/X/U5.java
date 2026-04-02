package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;
/* loaded from: assets/audience_network.dex */
public class U5 extends AbstractC0868Qo {
    public static String[] A04 = {"oIkrHn4xYgACG98mudVump3sfyxK5ddV", "YFjKaJHcUlqTZUCuvViCLkc0DiVUGWHa", "SJXa56PpW3wX5cacZdRzDwGkBBUKSz1I", "ckV9cVhgNLsBh0DLAq3Qoeikc521Bhs9", "5hqMSu4yQZZoRLncoc9FwnveLVEwrx", "CzQXOYkU59GlqnhcU7DFTywN9jdxtP", "Yo0Mb", "Nr5gBmQWcCkTfFNncD5Vfty4J6ngq0ol"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C1315dP A01;
    public final /* synthetic */ U1 A02;
    public final /* synthetic */ boolean A03;

    public U5(U1 u1, View view, boolean z, C1315dP c1315dP) {
        this.A02 = u1;
        this.A00 = view;
        this.A03 = z;
        this.A01 = c1315dP;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0868Qo
    public final void A00() {
        KE ke;
        ke = this.A02.A0e;
        ke.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0868Qo
    public final void A01() {
        KE ke;
        ke = this.A02.A0e;
        ke.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0868Qo
    public final void A02() {
        KE ke;
        KE ke2;
        C1046Xo c1046Xo;
        C0869Qp c0869Qp;
        WeakReference weakReference;
        MD md;
        KE ke3;
        C1306dG c1306dG;
        View view;
        View view2;
        C1306dG c1306dG2;
        View view3;
        C1306dG c1306dG3;
        View view4;
        C1306dG c1306dG4;
        K7 k7;
        C1306dG c1306dG5;
        boolean z;
        C1306dG c1306dG6;
        boolean z2;
        C1306dG c1306dG7;
        boolean z3;
        C1306dG c1306dG8;
        boolean A0r;
        C1306dG c1306dG9;
        EnumC02470z enumC02470z;
        C1306dG c1306dG10;
        boolean z4;
        C1306dG c1306dG11;
        NativeAdLayout nativeAdLayout;
        C1306dG c1306dG12;
        String str;
        C1306dG c1306dG13;
        C1306dG c1306dG14;
        WeakReference weakReference2;
        WeakReference weakReference3;
        C0869Qp c0869Qp2;
        Drawable loadedNativeBannerIconDrawable;
        C0869Qp c0869Qp3;
        KE ke4;
        C0869Qp c0869Qp4;
        KE ke5;
        ke = this.A02.A0e;
        ke.A0B();
        if (JQ.A1Q(this.A02.A13())) {
            View view5 = this.A00;
            if (view5 instanceof AdNativeComponentView) {
                View adContentsView = ((AdNativeComponentView) view5).getAdContentsView();
                if ((adContentsView instanceof C0850Pw) && !((C0850Pw) adContentsView).A02()) {
                    c0869Qp4 = this.A02.A0R;
                    c0869Qp4.A0T();
                    ke5 = this.A02.A0e;
                    if (A04[3].length() == 15) {
                        throw new RuntimeException();
                    }
                    A04[6] = "bPUaT";
                    ke5.A08();
                    return;
                }
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            loadedNativeBannerIconDrawable = this.A02.A01;
            if (loadedNativeBannerIconDrawable == null) {
                c0869Qp3 = this.A02.A0R;
                c0869Qp3.A0T();
                ke4 = this.A02.A0e;
                ke4.A07();
                return;
            }
            U1.A0e(loadedNativeBannerIconDrawable, imageView);
        }
        ke2 = this.A02.A0e;
        c1046Xo = this.A02.A0c;
        ke2.A0C(c1046Xo, this.A01.A0G());
        c0869Qp = this.A02.A0R;
        if (c0869Qp != null) {
            c0869Qp2 = this.A02.A0R;
            c0869Qp2.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference2 = this.A02.A0V;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0V;
                Object obj = weakReference3.get();
                if (A04[3].length() == 15) {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[1] = "dyFUEwQM9ShUYKkvN3qEb2SbXKXS00dK";
                strArr[7] = "y0DTmfKl0x4QH3u36UxcPvWnIaHTJFbo";
                ((AbstractC0868Qo) obj).A02();
            }
        }
        md = this.A02.A0f;
        if (md.A07()) {
            ke3 = this.A02.A0e;
            ke3.A04();
            return;
        }
        this.A02.A0b();
        c1306dG = this.A02.A09;
        if (c1306dG != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (view2 != null) {
                    c1306dG2 = this.A02.A09;
                    view3 = this.A02.A04;
                    c1306dG2.A08(view3);
                    c1306dG3 = this.A02.A09;
                    view4 = this.A02.A06;
                    c1306dG3.A07(view4);
                    c1306dG4 = this.A02.A09;
                    k7 = this.A02.A0I;
                    c1306dG4.A0B(k7);
                    c1306dG5 = this.A02.A09;
                    z = this.A02.A0W;
                    c1306dG5.A0E(z);
                    c1306dG6 = this.A02.A09;
                    z2 = this.A02.A0Z;
                    c1306dG6.A0I(z2);
                    c1306dG7 = this.A02.A09;
                    z3 = this.A02.A0Y;
                    c1306dG7.A0H(z3);
                    c1306dG8 = this.A02.A09;
                    A0r = this.A02.A0r();
                    c1306dG8.A0F(A0r);
                    c1306dG9 = this.A02.A09;
                    enumC02470z = this.A02.A08;
                    c1306dG9.A09(enumC02470z);
                    c1306dG10 = this.A02.A09;
                    z4 = this.A02.A0X;
                    c1306dG10.A0G(z4);
                    c1306dG11 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    c1306dG11.A0A(NI.A00(nativeAdLayout));
                    c1306dG12 = this.A02.A09;
                    str = this.A02.A0S;
                    c1306dG12.A0C(str);
                    c1306dG13 = this.A02.A09;
                    c1306dG13.A0J(this.A03);
                    c1306dG14 = this.A02.A09;
                    c1306dG14.A02();
                }
            }
        }
    }
}
