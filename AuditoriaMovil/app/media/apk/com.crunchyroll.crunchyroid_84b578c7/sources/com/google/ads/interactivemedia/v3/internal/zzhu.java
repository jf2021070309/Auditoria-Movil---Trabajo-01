package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.amazon.aps.iva.c.b;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsAdapter;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzhu {
    private final List zza = new ArrayList(0);
    private final TaskCompletionSource zzb = new TaskCompletionSource();
    private final TaskCompletionSource zzc = new TaskCompletionSource();
    private final Context zzd;
    private final ExecutorService zze;
    private final zzhc zzf;
    private Integer zzg;

    public zzhu(Context context, ExecutorService executorService, zzhc zzhcVar) {
        this.zzd = context;
        this.zze = executorService;
        this.zzf = zzhcVar;
    }

    public static /* synthetic */ Task zza(zzhu zzhuVar, Task task) {
        final List list = (List) task.getResult();
        return Tasks.whenAllComplete(list).continueWith(zzhuVar.zze, new Continuation() { // from class: com.google.ads.interactivemedia.v3.internal.zzhl
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return list;
            }
        });
    }

    public static /* synthetic */ Void zzd(zzhu zzhuVar, Task task) {
        zzhuVar.zzc.trySetResult(zzhuVar.zza);
        return null;
    }

    private final void zzi(com.google.ads.interactivemedia.v3.impl.data.zzbf zzbfVar, Exception exc) {
        this.zzf.zzb(com.google.ads.interactivemedia.v3.impl.data.zzbe.NATIVE_ESP, zzbfVar, exc);
    }

    private final void zzj(zzhk zzhkVar) {
        this.zza.remove(zzhkVar);
    }

    private static final Exception zzk(zzhk zzhkVar, Exception exc) {
        return new Exception(b.a("Exception with SecureSignalsAdapter ", zzhkVar.zze(), ":", zzhkVar.zzf()), exc);
    }

    public final Task zzb() {
        this.zzb.getTask().continueWith(this.zze, new Continuation() { // from class: com.google.ads.interactivemedia.v3.internal.zzhr
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                final zzhu zzhuVar = zzhu.this;
                List<zzhk> list = (List) task.getResult();
                ArrayList arrayList = new ArrayList(list.size());
                for (final zzhk zzhkVar : list) {
                    Task zzc = zzhkVar.zzc();
                    zzc.addOnFailureListener(new OnFailureListener() { // from class: com.google.ads.interactivemedia.v3.internal.zzht
                        @Override // com.google.android.gms.tasks.OnFailureListener
                        public final void onFailure(Exception exc) {
                            zzhu.this.zzh(zzhkVar, exc);
                        }
                    });
                    arrayList.add(zzc);
                }
                return arrayList;
            }
        }).continueWithTask(this.zze, new zzhn(this)).continueWith(this.zze, new zzho(this)).continueWith(this.zze, new Continuation() { // from class: com.google.ads.interactivemedia.v3.internal.zzhs
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                zzhu.zzd(zzhu.this, task);
                return null;
            }
        });
        return this.zzc.getTask();
    }

    public final Task zzc(List list, Integer num) {
        if (num.intValue() == 0) {
            this.zzb.trySetException(new Exception("No adapters to load"));
            return this.zzb.getTask();
        }
        this.zzg = num;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzhk zzhkVar = null;
            try {
                Class<?> cls = Class.forName(str, false, zzhu.class.getClassLoader());
                Class<?>[] interfaces = cls.getInterfaces();
                String name = SecureSignalsAdapter.class.getName();
                int length = interfaces.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (interfaces[i].getName().equals(name)) {
                        zzhkVar = new zzhk((SecureSignalsAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), str, this.zzd);
                        break;
                    } else {
                        i++;
                    }
                }
            } catch (Throwable unused) {
            }
            if (zzhkVar != null) {
                try {
                    this.zza.add(zzhkVar);
                } catch (Exception e) {
                    zzi(com.google.ads.interactivemedia.v3.impl.data.zzbf.LOAD_ADAPTER, new Exception("Exception with SecureSignalsAdapter ".concat(String.valueOf(str)), e));
                }
            }
        }
        this.zzb.trySetResult(this.zza);
        return this.zzb.getTask();
    }

    public final List zze() {
        Task addOnFailureListener;
        try {
            Task continueWith = this.zzc.getTask().continueWith(this.zze, new Continuation() { // from class: com.google.ads.interactivemedia.v3.internal.zzhm
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    final zzhu zzhuVar = zzhu.this;
                    List<zzhk> list = (List) task.getResult();
                    ArrayList arrayList = new ArrayList(list.size());
                    for (final zzhk zzhkVar : list) {
                        arrayList.add(zzhkVar.zzb().addOnFailureListener(new OnFailureListener() { // from class: com.google.ads.interactivemedia.v3.internal.zzhq
                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception exc) {
                                zzhu.this.zzg(zzhkVar, exc);
                            }
                        }));
                    }
                    return arrayList;
                }
            }).continueWithTask(this.zze, new zzhn(this)).continueWith(this.zze, new zzho(this));
            Integer num = this.zzg;
            if (num == null) {
                addOnFailureListener = Tasks.forResult(new ArrayList());
            } else {
                addOnFailureListener = Tasks.withTimeout(continueWith, num.intValue(), TimeUnit.MILLISECONDS).addOnFailureListener(new OnFailureListener() { // from class: com.google.ads.interactivemedia.v3.internal.zzhp
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        zzhu.this.zzf(exc);
                    }
                });
            }
            return (List) Tasks.await(addOnFailureListener);
        } catch (InterruptedException | ExecutionException unused) {
            return new ArrayList();
        }
    }

    public final /* synthetic */ void zzf(Exception exc) {
        zzi(com.google.ads.interactivemedia.v3.impl.data.zzbf.COLLECT_SIGNALS, exc);
    }

    public final /* synthetic */ void zzg(zzhk zzhkVar, Exception exc) {
        zzj(zzhkVar);
        zzi(com.google.ads.interactivemedia.v3.impl.data.zzbf.COLLECT_SIGNALS, zzk(zzhkVar, exc));
    }

    public final /* synthetic */ void zzh(zzhk zzhkVar, Exception exc) {
        zzj(zzhkVar);
        zzi(com.google.ads.interactivemedia.v3.impl.data.zzbf.INIT, zzk(zzhkVar, exc));
    }
}
