package e.j.d.y.d;

import android.text.format.DateUtils;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e.d.d.y.r.l;
import i.a.j;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes2.dex */
public final class c<TResult, TContinuationResult> implements Continuation {
    public final /* synthetic */ a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f8899b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f8900c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j<Boolean> f8901d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(a aVar, long j2, boolean z, j<? super Boolean> jVar) {
        this.a = aVar;
        this.f8899b = j2;
        this.f8900c = z;
        this.f8901d = jVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        h.o.c.j.e(task, "it");
        final e.d.d.y.j jVar = this.a.f8888b;
        if (jVar == null) {
            h.o.c.j.k("firebaseRemoteConfig");
            throw null;
        }
        final l lVar = jVar.f7744f;
        final long j2 = lVar.f7786j.f7796c.getLong("minimum_fetch_interval_in_seconds", l.a);
        return lVar.f7784h.b().continueWithTask(lVar.f7781e, new Continuation() { // from class: e.d.d.y.r.d
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task continueWithTask;
                final l lVar2 = l.this;
                long j3 = j2;
                Objects.requireNonNull(lVar2);
                final Date date = new Date(lVar2.f7782f.currentTimeMillis());
                if (task2.isSuccessful()) {
                    n nVar = lVar2.f7786j;
                    Objects.requireNonNull(nVar);
                    Date date2 = new Date(nVar.f7796c.getLong("last_fetch_time_in_millis", -1L));
                    if (date2.equals(n.a) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j3) + date2.getTime()))) {
                        return Tasks.forResult(new l.a(date, 2, null, null));
                    }
                }
                Date date3 = lVar2.f7786j.a().f7799b;
                Date date4 = date.before(date3) ? date3 : null;
                if (date4 != null) {
                    continueWithTask = Tasks.forException(new e.d.d.y.m(String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()))), date4.getTime()));
                } else {
                    final Task<String> id = lVar2.f7779c.getId();
                    final Task<e.d.d.u.l> a = lVar2.f7779c.a(false);
                    continueWithTask = Tasks.whenAllComplete(id, a).continueWithTask(lVar2.f7781e, new Continuation() { // from class: e.d.d.y.r.c
                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task3) {
                            l lVar3 = l.this;
                            Task task4 = id;
                            Task task5 = a;
                            Date date5 = date;
                            Objects.requireNonNull(lVar3);
                            if (task4.isSuccessful()) {
                                if (task5.isSuccessful()) {
                                    try {
                                        final l.a a2 = lVar3.a((String) task4.getResult(), ((e.d.d.u.l) task5.getResult()).a(), date5);
                                        return a2.a != 0 ? Tasks.forResult(a2) : lVar3.f7784h.c(a2.f7788b).onSuccessTask(lVar3.f7781e, new SuccessContinuation() { // from class: e.d.d.y.r.f
                                            @Override // com.google.android.gms.tasks.SuccessContinuation
                                            public final Task then(Object obj) {
                                                k kVar = (k) obj;
                                                return Tasks.forResult(l.a.this);
                                            }
                                        });
                                    } catch (e.d.d.y.l e2) {
                                        return Tasks.forException(e2);
                                    }
                                }
                                return Tasks.forException(new e.d.d.y.k("Firebase Installations failed to get installation auth token for fetch.", task5.getException()));
                            }
                            return Tasks.forException(new e.d.d.y.k("Firebase Installations failed to get installation ID for fetch.", task4.getException()));
                        }
                    });
                }
                return continueWithTask.continueWithTask(lVar2.f7781e, new Continuation() { // from class: e.d.d.y.r.e
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task3) {
                        l lVar3 = l.this;
                        Date date5 = date;
                        Objects.requireNonNull(lVar3);
                        if (task3.isSuccessful()) {
                            n nVar2 = lVar3.f7786j;
                            synchronized (nVar2.f7797d) {
                                nVar2.f7796c.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date5.getTime()).apply();
                            }
                        } else {
                            Exception exception = task3.getException();
                            if (exception != null) {
                                if (exception instanceof e.d.d.y.m) {
                                    n nVar3 = lVar3.f7786j;
                                    synchronized (nVar3.f7797d) {
                                        nVar3.f7796c.edit().putInt("last_fetch_status", 2).apply();
                                    }
                                } else {
                                    n nVar4 = lVar3.f7786j;
                                    synchronized (nVar4.f7797d) {
                                        nVar4.f7796c.edit().putInt("last_fetch_status", 1).apply();
                                    }
                                }
                            }
                        }
                        return task3;
                    }
                });
            }
        }).onSuccessTask(new SuccessContinuation() { // from class: e.d.d.y.b
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                l.a aVar = (l.a) obj;
                return Tasks.forResult(null);
            }
        }).onSuccessTask(jVar.f7740b, new SuccessContinuation() { // from class: e.d.d.y.c
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                final j jVar2 = j.this;
                Void r6 = (Void) obj;
                final Task<e.d.d.y.r.k> b2 = jVar2.f7741c.b();
                final Task<e.d.d.y.r.k> b3 = jVar2.f7742d.b();
                return Tasks.whenAllComplete(b2, b3).continueWithTask(jVar2.f7740b, new Continuation() { // from class: e.d.d.y.d
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task2) {
                        final j jVar3 = j.this;
                        Task task3 = b2;
                        Task task4 = b3;
                        Objects.requireNonNull(jVar3);
                        if (!task3.isSuccessful() || task3.getResult() == null) {
                            return Tasks.forResult(Boolean.FALSE);
                        }
                        e.d.d.y.r.k kVar = (e.d.d.y.r.k) task3.getResult();
                        if (task4.isSuccessful()) {
                            e.d.d.y.r.k kVar2 = (e.d.d.y.r.k) task4.getResult();
                            if (!(kVar2 == null || !kVar.f7775d.equals(kVar2.f7775d))) {
                                return Tasks.forResult(Boolean.FALSE);
                            }
                        }
                        return jVar3.f7742d.c(kVar).continueWith(jVar3.f7740b, new Continuation() { // from class: e.d.d.y.e
                            @Override // com.google.android.gms.tasks.Continuation
                            public final Object then(Task task5) {
                                boolean z;
                                j jVar4 = j.this;
                                Objects.requireNonNull(jVar4);
                                if (task5.isSuccessful()) {
                                    e.d.d.y.r.j jVar5 = jVar4.f7741c;
                                    synchronized (jVar5) {
                                        jVar5.f7772e = Tasks.forResult(null);
                                    }
                                    e.d.d.y.r.o oVar = jVar5.f7771d;
                                    synchronized (oVar) {
                                        oVar.f7800b.deleteFile(oVar.f7801c);
                                    }
                                    if (task5.getResult() != null) {
                                        JSONArray jSONArray = ((e.d.d.y.r.k) task5.getResult()).f7776e;
                                        if (jVar4.a != null) {
                                            try {
                                                jVar4.a.c(j.c(jSONArray));
                                            } catch (e.d.d.j.a e2) {
                                                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
                                            } catch (JSONException e3) {
                                                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e3);
                                            }
                                        }
                                    } else {
                                        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
                                    }
                                    z = true;
                                } else {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                        });
                    }
                });
            }
        }).addOnCompleteListener(new b(this.a, this.f8899b, this.f8900c, this.f8901d));
    }
}
