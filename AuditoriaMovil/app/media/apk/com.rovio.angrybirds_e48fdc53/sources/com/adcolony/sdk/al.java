package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class al extends EditText {
    private aa A;
    private d B;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private String w;
    private String x;
    private String y;
    private String z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public al(Context context, d dVar, int i, aa aaVar) {
        super(context);
        this.a = 0;
        this.b = 1;
        this.c = 2;
        this.d = 3;
        this.e = 1;
        this.f = 2;
        this.g = 3;
        this.h = 0;
        this.i = 1;
        this.j = 2;
        this.k = 1;
        this.l = 2;
        this.m = i;
        this.B = dVar;
        this.A = aaVar;
    }

    void a(d dVar) {
        JSONObject b = dVar.b();
        this.u = as.c(b, "x");
        this.v = as.c(b, "y");
        setGravity(a(true, this.u) | a(false, this.v));
    }

    int a(boolean z, int i) {
        switch (i) {
            case 0:
                if (z) {
                    return 1;
                }
                return 16;
            case 1:
                if (z) {
                    return 3;
                }
                return 48;
            case 2:
                if (z) {
                    return 5;
                }
                return 80;
            default:
                return 17;
        }
    }

    @Override // android.widget.TextView, android.view.View
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
        as.b(a2, "view_id", this.m);
        as.a(a2, "ad_session_id", this.w);
        as.b(a2, "container_x", this.n + x);
        as.b(a2, "container_y", this.o + y);
        as.b(a2, "view_x", x);
        as.b(a2, "view_y", y);
        as.b(a2, "id", this.A.c());
        switch (action) {
            case 0:
                new d("AdContainer.on_touch_began", this.A.b(), a2).a();
                break;
            case 1:
                if (!this.A.p()) {
                    a.a(j.d().get(this.w));
                }
                new d("AdContainer.on_touch_ended", this.A.b(), a2).a();
                break;
            case 2:
                new d("AdContainer.on_touch_moved", this.A.b(), a2).a();
                break;
            case 3:
                new d("AdContainer.on_touch_cancelled", this.A.b(), a2).a();
                break;
            case 5:
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                as.b(a2, "container_x", ((int) motionEvent.getX(action2)) + this.n);
                as.b(a2, "container_y", ((int) motionEvent.getY(action2)) + this.o);
                as.b(a2, "view_x", (int) motionEvent.getX(action2));
                as.b(a2, "view_y", (int) motionEvent.getY(action2));
                new d("AdContainer.on_touch_began", this.A.b(), a2).a();
                break;
            case 6:
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                as.b(a2, "container_x", ((int) motionEvent.getX(action3)) + this.n);
                as.b(a2, "container_y", ((int) motionEvent.getY(action3)) + this.o);
                as.b(a2, "view_x", (int) motionEvent.getX(action3));
                as.b(a2, "view_y", (int) motionEvent.getY(action3));
                if (!this.A.p()) {
                    a.a(j.d().get(this.w));
                }
                new d("AdContainer.on_touch_ended", this.A.b(), a2).a();
                break;
        }
        return true;
    }

    boolean b(d dVar) {
        JSONObject b = dVar.b();
        return as.c(b, "id") == this.m && as.c(b, "container_id") == this.A.c() && as.b(b, "ad_session_id").equals(this.A.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        JSONObject b = this.B.b();
        this.w = as.b(b, "ad_session_id");
        this.n = as.c(b, "x");
        this.o = as.c(b, "y");
        this.p = as.c(b, "width");
        this.q = as.c(b, "height");
        this.s = as.c(b, "font_family");
        this.r = as.c(b, "font_style");
        this.t = as.c(b, "font_size");
        this.x = as.b(b, "background_color");
        this.y = as.b(b, "font_color");
        this.z = as.b(b, "text");
        this.u = as.c(b, "align_x");
        this.v = as.c(b, "align_y");
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.p, this.q);
        layoutParams.setMargins(this.n, this.o, 0, 0);
        layoutParams.gravity = 0;
        this.A.addView(this, layoutParams);
        switch (this.s) {
            case 0:
                setTypeface(Typeface.DEFAULT);
                break;
            case 1:
                setTypeface(Typeface.SERIF);
                break;
            case 2:
                setTypeface(Typeface.SANS_SERIF);
                break;
            case 3:
                setTypeface(Typeface.MONOSPACE);
                break;
        }
        switch (this.r) {
            case 0:
                setTypeface(getTypeface(), 0);
                break;
            case 1:
                setTypeface(getTypeface(), 1);
                break;
            case 2:
                setTypeface(getTypeface(), 2);
                break;
            case 3:
                setTypeface(getTypeface(), 3);
                break;
        }
        setText(this.z);
        setTextSize(this.t);
        setGravity(a(true, this.u) | a(false, this.v));
        if (!this.x.equals("")) {
            setBackgroundColor(q.f(this.x));
        }
        if (!this.y.equals("")) {
            setTextColor(q.f(this.y));
        }
        this.A.l().add(a.a("TextView.set_visible", new f() { // from class: com.adcolony.sdk.al.1
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (al.this.b(dVar)) {
                    al.this.k(dVar);
                }
            }
        }, true));
        this.A.l().add(a.a("TextView.set_bounds", new f() { // from class: com.adcolony.sdk.al.4
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (al.this.b(dVar)) {
                    al.this.d(dVar);
                }
            }
        }, true));
        this.A.l().add(a.a("TextView.set_font_color", new f() { // from class: com.adcolony.sdk.al.5
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (al.this.b(dVar)) {
                    al.this.f(dVar);
                }
            }
        }, true));
        this.A.l().add(a.a("TextView.set_background_color", new f() { // from class: com.adcolony.sdk.al.6
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (al.this.b(dVar)) {
                    al.this.e(dVar);
                }
            }
        }, true));
        this.A.l().add(a.a("TextView.set_typeface", new f() { // from class: com.adcolony.sdk.al.7
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (al.this.b(dVar)) {
                    al.this.j(dVar);
                }
            }
        }, true));
        this.A.l().add(a.a("TextView.set_font_size", new f() { // from class: com.adcolony.sdk.al.8
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (al.this.b(dVar)) {
                    al.this.g(dVar);
                }
            }
        }, true));
        this.A.l().add(a.a("TextView.set_font_style", new f() { // from class: com.adcolony.sdk.al.9
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (al.this.b(dVar)) {
                    al.this.h(dVar);
                }
            }
        }, true));
        this.A.l().add(a.a("TextView.get_text", new f() { // from class: com.adcolony.sdk.al.10
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (al.this.b(dVar)) {
                    al.this.c(dVar);
                }
            }
        }, true));
        this.A.l().add(a.a("TextView.set_text", new f() { // from class: com.adcolony.sdk.al.2
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (al.this.b(dVar)) {
                    al.this.i(dVar);
                }
            }
        }, true));
        this.A.l().add(a.a("TextView.align", new f() { // from class: com.adcolony.sdk.al.3
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (al.this.b(dVar)) {
                    al.this.a(dVar);
                }
            }
        }, true));
        this.A.m().add("TextView.set_visible");
        this.A.m().add("TextView.set_bounds");
        this.A.m().add("TextView.set_font_color");
        this.A.m().add("TextView.set_background_color");
        this.A.m().add("TextView.set_typeface");
        this.A.m().add("TextView.set_font_size");
        this.A.m().add("TextView.set_font_style");
        this.A.m().add("TextView.get_text");
        this.A.m().add("TextView.set_text");
        this.A.m().add("TextView.align");
    }

    void c(d dVar) {
        JSONObject a = as.a();
        as.a(a, "text", getText().toString());
        dVar.a(a).a();
    }

    void d(d dVar) {
        JSONObject b = dVar.b();
        this.n = as.c(b, "x");
        this.o = as.c(b, "y");
        this.p = as.c(b, "width");
        this.q = as.c(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.n, this.o, 0, 0);
        layoutParams.width = this.p;
        layoutParams.height = this.q;
        setLayoutParams(layoutParams);
    }

    void e(d dVar) {
        this.x = as.b(dVar.b(), "background_color");
        setBackgroundColor(q.f(this.x));
    }

    void f(d dVar) {
        this.y = as.b(dVar.b(), "font_color");
        setTextColor(q.f(this.y));
    }

    void g(d dVar) {
        this.t = as.c(dVar.b(), "font_size");
        setTextSize(this.t);
    }

    void h(d dVar) {
        int c = as.c(dVar.b(), "font_style");
        this.r = c;
        switch (c) {
            case 0:
                setTypeface(getTypeface(), 0);
                return;
            case 1:
                setTypeface(getTypeface(), 1);
                return;
            case 2:
                setTypeface(getTypeface(), 2);
                return;
            case 3:
                setTypeface(getTypeface(), 3);
                return;
            default:
                return;
        }
    }

    void i(d dVar) {
        this.z = as.b(dVar.b(), "text");
        setText(this.z);
    }

    void j(d dVar) {
        int c = as.c(dVar.b(), "font_family");
        this.s = c;
        switch (c) {
            case 0:
                setTypeface(Typeface.DEFAULT);
                return;
            case 1:
                setTypeface(Typeface.SERIF);
                return;
            case 2:
                setTypeface(Typeface.SANS_SERIF);
                return;
            case 3:
                setTypeface(Typeface.MONOSPACE);
                return;
            default:
                return;
        }
    }

    void k(d dVar) {
        if (as.d(dVar.b(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }
}
