package e.d.d.y.r;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class j {
    public static final Map<String, j> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f7769b = new Executor() { // from class: e.d.d.y.r.i
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f7770c;

    /* renamed from: d  reason: collision with root package name */
    public final o f7771d;

    /* renamed from: e  reason: collision with root package name */
    public Task<k> f7772e = null;

    /* loaded from: classes2.dex */
    public static class b<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        public final CountDownLatch a = new CountDownLatch(1);

        public b(a aVar) {
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.a.countDown();
        }
    }

    public j(ExecutorService executorService, o oVar) {
        this.f7770c = executorService;
        this.f7771d = oVar;
    }

    public static <TResult> TResult a(Task<TResult> task, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        b bVar = new b(null);
        Executor executor = f7769b;
        task.addOnSuccessListener(executor, bVar);
        task.addOnFailureListener(executor, bVar);
        task.addOnCanceledListener(executor, bVar);
        if (bVar.a.await(j2, timeUnit)) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            throw new ExecutionException(task.getException());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public synchronized Task<k> b() {
        Task<k> task = this.f7772e;
        if (task == null || (task.isComplete() && !this.f7772e.isSuccessful())) {
            ExecutorService executorService = this.f7770c;
            final o oVar = this.f7771d;
            Objects.requireNonNull(oVar);
            this.f7772e = Tasks.call(executorService, new Callable() { // from class: e.d.d.y.r.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    FileInputStream fileInputStream;
                    k kVar;
                    o oVar2 = o.this;
                    synchronized (oVar2) {
                        FileInputStream fileInputStream2 = null;
                        kVar = null;
                        try {
                            fileInputStream = oVar2.f7800b.openFileInput(oVar2.f7801c);
                        } catch (FileNotFoundException | JSONException unused) {
                            fileInputStream = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            int available = fileInputStream.available();
                            byte[] bArr = new byte[available];
                            fileInputStream.read(bArr, 0, available);
                            kVar = k.a(new JSONObject(new String(bArr, "UTF-8")));
                            fileInputStream.close();
                        } catch (FileNotFoundException | JSONException unused2) {
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return kVar;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            throw th;
                        }
                    }
                    return kVar;
                }
            });
        }
        return this.f7772e;
    }

    public Task<k> c(final k kVar) {
        return Tasks.call(this.f7770c, new Callable() { // from class: e.d.d.y.r.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                j jVar = j.this;
                k kVar2 = kVar;
                o oVar = jVar.f7771d;
                synchronized (oVar) {
                    FileOutputStream openFileOutput = oVar.f7800b.openFileOutput(oVar.f7801c, 0);
                    openFileOutput.write(kVar2.toString().getBytes("UTF-8"));
                    openFileOutput.close();
                }
                return null;
            }
        }).onSuccessTask(this.f7770c, new SuccessContinuation() { // from class: e.d.d.y.r.b
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                j jVar = j.this;
                boolean z = r2;
                k kVar2 = kVar;
                Void r4 = (Void) obj;
                Objects.requireNonNull(jVar);
                if (z) {
                    synchronized (jVar) {
                        jVar.f7772e = Tasks.forResult(kVar2);
                    }
                }
                return Tasks.forResult(kVar2);
            }
        });
    }
}
