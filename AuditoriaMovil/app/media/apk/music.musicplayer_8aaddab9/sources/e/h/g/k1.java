package e.h.g;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
/* loaded from: classes2.dex */
public class k1 {
    public ForegroundColorSpan a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8320b;

    public k1(int i2) {
        this.f8320b = i2;
    }

    public CharSequence a(CharSequence charSequence, char[] cArr) {
        int i2;
        if (!TextUtils.isEmpty(charSequence)) {
            int length = charSequence.length();
            int length2 = cArr.length;
            if (length2 != 0 && length >= length2) {
                i2 = 0;
                while (i2 < length && i2 + length2 <= length) {
                    int i3 = 0;
                    while (i3 < length2 && Character.toUpperCase(charSequence.charAt(i2 + i3)) == cArr[i3]) {
                        i3++;
                    }
                    if (i3 == length2) {
                        break;
                    }
                    i2++;
                }
            }
        }
        i2 = -1;
        if (i2 != -1) {
            if (this.a == null) {
                this.a = new ForegroundColorSpan(this.f8320b);
            }
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(this.a, i2, cArr.length + i2, 0);
            return spannableString;
        }
        return charSequence;
    }
}
