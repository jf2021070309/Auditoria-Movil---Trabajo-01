package com.amazon.aps.iva.o20;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.v60.n;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaTrack;
import java.util.Set;
/* compiled from: TierPerkLayout.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class a extends g implements d {
    public final c b;
    public final n c;
    public final b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, c cVar) {
        super(context, null, 0, 6, null);
        j.f(cVar, "model");
        this.b = cVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_upsell_tier_perk, (ViewGroup) this, false);
        addView(inflate);
        TextView textView = (TextView) z.u(R.id.tier_perk_description, inflate);
        if (textView != null) {
            this.c = new n((LinearLayout) inflate, textView);
            this.d = new b(this, cVar);
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.tier_perk_description)));
    }

    @Override // com.amazon.aps.iva.o20.d
    public final void J4() {
        LinearLayout linearLayout = this.c.a;
        j.e(linearLayout, "binding.root");
        linearLayout.setEnabled(true);
    }

    @Override // com.amazon.aps.iva.o20.d
    public final void g7() {
        LinearLayout linearLayout = this.c.a;
        j.e(linearLayout, "binding.root");
        linearLayout.setEnabled(false);
    }

    public final c getModel() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.o20.d
    public void setDescription(String str) {
        j.f(str, MediaTrack.ROLE_DESCRIPTION);
        this.c.b.setText(str);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(this.d);
    }
}
