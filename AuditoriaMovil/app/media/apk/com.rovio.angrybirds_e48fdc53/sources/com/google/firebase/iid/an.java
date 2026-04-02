package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class an implements Continuation<Bundle, String> {
    private final /* synthetic */ ak a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public an(ak akVar) {
        this.a = akVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ String then(Task<Bundle> task) {
        String a;
        ak akVar = this.a;
        a = ak.a(task.getResult(IOException.class));
        return a;
    }
}
