package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.sdk.utils.e;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;
/* loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {
    private final Button a;
    private final com.applovin.impl.adview.a b;
    private b c;
    private MaxAdFormat d;
    private a e;

    /* loaded from: classes.dex */
    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    /* loaded from: classes.dex */
    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Button(getContext());
        this.b = new com.applovin.impl.adview.a(getContext(), 20, 16842873);
        this.c = b.LOAD;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        this.a.setTextColor(-1);
        this.a.setOnClickListener(this);
        frameLayout.addView(this.a, new FrameLayout.LayoutParams(-1, -1, 17));
        this.b.setColor(-1);
        addView(this.b, new FrameLayout.LayoutParams(-1, -1, 17));
        a(b.LOAD);
    }

    private void a(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.b.a();
        } else {
            setEnabled(true);
            this.b.b();
        }
        this.a.setText(b(bVar));
        this.a.setBackgroundColor(c(bVar));
    }

    private String b(b bVar) {
        return b.LOAD == bVar ? "Load" : b.LOADING == bVar ? "" : "Show";
    }

    private int c(b bVar) {
        return e.a((b.LOAD == bVar || b.LOADING == bVar) ? R.color.applovin_sdk_brand_color : R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    public b getControlState() {
        return this.c;
    }

    public MaxAdFormat getFormat() {
        return this.d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.c != bVar) {
            a(bVar);
        }
        this.c = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.d = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.e = aVar;
    }
}
