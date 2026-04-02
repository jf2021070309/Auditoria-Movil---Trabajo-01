package com.google.android.gms.cloudmessaging;

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
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzm implements ServiceConnection {
    public zzn zzc;
    public final /* synthetic */ zzs zzf;
    @GuardedBy("this")
    public int zza = 0;
    public final Messenger zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzf
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            zzm zzmVar = zzm.this;
            int i2 = message.arg1;
            Log.isLoggable("MessengerIpcClient", 3);
            synchronized (zzmVar) {
                zzp<?> zzpVar = zzmVar.zze.get(i2);
                if (zzpVar == null) {
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("Received response for unknown request: ");
                    sb.append(i2);
                    Log.w("MessengerIpcClient", sb.toString());
                    return true;
                }
                zzmVar.zze.remove(i2);
                zzmVar.zzf();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    zzpVar.zzc(new zzq(4, "Not supported by GmsCore", null));
                    return true;
                }
                zzpVar.zza(data);
                return true;
            }
        }
    }));
    @GuardedBy("this")
    public final Queue<zzp<?>> zzd = new ArrayDeque();
    @GuardedBy("this")
    public final SparseArray<zzp<?>> zze = new SparseArray<>();

    public /* synthetic */ zzm(zzs zzsVar, zzl zzlVar) {
        this.zzf = zzsVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        zzs.zze(this.zzf).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                zzm zzmVar = zzm.this;
                IBinder iBinder2 = iBinder;
                synchronized (zzmVar) {
                    try {
                        if (iBinder2 == null) {
                            zzmVar.zza(0, "Null service connection");
                            return;
                        }
                        try {
                            zzmVar.zzc = new zzn(iBinder2);
                            zzmVar.zza = 2;
                            zzmVar.zzc();
                        } catch (RemoteException e2) {
                            zzmVar.zza(0, e2.getMessage());
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
        Log.isLoggable("MessengerIpcClient", 2);
        zzs.zze(this.zzf).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
            @Override // java.lang.Runnable
            public final void run() {
                zzm.this.zza(2, "Service disconnected");
            }
        });
    }

    public final synchronized void zza(int i2, String str) {
        zzb(i2, str, null);
    }

    public final synchronized void zzb(int i2, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            } else {
                new String("Disconnected: ");
            }
        }
        int i3 = this.zza;
        if (i3 == 0) {
            throw new IllegalStateException();
        }
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                return;
            }
            this.zza = 4;
            return;
        }
        Log.isLoggable("MessengerIpcClient", 2);
        this.zza = 4;
        ConnectionTracker.getInstance().unbindService(zzs.zza(this.zzf), this);
        zzq zzqVar = new zzq(i2, str, th);
        for (zzp<?> zzpVar : this.zzd) {
            zzpVar.zzc(zzqVar);
        }
        this.zzd.clear();
        for (int i4 = 0; i4 < this.zze.size(); i4++) {
            this.zze.valueAt(i4).zzc(zzqVar);
        }
        this.zze.clear();
    }

    public final void zzc() {
        zzs.zze(this.zzf).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzh
            @Override // java.lang.Runnable
            public final void run() {
                final zzp<?> poll;
                final zzm zzmVar = zzm.this;
                while (true) {
                    synchronized (zzmVar) {
                        if (zzmVar.zza != 2) {
                            return;
                        }
                        if (zzmVar.zzd.isEmpty()) {
                            zzmVar.zzf();
                            return;
                        }
                        poll = zzmVar.zzd.poll();
                        zzmVar.zze.put(poll.zza, poll);
                        zzs.zze(zzmVar.zzf).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzm.this.zze(poll.zza);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String.valueOf(poll).length();
                    }
                    Context zza = zzs.zza(zzmVar.zzf);
                    Messenger messenger = zzmVar.zzb;
                    Message obtain = Message.obtain();
                    obtain.what = poll.zzc;
                    obtain.arg1 = poll.zza;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.zzb());
                    bundle.putString("pkg", zza.getPackageName());
                    bundle.putBundle("data", poll.zzd);
                    obtain.setData(bundle);
                    try {
                        zzmVar.zzc.zza(obtain);
                    } catch (RemoteException e2) {
                        zzmVar.zza(2, e2.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void zzd() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    public final synchronized void zze(int i2) {
        zzp<?> zzpVar = this.zze.get(i2);
        if (zzpVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i2);
            Log.w("MessengerIpcClient", sb.toString());
            this.zze.remove(i2);
            zzpVar.zzc(new zzq(3, "Timed out waiting for response", null));
            zzf();
        }
    }

    public final synchronized void zzf() {
        if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.zza = 3;
            ConnectionTracker.getInstance().unbindService(zzs.zza(this.zzf), this);
        }
    }

    public final synchronized boolean zzg(zzp<?> zzpVar) {
        int i2 = this.zza;
        if (i2 != 0) {
            if (i2 == 1) {
                this.zzd.add(zzpVar);
                return true;
            } else if (i2 != 2) {
                return false;
            } else {
                this.zzd.add(zzpVar);
                zzc();
                return true;
            }
        }
        this.zzd.add(zzpVar);
        Preconditions.checkState(this.zza == 0);
        Log.isLoggable("MessengerIpcClient", 2);
        this.zza = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.getInstance().bindService(zzs.zza(this.zzf), intent, this, 1)) {
                zzs.zze(this.zzf).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzm.this.zzd();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                zza(0, "Unable to bind to service");
            }
        } catch (SecurityException e2) {
            zzb(0, "Unable to bind to service", e2);
        }
        return true;
    }
}
