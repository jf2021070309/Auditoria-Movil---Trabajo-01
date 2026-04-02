package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class j extends View {
    protected float a;
    protected final Context b;

    /* loaded from: classes.dex */
    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2);
        
        private final int d;

        a(int i) {
            this.d = i;
        }

        public int a() {
            return this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j(Context context) {
        super(context);
        this.a = 1.0f;
        this.b = context;
    }

    public static j a(a aVar, Context context) {
        return aVar.equals(a.INVISIBLE) ? new r(context) : aVar.equals(a.WHITE_ON_TRANSPARENT) ? new s(context) : new y(context);
    }

    public void a(int i) {
        setViewScale(i / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.a * 30.0f;
    }

    public abstract a getStyle();

    public void setViewScale(float f) {
        this.a = f;
    }
}
