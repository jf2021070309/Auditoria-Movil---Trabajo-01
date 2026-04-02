package com.applovin.impl.mediation.debugger.ui.d;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
/* loaded from: classes.dex */
public class b {
    public TextView a;
    public TextView b;
    public ImageView c;
    public ImageView d;
    private c e;
    private int f;

    public int a() {
        return this.f;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(c cVar) {
        this.e = cVar;
        this.a.setText(cVar.k());
        this.a.setTextColor(cVar.n());
        if (this.b != null) {
            if (TextUtils.isEmpty(cVar.c_())) {
                this.b.setVisibility(8);
            } else {
                this.b.setTypeface(null, 0);
                this.b.setVisibility(0);
                this.b.setText(cVar.c_());
                this.b.setTextColor(cVar.c());
                if (cVar.d_()) {
                    this.b.setTypeface(null, 1);
                }
            }
        }
        if (this.c != null) {
            if (cVar.e() > 0) {
                this.c.setImageResource(cVar.e());
                this.c.setColorFilter(cVar.o());
                this.c.setVisibility(0);
            } else {
                this.c.setVisibility(8);
            }
        }
        if (this.d != null) {
            if (cVar.f() <= 0) {
                this.d.setVisibility(8);
                return;
            }
            this.d.setImageResource(cVar.f());
            this.d.setColorFilter(cVar.g());
            this.d.setVisibility(0);
        }
    }

    public c b() {
        return this.e;
    }
}
