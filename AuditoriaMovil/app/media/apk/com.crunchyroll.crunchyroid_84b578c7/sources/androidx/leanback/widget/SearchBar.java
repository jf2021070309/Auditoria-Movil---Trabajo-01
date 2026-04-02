package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.leanback.widget.SearchEditText;
import androidx.leanback.widget.SearchOrbView;
import com.amazon.aps.iva.f5.t;
import com.amazon.aps.iva.f5.u;
import com.amazon.aps.iva.f5.w;
import com.amazon.aps.iva.f5.z;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.regex.Matcher;
/* loaded from: classes.dex */
public class SearchBar extends RelativeLayout {
    public static final /* synthetic */ int y = 0;
    public SearchEditText b;
    public SpeechOrbView c;
    public ImageView d;
    public String e;
    public String f;
    public String g;
    public Drawable h;
    public final Handler i;
    public final InputMethodManager j;
    public boolean k;
    public Drawable l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public SpeechRecognizer s;
    public boolean t;
    public SoundPool u;
    public final SparseIntArray v;
    public boolean w;
    public final Context x;

    /* loaded from: classes.dex */
    public class a implements View.OnFocusChangeListener {
        public a() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            SearchBar searchBar = SearchBar.this;
            if (z) {
                searchBar.i.post(new u(searchBar));
            } else {
                searchBar.j.hideSoftInputFromWindow(searchBar.b.getWindowToken(), 0);
            }
            searchBar.d(z);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchBar searchBar = SearchBar.this;
            searchBar.setSearchQueryInternal(searchBar.b.getText().toString());
        }
    }

    /* loaded from: classes.dex */
    public class d implements SearchEditText.a {
        public d() {
        }
    }

    /* loaded from: classes.dex */
    public class e implements TextView.OnEditorActionListener {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchBar searchBar = SearchBar.this;
                searchBar.k = true;
                searchBar.c.requestFocus();
            }
        }

        public e() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchBar searchBar = SearchBar.this;
            if (3 == i || i == 0) {
                searchBar.getClass();
            }
            if (1 == i) {
                searchBar.getClass();
            }
            if (2 != i) {
                return false;
            }
            searchBar.j.hideSoftInputFromWindow(searchBar.b.getWindowToken(), 0);
            searchBar.i.postDelayed(new a(), 500L);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchBar searchBar = SearchBar.this;
            if (searchBar.w) {
                searchBar.b();
            } else {
                searchBar.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnFocusChangeListener {
        public g() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            SearchBar searchBar = SearchBar.this;
            if (z) {
                searchBar.j.hideSoftInputFromWindow(searchBar.b.getWindowToken(), 0);
                if (searchBar.k) {
                    searchBar.a();
                    searchBar.k = false;
                }
            } else {
                searchBar.b();
            }
            searchBar.d(z);
        }
    }

    /* loaded from: classes.dex */
    public interface i {
    }

    /* loaded from: classes.dex */
    public interface j {
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.i = new Handler();
        this.k = false;
        this.v = new SparseIntArray();
        this.w = false;
        this.x = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(R.layout.lb_search_bar, (ViewGroup) this, true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.lb_search_bar_height));
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.e = "";
        this.j = (InputMethodManager) context.getSystemService("input_method");
        this.n = resources.getColor(R.color.lb_search_bar_text_speech_mode);
        this.m = resources.getColor(R.color.lb_search_bar_text);
        this.r = resources.getInteger(R.integer.lb_search_bar_speech_mode_background_alpha);
        this.q = resources.getInteger(R.integer.lb_search_bar_text_mode_background_alpha);
        this.p = resources.getColor(R.color.lb_search_bar_hint_speech_mode);
        this.o = resources.getColor(R.color.lb_search_bar_hint);
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
    }

    public final void a() {
        if (this.w) {
            return;
        }
        if (!hasFocus()) {
            requestFocus();
        }
        if (this.s == null) {
            return;
        }
        if (getContext().checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            this.w = true;
            this.b.setText("");
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
            this.s.setRecognitionListener(new h());
            this.t = true;
            this.s.startListening(intent);
            return;
        }
        throw new IllegalStateException("android.permission.RECORD_AUDIO required for search");
    }

    public final void b() {
        if (!this.w) {
            return;
        }
        this.b.setText(this.e);
        this.b.setHint(this.f);
        this.w = false;
        if (this.s == null) {
            return;
        }
        this.c.c();
        if (this.t) {
            this.s.cancel();
            this.t = false;
        }
        this.s.setRecognitionListener(null);
    }

    public final void c() {
        String string = getResources().getString(R.string.lb_search_bar_hint);
        if (!TextUtils.isEmpty(this.g)) {
            if (this.c.isFocused()) {
                string = getResources().getString(R.string.lb_search_bar_hint_with_title_speech, this.g);
            } else {
                string = getResources().getString(R.string.lb_search_bar_hint_with_title, this.g);
            }
        } else if (this.c.isFocused()) {
            string = getResources().getString(R.string.lb_search_bar_hint_speech);
        }
        this.f = string;
        SearchEditText searchEditText = this.b;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    public final void d(boolean z) {
        if (z) {
            this.l.setAlpha(this.r);
            boolean isFocused = this.c.isFocused();
            int i2 = this.p;
            if (isFocused) {
                this.b.setTextColor(i2);
                this.b.setHintTextColor(i2);
            } else {
                this.b.setTextColor(this.n);
                this.b.setHintTextColor(i2);
            }
        } else {
            this.l.setAlpha(this.q);
            this.b.setTextColor(this.m);
            this.b.setHintTextColor(this.o);
        }
        c();
    }

    public Drawable getBadgeDrawable() {
        return this.h;
    }

    public CharSequence getHint() {
        return this.f;
    }

    public String getTitle() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u = new SoundPool(2, 1, 0);
        int[] iArr = {R.raw.lb_voice_failure, R.raw.lb_voice_open, R.raw.lb_voice_no_input, R.raw.lb_voice_success};
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[i2];
            this.v.put(i3, this.u.load(this.x, i3, 1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        this.u.release();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.l = ((RelativeLayout) findViewById(R.id.lb_search_bar_items)).getBackground();
        this.b = (SearchEditText) findViewById(R.id.lb_search_text_editor);
        ImageView imageView = (ImageView) findViewById(R.id.lb_search_bar_badge);
        this.d = imageView;
        Drawable drawable = this.h;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        this.b.setOnFocusChangeListener(new a());
        this.b.addTextChangedListener(new c(new b()));
        this.b.setOnKeyboardDismissListener(new d());
        this.b.setOnEditorActionListener(new e());
        this.b.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(R.id.lb_search_bar_speech_orb);
        this.c = speechOrbView;
        speechOrbView.setOnOrbClickedListener(new f());
        this.c.setOnFocusChangeListener(new g());
        d(hasFocus());
        c();
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.h = drawable;
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            if (drawable != null) {
                this.d.setVisibility(0);
            } else {
                this.d.setVisibility(8);
            }
        }
    }

    @Override // android.view.View
    public void setNextFocusDownId(int i2) {
        this.c.setNextFocusDownId(i2);
        this.b.setNextFocusDownId(i2);
    }

    public void setSearchAffordanceColors(SearchOrbView.c cVar) {
        SpeechOrbView speechOrbView = this.c;
        if (speechOrbView != null) {
            speechOrbView.setNotListeningOrbColors(cVar);
        }
    }

    public void setSearchAffordanceColorsInListening(SearchOrbView.c cVar) {
        SpeechOrbView speechOrbView = this.c;
        if (speechOrbView != null) {
            speechOrbView.setListeningOrbColors(cVar);
        }
    }

    public void setSearchQuery(String str) {
        b();
        this.b.setText(str);
        setSearchQueryInternal(str);
    }

    public void setSearchQueryInternal(String str) {
        if (TextUtils.equals(this.e, str)) {
            return;
        }
        this.e = str;
    }

    public void setSpeechRecognizer(SpeechRecognizer speechRecognizer) {
        b();
        SpeechRecognizer speechRecognizer2 = this.s;
        if (speechRecognizer2 != null) {
            speechRecognizer2.setRecognitionListener(null);
            if (this.t) {
                this.s.cancel();
                this.t = false;
            }
        }
        this.s = speechRecognizer;
    }

    public void setTitle(String str) {
        this.g = str;
        c();
    }

    /* loaded from: classes.dex */
    public class h implements RecognitionListener {
        public h() {
        }

        @Override // android.speech.RecognitionListener
        public final void onError(int i) {
            switch (i) {
                case 1:
                    int i2 = SearchBar.y;
                    break;
                case 2:
                    int i3 = SearchBar.y;
                    break;
                case 3:
                    int i4 = SearchBar.y;
                    break;
                case 4:
                    int i5 = SearchBar.y;
                    break;
                case 5:
                    int i6 = SearchBar.y;
                    break;
                case 6:
                    int i7 = SearchBar.y;
                    break;
                case 7:
                    int i8 = SearchBar.y;
                    break;
                case 8:
                    int i9 = SearchBar.y;
                    break;
                case 9:
                    int i10 = SearchBar.y;
                    break;
                default:
                    int i11 = SearchBar.y;
                    break;
            }
            SearchBar searchBar = SearchBar.this;
            searchBar.b();
            searchBar.i.post(new t(searchBar, R.raw.lb_voice_failure));
        }

        @Override // android.speech.RecognitionListener
        public final void onPartialResults(Bundle bundle) {
            String str;
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList != null && stringArrayList.size() != 0) {
                String str2 = stringArrayList.get(0);
                if (stringArrayList.size() > 1) {
                    str = stringArrayList.get(1);
                } else {
                    str = null;
                }
                SearchEditText searchEditText = SearchBar.this.b;
                searchEditText.getClass();
                if (str2 == null) {
                    str2 = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                if (str != null) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) str);
                    Matcher matcher = z.g.matcher(str);
                    while (matcher.find()) {
                        int start = matcher.start() + length;
                        spannableStringBuilder.setSpan(new z.b(searchEditText, str.charAt(matcher.start()), start), start, matcher.end() + length, 33);
                    }
                }
                searchEditText.e = Math.max(str2.length(), searchEditText.e);
                searchEditText.setText(new SpannedString(spannableStringBuilder));
                searchEditText.bringPointIntoView(searchEditText.length());
                ObjectAnimator objectAnimator = searchEditText.f;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                int streamPosition = searchEditText.getStreamPosition();
                int length2 = searchEditText.length();
                int i = length2 - streamPosition;
                if (i > 0) {
                    if (searchEditText.f == null) {
                        ObjectAnimator objectAnimator2 = new ObjectAnimator();
                        searchEditText.f = objectAnimator2;
                        objectAnimator2.setTarget(searchEditText);
                        searchEditText.f.setProperty(z.h);
                    }
                    searchEditText.f.setIntValues(streamPosition, length2);
                    searchEditText.f.setDuration(i * 50);
                    searchEditText.f.start();
                }
            }
        }

        @Override // android.speech.RecognitionListener
        public final void onReadyForSpeech(Bundle bundle) {
            SearchBar searchBar = SearchBar.this;
            SpeechOrbView speechOrbView = searchBar.c;
            speechOrbView.setOrbColors(speechOrbView.u);
            speechOrbView.setOrbIcon(speechOrbView.getResources().getDrawable(R.drawable.lb_ic_search_mic));
            speechOrbView.a(true);
            speechOrbView.n = false;
            speechOrbView.b();
            View view = speechOrbView.d;
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            speechOrbView.w = 0;
            speechOrbView.x = true;
            searchBar.i.post(new t(searchBar, R.raw.lb_voice_open));
        }

        @Override // android.speech.RecognitionListener
        public final void onResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            SearchBar searchBar = SearchBar.this;
            if (stringArrayList != null) {
                String str = stringArrayList.get(0);
                searchBar.e = str;
                searchBar.b.setText(str);
                TextUtils.isEmpty(searchBar.e);
            }
            searchBar.b();
            searchBar.i.post(new t(searchBar, R.raw.lb_voice_success));
        }

        @Override // android.speech.RecognitionListener
        public final void onRmsChanged(float f) {
            int i;
            if (f < 0.0f) {
                i = 0;
            } else {
                i = (int) (f * 10.0f);
            }
            SearchBar.this.c.setSoundLevel(i);
        }

        @Override // android.speech.RecognitionListener
        public final void onBeginningOfSpeech() {
        }

        @Override // android.speech.RecognitionListener
        public final void onEndOfSpeech() {
        }

        @Override // android.speech.RecognitionListener
        public final void onBufferReceived(byte[] bArr) {
        }

        @Override // android.speech.RecognitionListener
        public final void onEvent(int i, Bundle bundle) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements TextWatcher {
        public final /* synthetic */ Runnable b;

        public c(b bVar) {
            this.b = bVar;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchBar searchBar = SearchBar.this;
            if (searchBar.w) {
                return;
            }
            Handler handler = searchBar.i;
            Runnable runnable = this.b;
            handler.removeCallbacks(runnable);
            searchBar.i.post(runnable);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public void setPermissionListener(j jVar) {
    }

    public void setSearchBarListener(i iVar) {
    }

    @Deprecated
    public void setSpeechRecognitionCallback(w wVar) {
    }
}
