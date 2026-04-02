package com.amazon.aps.iva.b60;

import com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem;
/* compiled from: WatchlistItemUiModel.kt */
/* loaded from: classes2.dex */
public abstract class s implements PaginationAdapterItem {
    @Override // com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public String getContentId() {
        return PaginationAdapterItem.DefaultImpls.getContentId(this);
    }
}
