package com.facebook.unity;

import android.os.Bundle;
import com.facebook.CallbackManager;
/* loaded from: classes.dex */
public class FBUnityLoginActivity extends BaseActivity {
    public static final String LOGIN_PARAMS = "login_params";
    public static final String LOGIN_TYPE = "login_type";

    /* loaded from: classes.dex */
    public enum LoginType {
        READ,
        PUBLISH,
        TV_READ,
        TV_PUBLISH
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.unity.BaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(LOGIN_PARAMS);
        int i = AnonymousClass1.$SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType[((LoginType) getIntent().getSerializableExtra(LOGIN_TYPE)).ordinal()];
        if (i == 1) {
            FBLogin.loginWithReadPermissions(stringExtra, this);
        } else if (i == 2) {
            FBLogin.loginWithPublishPermissions(stringExtra, this);
        } else if (i == 3) {
            FBLogin.loginForTVWithReadPermissions(stringExtra, this);
        } else if (i != 4) {
        } else {
            FBLogin.loginForTVWithPublishPermissions(stringExtra, this);
        }
    }

    /* renamed from: com.facebook.unity.FBUnityLoginActivity$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType;

        static {
            int[] iArr = new int[LoginType.values().length];
            $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType = iArr;
            try {
                iArr[LoginType.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType[LoginType.PUBLISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType[LoginType.TV_READ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType[LoginType.TV_PUBLISH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public CallbackManager getCallbackManager() {
        return this.mCallbackManager;
    }
}
