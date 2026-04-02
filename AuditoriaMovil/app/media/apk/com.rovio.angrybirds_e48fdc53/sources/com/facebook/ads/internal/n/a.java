package com.facebook.ads.internal.n;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.view.t;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class a {
    private static final float a = v.b;
    private final h b;
    private final e c;
    private final RelativeLayout d;
    private ArrayList<View> e;

    public a(Context context, e eVar, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, i iVar, h hVar) {
        this.d = relativeLayout;
        this.d.setBackgroundColor(hVar.b());
        this.b = hVar;
        this.c = eVar;
        this.d.setLayoutParams(new RelativeLayout.LayoutParams(-1, Math.round(iVar.b() * a)));
        t tVar = new t(context);
        tVar.setMinWidth(Math.round(280.0f * a));
        tVar.setMaxWidth(Math.round(375.0f * a));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        tVar.setLayoutParams(layoutParams);
        this.d.addView(tVar);
        LinearLayout linearLayout = new LinearLayout(context);
        this.e = new ArrayList<>();
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        tVar.addView(linearLayout);
        switch (iVar) {
            case HEIGHT_400:
                a(linearLayout);
            case HEIGHT_300:
                a(linearLayout, relativeLayout3);
                break;
        }
        a(linearLayout, iVar);
        eVar.a(this.d, this.e);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams();
        layoutParams2.addRule(11);
        layoutParams2.setMargins(Math.round(a * 4.0f), Math.round(a * 4.0f), Math.round(a * 4.0f), Math.round(a * 4.0f));
        tVar.addView(relativeLayout2);
    }

    private void a(ViewGroup viewGroup) {
        com.facebook.ads.internal.view.component.h hVar = new com.facebook.ads.internal.view.component.h(this.d.getContext(), this.c, this.b);
        hVar.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(110.0f * a)));
        viewGroup.addView(hVar);
    }

    private void a(ViewGroup viewGroup, RelativeLayout relativeLayout) {
        RelativeLayout relativeLayout2 = new RelativeLayout(this.d.getContext());
        relativeLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(a * 180.0f)));
        relativeLayout2.setBackgroundColor(this.b.b());
        relativeLayout2.addView(relativeLayout);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (a * 180.0f));
        layoutParams.addRule(13, -1);
        relativeLayout.setLayoutParams(layoutParams);
        viewGroup.addView(relativeLayout2);
        this.e.add(relativeLayout);
    }

    private void a(ViewGroup viewGroup, i iVar) {
        com.facebook.ads.internal.view.component.c cVar = new com.facebook.ads.internal.view.component.c(this.d.getContext(), this.c, this.b, a(iVar), b(iVar));
        cVar.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(b(iVar) * a)));
        viewGroup.addView(cVar);
        this.e.add(cVar.getIconView());
        this.e.add(cVar.getCallToActionView());
    }

    private boolean a(i iVar) {
        return iVar == i.HEIGHT_300 || iVar == i.HEIGHT_120;
    }

    private int b(i iVar) {
        switch (iVar) {
            case HEIGHT_400:
                return (iVar.b() - 180) / 2;
            case HEIGHT_300:
                return iVar.b() - 180;
            case HEIGHT_100:
            case HEIGHT_120:
                return iVar.b();
            default:
                return 0;
        }
    }

    public void a() {
        this.c.D();
    }
}
