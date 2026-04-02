package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzer implements RemoteCall {
    static final RemoteCall zzev = new zzer();

    private zzer() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        ((com.google.android.gms.games.internal.zzf) obj).zzbb();
        ((TaskCompletionSource) obj2).setResult(true);
    }
}
