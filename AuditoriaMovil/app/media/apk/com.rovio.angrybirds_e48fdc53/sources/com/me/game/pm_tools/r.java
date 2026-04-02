package com.me.game.pm_tools;

import android.content.Context;
import android.view.ViewConfiguration;
import android.widget.ImageView;
/* loaded from: classes5.dex */
public class r extends ImageView {
    private static final String m = r.class.getSimpleName();
    private int a;
    private int b;
    private boolean c;
    private long d;
    private int e;
    private int f;
    private s g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;

    public r(Context context) {
        super(context);
        this.e = context.getResources().getDisplayMetrics().widthPixels;
        this.f = context.getResources().getDisplayMetrics().heightPixels;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public r a(int i) {
        this.b = i;
        return this;
    }

    public r b(s sVar) {
        this.g = sVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
        if (r0 < r11) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r0 != 3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.me.game.pm_tools.r.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
