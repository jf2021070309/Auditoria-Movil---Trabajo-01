package com.amazon.aps.iva.t00;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.t00.e;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.xw.u;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.SettingsRadioGroup;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: AudioLanguageOptionsDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/t00/b;", "Lcom/amazon/aps/iva/wy/d;", "Lcom/amazon/aps/iva/t00/f;", "<init>", "()V", "a", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.d implements f {
    public final s b;
    public final s c;
    public final s d;
    public final u e;
    public final v f;
    public final v g;
    public final m h;
    public static final /* synthetic */ l<Object>[] j = {defpackage.e.b(b.class, "versions", "getVersions()Ljava/util/List;", 0), defpackage.e.b(b.class, "currentAudioLocale", "getCurrentAudioLocale()Ljava/lang/String;", 0), defpackage.e.b(b.class, "resultKey", "getResultKey()Ljava/lang/String;", 0), defpackage.e.b(b.class, "metadata", "getMetadata()Ljava/lang/Object;", 0), q.a(b.class, "radioGroup", "getRadioGroup()Lcom/ellation/widgets/SettingsRadioGroup;", 0), q.a(b.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)};
    public static final a i = new a();

    /* compiled from: AudioLanguageOptionsDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(FragmentManager fragmentManager, String str, h hVar, final p pVar) {
            j.f(hVar, "lifecycleOwner");
            fragmentManager.b0(str, hVar, new com.amazon.aps.iva.n4.v() { // from class: com.amazon.aps.iva.t00.a
                @Override // com.amazon.aps.iva.n4.v
                public final void i6(Bundle bundle, String str2) {
                    Object obj;
                    Serializable serializable;
                    p pVar2 = p.this;
                    j.f(pVar2, "$onAudioLanguageChange");
                    j.f(str2, "<anonymous parameter 0>");
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 33) {
                        obj = bundle.getSerializable("audio_language_result", String.class);
                    } else {
                        obj = (String) bundle.getSerializable("audio_language_result");
                    }
                    j.c(obj);
                    if (i >= 33) {
                        serializable = bundle.getSerializable("metadata_result", Object.class);
                    } else {
                        serializable = bundle.getSerializable("metadata_result");
                    }
                    j.c(serializable);
                    pVar2.invoke(obj, serializable);
                }
            });
        }

        public static void b(FragmentManager fragmentManager, String str, List list, String str2, Object obj) {
            j.f(list, "versions");
            j.f(str2, "currentAudioLocale");
            b bVar = new b();
            l<?>[] lVarArr = b.j;
            bVar.b.b(bVar, lVarArr[0], list);
            bVar.c.b(bVar, lVarArr[1], str2);
            bVar.d.b(bVar, lVarArr[2], str);
            bVar.e.b(bVar, lVarArr[3], obj);
            bVar.show(fragmentManager, str);
        }
    }

    /* compiled from: AudioLanguageOptionsDialog.kt */
    /* renamed from: com.amazon.aps.iva.t00.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0724b extends i implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public C0724b(d dVar) {
            super(1, dVar, d.class, "onOptionSelected", "onOptionSelected(Ljava/lang/String;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            String str2 = str;
            j.f(str2, "p0");
            ((d) this.receiver).d5(str2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AudioLanguageOptionsDialog.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<d> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final d invoke() {
            a aVar = b.i;
            b bVar = b.this;
            bVar.getClass();
            l<?>[] lVarArr = b.j;
            String str = (String) bVar.c.getValue(bVar, lVarArr[1]);
            List list = (List) bVar.b.getValue(bVar, lVarArr[0]);
            com.amazon.aps.iva.zv.b bVar2 = com.amazon.aps.iva.sv.e.e;
            if (bVar2 != null) {
                com.amazon.aps.iva.p00.a z = bVar2.z();
                j.f(z, "titleProvider");
                return new e(bVar, str, list, z);
            }
            j.m("dependencies");
            throw null;
        }
    }

    public b() {
        super(Integer.valueOf((int) R.layout.dialog_audio_language_options));
        this.b = new s("versions");
        this.c = new s("currentAudioLocale");
        this.d = new s("resultKey");
        this.e = new u("metadata");
        this.f = g.e(this, R.id.radio_group);
        this.g = g.e(this, R.id.toolbar);
        this.h = com.amazon.aps.iva.kb0.f.b(new c());
    }

    @Override // com.amazon.aps.iva.t00.f
    public final void ag(String str) {
        SettingsRadioGroup settingsRadioGroup = (SettingsRadioGroup) this.f.getValue(this, j[4]);
        settingsRadioGroup.d = false;
        if (settingsRadioGroup.b.contains(str)) {
            settingsRadioGroup.clearCheck();
            settingsRadioGroup.check(settingsRadioGroup.b.indexOf(str));
        }
        settingsRadioGroup.d = true;
    }

    @Override // com.amazon.aps.iva.t00.f
    public final void fh(ArrayList arrayList, e.a aVar) {
        ((SettingsRadioGroup) this.f.getValue(this, j[4])).a(arrayList, new com.amazon.aps.iva.t00.c(aVar));
    }

    @Override // com.amazon.aps.iva.t00.f
    public final void j3(String str) {
        j.f(str, "selectedAudioLocale");
        FragmentManager parentFragmentManager = getParentFragmentManager();
        l<?>[] lVarArr = j;
        l<?> lVar = lVarArr[2];
        parentFragmentManager.a0(com.amazon.aps.iva.k3.e.a(new com.amazon.aps.iva.kb0.j("audio_language_result", str), new com.amazon.aps.iva.kb0.j("metadata_result", this.e.getValue(this, lVarArr[3]))), (String) this.d.getValue(this, lVar));
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.DialogTheme);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        l<?>[] lVarArr = j;
        ((SettingsRadioGroup) this.f.getValue(this, lVarArr[4])).setOnCheckedChangeListener(new C0724b((d) this.h.getValue()));
        ((Toolbar) this.g.getValue(this, lVarArr[5])).setNavigationOnClickListener(new com.amazon.aps.iva.c8.e(this, 14));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H((d) this.h.getValue());
    }
}
