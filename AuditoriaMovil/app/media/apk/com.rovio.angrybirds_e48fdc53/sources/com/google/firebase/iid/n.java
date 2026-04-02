package com.google.firebase.iid;

import android.support.v4.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n {
    private final Executor a;
    private final Map<Pair<String, String>, Task<String>> b = new ArrayMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Executor executor) {
        this.a = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized Task<String> a(String str, String str2, p pVar) {
        Task task;
        final Pair pair = new Pair(str, str2);
        Task task2 = this.b.get(pair);
        if (task2 != null) {
            task = task2;
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                Log.d("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 29).append("Joining ongoing request for: ").append(valueOf).toString());
                task = task2;
            }
        } else {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf2 = String.valueOf(pair);
                Log.d("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf2).length() + 24).append("Making new request for: ").append(valueOf2).toString());
            }
            Task continueWithTask = pVar.a().continueWithTask(this.a, new Continuation(this, pair) { // from class: com.google.firebase.iid.o
                private final n a;
                private final Pair b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = this;
                    this.b = pair;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task3) {
                    return this.a.a(this.b, task3);
                }
            });
            this.b.put(pair, continueWithTask);
            task = continueWithTask;
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Task a(Pair pair, Task task) {
        synchronized (this) {
            this.b.remove(pair);
        }
        return task;
    }
}
