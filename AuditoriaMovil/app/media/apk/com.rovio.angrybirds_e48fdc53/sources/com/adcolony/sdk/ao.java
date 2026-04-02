package com.adcolony.sdk;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ao extends GLSurfaceView {
    ap a;
    int b;
    int c;
    int d;
    int e;
    int f;
    String g;
    boolean h;
    aa i;
    d j;
    boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ao(Context context, d dVar, int i, aa aaVar) {
        super(context);
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
        this.b = i;
        this.j = dVar;
        this.i = aaVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        af a = a.a();
        ab j = a.j();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        JSONObject a2 = as.a();
        as.b(a2, "view_id", this.b);
        as.a(a2, "ad_session_id", this.g);
        as.b(a2, "container_x", this.c + x);
        as.b(a2, "container_y", this.d + y);
        as.b(a2, "view_x", x);
        as.b(a2, "view_y", y);
        as.b(a2, "id", this.i.c());
        switch (action) {
            case 0:
                new d("AdContainer.on_touch_began", this.i.b(), a2).a();
                break;
            case 1:
                if (!this.i.p()) {
                    a.a(j.d().get(this.g));
                }
                new d("AdContainer.on_touch_ended", this.i.b(), a2).a();
                break;
            case 2:
                new d("AdContainer.on_touch_moved", this.i.b(), a2).a();
                break;
            case 3:
                new d("AdContainer.on_touch_cancelled", this.i.b(), a2).a();
                break;
            case 5:
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                as.b(a2, "container_x", ((int) motionEvent.getX(action2)) + this.c);
                as.b(a2, "container_y", ((int) motionEvent.getY(action2)) + this.d);
                as.b(a2, "view_x", (int) motionEvent.getX(action2));
                as.b(a2, "view_y", (int) motionEvent.getY(action2));
                new d("AdContainer.on_touch_began", this.i.b(), a2).a();
                break;
            case 6:
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                as.b(a2, "container_x", ((int) motionEvent.getX(action3)) + this.c);
                as.b(a2, "container_y", ((int) motionEvent.getY(action3)) + this.d);
                as.b(a2, "view_x", (int) motionEvent.getX(action3));
                as.b(a2, "view_y", (int) motionEvent.getY(action3));
                if (!this.i.p()) {
                    a.a(j.d().get(this.g));
                }
                new d("AdContainer.on_touch_ended", this.i.b(), a2).a();
                break;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        JSONObject b = this.j.b();
        this.g = as.b(b, "ad_session_id");
        this.c = as.c(b, "x");
        this.d = as.c(b, "y");
        this.e = as.c(b, "width");
        this.f = as.c(b, "height");
        this.h = as.d(b, "transparent");
        setEGLConfigChooser(8, 8, 8, 8, 16, 8);
        if (this.h) {
            getHolder().setFormat(-3);
            setZOrderOnTop(true);
        } else {
            getHolder().setFormat(1);
        }
        this.a = new ap(this, true, this.g);
        setRenderer(this.a);
        this.i.l().add(a.a("RenderView.set_visible", new f() { // from class: com.adcolony.sdk.ao.1
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (ao.this.a(dVar)) {
                    ao.this.c(dVar);
                }
            }
        }, true));
        this.i.l().add(a.a("RenderView.set_bounds", new f() { // from class: com.adcolony.sdk.ao.2
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (ao.this.a(dVar)) {
                    ao.this.b(dVar);
                }
            }
        }, true));
        this.i.m().add("RenderView.set_visible");
        this.i.m().add("RenderView.set_bounds");
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.e, this.f);
        layoutParams.setMargins(this.c, this.d, 0, 0);
        layoutParams.gravity = 0;
        this.i.addView(this, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        if (this.k) {
            return false;
        }
        this.k = true;
        this.a.a();
        return true;
    }

    @Override // android.opengl.GLSurfaceView
    protected void finalize() {
        b();
    }

    boolean a(d dVar) {
        JSONObject b = dVar.b();
        return as.c(b, "id") == this.b && as.c(b, "container_id") == this.i.c() && as.b(b, "ad_session_id").equals(this.i.a());
    }

    void b(d dVar) {
        JSONObject b = dVar.b();
        this.c = as.c(b, "x");
        this.d = as.c(b, "y");
        this.e = as.c(b, "width");
        this.f = as.c(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.c, this.d, 0, 0);
        layoutParams.width = this.e;
        layoutParams.height = this.f;
        setLayoutParams(layoutParams);
        getHolder().setFixedSize(this.e, this.f);
    }

    void c(d dVar) {
        if (as.d(dVar.b(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }
}
