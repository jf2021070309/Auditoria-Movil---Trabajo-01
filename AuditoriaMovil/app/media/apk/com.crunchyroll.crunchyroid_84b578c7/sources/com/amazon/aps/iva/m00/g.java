package com.amazon.aps.iva.m00;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xw.v;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.FormattableSeason;
import java.util.List;
/* compiled from: SeasonsDialogAdapter.kt */
/* loaded from: classes2.dex */
public final class g<T extends FormattableSeason> extends RecyclerView.h<RecyclerView.f0> {
    public final Context a;
    public final List<T> b;
    public final int c;
    public final c<T> d;
    public final com.amazon.aps.iva.xb0.l<T, q> e;

    /* compiled from: SeasonsDialogAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.f0 {
        public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] e = {com.amazon.aps.iva.k.q.a(a.class, "seasonTitle", "getSeasonTitle()Landroid/widget/TextView;", 0), com.amazon.aps.iva.k.q.a(a.class, "episodeCount", "getEpisodeCount()Landroid/widget/TextView;", 0), com.amazon.aps.iva.k.q.a(a.class, "container", "getContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)};
        public final v b;
        public final v c;
        public final v d;

        public a(View view) {
            super(view);
            this.b = com.amazon.aps.iva.xw.g.g(this, R.id.season_title);
            this.c = com.amazon.aps.iva.xw.g.g(this, R.id.episode_count);
            this.d = com.amazon.aps.iva.xw.g.g(this, R.id.seasons_container);
        }
    }

    public g(Context context, List list, int i, c cVar, e eVar) {
        com.amazon.aps.iva.yb0.j.f(list, "seasons");
        this.a = context;
        this.b = list;
        this.c = i;
        this.d = cVar;
        this.e = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i) {
        return this.b.get(i).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, final int i) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        a aVar = (a) f0Var;
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = a.e;
        ((ConstraintLayout) aVar.d.getValue(aVar, lVarArr[2])).setOnClickListener(new View.OnClickListener() { // from class: com.amazon.aps.iva.m00.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g gVar = g.this;
                com.amazon.aps.iva.yb0.j.f(gVar, "this$0");
                gVar.e.invoke(gVar.b.get(i));
            }
        });
        boolean z = false;
        TextView textView = (TextView) aVar.b.getValue(aVar, lVarArr[0]);
        if (this.c == i) {
            z = true;
        }
        textView.setSelected(z);
        List<T> list = this.b;
        c<T> cVar = this.d;
        textView.setText(cVar.f(list.get(i)));
        ((TextView) aVar.c.getValue(aVar, lVarArr[1])).setText(cVar.b(list.get(i)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.a).inflate(R.layout.season_adapter_item, viewGroup, false);
        com.amazon.aps.iva.yb0.j.e(inflate, "view");
        return new a(inflate);
    }
}
