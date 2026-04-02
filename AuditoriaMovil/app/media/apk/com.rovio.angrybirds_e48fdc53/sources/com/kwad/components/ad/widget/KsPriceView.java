package com.kwad.components.ad.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.kwad.components.core.widget.d;
import com.kwad.components.core.widget.e;
import com.kwad.sdk.R;
import com.kwad.sdk.core.e.c;
/* loaded from: classes.dex */
public class KsPriceView extends TextView implements d {
    private static String HE = "¥%s 到手约 ¥%s";
    private static String HF = "¥%s  ¥%s";
    private static String HG = "¥%s";
    private a HD;
    private String HH;
    private String HI;
    private boolean HJ;

    /* loaded from: classes.dex */
    public static class a {
        private int HK;
        private int HL;
        private int HM;
        private int HN;
        private int HO;
        private int HP;

        public final a ag(int i) {
            this.HL = i;
            return this;
        }

        public final a ah(int i) {
            this.HO = i;
            return this;
        }

        public final a ai(int i) {
            this.HP = i;
            return this;
        }

        public final int ma() {
            return this.HM;
        }

        public final int mb() {
            return this.HO;
        }

        public final int mc() {
            return this.HN;
        }

        public final int md() {
            return this.HP;
        }

        public final int me() {
            return this.HK;
        }

        public final int mf() {
            return this.HL;
        }
    }

    public KsPriceView(Context context) {
        super(context);
        this.HD = new a();
        R(context);
    }

    public KsPriceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.HD = new a();
        R(context);
    }

    public KsPriceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.HD = new a();
        R(context);
    }

    public KsPriceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.HD = new a();
        R(context);
    }

    private void R(Context context) {
        setMaxLines(1);
        this.HD.HM = context.getResources().getColor(R.color.ksad_reward_main_color);
        this.HD.HN = context.getResources().getDimensionPixelSize(R.dimen.ksad_reward_order_price_size);
        this.HD.HO = context.getResources().getColor(R.color.ksad_reward_original_price);
        this.HD.HP = context.getResources().getDimensionPixelSize(R.dimen.ksad_reward_order_original_price_size);
        this.HD.HK = context.getResources().getColor(R.color.ksad_reward_main_color);
        this.HD.HL = context.getResources().getDimensionPixelSize(R.dimen.ksad_reward_order_price_size);
    }

    private static SpannableString a(String str, String str2, boolean z, a aVar) {
        String format;
        if (str2 == null) {
            format = String.format(HG, str);
        } else {
            format = String.format(z ? HF : HE, str, str2);
        }
        SpannableString spannableString = new SpannableString(format);
        if (format.startsWith("¥")) {
            spannableString.setSpan(new ForegroundColorSpan(aVar.me()), 0, 1, 17);
            spannableString.setSpan(new AbsoluteSizeSpan(aVar.mf()), 0, 1, 17);
        }
        int indexOf = format.indexOf(str);
        if (indexOf < 0) {
            return null;
        }
        int length = str.length() + indexOf;
        spannableString.setSpan(new ForegroundColorSpan(aVar.ma()), indexOf, length, 18);
        spannableString.setSpan(new AbsoluteSizeSpan(aVar.mc()), indexOf, length, 18);
        if (str2 != null) {
            int lastIndexOf = format.lastIndexOf(str2) - 1;
            int length2 = str2.length() + 1 + lastIndexOf;
            spannableString.setSpan(new ForegroundColorSpan(aVar.mb()), lastIndexOf, length2, 18);
            spannableString.setSpan(new AbsoluteSizeSpan(aVar.md()), lastIndexOf, length2, 18);
            spannableString.setSpan(new StrikethroughSpan(), lastIndexOf, length2, 18);
        }
        return spannableString;
    }

    @Override // com.kwad.components.core.widget.d
    public final void a(e eVar) {
        this.HD.HM = eVar.sy();
        d(this.HH, this.HI, this.HJ);
    }

    public final void d(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return;
        }
        this.HH = str;
        this.HI = str2;
        this.HJ = z;
        SpannableString spannableString = null;
        if (TextUtils.isEmpty(str2)) {
            this.HI = null;
        }
        if (str != null && str.startsWith("¥")) {
            str = str.replaceFirst("¥", "");
        }
        setTextColor(this.HD.ma());
        try {
            spannableString = a(str, this.HI, z, this.HD);
        } catch (Exception e) {
            c.printStackTraceOnly(e);
        }
        if (spannableString != null) {
            setText(spannableString);
        }
    }

    public final void f(String str, String str2) {
        d(str, str2, false);
    }

    public a getConfig() {
        return this.HD;
    }
}
