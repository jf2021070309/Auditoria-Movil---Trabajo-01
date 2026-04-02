package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.amazon.aps.iva.u2.e;
import com.amazon.aps.iva.u2.l;
import com.amazon.aps.iva.y2.d;
import com.amazon.aps.iva.y2.g;
/* loaded from: classes.dex */
public class Flow extends g {
    public com.amazon.aps.iva.u2.g l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.amazon.aps.iva.y2.g, androidx.constraintlayout.widget.b
    public final void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        this.l = new com.amazon.aps.iva.u2.g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.l.X0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    com.amazon.aps.iva.u2.g gVar = this.l;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.u0 = dimensionPixelSize;
                    gVar.v0 = dimensionPixelSize;
                    gVar.w0 = dimensionPixelSize;
                    gVar.x0 = dimensionPixelSize;
                } else if (index == 18) {
                    com.amazon.aps.iva.u2.g gVar2 = this.l;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.w0 = dimensionPixelSize2;
                    gVar2.y0 = dimensionPixelSize2;
                    gVar2.z0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.l.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.l.y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.l.u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.l.z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.l.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.l.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.l.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.l.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.l.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.l.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.l.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.l.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.l.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.l.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.l.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.l.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.l.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.l.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.l.T0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.l.U0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.l.R0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.l.S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.l.W0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.e = this.l;
        l();
    }

    @Override // androidx.constraintlayout.widget.b
    public final void k(e eVar, boolean z) {
        com.amazon.aps.iva.u2.g gVar = this.l;
        int i = gVar.w0;
        if (i > 0 || gVar.x0 > 0) {
            if (z) {
                gVar.y0 = gVar.x0;
                gVar.z0 = i;
                return;
            }
            gVar.y0 = i;
            gVar.z0 = gVar.x0;
        }
    }

    @Override // com.amazon.aps.iva.y2.g
    public final void m(l lVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (lVar != null) {
            lVar.S(mode, size, mode2, size2);
            setMeasuredDimension(lVar.B0, lVar.C0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i, int i2) {
        m(this.l, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.l.N0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.l.H0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.l.O0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.l.I0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.l.T0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.l.L0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.l.R0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.l.F0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.l.P0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.l.J0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.l.Q0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.l.K0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.l.W0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.l.X0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        com.amazon.aps.iva.u2.g gVar = this.l;
        gVar.u0 = i;
        gVar.v0 = i;
        gVar.w0 = i;
        gVar.x0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.l.v0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.l.y0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.l.z0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.l.u0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.l.U0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.l.M0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.l.S0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.l.G0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.l.V0 = i;
        requestLayout();
    }
}
