package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.amazon.aps.iva.x.h;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.zzj;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.firebase:firebase-iid@@20.1.6 */
/* loaded from: classes4.dex */
final class zzau {
    private static int zza;
    private static PendingIntent zzb;
    private final Context zzd;
    private final zzao zze;
    private Messenger zzg;
    private zzj zzh;
    private final h<String, TaskCompletionSource<Bundle>> zzc = new h<>();
    private Messenger zzf = new Messenger(new zzax(this, Looper.getMainLooper()));

    public zzau(Context context, zzao zzaoVar) {
        this.zzd = context;
        this.zze = zzaoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzj.zza());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzj) {
                        this.zzh = (zzj) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.zzg = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf = String.valueOf(action);
                        if (valueOf.length() != 0) {
                            "Unexpected response action: ".concat(valueOf);
                            return;
                        }
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
                        new StringBuilder(String.valueOf(intent2.getExtras()).length() + 49);
                        return;
                    }
                    if (Log.isLoggable("FirebaseInstanceId", 3) && stringExtra2.length() != 0) {
                        "Received InstanceID error ".concat(stringExtra2);
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            zza(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        } else if (stringExtra2.length() != 0) {
                            "Unexpected structured response ".concat(stringExtra2);
                            return;
                        } else {
                            return;
                        }
                    }
                    synchronized (this.zzc) {
                        int i = 0;
                        while (true) {
                            h<String, TaskCompletionSource<Bundle>> hVar = this.zzc;
                            if (i < hVar.d) {
                                zza(hVar.j(i), intent2.getExtras());
                                i++;
                            }
                        }
                    }
                    return;
                }
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (!matcher.matches()) {
                    if (!Log.isLoggable("FirebaseInstanceId", 3) || stringExtra.length() == 0) {
                        return;
                    }
                    "Unexpected response string: ".concat(stringExtra);
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                zza(group, extras);
            }
        }
    }

    private final Bundle zzb(Bundle bundle) throws IOException {
        Bundle zzc = zzc(bundle);
        if (zzc != null && zzc.containsKey("google.messenger")) {
            Bundle zzc2 = zzc(bundle);
            if (zzc2 != null && zzc2.containsKey("google.messenger")) {
                return null;
            }
            return zzc2;
        }
        return zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.os.Bundle zzc(android.os.Bundle r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzau.zzc(android.os.Bundle):android.os.Bundle");
    }

    private static synchronized void zza(Context context, Intent intent) {
        synchronized (zzau.class) {
            if (zzb == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                zzb = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", zzb);
        }
    }

    private final void zza(String str, Bundle bundle) {
        synchronized (this.zzc) {
            TaskCompletionSource<Bundle> remove = this.zzc.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Missing callback for ".concat(valueOf);
                }
                return;
            }
            remove.setResult(bundle);
        }
    }

    public final Bundle zza(Bundle bundle) throws IOException {
        if (this.zze.zze() >= 12000000) {
            try {
                return (Bundle) Tasks.await(zzab.zza(this.zzd).zzb(1, bundle));
            } catch (InterruptedException | ExecutionException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    new StringBuilder(String.valueOf(e).length() + 22);
                }
                if ((e.getCause() instanceof zzam) && ((zzam) e.getCause()).zza() == 4) {
                    return zzb(bundle);
                }
                return null;
            }
        }
        return zzb(bundle);
    }

    private static synchronized String zza() {
        String num;
        synchronized (zzau.class) {
            int i = zza;
            zza = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }
}
