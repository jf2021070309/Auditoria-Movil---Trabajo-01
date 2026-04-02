package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.Ru  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0900Ru extends AbstractC03344l {
    @Nullable
    @DoNotStrip
    public AbstractC0868Qo A00;
    public C0869Qp A01;
    @Nullable
    public C0869Qp A02;
    public final int A03;
    public final SparseBooleanArray A04;
    public final C1046Xo A05;
    public final A8 A06;

    public C0900Ru(A8 a8, SparseBooleanArray sparseBooleanArray, C0869Qp c0869Qp, int i2, C1046Xo c1046Xo) {
        super(a8);
        this.A05 = c1046Xo;
        this.A06 = a8;
        this.A04 = sparseBooleanArray;
        this.A01 = c0869Qp;
        this.A03 = i2;
    }

    private void A08(InterfaceC0684Jg interfaceC0684Jg, MD md, String str, PU pu) {
        if (this.A04.get(pu.A02())) {
            return;
        }
        C0869Qp c0869Qp = this.A02;
        if (c0869Qp != null) {
            c0869Qp.A0V();
            this.A02 = null;
        }
        this.A00 = new C0902Rw(this, str, pu, interfaceC0684Jg, pu.A04(), md);
        this.A02 = new C0869Qp(this.A06, 10, new WeakReference(this.A00), this.A05);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A06.setOnAssetsLoadedListener(new C0901Rv(this, pu));
    }

    public final void A0l(PU pu, InterfaceC0684Jg interfaceC0684Jg, C7U c7u, MD md, String str, int i2, int i3, int i4) {
        int A02 = pu.A02();
        this.A06.setTag(-1593835536, Integer.valueOf(A02));
        this.A06.setupNativeCtaExtension(pu);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i2, -2);
        int i5 = A02 == 0 ? i4 : i3;
        if (A02 < this.A03 - 1) {
            i4 = i3;
        }
        marginLayoutParams.setMargins(i5, 0, i4, 0);
        String A07 = pu.A03().A0D().A07();
        String A08 = pu.A03().A0D().A08();
        this.A06.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A06.A0i()) {
            this.A06.setVideoPlaceholderUrl(A07);
            this.A06.setVideoUrl(c7u.A0Q(A08));
        } else {
            this.A06.setImageUrl(A07);
        }
        this.A06.setLayoutParams(marginLayoutParams);
        this.A06.A0j(pu.A04());
        A08(interfaceC0684Jg, md, str, pu);
    }

    public final void A0m(C0869Qp c0869Qp) {
        this.A01 = c0869Qp;
    }
}
