package com.amazon.aps.iva.ei;

import com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem;
/* compiled from: MusicMediaCardItem.kt */
/* loaded from: classes.dex */
public abstract class i implements PaginationAdapterItem {
    @Override // com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public final String getContentId() {
        return PaginationAdapterItem.DefaultImpls.getContentId(this);
    }
}
