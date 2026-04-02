package com.google.android.gms.auth.api.identity;

import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* loaded from: classes.dex */
public interface CredentialSavingClient extends HasApiKey<zzf> {
    Task<SavePasswordResult> savePassword(SavePasswordRequest savePasswordRequest);
}
