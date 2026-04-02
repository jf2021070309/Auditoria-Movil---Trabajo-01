package androidx.viewpager2.adapter;

import androidx.viewpager2.adapter.FragmentStateAdapter;
/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class b extends FragmentStateAdapter.a {
    public final /* synthetic */ FragmentStateAdapter.b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FragmentStateAdapter.b bVar) {
        super(0);
        this.a = bVar;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter.a, androidx.recyclerview.widget.RecyclerView.j
    public final void onChanged() {
        this.a.b(true);
    }
}
