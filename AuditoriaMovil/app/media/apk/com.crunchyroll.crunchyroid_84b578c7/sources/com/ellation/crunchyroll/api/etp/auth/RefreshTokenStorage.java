package com.ellation.crunchyroll.api.etp.auth;

import kotlin.Metadata;
/* compiled from: RefreshTokenStorage.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&R\u001c\u0010\n\u001a\u00020\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenStorage;", "", "Lcom/amazon/aps/iva/kb0/q;", "clearToken", "saveLastUsedTime", "", "getRefreshToken", "()Ljava/lang/String;", "setRefreshToken", "(Ljava/lang/String;)V", "refreshToken", "", "getLastUsedSeconds", "()J", "lastUsedSeconds", "", "isPresent", "()Z", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface RefreshTokenStorage {
    void clearToken();

    long getLastUsedSeconds();

    String getRefreshToken();

    boolean isPresent();

    void saveLastUsedTime();

    void setRefreshToken(String str);
}
