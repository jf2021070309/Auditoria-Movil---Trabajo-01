package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c implements ServiceConnection {
    int a;
    final Messenger b;
    h c;
    final Queue<j<?>> d;
    final SparseArray<j<?>> e;
    final /* synthetic */ zzab f;

    private c(zzab zzabVar) {
        this.f = zzabVar;
        this.a = 0;
        this.b = new Messenger(new com.google.android.gms.internal.firebase_messaging.zza(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.firebase.iid.d
            private final c a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.a.a(message);
            }
        }));
        this.d = new ArrayDeque();
        this.e = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean a(j jVar) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        boolean z = true;
        synchronized (this) {
            switch (this.a) {
                case 0:
                    this.d.add(jVar);
                    Preconditions.checkState(this.a == 0);
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.a = 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    context = this.f.b;
                    if (!connectionTracker.bindService(context, intent, this, 1)) {
                        a(0, "Unable to bind to service");
                        break;
                    } else {
                        scheduledExecutorService = this.f.c;
                        scheduledExecutorService.schedule(new Runnable(this) { // from class: com.google.firebase.iid.e
                            private final c a;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.a = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.b();
                            }
                        }, 30L, TimeUnit.SECONDS);
                        break;
                    }
                case 1:
                    this.d.add(jVar);
                    break;
                case 2:
                    this.d.add(jVar);
                    c();
                    break;
                case 3:
                case 4:
                    z = false;
                    break;
                default:
                    throw new IllegalStateException(new StringBuilder(26).append("Unknown state: ").append(this.a).toString());
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", new StringBuilder(41).append("Received response to request: ").append(i).toString());
        }
        synchronized (this) {
            j<?> jVar = this.e.get(i);
            if (jVar == null) {
                Log.w("MessengerIpcClient", new StringBuilder(50).append("Received response for unknown request: ").append(i).toString());
            } else {
                this.e.remove(i);
                a();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    jVar.a(new zzal(4, "Not supported by GmsCore"));
                } else {
                    jVar.a(data);
                }
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            a(0, "Null service connection");
        } else {
            try {
                this.c = new h(iBinder);
                this.a = 2;
                c();
            } catch (RemoteException e) {
                a(0, e.getMessage());
            }
        }
    }

    private final void c() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f.c;
        scheduledExecutorService.execute(new Runnable(this) { // from class: com.google.firebase.iid.f
            private final c a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final j<?> poll;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final c cVar = this.a;
                while (true) {
                    synchronized (cVar) {
                        if (cVar.a == 2) {
                            if (cVar.d.isEmpty()) {
                                cVar.a();
                                return;
                            }
                            poll = cVar.d.poll();
                            cVar.e.put(poll.a, poll);
                            scheduledExecutorService2 = cVar.f.c;
                            scheduledExecutorService2.schedule(new Runnable(cVar, poll) { // from class: com.google.firebase.iid.g
                                private final c a;
                                private final j b;

                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    this.a = cVar;
                                    this.b = poll;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.a(this.b.a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } else {
                            return;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        Log.d("MessengerIpcClient", new StringBuilder(String.valueOf(valueOf).length() + 8).append("Sending ").append(valueOf).toString());
                    }
                    context = cVar.f.b;
                    Messenger messenger = cVar.b;
                    Message obtain = Message.obtain();
                    obtain.what = poll.c;
                    obtain.arg1 = poll.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle(ShareConstants.WEB_DIALOG_PARAM_DATA, poll.d);
                    obtain.setData(bundle);
                    try {
                        cVar.c.a(obtain);
                    } catch (RemoteException e) {
                        cVar.a(2, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        a(2, "Service disconnected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i, String str) {
        Context context;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        switch (this.a) {
            case 0:
                throw new IllegalStateException();
            case 1:
            case 2:
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.a = 4;
                ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                context = this.f.b;
                connectionTracker.unbindService(context, this);
                zzal zzalVar = new zzal(i, str);
                for (j<?> jVar : this.d) {
                    jVar.a(zzalVar);
                }
                this.d.clear();
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    this.e.valueAt(i2).a(zzalVar);
                }
                this.e.clear();
                break;
            case 3:
                this.a = 4;
                break;
            case 4:
                break;
            default:
                throw new IllegalStateException(new StringBuilder(26).append("Unknown state: ").append(this.a).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        Context context;
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.f.b;
            connectionTracker.unbindService(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i) {
        j<?> jVar = this.e.get(i);
        if (jVar != null) {
            Log.w("MessengerIpcClient", new StringBuilder(31).append("Timing out request: ").append(i).toString());
            this.e.remove(i);
            jVar.a(new zzal(3, "Timed out waiting for response"));
            a();
        }
    }
}
