package e.d.d.m.j.p;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e.d.d.m.j.j.l;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class d implements SuccessContinuation<Void, Void> {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task<Void> then(Void r12) throws Exception {
        JSONObject jSONObject;
        Exception e2;
        FileWriter fileWriter;
        e eVar = this.a;
        e.d.d.m.j.p.k.a aVar = eVar.f7520f;
        e.d.d.m.j.p.j.f fVar = eVar.f7516b;
        Objects.requireNonNull(aVar);
        FileWriter fileWriter2 = null;
        try {
            Map<String, String> c2 = aVar.c(fVar);
            e.d.d.m.j.m.b bVar = aVar.f7536b;
            String str = aVar.a;
            Objects.requireNonNull(bVar);
            e.d.d.m.j.m.a aVar2 = new e.d.d.m.j.m.a(str, c2);
            aVar2.f7498c.put("User-Agent", "Crashlytics Android SDK/18.2.8");
            aVar2.f7498c.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            aVar.a(aVar2, fVar);
            e.d.d.m.j.f fVar2 = e.d.d.m.j.f.a;
            fVar2.a(3);
            String str2 = "Settings query params were: " + c2;
            fVar2.a(2);
            jSONObject = aVar.d(aVar2.b());
        } catch (IOException e3) {
            if (e.d.d.m.j.f.a.a(6)) {
                Log.e("FirebaseCrashlytics", "Settings request failed.", e3);
            }
            jSONObject = null;
        }
        if (jSONObject != null) {
            e.d.d.m.j.p.j.e a = this.a.f7517c.a(jSONObject);
            a aVar3 = this.a.f7519e;
            long j2 = a.f7527d;
            Objects.requireNonNull(aVar3);
            e.d.d.m.j.f.a.a(2);
            try {
                jSONObject.put("expires_at", j2);
                fileWriter = new FileWriter(aVar3.a);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e4) {
                        e2 = e4;
                        try {
                            if (e.d.d.m.j.f.a.a(6)) {
                                Log.e("FirebaseCrashlytics", "Failed to cache settings", e2);
                            }
                            l.a(fileWriter, "Failed to close settings writer.");
                            Objects.requireNonNull(this.a);
                            e.d.d.m.j.f fVar3 = e.d.d.m.j.f.a;
                            jSONObject.toString();
                            fVar3.a(3);
                            e eVar2 = this.a;
                            String str3 = eVar2.f7516b.f7532f;
                            SharedPreferences.Editor edit = l.h(eVar2.a).edit();
                            edit.putString("existing_instance_identifier", str3);
                            edit.apply();
                            this.a.f7522h.set(a);
                            this.a.f7523i.get().trySetResult(a.a);
                            TaskCompletionSource<e.d.d.m.j.p.j.a> taskCompletionSource = new TaskCompletionSource<>();
                            taskCompletionSource.trySetResult(a.a);
                            this.a.f7523i.set(taskCompletionSource);
                            return Tasks.forResult(null);
                        } catch (Throwable th) {
                            th = th;
                            fileWriter2 = fileWriter;
                            fileWriter = fileWriter2;
                            l.a(fileWriter, "Failed to close settings writer.");
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    l.a(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e5) {
                e2 = e5;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                fileWriter = fileWriter2;
                l.a(fileWriter, "Failed to close settings writer.");
                throw th;
            }
            l.a(fileWriter, "Failed to close settings writer.");
            Objects.requireNonNull(this.a);
            e.d.d.m.j.f fVar32 = e.d.d.m.j.f.a;
            jSONObject.toString();
            fVar32.a(3);
            e eVar22 = this.a;
            String str32 = eVar22.f7516b.f7532f;
            SharedPreferences.Editor edit2 = l.h(eVar22.a).edit();
            edit2.putString("existing_instance_identifier", str32);
            edit2.apply();
            this.a.f7522h.set(a);
            this.a.f7523i.get().trySetResult(a.a);
            TaskCompletionSource<e.d.d.m.j.p.j.a> taskCompletionSource2 = new TaskCompletionSource<>();
            taskCompletionSource2.trySetResult(a.a);
            this.a.f7523i.set(taskCompletionSource2);
        }
        return Tasks.forResult(null);
    }
}
