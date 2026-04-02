package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.zzl;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: com.google.android.gms.internal.auth-api.zzao  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzao extends GoogleApi<zzl> implements SignInClient {
    private static final Api.ClientKey<zzaw> CLIENT_KEY = new Api.ClientKey<>();
    private static final Api.AbstractClientBuilder<zzaw, zzl> zzbn = new zzas();
    private static final Api<zzl> API = new Api<>("Auth.Api.Identity.SignIn.API", zzbn, CLIENT_KEY);

    public zzao(Context context, zzl zzlVar) {
        super(context, API, zzl.zzc.zzc(zzlVar).zzh(zzba.zzw()).zzk(), GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public zzao(Activity activity, zzl zzlVar) {
        super(activity, API, zzl.zzc.zzc(zzlVar).zzh(zzba.zzw()).zzk(), GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final Task<BeginSignInResult> beginSignIn(BeginSignInRequest beginSignInRequest) {
        final BeginSignInRequest build = BeginSignInRequest.zzc(beginSignInRequest).zzd(getApiOptions().zzh()).build();
        return doRead(TaskApiCall.builder().setFeatures(zzay.zzdc).run(new RemoteCall(this, build) { // from class: com.google.android.gms.internal.auth-api.zzar
            private final zzao zzbr;
            private final BeginSignInRequest zzbs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbr = this;
                this.zzbs = build;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzao zzaoVar = this.zzbr;
                BeginSignInRequest beginSignInRequest2 = this.zzbs;
                ((zzai) ((zzaw) obj).getService()).zzc(new zzav(zzaoVar, (TaskCompletionSource) obj2), (BeginSignInRequest) Preconditions.checkNotNull(beginSignInRequest2));
            }
        }).setAutoResolveMissingFeatures(false).build());
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        for (GoogleApiClient googleApiClient : GoogleApiClient.getAllClients()) {
            googleApiClient.maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
        return doRead(TaskApiCall.builder().setFeatures(zzay.zzdd).run(new RemoteCall(this) { // from class: com.google.android.gms.internal.auth-api.zzaq
            private final zzao zzbr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbr = this;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzao zzaoVar = this.zzbr;
                ((zzai) ((zzaw) obj).getService()).zzc(new zzau(zzaoVar, (TaskCompletionSource) obj2), zzaoVar.getApiOptions().zzh());
            }
        }).setAutoResolveMissingFeatures(false).build());
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final SignInCredential getSignInCredentialFromIntent(Intent intent) throws ApiException {
        if (intent == null) {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
        Status status = (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new ApiException(Status.RESULT_CANCELED);
        }
        if (!status.isSuccess()) {
            throw new ApiException(status);
        }
        SignInCredential signInCredential = (SignInCredential) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "sign_in_credential", SignInCredential.CREATOR);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new ApiException(Status.RESULT_INTERNAL_ERROR);
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final Task<PendingIntent> getSignInIntent(GetSignInIntentRequest getSignInIntentRequest) {
        final GetSignInIntentRequest build = GetSignInIntentRequest.zzc(getSignInIntentRequest).zzf(getApiOptions().zzh()).build();
        return doRead(TaskApiCall.builder().setFeatures(zzay.zzdh).run(new RemoteCall(this, build) { // from class: com.google.android.gms.internal.auth-api.zzat
            private final zzao zzbr;
            private final GetSignInIntentRequest zzbt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbr = this;
                this.zzbt = build;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzao zzaoVar = this.zzbr;
                GetSignInIntentRequest getSignInIntentRequest2 = this.zzbt;
                ((zzai) ((zzaw) obj).getService()).zzc(new zzax(zzaoVar, (TaskCompletionSource) obj2), (GetSignInIntentRequest) Preconditions.checkNotNull(getSignInIntentRequest2));
            }
        }).build());
    }
}
