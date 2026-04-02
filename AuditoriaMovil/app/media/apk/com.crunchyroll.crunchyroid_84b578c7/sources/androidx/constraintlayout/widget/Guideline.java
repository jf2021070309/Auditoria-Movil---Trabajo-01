package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class Guideline extends View {
    public boolean b;

    public Guideline(Context context) {
        super(context);
        this.b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.b = z;
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.b && bVar.a == i) {
            return;
        }
        bVar.a = i;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.b && bVar.b == i) {
            return;
        }
        bVar.b = i;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.b && bVar.c == f) {
            return;
        }
        bVar.c = f;
        setLayoutParams(bVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
