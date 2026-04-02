package com.applovin.impl.mediation.debugger.ui.d;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
/* loaded from: classes.dex */
public class b {
    public TextView a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f3607b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f3608c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f3609d;

    /* renamed from: e  reason: collision with root package name */
    private c f3610e;

    /* renamed from: f  reason: collision with root package name */
    private int f3611f;

    public int a() {
        return this.f3611f;
    }

    public void a(int i2) {
        this.f3611f = i2;
    }

    public void a(c cVar) {
        this.f3610e = cVar;
        this.a.setText(cVar.k());
        this.a.setTextColor(cVar.n());
        if (this.f3607b != null) {
            if (TextUtils.isEmpty(cVar.c_())) {
                this.f3607b.setVisibility(8);
            } else {
                this.f3607b.setTypeface(null, 0);
                this.f3607b.setVisibility(0);
                this.f3607b.setText(cVar.c_());
                this.f3607b.setTextColor(cVar.c());
                if (cVar.d_()) {
                    this.f3607b.setTypeface(null, 1);
                }
            }
        }
        if (this.f3608c != null) {
            if (cVar.e() > 0) {
                this.f3608c.setImageResource(cVar.e());
                this.f3608c.setColorFilter(cVar.o());
                this.f3608c.setVisibility(0);
            } else {
                this.f3608c.setVisibility(8);
            }
        }
        if (this.f3609d != null) {
            if (cVar.f() <= 0) {
                this.f3609d.setVisibility(8);
                return;
            }
            this.f3609d.setImageResource(cVar.f());
            this.f3609d.setColorFilter(cVar.g());
            this.f3609d.setVisibility(0);
        }
    }

    public c b() {
        return this.f3610e;
    }
}
