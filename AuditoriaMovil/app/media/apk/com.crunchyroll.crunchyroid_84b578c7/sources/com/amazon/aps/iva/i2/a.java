package com.amazon.aps.iva.i2;

import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.common.primitives.Ints;
import java.lang.ref.WeakReference;
import okhttp3.internal.http2.Http2;
/* compiled from: AndroidTextInputServicePlugin.kt */
/* loaded from: classes.dex */
public final class a implements v<C0350a> {
    public static final a a = new a();

    /* compiled from: AndroidTextInputServicePlugin.kt */
    /* renamed from: com.amazon.aps.iva.i2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0350a implements u {
        public final f0 a;
        public final g0 b;

        public C0350a(f0 f0Var, g0 g0Var) {
            this.a = f0Var;
            this.b = g0Var;
        }

        @Override // com.amazon.aps.iva.i2.u
        public final a0 a(EditorInfo editorInfo) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            int i;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            boolean z22;
            boolean z23;
            com.amazon.aps.iva.yb0.j.f(editorInfo, "outAttrs");
            g0 g0Var = this.b;
            g0Var.getClass();
            l lVar = g0Var.h;
            e0 e0Var = g0Var.g;
            com.amazon.aps.iva.yb0.j.f(lVar, "imeOptions");
            com.amazon.aps.iva.yb0.j.f(e0Var, "textFieldValue");
            int i2 = lVar.e;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            boolean z24 = lVar.a;
            if (z) {
                if (!z24) {
                    i = 0;
                }
                i = 6;
            } else {
                if (i2 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i = 1;
                } else {
                    if (i2 == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i = 2;
                    } else {
                        if (i2 == 6) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            i = 5;
                        } else {
                            if (i2 == 5) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                i = 7;
                            } else {
                                if (i2 == 3) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    i = 3;
                                } else {
                                    if (i2 == 4) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        i = 4;
                                    } else {
                                        if (i2 == 7) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (!z8) {
                                            throw new IllegalStateException("invalid ImeAction".toString());
                                        }
                                        i = 6;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            editorInfo.imeOptions = i;
            int i3 = lVar.d;
            if (i3 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                editorInfo.inputType = 1;
            } else {
                if (i3 == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i;
                } else {
                    if (i3 == 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        editorInfo.inputType = 2;
                    } else {
                        if (i3 == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            editorInfo.inputType = 3;
                        } else {
                            if (i3 == 5) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                editorInfo.inputType = 17;
                            } else {
                                if (i3 == 6) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    editorInfo.inputType = 33;
                                } else {
                                    if (i3 == 7) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        editorInfo.inputType = 129;
                                    } else {
                                        if (i3 == 8) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (z16) {
                                            editorInfo.inputType = 18;
                                        } else {
                                            if (i3 == 9) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            if (z17) {
                                                editorInfo.inputType = 8194;
                                            } else {
                                                throw new IllegalStateException("Invalid Keyboard Type".toString());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!z24) {
                int i4 = editorInfo.inputType;
                if ((i4 & 1) == 1) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                if (z22) {
                    editorInfo.inputType = i4 | 131072;
                    if (i2 == 1) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    if (z23) {
                        editorInfo.imeOptions |= Ints.MAX_POWER_OF_TWO;
                    }
                }
            }
            int i5 = editorInfo.inputType;
            if ((i5 & 1) == 1) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                int i6 = lVar.b;
                if (i6 == 1) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (z19) {
                    editorInfo.inputType = i5 | 4096;
                } else {
                    if (i6 == 2) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (z20) {
                        editorInfo.inputType = i5 | 8192;
                    } else {
                        if (i6 == 3) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (z21) {
                            editorInfo.inputType = i5 | Http2.INITIAL_MAX_FRAME_SIZE;
                        }
                    }
                }
                if (lVar.c) {
                    editorInfo.inputType |= 32768;
                }
            }
            int i7 = com.amazon.aps.iva.c2.z.c;
            long j = e0Var.b;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = com.amazon.aps.iva.c2.z.c(j);
            com.amazon.aps.iva.s3.a.a(editorInfo, e0Var.a.b);
            editorInfo.imeOptions |= 33554432;
            if (androidx.emoji2.text.d.c()) {
                androidx.emoji2.text.d.a().j(editorInfo);
            }
            a0 a0Var = new a0(g0Var.g, new i0(g0Var), g0Var.h.c);
            g0Var.i.add(new WeakReference(a0Var));
            return a0Var;
        }
    }

    @Override // com.amazon.aps.iva.i2.v
    public final C0350a a(AndroidComposeView androidComposeView, t tVar) {
        com.amazon.aps.iva.yb0.j.f(tVar, "platformTextInput");
        com.amazon.aps.iva.yb0.j.f(androidComposeView, "view");
        g0 g0Var = new g0(androidComposeView, tVar);
        return new C0350a(new f0(g0Var), g0Var);
    }
}
