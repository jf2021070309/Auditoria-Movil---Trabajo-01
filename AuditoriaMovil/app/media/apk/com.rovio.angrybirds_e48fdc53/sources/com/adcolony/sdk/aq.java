package com.adcolony.sdk;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class aq extends ImageView {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private String i;
    private String j;
    private d k;
    private aa l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aq(Context context, d dVar, int i, aa aaVar) {
        super(context);
        this.a = i;
        this.k = dVar;
        this.l = aaVar;
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
        as.a(a2, "ad_session_id", this.j);
        as.b(a2, "container_x", this.b + x);
        as.b(a2, "container_y", this.c + y);
        as.b(a2, "view_x", x);
        as.b(a2, "view_y", y);
        as.b(a2, "id", this.l.getId());
        switch (action) {
            case 0:
                new d("AdContainer.on_touch_began", this.l.b(), a2).a();
                break;
            case 1:
                if (!this.l.p()) {
                    a.a(j.d().get(this.j));
                }
                if (x > 0 && x < this.d && y > 0 && y < this.e) {
                    new d("AdContainer.on_touch_ended", this.l.b(), a2).a();
                    break;
                } else {
                    new d("AdContainer.on_touch_cancelled", this.l.b(), a2).a();
                    break;
                }
            case 2:
                new d("AdContainer.on_touch_moved", this.l.b(), a2).a();
                break;
            case 3:
                new d("AdContainer.on_touch_cancelled", this.l.b(), a2).a();
                break;
            case 5:
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                as.b(a2, "container_x", ((int) motionEvent.getX(action2)) + this.b);
                as.b(a2, "container_y", ((int) motionEvent.getY(action2)) + this.c);
                as.b(a2, "view_x", (int) motionEvent.getX(action2));
                as.b(a2, "view_y", (int) motionEvent.getY(action2));
                new d("AdContainer.on_touch_began", this.l.b(), a2).a();
                break;
            case 6:
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                int x2 = (int) motionEvent.getX(action3);
                int y2 = (int) motionEvent.getY(action3);
                as.b(a2, "container_x", ((int) motionEvent.getX(action3)) + this.b);
                as.b(a2, "container_y", ((int) motionEvent.getY(action3)) + this.c);
                as.b(a2, "view_x", (int) motionEvent.getX(action3));
                as.b(a2, "view_y", (int) motionEvent.getY(action3));
                if (!this.l.p()) {
                    a.a(j.d().get(this.j));
                }
                if (x2 > 0 && x2 < this.d && y2 > 0 && y2 < this.e) {
                    new d("AdContainer.on_touch_ended", this.l.b(), a2).a();
                    break;
                } else {
                    new d("AdContainer.on_touch_cancelled", this.l.b(), a2).a();
                    break;
                }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(d dVar) {
        JSONObject b = dVar.b();
        return as.c(b, "id") == this.a && as.c(b, "container_id") == this.l.c() && as.b(b, "ad_session_id").equals(this.l.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        JSONObject b = this.k.b();
        this.j = as.b(b, "ad_session_id");
        this.b = as.c(b, "x");
        this.c = as.c(b, "y");
        this.d = as.c(b, "width");
        this.e = as.c(b, "height");
        this.i = as.b(b, "filepath");
        this.f = as.d(b, "dpi");
        this.g = as.d(b, "invert_y");
        this.h = as.d(b, "wrap_content");
        setImageURI(Uri.fromFile(new File(this.i)));
        if (this.f) {
            float j = (a.a().k().j() * this.e) / getDrawable().getIntrinsicHeight();
            this.e = (int) (getDrawable().getIntrinsicHeight() * j);
            this.d = (int) (j * getDrawable().getIntrinsicWidth());
            this.b -= this.d;
            this.c = this.g ? this.c + this.e : this.c - this.e;
        }
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = this.h ? new FrameLayout.LayoutParams(-2, -2) : new FrameLayout.LayoutParams(this.d, this.e);
        layoutParams.setMargins(this.b, this.c, 0, 0);
        layoutParams.gravity = 0;
        this.l.addView(this, layoutParams);
        this.l.l().add(a.a("ImageView.set_visible", new f() { // from class: com.adcolony.sdk.aq.1
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (aq.this.a(dVar)) {
                    aq.this.d(dVar);
                }
            }
        }, true));
        this.l.l().add(a.a("ImageView.set_bounds", new f() { // from class: com.adcolony.sdk.aq.2
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (aq.this.a(dVar)) {
                    aq.this.b(dVar);
                }
            }
        }, true));
        this.l.l().add(a.a("ImageView.set_image", new f() { // from class: com.adcolony.sdk.aq.3
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (aq.this.a(dVar)) {
                    aq.this.c(dVar);
                }
            }
        }, true));
        this.l.m().add("ImageView.set_visible");
        this.l.m().add("ImageView.set_bounds");
        this.l.m().add("ImageView.set_image");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(d dVar) {
        JSONObject b = dVar.b();
        this.b = as.c(b, "x");
        this.c = as.c(b, "y");
        this.d = as.c(b, "width");
        this.e = as.c(b, "height");
        if (this.f) {
            float j = (a.a().k().j() * this.e) / getDrawable().getIntrinsicHeight();
            this.e = (int) (getDrawable().getIntrinsicHeight() * j);
            this.d = (int) (j * getDrawable().getIntrinsicWidth());
            this.b -= this.d;
            this.c -= this.e;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.b, this.c, 0, 0);
        layoutParams.width = this.d;
        layoutParams.height = this.e;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(d dVar) {
        this.i = as.b(dVar.b(), "filepath");
        setImageURI(Uri.fromFile(new File(this.i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        if (as.d(dVar.b(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }
}
