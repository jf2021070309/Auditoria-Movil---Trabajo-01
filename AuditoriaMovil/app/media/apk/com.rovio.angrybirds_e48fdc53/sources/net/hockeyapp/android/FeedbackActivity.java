package net.hockeyapp.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import net.hockeyapp.android.adapters.MessagesAdapter;
import net.hockeyapp.android.objects.ErrorObject;
import net.hockeyapp.android.objects.FeedbackMessage;
import net.hockeyapp.android.objects.FeedbackResponse;
import net.hockeyapp.android.objects.FeedbackUserDataElement;
import net.hockeyapp.android.tasks.ParseFeedbackTask;
import net.hockeyapp.android.tasks.SendFeedbackTask;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.PrefsUtil;
import net.hockeyapp.android.utils.Util;
import net.hockeyapp.android.views.AttachmentListView;
import net.hockeyapp.android.views.AttachmentView;
/* loaded from: classes4.dex */
public class FeedbackActivity extends Activity implements View.OnClickListener, View.OnFocusChangeListener {
    public static final String EXTRA_FORCE_NEW_THREAD = "forceNewThread";
    public static final String EXTRA_INITIAL_ATTACHMENTS = "initialAttachments";
    public static final String EXTRA_INITIAL_USER_EMAIL = "initialUserEmail";
    public static final String EXTRA_INITIAL_USER_NAME = "initialUserName";
    public static final String EXTRA_URL = "url";
    private boolean A;
    private String B;
    private String a;
    private String b;
    private Context c;
    private TextView d;
    private EditText e;
    private EditText f;
    private EditText g;
    private EditText h;
    private Button i;
    private Button j;
    private Button k;
    private Button l;
    private ScrollView m;
    private LinearLayout n;
    private ListView o;
    private SendFeedbackTask p;
    private Handler q;
    private ParseFeedbackTask r;
    private Handler s;
    private List<Uri> t;
    private String u;
    private ErrorObject v;
    private MessagesAdapter w;
    private ArrayList<FeedbackMessage> x;
    private boolean y;
    private boolean z;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayoutView());
        setTitle(getString(R.string.hockeyapp_feedback_title));
        this.c = this;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.u = extras.getString("url");
            this.z = extras.getBoolean(EXTRA_FORCE_NEW_THREAD);
            this.a = extras.getString(EXTRA_INITIAL_USER_NAME);
            this.b = extras.getString(EXTRA_INITIAL_USER_EMAIL);
            Parcelable[] parcelableArray = extras.getParcelableArray(EXTRA_INITIAL_ATTACHMENTS);
            if (parcelableArray != null) {
                this.t = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    this.t.add((Uri) parcelable);
                }
            }
        }
        if (bundle != null) {
            this.A = bundle.getBoolean("feedbackViewInitialized");
            this.y = bundle.getBoolean("inSendFeedback");
        } else {
            this.y = false;
            this.A = false;
        }
        ((NotificationManager) getSystemService("notification")).cancel(2);
        e();
        f();
        a();
        c();
    }

    private void a() {
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        if (lastNonConfigurationInstance != null && (lastNonConfigurationInstance instanceof SendFeedbackTask)) {
            this.p = (SendFeedbackTask) lastNonConfigurationInstance;
            this.p.setHandler(this.q);
        }
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.wrapper_attachments);
            Iterator it = bundle.getParcelableArrayList("attachments").iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!this.t.contains(uri)) {
                    viewGroup.addView(new AttachmentView((Context) this, viewGroup, uri, true));
                }
            }
            this.A = bundle.getBoolean("feedbackViewInitialized");
        }
        super.onRestoreInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelableArrayList("attachments", ((AttachmentListView) findViewById(R.id.wrapper_attachments)).getAttachments());
        bundle.putBoolean("feedbackViewInitialized", this.A);
        bundle.putBoolean("inSendFeedback", this.y);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.p != null) {
            this.p.attach(this);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (this.p != null) {
            this.p.detach();
        }
    }

    @Override // android.app.Activity
    public Object onRetainNonConfigurationInstance() {
        if (this.p != null) {
            this.p.detach();
        }
        return this.p;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.y) {
                this.y = false;
                c();
            } else {
                finish();
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.button_send) {
            h();
        } else if (id == R.id.button_attachment) {
            if (((ViewGroup) findViewById(R.id.wrapper_attachments)).getChildCount() < 3) {
                openContextMenu(view);
            } else {
                Toast.makeText(this, String.format(getString(R.string.hockeyapp_feedback_max_attachments_allowed), 3), 0).show();
            }
        } else if (id == R.id.button_add_response) {
            this.y = true;
            configureFeedbackView(false);
        } else if (id == R.id.button_refresh) {
            a(this.u, null, null, null, null, null, PrefsUtil.getInstance().getFeedbackTokenFromPrefs(this.c), this.q, true);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        if (z) {
            if (view instanceof EditText) {
                a(view);
            } else if ((view instanceof Button) || (view instanceof ImageButton)) {
                d();
            }
        }
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 2, 0, getString(R.string.hockeyapp_feedback_attach_file));
        contextMenu.add(0, 1, 0, getString(R.string.hockeyapp_feedback_attach_picture));
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 1:
            case 2:
                return a(menuItem.getItemId());
            default:
                return super.onContextItemSelected(menuItem);
        }
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 0:
                return new AlertDialog.Builder(this).setMessage(getString(R.string.hockeyapp_dialog_error_message)).setCancelable(false).setTitle(getString(R.string.hockeyapp_dialog_error_title)).setIcon(17301543).setPositiveButton(getString(R.string.hockeyapp_dialog_positive_button), new DialogInterface.OnClickListener() { // from class: net.hockeyapp.android.FeedbackActivity.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        FeedbackActivity.this.v = null;
                        dialogInterface.cancel();
                    }
                }).create();
            default:
                return null;
        }
    }

    @Override // android.app.Activity
    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case 0:
                AlertDialog alertDialog = (AlertDialog) dialog;
                if (this.v != null) {
                    alertDialog.setMessage(this.v.getMessage());
                    return;
                } else {
                    alertDialog.setMessage(getString(R.string.hockeyapp_feedback_generic_error));
                    return;
                }
            default:
                return;
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        if (i2 == -1) {
            if (i == 2) {
                Uri data = intent.getData();
                if (data != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById(R.id.wrapper_attachments);
                    viewGroup.addView(new AttachmentView((Context) this, viewGroup, data, true));
                    Util.announceForAccessibility(viewGroup, getString(R.string.hockeyapp_feedback_attachment_added));
                }
            } else if (i == 1) {
                Uri data2 = intent.getData();
                if (data2 != null) {
                    try {
                        Intent intent2 = new Intent(this, PaintActivity.class);
                        intent2.putExtra(PaintActivity.EXTRA_IMAGE_URI, data2);
                        startActivityForResult(intent2, 3);
                    } catch (ActivityNotFoundException e) {
                        HockeyLog.error("HockeyApp", "Paint activity not declared!", e);
                    }
                }
            } else if (i == 3 && (uri = (Uri) intent.getParcelableExtra(PaintActivity.EXTRA_IMAGE_URI)) != null) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.wrapper_attachments);
                viewGroup2.addView(new AttachmentView((Context) this, viewGroup2, uri, true));
                Util.announceForAccessibility(viewGroup2, getString(R.string.hockeyapp_feedback_attachment_added));
            }
        }
    }

    public View getLayoutView() {
        return getLayoutInflater().inflate(R.layout.hockeyapp_activity_feedback, (ViewGroup) null);
    }

    public void enableDisableSendFeedbackButton(boolean z) {
        if (this.i != null) {
            this.i.setEnabled(z);
        }
    }

    protected void configureFeedbackView(boolean z) {
        this.m = (ScrollView) findViewById(R.id.wrapper_feedback_scroll);
        this.n = (LinearLayout) findViewById(R.id.wrapper_messages);
        this.o = (ListView) findViewById(R.id.list_feedback_messages);
        if (z) {
            this.n.setVisibility(0);
            this.m.setVisibility(8);
            this.d = (TextView) findViewById(R.id.label_last_updated);
            this.d.setVisibility(4);
            this.k = (Button) findViewById(R.id.button_add_response);
            this.k.setOnClickListener(this);
            this.k.setOnFocusChangeListener(this);
            this.l = (Button) findViewById(R.id.button_refresh);
            this.l.setOnClickListener(this);
            this.l.setOnFocusChangeListener(this);
            return;
        }
        this.n.setVisibility(8);
        this.m.setVisibility(0);
        this.e = (EditText) findViewById(R.id.input_name);
        this.e.setOnFocusChangeListener(this);
        this.f = (EditText) findViewById(R.id.input_email);
        this.f.setOnFocusChangeListener(this);
        this.g = (EditText) findViewById(R.id.input_subject);
        this.g.setOnFocusChangeListener(this);
        this.h = (EditText) findViewById(R.id.input_message);
        this.h.setOnFocusChangeListener(this);
        b();
        if (!this.A) {
            String nameEmailFromPrefs = PrefsUtil.getInstance().getNameEmailFromPrefs(this.c);
            if (nameEmailFromPrefs != null) {
                String[] split = nameEmailFromPrefs.split("\\|");
                if (split != null && split.length >= 2) {
                    this.e.setText(split[0]);
                    this.f.setText(split[1]);
                    if (!this.z && split.length >= 3) {
                        this.g.setText(split[2]);
                        this.h.requestFocus();
                    } else {
                        this.g.requestFocus();
                    }
                }
            } else {
                this.e.setText(this.a);
                this.f.setText(this.b);
                this.g.setText("");
                if (TextUtils.isEmpty(this.a)) {
                    this.e.requestFocus();
                } else if (TextUtils.isEmpty(this.b)) {
                    this.f.requestFocus();
                } else {
                    this.g.requestFocus();
                }
            }
            this.A = true;
        }
        this.e.setVisibility(FeedbackManager.getRequireUserName() == FeedbackUserDataElement.DONT_SHOW ? 8 : 0);
        this.f.setVisibility(FeedbackManager.getRequireUserEmail() == FeedbackUserDataElement.DONT_SHOW ? 8 : 0);
        this.h.setText("");
        if ((!this.z || this.y) && PrefsUtil.getInstance().getFeedbackTokenFromPrefs(this.c) != null) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.wrapper_attachments);
        viewGroup.removeAllViews();
        if (this.t != null) {
            for (Uri uri : this.t) {
                viewGroup.addView(new AttachmentView((Context) this, viewGroup, uri, true));
            }
        }
        this.j = (Button) findViewById(R.id.button_attachment);
        this.j.setOnClickListener(this);
        this.j.setOnFocusChangeListener(this);
        registerForContextMenu(this.j);
        this.i = (Button) findViewById(R.id.button_send);
        this.i.setOnClickListener(this);
        this.j.setOnFocusChangeListener(this);
    }

    protected void onSendFeedbackResult(boolean z) {
    }

    private boolean a(int i) {
        if (i == 2) {
            Intent intent = new Intent();
            intent.setType("*/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            startActivityForResult(Intent.createChooser(intent, getString(R.string.hockeyapp_feedback_select_file)), 2);
            return true;
        } else if (i == 1) {
            Intent intent2 = new Intent();
            intent2.setType("image/*");
            intent2.setAction("android.intent.action.GET_CONTENT");
            startActivityForResult(Intent.createChooser(intent2, getString(R.string.hockeyapp_feedback_select_picture)), 1);
            return true;
        } else {
            return false;
        }
    }

    private void b() {
        if (FeedbackManager.getRequireUserName() == FeedbackUserDataElement.REQUIRED) {
            this.e.setHint(getString(R.string.hockeyapp_feedback_name_hint_required));
        }
        if (FeedbackManager.getRequireUserEmail() == FeedbackUserDataElement.REQUIRED) {
            this.f.setHint(getString(R.string.hockeyapp_feedback_email_hint_required));
        }
        this.g.setHint(getString(R.string.hockeyapp_feedback_subject_hint_required));
        this.h.setHint(getString(R.string.hockeyapp_feedback_message_hint_required));
    }

    private void c() {
        if (!this.z || this.y) {
            this.B = PrefsUtil.getInstance().getFeedbackTokenFromPrefs(this);
        }
        if (this.B == null || this.y) {
            configureFeedbackView(false);
            return;
        }
        configureFeedbackView(true);
        a(this.u, null, null, null, null, null, this.B, this.q, true);
    }

    private void a(String str, String str2) {
        this.r = new ParseFeedbackTask(this, str, this.s, str2);
    }

    private void a(View view) {
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(view, 1);
    }

    private void d() {
        if (this.h != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.h.getWindowToken(), 0);
        }
    }

    private void e() {
        this.q = new a(this);
    }

    private void f() {
        this.s = new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final FeedbackResponse feedbackResponse) {
        runOnUiThread(new Runnable() { // from class: net.hockeyapp.android.FeedbackActivity.2
            @Override // java.lang.Runnable
            public void run() {
                FeedbackActivity.this.configureFeedbackView(true);
                if (feedbackResponse != null && feedbackResponse.getFeedback() != null && feedbackResponse.getFeedback().getMessages() != null && feedbackResponse.getFeedback().getMessages().size() > 0) {
                    FeedbackActivity.this.x = feedbackResponse.getFeedback().getMessages();
                    Collections.reverse(FeedbackActivity.this.x);
                    try {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                        FeedbackActivity.this.d.setText(String.format(FeedbackActivity.this.getString(R.string.hockeyapp_feedback_last_updated_text), DateFormat.getDateTimeInstance(3, 3).format(simpleDateFormat.parse(((FeedbackMessage) FeedbackActivity.this.x.get(0)).getCreatedAt()))));
                        FeedbackActivity.this.d.setContentDescription(FeedbackActivity.this.d.getText());
                        FeedbackActivity.this.d.setVisibility(0);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    if (FeedbackActivity.this.w == null) {
                        FeedbackActivity.this.w = new MessagesAdapter(FeedbackActivity.this.c, FeedbackActivity.this.x);
                    } else {
                        FeedbackActivity.this.w.clear();
                        Iterator it = FeedbackActivity.this.x.iterator();
                        while (it.hasNext()) {
                            FeedbackActivity.this.w.add((FeedbackMessage) it.next());
                        }
                        FeedbackActivity.this.w.notifyDataSetChanged();
                    }
                    FeedbackActivity.this.o.setAdapter((ListAdapter) FeedbackActivity.this.w);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        runOnUiThread(new Runnable() { // from class: net.hockeyapp.android.FeedbackActivity.3
            @Override // java.lang.Runnable
            public void run() {
                PrefsUtil.getInstance().saveFeedbackTokenToPrefs(FeedbackActivity.this, null);
                FeedbackActivity.this.getSharedPreferences(ParseFeedbackTask.PREFERENCES_NAME, 0).edit().remove(ParseFeedbackTask.ID_LAST_MESSAGE_SEND).remove(ParseFeedbackTask.ID_LAST_MESSAGE_PROCESSED).apply();
                FeedbackActivity.this.configureFeedbackView(false);
            }
        });
    }

    private void h() {
        if (!Util.isConnectedToNetwork(this)) {
            Toast.makeText(this, R.string.hockeyapp_error_no_network_message, 1).show();
            return;
        }
        enableDisableSendFeedbackButton(false);
        String feedbackTokenFromPrefs = (!this.z || this.y) ? PrefsUtil.getInstance().getFeedbackTokenFromPrefs(this.c) : null;
        String trim = this.e.getText().toString().trim();
        String trim2 = this.f.getText().toString().trim();
        String trim3 = this.g.getText().toString().trim();
        String trim4 = this.h.getText().toString().trim();
        if (TextUtils.isEmpty(trim3)) {
            this.g.setVisibility(0);
            a(this.g, R.string.hockeyapp_feedback_validate_subject_error);
        } else if (FeedbackManager.getRequireUserName() == FeedbackUserDataElement.REQUIRED && TextUtils.isEmpty(trim)) {
            a(this.e, R.string.hockeyapp_feedback_validate_name_error);
        } else if (FeedbackManager.getRequireUserEmail() == FeedbackUserDataElement.REQUIRED && TextUtils.isEmpty(trim2)) {
            a(this.f, R.string.hockeyapp_feedback_validate_email_empty);
        } else if (TextUtils.isEmpty(trim4)) {
            a(this.h, R.string.hockeyapp_feedback_validate_text_error);
        } else if (FeedbackManager.getRequireUserEmail() == FeedbackUserDataElement.REQUIRED && !Util.isValidEmail(trim2)) {
            a(this.f, R.string.hockeyapp_feedback_validate_email_error);
        } else {
            PrefsUtil.getInstance().saveNameEmailSubjectToPrefs(this.c, trim, trim2, trim3);
            a(this.u, trim, trim2, trim3, trim4, ((AttachmentListView) findViewById(R.id.wrapper_attachments)).getAttachments(), feedbackTokenFromPrefs, this.q, false);
            d();
        }
    }

    private void a(final EditText editText, int i) {
        editText.setError(getString(i));
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: net.hockeyapp.android.FeedbackActivity.4
            @Override // java.lang.Runnable
            public void run() {
                editText.requestFocus();
            }
        });
        enableDisableSendFeedbackButton(true);
    }

    private void a(String str, String str2, String str3, String str4, String str5, List<Uri> list, String str6, Handler handler, boolean z) {
        this.p = new SendFeedbackTask(this.c, str, str2, str3, str4, str5, list, str6, handler, z);
        AsyncTaskUtils.execute(this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        a(str, str2);
        AsyncTaskUtils.execute(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a extends Handler {
        private final WeakReference<FeedbackActivity> a;

        public a(FeedbackActivity feedbackActivity) {
            this.a = new WeakReference<>(feedbackActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z = false;
            ErrorObject errorObject = new ErrorObject();
            final FeedbackActivity feedbackActivity = this.a.get();
            if (feedbackActivity != null) {
                if (message != null && message.getData() != null) {
                    Bundle data = message.getData();
                    String string = data.getString(SendFeedbackTask.BUNDLE_FEEDBACK_RESPONSE);
                    String string2 = data.getString(SendFeedbackTask.BUNDLE_FEEDBACK_STATUS);
                    String string3 = data.getString(SendFeedbackTask.BUNDLE_REQUEST_TYPE);
                    if ("send".equals(string3) && (string == null || Integer.parseInt(string2) != 201)) {
                        errorObject.setMessage(feedbackActivity.getString(R.string.hockeyapp_feedback_send_generic_error));
                    } else if ("fetch".equals(string3) && string2 != null && (Integer.parseInt(string2) == 404 || Integer.parseInt(string2) == 422)) {
                        feedbackActivity.g();
                        z = true;
                    } else if (string != null) {
                        feedbackActivity.b(string, string3);
                        if ("send".equals(string3)) {
                            feedbackActivity.runOnUiThread(new Runnable() { // from class: net.hockeyapp.android.FeedbackActivity.a.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Toast.makeText(feedbackActivity, R.string.hockeyapp_feedback_sent_toast, 1).show();
                                }
                            });
                        }
                        z = true;
                    } else {
                        errorObject.setMessage(feedbackActivity.getString(R.string.hockeyapp_feedback_send_network_error));
                    }
                } else {
                    errorObject.setMessage(feedbackActivity.getString(R.string.hockeyapp_feedback_send_generic_error));
                }
                feedbackActivity.v = errorObject;
                if (!z) {
                    feedbackActivity.runOnUiThread(new Runnable() { // from class: net.hockeyapp.android.FeedbackActivity.a.2
                        @Override // java.lang.Runnable
                        public void run() {
                            feedbackActivity.enableDisableSendFeedbackButton(true);
                            feedbackActivity.showDialog(0);
                        }
                    });
                }
                feedbackActivity.onSendFeedbackResult(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class b extends Handler {
        private final WeakReference<FeedbackActivity> a;

        public b(FeedbackActivity feedbackActivity) {
            this.a = new WeakReference<>(feedbackActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z;
            FeedbackResponse feedbackResponse;
            final FeedbackActivity feedbackActivity = this.a.get();
            if (feedbackActivity != null) {
                feedbackActivity.v = new ErrorObject();
                if (message == null || message.getData() == null || (feedbackResponse = (FeedbackResponse) message.getData().getSerializable(ParseFeedbackTask.BUNDLE_PARSE_FEEDBACK_RESPONSE)) == null) {
                    z = false;
                } else if (!feedbackResponse.getStatus().equalsIgnoreCase("success")) {
                    z = false;
                } else if (feedbackResponse.getToken() != null) {
                    PrefsUtil.getInstance().saveFeedbackTokenToPrefs(feedbackActivity, feedbackResponse.getToken());
                    feedbackActivity.a(feedbackResponse);
                    feedbackActivity.y = false;
                    z = true;
                } else {
                    z = true;
                }
                if (!z) {
                    feedbackActivity.runOnUiThread(new Runnable() { // from class: net.hockeyapp.android.FeedbackActivity.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            feedbackActivity.showDialog(0);
                        }
                    });
                }
                feedbackActivity.enableDisableSendFeedbackButton(true);
            }
        }
    }
}
