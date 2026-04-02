package com.kwad.components.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.core.assist.FailReason;
import com.kwad.sdk.core.imageloader.core.decode.DecodedResult;
import com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public class KsLogoView extends LinearLayout {
    private boolean Zb;
    TextView Zc;
    ImageView Zd;
    private a Ze;
    private SimpleImageLoadingListener ei;

    /* loaded from: classes.dex */
    public interface a {
        void kj();
    }

    public KsLogoView(Context context) {
        this(context, (AttributeSet) null);
    }

    public KsLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KsLogoView(Context context, AttributeSet attributeSet, int i) {
        super(l.wrapContextIfNeed(context), attributeSet, i);
        this.ei = new SimpleImageLoadingListener() { // from class: com.kwad.components.core.widget.KsLogoView.1
            @Override // com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener, com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
            public final void onLoadingComplete(String str, View view, DecodedResult decodedResult) {
                if (KsLogoView.this.Ze != null) {
                    KsLogoView.this.Ze.kj();
                }
            }

            @Override // com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener, com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
            public final void onLoadingFailed(String str, View view, FailReason failReason) {
                KsLogoView.this.sx();
                if (KsLogoView.this.Ze != null) {
                    KsLogoView.this.Ze.kj();
                }
            }
        };
        init();
    }

    public KsLogoView(Context context, boolean z) {
        super(l.wrapContextIfNeed(context));
        this.ei = new SimpleImageLoadingListener() { // from class: com.kwad.components.core.widget.KsLogoView.1
            @Override // com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener, com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
            public final void onLoadingComplete(String str, View view, DecodedResult decodedResult) {
                if (KsLogoView.this.Ze != null) {
                    KsLogoView.this.Ze.kj();
                }
            }

            @Override // com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener, com.kwad.sdk.core.imageloader.core.listener.ImageLoadingListener
            public final void onLoadingFailed(String str, View view, FailReason failReason) {
                KsLogoView.this.sx();
                if (KsLogoView.this.Ze != null) {
                    KsLogoView.this.Ze.kj();
                }
            }
        };
        if (z) {
            setBackground(getResources().getDrawable(R.drawable.ksad_splash_logo_bg));
        }
        init();
    }

    public static Bitmap a(KsLogoView ksLogoView) {
        TextView textView = ksLogoView.getTextView();
        int ceil = ((ksLogoView.getVisibility() != 0 || textView.getText() == null || textView.getText().length() <= 0) ? 0 : ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString()))) + textView.getPaddingLeft() + textView.getPaddingRight()) + (ksLogoView.getIcon().getVisibility() == 0 ? com.kwad.sdk.d.a.a.a(ksLogoView.getContext(), 18.0f) : 0);
        int a2 = com.kwad.sdk.d.a.a.a(ksLogoView.getContext(), 16.0f);
        ksLogoView.measure(ceil, a2);
        ksLogoView.layout(0, 0, ceil, a2);
        Bitmap createBitmap = Bitmap.createBitmap(ksLogoView.getWidth(), ksLogoView.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0);
        ksLogoView.draw(canvas);
        return createBitmap;
    }

    private void init() {
        TextView textView;
        int i;
        l.inflate(getContext(), R.layout.ksad_logo_layout, this);
        this.Zc = (TextView) findViewById(R.id.ksad_logo_text);
        this.Zd = (ImageView) findViewById(R.id.ksad_logo_icon);
        boolean z = getBackground() == null;
        this.Zb = z;
        if (z) {
            this.Zd.setImageDrawable(getResources().getDrawable(R.drawable.ksad_logo_gray));
            textView = this.Zc;
            i = -6513508;
        } else {
            this.Zd.setImageDrawable(getResources().getDrawable(R.drawable.ksad_logo_white));
            textView = this.Zc;
            i = -1711276033;
        }
        textView.setTextColor(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sx() {
        this.Zd.setImageDrawable(getContext().getResources().getDrawable(this.Zb ? R.drawable.ksad_logo_gray : R.drawable.ksad_logo_white));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r7 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        r7.kj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
        if (r7 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(com.kwad.sdk.core.response.model.AdTemplate r7) {
        /*
            r6 = this;
            int r0 = com.kwad.sdk.R.id.ksad_logo_container
            android.view.View r0 = r6.findViewById(r0)
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.d.ck(r7)
            boolean r2 = r6.Zb
            if (r2 == 0) goto L13
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r2 = r1.adBaseInfo
            java.lang.String r2 = r2.adGrayMarkIcon
            goto L17
        L13:
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r2 = r1.adBaseInfo
            java.lang.String r2 = r2.adMarkIcon
        L17:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            if (r3 == 0) goto L46
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r3 = r1.adBaseInfo
            java.lang.String r3 = r3.adSourceDescription
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L46
            android.widget.TextView r7 = r6.Zc
            r7.setVisibility(r4)
            android.widget.TextView r7 = r6.Zc
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.av(r1)
            r7.setText(r1)
            android.widget.ImageView r7 = r6.Zd
            r7.setVisibility(r4)
            r6.sx()
            com.kwad.components.core.widget.KsLogoView$a r7 = r6.Ze
            if (r7 == 0) goto L90
        L42:
            r7.kj()
            goto L90
        L46:
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r3 = r1.adBaseInfo
            java.lang.String r3 = r3.adSourceDescription
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r5 = 8
            if (r3 != 0) goto L61
            android.widget.TextView r3 = r6.Zc
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.av(r1)
            r3.setText(r1)
            android.widget.TextView r1 = r6.Zc
            r1.setVisibility(r4)
            goto L6d
        L61:
            android.widget.TextView r1 = r6.Zc
            r1.setVisibility(r5)
            android.widget.TextView r1 = r6.Zc
            java.lang.String r3 = ""
            r1.setText(r3)
        L6d:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L80
            android.widget.ImageView r1 = r6.Zd
            com.kwad.sdk.core.imageloader.core.listener.SimpleImageLoadingListener r3 = r6.ei
            com.kwad.sdk.core.imageloader.KSImageLoader.loadFeeImage(r1, r2, r7, r3)
            android.widget.ImageView r7 = r6.Zd
            r7.setVisibility(r4)
            goto L90
        L80:
            android.widget.ImageView r7 = r6.Zd
            r7.setVisibility(r5)
            android.widget.ImageView r7 = r6.Zd
            r1 = 0
            r7.setImageDrawable(r1)
            com.kwad.components.core.widget.KsLogoView$a r7 = r6.Ze
            if (r7 == 0) goto L90
            goto L42
        L90:
            r0.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.core.widget.KsLogoView.ad(com.kwad.sdk.core.response.model.AdTemplate):void");
    }

    public ImageView getIcon() {
        return this.Zd;
    }

    public TextView getTextView() {
        return this.Zc;
    }

    public void setLogoLoadFinishListener(a aVar) {
        this.Ze = aVar;
    }
}
