package com.google.android.gms.auth.api.identity;

import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
/* loaded from: classes.dex */
public interface CredentialSavingClient extends HasApiKey<zbc> {
    Task<SaveAccountLinkingTokenResult> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest);

    Task<SavePasswordResult> savePassword(SavePasswordRequest savePasswordRequest);
}
