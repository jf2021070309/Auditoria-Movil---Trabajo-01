package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.internal.zzi;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* loaded from: classes.dex */
public class GoogleSignInClient extends GoogleApi<GoogleSignInOptions> {
    private static final zzd zzbv = new zzd(null);
    private static int zzbw = zzc.zzbx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    /* loaded from: classes.dex */
    public enum zzc {
        public static final int zzbx = 1;
        public static final int zzby = 2;
        public static final int zzbz = 3;
        public static final int zzca = 4;
        private static final /* synthetic */ int[] zzcb = {1, 2, 3, 4};

        public static int[] zzm() {
            return (int[]) zzcb.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    /* loaded from: classes.dex */
    private static class zzd implements PendingResultUtil.ResultConverter<GoogleSignInResult, GoogleSignInAccount> {
        private zzd() {
        }

        @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
        public final /* synthetic */ GoogleSignInAccount convert(GoogleSignInResult googleSignInResult) {
            return googleSignInResult.getSignInAccount();
        }

        /* synthetic */ zzd(com.google.android.gms.auth.api.signin.zzc zzcVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInClient(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, new ApiExceptionMapper());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInClient(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    private final synchronized int zzl() {
        if (zzbw == zzc.zzbx) {
            Context applicationContext = getApplicationContext();
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (isGooglePlayServicesAvailable == 0) {
                zzbw = zzc.zzca;
            } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, isGooglePlayServicesAvailable, null) == null && DynamiteModule.getLocalVersion(applicationContext, "com.google.android.gms.auth.api.fallback") != 0) {
                zzbw = zzc.zzbz;
            } else {
                zzbw = zzc.zzby;
            }
        }
        return zzbw;
    }

    public Intent getSignInIntent() {
        Context applicationContext = getApplicationContext();
        int i = com.google.android.gms.auth.api.signin.zzc.zzbu[zzl() - 1];
        if (i != 1) {
            if (i == 2) {
                return zzi.zzc(applicationContext, getApiOptions());
            }
            return zzi.zze(applicationContext, getApiOptions());
        }
        return zzi.zzd(applicationContext, getApiOptions());
    }

    public Task<GoogleSignInAccount> silentSignIn() {
        return PendingResultUtil.toTask(zzi.zzc(asGoogleApiClient(), getApplicationContext(), getApiOptions(), zzl() == zzc.zzbz), zzbv);
    }

    public Task<Void> signOut() {
        return PendingResultUtil.toVoidTask(zzi.zzc(asGoogleApiClient(), getApplicationContext(), zzl() == zzc.zzbz));
    }

    public Task<Void> revokeAccess() {
        return PendingResultUtil.toVoidTask(zzi.zzd(asGoogleApiClient(), getApplicationContext(), zzl() == zzc.zzbz));
    }
}
