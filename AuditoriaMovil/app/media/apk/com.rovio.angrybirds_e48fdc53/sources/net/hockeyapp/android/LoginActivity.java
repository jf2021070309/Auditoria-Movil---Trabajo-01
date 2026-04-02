package net.hockeyapp.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.appevents.AppEventsConstants;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import net.hockeyapp.android.tasks.LoginTask;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.Util;
/* loaded from: classes4.dex */
public class LoginActivity extends Activity {
    public static final String EXTRA_MODE = "mode";
    public static final String EXTRA_SECRET = "secret";
    public static final String EXTRA_URL = "url";
    private String a;
    private String b;
    private int c;
    private LoginTask d;
    private Handler e;
    private Button f;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hockeyapp_activity_login);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.a = extras.getString("url");
            this.b = extras.getString("secret");
            this.c = extras.getInt(EXTRA_MODE);
        }
        a();
        b();
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        if (lastNonConfigurationInstance != null) {
            this.d = (LoginTask) lastNonConfigurationInstance;
            this.d.attach(this, this.e);
        }
    }

    @Override // android.app.Activity
    public Object onRetainNonConfigurationInstance() {
        if (this.d != null) {
            this.d.detach();
        }
        return this.d;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (LoginManager.b != null) {
                LoginManager.b.onBack();
                return true;
            } else if (LoginManager.a != null) {
                Intent intent = new Intent(this, LoginManager.a);
                intent.setFlags(DownloadExpSwitchCode.BACK_BUGFIX_SIGBUS);
                intent.putExtra("net.hockeyapp.android.EXIT", true);
                startActivity(intent);
                return true;
            } else {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void a() {
        if (this.c == 1) {
            ((EditText) findViewById(R.id.input_password)).setVisibility(4);
        }
        ((TextView) findViewById(R.id.text_headline)).setText(this.c == 1 ? R.string.hockeyapp_login_headline_text_email_only : R.string.hockeyapp_login_headline_text);
        this.f = (Button) findViewById(R.id.button_login);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: net.hockeyapp.android.LoginActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LoginActivity.this.c();
            }
        });
    }

    private void b() {
        this.e = new a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        boolean z = false;
        if (!Util.isConnectedToNetwork(this)) {
            Toast.makeText(this, R.string.hockeyapp_error_no_network_message, 1).show();
            return;
        }
        String obj = ((EditText) findViewById(R.id.input_email)).getText().toString();
        String obj2 = ((EditText) findViewById(R.id.input_password)).getText().toString();
        HashMap hashMap = new HashMap();
        if (this.c == 1) {
            boolean z2 = !TextUtils.isEmpty(obj);
            hashMap.put("email", obj);
            hashMap.put("authcode", md5(this.b + obj));
            z = z2;
        } else if (this.c == 2) {
            if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(obj2)) {
                z = true;
            }
            hashMap.put("email", obj);
            hashMap.put("password", obj2);
        }
        if (z) {
            this.d = new LoginTask(this, this.e, this.a, this.c, hashMap);
            AsyncTaskUtils.execute(this.d);
            return;
        }
        Toast.makeText(this, getString(R.string.hockeyapp_login_missing_credentials_toast), 1).show();
    }

    public String md5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & com.flurry.android.Constants.UNKNOWN);
                while (hexString.length() < 2) {
                    hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a extends Handler {
        private final WeakReference<Activity> a;

        public a(Activity activity) {
            this.a = new WeakReference<>(activity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Activity activity = this.a.get();
            if (activity != null) {
                if (message.getData().getBoolean("success")) {
                    activity.finish();
                    if (LoginManager.b != null) {
                        LoginManager.b.onSuccess();
                        return;
                    }
                    return;
                }
                Toast.makeText(activity, "Login failed. Check your credentials.", 1).show();
            }
        }
    }
}
