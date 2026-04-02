package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.zzl;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
final class q {
    private static int a = 0;
    private static PendingIntent b;
    private final Context d;
    private final zzan e;
    private Messenger g;
    private zzl h;
    private final SimpleArrayMap<String, TaskCompletionSource<Bundle>> c = new SimpleArrayMap<>();
    private Messenger f = new Messenger(new s(this, Looper.getMainLooper()));

    public q(Context context, zzan zzanVar) {
        this.d = context;
        this.e = zzanVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Message message) {
        if (message != null && (message.obj instanceof Intent)) {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(new zzl.zza());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof zzl) {
                    this.h = (zzl) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    this.g = (Messenger) parcelableExtra;
                }
            }
            Intent intent2 = (Intent) message.obj;
            String action = intent2.getAction();
            if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(action);
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
                    return;
                }
                return;
            }
            String stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf2 = String.valueOf(intent2.getExtras());
                    Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf2).length() + 49).append("Unexpected response, no error or registration id ").append(valueOf2).toString());
                    return;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf3 = String.valueOf(stringExtra2);
                    Log.d("FirebaseInstanceId", valueOf3.length() != 0 ? "Received InstanceID error ".concat(valueOf3) : new String("Received InstanceID error "));
                }
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (split.length <= 2 || !"ID".equals(split[1])) {
                        String valueOf4 = String.valueOf(stringExtra2);
                        Log.w("FirebaseInstanceId", valueOf4.length() != 0 ? "Unexpected structured response ".concat(valueOf4) : new String("Unexpected structured response "));
                        return;
                    }
                    String str = split[2];
                    String str2 = split[3];
                    if (str2.startsWith(":")) {
                        str2 = str2.substring(1);
                    }
                    a(str, intent2.putExtra("error", str2).getExtras());
                    return;
                }
                synchronized (this.c) {
                    for (int i = 0; i < this.c.size(); i++) {
                        a(this.c.keyAt(i), intent2.getExtras());
                    }
                }
                return;
            }
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (!matcher.matches()) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf5 = String.valueOf(stringExtra);
                    Log.d("FirebaseInstanceId", valueOf5.length() != 0 ? "Unexpected response string: ".concat(valueOf5) : new String("Unexpected response string: "));
                    return;
                }
                return;
            }
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            Bundle extras = intent2.getExtras();
            extras.putString("registration_id", group2);
            a(group, extras);
            return;
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    private static synchronized void a(Context context, Intent intent) {
        synchronized (q.class) {
            if (b == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                b = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", b);
        }
    }

    private final void a(String str, Bundle bundle) {
        synchronized (this.c) {
            TaskCompletionSource<Bundle> remove = this.c.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.setResult(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle) {
        if (this.e.zzaf() >= 12000000) {
            try {
                return (Bundle) Tasks.await(zzab.zzc(this.d).zzb(1, bundle));
            } catch (InterruptedException | ExecutionException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e);
                    Log.d("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 22).append("Error making request: ").append(valueOf).toString());
                }
                if ((e.getCause() instanceof zzal) && ((zzal) e.getCause()).getErrorCode() == 4) {
                    return b(bundle);
                }
                return null;
            }
        }
        return b(bundle);
    }

    private final Bundle b(Bundle bundle) {
        Bundle c = c(bundle);
        if (c != null && c.containsKey("google.messenger")) {
            Bundle c2 = c(bundle);
            if (c2 != null && c2.containsKey("google.messenger")) {
                return null;
            }
            return c2;
        }
        return c;
    }

    private static synchronized String a() {
        String num;
        synchronized (q.class) {
            int i = a;
            a = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.os.Bundle c(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.q.c(android.os.Bundle):android.os.Bundle");
    }
}
