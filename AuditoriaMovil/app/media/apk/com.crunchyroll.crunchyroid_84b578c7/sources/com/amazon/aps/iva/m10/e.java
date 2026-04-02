package com.amazon.aps.iva.m10;

import com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem;
/* compiled from: GenreItemUiModel.kt */
/* loaded from: classes2.dex */
public abstract class e implements PaginationAdapterItem {
    public final String a;
    public final String b;

    public e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public String getAdapterId() {
        return this.a;
    }

    @Override // com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public String getContentId() {
        return this.b;
    }
}
