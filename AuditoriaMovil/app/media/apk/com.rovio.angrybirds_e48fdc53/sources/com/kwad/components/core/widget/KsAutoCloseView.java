package com.kwad.components.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwad.sdk.R;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public class KsAutoCloseView extends LinearLayout implements View.OnClickListener {
    private static String Bd = "%s秒后自动关闭";
    private TextView YV;
    private ImageView YW;
    private a YX;
    private boolean YY;
    private boolean YZ;
    private int countDown;

    /* loaded from: classes.dex */
    public interface a {
        void dK();

        void dL();
    }

    public KsAutoCloseView(Context context) {
        super(context);
        this.countDown = 10;
        this.YY = true;
        this.YZ = false;
        R(context);
    }

    public KsAutoCloseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.countDown = 10;
        this.YY = true;
        this.YZ = false;
        R(context);
    }

    public KsAutoCloseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.countDown = 10;
        this.YY = true;
        this.YZ = false;
        R(context);
    }

    public KsAutoCloseView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.countDown = 10;
        this.YY = true;
        this.YZ = false;
        R(context);
    }

    private void R(Context context) {
        l.inflate(context, R.layout.ksad_auto_close, this);
        this.YV = (TextView) findViewById(R.id.ksad_auto_close_text);
        ImageView imageView = (ImageView) findViewById(R.id.ksad_auto_close_btn);
        this.YW = imageView;
        imageView.setOnClickListener(this);
    }

    static /* synthetic */ int e(KsAutoCloseView ksAutoCloseView) {
        int i = ksAutoCloseView.countDown;
        ksAutoCloseView.countDown = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(int i) {
        this.YV.setText(String.format(Bd, Integer.valueOf(i)));
    }

    public final void V(int i) {
        if (i <= 0) {
            return;
        }
        this.countDown = i;
        post(new Runnable() { // from class: com.kwad.components.core.widget.KsAutoCloseView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (KsAutoCloseView.this.YY) {
                    if (!KsAutoCloseView.this.YZ) {
                        if (KsAutoCloseView.this.countDown == 0) {
                            if (KsAutoCloseView.this.YX != null) {
                                KsAutoCloseView.this.YX.dK();
                                return;
                            }
                            return;
                        }
                        KsAutoCloseView ksAutoCloseView = KsAutoCloseView.this;
                        ksAutoCloseView.w(ksAutoCloseView.countDown);
                        KsAutoCloseView.e(KsAutoCloseView.this);
                    }
                    KsAutoCloseView.this.postDelayed(this, 1000L);
                }
            }
        });
    }

    public final void aR(boolean z) {
        this.YY = z;
        int i = z ? 0 : 8;
        TextView textView = this.YV;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.YX != null && view.equals(this.YW)) {
            this.YX.dL();
        }
    }

    public void setCountDownPaused(boolean z) {
        this.YZ = z;
    }

    public void setViewListener(a aVar) {
        this.YX = aVar;
    }
}
