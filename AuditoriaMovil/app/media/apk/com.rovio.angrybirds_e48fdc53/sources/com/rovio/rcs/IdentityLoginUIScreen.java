package com.rovio.rcs;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.rovio.fusion.Globals;
import java.util.ArrayList;
import java.util.Calendar;
/* loaded from: classes4.dex */
public class IdentityLoginUIScreen extends RelativeLayout implements AdapterView.OnItemSelectedListener {
    private static final String TAG = "IdentityLoginUIScreen : ";
    int a;
    int b;
    String c;
    private IdentityLoginUI d;
    private EditText e;
    private EditText f;
    private EditText g;
    private EditText h;
    private EditText i;
    private String j;
    private String k;
    private Spinner l;
    private Spinner m;
    private Spinner n;
    private String o;
    private ImageView p;
    private InputMethodManager q;

    /* loaded from: classes4.dex */
    public enum SkynestUIErrorType {
        ENTER_EMAIL_ADDRESS,
        ENTER_VALID_EMAIL_ADDRESS,
        EMAIL_ADDRESS_TAKEN,
        EMAIL_ADDRESS_NOT_FOUND,
        PASSWORD_CRITERIA,
        ENTER_PASSWORD,
        WRONG_PASSWORD,
        ERROR_NONE
    }

    /* loaded from: classes4.dex */
    public enum SkynestView {
        SHOW_LOGIN_VIEW,
        SHOW_REGISTRATION_VIEW,
        SHOW_REGISTER_ACCOUNT_VIEW_1,
        SHOW_REGISTER_ACCOUNT_VIEW_2,
        SHOW_REGISTER_ACCOUNT_SINGLE_PAGE_VIEW,
        SHOW_REGISTER_ACCOUNT_SUCCESS_VIEW,
        SHOW_REGISTER_ACCOUNT_FAILURE_VIEW,
        SHOW_FORGOT_PASSWORD_VIEW,
        SHOW_PASSWORD_RESET_SUCCESS_VIEW,
        SHOW_HELP_VIEW_1,
        SHOW_HELP_VIEW_2,
        SHOW_HELP_VIEW_3,
        SHOW_CONNECTING_TO_NETWORK_VIEW,
        SHOW_NO_NETWROK_CONNECTIVITY_VIEW,
        SHOW_ACCOUNT_NOT_VERIFIED_VIEW,
        SHOW_EMPTY_VIEW
    }

    /* loaded from: classes4.dex */
    public enum SkynestViewUIAction {
        SKYNEST_TOP_LEFT_BTN_CLICKED_ACTION,
        SKYNEST_TOP_RIGHT_BTN_CLICKED_ACTION,
        SKYNEST_BOTTOM_RIGHT_BTN_CLICKED_ACTION,
        SKYNEST_REGISTER_VIEW_1_CONTINUE_CLICKED_ACTION,
        SKYNEST_REGISTER_VIEW_2_CONTINUE_CLICKED_ACTION,
        SKYNEST_REGISTER_CLICKED_ACTION,
        SKYNEST_FORGOT_PASSWORD_CLICKED_ACTION,
        SKYNEST_ANIMATE_ACTION,
        SKYNEST_TERMS_OF_SERVICE_CLICKED_ACTION,
        SKYNEST_PRIVACY_POLICY_CLICKED_ACTION,
        SKYNEST_SIGN_IN_CLICKED_ACTION,
        SKYNEST_INVOKE_REGISTER_ACTION,
        SKYNEST_REGISTER_ACCOUNT_VIEW_1_ERROR_INVALID_DAY_ACTION,
        SKYNEST_REGISTER_ACCOUNT_VIEW_1_ERROR_INVALID_MONTH_ACTION,
        SKYNEST_REGISTER_ACCOUNT_VIEW_1_ERROR_INVALID_YEAR_MESSAGE_ACTION,
        SKYNEST_FORGOT_PASSWORD_VIEW_ERROR_EMAIL_ACTION,
        SKYNEST_REGISTER_ACCOUNT_VIEW_2_ERROR_EMAIL_ACTION,
        SKYNEST_REGISTER_ACCOUNT_VIEW_2_ERROR_PASSWORD_ACTION,
        SKYNEST_LOGIN_VIEW_ERROR_EMAIL_ACTION,
        SKYNEST_LOGIN_VIEW_ERROR_PASSWORD_ACTION,
        SKYNEST_LOGIN_VIEW_ENTER_PASSWORD_TIP_ACTION,
        SKYNEST_SHOW_TERMS_OF_SERVICE_ACTION,
        SKYNEST_SHOW_PRIVACY_POLICY_ACTION,
        SKYNEST_ACTION_NONE
    }

    public IdentityLoginUIScreen(Context context) {
        super(context);
        this.d = null;
        LayoutInflater.from(getContext()).inflate(getContext().getResources().getIdentifier("rovio_id_signin", "layout", getContext().getPackageName()), (ViewGroup) this, true);
        setOnClickListners();
        add_spinner_data_register_page1();
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        show_screen(SkynestView.SHOW_LOGIN_VIEW);
        setFontsForTexts(context);
        this.o = "testing@mymail.com";
        this.p = (ImageView) findViewWithTag("connecting_to_network_view_connectionDots_animation");
        this.a = Globals.getActivity().getResources().getIdentifier("rovio_id_ms_milkshake_textbox_error", "drawable", Globals.getActivity().getPackageName());
        this.b = Globals.getActivity().getResources().getIdentifier("rovio_id_ms_milkshake_textbox", "drawable", Globals.getActivity().getPackageName());
        this.c = "male";
        this.q = (InputMethodManager) Globals.getActivity().getSystemService("input_method");
        this.l.setOnItemSelectedListener(this);
        this.m.setOnItemSelectedListener(this);
        this.n.setOnItemSelectedListener(this);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int identifier = Globals.getActivity().getResources().getIdentifier("rovio_id_ms_milkshake_datemonthyear_button", "drawable", Globals.getActivity().getPackageName());
        this.l.setBackgroundResource(identifier);
        this.m.setBackgroundResource(identifier);
        this.n.setBackgroundResource(identifier);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setFontsForTexts(Context context) {
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/rovio_id_OpenSans-CondBold.ttf");
        ((TextView) findViewWithTag("rovio_passrequest_textviewtitle")).setTypeface(createFromAsset);
        ((TextView) findViewWithTag("rovio_signin_register_text_2page_screen2_registertext")).setTypeface(createFromAsset);
        ((TextView) findViewWithTag("rovio_signin_register_text_2page_registertext")).setTypeface(createFromAsset);
        ((Button) findViewWithTag("rovio_signin_panelregister_2page_screen1_continue")).setTypeface(createFromAsset);
        ((Button) findViewWithTag("rovio_signin_signinbtn")).setTypeface(createFromAsset);
        ((TextView) findViewWithTag("rovio_signin_register_account_failureSorryText")).setTypeface(createFromAsset);
        ((TextView) findViewWithTag("rovio_signin_register_account_success_header")).setTypeface(createFromAsset);
        ((TextView) findViewWithTag("rovio_passrequest_textviewtitle")).setTypeface(createFromAsset);
        ((TextView) findViewWithTag("rovio_signin_passrequest_successful_headerText")).setTypeface(createFromAsset);
        Typeface createFromAsset2 = Typeface.createFromAsset(context.getAssets(), "fonts/rovio_id_OpenSans-Regular.ttf");
        ((TextView) findViewWithTag("rovio_identity_dateofbirth_text")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_signin_panelregister_text_1")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_identity_termsofservice")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_identity_privacypolicy")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_identity_privacypolicy_3rdLine")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_signin_panelregister_2_genderselectorText")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_register_page_2_emailpopup")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_register_page_2_passwdpopup")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_signin_register_account_success_explaination")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_signin_register_account_success_verification")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_passrequest_question")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_signin_passrequest_successful_explaination")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_signin_panelhelp3_explaination")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_signin_panelhelp2_explaination")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_signin_panelhelp1_explaination")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_remindpassword_lnk")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_signin_page_emailpopup")).setTypeface(createFromAsset2);
        ((TextView) findViewWithTag("rovio_signin_page_passwdpopup")).setTypeface(createFromAsset2);
    }

    public String convertErrorTypeToMessage(SkynestUIErrorType skynestUIErrorType) {
        int i = 0;
        switch (skynestUIErrorType) {
            case ENTER_EMAIL_ADDRESS:
                i = Globals.getActivity().getResources().getIdentifier("rovio_id_validate_email_required", "string", Globals.getActivity().getPackageName());
                break;
            case ENTER_VALID_EMAIL_ADDRESS:
                i = Globals.getActivity().getResources().getIdentifier("rovio_id_validate_email_invalid", "string", Globals.getActivity().getPackageName());
                break;
            case EMAIL_ADDRESS_TAKEN:
                i = Globals.getActivity().getResources().getIdentifier("rovio_id_email_taken", "string", Globals.getActivity().getPackageName());
                break;
            case PASSWORD_CRITERIA:
                i = Globals.getActivity().getResources().getIdentifier("rovio_id_password_help_text", "string", Globals.getActivity().getPackageName());
                break;
            case ENTER_PASSWORD:
                i = Globals.getActivity().getResources().getIdentifier("rovio_id_validate_password_required", "string", Globals.getActivity().getPackageName());
                break;
            case WRONG_PASSWORD:
                i = Globals.getActivity().getResources().getIdentifier("rovio_id_wrong_password", "string", Globals.getActivity().getPackageName());
                break;
            case EMAIL_ADDRESS_NOT_FOUND:
                i = Globals.getActivity().getResources().getIdentifier("rovio_id_wrong_email", "string", Globals.getActivity().getPackageName());
                break;
            case ERROR_NONE:
                i = Globals.getActivity().getResources().getIdentifier("rovio_id_empty_text", "string", Globals.getActivity().getPackageName());
                break;
        }
        return Globals.getActivity().getResources().getString(i);
    }

    public void performMessageAction(SkynestViewUIAction skynestViewUIAction, SkynestUIErrorType skynestUIErrorType) {
        String convertErrorTypeToMessage = convertErrorTypeToMessage(skynestUIErrorType);
        Log.d(TAG, "performMessageAction : message =:" + convertErrorTypeToMessage);
        switch (skynestViewUIAction) {
            case SKYNEST_REGISTER_ACCOUNT_VIEW_1_ERROR_INVALID_DAY_ACTION:
                this.l.setBackgroundResource(Globals.getActivity().getResources().getIdentifier("rovio_id_ms_milkshake_datemonthyear_button_error", "drawable", Globals.getActivity().getPackageName()));
                return;
            case SKYNEST_REGISTER_ACCOUNT_VIEW_1_ERROR_INVALID_MONTH_ACTION:
                this.m.setBackgroundResource(Globals.getActivity().getResources().getIdentifier("rovio_id_ms_milkshake_datemonthyear_button_error", "drawable", Globals.getActivity().getPackageName()));
                return;
            case SKYNEST_REGISTER_ACCOUNT_VIEW_1_ERROR_INVALID_YEAR_MESSAGE_ACTION:
                this.n.setBackgroundResource(Globals.getActivity().getResources().getIdentifier("rovio_id_ms_milkshake_datemonthyear_button_error", "drawable", Globals.getActivity().getPackageName()));
                return;
            case SKYNEST_LOGIN_VIEW_ERROR_EMAIL_ACTION:
                this.k = convertErrorTypeToMessage;
                findViewWithTag("rovio_signin_page_emailexclaim").setVisibility(0);
                findViewWithTag("rovio_signin_panelsignin_emailaddress").setBackgroundResource(this.a);
                findViewWithTag("rovio_signin_page_emailpopup").setVisibility(0);
                ((TextView) findViewWithTag("rovio_signin_page_emailpopup")).setText(this.k);
                return;
            case SKYNEST_LOGIN_VIEW_ERROR_PASSWORD_ACTION:
                this.j = convertErrorTypeToMessage;
                findViewWithTag("rovio_signin_page_password_exclaim").setVisibility(0);
                findViewWithTag("rovio_signin_panelsignin_password").setBackgroundResource(this.a);
                findViewWithTag("rovio_signin_page_passwdpopup").setVisibility(0);
                ((TextView) findViewWithTag("rovio_signin_page_passwdpopup")).setText(this.j);
                return;
            case SKYNEST_REGISTER_ACCOUNT_VIEW_2_ERROR_EMAIL_ACTION:
                this.k = convertErrorTypeToMessage;
                findViewWithTag("rovio_register_page_2_emailexclaim").setVisibility(0);
                findViewWithTag("rovio_signin_panelregister_2_emailEditText").setBackgroundResource(this.a);
                findViewWithTag("rovio_register_page_2_emailpopup").setVisibility(0);
                ((TextView) findViewWithTag("rovio_register_page_2_emailpopup")).setText(convertErrorTypeToMessage);
                return;
            case SKYNEST_REGISTER_ACCOUNT_VIEW_2_ERROR_PASSWORD_ACTION:
                this.j = convertErrorTypeToMessage;
                findViewWithTag("rovio_register_page_2_password_exclaim").setVisibility(0);
                findViewWithTag("rovio_signin_panelregister_2_passwordEditText").setBackgroundResource(this.a);
                findViewWithTag("rovio_register_page_2_passwdpopup").setVisibility(0);
                ((TextView) findViewWithTag("rovio_register_page_2_passwdpopup")).setText(this.j);
                return;
            case SKYNEST_FORGOT_PASSWORD_VIEW_ERROR_EMAIL_ACTION:
                this.k = convertErrorTypeToMessage;
                findViewWithTag("rovio_signin_passrequest_emailexclaim").setVisibility(0);
                findViewWithTag("rovio_signin_passrequest_emailedittext").setBackgroundResource(this.a);
                findViewWithTag("rovio_forgot_password_page_emailpopup").setVisibility(0);
                ((TextView) findViewWithTag("rovio_forgot_password_page_emailpopup")).setText(this.k);
                return;
            default:
                return;
        }
    }

    public void add_spinner_data_register_page1() {
        Calendar calendar = Calendar.getInstance();
        calendar.get(5);
        calendar.get(2);
        int i = calendar.get(1);
        this.l = (Spinner) findViewWithTag("rovio_identity_birhday_spinner_day_2page");
        this.m = (Spinner) findViewWithTag("rovio_identity_birhday_spinner_month_2page");
        this.n = (Spinner) findViewWithTag("rovio_identity_birhday_spinner_year_2page");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Globals.getActivity().getResources().getString(Globals.getActivity().getResources().getIdentifier("rovio_id_day", "string", Globals.getActivity().getPackageName())));
        for (int i2 = 1; i2 < 32; i2++) {
            arrayList.add(Integer.toString(i2));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Globals.getActivity().getResources().getString(Globals.getActivity().getResources().getIdentifier("rovio_id_year", "string", Globals.getActivity().getPackageName())));
        for (int i3 = i; i3 > 1900; i3--) {
            arrayList2.add(Integer.toString(i3));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(Globals.getActivity(), 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        this.l.setAdapter((SpinnerAdapter) arrayAdapter);
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(Globals.getActivity(), Globals.getActivity().getResources().getIdentifier("rovio_id_months_array", "array", Globals.getActivity().getPackageName()), 17367048);
        createFromResource.setDropDownViewResource(17367049);
        this.m.setAdapter((SpinnerAdapter) createFromResource);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(Globals.getActivity(), 17367048, arrayList2);
        arrayAdapter2.setDropDownViewResource(17367049);
        this.n.setAdapter((SpinnerAdapter) arrayAdapter2);
        this.l.setSelection(0);
        this.m.setSelection(0);
        this.n.setSelection(0);
    }

    public void hideEmailErrorPopups() {
        findViewWithTag("rovio_register_page_2_emailpopup").setVisibility(4);
        findViewWithTag("rovio_signin_page_emailpopup").setVisibility(4);
        findViewWithTag("rovio_forgot_password_page_emailpopup").setVisibility(4);
    }

    public void hidePasswordErrorPopups() {
        findViewWithTag("rovio_register_page_2_passwdpopup").setVisibility(4);
        findViewWithTag("rovio_signin_page_passwdpopup").setVisibility(4);
        findViewWithTag("rovio_register_page_2_passwd_tip_popup").setVisibility(4);
    }

    public void hideEmailErrorExclaims() {
        findViewWithTag("rovio_register_page_2_emailexclaim").setVisibility(4);
        findViewWithTag("rovio_signin_passrequest_emailexclaim").setVisibility(4);
        findViewWithTag("rovio_signin_page_emailexclaim").setVisibility(4);
    }

    public void hidePasswordErrorExclaims() {
        findViewWithTag("rovio_register_page_2_password_exclaim").setVisibility(4);
        findViewWithTag("rovio_signin_page_password_exclaim").setVisibility(4);
    }

    public void handleBackbuttonForEditTexts() {
        this.e = (EditText) findViewWithTag("rovio_signin_panelsignin_emailaddress");
        this.e.setOnKeyListener(new View.OnKeyListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i == 4) {
                    if (IdentityLoginUIScreen.this.d != null) {
                        IdentityLoginUIScreen.this.d.handleBackButtonPress();
                    }
                    return true;
                }
                return false;
            }
        });
        this.g = (EditText) findViewWithTag("rovio_signin_panelsignin_password");
        this.g.setOnKeyListener(new View.OnKeyListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.2
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i == 4) {
                    if (IdentityLoginUIScreen.this.d != null) {
                        IdentityLoginUIScreen.this.d.handleBackButtonPress();
                    }
                    return true;
                }
                return false;
            }
        });
        this.h = (EditText) findViewWithTag("rovio_signin_panelregister_2_emailEditText");
        this.h.setOnKeyListener(new View.OnKeyListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.3
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i == 4) {
                    if (IdentityLoginUIScreen.this.d != null) {
                        IdentityLoginUIScreen.this.d.handleBackButtonPress();
                    }
                    return true;
                }
                return false;
            }
        });
        this.i = (EditText) findViewWithTag("rovio_signin_panelregister_2_passwordEditText");
        this.i.setOnKeyListener(new View.OnKeyListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.4
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i == 4) {
                    if (IdentityLoginUIScreen.this.d != null) {
                        IdentityLoginUIScreen.this.d.handleBackButtonPress();
                    }
                    return true;
                }
                return false;
            }
        });
        this.f = (EditText) findViewWithTag("rovio_signin_passrequest_emailedittext");
        this.f.setOnKeyListener(new View.OnKeyListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.5
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i == 4) {
                    if (IdentityLoginUIScreen.this.d != null) {
                        IdentityLoginUIScreen.this.d.handleBackButtonPress();
                    }
                    return true;
                }
                return false;
            }
        });
    }

    public void closeSoftKeyBoard() {
        if (this.q != null) {
            this.q.hideSoftInputFromWindow(findViewWithTag("outermostlayout").getWindowToken(), 0);
        }
    }

    public void setOnClickListners() {
        handleBackbuttonForEditTexts();
        findViewWithTag("outermostlayout").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IdentityLoginUIScreen.this.closeSoftKeyBoard();
            }
        });
        this.e = (EditText) findViewWithTag("rovio_signin_panelsignin_emailaddress");
        this.e.addTextChangedListener(new TextWatcher() { // from class: com.rovio.rcs.IdentityLoginUIScreen.7
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IdentityLoginUIScreen.this.e.setBackgroundResource(IdentityLoginUIScreen.this.b);
                IdentityLoginUIScreen.this.hideEmailErrorPopups();
                IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.emailEditStarted(IdentityLoginUIScreen.this.e.getText().toString());
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.8
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (!z) {
                    IdentityLoginUIScreen.this.hideEmailErrorPopups();
                    IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                }
            }
        });
        findViewWithTag("rovio_signin_page_emailexclaim").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (IdentityLoginUIScreen.this.findViewWithTag("rovio_signin_page_emailpopup").getVisibility() == 0) {
                    IdentityLoginUIScreen.this.hideEmailErrorPopups();
                    IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                    return;
                }
                IdentityLoginUIScreen.this.hideEmailErrorPopups();
                IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                IdentityLoginUIScreen.this.findViewWithTag("rovio_signin_page_emailpopup").setVisibility(0);
            }
        });
        findViewWithTag("rovio_signin_page_password_exclaim").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (IdentityLoginUIScreen.this.findViewWithTag("rovio_signin_page_passwdpopup").getVisibility() == 0) {
                    IdentityLoginUIScreen.this.hideEmailErrorPopups();
                    IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                    return;
                }
                IdentityLoginUIScreen.this.hideEmailErrorPopups();
                IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                IdentityLoginUIScreen.this.findViewWithTag("rovio_signin_page_passwdpopup").setVisibility(0);
            }
        });
        this.g = (EditText) findViewWithTag("rovio_signin_panelsignin_password");
        this.g.addTextChangedListener(new TextWatcher() { // from class: com.rovio.rcs.IdentityLoginUIScreen.11
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IdentityLoginUIScreen.this.g.setBackgroundResource(IdentityLoginUIScreen.this.b);
                IdentityLoginUIScreen.this.hideEmailErrorPopups();
                IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.passwordEditStarted(IdentityLoginUIScreen.this.g.getText().toString());
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.12
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (!z) {
                    IdentityLoginUIScreen.this.hideEmailErrorPopups();
                    IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                }
            }
        });
        this.h = (EditText) findViewWithTag("rovio_signin_panelregister_2_emailEditText");
        this.h.addTextChangedListener(new TextWatcher() { // from class: com.rovio.rcs.IdentityLoginUIScreen.13
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IdentityLoginUIScreen.this.h.setBackgroundResource(IdentityLoginUIScreen.this.b);
                IdentityLoginUIScreen.this.hideEmailErrorPopups();
                IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.emailEditStarted(IdentityLoginUIScreen.this.h.getText().toString());
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.i = (EditText) findViewWithTag("rovio_signin_panelregister_2_passwordEditText");
        this.i.addTextChangedListener(new TextWatcher() { // from class: com.rovio.rcs.IdentityLoginUIScreen.14
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IdentityLoginUIScreen.this.i.setBackgroundResource(IdentityLoginUIScreen.this.b);
                IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                IdentityLoginUIScreen.this.hideEmailErrorPopups();
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.passwordEditStarted(IdentityLoginUIScreen.this.i.getText().toString());
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.i.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.15
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (!z) {
                    IdentityLoginUIScreen.this.findViewWithTag("rovio_register_page_2_passwdpopup").setVisibility(4);
                }
            }
        });
        findViewWithTag("rovio_register_page_2_emailexclaim").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (IdentityLoginUIScreen.this.findViewWithTag("rovio_register_page_2_emailpopup").getVisibility() == 0) {
                    IdentityLoginUIScreen.this.hideEmailErrorPopups();
                    IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                    return;
                }
                IdentityLoginUIScreen.this.hideEmailErrorPopups();
                IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                IdentityLoginUIScreen.this.findViewWithTag("rovio_register_page_2_emailpopup").setVisibility(0);
            }
        });
        findViewWithTag("rovio_register_page_2_password_exclaim").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (IdentityLoginUIScreen.this.findViewWithTag("rovio_register_page_2_passwdpopup").getVisibility() == 0) {
                    IdentityLoginUIScreen.this.hideEmailErrorPopups();
                    IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                    return;
                }
                IdentityLoginUIScreen.this.hideEmailErrorPopups();
                IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                IdentityLoginUIScreen.this.findViewWithTag("rovio_register_page_2_passwdpopup").setVisibility(0);
            }
        });
        findViewWithTag("rovio_register_page_2_password_tip_exclaim").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (IdentityLoginUIScreen.this.findViewWithTag("rovio_register_page_2_passwd_tip_popup").getVisibility() == 0) {
                    IdentityLoginUIScreen.this.hideEmailErrorPopups();
                    IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                    return;
                }
                IdentityLoginUIScreen.this.hideEmailErrorPopups();
                IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                IdentityLoginUIScreen.this.findViewWithTag("rovio_register_page_2_passwd_tip_popup").setVisibility(0);
            }
        });
        this.f = (EditText) findViewWithTag("rovio_signin_passrequest_emailedittext");
        this.f.addTextChangedListener(new TextWatcher() { // from class: com.rovio.rcs.IdentityLoginUIScreen.19
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IdentityLoginUIScreen.this.f.setBackgroundResource(IdentityLoginUIScreen.this.b);
                IdentityLoginUIScreen.this.hideEmailErrorPopups();
                IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.emailEditStarted(IdentityLoginUIScreen.this.f.getText().toString());
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.20
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (!z) {
                    IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                }
            }
        });
        findViewWithTag("rovio_signin_passrequest_emailexclaim").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.21
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (IdentityLoginUIScreen.this.findViewWithTag("rovio_forgot_password_page_emailpopup").getVisibility() == 0) {
                    IdentityLoginUIScreen.this.hideEmailErrorPopups();
                    IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                    return;
                }
                IdentityLoginUIScreen.this.hideEmailErrorPopups();
                IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                IdentityLoginUIScreen.this.findViewWithTag("rovio_forgot_password_page_emailpopup").setVisibility(0);
            }
        });
        findViewWithTag("rovio_identity_privacypolicy").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Globals.getActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.rovio.com/privacy/")));
            }
        });
        findViewWithTag("rovio_identity_privacypolicy_3rdLine").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.23
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Globals.getActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.rovio.com/privacy/")));
            }
        });
        findViewWithTag("rovio_identity_termsofservice").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.24
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Globals.getActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.rovio.com/eula")));
            }
        });
        findViewWithTag("rovio_signin_signinbtn").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IdentityLoginUIScreen.this.o = ((EditText) IdentityLoginUIScreen.this.findViewWithTag("rovio_signin_panelsignin_emailaddress")).getText().toString();
                String obj = ((EditText) IdentityLoginUIScreen.this.findViewWithTag("rovio_signin_panelsignin_password")).getText().toString();
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.signInClicked(IdentityLoginUIScreen.this.o, obj);
                }
            }
        });
        findViewWithTag("rovio_signin_remindpassbtn").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.26
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String obj = ((EditText) IdentityLoginUIScreen.this.findViewWithTag("rovio_signin_passrequest_emailedittext")).getText().toString();
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.registerNewAccount(obj, "", 0, 0, 0, "", SkynestView.SHOW_FORGOT_PASSWORD_VIEW.ordinal());
                }
            }
        });
        findViewWithTag("rovio_signin_panelregister_2_regbtn").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.27
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IdentityLoginUIScreen.this.o = ((EditText) IdentityLoginUIScreen.this.findViewWithTag("rovio_signin_panelregister_2_emailEditText")).getText().toString();
                String obj = ((EditText) IdentityLoginUIScreen.this.findViewWithTag("rovio_signin_panelregister_2_passwordEditText")).getText().toString();
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.registerNewAccount(IdentityLoginUIScreen.this.o, obj, 0, 0, 0, IdentityLoginUIScreen.this.c, SkynestView.SHOW_REGISTER_ACCOUNT_VIEW_2.ordinal());
                }
            }
        });
        findViewWithTag("rovio_remindpassword_lnk").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.28
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.buttonClicked(SkynestViewUIAction.SKYNEST_FORGOT_PASSWORD_CLICKED_ACTION);
                }
            }
        });
        findViewWithTag("rovio_signin_panelregister_2page_screen1_continue").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.29
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int parseInt = IdentityLoginUIScreen.this.l.getSelectedItemPosition() > 0 ? Integer.parseInt(IdentityLoginUIScreen.this.l.getSelectedItem().toString()) : -1;
                int selectedItemPosition = IdentityLoginUIScreen.this.m.getSelectedItemPosition() > 0 ? IdentityLoginUIScreen.this.m.getSelectedItemPosition() : -1;
                int parseInt2 = IdentityLoginUIScreen.this.n.getSelectedItemPosition() > 0 ? Integer.parseInt(IdentityLoginUIScreen.this.n.getSelectedItem().toString()) : -1;
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.registerNewAccount("", "", parseInt, selectedItemPosition, parseInt2, "", SkynestView.SHOW_REGISTER_ACCOUNT_VIEW_1.ordinal());
                }
            }
        });
        ((FrameLayout) findViewWithTag("identity_frame_top_right_button")).findViewWithTag("identity_top_right_button_close").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.30
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IdentityLoginUIScreen.this.closeSoftKeyBoard();
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.buttonClicked(SkynestViewUIAction.SKYNEST_TOP_RIGHT_BTN_CLICKED_ACTION);
                }
            }
        });
        FrameLayout frameLayout = (FrameLayout) findViewWithTag("identity_frame_bottom_right_button");
        frameLayout.findViewWithTag("identity_bottom_right_button_continue").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.31
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.buttonClicked(SkynestViewUIAction.SKYNEST_BOTTOM_RIGHT_BTN_CLICKED_ACTION);
                }
            }
        });
        frameLayout.findViewWithTag("identity_bottom_right_button_next").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.32
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.buttonClicked(SkynestViewUIAction.SKYNEST_BOTTOM_RIGHT_BTN_CLICKED_ACTION);
                }
            }
        });
        FrameLayout frameLayout2 = (FrameLayout) findViewWithTag("identity_frame_top_left_button");
        frameLayout2.findViewWithTag("identity_top_left_button_questionmark").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.33
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.buttonClicked(SkynestViewUIAction.SKYNEST_TOP_LEFT_BTN_CLICKED_ACTION);
                }
            }
        });
        frameLayout2.findViewWithTag("identity_top_left_button_back").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.34
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (IdentityLoginUIScreen.this.d != null) {
                    IdentityLoginUIScreen.this.d.buttonClicked(SkynestViewUIAction.SKYNEST_TOP_LEFT_BTN_CLICKED_ACTION);
                }
            }
        });
        findViewWithTag("rovio_signin_frametag").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.35
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IdentityLoginUIScreen.this.hideEmailErrorPopups();
                IdentityLoginUIScreen.this.hidePasswordErrorPopups();
                IdentityLoginUIScreen.this.closeSoftKeyBoard();
            }
        });
        findViewWithTag("radiobuttonMale").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.36
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IdentityLoginUIScreen.this.MaleGenderButtonOnClick();
            }
        });
        findViewWithTag("radiobuttonFemale").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.37
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IdentityLoginUIScreen.this.FemaleGenderButtonOnClick();
            }
        });
        findViewWithTag("radiobuttonMaleText").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.38
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IdentityLoginUIScreen.this.MaleGenderButtonOnClick();
            }
        });
        findViewWithTag("radiobuttonFemaleText").setOnClickListener(new View.OnClickListener() { // from class: com.rovio.rcs.IdentityLoginUIScreen.39
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IdentityLoginUIScreen.this.FemaleGenderButtonOnClick();
            }
        });
    }

    public void hideAllSignInFrameViewElements() {
        findViewWithTag("rovio_signin_panelregister_1").setVisibility(4);
        findViewWithTag("rovio_signin_panelregister_2").setVisibility(4);
        findViewWithTag("rovio_signin_panelregister").setVisibility(4);
        findViewWithTag("rovio_signin_passrequest").setVisibility(4);
        findViewWithTag("rovio_signin_passrequest_successful").setVisibility(4);
        findViewWithTag("rovio_signin_panelanimation").setVisibility(4);
        findViewWithTag("rovio_signin_panelhelp1").setVisibility(4);
        findViewWithTag("rovio_signin_panelhelp2").setVisibility(4);
        findViewWithTag("rovio_signin_panelhelp3").setVisibility(4);
        findViewWithTag("rovio_signin_register_account_failure").setVisibility(4);
        findViewWithTag("rovio_signin_register_account_success").setVisibility(4);
        findViewWithTag("rovio_signin_panelsignintag").setVisibility(4);
        findViewWithTag("rovio_no_network_connectivity_screen").setVisibility(4);
        findViewWithTag("rovio_signin_page_emailexclaim").setVisibility(4);
        findViewWithTag("rovio_signin_page_emailpopup").setVisibility(4);
        findViewWithTag("rovio_signin_page_password_exclaim").setVisibility(4);
        findViewWithTag("rovio_signin_page_passwdpopup").setVisibility(4);
        findViewWithTag("rovio_register_page_2_emailexclaim").setVisibility(4);
        findViewWithTag("rovio_register_page_2_emailpopup").setVisibility(4);
        findViewWithTag("rovio_register_page_2_password_exclaim").setVisibility(4);
        findViewWithTag("rovio_register_page_2_passwdpopup").setVisibility(4);
        findViewWithTag("rovio_account_not_verified_view").setVisibility(4);
        int identifier = Globals.getActivity().getResources().getIdentifier("rovio_id_ms_milkshake_datemonthyear_button", "drawable", Globals.getActivity().getPackageName());
        this.l.setBackgroundResource(identifier);
        this.m.setBackgroundResource(identifier);
        this.n.setBackgroundResource(identifier);
    }

    public void show_screen(SkynestView skynestView) {
        closeSoftKeyBoard();
        hideAllSignInFrameViewElements();
        switch (skynestView) {
            case SHOW_LOGIN_VIEW:
                findViewWithTag("rovio_signin_panelsignintag").setVisibility(0);
                break;
            case SHOW_REGISTER_ACCOUNT_VIEW_1:
                findViewWithTag("rovio_signin_panelregister_1").setVisibility(0);
                break;
            case SHOW_REGISTER_ACCOUNT_VIEW_2:
                findViewWithTag("rovio_signin_panelregister_2").setVisibility(0);
                break;
            case SHOW_REGISTER_ACCOUNT_SINGLE_PAGE_VIEW:
                findViewWithTag("rovio_signin_panelregister").setVisibility(0);
                break;
            case SHOW_REGISTER_ACCOUNT_SUCCESS_VIEW:
                findViewWithTag("rovio_signin_register_account_success").setVisibility(0);
                ((TextView) findViewWithTag("rovio_signin_register_account_success_fan_emailid")).setText(this.o);
                break;
            case SHOW_REGISTER_ACCOUNT_FAILURE_VIEW:
                findViewWithTag("rovio_signin_register_account_failure").setVisibility(0);
                break;
            case SHOW_FORGOT_PASSWORD_VIEW:
                findViewWithTag("rovio_signin_passrequest").setVisibility(0);
                break;
            case SHOW_PASSWORD_RESET_SUCCESS_VIEW:
                findViewWithTag("rovio_signin_passrequest_successful").setVisibility(0);
                break;
            case SHOW_HELP_VIEW_1:
                findViewWithTag("rovio_signin_panelhelp1").setVisibility(0);
                break;
            case SHOW_HELP_VIEW_2:
                findViewWithTag("rovio_signin_panelhelp2").setVisibility(0);
                break;
            case SHOW_HELP_VIEW_3:
                findViewWithTag("rovio_signin_panelhelp3").setVisibility(0);
                break;
            case SHOW_CONNECTING_TO_NETWORK_VIEW:
                findViewWithTag("rovio_signin_panelanimation").setVisibility(0);
                ((AnimationDrawable) this.p.getDrawable()).start();
                break;
            case SHOW_NO_NETWROK_CONNECTIVITY_VIEW:
                findViewWithTag("rovio_no_network_connectivity_screen").setVisibility(0);
                break;
            case SHOW_ACCOUNT_NOT_VERIFIED_VIEW:
                findViewWithTag("rovio_account_not_verified_view").setVisibility(0);
                ((TextView) findViewWithTag("rovio_account_not_verified_view_fan_emailid")).setText(this.o);
                break;
        }
        show_top_left_button(skynestView);
        show_top_right_button(skynestView);
        show_bottom_right_button(skynestView);
    }

    public void setHandle(IdentityLoginUI identityLoginUI) {
        this.d = identityLoginUI;
    }

    public void hide_all_top_left_buttons() {
        findViewWithTag("identity_top_left_button_questionmark").setVisibility(4);
        findViewWithTag("identity_top_left_button_back").setVisibility(4);
    }

    public void hide_all_top_right_buttons() {
        findViewWithTag("identity_top_right_button_close").setVisibility(4);
    }

    public void hide_all_bottom_right_buttons() {
        findViewWithTag("identity_bottom_right_button_continue").setVisibility(4);
        findViewWithTag("identity_bottom_right_button_next").setVisibility(4);
    }

    public void show_top_left_button(SkynestView skynestView) {
        hide_all_top_left_buttons();
        switch (skynestView) {
            case SHOW_LOGIN_VIEW:
            case SHOW_REGISTER_ACCOUNT_VIEW_1:
            case SHOW_REGISTER_ACCOUNT_SINGLE_PAGE_VIEW:
                findViewWithTag("identity_top_left_button_questionmark").setVisibility(0);
                return;
            case SHOW_REGISTER_ACCOUNT_VIEW_2:
            case SHOW_FORGOT_PASSWORD_VIEW:
            case SHOW_NO_NETWROK_CONNECTIVITY_VIEW:
                findViewWithTag("identity_top_left_button_back").setVisibility(0);
                return;
            case SHOW_REGISTER_ACCOUNT_SUCCESS_VIEW:
            case SHOW_REGISTER_ACCOUNT_FAILURE_VIEW:
            case SHOW_PASSWORD_RESET_SUCCESS_VIEW:
            case SHOW_HELP_VIEW_1:
            case SHOW_HELP_VIEW_2:
            case SHOW_HELP_VIEW_3:
            case SHOW_CONNECTING_TO_NETWORK_VIEW:
            default:
                return;
        }
    }

    public void show_top_right_button(SkynestView skynestView) {
        hide_all_top_right_buttons();
        switch (skynestView) {
            case SHOW_LOGIN_VIEW:
            case SHOW_REGISTER_ACCOUNT_VIEW_1:
            case SHOW_REGISTER_ACCOUNT_VIEW_2:
            case SHOW_REGISTER_ACCOUNT_SINGLE_PAGE_VIEW:
                findViewWithTag("identity_top_right_button_close").setVisibility(0);
                return;
            default:
                return;
        }
    }

    public void show_bottom_right_button(SkynestView skynestView) {
        hide_all_bottom_right_buttons();
        switch (skynestView) {
            case SHOW_REGISTER_ACCOUNT_SUCCESS_VIEW:
            case SHOW_REGISTER_ACCOUNT_FAILURE_VIEW:
            case SHOW_PASSWORD_RESET_SUCCESS_VIEW:
            case SHOW_HELP_VIEW_3:
            case SHOW_ACCOUNT_NOT_VERIFIED_VIEW:
                findViewWithTag("identity_bottom_right_button_continue").setVisibility(0);
                return;
            case SHOW_FORGOT_PASSWORD_VIEW:
            case SHOW_CONNECTING_TO_NETWORK_VIEW:
            case SHOW_NO_NETWROK_CONNECTIVITY_VIEW:
            default:
                return;
            case SHOW_HELP_VIEW_1:
            case SHOW_HELP_VIEW_2:
                findViewWithTag("identity_bottom_right_button_next").setVisibility(0);
                return;
        }
    }

    public void MaleGenderButtonOnClick() {
        int identifier = getContext().getResources().getIdentifier("rovio_id_ms_milkshake_gender_button_on", "drawable", Globals.getActivity().getPackageName());
        int identifier2 = getContext().getResources().getIdentifier("rovio_id_ms_milkshake_gender_button_off", "drawable", Globals.getActivity().getPackageName());
        findViewWithTag("radiobuttonMale").setBackgroundResource(identifier);
        findViewWithTag("radiobuttonFemale").setBackgroundResource(identifier2);
        this.c = "male";
    }

    public void FemaleGenderButtonOnClick() {
        int identifier = getContext().getResources().getIdentifier("rovio_id_ms_milkshake_gender_button_on", "drawable", Globals.getActivity().getPackageName());
        findViewWithTag("radiobuttonMale").setBackgroundResource(getContext().getResources().getIdentifier("rovio_id_ms_milkshake_gender_button_off", "drawable", Globals.getActivity().getPackageName()));
        findViewWithTag("radiobuttonFemale").setBackgroundResource(identifier);
        this.c = "female";
    }
}
