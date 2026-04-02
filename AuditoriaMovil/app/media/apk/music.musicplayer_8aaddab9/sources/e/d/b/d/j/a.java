package e.d.b.d.j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c.b.i.g;
import e.d.b.d.b;
import e.d.b.d.r.k;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class a extends g {

    /* renamed from: d  reason: collision with root package name */
    public static final int[][] f6397d = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f6398e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6399f;

    public a(Context context, AttributeSet attributeSet) {
        super(e.d.b.d.z.a.a.a(context, attributeSet, R.attr.checkboxStyle, 2131887101), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray d2 = k.d(context2, attributeSet, b.p, R.attr.checkboxStyle, 2131887101, new int[0]);
        if (d2.hasValue(0)) {
            c.i.a.W(this, e.d.b.d.a.C(context2, d2, 0));
        }
        this.f6399f = d2.getBoolean(1, false);
        d2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f6398e == null) {
            int[][] iArr = f6397d;
            int[] iArr2 = new int[iArr.length];
            int B = e.d.b.d.a.B(this, R.attr.colorControlActivated);
            int B2 = e.d.b.d.a.B(this, R.attr.colorSurface);
            int B3 = e.d.b.d.a.B(this, R.attr.colorOnSurface);
            iArr2[0] = e.d.b.d.a.P(B2, B, 1.0f);
            iArr2[1] = e.d.b.d.a.P(B2, B3, 0.54f);
            iArr2[2] = e.d.b.d.a.P(B2, B3, 0.38f);
            iArr2[3] = e.d.b.d.a.P(B2, B3, 0.38f);
            this.f6398e = new ColorStateList(iArr, iArr2);
        }
        return this.f6398e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6399f && c.i.a.w(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f6399f = z;
        if (z) {
            c.i.a.W(this, getMaterialThemeColorsTintList());
        } else {
            c.i.a.W(this, null);
        }
    }
}
