package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.login.LoginClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GetTokenClient extends PlatformServiceClient {
    @Override // com.facebook.internal.PlatformServiceClient
    protected void populateRequestBundle(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetTokenClient(Context context, LoginClient.Request request) {
        super(context, 65536, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REPLY, NativeProtocol.PROTOCOL_VERSION_20121101, request.getApplicationId());
    }
}
