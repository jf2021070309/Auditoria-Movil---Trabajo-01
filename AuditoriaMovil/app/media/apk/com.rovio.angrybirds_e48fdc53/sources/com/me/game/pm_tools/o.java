package com.me.game.pm_tools;

import android.app.Activity;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.WindowManager;
/* loaded from: classes5.dex */
public class o implements s {
    private static final String d = "o";
    private r a;
    private Activity b;
    private WindowManager.LayoutParams c;

    /* loaded from: classes5.dex */
    public class a implements View.OnClickListener {

        /* renamed from: com.me.game.pm_tools.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class C0278a implements e0 {
            public C0278a() {
            }

            @Override // com.me.game.pm_tools.e0
            public void a(i iVar) {
                o.this.h();
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j jVar = new j(o.this.b);
            jVar.o(new C0278a());
            jVar.show();
        }
    }

    public o() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.c = layoutParams;
        layoutParams.type = 2;
        layoutParams.format = 1;
        layoutParams.flags = 263208;
        layoutParams.gravity = 51;
        layoutParams.x = q.s().t();
        this.c.y = q.s().u();
        this.c.width = u.f().a(136.0f);
        this.c.height = u.f().a(40.0f);
        this.c.softInputMode = 16;
    }

    private void d() {
        try {
            r rVar = this.a;
            if (rVar == null || rVar.getParent() == null) {
                return;
            }
            this.b.getWindowManager().removeViewImmediate(this.a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.a == null) {
            r rVar = new r(this.b);
            this.a = rVar;
            rVar.setImageDrawable(new RippleDrawable(i0.i, h0.b().a("icon_logo_3.png"), null));
            this.a.b(this);
            this.a.setOnClickListener(new a());
        }
        a();
    }

    @Override // com.me.game.pm_tools.s
    public void a() {
        try {
            if (this.a != null) {
                this.c.x = q.s().t();
                this.c.y = q.s().u();
                if (this.a.getParent() != null) {
                    this.b.getWindowManager().updateViewLayout(this.a, this.c);
                } else {
                    this.b.getWindowManager().addView(this.a, this.c);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void e(Activity activity) {
        y.e(d, "onActivityDestroyed", activity);
        d();
    }

    public void f(Activity activity) {
    }

    public void g(Activity activity) {
        y.e(d, "onActivityResumed", activity);
        this.b = activity;
        h();
    }
}
