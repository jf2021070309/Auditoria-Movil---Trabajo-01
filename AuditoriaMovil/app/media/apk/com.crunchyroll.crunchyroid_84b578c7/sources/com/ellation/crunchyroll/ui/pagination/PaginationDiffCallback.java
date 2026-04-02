package com.ellation.crunchyroll.ui.pagination;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* compiled from: PaginationDiffCallback.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/ui/pagination/PaginationDiffCallback;", "Lcom/ellation/crunchyroll/ui/pagination/PaginationAdapterItem;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/recyclerview/widget/n$e;", "first", "second", "", "areItemsTheSame", "(Lcom/ellation/crunchyroll/ui/pagination/PaginationAdapterItem;Lcom/ellation/crunchyroll/ui/pagination/PaginationAdapterItem;)Z", "areContentsTheSame", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class PaginationDiffCallback<T extends PaginationAdapterItem> extends n.e<T> {
    public static final int $stable = 0;

    @Override // androidx.recyclerview.widget.n.e
    public boolean areContentsTheSame(T t, T t2) {
        j.f(t, "first");
        j.f(t2, "second");
        return j.a(t.getContentId(), t2.getContentId());
    }

    @Override // androidx.recyclerview.widget.n.e
    public boolean areItemsTheSame(T t, T t2) {
        j.f(t, "first");
        j.f(t2, "second");
        return j.a(t.getAdapterId(), t2.getAdapterId());
    }
}
