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
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
public final class zzac implements ServiceConnection {
    int zza;
    final Messenger zzb;
    zzal zzc;
    final Queue<zzan<?>> zzd;
    final SparseArray<zzan<?>> zze;
    final /* synthetic */ zzab zzf;

    private zzac(zzab zzabVar) {
        this.zzf = zzabVar;
        this.zza = 0;
        this.zzb = new Messenger(new com.google.android.gms.internal.firebase_messaging.zze(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.firebase.iid.zzaf
            private final zzac zza;

            {
                this.zza = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.zza.zza(message);
            }
        }));
        this.zzd = new ArrayDeque();
        this.zze = new SparseArray<>();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable("MessengerIpcClient", 2);
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable(this, iBinder) { // from class: com.google.firebase.iid.zzah
            private final zzac zza;
            private final IBinder zzb;

            {
                this.zza = this;
                this.zzb = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzac zzacVar = this.zza;
                IBinder iBinder2 = this.zzb;
                synchronized (zzacVar) {
                    try {
                        if (iBinder2 == null) {
                            zzacVar.zza(0, "Null service connection");
                            return;
                        }
                        try {
                            zzacVar.zzc = new zzal(iBinder2);
                            zzacVar.zza = 2;
                            zzacVar.zza();
                        } catch (RemoteException e) {
                            zzacVar.zza(0, e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable("MessengerIpcClient", 2);
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable(this) { // from class: com.google.firebase.iid.zzaj
            private final zzac zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(2, "Service disconnected");
            }
        });
    }

    public final synchronized boolean zza(zzan<?> zzanVar) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i = this.zza;
        if (i == 0) {
            this.zzd.add(zzanVar);
            Preconditions.checkState(this.zza == 0);
            Log.isLoggable("MessengerIpcClient", 2);
            this.zza = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.zzf.zzb;
            if (connectionTracker.bindService(context, intent, this, 1)) {
                scheduledExecutorService = this.zzf.zzc;
                scheduledExecutorService.schedule(new Runnable(this) { // from class: com.google.firebase.iid.zzae
                    private final zzac zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                zza(0, "Unable to bind to service");
            }
            return true;
        } else if (i == 1) {
            this.zzd.add(zzanVar);
            return true;
        } else if (i == 2) {
            this.zzd.add(zzanVar);
            zza();
            return true;
        } else {
            if (i != 3 && i != 4) {
                int i2 = this.zza;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
            return false;
        }
    }

    public final synchronized void zzb() {
        Context context;
        if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.zza = 3;
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.zzf.zzb;
            connectionTracker.unbindService(context, this);
        }
    }

    public final synchronized void zzc() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    public final boolean zza(Message message) {
        int i = message.arg1;
        Log.isLoggable("MessengerIpcClient", 3);
        synchronized (this) {
            zzan<?> zzanVar = this.zze.get(i);
            if (zzanVar == null) {
                return true;
            }
            this.zze.remove(i);
            zzb();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                zzanVar.zza(new zzam(4, "Not supported by GmsCore"));
            } else {
                zzanVar.zza(data);
            }
            return true;
        }
    }

    public final void zza() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable(this) { // from class: com.google.firebase.iid.zzag
            private final zzac zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final zzan<?> poll;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final zzac zzacVar = this.zza;
                while (true) {
                    synchronized (zzacVar) {
                        if (zzacVar.zza != 2) {
                            return;
                        }
                        if (zzacVar.zzd.isEmpty()) {
                            zzacVar.zzb();
                            return;
                        }
                        poll = zzacVar.zzd.poll();
                        zzacVar.zze.put(poll.zza, poll);
                        scheduledExecutorService2 = zzacVar.zzf.zzc;
                        scheduledExecutorService2.schedule(new Runnable(zzacVar, poll) { // from class: com.google.firebase.iid.zzai
                            private final zzac zza;
                            private final zzan zzb;

                            {
                                this.zza = zzacVar;
                                this.zzb = poll;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zza(this.zzb.zza);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        new StringBuilder(String.valueOf(poll).length() + 8);
                    }
                    context = zzacVar.zzf.zzb;
                    Messenger messenger = zzacVar.zzb;
                    Message obtain = Message.obtain();
                    obtain.what = poll.zzc;
                    obtain.arg1 = poll.zza;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.zza());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", poll.zzd);
                    obtain.setData(bundle);
                    try {
                        zzacVar.zzc.zza(obtain);
                    } catch (RemoteException e) {
                        zzacVar.zza(2, e.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void zza(int i, String str) {
        Context context;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            }
        }
        int i2 = this.zza;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                this.zza = 4;
                return;
            } else if (i2 == 4) {
                return;
            } else {
                int i3 = this.zza;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
        }
        Log.isLoggable("MessengerIpcClient", 2);
        this.zza = 4;
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        context = this.zzf.zzb;
        connectionTracker.unbindService(context, this);
        zzam zzamVar = new zzam(i, str);
        for (zzan<?> zzanVar : this.zzd) {
            zzanVar.zza(zzamVar);
        }
        this.zzd.clear();
        for (int i4 = 0; i4 < this.zze.size(); i4++) {
            this.zze.valueAt(i4).zza(zzamVar);
        }
        this.zze.clear();
    }

    public final synchronized void zza(int i) {
        zzan<?> zzanVar = this.zze.get(i);
        if (zzanVar != null) {
            this.zze.remove(i);
            zzanVar.zza(new zzam(3, "Timed out waiting for response"));
            zzb();
        }
    }
}
