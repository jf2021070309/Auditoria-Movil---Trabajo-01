package e.d.b.d.s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c.b.i.r;
import e.d.b.d.b;
import e.d.b.d.r.k;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class a extends r {

    /* renamed from: d  reason: collision with root package name */
    public static final int[][] f6554d = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f6555e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6556f;

    public a(Context context, AttributeSet attributeSet) {
        super(e.d.b.d.z.a.a.a(context, attributeSet, R.attr.radioButtonStyle, 2131887102), attributeSet, R.attr.radioButtonStyle);
        Context context2 = getContext();
        TypedArray d2 = k.d(context2, attributeSet, b.q, R.attr.radioButtonStyle, 2131887102, new int[0]);
        if (d2.hasValue(0)) {
            c.i.a.W(this, e.d.b.d.a.C(context2, d2, 0));
        }
        this.f6556f = d2.getBoolean(1, false);
        d2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f6555e == null) {
            int B = e.d.b.d.a.B(this, R.attr.colorControlActivated);
            int B2 = e.d.b.d.a.B(this, R.attr.colorOnSurface);
            int B3 = e.d.b.d.a.B(this, R.attr.colorSurface);
            int[][] iArr = f6554d;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = e.d.b.d.a.P(B3, B, 1.0f);
            iArr2[1] = e.d.b.d.a.P(B3, B2, 0.54f);
            iArr2[2] = e.d.b.d.a.P(B3, B2, 0.38f);
            iArr2[3] = e.d.b.d.a.P(B3, B2, 0.38f);
            this.f6555e = new ColorStateList(iArr, iArr2);
        }
        return this.f6555e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6556f && c.i.a.w(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f6556f = z;
        if (z) {
            c.i.a.W(this, getMaterialThemeColorsTintList());
        } else {
            c.i.a.W(this, null);
        }
    }
}
