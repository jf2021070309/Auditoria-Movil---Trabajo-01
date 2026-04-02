package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
/* loaded from: classes2.dex */
public final class zaaw extends GoogleApiClient implements zabt {
    private final Context mContext;
    private final Looper zabj;
    private final int zaca;
    private final GoogleApiAvailability zacc;
    private final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zad, SignInOptions> zacd;
    private boolean zacg;
    private final Lock zaen;
    private final ClientSettings zaes;
    private final Map<Api<?>, Boolean> zaev;
    private final GmsClientEventManager zagr;
    private volatile boolean zagt;
    private long zagu;
    private long zagv;
    private final zabb zagw;
    private zabq zagx;
    final Map<Api.AnyClientKey<?>, Api.Client> zagy;
    Set<Scope> zagz;
    private final ListenerHolders zaha;
    private final ArrayList<zaq> zahb;
    private Integer zahc;
    Set<zacm> zahd;
    final zacp zahe;
    private final GmsClientEventManager.GmsClientEventState zahf;
    private zabs zags = null;
    final Queue<BaseImplementation.ApiMethodImpl<?, ?>> zafb = new LinkedList();

    public zaaw(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zad, SignInOptions> abstractClientBuilder, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<Api.AnyClientKey<?>, Api.Client> map2, int i, int i2, ArrayList<zaq> arrayList, boolean z) {
        this.zagu = ClientLibraryUtils.isPackageSide() ? 10000L : 120000L;
        this.zagv = PushUIConfig.dismissTime;
        this.zagz = new HashSet();
        this.zaha = new ListenerHolders();
        this.zahc = null;
        this.zahd = null;
        this.zahf = new zaax(this);
        this.mContext = context;
        this.zaen = lock;
        this.zacg = false;
        this.zagr = new GmsClientEventManager(looper, this.zahf);
        this.zabj = looper;
        this.zagw = new zabb(this, looper);
        this.zacc = googleApiAvailability;
        this.zaca = i;
        if (this.zaca >= 0) {
            this.zahc = Integer.valueOf(i2);
        }
        this.zaev = map;
        this.zagy = map2;
        this.zahb = arrayList;
        this.zahe = new zacp(this.zagy);
        for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : list) {
            this.zagr.registerConnectionCallbacks(connectionCallbacks);
        }
        for (GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener : list2) {
            this.zagr.registerConnectionFailedListener(onConnectionFailedListener);
        }
        this.zaes = clientSettings;
        this.zacd = abstractClientBuilder;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        Preconditions.checkArgument(t.getClientKey() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.zagy.containsKey(t.getClientKey());
        String name = t.getApi() != null ? t.getApi().getName() : "the API";
        Preconditions.checkArgument(containsKey, new StringBuilder(String.valueOf(name).length() + 65).append("GoogleApiClient is not configured to use ").append(name).append(" required for this call.").toString());
        this.zaen.lock();
        try {
            if (this.zags == null) {
                this.zafb.add(t);
            } else {
                t = (T) this.zags.enqueue(t);
            }
            return t;
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t) {
        Preconditions.checkArgument(t.getClientKey() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.zagy.containsKey(t.getClientKey());
        String name = t.getApi() != null ? t.getApi().getName() : "the API";
        Preconditions.checkArgument(containsKey, new StringBuilder(String.valueOf(name).length() + 65).append("GoogleApiClient is not configured to use ").append(name).append(" required for this call.").toString());
        this.zaen.lock();
        try {
            if (this.zags == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.zagt) {
                this.zafb.add(t);
                while (!this.zafb.isEmpty()) {
                    BaseImplementation.ApiMethodImpl<?, ?> remove = this.zafb.remove();
                    this.zahe.zab(remove);
                    remove.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                }
            } else {
                t = (T) this.zags.execute(t);
            }
            return t;
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> ListenerHolder<L> registerListener(L l) {
        this.zaen.lock();
        try {
            return this.zaha.zaa(l, this.zabj, "NO_TYPE");
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <C extends Api.Client> C getClient(Api.AnyClientKey<C> anyClientKey) {
        C c = (C) this.zagy.get(anyClientKey);
        Preconditions.checkNotNull(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(Api<?> api) {
        return this.zagy.containsKey(api.getClientKey());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(Api<?> api) {
        if (isConnected()) {
            Api.Client client = this.zagy.get(api.getClientKey());
            return client != null && client.isConnected();
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult getConnectionResult(Api<?> api) {
        this.zaen.lock();
        try {
            if (!isConnected() && !this.zagt) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (this.zagy.containsKey(api.getClientKey())) {
                ConnectionResult connectionResult = this.zags.getConnectionResult(api);
                if (connectionResult == null) {
                    if (this.zagt) {
                        connectionResult = ConnectionResult.RESULT_SUCCESS;
                    } else {
                        Log.w("GoogleApiClientImpl", zaay());
                        Log.wtf("GoogleApiClientImpl", String.valueOf(api.getName()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
                        connectionResult = new ConnectionResult(8, null);
                    }
                }
                return connectionResult;
            }
            throw new IllegalArgumentException(String.valueOf(api.getName()).concat(" was never registered with GoogleApiClient"));
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        this.zaen.lock();
        try {
            if (this.zaca >= 0) {
                Preconditions.checkState(this.zahc != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.zahc == null) {
                this.zahc = Integer.valueOf(zaa(this.zagy.values(), false));
            } else if (this.zahc.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            connect(this.zahc.intValue());
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i) {
        boolean z = true;
        this.zaen.lock();
        if (i != 3 && i != 1 && i != 2) {
            z = false;
        }
        try {
            Preconditions.checkArgument(z, new StringBuilder(33).append("Illegal sign-in mode: ").append(i).toString());
            zae(i);
            zaau();
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect() {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.zaen.lock();
        try {
            if (this.zaca >= 0) {
                Preconditions.checkState(this.zahc != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.zahc == null) {
                this.zahc = Integer.valueOf(zaa(this.zagy.values(), false));
            } else if (this.zahc.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zae(this.zahc.intValue());
            this.zagr.enableCallbacks();
            return this.zags.blockingConnect();
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.zaen.lock();
        try {
            if (this.zahc == null) {
                this.zahc = Integer.valueOf(zaa(this.zagy.values(), false));
            } else if (this.zahc.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zae(this.zahc.intValue());
            this.zagr.enableCallbacks();
            return this.zags.blockingConnect(j, timeUnit);
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        this.zaen.lock();
        try {
            this.zahe.release();
            if (this.zags != null) {
                this.zags.disconnect();
            }
            this.zaha.release();
            for (BaseImplementation.ApiMethodImpl<?, ?> apiMethodImpl : this.zafb) {
                apiMethodImpl.zaa((zacs) null);
                apiMethodImpl.cancel();
            }
            this.zafb.clear();
            if (this.zags != null) {
                zaaw();
                this.zagr.disableCallbacks();
            }
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Preconditions.checkState(this.zahc.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.zagy.containsKey(Common.CLIENT_KEY)) {
            zaa(this, statusPendingResult, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            GoogleApiClient build = new GoogleApiClient.Builder(this.mContext).addApi(Common.API).addConnectionCallbacks(new zaay(this, atomicReference, statusPendingResult)).addOnConnectionFailedListener(new zaaz(this, statusPendingResult)).setHandler(this.zagw).build();
            atomicReference.set(build);
            build.connect();
        }
        return statusPendingResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaa(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        Common.zaph.zaa(googleApiClient).setResultCallback(new zaba(this, statusPendingResult, z, googleApiClient));
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(FragmentActivity fragmentActivity) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
        if (this.zaca >= 0) {
            zaj.zaa(lifecycleActivity).zaa(this.zaca);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        return this.zags != null && this.zags.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        return this.zags != null && this.zags.isConnecting();
    }

    private final void zae(int i) {
        if (this.zahc == null) {
            this.zahc = Integer.valueOf(i);
        } else if (this.zahc.intValue() != i) {
            String zaf = zaf(i);
            String zaf2 = zaf(this.zahc.intValue());
            throw new IllegalStateException(new StringBuilder(String.valueOf(zaf).length() + 51 + String.valueOf(zaf2).length()).append("Cannot use sign-in mode: ").append(zaf).append(". Mode was already set to ").append(zaf2).toString());
        }
        if (this.zags == null) {
            boolean z = false;
            boolean z2 = false;
            for (Api.Client client : this.zagy.values()) {
                if (client.requiresSignIn()) {
                    z2 = true;
                }
                z = client.providesSignIn() ? true : z;
            }
            switch (this.zahc.intValue()) {
                case 1:
                    if (!z2) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    }
                    if (z) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case 2:
                    if (z2) {
                        if (this.zacg) {
                            this.zags = new zax(this.mContext, this.zaen, this.zabj, this.zacc, this.zagy, this.zaes, this.zaev, this.zacd, this.zahb, this, true);
                            return;
                        } else {
                            this.zags = zas.zaa(this.mContext, this, this.zaen, this.zabj, this.zacc, this.zagy, this.zaes, this.zaev, this.zacd, this.zahb);
                            return;
                        }
                    }
                    break;
            }
            if (this.zacg && !z) {
                this.zags = new zax(this.mContext, this.zaen, this.zabj, this.zacc, this.zagy, this.zaes, this.zaev, this.zacd, this.zahb, this, false);
            } else {
                this.zags = new zabe(this.mContext, this, this.zaen, this.zabj, this.zacc, this.zagy, this.zaes, this.zaev, this.zacd, this.zahb, this);
            }
        }
    }

    private final void zaau() {
        this.zagr.enableCallbacks();
        this.zags.connect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resume() {
        this.zaen.lock();
        try {
            if (this.zagt) {
                zaau();
            }
        } finally {
            this.zaen.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaav() {
        this.zaen.lock();
        try {
            if (zaaw()) {
                zaau();
            }
        } finally {
            this.zaen.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zaaw() {
        if (this.zagt) {
            this.zagt = false;
            this.zagw.removeMessages(2);
            this.zagw.removeMessages(1);
            if (this.zagx != null) {
                this.zagx.unregister();
                this.zagx = null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zagr.registerConnectionCallbacks(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zagr.isConnectionCallbacksRegistered(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zagr.unregisterConnectionCallbacks(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zagr.registerConnectionFailedListener(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zagr.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zagr.unregisterConnectionFailedListener(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zab(Bundle bundle) {
        while (!this.zafb.isEmpty()) {
            execute(this.zafb.remove());
        }
        this.zagr.onConnectionSuccess(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zac(ConnectionResult connectionResult) {
        if (!this.zacc.isPlayServicesPossiblyUpdating(this.mContext, connectionResult.getErrorCode())) {
            zaaw();
        }
        if (!this.zagt) {
            this.zagr.onConnectionFailure(connectionResult);
            this.zagr.disableCallbacks();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zab(int i, boolean z) {
        if (i == 1 && !z && !this.zagt) {
            this.zagt = true;
            if (this.zagx == null && !ClientLibraryUtils.isPackageSide()) {
                this.zagx = this.zacc.zaa(this.mContext.getApplicationContext(), new zabc(this));
            }
            this.zagw.sendMessageDelayed(this.zagw.obtainMessage(1), this.zagu);
            this.zagw.sendMessageDelayed(this.zagw.obtainMessage(2), this.zagv);
        }
        this.zahe.zabx();
        this.zagr.onUnintentionalDisconnection(i);
        this.zagr.disableCallbacks();
        if (i == 2) {
            zaau();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.mContext;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.zabj;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        return this.zags != null && this.zags.maybeSignIn(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        if (this.zags != null) {
            this.zags.maybeSignOut();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zaa(zacm zacmVar) {
        this.zaen.lock();
        try {
            if (this.zahd == null) {
                this.zahd = new HashSet();
            }
            this.zahd.add(zacmVar);
        } finally {
            this.zaen.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zab(zacm zacmVar) {
        this.zaen.lock();
        try {
            if (this.zahd == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.zahd.remove(zacmVar)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!zaax()) {
                this.zags.zaw();
            }
        } finally {
            this.zaen.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zaax() {
        this.zaen.lock();
        try {
            if (this.zahd != null) {
                r0 = this.zahd.isEmpty() ? false : true;
            }
            return r0;
        } finally {
            this.zaen.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zaay() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.mContext);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.zagt);
        printWriter.append(" mWorkQueue.size()=").print(this.zafb.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zahe.zaky.size());
        if (this.zags != null) {
            this.zags.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public static int zaa(Iterable<Api.Client> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (Api.Client client : iterable) {
            if (client.requiresSignIn()) {
                z3 = true;
            }
            z2 = client.providesSignIn() ? true : z2;
        }
        if (z3) {
            return (z2 && z) ? 2 : 1;
        }
        return 3;
    }

    private static String zaf(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }
}
