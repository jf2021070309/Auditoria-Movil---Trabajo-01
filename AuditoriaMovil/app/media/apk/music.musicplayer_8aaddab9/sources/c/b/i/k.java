package c.b.i;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import c.i.k.g;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class k extends EditText implements c.i.k.y, c.i.k.w {
    public final e a;

    /* renamed from: b  reason: collision with root package name */
    public final y f1190b;

    /* renamed from: c  reason: collision with root package name */
    public final x f1191c;

    /* renamed from: d  reason: collision with root package name */
    public final c.i.l.h f1192d;

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public k(Context context, AttributeSet attributeSet, int i2) {
        super(x0.a(context), attributeSet, i2);
        v0.a(this, getContext());
        e eVar = new e(this);
        this.a = eVar;
        eVar.d(attributeSet, i2);
        y yVar = new y(this);
        this.f1190b = yVar;
        yVar.e(attributeSet, i2);
        yVar.b();
        this.f1191c = new x(this);
        this.f1192d = new c.i.l.h();
    }

    @Override // c.i.k.w
    public c.i.k.g a(c.i.k.g gVar) {
        return this.f1192d.a(this, gVar);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.a;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1190b;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // c.i.k.y
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // c.i.k.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x xVar;
        return (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1191c) == null) ? super.getTextClassifier() : xVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] stringArray;
        InputConnection cVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1190b.g(this, onCreateInputConnection, editorInfo);
        c.b.a.b(onCreateInputConnection, editorInfo, this);
        String[] n2 = c.i.k.d0.n(this);
        if (onCreateInputConnection == null || n2 == null) {
            return onCreateInputConnection;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25) {
            editorInfo.contentMimeTypes = n2;
        } else {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", n2);
            editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", n2);
        }
        t tVar = new t(this);
        Objects.requireNonNull(editorInfo, "editorInfo must be non-null");
        if (i2 >= 25) {
            cVar = new c.i.k.m0.b(onCreateInputConnection, false, tVar);
        } else {
            if (i2 >= 25) {
                stringArray = editorInfo.contentMimeTypes;
                if (stringArray == null) {
                    stringArray = c.i.k.m0.a.a;
                }
            } else {
                Bundle bundle = editorInfo.extras;
                if (bundle == null) {
                    stringArray = c.i.k.m0.a.a;
                } else {
                    String[] stringArray2 = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                    stringArray = stringArray2 == null ? editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES") : stringArray2;
                    if (stringArray == null) {
                        stringArray = c.i.k.m0.a.a;
                    }
                }
            }
            if (stringArray.length == 0) {
                return onCreateInputConnection;
            }
            cVar = new c.i.k.m0.c(onCreateInputConnection, false, tVar);
        }
        return cVar;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && c.i.k.d0.n(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                String str = "Can't handle drop: no activity: view=" + this;
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    c.i.k.d0.u(this, (Build.VERSION.SDK_INT >= 31 ? new g.a(clipData, 3) : new g.c(clipData, 3)).build());
                    endBatchEdit();
                    z = true;
                } catch (Throwable th) {
                    endBatchEdit();
                    throw th;
                }
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i2) {
        if ((i2 == 16908322 || i2 == 16908337) && c.i.k.d0.n(this) != null) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                g.b aVar = Build.VERSION.SDK_INT >= 31 ? new g.a(primaryClip, 1) : new g.c(primaryClip, 1);
                aVar.b(i2 != 16908322 ? 1 : 0);
                c.i.k.d0.u(this, aVar.build());
            }
            r0 = 1;
        }
        if (r0 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.a;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c.i.a.r0(this, callback));
    }

    @Override // c.i.k.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    @Override // c.i.k.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f1190b;
        if (yVar != null) {
            yVar.f(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1191c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.f1262b = textClassifier;
        }
    }
}
