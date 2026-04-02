package com.google.android.gms.internal.cast_tv;

import android.os.RemoteException;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.tv.media.EditAudioTracksData;
import com.google.android.gms.cast.tv.media.EditTracksInfoData;
import com.google.android.gms.cast.tv.media.FetchItemsRequestData;
import com.google.android.gms.cast.tv.media.MediaCommandCallback;
import com.google.android.gms.cast.tv.media.MediaException;
import com.google.android.gms.cast.tv.media.MediaLoadCommandCallback;
import com.google.android.gms.cast.tv.media.MediaManager;
import com.google.android.gms.cast.tv.media.MediaQueueManager;
import com.google.android.gms.cast.tv.media.MediaResumeSessionRequestData;
import com.google.android.gms.cast.tv.media.MediaStatusModifier;
import com.google.android.gms.cast.tv.media.MediaStatusWriter;
import com.google.android.gms.cast.tv.media.QueueInsertRequestData;
import com.google.android.gms.cast.tv.media.QueueRemoveRequestData;
import com.google.android.gms.cast.tv.media.QueueReorderRequestData;
import com.google.android.gms.cast.tv.media.QueueUpdateRequestData;
import com.google.android.gms.cast.tv.media.SeekRequestData;
import com.google.android.gms.cast.tv.media.SetPlaybackRateRequestData;
import com.google.android.gms.cast.tv.media.StoreSessionRequestData;
import com.google.android.gms.cast.tv.media.StoreSessionResponseData;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzai extends zzn {
    final /* synthetic */ zzaj zza;

    public /* synthetic */ zzai(zzaj zzajVar, zzah zzahVar) {
        this.zza = zzajVar;
    }

    private final void zzE(MediaLoadRequestData mediaLoadRequestData) {
        zzr zzrVar;
        zzr zzrVar2;
        try {
            zzaj zzajVar = this.zza;
            zzrVar = zzajVar.zzb;
            if (zzrVar != null) {
                zzrVar2 = zzajVar.zzb;
                zzrVar2.zzh(mediaLoadRequestData);
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzA(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = zzzVar.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onSkipAd(str, zzzVar).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzB(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = zzzVar.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onStop(str, zzzVar).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzC(final String str, final StoreSessionRequestData storeSessionRequestData, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = storeSessionRequestData.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onStoreSession(str, storeSessionRequestData).continueWith(new Continuation() { // from class: com.google.android.gms.internal.cast_tv.zzag
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Logger logger;
                zzr zzrVar;
                zzr zzrVar2;
                zzai zzaiVar = zzai.this;
                StoreSessionRequestData storeSessionRequestData2 = storeSessionRequestData;
                String str2 = str;
                if (task.isSuccessful()) {
                    StoreSessionResponseData storeSessionResponseData = (StoreSessionResponseData) task.getResult();
                    if (storeSessionResponseData == null) {
                        logger = zzaj.zza;
                        logger.e("onStoreSession failed. The Task should not be resolved with null", new Object[0]);
                        throw new MediaException(new MediaError.Builder().setDetailedErrorCode(Integer.valueOf((int) MediaError.DetailedErrorCode.GENERIC)).build());
                    }
                    storeSessionResponseData.zzb(storeSessionRequestData2.getRequestId());
                    try {
                        zzaj zzajVar2 = zzaiVar.zza;
                        zzrVar = zzajVar2.zzb;
                        if (zzrVar != null) {
                            zzrVar2 = zzajVar2.zzb;
                            zzrVar2.zzn(str2, storeSessionResponseData);
                            return null;
                        }
                        return null;
                    } catch (RemoteException unused) {
                        return null;
                    }
                }
                throw ((Exception) Preconditions.checkNotNull(task.getException()));
            }
        }).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzD(String str, String str2) {
        zzcb zzcbVar;
        zzcbVar = this.zza.zzg;
        ((com.google.android.gms.cast.tv.media.zzi) zzcbVar).zza.zzb.zza(str, str2);
    }

    public final /* synthetic */ Void zzc(MediaLoadRequestData mediaLoadRequestData, Task task) throws Exception {
        MediaError zzA;
        if (!task.isSuccessful()) {
            zzA = zzaj.zzA(task.getException());
            zzA.setType(MediaError.ERROR_TYPE_LOAD_FAILED);
            throw new MediaException(zzA);
        }
        MediaLoadRequestData mediaLoadRequestData2 = (MediaLoadRequestData) task.getResult();
        if (mediaLoadRequestData2 != null) {
            mediaLoadRequestData2.setRequestId(mediaLoadRequestData.getRequestId());
        }
        zzE(mediaLoadRequestData2);
        return null;
    }

    public final /* synthetic */ Void zzd(MediaResumeSessionRequestData mediaResumeSessionRequestData, Task task) throws Exception {
        MediaError zzA;
        if (!task.isSuccessful()) {
            zzA = zzaj.zzA(task.getException());
            zzA.setType(MediaError.ERROR_TYPE_LOAD_FAILED);
            throw new MediaException(zzA);
        }
        MediaLoadRequestData mediaLoadRequestData = (MediaLoadRequestData) task.getResult();
        if (mediaLoadRequestData != null) {
            mediaLoadRequestData.setRequestId(mediaResumeSessionRequestData.getRequestId());
        }
        zzE(mediaLoadRequestData);
        return null;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final MediaStatus zze(MediaStatus mediaStatus) {
        MediaManager.MediaStatusInterceptor mediaStatusInterceptor;
        MediaManager.MediaStatusInterceptor mediaStatusInterceptor2;
        zzaj zzajVar = this.zza;
        mediaStatusInterceptor = zzajVar.zzh;
        if (mediaStatusInterceptor != null) {
            mediaStatusInterceptor2 = zzajVar.zzh;
            mediaStatusInterceptor2.intercept(new MediaStatusWriter(mediaStatus));
        }
        return mediaStatus;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final MediaStatus zzf(MediaStatus mediaStatus) {
        MediaStatusModifier mediaStatusModifier;
        MediaQueueManager mediaQueueManager;
        mediaStatusModifier = this.zza.zze;
        mediaStatusModifier.zza(mediaStatus);
        mediaQueueManager = this.zza.zzf;
        mediaQueueManager.zzd(mediaStatus);
        return mediaStatus;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final zzz zzg() {
        MediaStatusModifier mediaStatusModifier;
        mediaStatusModifier = this.zza.zze;
        return mediaStatusModifier.getMediaTracksModifier().zza();
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final List zzh() {
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzi(String str, EditAudioTracksData editAudioTracksData, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = editAudioTracksData.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onEditAudioTracks(str, editAudioTracksData).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzj(String str, EditTracksInfoData editTracksInfoData, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = editTracksInfoData.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onEditTracksInfo(str, editTracksInfoData).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzk(String str, final MediaLoadRequestData mediaLoadRequestData, zzeq zzeqVar) {
        MediaLoadCommandCallback mediaLoadCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = mediaLoadRequestData.getRequestId();
        mediaLoadCommandCallback = this.zza.zzd;
        mediaLoadCommandCallback.onLoad(str, mediaLoadRequestData).continueWith(new Continuation() { // from class: com.google.android.gms.internal.cast_tv.zzae
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                zzai.this.zzc(mediaLoadRequestData, task);
                return null;
            }
        }).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzl(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = zzzVar.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onPause(str, zzzVar).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzm(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = zzzVar.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onPlay(str, zzzVar).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzn(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = zzzVar.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onPlayAgain(str, zzzVar).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzo(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) {
        MediaQueueManager mediaQueueManager;
        zzaj zzajVar = this.zza;
        long requestId = zzzVar.getRequestId();
        mediaQueueManager = this.zza.zzf;
        mediaQueueManager.zza(str, zzzVar).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzp(String str, FetchItemsRequestData fetchItemsRequestData, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = fetchItemsRequestData.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onFetchItems(str, fetchItemsRequestData).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzq(String str, com.google.android.gms.cast.tv.media.zze zzeVar, zzeq zzeqVar) {
        MediaQueueManager mediaQueueManager;
        zzaj zzajVar = this.zza;
        long requestId = zzeVar.getRequestId();
        mediaQueueManager = this.zza.zzf;
        mediaQueueManager.zzb(str, zzeVar).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzr(String str, QueueInsertRequestData queueInsertRequestData, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = queueInsertRequestData.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onQueueInsert(str, queueInsertRequestData).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzs(String str, QueueRemoveRequestData queueRemoveRequestData, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = queueRemoveRequestData.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onQueueRemove(str, queueRemoveRequestData).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzt(String str, QueueReorderRequestData queueReorderRequestData, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = queueReorderRequestData.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onQueueReorder(str, queueReorderRequestData).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzu(String str, QueueUpdateRequestData queueUpdateRequestData, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = queueUpdateRequestData.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onQueueUpdate(str, queueUpdateRequestData).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzv(String str, final MediaResumeSessionRequestData mediaResumeSessionRequestData, zzeq zzeqVar) {
        MediaLoadCommandCallback mediaLoadCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = mediaResumeSessionRequestData.getRequestId();
        mediaLoadCommandCallback = this.zza.zzd;
        mediaLoadCommandCallback.onResumeSession(str, mediaResumeSessionRequestData).continueWith(new Continuation() { // from class: com.google.android.gms.internal.cast_tv.zzaf
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                zzai.this.zzd(mediaResumeSessionRequestData, task);
                return null;
            }
        }).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzw(String str, SeekRequestData seekRequestData, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = seekRequestData.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onSeek(str, seekRequestData).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzx(String str, int i, List list, final List list2, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        mediaCommandCallback = zzajVar.zzc;
        mediaCommandCallback.onSelectTracksByType(str, i, list).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzad
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                zzai zzaiVar = zzai.this;
                List list3 = list2;
                Void r3 = (Void) obj;
                if (list3 != null) {
                    zzaiVar.zza.zzl().getMediaTracksModifier().zzc(list3);
                }
            }
        }).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzy(String str, SetPlaybackRateRequestData setPlaybackRateRequestData, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        long requestId = setPlaybackRateRequestData.getRequestId();
        mediaCommandCallback = this.zza.zzc;
        mediaCommandCallback.onSetPlaybackRate(str, setPlaybackRateRequestData).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzz(String str, TextTrackStyle textTrackStyle, zzeq zzeqVar) {
        MediaCommandCallback mediaCommandCallback;
        zzaj zzajVar = this.zza;
        mediaCommandCallback = zzajVar.zzc;
        mediaCommandCallback.onSetTextTrackStyle(str, textTrackStyle).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast_tv.zzab
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Void r2 = (Void) obj;
                zzdu.zzc(zzeq.this, 2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast_tv.zzac
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzaj.this.zzq(requestId, str, zzeqVar, exc);
            }
        });
    }
}
