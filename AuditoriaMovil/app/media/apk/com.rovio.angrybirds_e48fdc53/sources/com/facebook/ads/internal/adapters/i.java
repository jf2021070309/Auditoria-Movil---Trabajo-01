package com.facebook.ads.internal.adapters;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;
/* loaded from: classes2.dex */
public class i extends RecyclerView.Adapter<com.facebook.ads.internal.view.c> {
    private static final int a = Color.argb(51, 0, 0, 0);
    private final List<com.facebook.ads.internal.n.e> b;
    private final int c;
    private final int d;

    public i(com.facebook.ads.internal.view.hscroll.b bVar, List<com.facebook.ads.internal.n.e> list) {
        float f = bVar.getContext().getResources().getDisplayMetrics().density;
        this.b = list;
        this.c = Math.round(f * 1.0f);
        this.d = bVar.getChildSpacing();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a */
    public com.facebook.ads.internal.view.c onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.facebook.ads.internal.view.u uVar = new com.facebook.ads.internal.view.u(viewGroup.getContext());
        uVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        com.facebook.ads.internal.q.a.i.a(uVar, com.facebook.ads.internal.q.a.i.INTERNAL_AD_MEDIA);
        return new com.facebook.ads.internal.view.c(uVar);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a */
    public void onBindViewHolder(final com.facebook.ads.internal.view.c cVar, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        marginLayoutParams.setMargins(i == 0 ? this.d * 2 : this.d, 0, i >= this.b.size() + (-1) ? this.d * 2 : this.d, 0);
        cVar.a.setBackgroundColor(0);
        cVar.a.setImageDrawable(null);
        cVar.a.setLayoutParams(marginLayoutParams);
        cVar.a.setPadding(this.c, this.c, this.c, this.c);
        com.facebook.ads.internal.n.e eVar = this.b.get(i);
        eVar.a(cVar.a);
        com.facebook.ads.internal.n.f j = eVar.j();
        if (j != null) {
            com.facebook.ads.internal.view.b.d a2 = new com.facebook.ads.internal.view.b.d(cVar.a).a();
            a2.a(new com.facebook.ads.internal.view.b.e() { // from class: com.facebook.ads.internal.adapters.i.1
                @Override // com.facebook.ads.internal.view.b.e
                public void a() {
                    cVar.a.setBackgroundColor(i.a);
                }
            });
            a2.a(j.a());
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.b.size();
    }
}
