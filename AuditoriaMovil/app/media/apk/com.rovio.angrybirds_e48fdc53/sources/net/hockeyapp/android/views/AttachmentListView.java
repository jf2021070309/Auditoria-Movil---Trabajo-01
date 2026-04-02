package net.hockeyapp.android.views;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import net.hockeyapp.android.utils.HockeyLog;
/* loaded from: classes4.dex */
public class AttachmentListView extends ViewGroup {
    private int a;

    public AttachmentListView(Context context) {
        super(context);
    }

    public AttachmentListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ArrayList<Uri> getAttachments() {
        ArrayList<Uri> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < getChildCount()) {
                arrayList.add(((AttachmentView) getChildAt(i2)).getAttachmentUri());
                i = i2 + 1;
            } else {
                return arrayList;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (View.MeasureSpec.getMode(i) == 0) {
            HockeyLog.debug("AttachmentListView", "Width is unspecified");
        }
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i6 = 0;
        int i7 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            AttachmentView attachmentView = (AttachmentView) childAt;
            int effectiveMaxHeight = attachmentView.getEffectiveMaxHeight() + attachmentView.getPaddingTop();
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(effectiveMaxHeight, Integer.MIN_VALUE));
                int measuredWidth = childAt.getMeasuredWidth();
                i7 = Math.max(i7, childAt.getMeasuredHeight() + layoutParams.height);
                if (paddingLeft + measuredWidth > size) {
                    i4 = getPaddingLeft();
                    i3 = paddingTop + i7;
                } else {
                    i3 = paddingTop;
                    i4 = paddingLeft;
                }
                paddingLeft = i4 + layoutParams.width + measuredWidth;
            } else {
                i3 = paddingTop;
            }
            i6++;
            i7 = i7;
            paddingTop = i3;
            i5 = effectiveMaxHeight;
        }
        this.a = i7;
        if (View.MeasureSpec.getMode(i2) == 0) {
            i5 = paddingTop + i7 + getPaddingBottom();
        } else if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && paddingTop + i7 + getPaddingBottom() < i5) {
            i5 = paddingTop + i7 + getPaddingBottom();
        }
        setMeasuredDimension(size, i5);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(1, 1);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                childAt.invalidate();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (paddingLeft + measuredWidth > i5) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += this.a;
                }
                childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, measuredHeight + paddingTop);
                paddingLeft += ((AttachmentView) childAt).getGap() + measuredWidth + layoutParams.width;
            }
        }
    }
}
