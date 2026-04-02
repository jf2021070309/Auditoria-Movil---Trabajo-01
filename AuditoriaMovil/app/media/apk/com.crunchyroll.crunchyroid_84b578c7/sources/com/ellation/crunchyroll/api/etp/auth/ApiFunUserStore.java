package com.ellation.crunchyroll.api.etp.auth;

import com.ellation.crunchyroll.api.etp.auth.model.FunUser;
import kotlin.Metadata;
/* compiled from: ApiFunUserStore.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u00020\n8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u00020\n8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/ApiFunUserStore;", "", "Lcom/amazon/aps/iva/kb0/q;", "clear", "Lcom/ellation/crunchyroll/api/etp/auth/model/FunUser;", "getFunUser", "()Lcom/ellation/crunchyroll/api/etp/auth/model/FunUser;", "setFunUser", "(Lcom/ellation/crunchyroll/api/etp/auth/model/FunUser;)V", "funUser", "", "getAcceptedTerms", "()Z", "setAcceptedTerms", "(Z)V", "acceptedTerms", "getShouldShowTerms", "setShouldShowTerms", "shouldShowTerms", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface ApiFunUserStore {
    void clear();

    boolean getAcceptedTerms();

    FunUser getFunUser();

    boolean getShouldShowTerms();

    void setAcceptedTerms(boolean z);

    void setFunUser(FunUser funUser);

    void setShouldShowTerms(boolean z);
}
