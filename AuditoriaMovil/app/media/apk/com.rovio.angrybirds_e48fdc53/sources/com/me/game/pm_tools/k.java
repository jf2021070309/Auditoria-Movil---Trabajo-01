package com.me.game.pm_tools;

import android.app.Activity;
import android.content.Context;
import android.view.View;
/* loaded from: classes5.dex */
public class k extends i<p0> {

    /* loaded from: classes5.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = k.this.a;
            t.a(context, "http://www.playmods.one?packageName=" + k.this.getContext().getPackageName());
        }
    }

    public k(Context context) {
        super(context);
        setCancelable(false);
        if (context instanceof Activity) {
            ((Activity) context).setRequestedOrientation(1);
        }
    }

    @Override // com.me.game.pm_tools.i
    public int e() {
        return this.a.getResources().getDisplayMetrics().heightPixels;
    }

    @Override // com.me.game.pm_tools.i
    public int f() {
        return this.a.getResources().getDisplayMetrics().widthPixels;
    }

    @Override // com.me.game.pm_tools.i
    /* renamed from: l */
    public p0 b() {
        return p0.s(this.a);
    }

    @Override // com.me.game.pm_tools.i
    /* renamed from: m */
    public void h(p0 p0Var) {
        p0Var.setOnDownClickListener(new a());
    }
}
