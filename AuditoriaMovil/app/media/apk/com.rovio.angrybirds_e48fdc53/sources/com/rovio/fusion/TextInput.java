package com.rovio.fusion;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
/* loaded from: classes2.dex */
class TextInput extends View {
    private static TextInput sm_textInput;
    boolean a;

    public static void enableTextInput(final boolean z) {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.fusion.TextInput.1
            @Override // java.lang.Runnable
            public void run() {
                if (TextInput.sm_textInput == null && z) {
                    TextInput unused = TextInput.sm_textInput = new TextInput(Globals.getActivity());
                    Globals.getRootViewGroup().addView(TextInput.sm_textInput);
                }
                if (TextInput.sm_textInput != null) {
                    TextInput.sm_textInput.activateTextInput(z);
                }
            }
        });
    }

    public TextInput(Context context) {
        super(context);
        this.a = false;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void activateTextInput(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        if (z) {
            inputMethodManager.toggleSoftInputFromWindow(getWindowToken(), 2, 0);
            requestFocus();
        }
        this.a = z;
    }

    public boolean isTextInputEnabled() {
        return this.a;
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        BaseInputConnection baseInputConnection = new BaseInputConnection(this, false);
        editorInfo.actionLabel = null;
        editorInfo.inputType = 144;
        editorInfo.imeOptions = DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP;
        return baseInputConnection;
    }
}
