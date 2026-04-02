package com.kwad.components.ad.draw.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.kwad.components.core.page.widget.TextProgressBar;
import com.kwad.sdk.R;
import com.kwad.sdk.d.a.a;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public class DrawDownloadProgressBar extends FrameLayout {
    private TextProgressBar cX;
    private View cY;
    private Context mContext;

    public DrawDownloadProgressBar(Context context) {
        super(context);
        D(context);
    }

    public DrawDownloadProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        D(context);
    }

    public DrawDownloadProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        D(context);
    }

    private void D(Context context) {
        this.mContext = context;
        l.inflate(context, R.layout.ksad_draw_download_bar, this);
        this.cX = (TextProgressBar) findViewById(R.id.ksad_download_progress);
        View findViewById = findViewById(R.id.ksad_download_progress_cover);
        this.cY = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.draw.view.DrawDownloadProgressBar.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DrawDownloadProgressBar.this.performClick();
            }
        });
    }

    public final void e(String str, int i) {
        View view;
        int i2;
        if (i == 0 || i == getMax()) {
            view = this.cY;
            i2 = 0;
        } else {
            view = this.cY;
            i2 = 8;
        }
        view.setVisibility(i2);
        this.cX.e(str, i);
    }

    public int getMax() {
        return this.cX.getMax();
    }

    public void setTextColor(int i) {
        this.cX.setTextColor(i);
    }

    public void setTextSize(int i) {
        this.cX.setTextDimen(a.a(getContext(), i));
    }
}
