package com.me.game.pmupdatesdk.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.me.game.pmupdatesdk.utils.DisplayUtils;
/* loaded from: classes7.dex */
public class CompoundTextView extends RLTTextView {
    protected int bh;
    protected int bw;
    protected int lh;
    protected int lw;
    protected int rh;
    protected int rw;
    protected int th;
    protected int tw;

    public CompoundTextView(Context context) {
        super(context);
    }

    public void setLeftInfo(int lw, int lh) {
        this.lw = lw;
        this.lh = lh;
    }

    public void setTopInfo(int tw, int th) {
        this.tw = tw;
        this.th = th;
    }

    public void setRightInfo(int rw, int rh) {
        this.rw = rw;
        this.rh = rh;
    }

    public void setBottomInfo(int bw, int bh) {
        this.bw = bw;
        this.bh = bh;
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.lw;
        if (i5 > 0 && (i4 = this.lh) > 0 && start != null) {
            start.setBounds(0, 0, i5, i4);
        }
        int i6 = this.tw;
        if (i6 > 0 && (i3 = this.th) > 0 && top != null) {
            top.setBounds(0, 0, i6, i3);
        }
        int i7 = this.rw;
        if (i7 > 0 && (i2 = this.rh) > 0 && end != null) {
            end.setBounds(0, 0, i7, i2);
        }
        int i8 = this.bw;
        if (i8 > 0 && (i = this.bh) > 0 && bottom != null) {
            bottom.setBounds(0, 0, i8, i);
        }
        if (getCompoundWidth() > 0 && getCompoundHeight() > 0) {
            int width = DisplayUtils.getIns().dip2px(getCompoundWidth());
            int height = DisplayUtils.getIns().dip2px(getCompoundHeight());
            if (start != null) {
                start.setBounds(0, 0, width, height);
            } else if (top != null) {
                top.setBounds(0, 0, width, height);
            }
        }
        setCompoundDrawableLeft(start);
        setCompoundDrawableTop(top);
        setCompoundDrawableRight(end);
        setCompoundDrawableBottom(bottom);
        super.setCompoundDrawablesRelative(start, top, end, bottom);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.lw;
        if (i5 > 0 && (i4 = this.lh) > 0 && left != null) {
            left.setBounds(0, 0, i5, i4);
        }
        int i6 = this.tw;
        if (i6 > 0 && (i3 = this.th) > 0 && top != null) {
            top.setBounds(0, 0, i6, i3);
        }
        int i7 = this.rw;
        if (i7 > 0 && (i2 = this.rh) > 0 && left != null) {
            right.setBounds(0, 0, i7, i2);
        }
        int i8 = this.bw;
        if (i8 > 0 && (i = this.bh) > 0 && bottom != null) {
            bottom.setBounds(0, 0, i8, i);
        }
        if (getCompoundWidth() > 0 && getCompoundHeight() > 0) {
            int width = DisplayUtils.getIns().dip2px(getCompoundWidth());
            int height = DisplayUtils.getIns().dip2px(getCompoundHeight());
            if (left != null) {
                left.setBounds(0, 0, width, height);
            } else if (top != null) {
                top.setBounds(0, 0, width, height);
            }
        }
        setCompoundDrawableLeft(left);
        setCompoundDrawableTop(top);
        setCompoundDrawableRight(right);
        setCompoundDrawableBottom(bottom);
        super.setCompoundDrawables(left, top, right, bottom);
    }

    public void setCompoundDrawableLeft(Drawable left) {
    }

    public void setCompoundDrawableTop(Drawable top) {
    }

    public void setCompoundDrawableRight(Drawable right) {
    }

    public void setCompoundDrawableBottom(Drawable bottom) {
    }

    protected int getCompoundWidth() {
        return 0;
    }

    protected int getCompoundHeight() {
        return 0;
    }
}
