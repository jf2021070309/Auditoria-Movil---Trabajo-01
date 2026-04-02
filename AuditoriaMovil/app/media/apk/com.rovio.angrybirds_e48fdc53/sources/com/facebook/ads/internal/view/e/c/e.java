package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class e extends com.facebook.ads.internal.view.e.a.c {
    private final String a;
    private final TextView b;
    private final com.facebook.ads.internal.m.c c;
    private final String d;
    private final Paint e;
    private final RectF f;

    public e(Context context, String str, com.facebook.ads.internal.m.c cVar, String str2, String str3) {
        super(context);
        this.a = str;
        this.c = cVar;
        this.d = str2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.b = new TextView(getContext());
        this.b.setTextColor(-3355444);
        this.b.setTextSize(16.0f);
        this.b.setPadding((int) (displayMetrics.density * 6.0f), (int) (displayMetrics.density * 4.0f), (int) (displayMetrics.density * 6.0f), (int) (displayMetrics.density * 4.0f));
        this.e = new Paint();
        this.e.setStyle(Paint.Style.FILL);
        this.e.setColor(-16777216);
        this.e.setAlpha(178);
        this.f = new RectF();
        setBackgroundColor(0);
        this.b.setText(str3);
        addView(this.b, new RelativeLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.ads.internal.view.e.a.c
    public void a() {
        super.a();
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.internal.view.e.c.e.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (e.this.getVideoView() == null) {
                    return;
                }
                Uri parse = Uri.parse(e.this.a);
                e.this.getVideoView().getEventBus().a((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) new com.facebook.ads.internal.view.e.b.a(parse));
                com.facebook.ads.internal.a.a a = com.facebook.ads.internal.a.b.a(e.this.getContext(), e.this.c, e.this.d, parse, new HashMap());
                if (a != null) {
                    a.b();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.ads.internal.view.e.a.c
    public void b() {
        this.b.setOnClickListener(null);
        super.b();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.f.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.f, 0.0f, 0.0f, this.e);
        super.onDraw(canvas);
    }
}
