package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.amazon.aps.iva.c8.w;
import com.amazon.aps.iva.s5.a;
import com.amazon.aps.iva.t5.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public List<com.amazon.aps.iva.s5.a> b;
    public com.amazon.aps.iva.c8.a c;
    public int d;
    public float e;
    public float f;
    public boolean g;
    public boolean h;
    public int i;
    public a j;
    public View k;

    /* loaded from: classes.dex */
    public interface a {
        void a(List<com.amazon.aps.iva.s5.a> list, com.amazon.aps.iva.c8.a aVar, float f, int i, float f2);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = Collections.emptyList();
        this.c = com.amazon.aps.iva.c8.a.g;
        this.d = 0;
        this.e = 0.0533f;
        this.f = 0.08f;
        this.g = true;
        this.h = true;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context);
        this.j = aVar;
        this.k = aVar;
        addView(aVar);
        this.i = 1;
    }

    private List<com.amazon.aps.iva.s5.a> getCuesWithStylingPreferencesApplied() {
        Object[] spans;
        if (this.g && this.h) {
            return this.b;
        }
        ArrayList arrayList = new ArrayList(this.b.size());
        for (int i = 0; i < this.b.size(); i++) {
            com.amazon.aps.iva.s5.a aVar = this.b.get(i);
            aVar.getClass();
            a.C0695a c0695a = new a.C0695a(aVar);
            if (!this.g) {
                c0695a.n = false;
                CharSequence charSequence = c0695a.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c0695a.a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c0695a.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof com.amazon.aps.iva.s5.d)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                w.a(c0695a);
            } else if (!this.h) {
                w.a(c0695a);
            }
            arrayList.add(c0695a.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (g0.a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private com.amazon.aps.iva.c8.a getUserCaptionStyle() {
        CaptioningManager captioningManager;
        com.amazon.aps.iva.c8.a aVar;
        int i;
        int i2;
        int i3;
        int i4 = g0.a;
        com.amazon.aps.iva.c8.a aVar2 = com.amazon.aps.iva.c8.a.g;
        if (i4 >= 19 && !isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            if (i4 >= 21) {
                int i5 = -1;
                if (userStyle.hasForegroundColor()) {
                    i = userStyle.foregroundColor;
                } else {
                    i = -1;
                }
                if (userStyle.hasBackgroundColor()) {
                    i2 = userStyle.backgroundColor;
                } else {
                    i2 = -16777216;
                }
                int i6 = i2;
                int i7 = 0;
                if (userStyle.hasWindowColor()) {
                    i3 = userStyle.windowColor;
                } else {
                    i3 = 0;
                }
                if (userStyle.hasEdgeType()) {
                    i7 = userStyle.edgeType;
                }
                int i8 = i7;
                if (userStyle.hasEdgeColor()) {
                    i5 = userStyle.edgeColor;
                }
                aVar = new com.amazon.aps.iva.c8.a(i, i6, i3, i8, i5, userStyle.getTypeface());
            } else {
                aVar = new com.amazon.aps.iva.c8.a(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
            }
            return aVar;
        }
        return aVar2;
    }

    private <T extends View & a> void setView(T t) {
        removeView(this.k);
        View view = this.k;
        if (view instanceof g) {
            ((g) view).c.destroy();
        }
        this.k = t;
        this.j = t;
        addView(t);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.j.a(getCuesWithStylingPreferencesApplied(), this.c, this.e, this.d, this.f);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.h = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.g = z;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.f = f;
        c();
    }

    public void setCues(List<com.amazon.aps.iva.s5.a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.b = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.d = 0;
        this.e = f;
        c();
    }

    public void setStyle(com.amazon.aps.iva.c8.a aVar) {
        this.c = aVar;
        c();
    }

    public void setViewType(int i) {
        if (this.i == i) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                setView(new g(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new androidx.media3.ui.a(getContext()));
        }
        this.i = i;
    }
}
