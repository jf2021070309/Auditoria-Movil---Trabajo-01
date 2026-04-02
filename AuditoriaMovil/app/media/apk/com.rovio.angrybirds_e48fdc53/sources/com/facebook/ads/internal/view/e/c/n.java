package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
/* loaded from: classes2.dex */
public class n extends View implements com.facebook.ads.internal.view.e.a.b {
    private final Paint a;
    private final Rect b;
    private float c;
    private final com.facebook.ads.internal.view.e.b.o d;
    private final com.facebook.ads.internal.view.e.b.c e;
    private com.facebook.ads.internal.view.e.b f;

    public n(Context context) {
        super(context);
        this.d = new com.facebook.ads.internal.view.e.b.o() { // from class: com.facebook.ads.internal.view.e.c.n.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.n nVar) {
                if (n.this.f != null) {
                    int duration = n.this.f.getDuration();
                    if (duration > 0) {
                        n.this.c = n.this.f.getCurrentPosition() / duration;
                    } else {
                        n.this.c = 0.0f;
                    }
                    n.this.postInvalidate();
                }
            }
        };
        this.e = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.e.c.n.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                if (n.this.f != null) {
                    n.this.c = 0.0f;
                    n.this.postInvalidate();
                }
            }
        };
        this.a = new Paint();
        this.a.setStyle(Paint.Style.FILL);
        this.a.setColor(-9528840);
        this.b = new Rect();
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void a(com.facebook.ads.internal.view.e.b bVar) {
        this.f = bVar;
        bVar.getEventBus().a(this.d, this.e);
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void b(com.facebook.ads.internal.view.e.b bVar) {
        bVar.getEventBus().b(this.e, this.d);
        this.f = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.b.set(0, 0, (int) (getWidth() * this.c), getHeight());
        canvas.drawRect(this.b, this.a);
        super.draw(canvas);
    }
}
