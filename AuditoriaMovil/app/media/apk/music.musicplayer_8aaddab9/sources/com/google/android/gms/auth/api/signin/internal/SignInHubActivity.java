package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import c.m.b.o;
import c.q.a.a;
import c.q.a.b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Modifier;
import java.util.Objects;
@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends o {
    private static boolean zba;
    private boolean zbb = false;
    private SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private Intent zbf;

    private final void zbc() {
        a supportLoaderManager = getSupportLoaderManager();
        zbw zbwVar = new zbw(this, null);
        b bVar = (b) supportLoaderManager;
        if (bVar.f2477b.f2485e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        b.a d2 = bVar.f2477b.f2484d.d(0, null);
        if (d2 == null) {
            try {
                bVar.f2477b.f2485e = true;
                c.q.b.b onCreateLoader = zbwVar.onCreateLoader(0, null);
                if (onCreateLoader == null) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
                }
                if (onCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                }
                b.a aVar = new b.a(0, null, onCreateLoader, null);
                bVar.f2477b.f2484d.f(0, aVar);
                bVar.f2477b.f2485e = false;
                aVar.m(bVar.a, zbwVar);
            } catch (Throwable th) {
                bVar.f2477b.f2485e = false;
                throw th;
            }
        } else {
            d2.m(bVar.a, zbwVar);
        }
        zba = false;
    }

    private final void zbd(int i2) {
        Status status = new Status(i2);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zba = false;
    }

    private final void zbe(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.zbc);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.zbb = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            zbd(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // c.m.b.o, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (this.zbb) {
            return;
        }
        setResult(0);
        if (i2 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
            if (signInAccount != null && signInAccount.zba() != null) {
                GoogleSignInAccount zba2 = signInAccount.zba();
                zbn zbc = zbn.zbc(this);
                GoogleSignInOptions zba3 = this.zbc.zba();
                Objects.requireNonNull(zba2);
                zbc.zbe(zba3, zba2);
                intent.removeExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                intent.putExtra("googleSignInAccount", zba2);
                this.zbd = true;
                this.zbe = i3;
                this.zbf = intent;
                zbc();
                return;
            } else if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                }
                zbd(intExtra);
                return;
            }
        }
        zbd(8);
    }

    @Override // c.m.b.o, androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
        } else if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
        } else {
            Bundle bundleExtra = intent.getBundleExtra("config");
            Objects.requireNonNull(bundleExtra);
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.zbc = signInConfiguration;
            if (bundle == null) {
                if (zba) {
                    setResult(0);
                    zbd(GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
                    return;
                }
                zba = true;
                zbe(action);
                return;
            }
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.zbd = z;
            if (z) {
                this.zbe = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                Objects.requireNonNull(intent2);
                this.zbf = intent2;
                zbc();
            }
        }
    }

    @Override // c.m.b.o, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        zba = false;
    }

    @Override // androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            bundle.putInt("signInResultCode", this.zbe);
            bundle.putParcelable("signInResultData", this.zbf);
        }
    }
}
