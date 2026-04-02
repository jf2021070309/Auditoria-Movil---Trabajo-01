package com.facebook.ads.internal.view.d;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;
/* loaded from: classes2.dex */
public class c extends RecyclerView.Adapter<e> {
    private final List<String> a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(List<String> list, int i) {
        this.a = list;
        this.b = i;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(new d(viewGroup.getContext()));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a */
    public void onBindViewHolder(e eVar, int i) {
        String str = this.a.get(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        marginLayoutParams.setMargins(i == 0 ? this.b * 4 : this.b, 0, i >= getItemCount() + (-1) ? this.b * 4 : this.b, 0);
        eVar.a().setLayoutParams(marginLayoutParams);
        eVar.a().a(str);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.size();
    }
}
