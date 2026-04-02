package com.me.game.pm_tools;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
/* loaded from: classes5.dex */
public class q0 extends TextView {
    public q0(Context context) {
        super(context);
        setSelected(true);
        setSingleLine();
        setLayoutDirection(3);
        setTextDirection(5);
        setMarqueeRepeatLimit(Integer.MAX_VALUE);
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
    }
}
