package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.Rn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0893Rn extends AbstractC03344l {
    public static String[] A0A = {"av2tITPhYKbVn20ukUfJR25ELbcgjHbj", "MLeLe181lhP7dC21QqjxU1VDKV9lNkzJ", "XUmY4VBJ2tlJWKlPJ7YkBdCsKtcC", "bK6oHsXedskfaWsjnVeS6YyvP0sRA20b", "BhCeFQN4dHt9z3MLE3p7bnIzhrf86Cw8", "mLW9T0fP2Q5Hob07hRXsv0QUH1fN4", "pNzPXZ5fcby2PvmlRsfUzns43oHDF5Mi", "3YktW7BrcDIc4Xw2f2zdWv5xFETbHIAE"};
    @DoNotStrip
    public AbstractC0868Qo A00;
    public C0869Qp A01;
    @Nullable
    public C0869Qp A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final SparseBooleanArray A07;
    public final C1046Xo A08;
    public final AbstractC04649z A09;

    public C0893Rn(AbstractC04649z abstractC04649z, SparseBooleanArray sparseBooleanArray, C0869Qp c0869Qp, int i2, int i3, int i4, int i5, C1046Xo c1046Xo) {
        super(abstractC04649z);
        this.A08 = c1046Xo;
        this.A09 = abstractC04649z;
        this.A07 = sparseBooleanArray;
        this.A01 = c0869Qp;
        this.A03 = i2;
        this.A04 = i3;
        this.A05 = i4;
        this.A06 = i5;
    }

    private void A08(InterfaceC0684Jg interfaceC0684Jg, MD md, String str, PU pu) {
        if (this.A07.get(pu.A02())) {
            return;
        }
        C0869Qp c0869Qp = this.A02;
        if (c0869Qp != null) {
            c0869Qp.A0V();
            if (A0A[4].charAt(16) != 'E') {
                throw new RuntimeException();
            }
            A0A[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            this.A02 = null;
        }
        this.A00 = new C0895Rp(this, str, pu, interfaceC0684Jg, pu.A04(), md);
        this.A02 = new C0869Qp(this.A09, 10, new WeakReference(this.A00), this.A08);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A09.setOnAssetsLoadedListener(new C0894Ro(this, pu));
    }

    public final void A0l(PU pu, InterfaceC0684Jg interfaceC0684Jg, C7U c7u, MD md, String videoUrl) {
        int A02 = pu.A02();
        this.A09.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A03, -2);
        marginLayoutParams.setMargins(A02 == 0 ? this.A04 : this.A05, 0, A02 >= this.A06 + (-1) ? this.A04 : this.A05, 0);
        String A07 = pu.A03().A0D().A07();
        String A08 = pu.A03().A0D().A08();
        this.A09.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A09.A0i()) {
            this.A09.setVideoPlaceholderUrl(A07);
            this.A09.setVideoUrl(c7u.A0Q(A08));
        } else {
            this.A09.setImageUrl(A07);
        }
        this.A09.setLayoutParams(marginLayoutParams);
        this.A09.setAdTitleAndDescription(pu.A03().A0E().A06(), pu.A03().A0E().A01());
        this.A09.setCTAInfo(pu.A03().A0F(), pu.A04());
        this.A09.A0k(pu.A04());
        A08(interfaceC0684Jg, md, videoUrl, pu);
    }
}
