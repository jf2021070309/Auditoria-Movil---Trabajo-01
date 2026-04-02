package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public class ThumbsBar extends LinearLayout {
    public int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public boolean h;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = -1;
        new SparseArray();
        this.h = false;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_width);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_height);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_width);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_height);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_margin);
    }

    public final void a() {
        int i;
        int i2;
        while (getChildCount() > this.b) {
            removeView(getChildAt(getChildCount() - 1));
        }
        while (true) {
            int childCount = getChildCount();
            int i3 = this.b;
            i = this.d;
            i2 = this.c;
            if (childCount >= i3) {
                break;
            }
            addView(new ImageView(getContext()), new LinearLayout.LayoutParams(i2, i));
        }
        int heroIndex = getHeroIndex();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (heroIndex == i4) {
                layoutParams.width = this.e;
                layoutParams.height = this.f;
            } else {
                layoutParams.width = i2;
                layoutParams.height = i;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int heroIndex = getHeroIndex();
        View childAt = getChildAt(heroIndex);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int measuredWidth = (childAt.getMeasuredWidth() / 2) + (getWidth() / 2);
        childAt.layout(width, getPaddingTop(), measuredWidth, childAt.getMeasuredHeight() + getPaddingTop());
        int measuredHeight = (childAt.getMeasuredHeight() / 2) + getPaddingTop();
        for (int i5 = heroIndex - 1; i5 >= 0; i5--) {
            int i6 = width - this.g;
            View childAt2 = getChildAt(i5);
            childAt2.layout(i6 - childAt2.getMeasuredWidth(), measuredHeight - (childAt2.getMeasuredHeight() / 2), i6, (childAt2.getMeasuredHeight() / 2) + measuredHeight);
            width = i6 - childAt2.getMeasuredWidth();
        }
        while (true) {
            heroIndex++;
            if (heroIndex < this.b) {
                int i7 = measuredWidth + this.g;
                View childAt3 = getChildAt(heroIndex);
                childAt3.layout(i7, measuredHeight - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i7, (childAt3.getMeasuredHeight() / 2) + measuredHeight);
                measuredWidth = i7 + childAt3.getMeasuredWidth();
            } else {
                return;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (!this.h) {
            int i4 = measuredWidth - this.e;
            int i5 = ((i4 + i3) - 1) / (this.c + this.g);
            if (i5 < 2) {
                i5 = 2;
            } else if ((i5 & 1) != 0) {
                i5++;
            }
            int i6 = i5 + 1;
            if (this.b != i6) {
                this.b = i6;
                a();
            }
        }
    }

    public void setNumberOfThumbs(int i) {
        this.h = true;
        this.b = i;
        a();
    }

    public void setThumbSpace(int i) {
        this.g = i;
        requestLayout();
    }
}
