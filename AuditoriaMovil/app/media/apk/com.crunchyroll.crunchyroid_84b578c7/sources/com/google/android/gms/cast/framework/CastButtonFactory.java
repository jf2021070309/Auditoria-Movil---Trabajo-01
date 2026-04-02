package com.google.android.gms.cast.framework;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteButton;
import com.amazon.aps.iva.e8.b;
import com.amazon.aps.iva.e8.f;
import com.amazon.aps.iva.f8.e0;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzml;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class CastButtonFactory {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = new Logger("CastButtonFactory");
    private static final List zzc = new ArrayList();
    private static final Object zzd = new Object();
    private static final List zze = new ArrayList();
    private static final Object zzf = new Object();

    private CastButtonFactory() {
    }

    public static MenuItem setUpMediaRouteButton(Context context, Menu menu, int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        Preconditions.checkNotNull(menu);
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            try {
                zzg(context, findItem, null);
                synchronized (zzd) {
                    zzc.add(new WeakReference(findItem));
                }
                com.google.android.gms.internal.cast.zzo.zzd(zzml.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
                return findItem;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(String.format(Locale.ROOT, "menu item with ID %d doesn't have a MediaRouteActionProvider.", Integer.valueOf(i)), e);
            }
        }
        throw new IllegalArgumentException(String.format(Locale.ROOT, "menu doesn't contain a menu item whose ID is %d.", Integer.valueOf(i)));
    }

    public static /* synthetic */ void zza(b bVar, f fVar, TaskCompletionSource taskCompletionSource, MenuItem menuItem, CastContext castContext) {
        zzi(castContext, bVar, null);
        taskCompletionSource.setResult(menuItem);
    }

    public static /* synthetic */ void zzb(MediaRouteButton mediaRouteButton, f fVar, TaskCompletionSource taskCompletionSource, CastContext castContext) {
        zzj(castContext, mediaRouteButton, null);
        taskCompletionSource.setResult(null);
    }

    public static /* synthetic */ void zzc(f fVar, MenuItem menuItem) {
        synchronized (zzd) {
            zzc.add(new WeakReference(menuItem));
        }
        com.google.android.gms.internal.cast.zzo.zzd(zzml.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
    }

    public static /* synthetic */ void zzd(MediaRouteButton mediaRouteButton, f fVar, Void r3) {
        synchronized (zzf) {
            zze.add(new WeakReference(mediaRouteButton));
        }
        com.google.android.gms.internal.cast.zzo.zzd(zzml.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
    }

    public static void zze(Context context) {
        synchronized (zzd) {
            for (WeakReference weakReference : zzc) {
                MenuItem menuItem = (MenuItem) weakReference.get();
                if (menuItem != null) {
                    try {
                        zzg(context, menuItem, null);
                    } catch (IllegalArgumentException e) {
                        zzb.w("Unexpected exception when refreshing MediaRouteSelectors for Cast buttons", e);
                    }
                }
            }
        }
        synchronized (zzf) {
            for (WeakReference weakReference2 : zze) {
                MediaRouteButton mediaRouteButton = (MediaRouteButton) weakReference2.get();
                if (mediaRouteButton != null) {
                    zzh(context, mediaRouteButton, null);
                }
            }
        }
    }

    private static b zzf(MenuItem menuItem) {
        com.amazon.aps.iva.p3.b bVar;
        if (menuItem instanceof com.amazon.aps.iva.i3.b) {
            bVar = ((com.amazon.aps.iva.i3.b) menuItem).a();
        } else {
            bVar = null;
        }
        b bVar2 = (b) bVar;
        if (bVar2 == null) {
            return null;
        }
        return bVar2;
    }

    private static void zzg(Context context, MenuItem menuItem, f fVar) throws IllegalArgumentException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        b zzf2 = zzf(menuItem);
        if (zzf2 != null) {
            zzi(CastContext.zza(context), zzf2, null);
            return;
        }
        throw new IllegalArgumentException("cannot refreshButtonSelector with null mediaRouteActionProvider");
    }

    private static void zzh(Context context, MediaRouteButton mediaRouteButton, f fVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzj(CastContext.zza(context), mediaRouteButton, null);
    }

    private static void zzi(CastContext castContext, b bVar, f fVar) {
        e0 mergedSelector;
        if (castContext != null && (mergedSelector = castContext.getMergedSelector()) != null) {
            bVar.setRouteSelector(mergedSelector);
        }
    }

    private static void zzj(CastContext castContext, MediaRouteButton mediaRouteButton, f fVar) {
        e0 mergedSelector;
        if (castContext != null && (mergedSelector = castContext.getMergedSelector()) != null) {
            mediaRouteButton.setRouteSelector(mergedSelector);
        }
    }

    public static void setUpMediaRouteButton(Context context, MediaRouteButton mediaRouteButton) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (mediaRouteButton != null) {
            zzh(context, mediaRouteButton, null);
            synchronized (zzf) {
                zze.add(new WeakReference(mediaRouteButton));
            }
        }
        com.google.android.gms.internal.cast.zzo.zzd(zzml.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
    }

    public static Task<MenuItem> setUpMediaRouteButton(Context context, Executor executor, Menu menu, int i) {
        Task task;
        Preconditions.checkMainThread("Must be called from the main thread.");
        Preconditions.checkNotNull(menu);
        final MenuItem findItem = menu.findItem(i);
        if (findItem == null) {
            return Tasks.forException(new IllegalArgumentException(String.format(Locale.ROOT, "menu doesn't contain a menu item whose ID is %d.", Integer.valueOf(i))));
        }
        try {
            Preconditions.checkMainThread("Must be called from the main thread.");
            final b zzf2 = zzf(findItem);
            if (zzf2 == null) {
                task = Tasks.forException(new IllegalArgumentException("cannot refreshButtonSelector with null mediaRouteActionProvider"));
            } else {
                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                CastContext.getSharedInstance(context, executor).addOnSuccessListener(new OnSuccessListener(null, taskCompletionSource, findItem) { // from class: com.google.android.gms.cast.framework.zze
                    public final /* synthetic */ TaskCompletionSource zzb;
                    public final /* synthetic */ MenuItem zzc;

                    {
                        this.zzb = taskCompletionSource;
                        this.zzc = findItem;
                    }

                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        CastButtonFactory.zza(b.this, null, this.zzb, this.zzc, (CastContext) obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.cast.framework.zzf
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        int i2 = CastButtonFactory.zza;
                        TaskCompletionSource.this.setException(exc);
                    }
                });
                task = taskCompletionSource.getTask();
            }
            return task.addOnSuccessListener(new OnSuccessListener(null) { // from class: com.google.android.gms.cast.framework.zzc
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    CastButtonFactory.zzc(null, (MenuItem) obj);
                }
            });
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IllegalArgumentException(String.format(Locale.ROOT, "menu item with ID %d doesn't have a MediaRouteActionProvider.", Integer.valueOf(i)), e));
        }
    }

    public static Task<Void> setUpMediaRouteButton(Context context, Executor executor, final MediaRouteButton mediaRouteButton) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (mediaRouteButton != null) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            CastContext.getSharedInstance(context, executor).addOnSuccessListener(new OnSuccessListener(null, taskCompletionSource) { // from class: com.google.android.gms.cast.framework.zza
                public final /* synthetic */ TaskCompletionSource zzb;

                {
                    this.zzb = taskCompletionSource;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    CastButtonFactory.zzb(MediaRouteButton.this, null, this.zzb, (CastContext) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.cast.framework.zzb
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    TaskCompletionSource.this.setException(exc);
                }
            });
            return taskCompletionSource.getTask().addOnSuccessListener(new OnSuccessListener(null) { // from class: com.google.android.gms.cast.framework.zzd
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    CastButtonFactory.zzd(MediaRouteButton.this, null, (Void) obj);
                }
            });
        }
        com.google.android.gms.internal.cast.zzo.zzd(zzml.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
        return Tasks.forResult(null);
    }
}
