/*
* 文件名：OneAndroidApplication
* 版权：〈版权〉
* 描述：〈描述〉
* 修改人： valiant
* 修改时间：2017-01-11
* 修改单号：〈修改单号〉
* 修改内容：〈修改内容〉
*/
package com.example.demo.oneandroid;

import android.app.Application;
import android.content.Context;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * @see https://github.com/realm/realm-java/blob/feature/example/store_password/examples/StoreEncryptionPassword/src/main/java/realm/io/storeencryptionpassword/Store.java
 */

public class OneAndroidApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        initRealm(this);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    private void initRealm(Context context) {
        Realm.init(context.getApplicationContext());
        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .name("OneAndroid.realm")
                .build();
    }
}
