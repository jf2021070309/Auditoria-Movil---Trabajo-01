package com.adcolony.sdk;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ae extends View {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private String f;
    private String g;
    private aa h;
    private d i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ae(Context context, d dVar, int i, aa aaVar) {
        super(context);
        this.h = aaVar;
        this.i = dVar;
        this.a = i;
    }

    boolean a(d dVar) {
        JSONObject b = dVar.b();
        return as.c(b, "id") == this.a && as.c(b, "container_id") == this.h.c() && as.b(b, "ad_session_id").equals(this.h.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        JSONObject b = this.i.b();
        this.g = as.b(b, "ad_session_id");
        this.b = as.c(b, "x");
        this.c = as.c(b, "y");
        this.d = as.c(b, "width");
        this.e = as.c(b, "height");
        this.f = as.b(b, "color");
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.d, this.e);
        layoutParams.setMargins(this.b, this.c, 0, 0);
        layoutParams.gravity = 0;
        this.h.addView(this, layoutParams);
        setBackgroundColor(q.f(this.f));
        this.h.l().add(a.a("ColorView.set_bounds", new f() { // from class: com.adcolony.sdk.ae.1
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (ae.this.a(dVar)) {
                    ae.this.b(dVar);
                }
            }
        }, true));
        this.h.l().add(a.a("ColorView.set_visible", new f() { // from class: com.adcolony.sdk.ae.2
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (ae.this.a(dVar)) {
                    ae.this.d(dVar);
                }
            }
        }, true));
        this.h.l().add(a.a("ColorView.set_color", new f() { // from class: com.adcolony.sdk.ae.3
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (ae.this.a(dVar)) {
                    ae.this.c(dVar);
                }
            }
        }, true));
        this.h.m().add("ColorView.set_bounds");
        this.h.m().add("ColorView.set_visible");
        this.h.m().add("ColorView.set_color");
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
        as.b(a2, "view_id", this.a);
        as.a(a2, "ad_session_id", this.g);
        as.b(a2, "container_x", this.b + x);
        as.b(a2, "container_y", this.c + y);
        as.b(a2, "view_x", x);
        as.b(a2, "view_y", y);
        as.b(a2, "id", this.h.c());
        switch (action) {
            case 0:
                new d("AdContainer.on_touch_began", this.h.b(), a2).a();
                break;
            case 1:
                if (!this.h.p()) {
                    a.a(j.d().get(this.g));
                }
                new d("AdContainer.on_touch_ended", this.h.b(), a2).a();
                break;
            case 2:
                new d("AdContainer.on_touch_moved", this.h.b(), a2).a();
                break;
            case 3:
                new d("AdContainer.on_touch_cancelled", this.h.b(), a2).a();
                break;
            case 5:
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                as.b(a2, "container_x", ((int) motionEvent.getX(action2)) + this.b);
                as.b(a2, "container_y", ((int) motionEvent.getY(action2)) + this.c);
                as.b(a2, "view_x", (int) motionEvent.getX(action2));
                as.b(a2, "view_y", (int) motionEvent.getY(action2));
                new d("AdContainer.on_touch_began", this.h.b(), a2).a();
                break;
            case 6:
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                as.b(a2, "container_x", ((int) motionEvent.getX(action3)) + this.b);
                as.b(a2, "container_y", ((int) motionEvent.getY(action3)) + this.c);
                as.b(a2, "view_x", (int) motionEvent.getX(action3));
                as.b(a2, "view_y", (int) motionEvent.getY(action3));
                if (!this.h.p()) {
                    a.a(j.d().get(this.g));
                }
                new d("AdContainer.on_touch_ended", this.h.b(), a2).a();
                break;
        }
        return true;
    }

    void b(d dVar) {
        JSONObject b = dVar.b();
        this.b = as.c(b, "x");
        this.c = as.c(b, "y");
        this.d = as.c(b, "width");
        this.e = as.c(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.b, this.c, 0, 0);
        layoutParams.width = this.d;
        layoutParams.height = this.e;
        setLayoutParams(layoutParams);
    }

    void c(d dVar) {
        setBackgroundColor(q.f(as.b(dVar.b(), "color")));
    }

    void d(d dVar) {
        if (as.d(dVar.b(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }
}
