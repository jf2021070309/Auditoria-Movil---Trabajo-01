package com.amazon.aps.iva.eo;

import com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore;
/* compiled from: FunUserStore.kt */
/* loaded from: classes2.dex */
public interface b extends a, ApiFunUserStore {
    @Override // com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore
    boolean getAcceptedTerms();

    @Override // com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore
    boolean getShouldShowTerms();

    @Override // com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore
    void setAcceptedTerms(boolean z);

    @Override // com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore
    void setShouldShowTerms(boolean z);
}
