package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.internal.view.e.b.v;
import com.facebook.ads.internal.view.e.b.w;
/* loaded from: classes2.dex */
public class f extends ImageView implements com.facebook.ads.internal.view.e.a.b {
    private static final int a = (int) (4.0f * Resources.getSystem().getDisplayMetrics().density);
    private final Paint b;
    private com.facebook.ads.internal.view.e.b c;
    private final w d;

    public f(Context context) {
        super(context);
        this.d = new w() { // from class: com.facebook.ads.internal.view.e.c.f.1
            @Override // com.facebook.ads.internal.j.f
            public void a(v vVar) {
                f.this.a();
            }
        };
        this.b = new Paint();
        this.b.setColor(-1728053248);
        setColorFilter(-1);
        setPadding(a, a, a, a);
        c();
        setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.internal.view.e.c.f.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (f.this.c == null) {
                    return;
                }
                if (f.this.b()) {
                    f.this.c.setVolume(1.0f);
                } else {
                    f.this.c.setVolume(0.0f);
                }
                f.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        return this.c != null && this.c.getVolume() == 0.0f;
    }

    private void c() {
        setImageBitmap(com.facebook.ads.internal.q.b.c.a(com.facebook.ads.internal.q.b.b.SOUND_ON));
    }

    private void d() {
        setImageBitmap(com.facebook.ads.internal.q.b.c.a(com.facebook.ads.internal.q.b.b.SOUND_OFF));
    }

    public final void a() {
        if (this.c == null) {
            return;
        }
        if (b()) {
            d();
        } else {
            c();
        }
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void a(com.facebook.ads.internal.view.e.b bVar) {
        this.c = bVar;
        if (this.c != null) {
            this.c.getEventBus().a((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) this.d);
        }
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void b(com.facebook.ads.internal.view.e.b bVar) {
        if (this.c != null) {
            this.c.getEventBus().b((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) this.d);
        }
        this.c = null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.drawCircle(width, height, Math.min(width, height), this.b);
        super.onDraw(canvas);
    }
}
