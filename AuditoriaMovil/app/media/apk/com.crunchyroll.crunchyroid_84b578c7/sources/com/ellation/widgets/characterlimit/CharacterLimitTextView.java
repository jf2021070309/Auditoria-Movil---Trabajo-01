package com.ellation.widgets.characterlimit;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.amazon.aps.iva.d70.a;
import com.amazon.aps.iva.d70.c;
import com.amazon.aps.iva.d70.d;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import kotlin.Metadata;
/* compiled from: CharacterLimitTextView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/widgets/characterlimit/CharacterLimitTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/amazon/aps/iva/d70/c;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CharacterLimitTextView extends AppCompatTextView implements c {
    public final a b;
    public final int c;
    public final int d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CharacterLimitTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.d70.c
    public final void I6() {
        setVisibility(4);
    }

    @Override // com.amazon.aps.iva.d70.c
    public final void Pf(int i) {
        setTextColor(this.d);
        setText(String.valueOf(i));
        setVisibility(0);
    }

    public final void U2(int i, boolean z) {
        a aVar = this.b;
        if (z) {
            aVar.getClass();
            aVar.q6(new d(0, i, null, null));
            return;
        }
        aVar.getView().I6();
    }

    @Override // com.amazon.aps.iva.d70.c
    public final void b5(int i) {
        setTextColor(this.c);
        setText(String.valueOf(i));
        setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharacterLimitTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        int[] iArr = R.styleable.CharacterLimit;
        j.e(iArr, "CharacterLimit");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        this.c = obtainStyledAttributes.getColor(R.styleable.CharacterLimit_android_textColor, 0);
        this.d = obtainStyledAttributes.getColor(R.styleable.CharacterLimit_overLimitColor, 0);
        int i2 = obtainStyledAttributes.getInt(R.styleable.CharacterLimit_counterOverLimit, 0);
        int i3 = obtainStyledAttributes.getInt(R.styleable.CharacterLimit_counterLowerLimit, 0);
        obtainStyledAttributes.recycle();
        this.b = new a(this, i2, i3);
    }
}
