package com.google.firebase.internal;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.GetTokenResult;
@Deprecated
/* loaded from: classes2.dex */
public interface InternalTokenProvider {
    Task<GetTokenResult> getAccessToken(boolean z);

    String getUid();
}
