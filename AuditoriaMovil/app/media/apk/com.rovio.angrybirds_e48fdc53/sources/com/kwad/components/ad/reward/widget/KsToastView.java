package com.kwad.components.ad.reward.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwad.sdk.R;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public class KsToastView extends LinearLayout {
    TextView Bc;
    private String Bd;
    private Runnable Be;
    private int countDown;

    public KsToastView(Context context) {
        super(context);
        this.countDown = 3;
        this.Bd = "%ss后自动进入";
        this.Be = null;
        init(context);
    }

    public KsToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.countDown = 3;
        this.Bd = "%ss后自动进入";
        this.Be = null;
        init(context);
    }

    public KsToastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.countDown = 3;
        this.Bd = "%ss后自动进入";
        this.Be = null;
        init(context);
    }

    public KsToastView(Context context, boolean z) {
        super(context);
        this.countDown = 3;
        this.Bd = "%ss后自动进入";
        this.Be = null;
        init(context);
    }

    static /* synthetic */ int b(KsToastView ksToastView) {
        int i = ksToastView.countDown;
        ksToastView.countDown = i - 1;
        return i;
    }

    private void init(Context context) {
        l.inflate(context, R.layout.ksad_interstitial_toast_layout, this);
        this.Bc = (TextView) findViewById(R.id.ksad_total_count_down_text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(int i) {
        this.Bc.setText(String.format(this.Bd, Integer.valueOf(i)));
    }

    public final void V(int i) {
        if (this.Be == null) {
            this.Be = new Runnable() { // from class: com.kwad.components.ad.reward.widget.KsToastView.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (KsToastView.this.countDown == 0) {
                        return;
                    }
                    KsToastView ksToastView = KsToastView.this;
                    ksToastView.w(ksToastView.countDown);
                    KsToastView.b(KsToastView.this);
                    KsToastView.this.postDelayed(this, 1000L);
                }
            };
        }
        this.countDown = 3;
        post(this.Be);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Be);
    }
}
