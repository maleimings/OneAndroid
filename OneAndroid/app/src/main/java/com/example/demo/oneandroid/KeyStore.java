/*
* 文件名：KeyStore
* 版权：〈版权〉
* 描述：〈描述〉
* 修改人： valiant
* 修改时间：2017-01-11
* 修改单号：〈修改单号〉
* 修改内容：〈修改内容〉
*/
package com.example.demo.oneandroid;

import android.app.Activity;
import android.security.keystore.KeyProperties;
import android.util.Log;

import java.nio.ByteOrder;
import java.security.SecureRandom;

public class KeyStore {
    private static final String TAG = "KeyStore";
    private static final String NAME = "AndroidKeyStore";
    private static final String KEY_ALIAS = "one_android_key";
    private static final String ENCODE = KeyProperties.KEY_ALGORITHM_AES;
    private static final ByteOrder ORDER_FOR_ENCRYPTED_DATA = ByteOrder.BIG_ENDIAN;

    private final Activity mActivity;
    private final SecureRandom mSecureRandom = new SecureRandom();
    private final java.security.KeyStore mKeyStore = prepareKeyStore();

    public KeyStore(Activity activity) {
        mActivity = activity;
    }

    private java.security.KeyStore prepareKeyStore() {
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance(NAME);
            keyStore.load(null);
            return keyStore;
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
            return null;
        }
    }
 }
